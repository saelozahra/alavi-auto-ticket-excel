
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class wordparagraph {
    public static RemoteObject myClass;
	public wordparagraph() {
	}
    public static PCBA staticBA = new PCBA(null, wordparagraph.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xwpfparagraph = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _mdocument = RemoteObject.declareNull("b4j.example.worddocument");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"mDocument",_ref.getField(false, "_mdocument"),"XWPFParagraph",_ref.getField(false, "_xwpfparagraph")};
}
}