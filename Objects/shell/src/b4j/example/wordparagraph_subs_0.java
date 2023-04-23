package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wordparagraph_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public XWPFParagraph As JavaObject";
wordparagraph._xwpfparagraph = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_xwpfparagraph",wordparagraph._xwpfparagraph);
 //BA.debugLineNum = 4;BA.debugLine="Public mDocument As WordDocument";
wordparagraph._mdocument = RemoteObject.createNew ("b4j.example.worddocument");__ref.setField("_mdocument",wordparagraph._mdocument);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _paragraph,RemoteObject _document) throws Exception{
try {
		Debug.PushSubsStack("Initialize (wordparagraph) ","wordparagraph",10,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "wordparagraph","initialize", __ref, _ba, _paragraph, _document);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Paragraph", _paragraph);
Debug.locals.put("Document", _document);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize (Paragraph As JavaObject, Do";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="XWPFParagraph = Paragraph";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xwpfparagraph" /*RemoteObject*/ ,_paragraph);
 BA.debugLineNum = 11;BA.debugLine="mDocument = Document";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdocument" /*RemoteObject*/ ,_document);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}