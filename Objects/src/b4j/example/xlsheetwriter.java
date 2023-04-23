package b4j.example;

import anywheresoftware.b4a.debug.*;
import org.apache.poi.ss.usermodel.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlsheetwriter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xlsheetwriter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xlsheetwriter.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.PoiSheetWrapper _poisheet = null;
public b4j.example.xlutils _xl = null;
public b4j.example.xlutils._xladdress _lastaccessed = null;
public anywheresoftware.b4j.object.JavaObject _jsheet = null;
public b4j.example.xlworkbookwriter _workbook = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.xlsheetwriter  _addconditionalformatting(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _rules) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addconditionalformatting", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "addconditionalformatting", new Object[] {_range,_rules}));}
Object[] _jrules = null;
int _i = 0;
b4j.example.xlconditionalformattingrule _r = null;
anywheresoftware.b4j.object.JavaObject _cfrules = null;
anywheresoftware.b4j.object.JavaObject _regions = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub AddConditionalFormatting (Range As XLRa";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim jrules(Rules.Size) As Object";
_jrules = new Object[_rules.getSize()];
{
int d0 = _jrules.length;
for (int i0 = 0;i0 < d0;i0++) {
_jrules[i0] = new Object();
}
}
;
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="For i = 0 To Rules.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_rules.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Dim r As XLConditionalFormattingRule = Rules.Get";
_r = (b4j.example.xlconditionalformattingrule)(_rules.Get(_i));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="jrules(i) = r.jRule";
_jrules[_i] = (Object)(_r._jrule /*anywheresoftware.b4j.object.JavaObject*/ .getObject());
 }
};
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="Dim cfrules As JavaObject";
_cfrules = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="cfrules.InitializeArray(\"org.apache.poi.ss.usermo";
_cfrules.InitializeArray("org.apache.poi.ss.usermodel.ConditionalFormattingRule",_jrules);
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Dim Regions As JavaObject";
_regions = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="Regions.InitializeArray(\"org.apache.poi.ss.util.C";
_regions.InitializeArray("org.apache.poi.ss.util.CellRangeAddress",new Object[]{(Object)(__ref._xl /*b4j.example.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range).getObject())});
RDebugUtils.currentLine=11141130;
 //BA.debugLineNum = 11141130;BA.debugLine="GetSheetConditionalFormatting.RunMethod(\"addCondi";
__ref._getsheetconditionalformatting /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("addConditionalFormatting",new Object[]{(Object)(_regions.getObject()),(Object)(_cfrules.getObject())});
RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getsheetconditionalformatting(b4j.example.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getsheetconditionalformatting", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getsheetconditionalformatting", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub GetSheetConditionalFormatting As JavaO";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Return jsheet.RunMethod(\"getSheetConditionalForma";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSheetConditionalFormatting",(Object[])(__c.Null))));
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _addmergedregion(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addmergedregion", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "addmergedregion", new Object[] {_range}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub AddMergedRegion (Range As XLRange) As X";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim jo As JavaObject = PoiSheet";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getObject()));
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="jo.RunMethod(\"addMergedRegion\", Array(xl.XLRangeT";
_jo.RunMethod("addMergedRegion",new Object[]{(Object)(__ref._xl /*b4j.example.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range).getObject())});
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _addstyle(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,b4j.example.xlstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addstyle", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "addstyle", new Object[] {_address,_style}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub AddStyle (Address As XLAddress, Style A";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="ApplyStyle(cell, True, Style.StyleMap)";
__ref._applystyle /*String*/ (null,_cell,__c.True,_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiCellWrapper  _getcell(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getcell", true))
	 {return ((anywheresoftware.b4j.objects.PoiCellWrapper) Debug.delegate(ba, "getcell", new Object[] {_address}));}
anywheresoftware.b4j.objects.PoiRowWrapper _row = null;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub GetCell (Address As XLAddress) As PoiCe";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Dim row As PoiRow = GetRow(Address)";
_row = new anywheresoftware.b4j.objects.PoiRowWrapper();
_row = __ref._getrow /*anywheresoftware.b4j.objects.PoiRowWrapper*/ (null,_address);
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim Cell As PoiCell = row.GetCell(Address.Col0Bas";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _row.GetCell(_address.Col0Based /*int*/ );
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="If Cell.IsInitialized = False Then";
if (_cell.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="Cell = row.CreateCellBlank(Address.Col0Based)";
_cell = _row.CreateCellBlank(_address.Col0Based /*int*/ );
 };
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="LastAccessed = Address";
__ref._lastaccessed /*b4j.example.xlutils._xladdress*/  = _address;
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="Return Cell";
if (true) return _cell;
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="End Sub";
return null;
}
public String  _applystyle(b4j.example.xlsheetwriter __ref,anywheresoftware.b4j.objects.PoiCellWrapper _cell,boolean _add,anywheresoftware.b4a.objects.collections.Map _stylemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "applystyle", true))
	 {return ((String) Debug.delegate(ba, "applystyle", new Object[] {_cell,_add,_stylemap}));}
anywheresoftware.b4a.objects.collections.Map _props = null;
String _key = "";
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub ApplyStyle (Cell As PoiCell, Add As Bo";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim props As Map";
_props = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If Add = False Then";
if (_add==__c.False) { 
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="props = StyleMap";
_props = _stylemap;
 }else {
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="props.Initialize";
_props.Initialize();
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="FillStyleFromCell(props, Cell.CellStyle)";
__ref._fillstylefromcell /*String*/ (null,_props,_cell.getCellStyle());
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="For Each key As String In StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _stylemap.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="props.Put(key, StyleMap.Get(key))";
_props.Put((Object)(_key),_stylemap.Get((Object)(_key)));
 }
};
 };
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Cell.CellStyle = CreateStyle(props)";
_cell.setCellStyle(__ref._createstyle /*anywheresoftware.b4j.objects.PoiCellStyleWrapper*/ (null,_props));
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlsheetwriter  _addstyles(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addstyles", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "addstyles", new Object[] {_address,_styles}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub AddStyles (Address As XLAddress, Styles";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="ApplyStyle(cell, True, MergeStyles(Styles))";
__ref._applystyle /*String*/ (null,_cell,__c.True,__ref._mergestyles /*anywheresoftware.b4a.objects.collections.Map*/ (null,_styles));
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mergestyles(b4j.example.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "mergestyles", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mergestyles", new Object[] {_styles}));}
anywheresoftware.b4a.objects.collections.Map _newprops = null;
b4j.example.xlstyle _style = null;
String _key = "";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub MergeStyles (Styles As List) As Map";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim NewProps As Map";
_newprops = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="NewProps.Initialize";
_newprops.Initialize();
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="For Each style As XLStyle In Styles";
{
final anywheresoftware.b4a.BA.IterableList group3 = _styles;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_style = (b4j.example.xlstyle)(group3.Get(index3));
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="For Each key As String In style.StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="NewProps.Put(key, style.StyleMap.Get(key))";
_newprops.Put((Object)(_key),_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
 }
};
 }
};
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Return NewProps";
if (true) return _newprops;
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _addstylestorange(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addstylestorange", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "addstylestorange", new Object[] {_range,_styles}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub AddStylesToRange (Range As XLRange, Sty";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Tr";
if (true) return __ref._internalsetstylestorange /*b4j.example.xlsheetwriter*/ (null,_range,_styles,__c.True);
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _internalsetstylestorange(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles,boolean _add) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "internalsetstylestorange", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "internalsetstylestorange", new Object[] {_range,_styles,_add}));}
anywheresoftware.b4a.objects.collections.Map _props = null;
int _col = 0;
int _row = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub InternalSetStylesToRange (Range As XLR";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim props As Map = MergeStyles(Styles)";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = __ref._mergestyles /*anywheresoftware.b4a.objects.collections.Map*/ (null,_styles);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="For col = Range.FirstAddress.Col0Based To Range.S";
{
final int step2 = 1;
final int limit2 = _range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ;
_col = _range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/  ;
for (;_col <= limit2 ;_col = _col + step2 ) {
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="For row = Range.FirstAddress.Row0Based To Range.";
{
final int step3 = 1;
final int limit3 = _range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ;
_row = _range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/  ;
for (;_row <= limit3 ;_row = _row + step3 ) {
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="Dim cell As PoiCell = GetCell(xl.AddressZero(co";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,__ref._xl /*b4j.example.xlutils*/ ._addresszero /*b4j.example.xlutils._xladdress*/ (null,_col,_row));
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="ApplyStyle(cell, Add, props)";
__ref._applystyle /*String*/ (null,_cell,_add,_props);
 }
};
 }
};
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="End Sub";
return null;
}
public String  _fillstylefromcell(b4j.example.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4j.objects.PoiCellStyleWrapper _cellstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "fillstylefromcell", true))
	 {return ((String) Debug.delegate(ba, "fillstylefromcell", new Object[] {_props,_cellstyle}));}
anywheresoftware.b4j.object.JavaObject _jstyle = null;
anywheresoftware.b4a.objects.collections.List _methods = null;
String _method = "";
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub FillStyleFromCell (props As Map, CellS";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim jStyle As JavaObject = CellStyle";
_jstyle = new anywheresoftware.b4j.object.JavaObject();
_jstyle = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cellstyle.getObject()));
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="For Each methods As List In Workbook.InternalAllS";
_methods = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalallsimplemethods /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_methods = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(group2.Get(index2)));
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="For Each method As String In methods";
{
final anywheresoftware.b4a.BA.IterableList group3 = _methods;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="props.Put(method, jStyle.RunMethod(\"g\" & method";
_props.Put((Object)(_method),_jstyle.RunMethod("g"+_method.substring((int) (1)),(Object[])(__c.Null)));
 }
};
 }
};
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="props.Put(\"setFont\", jStyle.RunMethod(\"getFontInd";
_props.Put((Object)("setFont"),_jstyle.RunMethod("getFontIndex",(Object[])(__c.Null)));
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="For Each method As String In Workbook.InternalSty";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstylestrings /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_method = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="props.Put(method, jStyle.RunMethodJO(\"g\" & metho";
_props.Put((Object)(_method),_jstyle.RunMethodJO("g"+_method.substring((int) (1)),(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 }
};
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PoiCellStyleWrapper  _createstyle(b4j.example.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((anywheresoftware.b4j.objects.PoiCellStyleWrapper) Debug.delegate(ba, "createstyle", new Object[] {_props}));}
anywheresoftware.b4j.objects.PoiCellStyleWrapper _style = null;
anywheresoftware.b4j.object.JavaObject _jstyle = null;
String _key = "";
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub CreateStyle (props As Map) As PoiCellS";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Dim style As PoiCellStyle = CheckIfStyleExists (p";
_style = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
_style = __ref._checkifstyleexists /*anywheresoftware.b4j.objects.PoiCellStyleWrapper*/ (null,_props);
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="If style.IsInitialized = False Then";
if (_style.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="style.Initialize(Workbook.PoiWorkbook)";
_style.Initialize(__ref._workbook /*b4j.example.xlworkbookwriter*/ ._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ );
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Workbook.InternalStylesCache.Put(props, style)";
__ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_props.getObject()),(Object)(_style.getObject()));
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Dim jstyle As JavaObject = style";
_jstyle = new anywheresoftware.b4j.object.JavaObject();
_jstyle = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_style.getObject()));
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="For Each key As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _props.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="If key = \"setFont\" Then";
if ((_key).equals("setFont")) { 
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="jstyle.RunMethod(key, Array(Workbook.jWorkbook";
_jstyle.RunMethod(_key,new Object[]{__ref._workbook /*b4j.example.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getFontAt",new Object[]{_props.Get((Object)(_key))})});
 }else {
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="jstyle.RunMethod(key, Array(props.Get(key)))";
_jstyle.RunMethod(_key,new Object[]{_props.Get((Object)(_key))});
 };
 }
};
 };
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="Return style";
if (true) return _style;
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _autosizecolumn(b4j.example.xlsheetwriter __ref,int _column0based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "autosizecolumn", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "autosizecolumn", new Object[] {_column0based}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Public Sub AutoSizeColumn (Column0Based As Int) As";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="jsheet.RunMethod(\"autoSizeColumn\", Array(Column0B";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("autoSizeColumn",new Object[]{(Object)(_column0based)});
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiCellStyleWrapper  _checkifstyleexists(b4j.example.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "checkifstyleexists", true))
	 {return ((anywheresoftware.b4j.objects.PoiCellStyleWrapper) Debug.delegate(ba, "checkifstyleexists", new Object[] {_props}));}
anywheresoftware.b4j.objects.PoiCellStyleWrapper _empty = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub CheckIfStyleExists (props As Map) As P";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim empty As PoiCellStyle";
_empty = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="For Each m As Map In Workbook.InternalStylesCache";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group2.Get(index2)));
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="If IsMapTheSameAsProps(m, props) Then";
if (__ref._ismapthesameasprops /*boolean*/ (null,_m,_props)) { 
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Return Workbook.InternalStylesCache.Get(m)";
if (true) return (anywheresoftware.b4j.objects.PoiCellStyleWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellStyleWrapper(), (org.apache.poi.ss.usermodel.CellStyle)(__ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_m.getObject()))));
 };
 }
};
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="End Sub";
return null;
}
public boolean  _ismapthesameasprops(b4j.example.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "ismapthesameasprops", true))
	 {return ((Boolean) Debug.delegate(ba, "ismapthesameasprops", new Object[] {_m,_props}));}
String _key = "";
int _i = 0;
boolean _b = false;
short _s = (short)0;
String _t = "";
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub IsMapTheSameAsProps (m As Map, Props A";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If m.Size = Props.Size Then";
if (_m.getSize()==_props.getSize()) { 
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="For Each key As String In Props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _props.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="If m.ContainsKey(key) = False Then Return False";
if (_m.ContainsKey((Object)(_key))==__c.False) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstyleints /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Dim i As Int = Props.Get(key)";
_i = (int)(BA.ObjectToNumber(_props.Get((Object)(_key))));
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="If i <> m.Get(key) Then";
if (_i!=(double)(BA.ObjectToNumber(_m.Get((Object)(_key))))) { 
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group13 = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstylebooleans /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_key = BA.ObjectToString(group13.Get(index13));
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=11730959;
 //BA.debugLineNum = 11730959;BA.debugLine="Dim b As Boolean = Props.Get(key)";
_b = BA.ObjectToBoolean(_props.Get((Object)(_key)));
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="If b <> m.Get(key) Then";
if (_b!=BA.ObjectToBoolean(_m.Get((Object)(_key)))) { 
RDebugUtils.currentLine=11730961;
 //BA.debugLineNum = 11730961;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=11730965;
 //BA.debugLineNum = 11730965;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group21 = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstyleshorts /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_key = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=11730967;
 //BA.debugLineNum = 11730967;BA.debugLine="Dim s As Short = Props.Get(key)";
_s = (short)(BA.ObjectToNumber(_props.Get((Object)(_key))));
RDebugUtils.currentLine=11730968;
 //BA.debugLineNum = 11730968;BA.debugLine="If s <> m.Get(key) Then";
if (_s!=(double)(BA.ObjectToNumber(_m.Get((Object)(_key))))) { 
RDebugUtils.currentLine=11730969;
 //BA.debugLineNum = 11730969;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=11730973;
 //BA.debugLineNum = 11730973;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group29 = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalstylestrings /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_key = BA.ObjectToString(group29.Get(index29));
RDebugUtils.currentLine=11730974;
 //BA.debugLineNum = 11730974;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=11730975;
 //BA.debugLineNum = 11730975;BA.debugLine="Dim t As String = Props.Get(key)";
_t = BA.ObjectToString(_props.Get((Object)(_key)));
RDebugUtils.currentLine=11730976;
 //BA.debugLineNum = 11730976;BA.debugLine="If t <> m.Get(key) Then";
if ((_t).equals(BA.ObjectToString(_m.Get((Object)(_key)))) == false) { 
RDebugUtils.currentLine=11730977;
 //BA.debugLineNum = 11730977;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=11730981;
 //BA.debugLineNum = 11730981;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=11730983;
 //BA.debugLineNum = 11730983;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=11730984;
 //BA.debugLineNum = 11730984;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Public PoiSheet As PoiSheet";
_poisheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Public xl As XLUtils";
_xl = new b4j.example.xlutils();
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Public LastAccessed As XLAddress";
_lastaccessed = new b4j.example.xlutils._xladdress();
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Private jsheet As JavaObject";
_jsheet = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="Public Workbook As XLWorkbookWriter";
_workbook = new b4j.example.xlworkbookwriter();
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlconditionalformattingrule  _createconditionalformattingrule(b4j.example.xlsheetwriter __ref,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createconditionalformattingrule", true))
	 {return ((b4j.example.xlconditionalformattingrule) Debug.delegate(ba, "createconditionalformattingrule", new Object[] {_formula}));}
b4j.example.xlconditionalformattingrule _x = null;
anywheresoftware.b4j.object.JavaObject _m = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub CreateConditionalFormattingRule(Formula";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim x As XLConditionalFormattingRule";
_x = new b4j.example.xlconditionalformattingrule();
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Dim m As JavaObject = Me";
_m = new anywheresoftware.b4j.object.JavaObject();
_m = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="x.Initialize(m.RunMethod(\"createConditionalFormat";
_x._initialize /*String*/ (null,ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_m.RunMethod("createConditionalFormattingRule",new Object[]{(Object)(__ref._getsheetconditionalformatting /*anywheresoftware.b4j.object.JavaObject*/ (null).getObject()),(Object)(_formula)}))));
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _createfreezepane(b4j.example.xlsheetwriter __ref,int _numberofcolumns,int _numberofrows) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createfreezepane", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "createfreezepane", new Object[] {_numberofcolumns,_numberofrows}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub CreateFreezePane (NumberOfColumns As In";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="jsheet.RunMethod(\"createFreezePane\", Array(Number";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createFreezePane",new Object[]{(Object)(_numberofcolumns),(Object)(_numberofrows)});
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _createhyperlink(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,String _hyperlinktype,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createhyperlink", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "createhyperlink", new Object[] {_address,_hyperlinktype,_url}));}
anywheresoftware.b4j.object.JavaObject _link = null;
anywheresoftware.b4j.object.JavaObject _jcell = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub CreateHyperlink (Address As XLAddress,";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim link As JavaObject = Workbook.jWorkbook.RunMe";
_link = new anywheresoftware.b4j.object.JavaObject();
_link = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._workbook /*b4j.example.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethod("createHyperlink",new Object[]{(Object)(_hyperlinktype)})));
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="link.RunMethod(\"setAddress\", Array(URL))";
_link.RunMethod("setAddress",new Object[]{(Object)(_url)});
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Dim jcell As JavaObject = GetCell(Address)";
_jcell = new anywheresoftware.b4j.object.JavaObject();
_jcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).getObject()));
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="jcell.RunMethod(\"setHyperlink\", Array(link))";
_jcell.RunMethod("setHyperlink",new Object[]{(Object)(_link.getObject())});
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="End Sub";
return null;
}
public b4j.example.xltable  _createtable(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range,String _tablename,String _stylename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.xltable) Debug.delegate(ba, "createtable", new Object[] {_range,_tablename,_stylename}));}
anywheresoftware.b4j.object.JavaObject _areareference = null;
anywheresoftware.b4j.object.JavaObject _table = null;
b4j.example.xltable _t = null;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub CreateTable (Range As XLRange, TableNam";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="If Workbook.IsXLSX = False Then";
if (__ref._workbook /*b4j.example.xlworkbookwriter*/ ._isxlsx /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Log(\"Tables are supported in XLSX only.\")";
__c.LogImpl("911206658","Tables are supported in XLSX only.",0);
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Return Null";
if (true) return (b4j.example.xltable)(__c.Null);
 };
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="If ValidateTableName(TableName) = False Then Retu";
if (__ref._validatetablename /*boolean*/ (null,_tablename)==__c.False) { 
if (true) return (b4j.example.xltable)(__c.Null);};
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Range.Sheet = PoiSheet";
_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = __ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ ;
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="Dim AreaReference As JavaObject = xl.XLRangeToAre";
_areareference = new anywheresoftware.b4j.object.JavaObject();
_areareference = __ref._xl /*b4j.example.xlutils*/ ._xlrangetoareareference /*anywheresoftware.b4j.object.JavaObject*/ (null,__ref._workbook /*b4j.example.xlworkbookwriter*/ ,_range);
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim Table As JavaObject = jsheet.RunMethod(\"creat";
_table = new anywheresoftware.b4j.object.JavaObject();
_table = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createTable",new Object[]{(Object)(_areareference.getObject())})));
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Table.RunMethod(\"setName\", Array(TableName))";
_table.RunMethod("setName",new Object[]{(Object)(_tablename)});
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="Table.RunMethod(\"setStyleName\", Array(StyleName))";
_table.RunMethod("setStyleName",new Object[]{(Object)(_stylename)});
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="Dim t As XLTable";
_t = new b4j.example.xltable();
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="t.Initialize(Table, Me)";
_t._initialize /*String*/ (null,ba,_table,(b4j.example.xlsheetwriter)(this));
RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="Return t";
if (true) return _t;
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="End Sub";
return null;
}
public boolean  _validatetablename(b4j.example.xlsheetwriter __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "validatetablename", true))
	 {return ((Boolean) Debug.delegate(ba, "validatetablename", new Object[] {_name}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub ValidateTableName (Name As String) As B";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="If Regex.IsMatch(Workbook.InternalNameRegex, Name";
if (__c.Regex.IsMatch(__ref._workbook /*b4j.example.xlworkbookwriter*/ ._internalnameregex /*String*/ ,_name)==__c.False) { 
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="LogError(\"Invalid name: \" & Name)";
__c.LogError("Invalid name: "+_name);
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="End Sub";
return false;
}
public b4j.example.xlutils._xladdress  _getactivecell(b4j.example.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getactivecell", true))
	 {return ((b4j.example.xlutils._xladdress) Debug.delegate(ba, "getactivecell", null));}
b4j.example.xlutils._xladdress _res = null;
anywheresoftware.b4j.object.JavaObject _celladdress = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub getActiveCell As XLAddress";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim res As XLAddress";
_res = new b4j.example.xlutils._xladdress();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim celladdress As JavaObject = jsheet.RunMethod(";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
_celladdress = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getActiveCell",(Object[])(__c.Null))));
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="If celladdress.IsInitialized = False Then Return";
if (_celladdress.IsInitialized()==__c.False) { 
if (true) return _res;};
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="Return xl.AddressZero(celladdress.RunMethod(\"getC";
if (true) return __ref._xl /*b4j.example.xlutils*/ ._addresszero /*b4j.example.xlutils._xladdress*/ (null,(int)(BA.ObjectToNumber(_celladdress.RunMethod("getColumn",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_celladdress.RunMethod("getRow",(Object[])(__c.Null)))));
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiRowWrapper  _getrow(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getrow", true))
	 {return ((anywheresoftware.b4j.objects.PoiRowWrapper) Debug.delegate(ba, "getrow", new Object[] {_address}));}
anywheresoftware.b4j.objects.PoiRowWrapper _row = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub GetRow (Address As XLAddress) As PoiRow";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim row As PoiRow = PoiSheet.GetRow(Address.Row0B";
_row = new anywheresoftware.b4j.objects.PoiRowWrapper();
_row = __ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .GetRow(_address.Row0Based /*int*/ );
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="If row.IsInitialized = False Then";
if (_row.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="row = PoiSheet.CreateRow(Address.Row0Based)";
_row = __ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .CreateRow(_address.Row0Based /*int*/ );
 };
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="Return row";
if (true) return _row;
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlutils._xlrange  _getprintarea(b4j.example.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getprintarea", true))
	 {return ((b4j.example.xlutils._xlrange) Debug.delegate(ba, "getprintarea", null));}
Object _ref = null;
b4j.example.xlutils._xlrange _res = null;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub getPrintArea As XLRange";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Dim ref As Object = Workbook.jWorkbook.RunMethod(";
_ref = __ref._workbook /*b4j.example.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getPrintArea",new Object[]{(Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())});
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="If ref = Null Then";
if (_ref== null) { 
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Dim res As XLRange";
_res = new b4j.example.xlutils._xlrange();
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="Return xl.RangeStringOrNameToRange(Workbook.PoiWo";
if (true) return __ref._xl /*b4j.example.xlutils*/ ._rangestringornametorange /*b4j.example.xlutils._xlrange*/ (null,__ref._workbook /*b4j.example.xlworkbookwriter*/ ._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ ,BA.ObjectToString(_ref));
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getprintsetup(b4j.example.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getprintsetup", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getprintsetup", null));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub getPrintSetup As JavaObject";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Return jsheet.RunMethod(\"getPrintSetup\", Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getPrintSetup",(Object[])(__c.Null))));
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _gettables(b4j.example.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "gettables", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettables", null));}
anywheresoftware.b4a.objects.collections.List _t = null;
anywheresoftware.b4a.objects.collections.List _res = null;
Object _j = null;
b4j.example.xltable _table = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub GetTables As List";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim t As List = jsheet.RunMethod(\"getTables\", Nul";
_t = new anywheresoftware.b4a.objects.collections.List();
_t = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getTables",(Object[])(__c.Null))));
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="For Each j As Object In t";
{
final anywheresoftware.b4a.BA.IterableList group4 = _t;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_j = group4.Get(index4);
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Dim table As XLTable";
_table = new b4j.example.xltable();
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="table.Initialize(j, Me)";
_table._initialize /*String*/ (null,ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_j)),(b4j.example.xlsheetwriter)(this));
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="res.Add(table)";
_res.Add((Object)(_table));
 }
};
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _groupcolumns(b4j.example.xlsheetwriter __ref,int _fromcolumn0,int _tocolumn0,boolean _collapse) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "groupcolumns", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "groupcolumns", new Object[] {_fromcolumn0,_tocolumn0,_collapse}));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub GroupColumns (FromColumn0 As Int, ToCol";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="jsheet.RunMethod(\"groupColumn\", Array (FromColumn";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("groupColumn",new Object[]{(Object)(_fromcolumn0),(Object)(_tocolumn0)});
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setColumnGroup";
if (_collapse) { 
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColumnGroupCollapsed",new Object[]{(Object)(_fromcolumn0),(Object)(_collapse)});};
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _grouprows(b4j.example.xlsheetwriter __ref,int _fromrow0,int _torow0,boolean _collapse) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "grouprows", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "grouprows", new Object[] {_fromrow0,_torow0,_collapse}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub GroupRows (FromRow0 As Int, ToRow0 As I";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="jsheet.RunMethod(\"groupRow\", Array(FromRow0, ToRo";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("groupRow",new Object[]{(Object)(_fromrow0),(Object)(_torow0)});
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setRowGroupCol";
if (_collapse) { 
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setRowGroupCollapsed",new Object[]{(Object)(_fromrow0),(Object)(_collapse)});};
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.xlsheetwriter __ref,anywheresoftware.b4a.BA _ba,b4j.example.xlutils _vxl,b4j.example.xlworkbookwriter _vworkbookwriter,anywheresoftware.b4j.objects.PoiSheetWrapper _vsheet) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl,_vworkbookwriter,_vsheet}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub Initialize (vxl As XLUtils, vWorkbookWr";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="PoiSheet = vSheet";
__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _vsheet;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="xl = vxl";
__ref._xl /*b4j.example.xlutils*/  = _vxl;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Workbook = vWorkbookWriter";
__ref._workbook /*b4j.example.xlworkbookwriter*/  = _vworkbookwriter;
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="jsheet = PoiSheet";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getObject()));
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlsheetwriter  _putdate(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,long _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putdate", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "putdate", new Object[] {_address,_value}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub PutDate (Address As XLAddress, Value As";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="GetCell(Address).ValueDate = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueDate(_value);
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _putformula(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putformula", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "putformula", new Object[] {_address,_value}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub PutFormula (Address As XLAddress, Value";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="If Value.StartsWith(\"=\") Then Value = Value.SubSt";
if (_value.startsWith("=")) { 
_value = _value.substring((int) (1));};
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="GetCell(Address).ValueFormula = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueFormula(_value);
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _putnumber(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,double _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putnumber", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "putnumber", new Object[] {_address,_value}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub PutNumber (Address As XLAddress, Value";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="GetCell(Address).ValueNumeric = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueNumeric(_value);
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _putstring(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "putstring", new Object[] {_address,_value}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub PutString (Address As XLAddress, Value";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="GetCell(Address).ValueString = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueString(_value);
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="End Sub";
return null;
}
public String  _removetable(b4j.example.xlsheetwriter __ref,b4j.example.xltable _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "removetable", true))
	 {return ((String) Debug.delegate(ba, "removetable", new Object[] {_table}));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub RemoveTable (Table As XLTable)";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="jsheet.RunMethod(\"removeTable\", Array(Table))";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("removeTable",new Object[]{(Object)(_table)});
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="End Sub";
return "";
}
public String  _setactivecell(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setactivecell", true))
	 {return ((String) Debug.delegate(ba, "setactivecell", new Object[] {_address}));}
anywheresoftware.b4j.object.JavaObject _celladdress = null;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub setActiveCell (Address As XLAddress)";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim celladdress As JavaObject";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="celladdress.InitializeNewInstance(\"org.apache.poi";
_celladdress.InitializeNewInstance("org.apache.poi.ss.util.CellAddress",new Object[]{(Object)(_address.Row0Based /*int*/ ),(Object)(_address.Col0Based /*int*/ )});
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="jsheet.RunMethod(\"setActiveCell\", Array(celladdre";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setActiveCell",new Object[]{(Object)(_celladdress.getObject())});
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlsheetwriter  _setautofilter(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setautofilter", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "setautofilter", new Object[] {_range}));}
Object _c = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub SetAutoFilter (Range As XLRange) As XLS";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim c As Object = xl.XLRangeToCellRangeAddress(Ra";
_c = (Object)(__ref._xl /*b4j.example.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range).getObject());
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="jsheet.RunMethod(\"setAutoFilter\", Array(c))";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setAutoFilter",new Object[]{_c});
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _setfittopage(b4j.example.xlsheetwriter __ref,short _pageswide,short _pagestall) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setfittopage", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "setfittopage", new Object[] {_pageswide,_pagestall}));}
anywheresoftware.b4j.object.JavaObject _ps = null;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub SetFitToPage (PagesWide As Short, Pages";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="jsheet.RunMethod(\"setFitToPage\", Array(True))";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFitToPage",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Dim ps As JavaObject = getPrintSetup";
_ps = new anywheresoftware.b4j.object.JavaObject();
_ps = __ref._getprintsetup /*anywheresoftware.b4j.object.JavaObject*/ (null);
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="ps.RunMethod(\"setFitWidth\", Array(PagesWide))";
_ps.RunMethod("setFitWidth",new Object[]{(Object)(_pageswide)});
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="ps.RunMethod(\"setFitHeight\", Array(PagesTall))";
_ps.RunMethod("setFitHeight",new Object[]{(Object)(_pagestall)});
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="End Sub";
return null;
}
public String  _setprintarea(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setprintarea", true))
	 {return ((String) Debug.delegate(ba, "setprintarea", new Object[] {_range}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub setPrintArea(Range As XLRange)";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Workbook.jWorkbook.RunMethod(\"setPrintArea\", Arra";
__ref._workbook /*b4j.example.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setPrintArea",new Object[]{(Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex()),(Object)(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ )});
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlsheetwriter  _setstyle(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,b4j.example.xlstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "setstyle", new Object[] {_address,_style}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub SetStyle (Address As XLAddress, Style A";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="ApplyStyle(cell, False, Style.StyleMap)";
__ref._applystyle /*String*/ (null,_cell,__c.False,_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _setstyles(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xladdress _address,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setstyles", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "setstyles", new Object[] {_address,_styles}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub SetStyles (Address As XLAddress, Styles";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="ApplyStyle(cell, False, MergeStyles(Styles))";
__ref._applystyle /*String*/ (null,_cell,__c.False,__ref._mergestyles /*anywheresoftware.b4a.objects.collections.Map*/ (null,_styles));
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _setstylestorange(b4j.example.xlsheetwriter __ref,b4j.example.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setstylestorange", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "setstylestorange", new Object[] {_range,_styles}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub SetStylesToRange (Range As XLRange, Sty";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Fa";
if (true) return __ref._internalsetstylestorange /*b4j.example.xlsheetwriter*/ (null,_range,_styles,__c.False);
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _shiftcolumns(b4j.example.xlsheetwriter __ref,int _startcolumn0based,int _endcolumn0based,int _shiftamount) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "shiftcolumns", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "shiftcolumns", new Object[] {_startcolumn0based,_endcolumn0based,_shiftamount}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub ShiftColumns (StartColumn0Based As Int,";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="jsheet.RunMethod(\"shiftColumns\", Array(StartColum";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("shiftColumns",new Object[]{(Object)(_startcolumn0based),(Object)(_endcolumn0based),(Object)(_shiftamount)});
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _shiftrows(b4j.example.xlsheetwriter __ref,int _startrow0based,int _endrow0based,int _shiftamount) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "shiftrows", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "shiftrows", new Object[] {_startrow0based,_endrow0based,_shiftamount}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub ShiftRows (StartRow0Based As Int, EndRo";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="jsheet.RunMethod(\"shiftRows\", Array(StartRow0Base";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("shiftRows",new Object[]{(Object)(_startrow0based),(Object)(_endrow0based),(Object)(_shiftamount)});
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _ungroupcolumns(b4j.example.xlsheetwriter __ref,int _fromcolumn0,int _tocolumn0) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "ungroupcolumns", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "ungroupcolumns", new Object[] {_fromcolumn0,_tocolumn0}));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub UngroupColumns (FromColumn0 As Int, ToC";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="jsheet.RunMethod(\"ungroupColumn\", Array (FromColu";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("ungroupColumn",new Object[]{(Object)(_fromcolumn0),(Object)(_tocolumn0)});
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _ungrouprows(b4j.example.xlsheetwriter __ref,int _fromrow0,int _torow0) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "ungrouprows", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "ungrouprows", new Object[] {_fromrow0,_torow0}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub UngroupRows (FromRow0 As Int, ToRow0 As";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="jsheet.RunMethod(\"ungroupRow\", Array(FromRow0, To";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("ungroupRow",new Object[]{(Object)(_fromrow0),(Object)(_torow0)});
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Return Me";
if (true) return (b4j.example.xlsheetwriter)(this);
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="End Sub";
return null;
}
public Object createConditionalFormattingRule (SheetConditionalFormatting s, String formula) {
	return s.createConditionalFormattingRule(formula);
}
}