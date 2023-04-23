package b4j.example;

import anywheresoftware.b4a.debug.*;
import org.apache.poi.xssf.usermodel.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xltable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xltable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xltable.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _jtable = null;
public b4j.example.xlsheetwriter _msheet = null;
public anywheresoftware.b4j.object.JavaObject _jme = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.xltable __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _xssftable,b4j.example.xlsheetwriter _sheet) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_xssftable,_sheet}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Public Sub Initialize (XSSFTable As JavaObject, Sh";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="jTable = XSSFTable";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/  = _xssftable;
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="mSheet = Sheet";
__ref._msheet /*b4j.example.xlsheetwriter*/  = _sheet;
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="jMe = Me";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="End Sub";
return "";
}
public String  _addautofilter(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "addautofilter", true))
	 {return ((String) Debug.delegate(ba, "addautofilter", null));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub AddAutoFilter";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="jMe.RunMethod(\"addAutoFilter\", Array(jTable))";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addAutoFilter",new Object[]{(Object)(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .getObject())});
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Public jTable As JavaObject";
_jtable = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Private mSheet As XLSheetWriter";
_msheet = new b4j.example.xlsheetwriter();
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="Private jMe As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlutils._xlrange  _getcellreferences(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getcellreferences", true))
	 {return ((b4j.example.xlutils._xlrange) Debug.delegate(ba, "getcellreferences", null));}
anywheresoftware.b4j.object.JavaObject _area = null;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub getCellReferences As XLRange";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim area As JavaObject = jTable.RunMethod(\"getCel";
_area = new anywheresoftware.b4j.object.JavaObject();
_area = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getCellReferences",(Object[])(__c.Null))));
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Return mSheet.xl.AreaReferenceToXLRange(mSheet.Wo";
if (true) return __ref._msheet /*b4j.example.xlsheetwriter*/ ._xl /*b4j.example.xlutils*/ ._areareferencetoxlrange /*b4j.example.xlutils._xlrange*/ (null,__ref._msheet /*b4j.example.xlsheetwriter*/ ._workbook /*b4j.example.xlworkbookwriter*/ ._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ ,_area);
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="End Sub";
return null;
}
public String  _getdisplayname(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getdisplayname", true))
	 {return ((String) Debug.delegate(ba, "getdisplayname", null));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub getDisplayName As String";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Return jTable.RunMethod(\"getDisplayName\", Null)";
if (true) return BA.ObjectToString(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDisplayName",(Object[])(__c.Null)));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return "";
}
public String  _getname(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getname", true))
	 {return ((String) Debug.delegate(ba, "getname", null));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub getName As String";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Return jTable.RunMethod(\"getName\", Null)";
if (true) return BA.ObjectToString(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getName",(Object[])(__c.Null)));
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowcolumnstripes(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getshowcolumnstripes", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowcolumnstripes", null));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub getShowColumnStripes As Boolean";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Return GetStyle.RunMethod(\"isShowColumnStripes\",";
if (true) return BA.ObjectToBoolean(__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("isShowColumnStripes",(Object[])(__c.Null)));
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.object.JavaObject  _getstyle(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getstyle", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getstyle", null));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub GetStyle As JavaObject";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Return jTable.RunMethodJO(\"getStyle\", Null)";
if (true) return __ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getStyle",(Object[])(__c.Null));
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="End Sub";
return null;
}
public boolean  _getshowrowstripes(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getshowrowstripes", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowrowstripes", null));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub getShowRowStripes As Boolean";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Return GetStyle.RunMethod(\"isShowRowStripes\", Nul";
if (true) return BA.ObjectToBoolean(__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("isShowRowStripes",(Object[])(__c.Null)));
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="End Sub";
return false;
}
public String  _getstylename(b4j.example.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getstylename", true))
	 {return ((String) Debug.delegate(ba, "getstylename", null));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub getStyleName As String";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Return jTable.RunMethod(\"getStyleName\", Null)";
if (true) return BA.ObjectToString(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getStyleName",(Object[])(__c.Null)));
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="End Sub";
return "";
}
public String  _setcellreferences(b4j.example.xltable __ref,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setcellreferences", true))
	 {return ((String) Debug.delegate(ba, "setcellreferences", new Object[] {_range}));}
Object _area = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub setCellReferences (Range As XLRange)";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Range.Sheet = mSheet.PoiSheet";
_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = __ref._msheet /*b4j.example.xlsheetwriter*/ ._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ ;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Dim area As Object = mSheet.xl.XLRangeToAreaRefer";
_area = (Object)(__ref._msheet /*b4j.example.xlsheetwriter*/ ._xl /*b4j.example.xlutils*/ ._xlrangetoareareference /*anywheresoftware.b4j.object.JavaObject*/ (null,__ref._msheet /*b4j.example.xlsheetwriter*/ ._workbook /*b4j.example.xlworkbookwriter*/ ,_range).getObject());
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="jTable.RunMethod(\"setArea\", Array(area))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setArea",new Object[]{_area});
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayname(b4j.example.xltable __ref,String _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setdisplayname", true))
	 {return ((String) Debug.delegate(ba, "setdisplayname", new Object[] {_n}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub setDisplayName(n As String)";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
if (__ref._msheet /*b4j.example.xlsheetwriter*/ ._validatetablename /*boolean*/ (null,_n)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="jTable.RunMethod(\"setDisplayName\", Array(n))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayName",new Object[]{(Object)(_n)});
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="End Sub";
return "";
}
public String  _setname(b4j.example.xltable __ref,String _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((String) Debug.delegate(ba, "setname", new Object[] {_n}));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub setName(n As String)";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
if (__ref._msheet /*b4j.example.xlsheetwriter*/ ._validatetablename /*boolean*/ (null,_n)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="jTable.RunMethod(\"setName\", Array(n))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setName",new Object[]{(Object)(_n)});
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="End Sub";
return "";
}
public String  _setshowcolumnstripes(b4j.example.xltable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setshowcolumnstripes", true))
	 {return ((String) Debug.delegate(ba, "setshowcolumnstripes", new Object[] {_b}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub setShowColumnStripes (b As Boolean)";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="GetStyle.RunMethod(\"setShowColumnStripes\", Array(";
__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("setShowColumnStripes",new Object[]{(Object)(_b)});
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
return "";
}
public String  _setshowrowstripes(b4j.example.xltable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setshowrowstripes", true))
	 {return ((String) Debug.delegate(ba, "setshowrowstripes", new Object[] {_b}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub setShowRowStripes (b As Boolean)";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="GetStyle.RunMethod(\"setShowRowStripes\", Array(b))";
__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("setShowRowStripes",new Object[]{(Object)(_b)});
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="End Sub";
return "";
}
public String  _setstylename(b4j.example.xltable __ref,String _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setstylename", true))
	 {return ((String) Debug.delegate(ba, "setstylename", new Object[] {_n}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub setStyleName(n As String)";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="jTable.RunMethod(\"setStyleName\", Array(n))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStyleName",new Object[]{(Object)(_n)});
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return "";
}
public void addAutoFilter(XSSFTable table) {
	table.getCTTable().addNewAutoFilter().setRef(table.getArea().formatAsString());
}

public void setTotalsRowShown(XSSFTable table, boolean b) {
	table.getCTTable().setTotalsRowShown(b);
}
public void setTotalsRowCount(XSSFTable table, int b) {
	table.getCTTable().setTotalsRowCount(b);
}
}