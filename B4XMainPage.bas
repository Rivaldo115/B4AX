B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private pagCrear As CrearWyvernPage
	Private pagEditar As EditarWyvernPage
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub

Private Sub btn_Crear_Click
	If pagCrear.IsInitialized = False Then
		pagCrear.Initialize
		B4XPages.AddPageAndCreate("Pagina_Crear", pagCrear) 
	End If
	B4XPages.ShowPage("Pagina_Crear")
End Sub

Private Sub btnE_Click
	If pagEditar.IsInitialized = False Then
		pagEditar.Initialize
		B4XPages.AddPageAndCreate("Pagina_Editar", pagEditar)
	End If
	B4XPages.ShowPage("Pagina_Editar")
End Sub