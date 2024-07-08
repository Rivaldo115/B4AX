package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_crear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_Crear_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("btn_crear_click")) { return __ref.runUserSub(false, "b4xmainpage","btn_crear_click", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Private Sub btn_Crear_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="If pagCrear.IsInitialized = False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pagcrear" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="pagCrear.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_pagcrear" /*RemoteObject*/ ).runClassMethod (b4a.example.crearwyvernpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="B4XPages.AddPageAndCreate(\"Pagina_Crear\", pagCre";
Debug.ShouldStop(2);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Pagina_Crear")),(Object)((__ref.getField(false,"_pagcrear" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 36;BA.debugLine="B4XPages.ShowPage(\"Pagina_Crear\")";
Debug.ShouldStop(8);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Pagina_Crear")));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btne_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnE_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("btne_click")) { return __ref.runUserSub(false, "b4xmainpage","btne_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub btnE_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If pagEditar.IsInitialized = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pageditar" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 41;BA.debugLine="pagEditar.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_pageditar" /*RemoteObject*/ ).runClassMethod (b4a.example.editarwyvernpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 42;BA.debugLine="B4XPages.AddPageAndCreate(\"Pagina_Editar\", pagEd";
Debug.ShouldStop(512);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Pagina_Editar")),(Object)((__ref.getField(false,"_pageditar" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 44;BA.debugLine="B4XPages.ShowPage(\"Pagina_Editar\")";
Debug.ShouldStop(2048);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Pagina_Editar")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private pagCrear As CrearWyvernPage";
b4xmainpage._pagcrear = RemoteObject.createNew ("b4a.example.crearwyvernpage");__ref.setField("_pagcrear",b4xmainpage._pagcrear);
 //BA.debugLineNum = 12;BA.debugLine="Private pagEditar As EditarWyvernPage";
b4xmainpage._pageditar = RemoteObject.createNew ("b4a.example.editarwyvernpage");__ref.setField("_pageditar",b4xmainpage._pageditar);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}