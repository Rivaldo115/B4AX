package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class crearwyvernpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "crearwyvernpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 16;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Root = Root1";
Debug.ShouldStop(65536);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"Crear\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Crear")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="CargarTiposDeWyvern";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.crearwyvernpage.class, "_cargartiposdewyvern" /*void*/ );
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btninsertar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("btninsertar_click")) { __ref.runUserSub(false, "crearwyvernpage","btninsertar_click", __ref); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4a.example.crearwyvernpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.crearwyvernpage parent;
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _nombre = RemoteObject.createImmutable("");
RemoteObject _elemento = RemoteObject.createImmutable("");
RemoteObject _tipo = RemoteObject.createImmutable("");
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,60);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 61;BA.debugLine="Dim map As Map";
Debug.ShouldStop(268435456);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 62;BA.debugLine="Dim json As String";
Debug.ShouldStop(536870912);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 63;BA.debugLine="Dim jsonGenerator As JSONGenerator";
Debug.ShouldStop(1073741824);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGenerator", _jsongenerator);
 BA.debugLineNum = 65;BA.debugLine="Dim nombre As String = txtNombre.Text";
Debug.ShouldStop(1);
_nombre = __ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("nombre", _nombre);Debug.locals.put("nombre", _nombre);
 BA.debugLineNum = 66;BA.debugLine="Dim elemento As String = txtElemento.Text";
Debug.ShouldStop(2);
_elemento = __ref.getField(false,"_txtelemento" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("elemento", _elemento);Debug.locals.put("elemento", _elemento);
 BA.debugLineNum = 67;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
Debug.ShouldStop(4);
_tipo = __ref.runClassMethod (b4a.example.crearwyvernpage.class, "_getkeyfromvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tiposwyverns" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_acttipo" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("tipo", _tipo);Debug.locals.put("tipo", _tipo);
 BA.debugLineNum = 68;BA.debugLine="If tipo = \"\" Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 69;BA.debugLine="xui.MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Er";
Debug.ShouldStop(16);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Tipo de Wyvern no válido.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))));
 BA.debugLineNum = 70;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 73;BA.debugLine="map.Initialize";
Debug.ShouldStop(256);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="map.Put(\"Nombre\", nombre)";
Debug.ShouldStop(512);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 75;BA.debugLine="map.Put(\"Elemento\", elemento)";
Debug.ShouldStop(1024);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Elemento"))),(Object)((_elemento)));
 BA.debugLineNum = 76;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
Debug.ShouldStop(2048);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_WyvernId"))),(Object)((_tipo)));
 BA.debugLineNum = 78;BA.debugLine="jsonGenerator.Initialize(map)";
Debug.ShouldStop(8192);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_map));
 BA.debugLineNum = 79;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
Debug.ShouldStop(16384);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("json", _json);
 BA.debugLineNum = 81;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(65536);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 82;BA.debugLine="peticion.Initialize(\"jobInsertar\", Me)";
Debug.ShouldStop(131072);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("jobInsertar")),(Object)(__ref));
 BA.debugLineNum = 83;BA.debugLine="peticion.PostString(\"https://6637fe834253a866a24c";
Debug.ShouldStop(262144);
_peticion.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/")),(Object)(_json));
 BA.debugLineNum = 84;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
Debug.ShouldStop(524288);
_peticion.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 86;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crearwyvernpage", "btninsertar_click"), (_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 87;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//if
this.state = 10;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 88;BA.debugLine="xui.MsgboxAsync(\"Wyvern creado.\", \"Éxito\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Wyvern creado.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 90;BA.debugLine="xui.MsgboxAsync(\"No se pudo crear wyvern. \" & re";
Debug.ShouldStop(33554432);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo crear wyvern. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 93;BA.debugLine="peticion.Release";
Debug.ShouldStop(268435456);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _respuesta) throws Exception{
}
public static RemoteObject  _btnregresar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRegresar_Click (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("btnregresar_click")) { return __ref.runUserSub(false, "crearwyvernpage","btnregresar_click", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Private Sub btnRegresar_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(4);
crearwyvernpage._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("CargarTiposDeWyvern (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("cargartiposdewyvern")) { __ref.runUserSub(false, "crearwyvernpage","cargartiposdewyvern", __ref); return;}
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
public ResumableSub_CargarTiposDeWyvern(b4a.example.crearwyvernpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.crearwyvernpage parent;
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
		Debug.PushSubsStack("CargarTiposDeWyvern (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,22);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 23;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(4194304);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 24;BA.debugLine="peticion.Initialize(\"JobTiposDeWyvern\", Me)";
Debug.ShouldStop(8388608);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("JobTiposDeWyvern")),(Object)(__ref));
 BA.debugLineNum = 25;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
Debug.ShouldStop(16777216);
_peticion.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern")));
 BA.debugLineNum = 26;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crearwyvernpage", "cargartiposdewyvern"), (_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 28;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 29;BA.debugLine="Dim json As String = respuesta.GetString";
Debug.ShouldStop(268435456);
_json = _respuesta.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 30;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(536870912);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 31;BA.debugLine="jsonParser.Initialize(json)";
Debug.ShouldStop(1073741824);
_jsonparser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 33;BA.debugLine="Dim listaTipos As List = jsonParser.NextArray";
Debug.ShouldStop(1);
_listatipos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listatipos = _jsonparser.runMethod(false,"NextArray");Debug.locals.put("listaTipos", _listatipos);Debug.locals.put("listaTipos", _listatipos);
 BA.debugLineNum = 34;BA.debugLine="tiposWyverns.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_tiposwyverns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="Dim items As List";
Debug.ShouldStop(4);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 36;BA.debugLine="items.Initialize";
Debug.ShouldStop(8);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="For Each tipo As Map In listaTipos";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 39;BA.debugLine="tiposWyverns.Put(tipo.Get(\"id\"), tipo.Get(\"Nomb";
Debug.ShouldStop(64);
__ref.getField(false,"_tiposwyverns" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 40;BA.debugLine="items.Add(tipo.Get(\"Nombre\"))";
Debug.ShouldStop(128);
_items.runVoidMethod ("Add",(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("tipo", _tipo);
;
 BA.debugLineNum = 43;BA.debugLine="actTipo.SetItems(items)";
Debug.ShouldStop(1024);
__ref.getField(false,"_acttipo" /*RemoteObject*/ ).runVoidMethod ("SetItems",__ref.getField(false, "ba"),(Object)(_items));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 45;BA.debugLine="xui.MsgboxAsync(\"No se pudo obtener la lista de";
Debug.ShouldStop(4096);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo obtener la lista de tipos de wyvern. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 48;BA.debugLine="peticion.Release";
Debug.ShouldStop(32768);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
crearwyvernpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",crearwyvernpage._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
crearwyvernpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",crearwyvernpage._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private txtId As EditText";
crearwyvernpage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",crearwyvernpage._txtid);
 //BA.debugLineNum = 6;BA.debugLine="Private txtNombre As EditText";
crearwyvernpage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",crearwyvernpage._txtnombre);
 //BA.debugLineNum = 7;BA.debugLine="Private txtElemento As EditText";
crearwyvernpage._txtelemento = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtelemento",crearwyvernpage._txtelemento);
 //BA.debugLineNum = 8;BA.debugLine="Private txtTipo As EditText";
crearwyvernpage._txttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttipo",crearwyvernpage._txttipo);
 //BA.debugLineNum = 9;BA.debugLine="Private actTipo As AutoCompleteEditText";
crearwyvernpage._acttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");__ref.setField("_acttipo",crearwyvernpage._acttipo);
 //BA.debugLineNum = 10;BA.debugLine="Private tiposWyverns As Map";
crearwyvernpage._tiposwyverns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_tiposwyverns",crearwyvernpage._tiposwyverns);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getkeyfromvalue(RemoteObject __ref,RemoteObject _map,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetKeyFromValue (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getkeyfromvalue")) { return __ref.runUserSub(false, "crearwyvernpage","getkeyfromvalue", __ref, _map, _value);}
int _i = 0;
Debug.locals.put("map", _map);
Debug.locals.put("value", _value);
 BA.debugLineNum = 51;BA.debugLine="Private Sub GetKeyFromValue(map As Map, value As S";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="For i = 0 To map.Size - 1";
Debug.ShouldStop(524288);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_map.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 53;BA.debugLine="If map.GetValueAt(i) = value Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))),(_value))) { 
 BA.debugLineNum = 54;BA.debugLine="Return map.GetKeyAt(i)";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString(_map.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 57;BA.debugLine="Return \"\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Initialize (crearwyvernpage) ","crearwyvernpage",3,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "crearwyvernpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}