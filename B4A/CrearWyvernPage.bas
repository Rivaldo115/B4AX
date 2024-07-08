B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' CrearWyvernPage.bas
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtElemento As EditText
	Private txtTipo As EditText
	Private actTipo As AutoCompleteEditText
	Private tiposWyverns As Map
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Crear")
	CargarTiposDeWyvern
End Sub

Private Sub CargarTiposDeWyvern
	Dim peticion As HttpJob
	peticion.Initialize("JobTiposDeWyvern", Me)
	peticion.Download("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern")
	Wait For (peticion) JobDone(respuesta As HttpJob)
    
	If respuesta.Success Then
		Dim json As String = respuesta.GetString
		Dim jsonParser As JSONParser
		jsonParser.Initialize(json)
        
		Dim listaTipos As List = jsonParser.NextArray
		tiposWyverns.Initialize
		Dim items As List
		items.Initialize
        
		For Each tipo As Map In listaTipos
			tiposWyverns.Put(tipo.Get("id"), tipo.Get("Nombre"))
			items.Add(tipo.Get("Nombre"))
		Next
        
		actTipo.SetItems(items)
	Else
		xui.MsgboxAsync("No se pudo obtener la lista de tipos de wyvern. " & respuesta.ErrorMessage, "Error")
	End If

	peticion.Release
End Sub

Private Sub GetKeyFromValue(map As Map, value As String) As String
	For i = 0 To map.Size - 1
		If map.GetValueAt(i) = value Then
			Return map.GetKeyAt(i)
		End If
	Next
	Return ""
End Sub

Private Sub btnInsertar_Click
	Dim map As Map
	Dim json As String
	Dim jsonGenerator As JSONGenerator

	Dim nombre As String = txtNombre.Text
	Dim elemento As String = txtElemento.Text
	Dim tipo As String = GetKeyFromValue(tiposWyverns, actTipo.Text)
	If tipo = "" Then
		xui.MsgboxAsync("Tipo de Wyvern no válido.", "Error")
		Return
	End If
    
	map.Initialize
	map.Put("Nombre", nombre)
	map.Put("Elemento", elemento)
	map.Put("Tipo_WyvernId", tipo)
    
	jsonGenerator.Initialize(map)
	json = jsonGenerator.ToPrettyString(2)

	Dim peticion As HttpJob
	peticion.Initialize("jobInsertar", Me)
	peticion.PostString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/", json)
	peticion.GetRequest.SetContentType("application/json")
    
	Wait For (peticion) JobDone(respuesta As HttpJob)
	If respuesta.Success Then
		xui.MsgboxAsync("Wyvern creado.", "Éxito")
	Else
		xui.MsgboxAsync("No se pudo crear wyvern. " & respuesta.ErrorMessage, "Error")
	End If

	peticion.Release
End Sub



Private Sub btnRegresar_Click
	B4XPages.ClosePage(Me)
End Sub
