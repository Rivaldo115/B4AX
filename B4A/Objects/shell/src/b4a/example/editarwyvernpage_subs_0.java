package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class editarwyvernpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "editarwyvernpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"Editar\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Editar")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="CargarTiposDeWyvern";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.editarwyvernpage.class, "_cargartiposdewyvern" /*void*/ );
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnbuscar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBuscar_Click (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("btnbuscar_click")) { __ref.runUserSub(false, "editarwyvernpage","btnbuscar_click", __ref); return;}
ResumableSub_btnBuscar_Click rsub = new ResumableSub_btnBuscar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBuscar_Click extends BA.ResumableSub {
public ResumableSub_btnBuscar_Click(b4a.example.editarwyvernpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.editarwyvernpage parent;
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipowyvernid = RemoteObject.createImmutable("");
RemoteObject _tipowyvernnombre = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBuscar_Click (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,109);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 110;BA.debugLine="Dim Id As Int";
Debug.ShouldStop(8192);
_id = RemoteObject.createImmutable(0);Debug.locals.put("Id", _id);
 BA.debugLineNum = 111;BA.debugLine="Try";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 112;BA.debugLine="Id = txtId.Text";
Debug.ShouldStop(32768);
_id = BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("Id", _id);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 114;BA.debugLine="MsgboxAsync(\"El Id debe ser numérico.\", \"Error\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("El Id debe ser numérico.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 115;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
 BA.debugLineNum = 118;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(2097152);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 119;BA.debugLine="peticion.Initialize(\"\", Me)";
Debug.ShouldStop(4194304);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 120;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
Debug.ShouldStop(8388608);
_peticion.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"),_id)));
 BA.debugLineNum = 121;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editarwyvernpage", "btnbuscar_click"), (_peticion));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 123;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 12;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 124;BA.debugLine="Dim json As String";
Debug.ShouldStop(134217728);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 125;BA.debugLine="json = respuesta.GetString";
Debug.ShouldStop(268435456);
_json = _respuesta.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 127;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(1073741824);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 128;BA.debugLine="jsonParser.Initialize(json)";
Debug.ShouldStop(-2147483648);
_jsonparser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 130;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(2);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 134;BA.debugLine="txtId.Text = map.Get(\"id\")";
Debug.ShouldStop(32);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 135;BA.debugLine="txtNombre.Text = map.Get(\"Nombre\")";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 136;BA.debugLine="txtElemento.Text = map.Get(\"Elemento\")";
Debug.ShouldStop(128);
__ref.getField(false,"_txtelemento" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Elemento"))))));
 BA.debugLineNum = 137;BA.debugLine="txtTipo.Text = map.Get(\"Tipo_WyvernId\")";
Debug.ShouldStop(256);
__ref.getField(false,"_txttipo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tipo_WyvernId"))))));
 BA.debugLineNum = 139;BA.debugLine="Dim tipoWyvernId As String = map.Get(\"Tipo_Wyver";
Debug.ShouldStop(1024);
_tipowyvernid = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tipo_WyvernId")))));Debug.locals.put("tipoWyvernId", _tipowyvernid);Debug.locals.put("tipoWyvernId", _tipowyvernid);
 BA.debugLineNum = 140;BA.debugLine="Dim tipoWyvernNombre As String = tiposWyverns.Ge";
Debug.ShouldStop(2048);
_tipowyvernnombre = BA.ObjectToString(__ref.getField(false,"_tiposwyverns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_tipowyvernid))));Debug.locals.put("tipoWyvernNombre", _tipowyvernnombre);Debug.locals.put("tipoWyvernNombre", _tipowyvernnombre);
 BA.debugLineNum = 141;BA.debugLine="actTipo.Text = tipoWyvernNombre";
Debug.ShouldStop(4096);
__ref.getField(false,"_acttipo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_tipowyvernnombre));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 144;BA.debugLine="MsgboxAsync(\"No se pudo obtener la información d";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo obtener la información del wyvern. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 147;BA.debugLine="peticion.Release";
Debug.ShouldStop(262144);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _respuesta) throws Exception{
}
public static void  _btneditar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEditar_Click (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("btneditar_click")) { __ref.runUserSub(false, "editarwyvernpage","btneditar_click", __ref); return;}
ResumableSub_btnEditar_Click rsub = new ResumableSub_btnEditar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEditar_Click extends BA.ResumableSub {
public ResumableSub_btnEditar_Click(b4a.example.editarwyvernpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.editarwyvernpage parent;
RemoteObject _tipo = RemoteObject.createImmutable("");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEditar_Click (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,151);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 153;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 154;BA.debugLine="MsgboxAsync(\"El ID es necesario para actualizar.";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("El ID es necesario para actualizar.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 155;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 159;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
Debug.ShouldStop(1073741824);
_tipo = __ref.runClassMethod (b4a.example.editarwyvernpage.class, "_getkeyfromvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tiposwyverns" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_acttipo" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("tipo", _tipo);Debug.locals.put("tipo", _tipo);
 BA.debugLineNum = 160;BA.debugLine="If tipo = \"\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString(""))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 161;BA.debugLine="MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Error\"";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Tipo de Wyvern no válido.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 162;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 166;BA.debugLine="Dim map As Map";
Debug.ShouldStop(32);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 167;BA.debugLine="Dim json As String";
Debug.ShouldStop(64);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 168;BA.debugLine="Dim jsonGenerator As JSONGenerator";
Debug.ShouldStop(128);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGenerator", _jsongenerator);
 BA.debugLineNum = 169;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(256);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 170;BA.debugLine="peticion.Initialize(\"jobUpdate\", Me)";
Debug.ShouldStop(512);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("jobUpdate")),(Object)(__ref));
 BA.debugLineNum = 172;BA.debugLine="map.Initialize";
Debug.ShouldStop(2048);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 173;BA.debugLine="map.Put(\"id\", txtId.Text)";
Debug.ShouldStop(4096);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 174;BA.debugLine="map.Put(\"Nombre\", txtNombre.Text)";
Debug.ShouldStop(8192);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 175;BA.debugLine="map.Put(\"Elemento\", txtElemento.Text)";
Debug.ShouldStop(16384);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Elemento"))),(Object)((__ref.getField(false,"_txtelemento" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 176;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
Debug.ShouldStop(32768);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_WyvernId"))),(Object)((_tipo)));
 BA.debugLineNum = 179;BA.debugLine="jsonGenerator.Initialize(map)";
Debug.ShouldStop(262144);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_map));
 BA.debugLineNum = 180;BA.debugLine="json = jsonGenerator.ToString";
Debug.ShouldStop(524288);
_json = _jsongenerator.runMethod(true,"ToString");Debug.locals.put("json", _json);
 BA.debugLineNum = 183;BA.debugLine="peticion.PutString(\"https://6637fe834253a866a24c8";
Debug.ShouldStop(4194304);
_peticion.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"),__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_json));
 BA.debugLineNum = 184;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
Debug.ShouldStop(8388608);
_peticion.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 187;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editarwyvernpage", "btneditar_click"), (_peticion));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 188;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 9:
//if
this.state = 14;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 189;BA.debugLine="MsgboxAsync(\"Actualizado!\", \"Éxito\")";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Actualizado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 191;BA.debugLine="MsgboxAsync(\"No se pudo actualizar. \" & respuest";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo actualizar. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 193;BA.debugLine="peticion.Release";
Debug.ShouldStop(1);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btneliminar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("btneliminar_click")) { __ref.runUserSub(false, "editarwyvernpage","btneliminar_click", __ref); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.editarwyvernpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.editarwyvernpage parent;
RemoteObject _wyvernid = RemoteObject.createImmutable(0);
RemoteObject _tipoid = RemoteObject.createImmutable(0);
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 66;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 67;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del wyvern par";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Debes ingresar el ID del wyvern para eliminarlo.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 68;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 71;BA.debugLine="If txtTipo.Text.Trim = \"\" Then";
Debug.ShouldStop(64);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txttipo" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 72;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del tipo de wy";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Debes ingresar el ID del tipo de wyvern para eliminarlo.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 73;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 76;BA.debugLine="Dim wyvernId As Int";
Debug.ShouldStop(2048);
_wyvernid = RemoteObject.createImmutable(0);Debug.locals.put("wyvernId", _wyvernid);
 BA.debugLineNum = 77;BA.debugLine="Dim tipoId As Int";
Debug.ShouldStop(4096);
_tipoid = RemoteObject.createImmutable(0);Debug.locals.put("tipoId", _tipoid);
 BA.debugLineNum = 78;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 8:
//try
this.state = 13;
this.catchState = 12;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 13;
this.catchState = 12;
 BA.debugLineNum = 79;BA.debugLine="wyvernId = txtId.Text";
Debug.ShouldStop(16384);
_wyvernid = BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("wyvernId", _wyvernid);
 BA.debugLineNum = 80;BA.debugLine="tipoId = txtTipo.Text";
Debug.ShouldStop(32768);
_tipoid = BA.numberCast(int.class, __ref.getField(false,"_txttipo" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("tipoId", _tipoid);
 Debug.CheckDeviceExceptions();
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
 BA.debugLineNum = 82;BA.debugLine="MsgboxAsync(\"Los IDs deben ser numéricos.\", \"Err";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Los IDs deben ser numéricos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
;
 BA.debugLineNum = 86;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(2097152);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 87;BA.debugLine="peticion.Initialize(\"jobDelete\", Me)";
Debug.ShouldStop(4194304);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("jobDelete")),(Object)(__ref));
 BA.debugLineNum = 90;BA.debugLine="Dim url As String = \"https://6637fe834253a866a24c";
Debug.ShouldStop(33554432);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"),_tipoid,RemoteObject.createImmutable("/Wyverns/"),_wyvernid);Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 91;BA.debugLine="Log(\"URL de la solicitud DELETE: \" & url)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","114811163",RemoteObject.concat(RemoteObject.createImmutable("URL de la solicitud DELETE: "),_url),0);
 BA.debugLineNum = 94;BA.debugLine="peticion.Delete(url)";
Debug.ShouldStop(536870912);
_peticion.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 97;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editarwyvernpage", "btneliminar_click"), (_peticion));
this.state = 20;
return;
case 20:
//C
this.state = 14;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 98;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(2);
if (true) break;

case 14:
//if
this.state = 19;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 99;BA.debugLine="MsgboxAsync(\"Wyvern eliminado!\", \"Éxito\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Wyvern eliminado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 101;BA.debugLine="Log(\"Error: \" & respuesta.ErrorMessage)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","114811173",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 102;BA.debugLine="Log(\"Respuesta: \" & respuesta.GetString)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","114811174",RemoteObject.concat(RemoteObject.createImmutable("Respuesta: "),_respuesta.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 103;BA.debugLine="MsgboxAsync(\"No se pudo eliminar. \" & respuesta.";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo eliminar. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 106;BA.debugLine="peticion.Release";
Debug.ShouldStop(512);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnregresar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRegresar_Click (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("btnregresar_click")) { return __ref.runUserSub(false, "editarwyvernpage","btnregresar_click", __ref);}
 BA.debugLineNum = 196;BA.debugLine="Private Sub btnRegresar_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16);
editarwyvernpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargartiposdewyvern(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargarTiposDeWyvern (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("cargartiposdewyvern")) { __ref.runUserSub(false, "editarwyvernpage","cargartiposdewyvern", __ref); return;}
ResumableSub_CargarTiposDeWyvern rsub = new ResumableSub_CargarTiposDeWyvern(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargarTiposDeWyvern extends BA.ResumableSub {
public ResumableSub_CargarTiposDeWyvern(b4a.example.editarwyvernpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.editarwyvernpage parent;
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _listatipos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tipo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarTiposDeWyvern (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 36;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(8);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 37;BA.debugLine="peticion.Initialize(\"JobTiposDeWyvern\", Me)";
Debug.ShouldStop(16);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("JobTiposDeWyvern")),(Object)(__ref));
 BA.debugLineNum = 38;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
Debug.ShouldStop(32);
_peticion.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern")));
 BA.debugLineNum = 39;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editarwyvernpage", "cargartiposdewyvern"), (_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 41;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 10;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 42;BA.debugLine="Dim json As String = respuesta.GetString";
Debug.ShouldStop(512);
_json = _respuesta.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 43;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(1024);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 44;BA.debugLine="jsonParser.Initialize(json)";
Debug.ShouldStop(2048);
_jsonparser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 46;BA.debugLine="Dim listaTipos As List = jsonParser.NextArray";
Debug.ShouldStop(8192);
_listatipos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listatipos = _jsonparser.runMethod(false,"NextArray");Debug.locals.put("listaTipos", _listatipos);Debug.locals.put("listaTipos", _listatipos);
 BA.debugLineNum = 47;BA.debugLine="tiposWyverns.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_tiposwyverns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="Dim items As List";
Debug.ShouldStop(32768);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 49;BA.debugLine="items.Initialize";
Debug.ShouldStop(65536);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="For Each tipo As Map In listaTipos";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 7;
_tipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group13 = _listatipos;
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("tipo", _tipo);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index13 < groupLen13) {
this.state = 6;
_tipo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group13.runMethod(false,"Get",index13));Debug.locals.put("tipo", _tipo);}
if (true) break;

case 13:
//C
this.state = 12;
index13++;
Debug.locals.put("tipo", _tipo);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 52;BA.debugLine="tiposWyverns.Put(tipo.Get(\"id\"), tipo.Get(\"Nomb";
Debug.ShouldStop(524288);
__ref.getField(false,"_tiposwyverns" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 53;BA.debugLine="items.Add(tipo.Get(\"Nombre\"))";
Debug.ShouldStop(1048576);
_items.runVoidMethod ("Add",(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("tipo", _tipo);
;
 BA.debugLineNum = 56;BA.debugLine="actTipo.SetItems(items)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_acttipo" /*RemoteObject*/ ).runVoidMethod ("SetItems",__ref.getField(false, "ba"),(Object)(_items));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 58;BA.debugLine="MsgboxAsync(\"No se pudo obtener la lista de tipo";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo obtener la lista de tipos de wyvern. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 61;BA.debugLine="peticion.Release";
Debug.ShouldStop(268435456);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
editarwyvernpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",editarwyvernpage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
editarwyvernpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",editarwyvernpage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
editarwyvernpage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",editarwyvernpage._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
editarwyvernpage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",editarwyvernpage._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtElemento As EditText";
editarwyvernpage._txtelemento = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtelemento",editarwyvernpage._txtelemento);
 //BA.debugLineNum = 7;BA.debugLine="Private txtTipo As EditText";
editarwyvernpage._txttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttipo",editarwyvernpage._txttipo);
 //BA.debugLineNum = 8;BA.debugLine="Private actTipo As AutoCompleteEditText";
editarwyvernpage._acttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");__ref.setField("_acttipo",editarwyvernpage._acttipo);
 //BA.debugLineNum = 9;BA.debugLine="Private tiposWyverns As Map";
editarwyvernpage._tiposwyverns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_tiposwyverns",editarwyvernpage._tiposwyverns);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getkeyfromvalue(RemoteObject __ref,RemoteObject _map,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetKeyFromValue (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("getkeyfromvalue")) { return __ref.runUserSub(false, "editarwyvernpage","getkeyfromvalue", __ref, _map, _value);}
int _i = 0;
Debug.locals.put("map", _map);
Debug.locals.put("value", _value);
 BA.debugLineNum = 26;BA.debugLine="Private Sub GetKeyFromValue(map As Map, value As S";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="For i = 0 To map.Size - 1";
Debug.ShouldStop(67108864);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_map.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 28;BA.debugLine="If map.GetValueAt(i) = value Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))),(_value))) { 
 BA.debugLineNum = 29;BA.debugLine="Return map.GetKeyAt(i)";
Debug.ShouldStop(268435456);
if (true) return BA.ObjectToString(_map.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 32;BA.debugLine="Return \"\"";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (editarwyvernpage) ","editarwyvernpage",4,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "editarwyvernpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Return Me";
Debug.ShouldStop(8192);
if (true) return __ref;
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}