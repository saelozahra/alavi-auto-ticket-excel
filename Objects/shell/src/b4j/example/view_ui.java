
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class view_ui {
    public static RemoteObject myClass;
	public view_ui() {
	}
    public static PCBA staticBA = new PCBA(null, view_ui.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _pocan = RemoteObject.declareNull("anywheresoftware.b4j.objects.CanvasWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"poCan",_ref.getField(false, "_pocan"),"txtName",_ref.getField(false, "_txtname"),"xui",_ref.getField(false, "_xui")};
}
}