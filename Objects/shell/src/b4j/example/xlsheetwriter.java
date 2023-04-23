
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xlsheetwriter {
    public static RemoteObject myClass;
	public xlsheetwriter() {
	}
    public static PCBA staticBA = new PCBA(null, xlsheetwriter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _poisheet = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiSheetWrapper");
public static RemoteObject _xl = RemoteObject.declareNull("b4j.example.xlutils");
public static RemoteObject _lastaccessed = RemoteObject.declareNull("b4j.example.xlutils._xladdress");
public static RemoteObject _jsheet = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _workbook = RemoteObject.declareNull("b4j.example.xlworkbookwriter");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"jsheet",_ref.getField(false, "_jsheet"),"LastAccessed",_ref.getField(false, "_lastaccessed"),"PoiSheet",_ref.getField(false, "_poisheet"),"Workbook",_ref.getField(false, "_workbook"),"xl",_ref.getField(false, "_xl")};
}
}