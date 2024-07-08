B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtElemento As EditText
	Private txtTipo As EditText
	Private actTipo As AutoCompleteEditText
	Private tiposWyverns As Map
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Crear")
	CargarTiposDeWyvern
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

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
		MsgboxAsync("No se pudo obtener la lista de tipos de wyvern. " & respuesta.ErrorMessage, "Error")
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

	' Asegúrate de tener EditText para cada campo relevante en tu layout
	Dim nombre As String = txtNombre.Text
	Dim elemento As String = txtElemento.Text
	Dim tipo As String = GetKeyFromValue(tiposWyverns, actTipo.Text)
	If tipo = "" Then
		MsgboxAsync("Tipo de Wyvern no válido.", "Error")
		Return
	End If
    
	' Inicializa el mapa con los datos de la nueva computadora
	map.Initialize
	map.Put("Nombre", nombre)
	map.Put("Elemento", elemento)
	map.Put("Tipo_WyvernId", tipo)
    
	' Inicializa el JSONGenerator con el mapa y convierte a una cadena JSON
	jsonGenerator.Initialize(map)
	json = jsonGenerator.ToPrettyString(2)

	' Inicializa y configura la solicitud HTTP POST
	Dim peticion As HttpJob
	peticion.Initialize("jobInsertar", Me)
	peticion.PostString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/", json)
	peticion.GetRequest.SetContentType("application/json")
    
	' Espera la respuesta de la solicitud
	Wait For (peticion) JobDone(respuesta As HttpJob)
	If respuesta.Success Then
		MsgboxAsync("Wyvern creado.", "Éxito")
	Else
		MsgboxAsync("No se pudo crear wyvern. " & respuesta.ErrorMessage, "Error")
	End If

	' Libera los recursos del objeto HttpJob
	peticion.Release
End Sub

Private Sub btnRegresar_Click
	Activity.Finish
End Sub