package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wordparagraph extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.wordparagraph", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wordparagraph.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _xwpfparagraph = null;
public b4j.example.worddocument _mdocument = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4j.example.wordparagraph __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wordparagraph";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Public XWPFParagraph As JavaObject";
_xwpfparagraph = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Public mDocument As WordDocument";
_mdocument = new b4j.example.worddocument();
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.wordparagraph __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _paragraph,b4j.example.worddocument _document) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wordparagraph";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_paragraph,_document}));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub Initialize (Paragraph As JavaObject, Do";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="XWPFParagraph = Paragraph";
__ref._xwpfparagraph /*anywheresoftware.b4j.object.JavaObject*/  = _paragraph;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="mDocument = Document";
__ref._mdocument /*b4j.example.worddocument*/  = _document;
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="End Sub";
return "";
}
}