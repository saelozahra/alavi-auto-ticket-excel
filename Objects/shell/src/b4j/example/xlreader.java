
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xlreader {
    public static RemoteObject myClass;
	public xlreader() {
	}
    public static PCBA staticBA = new PCBA(null, xlreader.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _emptyrow = null;
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _xl = RemoteObject.declareNull("b4j.example.xlutils");
public static RemoteObject _missingcellvalue = RemoteObject.declareNull("Object");
public static RemoteObject _fetchformulasinsteadofcachedvalues = RemoteObject.createImmutable(false);
public static RemoteObject _fetchhyperlinks = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"EmptyRow",_ref.getField(false, "_emptyrow"),"FetchFormulasInsteadOfCachedValues",_ref.getField(false, "_fetchformulasinsteadofcachedvalues"),"FetchHyperlinks",_ref.getField(false, "_fetchhyperlinks"),"MissingCellValue",_ref.getField(false, "_missingcellvalue"),"Password",_ref.getField(false, "_password"),"xl",_ref.getField(false, "_xl")};
}
}