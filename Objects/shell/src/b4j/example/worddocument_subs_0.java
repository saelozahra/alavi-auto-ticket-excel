package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class worddocument_subs_0 {


public static RemoteObject  _append(RemoteObject __ref,RemoteObject _bbtext) throws Exception{
try {
		Debug.PushSubsStack("Append (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("append")) { return __ref.runUserSub(false, "worddocument","append", __ref, _bbtext);}
RemoteObject _doc = RemoteObject.declareNull("b4j.example.worddocument._worddocelement");
Debug.locals.put("BBText", _bbtext);
 BA.debugLineNum = 59;BA.debugLine="Public Sub Append(BBText As String) As WordDocumen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Dim doc As WordDocElement = Parse(BBText)";
Debug.JustUpdateDeviceLine();
_doc = __ref.runClassMethod (b4j.example.worddocument.class, "_parse" /*RemoteObject*/ ,(Object)(_bbtext));Debug.locals.put("doc", _doc);Debug.locals.put("doc", _doc);
 BA.debugLineNum = 61;BA.debugLine="HandleElements(doc)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_handleelements" /*RemoteObject*/ ,(Object)(_doc));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public XWPFDocument As JavaObject";
worddocument._xwpfdocument = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_xwpfdocument",worddocument._xwpfdocument);
 //BA.debugLineNum = 3;BA.debugLine="Private mWU As WordUtils 'ignore";
worddocument._mwu = RemoteObject.createNew ("b4j.example.wordutils");__ref.setField("_mwu",worddocument._mwu);
 //BA.debugLineNum = 4;BA.debugLine="Private AllowedTags As B4XSet";
worddocument._allowedtags = RemoteObject.createNew ("b4j.example.b4xset");__ref.setField("_allowedtags",worddocument._allowedtags);
 //BA.debugLineNum = 5;BA.debugLine="Private Stack As List";
worddocument._stack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_stack",worddocument._stack);
 //BA.debugLineNum = 6;BA.debugLine="Private Start As Int";
worddocument._start = RemoteObject.createImmutable(0);__ref.setField("_start",worddocument._start);
 //BA.debugLineNum = 7;BA.debugLine="Public ErrorString As StringBuilder";
worddocument._errorstring = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_errorstring",worddocument._errorstring);
 //BA.debugLineNum = 8;BA.debugLine="Type WordTagNode (Tag As String, Extra As Map, Ca";
;
 //BA.debugLineNum = 9;BA.debugLine="Type WordTextNode (Text As String, Tags As List)";
;
 //BA.debugLineNum = 10;BA.debugLine="Type WordDocElement(Tag As String, Extra As Map,";
;
 //BA.debugLineNum = 11;BA.debugLine="Private ColorsMap As Map";
worddocument._colorsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_colorsmap",worddocument._colorsmap);
 //BA.debugLineNum = 12;BA.debugLine="Private HighlightColorsMap As Map";
worddocument._highlightcolorsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_highlightcolorsmap",worddocument._highlightcolorsmap);
 //BA.debugLineNum = 13;BA.debugLine="Public DebugLog As Boolean";
worddocument._debuglog = RemoteObject.createImmutable(false);__ref.setField("_debuglog",worddocument._debuglog);
 //BA.debugLineNum = 14;BA.debugLine="Private jme As JavaObject";
worddocument._jme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jme",worddocument._jme);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configureparagraph(RemoteObject __ref,RemoteObject _paragraph,RemoteObject _element) throws Exception{
try {
		Debug.PushSubsStack("ConfigureParagraph (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,383);
if (RapidSub.canDelegate("configureparagraph")) { return __ref.runUserSub(false, "worddocument","configureparagraph", __ref, _paragraph, _element);}
RemoteObject _props = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _alignment = RemoteObject.createImmutable("");
RemoteObject _indentationleft = RemoteObject.createImmutable(0);
Debug.locals.put("Paragraph", _paragraph);
Debug.locals.put("Element", _element);
 BA.debugLineNum = 383;BA.debugLine="Private Sub ConfigureParagraph (Paragraph As JavaO";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 384;BA.debugLine="Dim props As Map = Element.Extra";
Debug.JustUpdateDeviceLine();
_props = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_props = _element.getField(false,"Extra" /*RemoteObject*/ );Debug.locals.put("props", _props);Debug.locals.put("props", _props);
 BA.debugLineNum = 385;BA.debugLine="Dim Alignment As String = props.GetDefault(\"align";
Debug.JustUpdateDeviceLine();
_alignment = BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("alignment"))),(Object)((RemoteObject.createImmutable("START")))));Debug.locals.put("Alignment", _alignment);Debug.locals.put("Alignment", _alignment);
 BA.debugLineNum = 386;BA.debugLine="Paragraph.RunMethod(\"setAlignment\", Array(Alignme";
Debug.JustUpdateDeviceLine();
_paragraph.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_alignment.runMethod(true,"toUpperCase"))})));
 BA.debugLineNum = 387;BA.debugLine="Dim indentationLeft As Int = props.GetDefault(\"in";
Debug.JustUpdateDeviceLine();
_indentationleft = BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("indentationleft"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("indentationLeft", _indentationleft);Debug.locals.put("indentationLeft", _indentationleft);
 BA.debugLineNum = 388;BA.debugLine="If GetBoolean(props.GetDefault(\"pagebreak\", False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.worddocument.class, "_getboolean" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("pagebreak"))),(Object)((worddocument.__c.getField(true,"False"))))))),worddocument.__c.getField(true,"True"))) { 
 BA.debugLineNum = 389;BA.debugLine="Paragraph.RunMethod(\"setPageBreak\", Array(True))";
Debug.JustUpdateDeviceLine();
_paragraph.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPageBreak")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(worddocument.__c.getField(true,"True"))})));
 };
 BA.debugLineNum = 391;BA.debugLine="If indentationLeft <> 0 Then Paragraph.RunMethod(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_indentationleft,BA.numberCast(double.class, 0))) { 
_paragraph.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndentationLeft")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_indentationleft,RemoteObject.createImmutable(20)}, "*",0, 1))})));};
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtagnode(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("CreateTagNode (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("createtagnode")) { return __ref.runUserSub(false, "worddocument","createtagnode", __ref, _tag);}
RemoteObject _n = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 375;BA.debugLine="Private Sub CreateTagNode (Tag As String) As WordT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="Dim n As WordTagNode";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("b4j.example.worddocument._wordtagnode");Debug.locals.put("n", _n);
 BA.debugLineNum = 377;BA.debugLine="n.Initialize";
Debug.JustUpdateDeviceLine();
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 378;BA.debugLine="n.Tag = Tag";
Debug.JustUpdateDeviceLine();
_n.setField ("Tag" /*RemoteObject*/ ,_tag);
 BA.debugLineNum = 379;BA.debugLine="n.CanHaveNestedTags = True";
Debug.JustUpdateDeviceLine();
_n.setField ("CanHaveNestedTags" /*RemoteObject*/ ,worddocument.__c.getField(true,"True"));
 BA.debugLineNum = 380;BA.debugLine="Return n";
Debug.JustUpdateDeviceLine();
if (true) return _n;
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextnode(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateTextNode (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("createtextnode")) { return __ref.runUserSub(false, "worddocument","createtextnode", __ref, _text);}
RemoteObject _n = RemoteObject.declareNull("b4j.example.worddocument._wordtextnode");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 365;BA.debugLine="Private Sub CreateTextNode(Text As String) As Word";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 366;BA.debugLine="Dim n As WordTextNode";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("b4j.example.worddocument._wordtextnode");Debug.locals.put("n", _n);
 BA.debugLineNum = 367;BA.debugLine="n.Initialize";
Debug.JustUpdateDeviceLine();
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 368;BA.debugLine="n.Text = Text";
Debug.JustUpdateDeviceLine();
_n.setField ("Text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 369;BA.debugLine="n.Tags.Initialize";
Debug.JustUpdateDeviceLine();
_n.getField(false,"Tags" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 370;BA.debugLine="n.Tags.AddAll(Stack)";
Debug.JustUpdateDeviceLine();
_n.getField(false,"Tags" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_stack" /*RemoteObject*/ )));
 BA.debugLineNum = 371;BA.debugLine="Return n";
Debug.JustUpdateDeviceLine();
if (true) return _n;
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createworddocelement(RemoteObject __ref,RemoteObject _tag,RemoteObject _extra) throws Exception{
try {
		Debug.PushSubsStack("CreateWordDocElement (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,487);
if (RapidSub.canDelegate("createworddocelement")) { return __ref.runUserSub(false, "worddocument","createworddocelement", __ref, _tag, _extra);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.worddocument._worddocelement");
Debug.locals.put("Tag", _tag);
Debug.locals.put("Extra", _extra);
 BA.debugLineNum = 487;BA.debugLine="Private Sub CreateWordDocElement (Tag As String, E";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 488;BA.debugLine="Dim t1 As WordDocElement";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.worddocument._worddocelement");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 489;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 490;BA.debugLine="t1.Tag = Tag";
Debug.JustUpdateDeviceLine();
_t1.setField ("Tag" /*RemoteObject*/ ,_tag);
 BA.debugLineNum = 491;BA.debugLine="If Extra.IsInitialized = False Then Extra.Initial";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_extra.runMethod(true,"IsInitialized"),worddocument.__c.getField(true,"False"))) { 
_extra.runVoidMethod ("Initialize");};
 BA.debugLineNum = 492;BA.debugLine="t1.Extra = Extra";
Debug.JustUpdateDeviceLine();
_t1.setField ("Extra" /*RemoteObject*/ ,_extra);
 BA.debugLineNum = 493;BA.debugLine="t1.Children.Initialize";
Debug.JustUpdateDeviceLine();
_t1.getField(false,"Children" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 494;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _error(RemoteObject __ref,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("Error (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,355);
if (RapidSub.canDelegate("error")) { return __ref.runUserSub(false, "worddocument","error", __ref, _msg);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 355;BA.debugLine="Private Sub Error (msg As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 356;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
Debug.JustUpdateDeviceLine();
_s = (RemoteObject.concat(RemoteObject.createImmutable("Error (position - "),worddocument.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_start" /*RemoteObject*/ )))),RemoteObject.createImmutable("): "),worddocument.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_msg))),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 360;BA.debugLine="LogError(s)";
Debug.JustUpdateDeviceLine();
worddocument.__c.runVoidMethod ("LogError",(Object)(_s));
 BA.debugLineNum = 362;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_errorstring" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_s)).runVoidMethod ("Append",(Object)(worddocument.__c.getField(true,"CRLF")));
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getboolean(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("GetBoolean (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("getboolean")) { return __ref.runUserSub(false, "worddocument","getboolean", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 394;BA.debugLine="Private Sub GetBoolean(s As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 395;BA.debugLine="Return s.ToLowerCase = \"true\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_s.runMethod(true,"toLowerCase"),BA.ObjectToString("true")));
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleelements(RemoteObject __ref,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("HandleElements (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("handleelements")) { return __ref.runUserSub(false, "worddocument","handleelements", __ref, _parent);}
int _index = 0;
RemoteObject _child = RemoteObject.declareNull("b4j.example.worddocument._worddocelement");
RemoteObject _par = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _paragraphs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _node = RemoteObject.declareNull("b4j.example.worddocument._wordtextnode");
RemoteObject _rows = RemoteObject.createImmutable(0);
RemoteObject _cols = RemoteObject.createImmutable(0);
RemoteObject _alignment = RemoteObject.createImmutable("");
RemoteObject _fixedmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rh = RemoteObject.createImmutable("");
RemoteObject _celloffset = RemoteObject.createImmutable(0);
RemoteObject _colspan = RemoteObject.createImmutable(0);
RemoteObject _rowspan = RemoteObject.createImmutable(0);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 65;BA.debugLine="Private Sub HandleElements(Parent As WordDocElemen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="For index = 0 To Parent.Children.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_parent.getField(false,"Children" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_index = 0 ;
for (;(step1 > 0 && _index <= limit1) || (step1 < 0 && _index >= limit1) ;_index = ((int)(0 + _index + step1))  ) {
Debug.locals.put("index", _index);
 BA.debugLineNum = 67;BA.debugLine="Dim child As WordDocElement = Parent.Children.Ge";
Debug.JustUpdateDeviceLine();
_child = (_parent.getField(false,"Children" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _index))));Debug.locals.put("child", _child);Debug.locals.put("child", _child);
 BA.debugLineNum = 68;BA.debugLine="If DebugLog Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_debuglog" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 69;BA.debugLine="Log(\"Tag: \" & child.Tag)";
Debug.JustUpdateDeviceLine();
worddocument.__c.runVoidMethod ("LogImpl","95701636",RemoteObject.concat(RemoteObject.createImmutable("Tag: "),_child.getField(true,"Tag" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 71;BA.debugLine="Select child.Tag";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_child.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("p"),BA.ObjectToString("header"),BA.ObjectToString("footer"),BA.ObjectToString("table"),BA.ObjectToString("row"),BA.ObjectToString("cell"))) {
case 0: {
 BA.debugLineNum = 73;BA.debugLine="Dim par As JavaObject";
Debug.JustUpdateDeviceLine();
_par = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("par", _par);
 BA.debugLineNum = 74;BA.debugLine="Select Parent.Tag";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_parent.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("doc"),BA.ObjectToString("header"),BA.ObjectToString("footer"),BA.ObjectToString("cell"))) {
case 0: {
 BA.debugLineNum = 76;BA.debugLine="par = XWPFDocument.RunMethod(\"createParagrap";
Debug.JustUpdateDeviceLine();
_par = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_xwpfdocument" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createParagraph")),(Object)((worddocument.__c.getField(false,"Null")))));Debug.locals.put("par", _par);
 break; }
case 1: 
case 2: {
 BA.debugLineNum = 78;BA.debugLine="par = Parent.JElement.RunMethod(\"createParag";
Debug.JustUpdateDeviceLine();
_par = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _parent.getField(false,"JElement" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createParagraph")),(Object)((worddocument.__c.getField(false,"Null")))));Debug.locals.put("par", _par);
 break; }
case 3: {
 BA.debugLineNum = 80;BA.debugLine="If index = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_index),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 81;BA.debugLine="Dim paragraphs As List";
Debug.JustUpdateDeviceLine();
_paragraphs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("paragraphs", _paragraphs);
 BA.debugLineNum = 82;BA.debugLine="paragraphs.Initialize";
Debug.JustUpdateDeviceLine();
_paragraphs.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="Dim j As JavaObject = paragraphs";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_j = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _paragraphs.getObject());Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 84;BA.debugLine="j.RunMethod(\"addAll\", Array(Parent.JElement";
Debug.JustUpdateDeviceLine();
_j.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_parent.getField(false,"JElement" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getParagraphs")),(Object)((worddocument.__c.getField(false,"Null")))).getObject())})));
 BA.debugLineNum = 85;BA.debugLine="If paragraphs.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_paragraphs.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 86;BA.debugLine="par = paragraphs.Get(0)";
Debug.JustUpdateDeviceLine();
_par = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _paragraphs.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("par", _par);
 };
 };
 BA.debugLineNum = 89;BA.debugLine="If par.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_par.runMethod(true,"IsInitialized"),worddocument.__c.getField(true,"False"))) { 
 BA.debugLineNum = 90;BA.debugLine="par = Parent.JElement.RunMethod(\"addParagra";
Debug.JustUpdateDeviceLine();
_par = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _parent.getField(false,"JElement" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("addParagraph")),(Object)((worddocument.__c.getField(false,"Null")))));Debug.locals.put("par", _par);
 };
 break; }
}
;
 BA.debugLineNum = 93;BA.debugLine="ConfigureParagraph(par, child)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_configureparagraph" /*RemoteObject*/ ,(Object)(_par),(Object)(_child));
 BA.debugLineNum = 94;BA.debugLine="For Each node As WordTextNode In child.Childre";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group29 = _child.getField(false,"Children" /*RemoteObject*/ );
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_node = (group29.runMethod(false,"Get",index29));Debug.locals.put("node", _node);
Debug.locals.put("node", _node);
 BA.debugLineNum = 95;BA.debugLine="TextToRuns(par, node)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_texttoruns" /*RemoteObject*/ ,(Object)(_par),(Object)(_node));
 }
}Debug.locals.put("node", _node);
;
 break; }
case 1: {
 BA.debugLineNum = 98;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
Debug.JustUpdateDeviceLine();
_child.getField(false,"JElement" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xwpfdocument" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createHeader")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("DEFAULT"))}))));
 BA.debugLineNum = 99;BA.debugLine="HandleElements(child)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_handleelements" /*RemoteObject*/ ,(Object)(_child));
 break; }
case 2: {
 BA.debugLineNum = 101;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
Debug.JustUpdateDeviceLine();
_child.getField(false,"JElement" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xwpfdocument" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createFooter")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("DEFAULT"))}))));
 BA.debugLineNum = 102;BA.debugLine="HandleElements(child)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_handleelements" /*RemoteObject*/ ,(Object)(_child));
 break; }
case 3: {
 BA.debugLineNum = 104;BA.debugLine="Dim rows As Int = child.Extra.Get(\"rows\")";
Debug.JustUpdateDeviceLine();
_rows = BA.numberCast(int.class, _child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rows")))));Debug.locals.put("rows", _rows);Debug.locals.put("rows", _rows);
 BA.debugLineNum = 105;BA.debugLine="Dim cols As Int = child.Extra.Get(\"cols\")";
Debug.JustUpdateDeviceLine();
_cols = BA.numberCast(int.class, _child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cols")))));Debug.locals.put("cols", _cols);Debug.locals.put("cols", _cols);
 BA.debugLineNum = 106;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
Debug.JustUpdateDeviceLine();
_child.getField(false,"JElement" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xwpfdocument" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createTable")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rows),(_cols)}))));
 BA.debugLineNum = 107;BA.debugLine="If child.Extra.ContainsKey(\"alignment\") Then";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("alignment")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 108;BA.debugLine="Dim alignment As String = ToUpper(child.Extra";
Debug.JustUpdateDeviceLine();
_alignment = __ref.runClassMethod (b4j.example.worddocument.class, "_toupper" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("alignment")))))));Debug.locals.put("alignment", _alignment);Debug.locals.put("alignment", _alignment);
 BA.debugLineNum = 110;BA.debugLine="Dim fixedMap As Map = CreateMap(\"LEFT\": \"RIGH";
Debug.JustUpdateDeviceLine();
_fixedmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fixedmap = worddocument.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("LEFT")),RemoteObject.createImmutable(("RIGHT")),RemoteObject.createImmutable(("CENTER")),RemoteObject.createImmutable(("LEFT")),RemoteObject.createImmutable(("RIGHT")),(RemoteObject.createImmutable("CENTER"))}));Debug.locals.put("fixedMap", _fixedmap);Debug.locals.put("fixedMap", _fixedmap);
 BA.debugLineNum = 111;BA.debugLine="child.JElement.RunMethod(\"setTableAlignment\",";
Debug.JustUpdateDeviceLine();
_child.getField(false,"JElement" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTableAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_fixedmap.runMethod(false,"Get",(Object)((_alignment)))})));
 };
 BA.debugLineNum = 113;BA.debugLine="HandleElements(child)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_handleelements" /*RemoteObject*/ ,(Object)(_child));
 break; }
case 4: {
 BA.debugLineNum = 115;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
Debug.JustUpdateDeviceLine();
_child.getField(false,"JElement" /*RemoteObject*/ ).setObject (_parent.getField(false,"JElement" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((_index))}))));
 BA.debugLineNum = 116;BA.debugLine="If child.Extra.ContainsKey(\"height\") Then chil";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("height")))).<Boolean>get().booleanValue()) { 
_child.getField(false,"JElement" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (b4j.example.worddocument.class, "_to20thspoint" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height")))))),(Object)(worddocument.__c.getField(true,"False")))})));};
 BA.debugLineNum = 117;BA.debugLine="If child.Extra.ContainsKey(\"repeatheader\") The";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("repeatheader")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 118;BA.debugLine="Dim rh As String = child.Extra.Get(\"repeathea";
Debug.JustUpdateDeviceLine();
_rh = BA.ObjectToString(_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("repeatheader")))));Debug.locals.put("rh", _rh);Debug.locals.put("rh", _rh);
 BA.debugLineNum = 119;BA.debugLine="child.JElement.RunMethod(\"setRepeatHeader\", A";
Debug.JustUpdateDeviceLine();
_child.getField(false,"JElement" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setRepeatHeader")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_rh.runMethod(true,"toLowerCase"),RemoteObject.createImmutable("true"))))})));
 };
 BA.debugLineNum = 121;BA.debugLine="HandleElements(child)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_handleelements" /*RemoteObject*/ ,(Object)(_child));
 break; }
case 5: {
 BA.debugLineNum = 123;BA.debugLine="Dim CellOffset As Int = index + child.Extra.Ge";
Debug.JustUpdateDeviceLine();
_celloffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_index),BA.numberCast(double.class, _child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("offset"))),(Object)(RemoteObject.createImmutable((0)))))}, "+",1, 0));Debug.locals.put("CellOffset", _celloffset);Debug.locals.put("CellOffset", _celloffset);
 BA.debugLineNum = 124;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
Debug.JustUpdateDeviceLine();
_child.getField(false,"JElement" /*RemoteObject*/ ).setObject (_parent.getField(false,"JElement" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCell")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_celloffset)}))));
 BA.debugLineNum = 125;BA.debugLine="If child.Extra.ContainsKey(\"color\") Then child";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("color")))).<Boolean>get().booleanValue()) { 
_child.getField(false,"JElement" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.worddocument.class, "_parsecolorstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("color"))))))))})));};
 BA.debugLineNum = 126;BA.debugLine="If child.Extra.ContainsKey(\"verticalalignment\"";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("verticalalignment")))).<Boolean>get().booleanValue()) { 
_child.getField(false,"JElement" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVerticalAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.worddocument.class, "_toupper" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("verticalalignment"))))))))})));};
 BA.debugLineNum = 127;BA.debugLine="If child.Extra.ContainsKey(\"width\") Then child";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("width")))).<Boolean>get().booleanValue()) { 
_child.getField(false,"JElement" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setWidth")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (b4j.example.worddocument.class, "_to20thspoint" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width")))))),(Object)(worddocument.__c.getField(true,"True")))})));};
 BA.debugLineNum = 128;BA.debugLine="If child.Extra.ContainsKey(\"colspan\") Then";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("colspan")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 129;BA.debugLine="Dim ColSpan As Int = child.Extra.Get(\"colspan";
Debug.JustUpdateDeviceLine();
_colspan = BA.numberCast(int.class, _child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("colspan")))));Debug.locals.put("ColSpan", _colspan);Debug.locals.put("ColSpan", _colspan);
 BA.debugLineNum = 130;BA.debugLine="jme.RunMethod(\"MergeCellsHorizontal\", Array(P";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jme" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("MergeCellsHorizontal")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_parent.getField(false,"JElement" /*RemoteObject*/ ).getObject()),(_child.getField(false,"JElement" /*RemoteObject*/ ).getObject()),RemoteObject.createImmutable((_index)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_index),_colspan,RemoteObject.createImmutable(1)}, "+-",2, 1))})));
 };
 BA.debugLineNum = 132;BA.debugLine="If child.Extra.ContainsKey(\"rowspan\") Then";
Debug.JustUpdateDeviceLine();
if (_child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("rowspan")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 133;BA.debugLine="Dim RowSpan As Int = child.Extra.Get(\"rowspan";
Debug.JustUpdateDeviceLine();
_rowspan = BA.numberCast(int.class, _child.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rowspan")))));Debug.locals.put("RowSpan", _rowspan);Debug.locals.put("RowSpan", _rowspan);
 BA.debugLineNum = 134;BA.debugLine="jme.RunMethod(\"MergeCellsVertical\", Array(Par";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jme" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("MergeCellsVertical")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_parent.getField(false,"JElement" /*RemoteObject*/ ).getObject()),RemoteObject.createImmutable((_index)),(_rowspan)})));
 };
 BA.debugLineNum = 136;BA.debugLine="HandleElements(child)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_handleelements" /*RemoteObject*/ ,(Object)(_child));
 break; }
}
;
 }
}Debug.locals.put("index", _index);
;
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _wu,RemoteObject _document) throws Exception{
try {
		Debug.PushSubsStack("Initialize (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "worddocument","initialize", __ref, _ba, _wu, _document);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("wu", _wu);
Debug.locals.put("Document", _document);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (wu As WordUtils, Document A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="mWU = wu";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mwu" /*RemoteObject*/ ,_wu);
 BA.debugLineNum = 20;BA.debugLine="XWPFDocument = Document";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xwpfdocument" /*RemoteObject*/ ,_document);
 BA.debugLineNum = 21;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"p\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_allowedtags" /*RemoteObject*/ ,worddocument._b4xcollections.runMethod(false,"_createset2" /*RemoteObject*/ ,(Object)(worddocument.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {22},new Object[] {RemoteObject.createImmutable(("p")),RemoteObject.createImmutable(("b")),RemoteObject.createImmutable(("u")),RemoteObject.createImmutable(("embossed")),RemoteObject.createImmutable(("shadow")),RemoteObject.createImmutable(("plain")),RemoteObject.createImmutable(("color")),RemoteObject.createImmutable(("font")),RemoteObject.createImmutable(("textsize")),RemoteObject.createImmutable(("break")),RemoteObject.createImmutable(("i")),RemoteObject.createImmutable(("strike")),RemoteObject.createImmutable(("img")),RemoteObject.createImmutable(("indentationleft")),RemoteObject.createImmutable(("header")),RemoteObject.createImmutable(("footer")),RemoteObject.createImmutable(("table")),RemoteObject.createImmutable(("row")),RemoteObject.createImmutable(("cell")),RemoteObject.createImmutable(("highlight")),RemoteObject.createImmutable(("url")),(RemoteObject.createImmutable("bookmark"))}))))));
 BA.debugLineNum = 23;BA.debugLine="ColorsMap = CreateMap(\"black\": 0xFF000000, _ 		\"d";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colorsmap" /*RemoteObject*/ ,worddocument.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("black")),RemoteObject.createImmutable((((int)0xff000000))),RemoteObject.createImmutable(("darkgray")),RemoteObject.createImmutable((((int)0xff444444))),RemoteObject.createImmutable(("gray")),RemoteObject.createImmutable((((int)0xffcccccc))),RemoteObject.createImmutable(("white")),RemoteObject.createImmutable((((int)0xffffffff))),RemoteObject.createImmutable(("red")),RemoteObject.createImmutable((((int)0xffff0000))),RemoteObject.createImmutable(("green")),RemoteObject.createImmutable((((int)0xff00ff00))),RemoteObject.createImmutable(("blue")),RemoteObject.createImmutable((((int)0xff0000ff))),RemoteObject.createImmutable(("yellow")),RemoteObject.createImmutable((((int)0xffffff00))),RemoteObject.createImmutable(("cyan")),RemoteObject.createImmutable((((int)0xff00ffff))),RemoteObject.createImmutable(("darkblue")),RemoteObject.createImmutable((((int)0xff000080))),RemoteObject.createImmutable(("darkcyan")),RemoteObject.createImmutable((((int)0xff008080))),RemoteObject.createImmutable(("darkgreen")),RemoteObject.createImmutable((((int)0xff008000))),RemoteObject.createImmutable(("darkmagenta")),RemoteObject.createImmutable((((int)0xff800080))),RemoteObject.createImmutable(("darkred")),RemoteObject.createImmutable((((int)0xff800000))),RemoteObject.createImmutable(("darkyellow")),RemoteObject.createImmutable((((int)0xff808000))),RemoteObject.createImmutable(("magenta")),RemoteObject.createImmutable((((int)0xffff00ff)))})));
 BA.debugLineNum = 39;BA.debugLine="HighlightColorsMap = CreateMap(\"black\": \"black\",";
Debug.JustUpdateDeviceLine();
__ref.setField ("_highlightcolorsmap" /*RemoteObject*/ ,worddocument.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("black")),RemoteObject.createImmutable(("black")),RemoteObject.createImmutable(("blue")),RemoteObject.createImmutable(("blue")),RemoteObject.createImmutable(("cyan")),RemoteObject.createImmutable(("cyan")),RemoteObject.createImmutable(("green")),RemoteObject.createImmutable(("green")),RemoteObject.createImmutable(("magenta")),RemoteObject.createImmutable(("magenta")),RemoteObject.createImmutable(("red")),RemoteObject.createImmutable(("red")),RemoteObject.createImmutable(("yellow")),RemoteObject.createImmutable(("yellow")),RemoteObject.createImmutable(("white")),RemoteObject.createImmutable(("white")),RemoteObject.createImmutable(("darkblue")),RemoteObject.createImmutable(("darkBlue")),RemoteObject.createImmutable(("darkcyan")),RemoteObject.createImmutable(("darkCyan")),RemoteObject.createImmutable(("darkgreen")),RemoteObject.createImmutable(("darkGreen")),RemoteObject.createImmutable(("darkmagenta")),RemoteObject.createImmutable(("darkMagenta")),RemoteObject.createImmutable(("darkred")),RemoteObject.createImmutable(("darkRed")),RemoteObject.createImmutable(("darkyellow")),RemoteObject.createImmutable(("darkYellow")),RemoteObject.createImmutable(("darkgray")),RemoteObject.createImmutable(("darkGray")),RemoteObject.createImmutable(("gray")),(RemoteObject.createImmutable("lightGray"))})));
 BA.debugLineNum = 55;BA.debugLine="jme = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jme" /*RemoteObject*/ ).setObject (__ref);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _organizeelements(RemoteObject __ref,RemoteObject _nodes) throws Exception{
try {
		Debug.PushSubsStack("OrganizeElements (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("organizeelements")) { return __ref.runUserSub(false, "worddocument","organizeelements", __ref, _nodes);}
RemoteObject _doc = RemoteObject.declareNull("b4j.example.worddocument._worddocelement");
RemoteObject _elements = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _node = RemoteObject.declareNull("b4j.example.worddocument._wordtextnode");
RemoteObject _currentelement = RemoteObject.declareNull("b4j.example.worddocument._worddocelement");
RemoteObject _tag = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
RemoteObject _newelement = RemoteObject.declareNull("b4j.example.worddocument._worddocelement");
Debug.locals.put("Nodes", _nodes);
 BA.debugLineNum = 256;BA.debugLine="Private Sub OrganizeElements (Nodes As List) As Wo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="RemoveInvalidNodes(Nodes)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_removeinvalidnodes" /*RemoteObject*/ ,(Object)(_nodes));
 BA.debugLineNum = 258;BA.debugLine="Dim doc As WordDocElement = CreateWordDocElement(";
Debug.JustUpdateDeviceLine();
_doc = __ref.runClassMethod (b4j.example.worddocument.class, "_createworddocelement" /*RemoteObject*/ ,(Object)(BA.ObjectToString("doc")),(Object)(worddocument.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}))));Debug.locals.put("doc", _doc);Debug.locals.put("doc", _doc);
 BA.debugLineNum = 259;BA.debugLine="Dim Elements As Map";
Debug.JustUpdateDeviceLine();
_elements = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Elements", _elements);
 BA.debugLineNum = 260;BA.debugLine="Elements.Initialize";
Debug.JustUpdateDeviceLine();
_elements.runVoidMethod ("Initialize");
 BA.debugLineNum = 261;BA.debugLine="For Each node As WordTextNode In Nodes";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _nodes;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_node = (group5.runMethod(false,"Get",index5));Debug.locals.put("node", _node);
Debug.locals.put("node", _node);
 BA.debugLineNum = 262;BA.debugLine="Dim CurrentElement As WordDocElement = doc";
Debug.JustUpdateDeviceLine();
_currentelement = _doc;Debug.locals.put("CurrentElement", _currentelement);Debug.locals.put("CurrentElement", _currentelement);
 BA.debugLineNum = 263;BA.debugLine="For Each tag As WordTagNode In node.Tags";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = _node.getField(false,"Tags" /*RemoteObject*/ );
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_tag = (group7.runMethod(false,"Get",index7));Debug.locals.put("tag", _tag);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 264;BA.debugLine="If tag.Tag = \"noop\" Then Continue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("noop"))) { 
if (true) continue;};
 BA.debugLineNum = 265;BA.debugLine="If Elements.ContainsKey(tag) Then";
Debug.JustUpdateDeviceLine();
if (_elements.runMethod(true,"ContainsKey",(Object)((_tag))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 266;BA.debugLine="CurrentElement = Elements.Get(tag)";
Debug.JustUpdateDeviceLine();
_currentelement = (_elements.runMethod(false,"Get",(Object)((_tag))));Debug.locals.put("CurrentElement", _currentelement);
 }else {
 BA.debugLineNum = 269;BA.debugLine="Dim NewElement As WordDocElement = CreateWordD";
Debug.JustUpdateDeviceLine();
_newelement = __ref.runClassMethod (b4j.example.worddocument.class, "_createworddocelement" /*RemoteObject*/ ,(Object)(_tag.getField(true,"Tag" /*RemoteObject*/ )),(Object)(_tag.getField(false,"Extra" /*RemoteObject*/ )));Debug.locals.put("NewElement", _newelement);Debug.locals.put("NewElement", _newelement);
 BA.debugLineNum = 270;BA.debugLine="CurrentElement.Children.Add(NewElement)";
Debug.JustUpdateDeviceLine();
_currentelement.getField(false,"Children" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_newelement)));
 BA.debugLineNum = 271;BA.debugLine="Elements.Put(tag, NewElement)";
Debug.JustUpdateDeviceLine();
_elements.runVoidMethod ("Put",(Object)((_tag)),(Object)((_newelement)));
 BA.debugLineNum = 272;BA.debugLine="CurrentElement = NewElement";
Debug.JustUpdateDeviceLine();
_currentelement = _newelement;Debug.locals.put("CurrentElement", _currentelement);
 };
 BA.debugLineNum = 274;BA.debugLine="If tag.Tag = \"p\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("p"))) { 
 BA.debugLineNum = 275;BA.debugLine="CurrentElement.Children.Add(node)";
Debug.JustUpdateDeviceLine();
_currentelement.getField(false,"Children" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_node)));
 BA.debugLineNum = 276;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("tag", _tag);
;
 }
}Debug.locals.put("node", _node);
;
 BA.debugLineNum = 280;BA.debugLine="Return doc";
Debug.JustUpdateDeviceLine();
if (true) return _doc;
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parse(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("Parse (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("parse")) { return __ref.runUserSub(false, "worddocument","parse", __ref, _text);}
RemoteObject _parsedelements = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _matcher = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _lastmatchend = RemoteObject.createImmutable(0);
RemoteObject _skipuntilendtag = RemoteObject.createImmutable(false);
RemoteObject _tag = RemoteObject.createImmutable("");
RemoteObject _closedtag = RemoteObject.createImmutable(false);
RemoteObject _t = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
RemoteObject _n = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 190;BA.debugLine="Private Sub Parse (Text As String) As WordDocEleme";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="ErrorString.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_errorstring" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 192;BA.debugLine="Dim ParsedElements As List";
Debug.JustUpdateDeviceLine();
_parsedelements = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ParsedElements", _parsedelements);
 BA.debugLineNum = 193;BA.debugLine="ParsedElements.Initialize";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Initialize");
 BA.debugLineNum = 194;BA.debugLine="Stack.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.worddocument.class, "_createtagnode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("noop"))))));
 BA.debugLineNum = 196;BA.debugLine="Text = Text.Replace(CRLF, \"[break/]\")";
Debug.JustUpdateDeviceLine();
_text = _text.runMethod(true,"replace",(Object)(worddocument.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("[break/]")));Debug.locals.put("Text", _text);
 BA.debugLineNum = 197;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
Debug.JustUpdateDeviceLine();
_matcher = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matcher = worddocument.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("(?<!\\[)\\[[^\\[\\]]+\\]")),(Object)(_text));Debug.locals.put("matcher", _matcher);Debug.locals.put("matcher", _matcher);
 BA.debugLineNum = 198;BA.debugLine="Dim LastMatchEnd As Int = 0";
Debug.JustUpdateDeviceLine();
_lastmatchend = BA.numberCast(int.class, 0);Debug.locals.put("LastMatchEnd", _lastmatchend);Debug.locals.put("LastMatchEnd", _lastmatchend);
 BA.debugLineNum = 199;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
Debug.JustUpdateDeviceLine();
_skipuntilendtag = worddocument.__c.getField(true,"False");Debug.locals.put("skipUntilEndTag", _skipuntilendtag);Debug.locals.put("skipUntilEndTag", _skipuntilendtag);
 BA.debugLineNum = 200;BA.debugLine="Do While matcher.Find";
Debug.JustUpdateDeviceLine();
while (_matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 201;BA.debugLine="Start = matcher.GetStart(0)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_start" /*RemoteObject*/ ,_matcher.runMethod(true,"GetStart",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 202;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_start" /*RemoteObject*/ ),BA.numberCast(double.class, _lastmatchend)) && RemoteObject.solveBoolean("=",_skipuntilendtag,worddocument.__c.getField(true,"False"))) { 
 BA.debugLineNum = 203;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStrin";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.worddocument.class, "_createtextnode" /*RemoteObject*/ ,(Object)(_text.runMethod(true,"substring",(Object)(_lastmatchend),(Object)(__ref.getField(true,"_start" /*RemoteObject*/ ))))))));
 };
 BA.debugLineNum = 205;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
Debug.JustUpdateDeviceLine();
_tag = _matcher.runMethod(true,"getMatch").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_matcher.runMethod(true,"getMatch").runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 206;BA.debugLine="If tag.StartsWith(\"/\") Then";
Debug.JustUpdateDeviceLine();
if (_tag.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 207;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
Debug.JustUpdateDeviceLine();
_tag = _tag.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"toLowerCase");Debug.locals.put("tag", _tag);
 BA.debugLineNum = 208;BA.debugLine="If StackPeek.Tag <> tag Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.example.worddocument.class, "_stackpeek" /*RemoteObject*/ ).getField(true,"Tag" /*RemoteObject*/ ),_tag)) { 
 BA.debugLineNum = 209;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.worddocument.class, "_stackpeek" /*RemoteObject*/ ).getField(true,"CanHaveNestedTags" /*RemoteObject*/ ),worddocument.__c.getField(true,"False"))) { 
 BA.debugLineNum = 210;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 212;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Closing tag does not match: "),_tag)));
 BA.debugLineNum = 213;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (worddocument.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 215;BA.debugLine="If skipUntilEndTag Then";
Debug.JustUpdateDeviceLine();
if (_skipuntilendtag.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 216;BA.debugLine="If Start > LastMatchEnd Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_start" /*RemoteObject*/ ),BA.numberCast(double.class, _lastmatchend))) { 
 BA.debugLineNum = 217;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStr";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.worddocument.class, "_createtextnode" /*RemoteObject*/ ,(Object)(_text.runMethod(true,"substring",(Object)(_lastmatchend),(Object)(__ref.getField(true,"_start" /*RemoteObject*/ ))))))));
 };
 };
 BA.debugLineNum = 220;BA.debugLine="StackPop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_stackpop" /*RemoteObject*/ );
 BA.debugLineNum = 221;BA.debugLine="skipUntilEndTag = False";
Debug.JustUpdateDeviceLine();
_skipuntilendtag = worddocument.__c.getField(true,"False");Debug.locals.put("skipUntilEndTag", _skipuntilendtag);
 }else {
 BA.debugLineNum = 223;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.worddocument.class, "_stackpeek" /*RemoteObject*/ ).getField(true,"CanHaveNestedTags" /*RemoteObject*/ ),worddocument.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 224;BA.debugLine="Dim ClosedTag As Boolean";
Debug.JustUpdateDeviceLine();
_closedtag = RemoteObject.createImmutable(false);Debug.locals.put("ClosedTag", _closedtag);
 BA.debugLineNum = 225;BA.debugLine="If tag.EndsWith(\"/\") Then";
Debug.JustUpdateDeviceLine();
if (_tag.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 226;BA.debugLine="ClosedTag = True";
Debug.JustUpdateDeviceLine();
_closedtag = worddocument.__c.getField(true,"True");Debug.locals.put("ClosedTag", _closedtag);
 BA.debugLineNum = 227;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
Debug.JustUpdateDeviceLine();
_tag = _tag.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_tag.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("tag", _tag);
 }else 
{ BA.debugLineNum = 228;BA.debugLine="Else If tag = \"*\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag,BA.ObjectToString("*"))) { 
 BA.debugLineNum = 229;BA.debugLine="ClosedTag = True";
Debug.JustUpdateDeviceLine();
_closedtag = worddocument.__c.getField(true,"True");Debug.locals.put("ClosedTag", _closedtag);
 }}
;
 BA.debugLineNum = 231;BA.debugLine="tag = tag.Trim";
Debug.JustUpdateDeviceLine();
_tag = _tag.runMethod(true,"trim");Debug.locals.put("tag", _tag);
 BA.debugLineNum = 232;BA.debugLine="Dim t As WordTagNode = ParseTag(tag)";
Debug.JustUpdateDeviceLine();
_t = __ref.runClassMethod (b4j.example.worddocument.class, "_parsetag" /*RemoteObject*/ ,(Object)(_tag));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 233;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_allowedtags" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_t.getField(true,"Tag" /*RemoteObject*/ )))),worddocument.__c.getField(true,"False"))) { 
 BA.debugLineNum = 234;BA.debugLine="Error(\"Invalid tag: \" & tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid tag: "),_tag)));
 BA.debugLineNum = 235;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (worddocument.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 237;BA.debugLine="StackPush(t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_stackpush" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 238;BA.debugLine="If t.Tag = \"plain\" Or t.Tag = \"url\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("plain")) || RemoteObject.solveBoolean("=",_t.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("url"))) { 
 BA.debugLineNum = 239;BA.debugLine="Dim n As WordTagNode = StackPeek";
Debug.JustUpdateDeviceLine();
_n = __ref.runClassMethod (b4j.example.worddocument.class, "_stackpeek" /*RemoteObject*/ );Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 240;BA.debugLine="n.CanHaveNestedTags = False";
Debug.JustUpdateDeviceLine();
_n.setField ("CanHaveNestedTags" /*RemoteObject*/ ,worddocument.__c.getField(true,"False"));
 BA.debugLineNum = 241;BA.debugLine="skipUntilEndTag = True";
Debug.JustUpdateDeviceLine();
_skipuntilendtag = worddocument.__c.getField(true,"True");Debug.locals.put("skipUntilEndTag", _skipuntilendtag);
 };
 BA.debugLineNum = 243;BA.debugLine="If ClosedTag Then";
Debug.JustUpdateDeviceLine();
if (_closedtag.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 244;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.worddocument.class, "_createtextnode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 245;BA.debugLine="StackPop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_stackpop" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 248;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
Debug.JustUpdateDeviceLine();
_lastmatchend = _matcher.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("LastMatchEnd", _lastmatchend);
 }
;
 BA.debugLineNum = 250;BA.debugLine="If Text.Length > LastMatchEnd Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_text.runMethod(true,"length"),BA.numberCast(double.class, _lastmatchend))) { 
 BA.debugLineNum = 251;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubString";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.worddocument.class, "_createtextnode" /*RemoteObject*/ ,(Object)(_text.runMethod(true,"substring",(Object)(_lastmatchend),(Object)(_text.runMethod(true,"length"))))))));
 };
 BA.debugLineNum = 253;BA.debugLine="Return OrganizeElements( ParsedElements)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.worddocument.class, "_organizeelements" /*RemoteObject*/ ,(Object)(_parsedelements));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsecolorstring(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ParseColorString (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("parsecolorstring")) { return __ref.runUserSub(false, "worddocument","parsecolorstring", __ref, _clr);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 467;BA.debugLine="Private Sub ParseColorString(clr As String) As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 468;BA.debugLine="clr = clr.ToLowerCase";
Debug.JustUpdateDeviceLine();
_clr = _clr.runMethod(true,"toLowerCase");Debug.locals.put("clr", _clr);
 BA.debugLineNum = 469;BA.debugLine="If clr.StartsWith(\"#\") Then";
Debug.JustUpdateDeviceLine();
if (_clr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 470;BA.debugLine="Return clr.SubString(1)";
Debug.JustUpdateDeviceLine();
if (true) return _clr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));
 }else 
{ BA.debugLineNum = 471;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
Debug.JustUpdateDeviceLine();
if (_clr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 472;BA.debugLine="Return clr.SubString(4)";
Debug.JustUpdateDeviceLine();
if (true) return _clr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 4)));
 }else 
{ BA.debugLineNum = 473;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_colorsmap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_clr))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 474;BA.debugLine="Dim i As Int = Bit.And(0x00ffffff, ColorsMap.Get";
Debug.JustUpdateDeviceLine();
_i = worddocument.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_colorsmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clr))))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 475;BA.debugLine="Dim s As String = Bit.ToHexString(i)";
Debug.JustUpdateDeviceLine();
_s = worddocument.__c.getField(false,"Bit").runMethod(true,"ToHexString",(Object)(_i));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 476;BA.debugLine="Do While s.Length < 6";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_s.runMethod(true,"length"),BA.numberCast(double.class, 6))) {
 BA.debugLineNum = 477;BA.debugLine="s = \"0\" & s";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.concat(RemoteObject.createImmutable("0"),_s);Debug.locals.put("s", _s);
 }
;
 BA.debugLineNum = 479;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 }else {
 BA.debugLineNum = 481;BA.debugLine="Error(\"Invalid color value: \" & clr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.worddocument.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid color value: "),_clr)));
 BA.debugLineNum = 482;BA.debugLine="Return \"000000\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("000000");
 }}}
;
 BA.debugLineNum = 484;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsetag(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("ParseTag (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("parsetag")) { return __ref.runUserSub(false, "worddocument","parsetag", __ref, _tag);}
RemoteObject _res = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _last = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _i2 = RemoteObject.createImmutable(0);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 303;BA.debugLine="Private Sub ParseTag (tag As String) As WordTagNod";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 307;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("="))),worddocument.__c.getField(true,"False"))) { 
if (true) return __ref.runClassMethod (b4j.example.worddocument.class, "_createtagnode" /*RemoteObject*/ ,(Object)(_tag.runMethod(true,"toLowerCase")));};
 BA.debugLineNum = 308;BA.debugLine="Dim res As WordTagNode = CreateTagNode(\"\")";
Debug.JustUpdateDeviceLine();
_res = __ref.runClassMethod (b4j.example.worddocument.class, "_createtagnode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 309;BA.debugLine="res.Extra.Initialize";
Debug.JustUpdateDeviceLine();
_res.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 310;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 311;BA.debugLine="Dim last As Int = -1";
Debug.JustUpdateDeviceLine();
_last = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("last", _last);Debug.locals.put("last", _last);
 BA.debugLineNum = 312;BA.debugLine="Do While i < tag.Length";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _tag.runMethod(true,"length")))) {
 BA.debugLineNum = 313;BA.debugLine="Dim c As String = tag.CharAt(i)";
Debug.JustUpdateDeviceLine();
_c = BA.ObjectToString(_tag.runMethod(true,"charAt",(Object)(_i)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 314;BA.debugLine="If c = \"=\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString("="))) { 
 BA.debugLineNum = 315;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
Debug.JustUpdateDeviceLine();
_key = _tag.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_last,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_i)).runMethod(true,"toLowerCase");Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 316;BA.debugLine="If res.tag = \"\" Then 'option #2";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_res.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 317;BA.debugLine="res.Tag = key";
Debug.JustUpdateDeviceLine();
_res.setField ("Tag" /*RemoteObject*/ ,_key);
 };
 BA.debugLineNum = 319;BA.debugLine="Dim i2 As Int";
Debug.JustUpdateDeviceLine();
_i2 = RemoteObject.createImmutable(0);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 320;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1))),BA.ObjectToChar(worddocument.__c.getField(true,"QUOTE")))) { 
 BA.debugLineNum = 321;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
Debug.JustUpdateDeviceLine();
_i2 = _tag.runMethod(true,"indexOf",(Object)(worddocument.__c.getField(true,"QUOTE")),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1)));Debug.locals.put("i2", _i2);
 BA.debugLineNum = 322;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
Debug.JustUpdateDeviceLine();
_res.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_tag.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1)),(Object)(_i2)))));
 }else {
 BA.debugLineNum = 324;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
Debug.JustUpdateDeviceLine();
_i2 = _tag.runMethod(true,"indexOf",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1)));Debug.locals.put("i2", _i2);
 BA.debugLineNum = 325;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i2,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_i2 = _tag.runMethod(true,"length");Debug.locals.put("i2", _i2);};
 BA.debugLineNum = 326;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
Debug.JustUpdateDeviceLine();
_res.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_tag.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_i2)))));
 };
 BA.debugLineNum = 328;BA.debugLine="i = i2";
Debug.JustUpdateDeviceLine();
_i = _i2;Debug.locals.put("i", _i);
 BA.debugLineNum = 329;BA.debugLine="last = i";
Debug.JustUpdateDeviceLine();
_last = _i;Debug.locals.put("last", _last);
 };
 BA.debugLineNum = 331;BA.debugLine="If c = \" \" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString(" "))) { 
 BA.debugLineNum = 332;BA.debugLine="If res.Extra.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_res.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 333;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
Debug.JustUpdateDeviceLine();
_key = _tag.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)).runMethod(true,"toLowerCase");Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 334;BA.debugLine="res.Tag = key";
Debug.JustUpdateDeviceLine();
_res.setField ("Tag" /*RemoteObject*/ ,_key);
 };
 BA.debugLineNum = 336;BA.debugLine="last = i";
Debug.JustUpdateDeviceLine();
_last = _i;Debug.locals.put("last", _last);
 };
 BA.debugLineNum = 338;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 340;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeinvalidnodes(RemoteObject __ref,RemoteObject _nodes) throws Exception{
try {
		Debug.PushSubsStack("RemoveInvalidNodes (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("removeinvalidnodes")) { return __ref.runUserSub(false, "worddocument","removeinvalidnodes", __ref, _nodes);}
RemoteObject _paragraphindices = null;
int _i = 0;
RemoteObject _n = RemoteObject.declareNull("b4j.example.worddocument._wordtextnode");
RemoteObject _valid = RemoteObject.createImmutable(false);
RemoteObject _p = RemoteObject.createImmutable(0);
RemoteObject _t = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
Debug.locals.put("Nodes", _nodes);
 BA.debugLineNum = 283;BA.debugLine="Private Sub RemoveInvalidNodes (Nodes As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="Dim ParagraphIndices() As Int = Array As Int(1, 2";
Debug.JustUpdateDeviceLine();
_paragraphindices = RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 4)});Debug.locals.put("ParagraphIndices", _paragraphindices);Debug.locals.put("ParagraphIndices", _paragraphindices);
 BA.debugLineNum = 285;BA.debugLine="For i = Nodes.Size - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step2 = -1;
final int limit2 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_nodes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 286;BA.debugLine="Dim n As WordTextNode = Nodes.Get(i)";
Debug.JustUpdateDeviceLine();
_n = (_nodes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 287;BA.debugLine="Dim valid As Boolean";
Debug.JustUpdateDeviceLine();
_valid = RemoteObject.createImmutable(false);Debug.locals.put("valid", _valid);
 BA.debugLineNum = 288;BA.debugLine="For Each p As Int In ParagraphIndices";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _paragraphindices;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_p = group5.getArrayElement(true,RemoteObject.createImmutable(index5));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 289;BA.debugLine="If n.Tags.Size > p Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_n.getField(false,"Tags" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, _p))) { 
 BA.debugLineNum = 290;BA.debugLine="Dim t As WordTagNode = n.Tags.Get(p)";
Debug.JustUpdateDeviceLine();
_t = (_n.getField(false,"Tags" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_p)));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 291;BA.debugLine="If t.Tag = \"p\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("p"))) { 
 BA.debugLineNum = 292;BA.debugLine="valid = True";
Debug.JustUpdateDeviceLine();
_valid = worddocument.__c.getField(true,"True");Debug.locals.put("valid", _valid);
 BA.debugLineNum = 293;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 };
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 297;BA.debugLine="If valid = False Then Nodes.RemoveAt(i)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_valid,worddocument.__c.getField(true,"False"))) { 
_nodes.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveas(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _renameifneeded) throws Exception{
try {
		Debug.PushSubsStack("SaveAs (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("saveas")) { return __ref.runUserSub(false, "worddocument","saveas", __ref, _dir, _filename, _renameifneeded);}
RemoteObject _orig = RemoteObject.createImmutable("");
RemoteObject _extension = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("RenameIfNeeded", _renameifneeded);
 BA.debugLineNum = 162;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 163;BA.debugLine="If RenameIfNeeded Then";
Debug.JustUpdateDeviceLine();
if (_renameifneeded.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 164;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
Debug.JustUpdateDeviceLine();
_orig = worddocument.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_filename));Debug.locals.put("orig", _orig);Debug.locals.put("orig", _orig);
 BA.debugLineNum = 165;BA.debugLine="Dim extension As String";
Debug.JustUpdateDeviceLine();
_extension = RemoteObject.createImmutable("");Debug.locals.put("extension", _extension);
 BA.debugLineNum = 166;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
Debug.JustUpdateDeviceLine();
_i = _orig.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 167;BA.debugLine="If i >-1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 168;BA.debugLine="extension = orig.SubString(i)";
Debug.JustUpdateDeviceLine();
_extension = _orig.runMethod(true,"substring",(Object)(_i));Debug.locals.put("extension", _extension);
 BA.debugLineNum = 169;BA.debugLine="orig = orig.SubString2(0, i)";
Debug.JustUpdateDeviceLine();
_orig = _orig.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i));Debug.locals.put("orig", _orig);
 };
 BA.debugLineNum = 171;BA.debugLine="For i = 0 To 10";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = 10;
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 172;BA.debugLine="Dim f As String";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createImmutable("");Debug.locals.put("f", _f);
 BA.debugLineNum = 173;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 174;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, 0))) { 
_f = RemoteObject.concat(_orig,_extension);Debug.locals.put("f", _f);}
else {
_f = RemoteObject.concat(_orig,RemoteObject.createImmutable(" ("),_i,RemoteObject.createImmutable(")"),_extension);Debug.locals.put("f", _f);};
 BA.debugLineNum = 175;BA.debugLine="Dim out As OutputStream = File.OpenOutput(f, \"";
Debug.JustUpdateDeviceLine();
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = worddocument.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_f),(Object)(BA.ObjectToString("")),(Object)(worddocument.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 176;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xwpfdocument" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("write")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_out.getObject())})));
 BA.debugLineNum = 177;BA.debugLine="out.Close";
Debug.JustUpdateDeviceLine();
_out.runVoidMethod ("Close");
 BA.debugLineNum = 178;BA.debugLine="Return f";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _f;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 180;BA.debugLine="Log(\"Failed: \" & f)";
Debug.JustUpdateDeviceLine();
worddocument.__c.runVoidMethod ("LogImpl","95898258",RemoteObject.concat(RemoteObject.createImmutable("Failed: "),_f),0);
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 184;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.JustUpdateDeviceLine();
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = worddocument.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(worddocument.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 185;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xwpfdocument" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("write")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_out.getObject())})));
 BA.debugLineNum = 186;BA.debugLine="out.Close";
Debug.JustUpdateDeviceLine();
_out.runVoidMethod ("Close");
 BA.debugLineNum = 187;BA.debugLine="Return File.Combine(Dir, FileName)";
Debug.JustUpdateDeviceLine();
if (true) return worddocument.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stackpeek(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StackPeek (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,351);
if (RapidSub.canDelegate("stackpeek")) { return __ref.runUserSub(false, "worddocument","stackpeek", __ref);}
 BA.debugLineNum = 351;BA.debugLine="Private Sub StackPeek As WordTagNode";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 352;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_stack" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stackpop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StackPop (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("stackpop")) { return __ref.runUserSub(false, "worddocument","stackpop", __ref);}
 BA.debugLineNum = 343;BA.debugLine="Private Sub StackPop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 344;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stackpush(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("StackPush (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("stackpush")) { return __ref.runUserSub(false, "worddocument","stackpush", __ref, _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 347;BA.debugLine="Private Sub StackPush (Tag As WordTagNode)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 348;BA.debugLine="Stack.Add(Tag)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_tag)));
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _texttoruns(RemoteObject __ref,RemoteObject _paragraph,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("TextToRuns (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("texttoruns")) { return __ref.runUserSub(false, "worddocument","texttoruns", __ref, _paragraph, _text);}
RemoteObject _run = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _lasttag = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
RemoteObject _url = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _tag = RemoteObject.declareNull("b4j.example.worddocument._wordtagnode");
RemoteObject _underlinepattern = RemoteObject.createImmutable("");
RemoteObject _dir = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _b = null;
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _picturetype = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _color = RemoteObject.createImmutable("");
RemoteObject _hc = RemoteObject.createImmutable("");
Debug.locals.put("Paragraph", _paragraph);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 398;BA.debugLine="Private Sub TextToRuns (Paragraph As JavaObject, T";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 399;BA.debugLine="Dim Run As JavaObject";
Debug.JustUpdateDeviceLine();
_run = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Run", _run);
 BA.debugLineNum = 400;BA.debugLine="Dim LastTag As WordTagNode = Text.Tags.Get(Text.T";
Debug.JustUpdateDeviceLine();
_lasttag = (_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("LastTag", _lasttag);Debug.locals.put("LastTag", _lasttag);
 BA.debugLineNum = 401;BA.debugLine="If LastTag.Tag = \"url\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lasttag.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("url"))) { 
 BA.debugLineNum = 402;BA.debugLine="Dim url As String = LastTag.Extra.Get(\"url\")";
Debug.JustUpdateDeviceLine();
_url = BA.ObjectToString(_lasttag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 403;BA.debugLine="If url.StartsWith(\"bookmark://\") Then";
Debug.JustUpdateDeviceLine();
if (_url.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("bookmark://"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 404;BA.debugLine="Run = jme.RunMethod(\"CreateHyperlinkRunToAnchor";
Debug.JustUpdateDeviceLine();
_run = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jme" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("CreateHyperlinkRunToAnchor")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_paragraph.getObject()),(_url.runMethod(true,"substring",(Object)(RemoteObject.createImmutable("bookmark://").runMethod(true,"length"))))}))));Debug.locals.put("Run", _run);
 }else {
 BA.debugLineNum = 406;BA.debugLine="Run = Paragraph.RunMethod(\"createHyperlinkRun\",";
Debug.JustUpdateDeviceLine();
_run = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _paragraph.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createHyperlinkRun")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_url)}))));Debug.locals.put("Run", _run);
 };
 }else {
 BA.debugLineNum = 409;BA.debugLine="Run = Paragraph.RunMethod(\"createRun\", Null)";
Debug.JustUpdateDeviceLine();
_run = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _paragraph.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createRun")),(Object)((worddocument.__c.getField(false,"Null")))));Debug.locals.put("Run", _run);
 };
 BA.debugLineNum = 411;BA.debugLine="Run.RunMethod(\"setText\", Array(Text.Text))";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_text.getField(true,"Text" /*RemoteObject*/ ))})));
 BA.debugLineNum = 412;BA.debugLine="For i = 2 To Text.Tags.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 2 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 413;BA.debugLine="Dim tag As WordTagNode = Text.Tags.Get(i)";
Debug.JustUpdateDeviceLine();
_tag = (_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 414;BA.debugLine="Select tag.Tag";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_tag.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("b"),BA.ObjectToString("break"),BA.ObjectToString("i"),BA.ObjectToString("u"),BA.ObjectToString("img"),BA.ObjectToString("color"),BA.ObjectToString("textsize"),BA.ObjectToString("embossed"),BA.ObjectToString("shadow"),BA.ObjectToString("strike"),BA.ObjectToString("font"),BA.ObjectToString("highlight"),BA.ObjectToString("bookmark"))) {
case 0: {
 BA.debugLineNum = 416;BA.debugLine="Run.RunMethod(\"setBold\", Array(True))";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBold")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(worddocument.__c.getField(true,"True"))})));
 break; }
case 1: {
 BA.debugLineNum = 418;BA.debugLine="Run.RunMethod(\"addBreak\", Null)";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addBreak")),(Object)((worddocument.__c.getField(false,"Null"))));
 break; }
case 2: {
 BA.debugLineNum = 420;BA.debugLine="Run.RunMethod(\"setItalic\", Array(True))";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setItalic")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(worddocument.__c.getField(true,"True"))})));
 break; }
case 3: {
 BA.debugLineNum = 422;BA.debugLine="Dim UnderlinePattern As String = \"SINGLE\"";
Debug.JustUpdateDeviceLine();
_underlinepattern = BA.ObjectToString("SINGLE");Debug.locals.put("UnderlinePattern", _underlinepattern);Debug.locals.put("UnderlinePattern", _underlinepattern);
 BA.debugLineNum = 423;BA.debugLine="If tag.Extra.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 424;BA.debugLine="UnderlinePattern = tag.Extra.GetDefault(\"patt";
Debug.JustUpdateDeviceLine();
_underlinepattern = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("pattern"))),(Object)((_underlinepattern))));Debug.locals.put("UnderlinePattern", _underlinepattern);
 BA.debugLineNum = 425;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("color")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 426;BA.debugLine="Run.RunMethod(\"setUnderlineColor\", Array(Par";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setUnderlineColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.worddocument.class, "_parsecolorstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("color"))))))))})));
 };
 };
 BA.debugLineNum = 429;BA.debugLine="Run.RunMethod(\"setUnderline\", Array(UnderlineP";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setUnderline")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_underlinepattern.runMethod(true,"toUpperCase"))})));
 break; }
case 4: {
 BA.debugLineNum = 431;BA.debugLine="Dim Dir As String = tag.Extra.Get(\"dir\")";
Debug.JustUpdateDeviceLine();
_dir = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dir")))));Debug.locals.put("Dir", _dir);Debug.locals.put("Dir", _dir);
 BA.debugLineNum = 432;BA.debugLine="If Dir = \"assets\" Then Dir = File.DirAssets";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dir,BA.ObjectToString("assets"))) { 
_dir = worddocument.__c.getField(false,"File").runMethod(true,"getDirAssets");Debug.locals.put("Dir", _dir);};
 BA.debugLineNum = 433;BA.debugLine="Dim FileName As String = tag.Extra.Get(\"filena";
Debug.JustUpdateDeviceLine();
_filename = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filename")))));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 434;BA.debugLine="Dim width As Int = tag.Extra.Get(\"width\") * 12";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width"))))),RemoteObject.createImmutable(12700)}, "*",0, 0));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 435;BA.debugLine="Dim height As Int = tag.Extra.Get(\"height\") *";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height"))))),RemoteObject.createImmutable(12700)}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 436;BA.debugLine="Dim b() As Byte = File.ReadBytes(Dir, FileName";
Debug.JustUpdateDeviceLine();
_b = worddocument.__c.getField(false,"File").runMethod(false,"ReadBytes",(Object)(_dir),(Object)(_filename));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 437;BA.debugLine="Dim in As InputStream";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 438;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 BA.debugLineNum = 439;BA.debugLine="Dim PictureType As Int";
Debug.JustUpdateDeviceLine();
_picturetype = RemoteObject.createImmutable(0);Debug.locals.put("PictureType", _picturetype);
 BA.debugLineNum = 440;BA.debugLine="Dim f As String = Dir & FileName";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.concat(_dir,_filename);Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 441;BA.debugLine="If f.ToLowerCase.EndsWith(\".png\") Then Picture";
Debug.JustUpdateDeviceLine();
if (_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))).<Boolean>get().booleanValue()) { 
_picturetype = BA.numberCast(int.class, 6);Debug.locals.put("PictureType", _picturetype);}
else {
_picturetype = BA.numberCast(int.class, 5);Debug.locals.put("PictureType", _picturetype);};
 BA.debugLineNum = 442;BA.debugLine="Run.RunMethod(\"addPicture\", Array(in, PictureT";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addPicture")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_in.getObject()),(_picturetype),(_filename),(_width),(_height)})));
 break; }
case 5: {
 BA.debugLineNum = 444;BA.debugLine="Run.RunMethod(\"setColor\", Array(ParseColorStri";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.worddocument.class, "_parsecolorstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("color"))))))))})));
 break; }
case 6: {
 BA.debugLineNum = 446;BA.debugLine="Dim size As Int = tag.Extra.Get(\"textsize\")";
Debug.JustUpdateDeviceLine();
_size = BA.numberCast(int.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("textsize")))));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 447;BA.debugLine="Run.RunMethod(\"setFontSize\", Array(size))";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFontSize")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_size)})));
 break; }
case 7: {
 BA.debugLineNum = 449;BA.debugLine="Run.RunMethod(\"setEmbossed\", Array(True))";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setEmbossed")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(worddocument.__c.getField(true,"True"))})));
 break; }
case 8: {
 BA.debugLineNum = 451;BA.debugLine="Run.RunMethod(\"setShadow\", Array(True))";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setShadow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(worddocument.__c.getField(true,"True"))})));
 break; }
case 9: {
 BA.debugLineNum = 453;BA.debugLine="Run.RunMethod(\"setStrikeThrough\", Array(True))";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStrikeThrough")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(worddocument.__c.getField(true,"True"))})));
 break; }
case 10: {
 BA.debugLineNum = 455;BA.debugLine="Run.RunMethod(\"setFontFamily\", Array(tag.Extra";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFontFamily")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("font"))))})));
 break; }
case 11: {
 BA.debugLineNum = 457;BA.debugLine="Dim color As String = tag.Extra.Get(\"highlight";
Debug.JustUpdateDeviceLine();
_color = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("highlight")))));Debug.locals.put("color", _color);Debug.locals.put("color", _color);
 BA.debugLineNum = 458;BA.debugLine="Dim hc As String = HighlightColorsMap.GetDefau";
Debug.JustUpdateDeviceLine();
_hc = BA.ObjectToString(__ref.getField(false,"_highlightcolorsmap" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_color.runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("hc", _hc);Debug.locals.put("hc", _hc);
 BA.debugLineNum = 459;BA.debugLine="If hc = \"\" Then Error(\"Invalid highlight color";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hc,BA.ObjectToString(""))) { 
__ref.runClassMethod (b4j.example.worddocument.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid highlight color: "),_color)));};
 BA.debugLineNum = 460;BA.debugLine="Run.RunMethod(\"setTextHighlightColor\", Array(h";
Debug.JustUpdateDeviceLine();
_run.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTextHighlightColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_hc)})));
 break; }
case 12: {
 BA.debugLineNum = 462;BA.debugLine="jme.RunMethod(\"createBookmark\", Array(Paragrap";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jme" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("createBookmark")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_paragraph.getObject()),_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bookmark"))))})));
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _to20thspoint(RemoteObject __ref,RemoteObject _points,RemoteObject _tostring) throws Exception{
try {
		Debug.PushSubsStack("To20thsPoint (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("to20thspoint")) { return __ref.runUserSub(false, "worddocument","to20thspoint", __ref, _points, _tostring);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("Points", _points);
Debug.locals.put("ToString", _tostring);
 BA.debugLineNum = 148;BA.debugLine="Private Sub To20thsPoint(Points As Double, ToStrin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="Dim i As Int = Round(Points * 20)";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, worddocument.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_points,RemoteObject.createImmutable(20)}, "*",0, 0))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 150;BA.debugLine="If ToString Then";
Debug.JustUpdateDeviceLine();
if (_tostring.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 151;BA.debugLine="Dim s As String = i";
Debug.JustUpdateDeviceLine();
_s = BA.NumberToString(_i);Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 152;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return (_s);
 }else {
 BA.debugLineNum = 154;BA.debugLine="Return i";
Debug.JustUpdateDeviceLine();
if (true) return (_i);
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toupper(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("ToUpper (worddocument) ","worddocument",9,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("toupper")) { return __ref.runUserSub(false, "worddocument","toupper", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 142;BA.debugLine="Private Sub ToUpper(s As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="Return s.ToUpperCase";
Debug.JustUpdateDeviceLine();
if (true) return _s.runMethod(true,"toUpperCase");
 BA.debugLineNum = 144;BA.debugLine="End Sub";
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