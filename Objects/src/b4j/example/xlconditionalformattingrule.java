package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlconditionalformattingrule extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xlconditionalformattingrule", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xlconditionalformattingrule.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _jrule = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4j.example.xlconditionalformattingrule __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlconditionalformattingrule";
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Public jRule As JavaObject";
_jrule = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlconditionalformattingrule  _fontstyle(b4j.example.xlconditionalformattingrule __ref,boolean _italic,boolean _bold,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlconditionalformattingrule";
if (Debug.shouldDelegate(ba, "fontstyle", true))
	 {return ((b4j.example.xlconditionalformattingrule) Debug.delegate(ba, "fontstyle", new Object[] {_italic,_bold,_color}));}
anywheresoftware.b4j.object.JavaObject _fontformatting = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub FontStyle (Italic As Boolean, Bold As B";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim FontFormatting As JavaObject = jRule.RunMetho";
_fontformatting = new anywheresoftware.b4j.object.JavaObject();
_fontformatting = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jrule /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createFontFormatting",(Object[])(__c.Null))));
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="FontFormatting.RunMethod(\"setFontStyle\", Array(It";
_fontformatting.RunMethod("setFontStyle",new Object[]{(Object)(_italic),(Object)(_bold)});
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="If Color > 0 Then";
if (_color>0) { 
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="FontFormatting.RunMethod(\"setFontColorIndex\", Ar";
_fontformatting.RunMethod("setFontColorIndex",new Object[]{(Object)(_color)});
 };
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Return Me";
if (true) return (b4j.example.xlconditionalformattingrule)(this);
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlconditionalformattingrule  _foregroundcolor(b4j.example.xlconditionalformattingrule __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlconditionalformattingrule";
if (Debug.shouldDelegate(ba, "foregroundcolor", true))
	 {return ((b4j.example.xlconditionalformattingrule) Debug.delegate(ba, "foregroundcolor", new Object[] {_color}));}
anywheresoftware.b4j.object.JavaObject _patternformatting = null;
short _solid = (short)0;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub ForegroundColor (Color As Short) As XLC";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim patternformatting As JavaObject = jRule.RunMe";
_patternformatting = new anywheresoftware.b4j.object.JavaObject();
_patternformatting = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jrule /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createPatternFormatting",(Object[])(__c.Null))));
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="patternformatting.RunMethod(\"setFillBackgroundCol";
_patternformatting.RunMethod("setFillBackgroundColor",new Object[]{(Object)(_color)});
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Dim solid As Short = 1";
_solid = (short) (1);
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="patternformatting.RunMethod(\"setFillPattern\", Arr";
_patternformatting.RunMethod("setFillPattern",new Object[]{(Object)(_solid)});
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Return Me";
if (true) return (b4j.example.xlconditionalformattingrule)(this);
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.xlconditionalformattingrule __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _rule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlconditionalformattingrule";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_rule}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub Initialize (Rule As JavaObject)";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="jRule = Rule";
__ref._jrule /*anywheresoftware.b4j.object.JavaObject*/  = _rule;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return "";
}
}