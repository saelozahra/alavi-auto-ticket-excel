package b4j.example;

import anywheresoftware.b4a.debug.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import org.apache.poi.xwpf.usermodel.*;
import java.math.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class worddocument extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.worddocument", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.worddocument.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _wordtagnode{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public boolean CanHaveNestedTags;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
CanHaveNestedTags = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _wordtextnode{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.List Tags;
public void Initialize() {
IsInitialized = true;
Text = "";
Tags = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _worddocelement{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public anywheresoftware.b4a.objects.collections.List Children;
public anywheresoftware.b4j.object.JavaObject JElement;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
Children = new anywheresoftware.b4a.objects.collections.List();
JElement = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _xwpfdocument = null;
public b4j.example.wordutils _mwu = null;
public b4j.example.b4xset _allowedtags = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public int _start = 0;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstring = null;
public anywheresoftware.b4a.objects.collections.Map _colorsmap = null;
public anywheresoftware.b4a.objects.collections.Map _highlightcolorsmap = null;
public boolean _debuglog = false;
public anywheresoftware.b4j.object.JavaObject _jme = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.worddocument  _append(b4j.example.worddocument __ref,String _bbtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4j.example.worddocument) Debug.delegate(ba, "append", new Object[] {_bbtext}));}
b4j.example.worddocument._worddocelement _doc = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub Append(BBText As String) As WordDocumen";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim doc As WordDocElement = Parse(BBText)";
_doc = __ref._parse /*b4j.example.worddocument._worddocelement*/ (null,_bbtext);
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="HandleElements(doc)";
__ref._handleelements /*String*/ (null,_doc);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Return Me";
if (true) return (b4j.example.worddocument)(this);
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
return null;
}
public b4j.example.worddocument._worddocelement  _parse(b4j.example.worddocument __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((b4j.example.worddocument._worddocelement) Debug.delegate(ba, "parse", new Object[] {_text}));}
anywheresoftware.b4a.objects.collections.List _parsedelements = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
int _lastmatchend = 0;
boolean _skipuntilendtag = false;
String _tag = "";
boolean _closedtag = false;
b4j.example.worddocument._wordtagnode _t = null;
b4j.example.worddocument._wordtagnode _n = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub Parse (Text As String) As WordDocEleme";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Stack.Initialize";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createtagnode /*b4j.example.worddocument._wordtagnode*/ (null,"noop")));
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="Text = Text.Replace(CRLF, \"[break/]\")";
_text = _text.replace(__c.CRLF,"[break/]");
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_text);
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="Start = matcher.GetStart(0)";
__ref._start /*int*/  = _matcher.GetStart((int) (0));
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (__ref._start /*int*/ >_lastmatchend && _skipuntilendtag==__c.False) { 
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStrin";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.example.worddocument._wordtextnode*/ (null,_text.substring(_lastmatchend,__ref._start /*int*/ ))));
 };
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
RDebugUtils.currentLine=5963793;
 //BA.debugLineNum = 5963793;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
RDebugUtils.currentLine=5963794;
 //BA.debugLineNum = 5963794;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((__ref._stackpeek /*b4j.example.worddocument._wordtagnode*/ (null).Tag /*String*/ ).equals(_tag) == false) { 
RDebugUtils.currentLine=5963795;
 //BA.debugLineNum = 5963795;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (__ref._stackpeek /*b4j.example.worddocument._wordtagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=5963796;
 //BA.debugLineNum = 5963796;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=5963798;
 //BA.debugLineNum = 5963798;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
__ref._error /*String*/ (null,"Closing tag does not match: "+_tag);
RDebugUtils.currentLine=5963799;
 //BA.debugLineNum = 5963799;BA.debugLine="Return Null";
if (true) return (b4j.example.worddocument._worddocelement)(__c.Null);
 };
RDebugUtils.currentLine=5963801;
 //BA.debugLineNum = 5963801;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
RDebugUtils.currentLine=5963802;
 //BA.debugLineNum = 5963802;BA.debugLine="If Start > LastMatchEnd Then";
if (__ref._start /*int*/ >_lastmatchend) { 
RDebugUtils.currentLine=5963803;
 //BA.debugLineNum = 5963803;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStr";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.example.worddocument._wordtextnode*/ (null,_text.substring(_lastmatchend,__ref._start /*int*/ ))));
 };
 };
RDebugUtils.currentLine=5963806;
 //BA.debugLineNum = 5963806;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
RDebugUtils.currentLine=5963807;
 //BA.debugLineNum = 5963807;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
RDebugUtils.currentLine=5963809;
 //BA.debugLineNum = 5963809;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (__ref._stackpeek /*b4j.example.worddocument._wordtagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=5963810;
 //BA.debugLineNum = 5963810;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
RDebugUtils.currentLine=5963811;
 //BA.debugLineNum = 5963811;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
RDebugUtils.currentLine=5963812;
 //BA.debugLineNum = 5963812;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
RDebugUtils.currentLine=5963813;
 //BA.debugLineNum = 5963813;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else 
{RDebugUtils.currentLine=5963814;
 //BA.debugLineNum = 5963814;BA.debugLine="Else If tag = \"*\" Then";
if ((_tag).equals("*")) { 
RDebugUtils.currentLine=5963815;
 //BA.debugLineNum = 5963815;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 }}
;
RDebugUtils.currentLine=5963817;
 //BA.debugLineNum = 5963817;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
RDebugUtils.currentLine=5963818;
 //BA.debugLineNum = 5963818;BA.debugLine="Dim t As WordTagNode = ParseTag(tag)";
_t = __ref._parsetag /*b4j.example.worddocument._wordtagnode*/ (null,_tag);
RDebugUtils.currentLine=5963819;
 //BA.debugLineNum = 5963819;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (__ref._allowedtags /*b4j.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_t.Tag /*String*/ ))==__c.False) { 
RDebugUtils.currentLine=5963820;
 //BA.debugLineNum = 5963820;BA.debugLine="Error(\"Invalid tag: \" & tag)";
__ref._error /*String*/ (null,"Invalid tag: "+_tag);
RDebugUtils.currentLine=5963821;
 //BA.debugLineNum = 5963821;BA.debugLine="Return Null";
if (true) return (b4j.example.worddocument._worddocelement)(__c.Null);
 };
RDebugUtils.currentLine=5963823;
 //BA.debugLineNum = 5963823;BA.debugLine="StackPush(t)";
__ref._stackpush /*String*/ (null,_t);
RDebugUtils.currentLine=5963824;
 //BA.debugLineNum = 5963824;BA.debugLine="If t.Tag = \"plain\" Or t.Tag = \"url\" Then";
if ((_t.Tag /*String*/ ).equals("plain") || (_t.Tag /*String*/ ).equals("url")) { 
RDebugUtils.currentLine=5963825;
 //BA.debugLineNum = 5963825;BA.debugLine="Dim n As WordTagNode = StackPeek";
_n = __ref._stackpeek /*b4j.example.worddocument._wordtagnode*/ (null);
RDebugUtils.currentLine=5963826;
 //BA.debugLineNum = 5963826;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
RDebugUtils.currentLine=5963827;
 //BA.debugLineNum = 5963827;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
RDebugUtils.currentLine=5963829;
 //BA.debugLineNum = 5963829;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
RDebugUtils.currentLine=5963830;
 //BA.debugLineNum = 5963830;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.example.worddocument._wordtextnode*/ (null,"")));
RDebugUtils.currentLine=5963831;
 //BA.debugLineNum = 5963831;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
 };
 };
RDebugUtils.currentLine=5963834;
 //BA.debugLineNum = 5963834;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=5963836;
 //BA.debugLineNum = 5963836;BA.debugLine="If Text.Length > LastMatchEnd Then";
if (_text.length()>_lastmatchend) { 
RDebugUtils.currentLine=5963837;
 //BA.debugLineNum = 5963837;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubString";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.example.worddocument._wordtextnode*/ (null,_text.substring(_lastmatchend,_text.length()))));
 };
RDebugUtils.currentLine=5963839;
 //BA.debugLineNum = 5963839;BA.debugLine="Return OrganizeElements( ParsedElements)";
if (true) return __ref._organizeelements /*b4j.example.worddocument._worddocelement*/ (null,_parsedelements);
RDebugUtils.currentLine=5963840;
 //BA.debugLineNum = 5963840;BA.debugLine="End Sub";
return null;
}
public String  _handleelements(b4j.example.worddocument __ref,b4j.example.worddocument._worddocelement _parent) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "handleelements", true))
	 {return ((String) Debug.delegate(ba, "handleelements", new Object[] {_parent}));}
int _index = 0;
b4j.example.worddocument._worddocelement _child = null;
anywheresoftware.b4j.object.JavaObject _par = null;
anywheresoftware.b4a.objects.collections.List _paragraphs = null;
anywheresoftware.b4j.object.JavaObject _j = null;
b4j.example.worddocument._wordtextnode _node = null;
int _rows = 0;
int _cols = 0;
String _alignment = "";
anywheresoftware.b4a.objects.collections.Map _fixedmap = null;
String _rh = "";
int _celloffset = 0;
int _colspan = 0;
int _rowspan = 0;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub HandleElements(Parent As WordDocElemen";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="For index = 0 To Parent.Children.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_parent.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim child As WordDocElement = Parent.Children.Ge";
_child = (b4j.example.worddocument._worddocelement)(_parent.Children /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="If DebugLog Then";
if (__ref._debuglog /*boolean*/ ) { 
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Log(\"Tag: \" & child.Tag)";
__c.LogImpl("95701636","Tag: "+_child.Tag /*String*/ ,0);
 };
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Select child.Tag";
switch (BA.switchObjectToInt(_child.Tag /*String*/ ,"p","header","footer","table","row","cell")) {
case 0: {
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="Dim par As JavaObject";
_par = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="Select Parent.Tag";
switch (BA.switchObjectToInt(_parent.Tag /*String*/ ,"doc","header","footer","cell")) {
case 0: {
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="par = XWPFDocument.RunMethod(\"createParagrap";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createParagraph",(Object[])(__c.Null))));
 break; }
case 1: 
case 2: {
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="par = Parent.JElement.RunMethod(\"createParag";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createParagraph",(Object[])(__c.Null))));
 break; }
case 3: {
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="If index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=5701648;
 //BA.debugLineNum = 5701648;BA.debugLine="Dim paragraphs As List";
_paragraphs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5701649;
 //BA.debugLineNum = 5701649;BA.debugLine="paragraphs.Initialize";
_paragraphs.Initialize();
RDebugUtils.currentLine=5701650;
 //BA.debugLineNum = 5701650;BA.debugLine="Dim j As JavaObject = paragraphs";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraphs.getObject()));
RDebugUtils.currentLine=5701651;
 //BA.debugLineNum = 5701651;BA.debugLine="j.RunMethod(\"addAll\", Array(Parent.JElement";
_j.RunMethod("addAll",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getParagraphs",(Object[])(__c.Null)).getObject())});
RDebugUtils.currentLine=5701652;
 //BA.debugLineNum = 5701652;BA.debugLine="If paragraphs.Size > 0 Then";
if (_paragraphs.getSize()>0) { 
RDebugUtils.currentLine=5701653;
 //BA.debugLineNum = 5701653;BA.debugLine="par = paragraphs.Get(0)";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraphs.Get((int) (0))));
 };
 };
RDebugUtils.currentLine=5701656;
 //BA.debugLineNum = 5701656;BA.debugLine="If par.IsInitialized = False Then";
if (_par.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=5701657;
 //BA.debugLineNum = 5701657;BA.debugLine="par = Parent.JElement.RunMethod(\"addParagra";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addParagraph",(Object[])(__c.Null))));
 };
 break; }
}
;
RDebugUtils.currentLine=5701660;
 //BA.debugLineNum = 5701660;BA.debugLine="ConfigureParagraph(par, child)";
__ref._configureparagraph /*String*/ (null,_par,_child);
RDebugUtils.currentLine=5701661;
 //BA.debugLineNum = 5701661;BA.debugLine="For Each node As WordTextNode In child.Childre";
{
final anywheresoftware.b4a.BA.IterableList group29 = _child.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_node = (b4j.example.worddocument._wordtextnode)(group29.Get(index29));
RDebugUtils.currentLine=5701662;
 //BA.debugLineNum = 5701662;BA.debugLine="TextToRuns(par, node)";
__ref._texttoruns /*String*/ (null,_par,_node);
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=5701665;
 //BA.debugLineNum = 5701665;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createHeader",new Object[]{(Object)("DEFAULT")})));
RDebugUtils.currentLine=5701666;
 //BA.debugLineNum = 5701666;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 2: {
RDebugUtils.currentLine=5701668;
 //BA.debugLineNum = 5701668;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createFooter",new Object[]{(Object)("DEFAULT")})));
RDebugUtils.currentLine=5701669;
 //BA.debugLineNum = 5701669;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 3: {
RDebugUtils.currentLine=5701671;
 //BA.debugLineNum = 5701671;BA.debugLine="Dim rows As Int = child.Extra.Get(\"rows\")";
_rows = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("rows"))));
RDebugUtils.currentLine=5701672;
 //BA.debugLineNum = 5701672;BA.debugLine="Dim cols As Int = child.Extra.Get(\"cols\")";
_cols = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("cols"))));
RDebugUtils.currentLine=5701673;
 //BA.debugLineNum = 5701673;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createTable",new Object[]{(Object)(_rows),(Object)(_cols)})));
RDebugUtils.currentLine=5701674;
 //BA.debugLineNum = 5701674;BA.debugLine="If child.Extra.ContainsKey(\"alignment\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("alignment"))) { 
RDebugUtils.currentLine=5701675;
 //BA.debugLineNum = 5701675;BA.debugLine="Dim alignment As String = ToUpper(child.Extra";
_alignment = __ref._toupper /*String*/ (null,BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment"))));
RDebugUtils.currentLine=5701677;
 //BA.debugLineNum = 5701677;BA.debugLine="Dim fixedMap As Map = CreateMap(\"LEFT\": \"RIGH";
_fixedmap = new anywheresoftware.b4a.objects.collections.Map();
_fixedmap = __c.createMap(new Object[] {(Object)("LEFT"),(Object)("RIGHT"),(Object)("CENTER"),(Object)("LEFT"),(Object)("RIGHT"),(Object)("CENTER")});
RDebugUtils.currentLine=5701678;
 //BA.debugLineNum = 5701678;BA.debugLine="child.JElement.RunMethod(\"setTableAlignment\",";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setTableAlignment",new Object[]{_fixedmap.Get((Object)(_alignment))});
 };
RDebugUtils.currentLine=5701680;
 //BA.debugLineNum = 5701680;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 4: {
RDebugUtils.currentLine=5701682;
 //BA.debugLineNum = 5701682;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getRow",new Object[]{(Object)(_index)})));
RDebugUtils.currentLine=5701683;
 //BA.debugLineNum = 5701683;BA.debugLine="If child.Extra.ContainsKey(\"height\") Then chil";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHeight",new Object[]{__ref._to20thspoint /*Object*/ (null,(double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))),__c.False)});};
RDebugUtils.currentLine=5701684;
 //BA.debugLineNum = 5701684;BA.debugLine="If child.Extra.ContainsKey(\"repeatheader\") The";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("repeatheader"))) { 
RDebugUtils.currentLine=5701685;
 //BA.debugLineNum = 5701685;BA.debugLine="Dim rh As String = child.Extra.Get(\"repeathea";
_rh = BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("repeatheader")));
RDebugUtils.currentLine=5701686;
 //BA.debugLineNum = 5701686;BA.debugLine="child.JElement.RunMethod(\"setRepeatHeader\", A";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setRepeatHeader",new Object[]{(Object)((_rh.toLowerCase()).equals("true"))});
 };
RDebugUtils.currentLine=5701688;
 //BA.debugLineNum = 5701688;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 5: {
RDebugUtils.currentLine=5701690;
 //BA.debugLineNum = 5701690;BA.debugLine="Dim CellOffset As Int = index + child.Extra.Ge";
_celloffset = (int) (_index+(double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("offset"),(Object)(0)))));
RDebugUtils.currentLine=5701691;
 //BA.debugLineNum = 5701691;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getCell",new Object[]{(Object)(_celloffset)})));
RDebugUtils.currentLine=5701692;
 //BA.debugLineNum = 5701692;BA.debugLine="If child.Extra.ContainsKey(\"color\") Then child";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColor",new Object[]{(Object)(__ref._parsecolorstring /*String*/ (null,BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});};
RDebugUtils.currentLine=5701693;
 //BA.debugLineNum = 5701693;BA.debugLine="If child.Extra.ContainsKey(\"verticalalignment\"";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("verticalalignment"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setVerticalAlignment",new Object[]{(Object)(__ref._toupper /*String*/ (null,BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("verticalalignment")))))});};
RDebugUtils.currentLine=5701694;
 //BA.debugLineNum = 5701694;BA.debugLine="If child.Extra.ContainsKey(\"width\") Then child";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setWidth",new Object[]{__ref._to20thspoint /*Object*/ (null,(double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width")))),__c.True)});};
RDebugUtils.currentLine=5701695;
 //BA.debugLineNum = 5701695;BA.debugLine="If child.Extra.ContainsKey(\"colspan\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("colspan"))) { 
RDebugUtils.currentLine=5701696;
 //BA.debugLineNum = 5701696;BA.debugLine="Dim ColSpan As Int = child.Extra.Get(\"colspan";
_colspan = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("colspan"))));
RDebugUtils.currentLine=5701697;
 //BA.debugLineNum = 5701697;BA.debugLine="jme.RunMethod(\"MergeCellsHorizontal\", Array(P";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("MergeCellsHorizontal",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_index),(Object)(_index+_colspan-1)});
 };
RDebugUtils.currentLine=5701699;
 //BA.debugLineNum = 5701699;BA.debugLine="If child.Extra.ContainsKey(\"rowspan\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("rowspan"))) { 
RDebugUtils.currentLine=5701700;
 //BA.debugLineNum = 5701700;BA.debugLine="Dim RowSpan As Int = child.Extra.Get(\"rowspan";
_rowspan = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("rowspan"))));
RDebugUtils.currentLine=5701701;
 //BA.debugLineNum = 5701701;BA.debugLine="jme.RunMethod(\"MergeCellsVertical\", Array(Par";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("MergeCellsVertical",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_index),(Object)(_rowspan)});
 };
RDebugUtils.currentLine=5701703;
 //BA.debugLineNum = 5701703;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
}
;
 }
};
RDebugUtils.currentLine=5701706;
 //BA.debugLineNum = 5701706;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.worddocument __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Public XWPFDocument As JavaObject";
_xwpfdocument = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Private mWU As WordUtils 'ignore";
_mwu = new b4j.example.wordutils();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Private AllowedTags As B4XSet";
_allowedtags = new b4j.example.b4xset();
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Private Stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Private Start As Int";
_start = 0;
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Public ErrorString As StringBuilder";
_errorstring = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="Type WordTagNode (Tag As String, Extra As Map, Ca";
;
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Type WordTextNode (Text As String, Tags As List)";
;
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Type WordDocElement(Tag As String, Extra As Map,";
;
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="Private ColorsMap As Map";
_colorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="Private HighlightColorsMap As Map";
_highlightcolorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="Public DebugLog As Boolean";
_debuglog = false;
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="Private jme As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="End Sub";
return "";
}
public String  _configureparagraph(b4j.example.worddocument __ref,anywheresoftware.b4j.object.JavaObject _paragraph,b4j.example.worddocument._worddocelement _element) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "configureparagraph", true))
	 {return ((String) Debug.delegate(ba, "configureparagraph", new Object[] {_paragraph,_element}));}
anywheresoftware.b4a.objects.collections.Map _props = null;
String _alignment = "";
int _indentationleft = 0;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub ConfigureParagraph (Paragraph As JavaO";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim props As Map = Element.Extra";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = _element.Extra /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim Alignment As String = props.GetDefault(\"align";
_alignment = BA.ObjectToString(_props.GetDefault((Object)("alignment"),(Object)("START")));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Paragraph.RunMethod(\"setAlignment\", Array(Alignme";
_paragraph.RunMethod("setAlignment",new Object[]{(Object)(_alignment.toUpperCase())});
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim indentationLeft As Int = props.GetDefault(\"in";
_indentationleft = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("indentationleft"),(Object)(0))));
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="If GetBoolean(props.GetDefault(\"pagebreak\", False";
if (__ref._getboolean /*boolean*/ (null,BA.ObjectToString(_props.GetDefault((Object)("pagebreak"),(Object)(__c.False))))==__c.True) { 
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Paragraph.RunMethod(\"setPageBreak\", Array(True))";
_paragraph.RunMethod("setPageBreak",new Object[]{(Object)(__c.True)});
 };
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="If indentationLeft <> 0 Then Paragraph.RunMethod(";
if (_indentationleft!=0) { 
_paragraph.RunMethod("setIndentationLeft",new Object[]{(Object)(_indentationleft*20)});};
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="End Sub";
return "";
}
public boolean  _getboolean(b4j.example.worddocument __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "getboolean", true))
	 {return ((Boolean) Debug.delegate(ba, "getboolean", new Object[] {_s}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub GetBoolean(s As String) As Boolean";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Return s.ToLowerCase = \"true\"";
if (true) return (_s.toLowerCase()).equals("true");
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return false;
}
public b4j.example.worddocument._wordtagnode  _createtagnode(b4j.example.worddocument __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "createtagnode", true))
	 {return ((b4j.example.worddocument._wordtagnode) Debug.delegate(ba, "createtagnode", new Object[] {_tag}));}
b4j.example.worddocument._wordtagnode _n = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub CreateTagNode (Tag As String) As WordT";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim n As WordTagNode";
_n = new b4j.example.worddocument._wordtagnode();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="End Sub";
return null;
}
public b4j.example.worddocument._wordtextnode  _createtextnode(b4j.example.worddocument __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "createtextnode", true))
	 {return ((b4j.example.worddocument._wordtextnode) Debug.delegate(ba, "createtextnode", new Object[] {_text}));}
b4j.example.worddocument._wordtextnode _n = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub CreateTextNode(Text As String) As Word";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim n As WordTextNode";
_n = new b4j.example.worddocument._wordtextnode();
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="End Sub";
return null;
}
public b4j.example.worddocument._worddocelement  _createworddocelement(b4j.example.worddocument __ref,String _tag,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "createworddocelement", true))
	 {return ((b4j.example.worddocument._worddocelement) Debug.delegate(ba, "createworddocelement", new Object[] {_tag,_extra}));}
b4j.example.worddocument._worddocelement _t1 = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub CreateWordDocElement (Tag As String, E";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim t1 As WordDocElement";
_t1 = new b4j.example.worddocument._worddocelement();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="t1.Tag = Tag";
_t1.Tag /*String*/  = _tag;
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="If Extra.IsInitialized = False Then Extra.Initial";
if (_extra.IsInitialized()==__c.False) { 
_extra.Initialize();};
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="t1.Extra = Extra";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = _extra;
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="t1.Children.Initialize";
_t1.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="End Sub";
return null;
}
public String  _error(b4j.example.worddocument __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "error", true))
	 {return ((String) Debug.delegate(ba, "error", new Object[] {_msg}));}
String _s = "";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub Error (msg As String)";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(__ref._start /*int*/ ))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="LogError(s)";
__c.LogError(_s);
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_s).Append(__c.CRLF);
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="End Sub";
return "";
}
public String  _texttoruns(b4j.example.worddocument __ref,anywheresoftware.b4j.object.JavaObject _paragraph,b4j.example.worddocument._wordtextnode _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "texttoruns", true))
	 {return ((String) Debug.delegate(ba, "texttoruns", new Object[] {_paragraph,_text}));}
anywheresoftware.b4j.object.JavaObject _run = null;
b4j.example.worddocument._wordtagnode _lasttag = null;
String _url = "";
int _i = 0;
b4j.example.worddocument._wordtagnode _tag = null;
String _underlinepattern = "";
String _dir = "";
String _filename = "";
int _width = 0;
int _height = 0;
byte[] _b = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
int _picturetype = 0;
String _f = "";
int _size = 0;
String _color = "";
String _hc = "";
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub TextToRuns (Paragraph As JavaObject, T";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim Run As JavaObject";
_run = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim LastTag As WordTagNode = Text.Tags.Get(Text.T";
_lasttag = (b4j.example.worddocument._wordtagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="If LastTag.Tag = \"url\" Then";
if ((_lasttag.Tag /*String*/ ).equals("url")) { 
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim url As String = LastTag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_lasttag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="If url.StartsWith(\"bookmark://\") Then";
if (_url.startsWith("bookmark://")) { 
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Run = jme.RunMethod(\"CreateHyperlinkRunToAnchor";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("CreateHyperlinkRunToAnchor",new Object[]{(Object)(_paragraph.getObject()),(Object)(_url.substring("bookmark://".length()))})));
 }else {
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Run = Paragraph.RunMethod(\"createHyperlinkRun\",";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraph.RunMethod("createHyperlinkRun",new Object[]{(Object)(_url)})));
 };
 }else {
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="Run = Paragraph.RunMethod(\"createRun\", Null)";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraph.RunMethod("createRun",(Object[])(__c.Null))));
 };
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="Run.RunMethod(\"setText\", Array(Text.Text))";
_run.RunMethod("setText",new Object[]{(Object)(_text.Text /*String*/ )});
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="For i = 2 To Text.Tags.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (2) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="Dim tag As WordTagNode = Text.Tags.Get(i)";
_tag = (b4j.example.worddocument._wordtagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"b","break","i","u","img","color","textsize","embossed","shadow","strike","font","highlight","bookmark")) {
case 0: {
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="Run.RunMethod(\"setBold\", Array(True))";
_run.RunMethod("setBold",new Object[]{(Object)(__c.True)});
 break; }
case 1: {
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="Run.RunMethod(\"addBreak\", Null)";
_run.RunMethod("addBreak",(Object[])(__c.Null));
 break; }
case 2: {
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="Run.RunMethod(\"setItalic\", Array(True))";
_run.RunMethod("setItalic",new Object[]{(Object)(__c.True)});
 break; }
case 3: {
RDebugUtils.currentLine=6750232;
 //BA.debugLineNum = 6750232;BA.debugLine="Dim UnderlinePattern As String = \"SINGLE\"";
_underlinepattern = "SINGLE";
RDebugUtils.currentLine=6750233;
 //BA.debugLineNum = 6750233;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=6750234;
 //BA.debugLineNum = 6750234;BA.debugLine="UnderlinePattern = tag.Extra.GetDefault(\"patt";
_underlinepattern = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("pattern"),(Object)(_underlinepattern)));
RDebugUtils.currentLine=6750235;
 //BA.debugLineNum = 6750235;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="Run.RunMethod(\"setUnderlineColor\", Array(Par";
_run.RunMethod("setUnderlineColor",new Object[]{(Object)(__ref._parsecolorstring /*String*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});
 };
 };
RDebugUtils.currentLine=6750239;
 //BA.debugLineNum = 6750239;BA.debugLine="Run.RunMethod(\"setUnderline\", Array(UnderlineP";
_run.RunMethod("setUnderline",new Object[]{(Object)(_underlinepattern.toUpperCase())});
 break; }
case 4: {
RDebugUtils.currentLine=6750241;
 //BA.debugLineNum = 6750241;BA.debugLine="Dim Dir As String = tag.Extra.Get(\"dir\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("dir")));
RDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="If Dir = \"assets\" Then Dir = File.DirAssets";
if ((_dir).equals("assets")) { 
_dir = __c.File.getDirAssets();};
RDebugUtils.currentLine=6750243;
 //BA.debugLineNum = 6750243;BA.debugLine="Dim FileName As String = tag.Extra.Get(\"filena";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("filename")));
RDebugUtils.currentLine=6750244;
 //BA.debugLineNum = 6750244;BA.debugLine="Dim width As Int = tag.Extra.Get(\"width\") * 12";
_width = (int) ((double)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width"))))*12700);
RDebugUtils.currentLine=6750245;
 //BA.debugLineNum = 6750245;BA.debugLine="Dim height As Int = tag.Extra.Get(\"height\") *";
_height = (int) ((double)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height"))))*12700);
RDebugUtils.currentLine=6750246;
 //BA.debugLineNum = 6750246;BA.debugLine="Dim b() As Byte = File.ReadBytes(Dir, FileName";
_b = __c.File.ReadBytes(_dir,_filename);
RDebugUtils.currentLine=6750247;
 //BA.debugLineNum = 6750247;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=6750248;
 //BA.debugLineNum = 6750248;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
RDebugUtils.currentLine=6750249;
 //BA.debugLineNum = 6750249;BA.debugLine="Dim PictureType As Int";
_picturetype = 0;
RDebugUtils.currentLine=6750250;
 //BA.debugLineNum = 6750250;BA.debugLine="Dim f As String = Dir & FileName";
_f = _dir+_filename;
RDebugUtils.currentLine=6750251;
 //BA.debugLineNum = 6750251;BA.debugLine="If f.ToLowerCase.EndsWith(\".png\") Then Picture";
if (_f.toLowerCase().endsWith(".png")) { 
_picturetype = (int) (6);}
else {
_picturetype = (int) (5);};
RDebugUtils.currentLine=6750252;
 //BA.debugLineNum = 6750252;BA.debugLine="Run.RunMethod(\"addPicture\", Array(in, PictureT";
_run.RunMethod("addPicture",new Object[]{(Object)(_in.getObject()),(Object)(_picturetype),(Object)(_filename),(Object)(_width),(Object)(_height)});
 break; }
case 5: {
RDebugUtils.currentLine=6750254;
 //BA.debugLineNum = 6750254;BA.debugLine="Run.RunMethod(\"setColor\", Array(ParseColorStri";
_run.RunMethod("setColor",new Object[]{(Object)(__ref._parsecolorstring /*String*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});
 break; }
case 6: {
RDebugUtils.currentLine=6750256;
 //BA.debugLineNum = 6750256;BA.debugLine="Dim size As Int = tag.Extra.Get(\"textsize\")";
_size = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
RDebugUtils.currentLine=6750257;
 //BA.debugLineNum = 6750257;BA.debugLine="Run.RunMethod(\"setFontSize\", Array(size))";
_run.RunMethod("setFontSize",new Object[]{(Object)(_size)});
 break; }
case 7: {
RDebugUtils.currentLine=6750259;
 //BA.debugLineNum = 6750259;BA.debugLine="Run.RunMethod(\"setEmbossed\", Array(True))";
_run.RunMethod("setEmbossed",new Object[]{(Object)(__c.True)});
 break; }
case 8: {
RDebugUtils.currentLine=6750261;
 //BA.debugLineNum = 6750261;BA.debugLine="Run.RunMethod(\"setShadow\", Array(True))";
_run.RunMethod("setShadow",new Object[]{(Object)(__c.True)});
 break; }
case 9: {
RDebugUtils.currentLine=6750263;
 //BA.debugLineNum = 6750263;BA.debugLine="Run.RunMethod(\"setStrikeThrough\", Array(True))";
_run.RunMethod("setStrikeThrough",new Object[]{(Object)(__c.True)});
 break; }
case 10: {
RDebugUtils.currentLine=6750265;
 //BA.debugLineNum = 6750265;BA.debugLine="Run.RunMethod(\"setFontFamily\", Array(tag.Extra";
_run.RunMethod("setFontFamily",new Object[]{_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("font"))});
 break; }
case 11: {
RDebugUtils.currentLine=6750267;
 //BA.debugLineNum = 6750267;BA.debugLine="Dim color As String = tag.Extra.Get(\"highlight";
_color = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("highlight")));
RDebugUtils.currentLine=6750268;
 //BA.debugLineNum = 6750268;BA.debugLine="Dim hc As String = HighlightColorsMap.GetDefau";
_hc = BA.ObjectToString(__ref._highlightcolorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_color.toLowerCase()),(Object)("")));
RDebugUtils.currentLine=6750269;
 //BA.debugLineNum = 6750269;BA.debugLine="If hc = \"\" Then Error(\"Invalid highlight color";
if ((_hc).equals("")) { 
__ref._error /*String*/ (null,"Invalid highlight color: "+_color);};
RDebugUtils.currentLine=6750270;
 //BA.debugLineNum = 6750270;BA.debugLine="Run.RunMethod(\"setTextHighlightColor\", Array(h";
_run.RunMethod("setTextHighlightColor",new Object[]{(Object)(_hc)});
 break; }
case 12: {
RDebugUtils.currentLine=6750272;
 //BA.debugLineNum = 6750272;BA.debugLine="jme.RunMethod(\"createBookmark\", Array(Paragrap";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createBookmark",new Object[]{(Object)(_paragraph.getObject()),_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("bookmark"))});
 break; }
}
;
 }
};
RDebugUtils.currentLine=6750275;
 //BA.debugLineNum = 6750275;BA.debugLine="End Sub";
return "";
}
public String  _toupper(b4j.example.worddocument __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "toupper", true))
	 {return ((String) Debug.delegate(ba, "toupper", new Object[] {_s}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub ToUpper(s As String) As String";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Return s.ToUpperCase";
if (true) return _s.toUpperCase();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public Object  _to20thspoint(b4j.example.worddocument __ref,double _points,boolean _tostring) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "to20thspoint", true))
	 {return ((Object) Debug.delegate(ba, "to20thspoint", new Object[] {_points,_tostring}));}
int _i = 0;
String _s = "";
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub To20thsPoint(Points As Double, ToStrin";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim i As Int = Round(Points * 20)";
_i = (int) (__c.Round(_points*20));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="If ToString Then";
if (_tostring) { 
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="Dim s As String = i";
_s = BA.NumberToString(_i);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="Return s";
if (true) return (Object)(_s);
 }else {
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="Return i";
if (true) return (Object)(_i);
 };
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="End Sub";
return null;
}
public String  _parsecolorstring(b4j.example.worddocument __ref,String _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "parsecolorstring", true))
	 {return ((String) Debug.delegate(ba, "parsecolorstring", new Object[] {_clr}));}
int _i = 0;
String _s = "";
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub ParseColorString(clr As String) As Str";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Return clr.SubString(1)";
if (true) return _clr.substring((int) (1));
 }else 
{RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
if (_clr.startsWith("0x")) { 
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="Return clr.SubString(4)";
if (true) return _clr.substring((int) (4));
 }else 
{RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
if (__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="Dim i As Int = Bit.And(0x00ffffff, ColorsMap.Get";
_i = __c.Bit.And(((int)0x00ffffff),(int)(BA.ObjectToNumber(__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr)))));
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Dim s As String = Bit.ToHexString(i)";
_s = __c.Bit.ToHexString(_i);
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="Do While s.Length < 6";
while (_s.length()<6) {
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="s = \"0\" & s";
_s = "0"+_s;
 }
;
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="Return s";
if (true) return _s;
 }else {
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="Error(\"Invalid color value: \" & clr)";
__ref._error /*String*/ (null,"Invalid color value: "+_clr);
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="Return \"000000\"";
if (true) return "000000";
 }}}
;
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.worddocument __ref,anywheresoftware.b4a.BA _ba,b4j.example.wordutils _wu,anywheresoftware.b4j.object.JavaObject _document) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_wu,_document}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub Initialize (wu As WordUtils, Document A";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="mWU = wu";
__ref._mwu /*b4j.example.wordutils*/  = _wu;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="XWPFDocument = Document";
__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/  = _document;
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"p\"";
__ref._allowedtags /*b4j.example.b4xset*/  = _b4xcollections._createset2 /*b4j.example.b4xset*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("p"),(Object)("b"),(Object)("u"),(Object)("embossed"),(Object)("shadow"),(Object)("plain"),(Object)("color"),(Object)("font"),(Object)("textsize"),(Object)("break"),(Object)("i"),(Object)("strike"),(Object)("img"),(Object)("indentationleft"),(Object)("header"),(Object)("footer"),(Object)("table"),(Object)("row"),(Object)("cell"),(Object)("highlight"),(Object)("url"),(Object)("bookmark")}));
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="ColorsMap = CreateMap(\"black\": 0xFF000000, _ 		\"d";
__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)(((int)0xff000000)),(Object)("darkgray"),(Object)(((int)0xff444444)),(Object)("gray"),(Object)(((int)0xffcccccc)),(Object)("white"),(Object)(((int)0xffffffff)),(Object)("red"),(Object)(((int)0xffff0000)),(Object)("green"),(Object)(((int)0xff00ff00)),(Object)("blue"),(Object)(((int)0xff0000ff)),(Object)("yellow"),(Object)(((int)0xffffff00)),(Object)("cyan"),(Object)(((int)0xff00ffff)),(Object)("darkblue"),(Object)(((int)0xff000080)),(Object)("darkcyan"),(Object)(((int)0xff008080)),(Object)("darkgreen"),(Object)(((int)0xff008000)),(Object)("darkmagenta"),(Object)(((int)0xff800080)),(Object)("darkred"),(Object)(((int)0xff800000)),(Object)("darkyellow"),(Object)(((int)0xff808000)),(Object)("magenta"),(Object)(((int)0xffff00ff))});
RDebugUtils.currentLine=5570581;
 //BA.debugLineNum = 5570581;BA.debugLine="HighlightColorsMap = CreateMap(\"black\": \"black\",";
__ref._highlightcolorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)("black"),(Object)("blue"),(Object)("blue"),(Object)("cyan"),(Object)("cyan"),(Object)("green"),(Object)("green"),(Object)("magenta"),(Object)("magenta"),(Object)("red"),(Object)("red"),(Object)("yellow"),(Object)("yellow"),(Object)("white"),(Object)("white"),(Object)("darkblue"),(Object)("darkBlue"),(Object)("darkcyan"),(Object)("darkCyan"),(Object)("darkgreen"),(Object)("darkGreen"),(Object)("darkmagenta"),(Object)("darkMagenta"),(Object)("darkred"),(Object)("darkRed"),(Object)("darkyellow"),(Object)("darkYellow"),(Object)("darkgray"),(Object)("darkGray"),(Object)("gray"),(Object)("lightGray")});
RDebugUtils.currentLine=5570597;
 //BA.debugLineNum = 5570597;BA.debugLine="jme = Me";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=5570598;
 //BA.debugLineNum = 5570598;BA.debugLine="End Sub";
return "";
}
public b4j.example.worddocument._worddocelement  _organizeelements(b4j.example.worddocument __ref,anywheresoftware.b4a.objects.collections.List _nodes) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "organizeelements", true))
	 {return ((b4j.example.worddocument._worddocelement) Debug.delegate(ba, "organizeelements", new Object[] {_nodes}));}
b4j.example.worddocument._worddocelement _doc = null;
anywheresoftware.b4a.objects.collections.Map _elements = null;
b4j.example.worddocument._wordtextnode _node = null;
b4j.example.worddocument._worddocelement _currentelement = null;
b4j.example.worddocument._wordtagnode _tag = null;
b4j.example.worddocument._worddocelement _newelement = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub OrganizeElements (Nodes As List) As Wo";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="RemoveInvalidNodes(Nodes)";
__ref._removeinvalidnodes /*String*/ (null,_nodes);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Dim doc As WordDocElement = CreateWordDocElement(";
_doc = __ref._createworddocelement /*b4j.example.worddocument._worddocelement*/ (null,"doc",__c.createMap(new Object[] {}));
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="Dim Elements As Map";
_elements = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Elements.Initialize";
_elements.Initialize();
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="For Each node As WordTextNode In Nodes";
{
final anywheresoftware.b4a.BA.IterableList group5 = _nodes;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_node = (b4j.example.worddocument._wordtextnode)(group5.Get(index5));
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Dim CurrentElement As WordDocElement = doc";
_currentelement = _doc;
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="For Each tag As WordTagNode In node.Tags";
{
final anywheresoftware.b4a.BA.IterableList group7 = _node.Tags /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_tag = (b4j.example.worddocument._wordtagnode)(group7.Get(index7));
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="If tag.Tag = \"noop\" Then Continue";
if ((_tag.Tag /*String*/ ).equals("noop")) { 
if (true) continue;};
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="If Elements.ContainsKey(tag) Then";
if (_elements.ContainsKey((Object)(_tag))) { 
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="CurrentElement = Elements.Get(tag)";
_currentelement = (b4j.example.worddocument._worddocelement)(_elements.Get((Object)(_tag)));
 }else {
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="Dim NewElement As WordDocElement = CreateWordD";
_newelement = __ref._createworddocelement /*b4j.example.worddocument._worddocelement*/ (null,_tag.Tag /*String*/ ,_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=6029326;
 //BA.debugLineNum = 6029326;BA.debugLine="CurrentElement.Children.Add(NewElement)";
_currentelement.Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newelement));
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="Elements.Put(tag, NewElement)";
_elements.Put((Object)(_tag),(Object)(_newelement));
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="CurrentElement = NewElement";
_currentelement = _newelement;
 };
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="If tag.Tag = \"p\" Then";
if ((_tag.Tag /*String*/ ).equals("p")) { 
RDebugUtils.currentLine=6029331;
 //BA.debugLineNum = 6029331;BA.debugLine="CurrentElement.Children.Add(node)";
_currentelement.Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_node));
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=6029336;
 //BA.debugLineNum = 6029336;BA.debugLine="Return doc";
if (true) return _doc;
RDebugUtils.currentLine=6029337;
 //BA.debugLineNum = 6029337;BA.debugLine="End Sub";
return null;
}
public String  _removeinvalidnodes(b4j.example.worddocument __ref,anywheresoftware.b4a.objects.collections.List _nodes) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "removeinvalidnodes", true))
	 {return ((String) Debug.delegate(ba, "removeinvalidnodes", new Object[] {_nodes}));}
int[] _paragraphindices = null;
int _i = 0;
b4j.example.worddocument._wordtextnode _n = null;
boolean _valid = false;
int _p = 0;
b4j.example.worddocument._wordtagnode _t = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub RemoveInvalidNodes (Nodes As List)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim ParagraphIndices() As Int = Array As Int(1, 2";
_paragraphindices = new int[]{(int) (1),(int) (2),(int) (4)};
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="For i = Nodes.Size - 1 To 0 Step -1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_nodes.getSize()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Dim n As WordTextNode = Nodes.Get(i)";
_n = (b4j.example.worddocument._wordtextnode)(_nodes.Get(_i));
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Dim valid As Boolean";
_valid = false;
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="For Each p As Int In ParagraphIndices";
{
final int[] group5 = _paragraphindices;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_p = group5[index5];
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="If n.Tags.Size > p Then";
if (_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_p) { 
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Dim t As WordTagNode = n.Tags.Get(p)";
_t = (b4j.example.worddocument._wordtagnode)(_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_p));
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="If t.Tag = \"p\" Then";
if ((_t.Tag /*String*/ ).equals("p")) { 
RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="valid = True";
_valid = __c.True;
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="If valid = False Then Nodes.RemoveAt(i)";
if (_valid==__c.False) { 
_nodes.RemoveAt(_i);};
 }
};
RDebugUtils.currentLine=6094864;
 //BA.debugLineNum = 6094864;BA.debugLine="End Sub";
return "";
}
public b4j.example.worddocument._wordtagnode  _stackpeek(b4j.example.worddocument __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "stackpeek", true))
	 {return ((b4j.example.worddocument._wordtagnode) Debug.delegate(ba, "stackpeek", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub StackPeek As WordTagNode";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (b4j.example.worddocument._wordtagnode)(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return null;
}
public String  _stackpop(b4j.example.worddocument __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "stackpop", true))
	 {return ((String) Debug.delegate(ba, "stackpop", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub StackPop";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public b4j.example.worddocument._wordtagnode  _parsetag(b4j.example.worddocument __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "parsetag", true))
	 {return ((b4j.example.worddocument._wordtagnode) Debug.delegate(ba, "parsetag", new Object[] {_tag}));}
b4j.example.worddocument._wordtagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub ParseTag (tag As String) As WordTagNod";
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return __ref._createtagnode /*b4j.example.worddocument._wordtagnode*/ (null,_tag.toLowerCase());};
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Dim res As WordTagNode = CreateTagNode(\"\")";
_res = __ref._createtagnode /*b4j.example.worddocument._wordtagnode*/ (null,"");
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
RDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
RDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
RDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="Dim i2 As Int";
_i2 = 0;
RDebugUtils.currentLine=6160401;
 //BA.debugLineNum = 6160401;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
RDebugUtils.currentLine=6160402;
 //BA.debugLineNum = 6160402;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
RDebugUtils.currentLine=6160403;
 //BA.debugLineNum = 6160403;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
RDebugUtils.currentLine=6160405;
 //BA.debugLineNum = 6160405;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
RDebugUtils.currentLine=6160406;
 //BA.debugLineNum = 6160406;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
RDebugUtils.currentLine=6160407;
 //BA.debugLineNum = 6160407;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
RDebugUtils.currentLine=6160409;
 //BA.debugLineNum = 6160409;BA.debugLine="i = i2";
_i = _i2;
RDebugUtils.currentLine=6160410;
 //BA.debugLineNum = 6160410;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=6160412;
 //BA.debugLineNum = 6160412;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=6160413;
 //BA.debugLineNum = 6160413;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=6160414;
 //BA.debugLineNum = 6160414;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
RDebugUtils.currentLine=6160415;
 //BA.debugLineNum = 6160415;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=6160417;
 //BA.debugLineNum = 6160417;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=6160419;
 //BA.debugLineNum = 6160419;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=6160421;
 //BA.debugLineNum = 6160421;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6160422;
 //BA.debugLineNum = 6160422;BA.debugLine="End Sub";
return null;
}
public String  _stackpush(b4j.example.worddocument __ref,b4j.example.worddocument._wordtagnode _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "stackpush", true))
	 {return ((String) Debug.delegate(ba, "stackpush", new Object[] {_tag}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub StackPush (Tag As WordTagNode)";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Stack.Add(Tag)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tag));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public String  _saveas(b4j.example.worddocument __ref,String _dir,String _filename,boolean _renameifneeded) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "saveas", true))
	 {return ((String) Debug.delegate(ba, "saveas", new Object[] {_dir,_filename,_renameifneeded}));}
String _orig = "";
String _extension = "";
int _i = 0;
String _f = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="If RenameIfNeeded Then";
if (_renameifneeded) { 
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
_orig = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="Dim extension As String";
_extension = "";
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
_i = _orig.lastIndexOf(".");
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="If i >-1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="extension = orig.SubString(i)";
_extension = _orig.substring(_i);
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="orig = orig.SubString2(0, i)";
_orig = _orig.substring((int) (0),_i);
 };
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="For i = 0 To 10";
{
final int step9 = 1;
final int limit9 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="Dim f As String";
_f = "";
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="Try";
try {RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
if (_i==0) { 
_f = _orig+_extension;}
else {
_f = _orig+" ("+BA.NumberToString(_i)+")"+_extension;};
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="Dim out As OutputStream = File.OpenOutput(f, \"";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_f,"",__c.False);
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("write",new Object[]{(Object)(_out.getObject())});
RDebugUtils.currentLine=5898255;
 //BA.debugLineNum = 5898255;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=5898256;
 //BA.debugLineNum = 5898256;BA.debugLine="Return f";
if (true) return _f;
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=5898258;
 //BA.debugLineNum = 5898258;BA.debugLine="Log(\"Failed: \" & f)";
__c.LogImpl("95898258","Failed: "+_f,0);
 };
 }
};
 };
RDebugUtils.currentLine=5898262;
 //BA.debugLineNum = 5898262;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=5898263;
 //BA.debugLineNum = 5898263;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("write",new Object[]{(Object)(_out.getObject())});
RDebugUtils.currentLine=5898264;
 //BA.debugLineNum = 5898264;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=5898265;
 //BA.debugLineNum = 5898265;BA.debugLine="Return File.Combine(Dir, FileName)";
if (true) return __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=5898266;
 //BA.debugLineNum = 5898266;BA.debugLine="End Sub";
return "";
}
int BookmarksId;
public void MergeCellsHorizontal (XWPFTableRow row, XWPFTableCell cell, int fromCol, int toCol) {
	CTTcPr tcPr = cell.getCTTc().getTcPr();
  	if (tcPr == null) 
		tcPr = cell.getCTTc().addNewTcPr();
  	if (tcPr.isSetGridSpan()) {
   		tcPr.getGridSpan().setVal(BigInteger.valueOf(toCol-fromCol+1));
  } else {
  	tcPr.addNewGridSpan().setVal(BigInteger.valueOf(toCol-fromCol+1));
  }
  for(int colIndex = toCol; colIndex > fromCol; colIndex--) {
   row.removeCell(colIndex);
  }
}

public void MergeCellsVertical(XWPFTableRow row, int col, int rowSpan) {
	XWPFTable table = row.getTable();
	int fromRow = table.getRows().indexOf(row);
	int toRow = fromRow + rowSpan - 1;
  for(int rowIndex = fromRow; rowIndex <= toRow; rowIndex++) {
   XWPFTableCell cell = table.getRow(rowIndex).getCell(col);
   CTVMerge vmerge = CTVMerge.Factory.newInstance();
   if(rowIndex == fromRow){
    // The first merged cell is set with RESTART merge value
    vmerge.setVal(STMerge.RESTART);
   } else {
    // Cells which join (merge) the first one, are set with CONTINUE
    vmerge.setVal(STMerge.CONTINUE);
    // and the content should be removed
    for (int i = cell.getParagraphs().size(); i > 0; i--) {
     cell.removeParagraph(0);
    }
    cell.addParagraph();
   }
   // Try getting the TcPr. Not simply setting an new one every time.
   CTTcPr tcPr = cell.getCTTc().getTcPr();
   if (tcPr == null) tcPr = cell.getCTTc().addNewTcPr();
   tcPr.setVMerge(vmerge);
  }
 }
 
 public void createBookmark(XWPFParagraph paragraph, String anchor) {
  CTBookmark bookmark = paragraph.getCTP().addNewBookmarkStart();
  bookmark.setName(anchor);
  bookmark.setId(BigInteger.valueOf(++BookmarksId));
  paragraph.getCTP().addNewBookmarkEnd().setId(BigInteger.valueOf(BookmarksId));
 }
 public XWPFHyperlinkRun CreateHyperlinkRunToAnchor(XWPFParagraph paragraph, String anchor) throws Exception {
  CTHyperlink cthyperLink=paragraph.getCTP().addNewHyperlink();
  cthyperLink.setAnchor(anchor);
  cthyperLink.addNewR();
  return new XWPFHyperlinkRun(
    cthyperLink,
    cthyperLink.getRArray(0),
    paragraph
   );
 }
 
}