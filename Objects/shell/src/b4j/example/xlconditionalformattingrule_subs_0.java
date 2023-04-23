package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xlconditionalformattingrule_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public jRule As JavaObject";
xlconditionalformattingrule._jrule = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jrule",xlconditionalformattingrule._jrule);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _fontstyle(RemoteObject __ref,RemoteObject _italic,RemoteObject _bold,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("FontStyle (xlconditionalformattingrule) ","xlconditionalformattingrule",12,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("fontstyle")) { return __ref.runUserSub(false, "xlconditionalformattingrule","fontstyle", __ref, _italic, _bold, _color);}
RemoteObject _fontformatting = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Italic", _italic);
Debug.locals.put("Bold", _bold);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 22;BA.debugLine="Public Sub FontStyle (Italic As Boolean, Bold As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Dim FontFormatting As JavaObject = jRule.RunMetho";
Debug.JustUpdateDeviceLine();
_fontformatting = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_fontformatting = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jrule" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createFontFormatting")),(Object)((xlconditionalformattingrule.__c.getField(false,"Null")))));Debug.locals.put("FontFormatting", _fontformatting);Debug.locals.put("FontFormatting", _fontformatting);
 BA.debugLineNum = 24;BA.debugLine="FontFormatting.RunMethod(\"setFontStyle\", Array(It";
Debug.JustUpdateDeviceLine();
_fontformatting.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFontStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_italic),(_bold)})));
 BA.debugLineNum = 25;BA.debugLine="If Color > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_color,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 26;BA.debugLine="FontFormatting.RunMethod(\"setFontColorIndex\", Ar";
Debug.JustUpdateDeviceLine();
_fontformatting.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFontColorIndex")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color)})));
 };
 BA.debugLineNum = 28;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _foregroundcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("ForegroundColor (xlconditionalformattingrule) ","xlconditionalformattingrule",12,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("foregroundcolor")) { return __ref.runUserSub(false, "xlconditionalformattingrule","foregroundcolor", __ref, _color);}
RemoteObject _patternformatting = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _solid = RemoteObject.createImmutable((short)0);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 12;BA.debugLine="Public Sub ForegroundColor (Color As Short) As XLC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="Dim patternformatting As JavaObject = jRule.RunMe";
Debug.JustUpdateDeviceLine();
_patternformatting = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_patternformatting = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jrule" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createPatternFormatting")),(Object)((xlconditionalformattingrule.__c.getField(false,"Null")))));Debug.locals.put("patternformatting", _patternformatting);Debug.locals.put("patternformatting", _patternformatting);
 BA.debugLineNum = 14;BA.debugLine="patternformatting.RunMethod(\"setFillBackgroundCol";
Debug.JustUpdateDeviceLine();
_patternformatting.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFillBackgroundColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color)})));
 BA.debugLineNum = 15;BA.debugLine="Dim solid As Short = 1";
Debug.JustUpdateDeviceLine();
_solid = BA.numberCast(short.class, 1);Debug.locals.put("solid", _solid);Debug.locals.put("solid", _solid);
 BA.debugLineNum = 16;BA.debugLine="patternformatting.RunMethod(\"setFillPattern\", Arr";
Debug.JustUpdateDeviceLine();
_patternformatting.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFillPattern")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_solid)})));
 BA.debugLineNum = 17;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _rule) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xlconditionalformattingrule) ","xlconditionalformattingrule",12,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xlconditionalformattingrule","initialize", __ref, _ba, _rule);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Rule", _rule);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize (Rule As JavaObject)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 7;BA.debugLine="jRule = Rule";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jrule" /*RemoteObject*/ ,_rule);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
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