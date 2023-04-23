package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xltable_subs_0 {


public static RemoteObject  _addautofilter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddAutoFilter (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("addautofilter")) { return __ref.runUserSub(false, "xltable","addautofilter", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Public Sub AddAutoFilter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="jMe.RunMethod(\"addAutoFilter\", Array(jTable))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jme" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAutoFilter")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_jtable" /*RemoteObject*/ ).getObject())})));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public jTable As JavaObject";
xltable._jtable = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jtable",xltable._jtable);
 //BA.debugLineNum = 3;BA.debugLine="Private mSheet As XLSheetWriter";
xltable._msheet = RemoteObject.createNew ("b4j.example.xlsheetwriter");__ref.setField("_msheet",xltable._msheet);
 //BA.debugLineNum = 4;BA.debugLine="Private jMe As JavaObject";
xltable._jme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jme",xltable._jme);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcellreferences(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCellReferences (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getcellreferences")) { return __ref.runUserSub(false, "xltable","getcellreferences", __ref);}
RemoteObject _area = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 47;BA.debugLine="Public Sub getCellReferences As XLRange";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Dim area As JavaObject = jTable.RunMethod(\"getCel";
Debug.JustUpdateDeviceLine();
_area = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_area = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jtable" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCellReferences")),(Object)((xltable.__c.getField(false,"Null")))));Debug.locals.put("area", _area);Debug.locals.put("area", _area);
 BA.debugLineNum = 49;BA.debugLine="Return mSheet.xl.AreaReferenceToXLRange(mSheet.Wo";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_msheet" /*RemoteObject*/ ).getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_areareferencetoxlrange" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msheet" /*RemoteObject*/ ).getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_poiworkbook" /*RemoteObject*/ )),(Object)(_area));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdisplayname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDisplayName (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("getdisplayname")) { return __ref.runUserSub(false, "xltable","getdisplayname", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Public Sub getDisplayName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="Return jTable.RunMethod(\"getDisplayName\", Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_jtable" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDisplayName")),(Object)((xltable.__c.getField(false,"Null")))));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getName (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("getname")) { return __ref.runUserSub(false, "xltable","getname", __ref);}
 BA.debugLineNum = 15;BA.debugLine="Public Sub getName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="Return jTable.RunMethod(\"getName\", Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_jtable" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getName")),(Object)((xltable.__c.getField(false,"Null")))));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowcolumnstripes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowColumnStripes (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("getshowcolumnstripes")) { return __ref.runUserSub(false, "xltable","getshowcolumnstripes", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Public Sub getShowColumnStripes As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Return GetStyle.RunMethod(\"isShowColumnStripes\",";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.xltable.class, "_getstyle" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isShowColumnStripes")),(Object)((xltable.__c.getField(false,"Null")))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowrowstripes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowRowStripes (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("getshowrowstripes")) { return __ref.runUserSub(false, "xltable","getshowrowstripes", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub getShowRowStripes As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Return GetStyle.RunMethod(\"isShowRowStripes\", Nul";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.xltable.class, "_getstyle" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isShowRowStripes")),(Object)((xltable.__c.getField(false,"Null")))));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetStyle (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("getstyle")) { return __ref.runUserSub(false, "xltable","getstyle", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Private Sub GetStyle As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Return jTable.RunMethodJO(\"getStyle\", Null)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_jtable" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getStyle")),(Object)((xltable.__c.getField(false,"Null"))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstylename(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getStyleName (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("getstylename")) { return __ref.runUserSub(false, "xltable","getstylename", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub getStyleName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="Return jTable.RunMethod(\"getStyleName\", Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_jtable" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStyleName")),(Object)((xltable.__c.getField(false,"Null")))));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _xssftable,RemoteObject _sheet) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xltable","initialize", __ref, _ba, _xssftable, _sheet);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("XSSFTable", _xssftable);
Debug.locals.put("Sheet", _sheet);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (XSSFTable As JavaObject, Sh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 9;BA.debugLine="jTable = XSSFTable";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jtable" /*RemoteObject*/ ,_xssftable);
 BA.debugLineNum = 10;BA.debugLine="mSheet = Sheet";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msheet" /*RemoteObject*/ ,_sheet);
 BA.debugLineNum = 11;BA.debugLine="jMe = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jme" /*RemoteObject*/ ).setObject (__ref);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellreferences(RemoteObject __ref,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("setCellReferences (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setcellreferences")) { return __ref.runUserSub(false, "xltable","setcellreferences", __ref, _range);}
RemoteObject _area = RemoteObject.declareNull("Object");
Debug.locals.put("Range", _range);
 BA.debugLineNum = 52;BA.debugLine="Public Sub setCellReferences (Range As XLRange)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="Range.Sheet = mSheet.PoiSheet";
Debug.JustUpdateDeviceLine();
_range.setField ("Sheet" /*RemoteObject*/ ,__ref.getField(false,"_msheet" /*RemoteObject*/ ).getField(false,"_poisheet" /*RemoteObject*/ ));
 BA.debugLineNum = 54;BA.debugLine="Dim area As Object = mSheet.xl.XLRangeToAreaRefer";
Debug.JustUpdateDeviceLine();
_area = (__ref.getField(false,"_msheet" /*RemoteObject*/ ).getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_xlrangetoareareference" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msheet" /*RemoteObject*/ ).getField(false,"_workbook" /*RemoteObject*/ )),(Object)(_range)).getObject());Debug.locals.put("area", _area);Debug.locals.put("area", _area);
 BA.debugLineNum = 55;BA.debugLine="jTable.RunMethod(\"setArea\", Array(area))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jtable" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setArea")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_area})));
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
public static RemoteObject  _setdisplayname(RemoteObject __ref,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("setDisplayName (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setdisplayname")) { return __ref.runUserSub(false, "xltable","setdisplayname", __ref, _n);}
Debug.locals.put("n", _n);
 BA.debugLineNum = 28;BA.debugLine="Public Sub setDisplayName(n As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_msheet" /*RemoteObject*/ ).runClassMethod (b4j.example.xlsheetwriter.class, "_validatetablename" /*RemoteObject*/ ,(Object)(_n)),xltable.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 30;BA.debugLine="jTable.RunMethod(\"setDisplayName\", Array(n))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jtable" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDisplayName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_n)})));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("setName (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "xltable","setname", __ref, _n);}
Debug.locals.put("n", _n);
 BA.debugLineNum = 19;BA.debugLine="Public Sub setName(n As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_msheet" /*RemoteObject*/ ).runClassMethod (b4j.example.xlsheetwriter.class, "_validatetablename" /*RemoteObject*/ ,(Object)(_n)),xltable.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 21;BA.debugLine="jTable.RunMethod(\"setName\", Array(n))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jtable" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_n)})));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowcolumnstripes(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setShowColumnStripes (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setshowcolumnstripes")) { return __ref.runUserSub(false, "xltable","setshowcolumnstripes", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 63;BA.debugLine="Public Sub setShowColumnStripes (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="GetStyle.RunMethod(\"setShowColumnStripes\", Array(";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xltable.class, "_getstyle" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setShowColumnStripes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)})));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowrowstripes(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setShowRowStripes (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setshowrowstripes")) { return __ref.runUserSub(false, "xltable","setshowrowstripes", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 72;BA.debugLine="Public Sub setShowRowStripes (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="GetStyle.RunMethod(\"setShowRowStripes\", Array(b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xltable.class, "_getstyle" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setShowRowStripes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)})));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylename(RemoteObject __ref,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("setStyleName (xltable) ","xltable",17,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setstylename")) { return __ref.runUserSub(false, "xltable","setstylename", __ref, _n);}
Debug.locals.put("n", _n);
 BA.debugLineNum = 38;BA.debugLine="Public Sub setStyleName(n As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="jTable.RunMethod(\"setStyleName\", Array(n))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jtable" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyleName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_n)})));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
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