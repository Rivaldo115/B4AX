package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class editarwyvernpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.editarwyvernpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.editarwyvernpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtelemento = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttipo = null;
public anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper _acttipo = null;
public anywheresoftware.b4a.objects.collections.Map _tiposwyverns = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.editarwyvernpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.editarwyvernpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Root.LoadLayout(\"Editar\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Editar",ba);
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="CargarTiposDeWyvern";
__ref._cargartiposdewyvern /*void*/ (null);
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="End Sub";
return "";
}
public void  _cargartiposdewyvern(b4a.example.editarwyvernpage __ref) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "cargartiposdewyvern", false))
	 {Debug.delegate(ba, "cargartiposdewyvern", null); return;}
ResumableSub_CargarTiposDeWyvern rsub = new ResumableSub_CargarTiposDeWyvern(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CargarTiposDeWyvern extends BA.ResumableSub {
public ResumableSub_CargarTiposDeWyvern(b4a.example.editarwyvernpage parent,b4a.example.editarwyvernpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.editarwyvernpage __ref;
b4a.example.editarwyvernpage parent;
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.List _listatipos = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _tipo = null;
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="peticion.Initialize(\"JobTiposDeWyvern\", Me)";
_peticion._initialize /*String*/ (null,ba,"JobTiposDeWyvern",parent);
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
_peticion._download /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern");
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editarwyvernpage", "cargartiposdewyvern"), (Object)(_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_respuesta = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_respuesta._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="Dim json As String = respuesta.GetString";
_json = _respuesta._getstring /*String*/ (null);
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="jsonParser.Initialize(json)";
_jsonparser.Initialize(_json);
RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="Dim listaTipos As List = jsonParser.NextArray";
_listatipos = new anywheresoftware.b4a.objects.collections.List();
_listatipos = _jsonparser.NextArray();
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="tiposWyverns.Initialize";
__ref._tiposwyverns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="For Each tipo As Map In listaTipos";
if (true) break;

case 4:
//for
this.state = 7;
_tipo = new anywheresoftware.b4a.objects.collections.Map();
group13 = _listatipos;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index13 < groupLen13) {
this.state = 6;
_tipo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group13.Get(index13)));}
if (true) break;

case 13:
//C
this.state = 12;
index13++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=14745617;
 //BA.debugLineNum = 14745617;BA.debugLine="tiposWyverns.Put(tipo.Get(\"id\"), tipo.Get(\"Nomb";
__ref._tiposwyverns /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_tipo.Get((Object)("id")),_tipo.Get((Object)("Nombre")));
RDebugUtils.currentLine=14745618;
 //BA.debugLineNum = 14745618;BA.debugLine="items.Add(tipo.Get(\"Nombre\"))";
_items.Add(_tipo.Get((Object)("Nombre")));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=14745621;
 //BA.debugLineNum = 14745621;BA.debugLine="actTipo.SetItems(items)";
__ref._acttipo /*anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper*/ .SetItems(ba,_items);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=14745623;
 //BA.debugLineNum = 14745623;BA.debugLine="MsgboxAsync(\"No se pudo obtener la lista de tipo";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("No se pudo obtener la lista de tipos de wyvern. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=14745626;
 //BA.debugLineNum = 14745626;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=14745627;
 //BA.debugLineNum = 14745627;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnbuscar_click(b4a.example.editarwyvernpage __ref) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "btnbuscar_click", false))
	 {Debug.delegate(ba, "btnbuscar_click", null); return;}
ResumableSub_btnBuscar_Click rsub = new ResumableSub_btnBuscar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBuscar_Click extends BA.ResumableSub {
public ResumableSub_btnBuscar_Click(b4a.example.editarwyvernpage parent,b4a.example.editarwyvernpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.editarwyvernpage __ref;
b4a.example.editarwyvernpage parent;
int _id = 0;
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _tipowyvernid = "";
String _tipowyvernnombre = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim Id As Int";
_id = 0;
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Try";
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
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Id = txtId.Text";
_id = (int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="MsgboxAsync(\"El Id debe ser numérico.\", \"Error\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("El Id debe ser numérico."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Return";
if (true) return ;
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="peticion.Initialize(\"\", Me)";
_peticion._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
_peticion._download /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"+BA.NumberToString(_id));
RDebugUtils.currentLine=14876684;
 //BA.debugLineNum = 14876684;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editarwyvernpage", "btnbuscar_click"), (Object)(_peticion));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_respuesta = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_respuesta._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=14876687;
 //BA.debugLineNum = 14876687;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14876688;
 //BA.debugLineNum = 14876688;BA.debugLine="json = respuesta.GetString";
_json = _respuesta._getstring /*String*/ (null);
RDebugUtils.currentLine=14876690;
 //BA.debugLineNum = 14876690;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14876691;
 //BA.debugLineNum = 14876691;BA.debugLine="jsonParser.Initialize(json)";
_jsonparser.Initialize(_json);
RDebugUtils.currentLine=14876693;
 //BA.debugLineNum = 14876693;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=14876697;
 //BA.debugLineNum = 14876697;BA.debugLine="txtId.Text = map.Get(\"id\")";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_map.Get((Object)("id"))));
RDebugUtils.currentLine=14876698;
 //BA.debugLineNum = 14876698;BA.debugLine="txtNombre.Text = map.Get(\"Nombre\")";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_map.Get((Object)("Nombre"))));
RDebugUtils.currentLine=14876699;
 //BA.debugLineNum = 14876699;BA.debugLine="txtElemento.Text = map.Get(\"Elemento\")";
__ref._txtelemento /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_map.Get((Object)("Elemento"))));
RDebugUtils.currentLine=14876700;
 //BA.debugLineNum = 14876700;BA.debugLine="txtTipo.Text = map.Get(\"Tipo_WyvernId\")";
__ref._txttipo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_map.Get((Object)("Tipo_WyvernId"))));
RDebugUtils.currentLine=14876702;
 //BA.debugLineNum = 14876702;BA.debugLine="Dim tipoWyvernId As String = map.Get(\"Tipo_Wyver";
_tipowyvernid = BA.ObjectToString(_map.Get((Object)("Tipo_WyvernId")));
RDebugUtils.currentLine=14876703;
 //BA.debugLineNum = 14876703;BA.debugLine="Dim tipoWyvernNombre As String = tiposWyverns.Ge";
_tipowyvernnombre = BA.ObjectToString(__ref._tiposwyverns /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tipowyvernid)));
RDebugUtils.currentLine=14876704;
 //BA.debugLineNum = 14876704;BA.debugLine="actTipo.Text = tipoWyvernNombre";
__ref._acttipo /*anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper*/ .setText(BA.ObjectToCharSequence(_tipowyvernnombre));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=14876707;
 //BA.debugLineNum = 14876707;BA.debugLine="MsgboxAsync(\"No se pudo obtener la información d";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("No se pudo obtener la información del wyvern. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=14876710;
 //BA.debugLineNum = 14876710;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=14876712;
 //BA.debugLineNum = 14876712;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _btneditar_click(b4a.example.editarwyvernpage __ref) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "btneditar_click", false))
	 {Debug.delegate(ba, "btneditar_click", null); return;}
ResumableSub_btnEditar_Click rsub = new ResumableSub_btnEditar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEditar_Click extends BA.ResumableSub {
public ResumableSub_btnEditar_Click(b4a.example.editarwyvernpage parent,b4a.example.editarwyvernpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.editarwyvernpage __ref;
b4a.example.editarwyvernpage parent;
String _tipo = "";
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="MsgboxAsync(\"El ID es necesario para actualizar.";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("El ID es necesario para actualizar."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
_tipo = __ref._getkeyfromvalue /*String*/ (null,__ref._tiposwyverns /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._acttipo /*anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper*/ .getText());
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="If tipo = \"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_tipo).equals("")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Error\"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Tipo de Wyvern no válido."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=14942219;
 //BA.debugLineNum = 14942219;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=14942223;
 //BA.debugLineNum = 14942223;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14942224;
 //BA.debugLineNum = 14942224;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14942225;
 //BA.debugLineNum = 14942225;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=14942226;
 //BA.debugLineNum = 14942226;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=14942227;
 //BA.debugLineNum = 14942227;BA.debugLine="peticion.Initialize(\"jobUpdate\", Me)";
_peticion._initialize /*String*/ (null,ba,"jobUpdate",parent);
RDebugUtils.currentLine=14942229;
 //BA.debugLineNum = 14942229;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=14942230;
 //BA.debugLineNum = 14942230;BA.debugLine="map.Put(\"id\", txtId.Text)";
_map.Put((Object)("id"),(Object)(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=14942231;
 //BA.debugLineNum = 14942231;BA.debugLine="map.Put(\"Nombre\", txtNombre.Text)";
_map.Put((Object)("Nombre"),(Object)(__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=14942232;
 //BA.debugLineNum = 14942232;BA.debugLine="map.Put(\"Elemento\", txtElemento.Text)";
_map.Put((Object)("Elemento"),(Object)(__ref._txtelemento /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=14942233;
 //BA.debugLineNum = 14942233;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
_map.Put((Object)("Tipo_WyvernId"),(Object)(_tipo));
RDebugUtils.currentLine=14942236;
 //BA.debugLineNum = 14942236;BA.debugLine="jsonGenerator.Initialize(map)";
_jsongenerator.Initialize(_map);
RDebugUtils.currentLine=14942237;
 //BA.debugLineNum = 14942237;BA.debugLine="json = jsonGenerator.ToString";
_json = _jsongenerator.ToString();
RDebugUtils.currentLine=14942240;
 //BA.debugLineNum = 14942240;BA.debugLine="peticion.PutString(\"https://6637fe834253a866a24c8";
_peticion._putstring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"+__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_json);
RDebugUtils.currentLine=14942241;
 //BA.debugLineNum = 14942241;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
_peticion._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14942244;
 //BA.debugLineNum = 14942244;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editarwyvernpage", "btneditar_click"), (Object)(_peticion));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_respuesta = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14942245;
 //BA.debugLineNum = 14942245;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_respuesta._success /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=14942246;
 //BA.debugLineNum = 14942246;BA.debugLine="MsgboxAsync(\"Actualizado!\", \"Éxito\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Actualizado!"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=14942248;
 //BA.debugLineNum = 14942248;BA.debugLine="MsgboxAsync(\"No se pudo actualizar. \" & respuest";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("No se pudo actualizar. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=14942250;
 //BA.debugLineNum = 14942250;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=14942251;
 //BA.debugLineNum = 14942251;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _getkeyfromvalue(b4a.example.editarwyvernpage __ref,anywheresoftware.b4a.objects.collections.Map _map,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "getkeyfromvalue", false))
	 {return ((String) Debug.delegate(ba, "getkeyfromvalue", new Object[] {_map,_value}));}
int _i = 0;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub GetKeyFromValue(map As Map, value As S";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="For i = 0 To map.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_map.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="If map.GetValueAt(i) = value Then";
if ((_map.GetValueAt(_i)).equals((Object)(_value))) { 
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Return map.GetKeyAt(i)";
if (true) return BA.ObjectToString(_map.GetKeyAt(_i));
 };
 }
};
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="End Sub";
return "";
}
public void  _btneliminar_click(b4a.example.editarwyvernpage __ref) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "btneliminar_click", false))
	 {Debug.delegate(ba, "btneliminar_click", null); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.editarwyvernpage parent,b4a.example.editarwyvernpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.editarwyvernpage __ref;
b4a.example.editarwyvernpage parent;
int _wyvernid = 0;
int _tipoid = 0;
b4a.example.httpjob _peticion = null;
String _url = "";
b4a.example.httpjob _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="editarwyvernpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del wyvern par";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Debes ingresar el ID del wyvern para eliminarlo."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="If txtTipo.Text.Trim = \"\" Then";

case 4:
//if
this.state = 7;
if ((__ref._txttipo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del tipo de wy";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Debes ingresar el ID del tipo de wyvern para eliminarlo."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="Dim wyvernId As Int";
_wyvernid = 0;
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="Dim tipoId As Int";
_tipoid = 0;
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="Try";
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
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="wyvernId = txtId.Text";
_wyvernid = (int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="tipoId = txtTipo.Text";
_tipoid = (int)(Double.parseDouble(__ref._txttipo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
 if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
RDebugUtils.currentLine=14811154;
 //BA.debugLineNum = 14811154;BA.debugLine="MsgboxAsync(\"Los IDs deben ser numéricos.\", \"Err";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Los IDs deben ser numéricos."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=14811155;
 //BA.debugLineNum = 14811155;BA.debugLine="Return";
if (true) return ;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
;
RDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=14811159;
 //BA.debugLineNum = 14811159;BA.debugLine="peticion.Initialize(\"jobDelete\", Me)";
_peticion._initialize /*String*/ (null,ba,"jobDelete",parent);
RDebugUtils.currentLine=14811162;
 //BA.debugLineNum = 14811162;BA.debugLine="Dim url As String = \"https://6637fe834253a866a24c";
_url = "https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"+BA.NumberToString(_tipoid)+"/Wyverns/"+BA.NumberToString(_wyvernid);
RDebugUtils.currentLine=14811163;
 //BA.debugLineNum = 14811163;BA.debugLine="Log(\"URL de la solicitud DELETE: \" & url)";
parent.__c.LogImpl("114811163","URL de la solicitud DELETE: "+_url,0);
RDebugUtils.currentLine=14811166;
 //BA.debugLineNum = 14811166;BA.debugLine="peticion.Delete(url)";
_peticion._delete /*String*/ (null,_url);
RDebugUtils.currentLine=14811169;
 //BA.debugLineNum = 14811169;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "editarwyvernpage", "btneliminar_click"), (Object)(_peticion));
this.state = 20;
return;
case 20:
//C
this.state = 14;
_respuesta = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14811170;
 //BA.debugLineNum = 14811170;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_respuesta._success /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=14811171;
 //BA.debugLineNum = 14811171;BA.debugLine="MsgboxAsync(\"Wyvern eliminado!\", \"Éxito\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Wyvern eliminado!"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=14811173;
 //BA.debugLineNum = 14811173;BA.debugLine="Log(\"Error: \" & respuesta.ErrorMessage)";
parent.__c.LogImpl("114811173","Error: "+_respuesta._errormessage /*String*/ ,0);
RDebugUtils.currentLine=14811174;
 //BA.debugLineNum = 14811174;BA.debugLine="Log(\"Respuesta: \" & respuesta.GetString)";
parent.__c.LogImpl("114811174","Respuesta: "+_respuesta._getstring /*String*/ (null),0);
RDebugUtils.currentLine=14811175;
 //BA.debugLineNum = 14811175;BA.debugLine="MsgboxAsync(\"No se pudo eliminar. \" & respuesta.";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("No se pudo eliminar. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=14811178;
 //BA.debugLineNum = 14811178;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=14811179;
 //BA.debugLineNum = 14811179;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _btnregresar_click(b4a.example.editarwyvernpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editarwyvernpage";
if (Debug.shouldDelegate(ba, "btnregresar_click", false))
	 {return ((String) Debug.delegate(ba, "btnregresar_click", null));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub btnRegresar_Click";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.editarwyvernpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="editarwyvernpage";
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="Private txtElemento As EditText";
_txtelemento = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="Private txtTipo As EditText";
_txttipo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="Private actTipo As AutoCompleteEditText";
_acttipo = new anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper();
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="Private tiposWyverns As Map";
_tiposwyverns = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="End Sub";
return "";
}
}