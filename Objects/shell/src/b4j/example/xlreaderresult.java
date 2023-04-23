
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xlreaderresult {
    public static RemoteObject myClass;
	public xlreaderresult() {
	}
    public static PCBA staticBA = new PCBA(null, xlreaderresult.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _topleft = RemoteObject.declareNull("b4j.example.xlutils._xladdress");
public static RemoteObject _bottomright = RemoteObject.declareNull("b4j.example.xlutils._xladdress");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _xl = RemoteObject.declareNull("b4j.example.xlutils");
public static RemoteObject _defaultemptycellvalue = RemoteObject.declareNull("Object");
public static RemoteObject _hyperlinks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BottomRight",_ref.getField(false, "_bottomright"),"CSSUtils",_ref.getField(false, "_cssutils"),"Data",_ref.getField(false, "_data"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultEmptyCellValue",_ref.getField(false, "_defaultemptycellvalue"),"Hyperlinks",_ref.getField(false, "_hyperlinks"),"Name",_ref.getField(false, "_name"),"TopLeft",_ref.getField(false, "_topleft"),"xl",_ref.getField(false, "_xl")};
}
}