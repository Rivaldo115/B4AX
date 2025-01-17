﻿B4A=true
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
	Activity.LoadLayout("Editar")
	CargarTiposDeWyvern

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub GetKeyFromValue(map As Map, value As String) As String
	For i = 0 To map.Size - 1
		If map.GetValueAt(i) = value Then
			Return map.GetKeyAt(i)
		End If
	Next
	Return ""
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

Private Sub btnEliminar_Click
	' Validar que los campos de texto del ID y del tipo de wyvern no estén vacíos
	If txtId.Text.Trim = "" Then
		MsgboxAsync("Debes ingresar el ID del wyvern para eliminarlo.", "Error")
		Return
	End If
    
	If txtTipo.Text.Trim = "" Then
		MsgboxAsync("Debes ingresar el ID del tipo de wyvern para eliminarlo.", "Error")
		Return
	End If

	Dim wyvernId As Int
	Dim tipoId As Int
	Try
		wyvernId = txtId.Text
		tipoId = txtTipo.Text
	Catch
		MsgboxAsync("Los IDs deben ser numéricos.", "Error")
		Return
	End Try
    
	Dim peticion As HttpJob
	peticion.Initialize("jobDelete", Me)
    
	' Construir la URL con el ID del tipo de wyvern y el ID del wyvern
	Dim url As String = "https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/" & tipoId & "/Wyverns/" & wyvernId
	Log("URL de la solicitud DELETE: " & url)
    
	' Configurar y enviar la solicitud DELETE a la API
	peticion.Delete(url)
    
	' Esperar la respuesta de la solicitud
	Wait For (peticion) JobDone(respuesta As HttpJob)
	If respuesta.Success Then
		MsgboxAsync("Wyvern eliminado!", "Éxito")
	Else
		Log("Error: " & respuesta.ErrorMessage)
		Log("Respuesta: " & respuesta.GetString)
		MsgboxAsync("No se pudo eliminar. " & respuesta.ErrorMessage, "Error")
	End If
    
	peticion.Release
End Sub

Private Sub btnBuscar_Click
	Dim Id As Int
	Try
		Id = txtId.Text
	Catch
		MsgboxAsync("El Id debe ser numérico.", "Error")
		Return
	End Try
	
	Dim peticion As HttpJob
	peticion.Initialize("", Me)
	peticion.Download("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/" & Id)
	Wait For (peticion) JobDone(respuesta As HttpJob)
	
	If respuesta.Success Then
		Dim json As String
		json = respuesta.GetString

		Dim jsonParser As JSONParser
		jsonParser.Initialize(json)
		
		Dim map As Map = jsonParser.NextObject



		txtId.Text = map.Get("id")
		txtNombre.Text = map.Get("Nombre")
		txtElemento.Text = map.Get("Elemento")
		txtTipo.Text = map.Get("Tipo_WyvernId")
		
		Dim tipoWyvernId As String = map.Get("Tipo_WyvernId")
		Dim tipoWyvernNombre As String = tiposWyverns.Get(tipoWyvernId)
		actTipo.Text = tipoWyvernNombre

	Else
		MsgboxAsync("No se pudo obtener la información del wyvern. " & respuesta.ErrorMessage, "Error")
	End If

	peticion.Release
	
End Sub

Private Sub btnEditar_Click
	' Validar que se haya ingresado un ID
	If txtId.Text.Trim = "" Then
		MsgboxAsync("El ID es necesario para actualizar.", "Error")
		Return
	End If
	
	' Obtener el ID del tipo de wyvern desde el AutoCompleteEditText
	Dim tipo As String = GetKeyFromValue(tiposWyverns, actTipo.Text)
	If tipo = "" Then
		MsgboxAsync("Tipo de Wyvern no válido.", "Error")
		Return
	End If
	
	' Crear un mapa con todos los campos que se van a actualizar
	Dim map As Map
	Dim json As String
	Dim jsonGenerator As JSONGenerator
	Dim peticion As HttpJob
	peticion.Initialize("jobUpdate", Me)
    
	map.Initialize
	map.Put("id", txtId.Text)
	map.Put("Nombre", txtNombre.Text)
	map.Put("Elemento", txtElemento.Text)
	map.Put("Tipo_WyvernId", tipo)
    
	' Convertir el mapa a JSON
	jsonGenerator.Initialize(map)
	json = jsonGenerator.ToString
    
	' Enviar la solicitud PUT a la API
	peticion.PutString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/" & txtId.Text, json)
	peticion.GetRequest.SetContentType("application/json")
    
	' Esperar por la respuesta de la solicitud
	Wait For (peticion) JobDone(respuesta As HttpJob)
	If respuesta.Success Then
		MsgboxAsync("Actualizado!", "Éxito")
	Else
		MsgboxAsync("No se pudo actualizar. " & respuesta.ErrorMessage, "Error")
	End If
	peticion.Release
End Sub

Private Sub btnRegresar_Click
	Activity.Finish
End Sub