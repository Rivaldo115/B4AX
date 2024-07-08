
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class editarwyvernpage {
    public static RemoteObject myClass;
	public editarwyvernpage() {
	}
    public static PCBA staticBA = new PCBA(null, editarwyvernpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtelemento = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txttipo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _acttipo = RemoteObject.declareNull("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
public static RemoteObject _tiposwyverns = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"actTipo",_ref.getField(false, "_acttipo"),"Root",_ref.getField(false, "_root"),"tiposWyverns",_ref.getField(false, "_tiposwyverns"),"txtElemento",_ref.getField(false, "_txtelemento"),"txtId",_ref.getField(false, "_txtid"),"txtNombre",_ref.getField(false, "_txtnombre"),"txtTipo",_ref.getField(false, "_txttipo"),"xui",_ref.getField(false, "_xui")};
}
}