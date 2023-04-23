
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class worddocument {
    public static RemoteObject myClass;
	public worddocument() {
	}
    public static PCBA staticBA = new PCBA(null, worddocument.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xwpfdocument = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _mwu = RemoteObject.declareNull("b4j.example.wordutils");
public static RemoteObject _allowedtags = RemoteObject.declareNull("b4j.example.b4xset");
public static RemoteObject _stack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _start = RemoteObject.createImmutable(0);
public static RemoteObject _errorstring = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _colorsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _highlightcolorsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _debuglog = RemoteObject.createImmutable(false);
public static RemoteObject _jme = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AllowedTags",_ref.getField(false, "_allowedtags"),"ColorsMap",_ref.getField(false, "_colorsmap"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"DebugLog",_ref.getField(false, "_debuglog"),"ErrorString",_ref.getField(false, "_errorstring"),"HighlightColorsMap",_ref.getField(false, "_highlightcolorsmap"),"jme",_ref.getField(false, "_jme"),"mWU",_ref.getField(false, "_mwu"),"Stack",_ref.getField(false, "_stack"),"Start",_ref.getField(false, "_start"),"XWPFDocument",_ref.getField(false, "_xwpfdocument")};
}
}