package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class crearwyvernpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.crearwyvernpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.crearwyvernpage.class).invoke(this, new Object[] {null});
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
public String  _initialize(b4a.example.crearwyvernpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="crearwyvernpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.crearwyvernpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="crearwyvernpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Root.LoadLayout(\"Crear\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Crear",ba);
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="CargarTiposDeWyvern";
__ref._cargartiposdewyvern /*void*/ (null);
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="End Sub";
return "";
}
public void  _cargartiposdewyvern(b4a.example.crearwyvernpage __ref) throws Exception{
RDebugUtils.currentModule="crearwyvernpage";
if (Debug.shouldDelegate(ba, "cargartiposdewyvern", false))
	 {Debug.delegate(ba, "cargartiposdewyvern", null); return;}
ResumableSub_CargarTiposDeWyvern rsub = new ResumableSub_CargarTiposDeWyvern(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CargarTiposDeWyvern extends BA.ResumableSub {
public ResumableSub_CargarTiposDeWyvern(b4a.example.crearwyvernpage parent,b4a.example.crearwyvernpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.crearwyvernpage __ref;
b4a.example.crearwyvernpage parent;
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
RDebugUtils.currentModule="crearwyvernpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="peticion.Initialize(\"JobTiposDeWyvern\", Me)";
_peticion._initialize /*String*/ (null,ba,"JobTiposDeWyvern",parent);
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
_peticion._download /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern");
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crearwyvernpage", "cargartiposdewyvern"), (Object)(_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_respuesta = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="If respuesta.Success Then";
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
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="Dim json As String = respuesta.GetString";
_json = _respuesta._getstring /*String*/ (null);
RDebugUtils.currentLine=14155784;
 //BA.debugLineNum = 14155784;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="jsonParser.Initialize(json)";
_jsonparser.Initialize(_json);
RDebugUtils.currentLine=14155787;
 //BA.debugLineNum = 14155787;BA.debugLine="Dim listaTipos As List = jsonParser.NextArray";
_listatipos = new anywheresoftware.b4a.objects.collections.List();
_listatipos = _jsonparser.NextArray();
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="tiposWyverns.Initialize";
__ref._tiposwyverns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14155789;
 //BA.debugLineNum = 14155789;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14155790;
 //BA.debugLineNum = 14155790;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=14155792;
 //BA.debugLineNum = 14155792;BA.debugLine="For Each tipo As Map In listaTipos";
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
RDebugUtils.currentLine=14155793;
 //BA.debugLineNum = 14155793;BA.debugLine="tiposWyverns.Put(tipo.Get(\"id\"), tipo.Get(\"Nomb";
__ref._tiposwyverns /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_tipo.Get((Object)("id")),_tipo.Get((Object)("Nombre")));
RDebugUtils.currentLine=14155794;
 //BA.debugLineNum = 14155794;BA.debugLine="items.Add(tipo.Get(\"Nombre\"))";
_items.Add(_tipo.Get((Object)("Nombre")));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=14155797;
 //BA.debugLineNum = 14155797;BA.debugLine="actTipo.SetItems(items)";
__ref._acttipo /*anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper*/ .SetItems(ba,_items);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=14155799;
 //BA.debugLineNum = 14155799;BA.debugLine="xui.MsgboxAsync(\"No se pudo obtener la lista de";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("No se pudo obtener la lista de tipos de wyvern. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=14155802;
 //BA.debugLineNum = 14155802;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=14155803;
 //BA.debugLineNum = 14155803;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btninsertar_click(b4a.example.crearwyvernpage __ref) throws Exception{
RDebugUtils.currentModule="crearwyvernpage";
if (Debug.shouldDelegate(ba, "btninsertar_click", false))
	 {Debug.delegate(ba, "btninsertar_click", null); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4a.example.crearwyvernpage parent,b4a.example.crearwyvernpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.crearwyvernpage __ref;
b4a.example.crearwyvernpage parent;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _nombre = "";
String _elemento = "";
String _tipo = "";
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crearwyvernpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="Dim nombre As String = txtNombre.Text";
_nombre = __ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="Dim elemento As String = txtElemento.Text";
_elemento = __ref._txtelemento /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
_tipo = __ref._getkeyfromvalue /*String*/ (null,__ref._tiposwyverns /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._acttipo /*anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper*/ .getText());
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="If tipo = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_tipo).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="xui.MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Er";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Tipo de Wyvern no válido."),BA.ObjectToCharSequence("Error"));
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=14286862;
 //BA.debugLineNum = 14286862;BA.debugLine="map.Put(\"Nombre\", nombre)";
_map.Put((Object)("Nombre"),(Object)(_nombre));
RDebugUtils.currentLine=14286863;
 //BA.debugLineNum = 14286863;BA.debugLine="map.Put(\"Elemento\", elemento)";
_map.Put((Object)("Elemento"),(Object)(_elemento));
RDebugUtils.currentLine=14286864;
 //BA.debugLineNum = 14286864;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
_map.Put((Object)("Tipo_WyvernId"),(Object)(_tipo));
RDebugUtils.currentLine=14286866;
 //BA.debugLineNum = 14286866;BA.debugLine="jsonGenerator.Initialize(map)";
_jsongenerator.Initialize(_map);
RDebugUtils.currentLine=14286867;
 //BA.debugLineNum = 14286867;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
_json = _jsongenerator.ToPrettyString((int) (2));
RDebugUtils.currentLine=14286869;
 //BA.debugLineNum = 14286869;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=14286870;
 //BA.debugLineNum = 14286870;BA.debugLine="peticion.Initialize(\"jobInsertar\", Me)";
_peticion._initialize /*String*/ (null,ba,"jobInsertar",parent);
RDebugUtils.currentLine=14286871;
 //BA.debugLineNum = 14286871;BA.debugLine="peticion.PostString(\"https://6637fe834253a866a24c";
_peticion._poststring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/",_json);
RDebugUtils.currentLine=14286872;
 //BA.debugLineNum = 14286872;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
_peticion._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14286874;
 //BA.debugLineNum = 14286874;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crearwyvernpage", "btninsertar_click"), (Object)(_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_respuesta = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14286875;
 //BA.debugLineNum = 14286875;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_respuesta._success /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=14286876;
 //BA.debugLineNum = 14286876;BA.debugLine="xui.MsgboxAsync(\"Wyvern creado.\", \"Éxito\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Wyvern creado."),BA.ObjectToCharSequence("Éxito"));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=14286878;
 //BA.debugLineNum = 14286878;BA.debugLine="xui.MsgboxAsync(\"No se pudo crear wyvern. \" & re";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("No se pudo crear wyvern. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=14286881;
 //BA.debugLineNum = 14286881;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=14286882;
 //BA.debugLineNum = 14286882;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _getkeyfromvalue(b4a.example.crearwyvernpage __ref,anywheresoftware.b4a.objects.collections.Map _map,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="crearwyvernpage";
if (Debug.shouldDelegate(ba, "getkeyfromvalue", false))
	 {return ((String) Debug.delegate(ba, "getkeyfromvalue", new Object[] {_map,_value}));}
int _i = 0;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Private Sub GetKeyFromValue(map As Map, value As S";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="For i = 0 To map.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_map.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="If map.GetValueAt(i) = value Then";
if ((_map.GetValueAt(_i)).equals((Object)(_value))) { 
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Return map.GetKeyAt(i)";
if (true) return BA.ObjectToString(_map.GetKeyAt(_i));
 };
 }
};
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="End Sub";
return "";
}
public String  _btnregresar_click(b4a.example.crearwyvernpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crearwyvernpage";
if (Debug.shouldDelegate(ba, "btnregresar_click", false))
	 {return ((String) Debug.delegate(ba, "btnregresar_click", null));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub btnRegresar_Click";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.crearwyvernpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crearwyvernpage";
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Private txtElemento As EditText";
_txtelemento = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Private txtTipo As EditText";
_txttipo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="Private actTipo As AutoCompleteEditText";
_acttipo = new anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper();
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="Private tiposWyverns As Map";
_tiposwyverns = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="End Sub";
return "";
}
}