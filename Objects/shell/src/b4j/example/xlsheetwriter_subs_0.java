package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xlsheetwriter_subs_0 {


public static RemoteObject  _addconditionalformatting(RemoteObject __ref,RemoteObject _range,RemoteObject _rules) throws Exception{
try {
		Debug.PushSubsStack("AddConditionalFormatting (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("addconditionalformatting")) { return __ref.runUserSub(false, "xlsheetwriter","addconditionalformatting", __ref, _range, _rules);}
RemoteObject _jrules = null;
int _i = 0;
RemoteObject _r = RemoteObject.declareNull("b4j.example.xlconditionalformattingrule");
RemoteObject _cfrules = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _regions = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Range", _range);
Debug.locals.put("Rules", _rules);
 BA.debugLineNum = 230;BA.debugLine="Public Sub AddConditionalFormatting (Range As XLRa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="Dim jrules(Rules.Size) As Object";
Debug.JustUpdateDeviceLine();
_jrules = RemoteObject.createNewArray ("Object", new int[] {_rules.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("jrules", _jrules);
 BA.debugLineNum = 232;BA.debugLine="For i = 0 To Rules.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_rules.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 233;BA.debugLine="Dim r As XLConditionalFormattingRule = Rules.Get";
Debug.JustUpdateDeviceLine();
_r = (_rules.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 234;BA.debugLine="jrules(i) = r.jRule";
Debug.JustUpdateDeviceLine();
_jrules.setArrayElement ((_r.getField(false,"_jrule" /*RemoteObject*/ ).getObject()),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 236;BA.debugLine="Dim cfrules As JavaObject";
Debug.JustUpdateDeviceLine();
_cfrules = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("cfrules", _cfrules);
 BA.debugLineNum = 237;BA.debugLine="cfrules.InitializeArray(\"org.apache.poi.ss.usermo";
Debug.JustUpdateDeviceLine();
_cfrules.runVoidMethod ("InitializeArray",(Object)(BA.ObjectToString("org.apache.poi.ss.usermodel.ConditionalFormattingRule")),(Object)(_jrules));
 BA.debugLineNum = 238;BA.debugLine="Dim Regions As JavaObject";
Debug.JustUpdateDeviceLine();
_regions = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Regions", _regions);
 BA.debugLineNum = 239;BA.debugLine="Regions.InitializeArray(\"org.apache.poi.ss.util.C";
Debug.JustUpdateDeviceLine();
_regions.runVoidMethod ("InitializeArray",(Object)(BA.ObjectToString("org.apache.poi.ss.util.CellRangeAddress")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_xlrangetocellrangeaddress" /*RemoteObject*/ ,(Object)(_range)).getObject())})));
 BA.debugLineNum = 240;BA.debugLine="GetSheetConditionalFormatting.RunMethod(\"addCondi";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getsheetconditionalformatting" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addConditionalFormatting")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_regions.getObject()),(_cfrules.getObject())})));
 BA.debugLineNum = 241;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmergedregion(RemoteObject __ref,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("AddMergedRegion (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("addmergedregion")) { return __ref.runUserSub(false, "xlsheetwriter","addmergedregion", __ref, _range);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Range", _range);
 BA.debugLineNum = 101;BA.debugLine="Public Sub AddMergedRegion (Range As XLRange) As X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="Dim jo As JavaObject = PoiSheet";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_poisheet" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 103;BA.debugLine="jo.RunMethod(\"addMergedRegion\", Array(xl.XLRangeT";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addMergedRegion")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_xlrangetocellrangeaddress" /*RemoteObject*/ ,(Object)(_range)).getObject())})));
 BA.debugLineNum = 104;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyle(RemoteObject __ref,RemoteObject _address,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("AddStyle (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("addstyle")) { return __ref.runUserSub(false, "xlsheetwriter","addstyle", __ref, _address, _style);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
Debug.locals.put("Address", _address);
Debug.locals.put("Style", _style);
 BA.debugLineNum = 48;BA.debugLine="Public Sub AddStyle (Address As XLAddress, Style A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 50;BA.debugLine="ApplyStyle(cell, True, Style.StyleMap)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_applystyle" /*RemoteObject*/ ,(Object)(_cell),(Object)(xlsheetwriter.__c.getField(true,"True")),(Object)(_style.getField(false,"_stylemap" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyles(RemoteObject __ref,RemoteObject _address,RemoteObject _styles) throws Exception{
try {
		Debug.PushSubsStack("AddStyles (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("addstyles")) { return __ref.runUserSub(false, "xlsheetwriter","addstyles", __ref, _address, _styles);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
Debug.locals.put("Address", _address);
Debug.locals.put("Styles", _styles);
 BA.debugLineNum = 62;BA.debugLine="Public Sub AddStyles (Address As XLAddress, Styles";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 64;BA.debugLine="ApplyStyle(cell, True, MergeStyles(Styles))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_applystyle" /*RemoteObject*/ ,(Object)(_cell),(Object)(xlsheetwriter.__c.getField(true,"True")),(Object)(__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_mergestyles" /*RemoteObject*/ ,(Object)(_styles))));
 BA.debugLineNum = 65;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstylestorange(RemoteObject __ref,RemoteObject _range,RemoteObject _styles) throws Exception{
try {
		Debug.PushSubsStack("AddStylesToRange (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("addstylestorange")) { return __ref.runUserSub(false, "xlsheetwriter","addstylestorange", __ref, _range, _styles);}
Debug.locals.put("Range", _range);
Debug.locals.put("Styles", _styles);
 BA.debugLineNum = 85;BA.debugLine="Public Sub AddStylesToRange (Range As XLRange, Sty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Tr";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_internalsetstylestorange" /*RemoteObject*/ ,(Object)(_range),(Object)(_styles),(Object)(xlsheetwriter.__c.getField(true,"True")));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applystyle(RemoteObject __ref,RemoteObject _cell,RemoteObject _add,RemoteObject _stylemap) throws Exception{
try {
		Debug.PushSubsStack("ApplyStyle (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("applystyle")) { return __ref.runUserSub(false, "xlsheetwriter","applystyle", __ref, _cell, _add, _stylemap);}
RemoteObject _props = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("Cell", _cell);
Debug.locals.put("Add", _add);
Debug.locals.put("StyleMap", _stylemap);
 BA.debugLineNum = 290;BA.debugLine="Private Sub ApplyStyle (Cell As PoiCell, Add As Bo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="Dim props As Map";
Debug.JustUpdateDeviceLine();
_props = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("props", _props);
 BA.debugLineNum = 292;BA.debugLine="If Add = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_add,xlsheetwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 293;BA.debugLine="props = StyleMap";
Debug.JustUpdateDeviceLine();
_props = _stylemap;Debug.locals.put("props", _props);
 }else {
 BA.debugLineNum = 295;BA.debugLine="props.Initialize";
Debug.JustUpdateDeviceLine();
_props.runVoidMethod ("Initialize");
 BA.debugLineNum = 296;BA.debugLine="FillStyleFromCell(props, Cell.CellStyle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_fillstylefromcell" /*RemoteObject*/ ,(Object)(_props),(Object)(_cell.runMethod(false,"getCellStyle")));
 BA.debugLineNum = 297;BA.debugLine="For Each key As String In StyleMap.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = _stylemap.runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 298;BA.debugLine="props.Put(key, StyleMap.Get(key))";
Debug.JustUpdateDeviceLine();
_props.runVoidMethod ("Put",(Object)((_key)),(Object)(_stylemap.runMethod(false,"Get",(Object)((_key)))));
 }
}Debug.locals.put("key", _key);
;
 };
 BA.debugLineNum = 301;BA.debugLine="Cell.CellStyle = CreateStyle(props)";
Debug.JustUpdateDeviceLine();
_cell.runMethod(false,"setCellStyle",__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_createstyle" /*RemoteObject*/ ,(Object)(_props)));
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _autosizecolumn(RemoteObject __ref,RemoteObject _column0based) throws Exception{
try {
		Debug.PushSubsStack("AutoSizeColumn (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("autosizecolumn")) { return __ref.runUserSub(false, "xlsheetwriter","autosizecolumn", __ref, _column0based);}
Debug.locals.put("Column0Based", _column0based);
 BA.debugLineNum = 140;BA.debugLine="Public Sub AutoSizeColumn (Column0Based As Int) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="jsheet.RunMethod(\"autoSizeColumn\", Array(Column0B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("autoSizeColumn")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_column0based)})));
 BA.debugLineNum = 142;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkifstyleexists(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("CheckIfStyleExists (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("checkifstyleexists")) { return __ref.runUserSub(false, "xlsheetwriter","checkifstyleexists", __ref, _props);}
RemoteObject _empty = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellStyleWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("props", _props);
 BA.debugLineNum = 334;BA.debugLine="Private Sub CheckIfStyleExists (props As Map) As P";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 335;BA.debugLine="Dim empty As PoiCellStyle";
Debug.JustUpdateDeviceLine();
_empty = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellStyleWrapper");Debug.locals.put("empty", _empty);
 BA.debugLineNum = 336;BA.debugLine="For Each m As Map In Workbook.InternalStylesCache";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstylescache" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group2.runMethod(false,"Get",index2));Debug.locals.put("m", _m);
Debug.locals.put("m", _m);
 BA.debugLineNum = 337;BA.debugLine="If IsMapTheSameAsProps(m, props) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_ismapthesameasprops" /*RemoteObject*/ ,(Object)(_m),(Object)(_props)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 338;BA.debugLine="Return Workbook.InternalStylesCache.Get(m)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PoiCellStyleWrapper"), __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstylescache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_m.getObject()))));
 };
 }
}Debug.locals.put("m", _m);
;
 BA.debugLineNum = 341;BA.debugLine="Return empty";
Debug.JustUpdateDeviceLine();
if (true) return _empty;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Public PoiSheet As PoiSheet";
xlsheetwriter._poisheet = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiSheetWrapper");__ref.setField("_poisheet",xlsheetwriter._poisheet);
 //BA.debugLineNum = 3;BA.debugLine="Public xl As XLUtils";
xlsheetwriter._xl = RemoteObject.createNew ("b4j.example.xlutils");__ref.setField("_xl",xlsheetwriter._xl);
 //BA.debugLineNum = 5;BA.debugLine="Public LastAccessed As XLAddress";
xlsheetwriter._lastaccessed = RemoteObject.createNew ("b4j.example.xlutils._xladdress");__ref.setField("_lastaccessed",xlsheetwriter._lastaccessed);
 //BA.debugLineNum = 6;BA.debugLine="Private jsheet As JavaObject";
xlsheetwriter._jsheet = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jsheet",xlsheetwriter._jsheet);
 //BA.debugLineNum = 7;BA.debugLine="Public Workbook As XLWorkbookWriter";
xlsheetwriter._workbook = RemoteObject.createNew ("b4j.example.xlworkbookwriter");__ref.setField("_workbook",xlsheetwriter._workbook);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createconditionalformattingrule(RemoteObject __ref,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("CreateConditionalFormattingRule (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("createconditionalformattingrule")) { return __ref.runUserSub(false, "xlsheetwriter","createconditionalformattingrule", __ref, _formula);}
RemoteObject _x = RemoteObject.declareNull("b4j.example.xlconditionalformattingrule");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Formula", _formula);
 BA.debugLineNum = 210;BA.debugLine="Public Sub CreateConditionalFormattingRule(Formula";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="Dim x As XLConditionalFormattingRule";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createNew ("b4j.example.xlconditionalformattingrule");Debug.locals.put("x", _x);
 BA.debugLineNum = 212;BA.debugLine="Dim m As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 213;BA.debugLine="x.Initialize(m.RunMethod(\"createConditionalFormat";
Debug.JustUpdateDeviceLine();
_x.runClassMethod (b4j.example.xlconditionalformattingrule.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _m.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createConditionalFormattingRule")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getsheetconditionalformatting" /*RemoteObject*/ ).getObject()),(_formula)})))));
 BA.debugLineNum = 214;BA.debugLine="Return x";
Debug.JustUpdateDeviceLine();
if (true) return _x;
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfreezepane(RemoteObject __ref,RemoteObject _numberofcolumns,RemoteObject _numberofrows) throws Exception{
try {
		Debug.PushSubsStack("CreateFreezePane (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("createfreezepane")) { return __ref.runUserSub(false, "xlsheetwriter","createfreezepane", __ref, _numberofcolumns, _numberofrows);}
Debug.locals.put("NumberOfColumns", _numberofcolumns);
Debug.locals.put("NumberOfRows", _numberofrows);
 BA.debugLineNum = 147;BA.debugLine="Public Sub CreateFreezePane (NumberOfColumns As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="jsheet.RunMethod(\"createFreezePane\", Array(Number";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("createFreezePane")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_numberofcolumns),(_numberofrows)})));
 BA.debugLineNum = 149;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createhyperlink(RemoteObject __ref,RemoteObject _address,RemoteObject _hyperlinktype,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("CreateHyperlink (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("createhyperlink")) { return __ref.runUserSub(false, "xlsheetwriter","createhyperlink", __ref, _address, _hyperlinktype, _url);}
RemoteObject _link = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jcell = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Address", _address);
Debug.locals.put("HyperlinkType", _hyperlinktype);
Debug.locals.put("URL", _url);
 BA.debugLineNum = 176;BA.debugLine="Public Sub CreateHyperlink (Address As XLAddress,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="Dim link As JavaObject = Workbook.jWorkbook.RunMe";
Debug.JustUpdateDeviceLine();
_link = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_link = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getCreationHelper")),(Object)((xlsheetwriter.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createHyperlink")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_hyperlinktype)}))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 178;BA.debugLine="link.RunMethod(\"setAddress\", Array(URL))";
Debug.JustUpdateDeviceLine();
_link.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAddress")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_url)})));
 BA.debugLineNum = 179;BA.debugLine="Dim jcell As JavaObject = GetCell(Address)";
Debug.JustUpdateDeviceLine();
_jcell = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jcell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address)).getObject());Debug.locals.put("jcell", _jcell);Debug.locals.put("jcell", _jcell);
 BA.debugLineNum = 180;BA.debugLine="jcell.RunMethod(\"setHyperlink\", Array(link))";
Debug.JustUpdateDeviceLine();
_jcell.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHyperlink")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_link.getObject())})));
 BA.debugLineNum = 181;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstyle(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("CreateStyle (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("createstyle")) { return __ref.runUserSub(false, "xlsheetwriter","createstyle", __ref, _props);}
RemoteObject _style = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellStyleWrapper");
RemoteObject _jstyle = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("props", _props);
 BA.debugLineNum = 317;BA.debugLine="Private Sub CreateStyle (props As Map) As PoiCellS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 318;BA.debugLine="Dim style As PoiCellStyle = CheckIfStyleExists (p";
Debug.JustUpdateDeviceLine();
_style = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellStyleWrapper");
_style = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_checkifstyleexists" /*RemoteObject*/ ,(Object)(_props));Debug.locals.put("style", _style);Debug.locals.put("style", _style);
 BA.debugLineNum = 319;BA.debugLine="If style.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_style.runMethod(true,"IsInitialized"),xlsheetwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 320;BA.debugLine="style.Initialize(Workbook.PoiWorkbook)";
Debug.JustUpdateDeviceLine();
_style.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_poiworkbook" /*RemoteObject*/ )));
 BA.debugLineNum = 321;BA.debugLine="Workbook.InternalStylesCache.Put(props, style)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstylescache" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_props.getObject())),(Object)((_style.getObject())));
 BA.debugLineNum = 322;BA.debugLine="Dim jstyle As JavaObject = style";
Debug.JustUpdateDeviceLine();
_jstyle = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jstyle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _style.getObject());Debug.locals.put("jstyle", _jstyle);Debug.locals.put("jstyle", _jstyle);
 BA.debugLineNum = 323;BA.debugLine="For Each key As String In props.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _props.runMethod(false,"Keys");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 324;BA.debugLine="If key = \"setFont\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_key,BA.ObjectToString("setFont"))) { 
 BA.debugLineNum = 325;BA.debugLine="jstyle.RunMethod(key, Array(Workbook.jWorkbook";
Debug.JustUpdateDeviceLine();
_jstyle.runVoidMethod ("RunMethod",(Object)(_key),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFontAt")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_props.runMethod(false,"Get",(Object)((_key)))})))})));
 }else {
 BA.debugLineNum = 327;BA.debugLine="jstyle.RunMethod(key, Array(props.Get(key)))";
Debug.JustUpdateDeviceLine();
_jstyle.runVoidMethod ("RunMethod",(Object)(_key),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_props.runMethod(false,"Get",(Object)((_key)))})));
 };
 }
}Debug.locals.put("key", _key);
;
 };
 BA.debugLineNum = 331;BA.debugLine="Return style";
Debug.JustUpdateDeviceLine();
if (true) return _style;
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject __ref,RemoteObject _range,RemoteObject _tablename,RemoteObject _stylename) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "xlsheetwriter","createtable", __ref, _range, _tablename, _stylename);}
RemoteObject _areareference = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _t = RemoteObject.declareNull("b4j.example.xltable");
Debug.locals.put("Range", _range);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("StyleName", _stylename);
 BA.debugLineNum = 248;BA.debugLine="Public Sub CreateTable (Range As XLRange, TableNam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="If Workbook.IsXLSX = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(true,"_isxlsx" /*RemoteObject*/ ),xlsheetwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 250;BA.debugLine="Log(\"Tables are supported in XLSX only.\")";
Debug.JustUpdateDeviceLine();
xlsheetwriter.__c.runVoidMethod ("LogImpl","911206658",RemoteObject.createImmutable("Tables are supported in XLSX only."),0);
 BA.debugLineNum = 251;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (xlsheetwriter.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 253;BA.debugLine="If ValidateTableName(TableName) = False Then Retu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_validatetablename" /*RemoteObject*/ ,(Object)(_tablename)),xlsheetwriter.__c.getField(true,"False"))) { 
if (true) return (xlsheetwriter.__c.getField(false,"Null"));};
 BA.debugLineNum = 254;BA.debugLine="Range.Sheet = PoiSheet";
Debug.JustUpdateDeviceLine();
_range.setField ("Sheet" /*RemoteObject*/ ,__ref.getField(false,"_poisheet" /*RemoteObject*/ ));
 BA.debugLineNum = 255;BA.debugLine="Dim AreaReference As JavaObject = xl.XLRangeToAre";
Debug.JustUpdateDeviceLine();
_areareference = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_areareference = __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_xlrangetoareareference" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_workbook" /*RemoteObject*/ )),(Object)(_range));Debug.locals.put("AreaReference", _areareference);Debug.locals.put("AreaReference", _areareference);
 BA.debugLineNum = 256;BA.debugLine="Dim Table As JavaObject = jsheet.RunMethod(\"creat";
Debug.JustUpdateDeviceLine();
_table = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_table = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jsheet" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createTable")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_areareference.getObject())}))));Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 257;BA.debugLine="Table.RunMethod(\"setName\", Array(TableName))";
Debug.JustUpdateDeviceLine();
_table.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_tablename)})));
 BA.debugLineNum = 258;BA.debugLine="Table.RunMethod(\"setStyleName\", Array(StyleName))";
Debug.JustUpdateDeviceLine();
_table.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyleName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_stylename)})));
 BA.debugLineNum = 259;BA.debugLine="Dim t As XLTable";
Debug.JustUpdateDeviceLine();
_t = RemoteObject.createNew ("b4j.example.xltable");Debug.locals.put("t", _t);
 BA.debugLineNum = 260;BA.debugLine="t.Initialize(Table, Me)";
Debug.JustUpdateDeviceLine();
_t.runClassMethod (b4j.example.xltable.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_table),(Object)((__ref)));
 BA.debugLineNum = 261;BA.debugLine="Return t";
Debug.JustUpdateDeviceLine();
if (true) return _t;
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillstylefromcell(RemoteObject __ref,RemoteObject _props,RemoteObject _cellstyle) throws Exception{
try {
		Debug.PushSubsStack("FillStyleFromCell (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("fillstylefromcell")) { return __ref.runUserSub(false, "xlsheetwriter","fillstylefromcell", __ref, _props, _cellstyle);}
RemoteObject _jstyle = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _methods = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _method = RemoteObject.createImmutable("");
Debug.locals.put("props", _props);
Debug.locals.put("CellStyle", _cellstyle);
 BA.debugLineNum = 304;BA.debugLine="Private Sub FillStyleFromCell (props As Map, CellS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 305;BA.debugLine="Dim jStyle As JavaObject = CellStyle";
Debug.JustUpdateDeviceLine();
_jstyle = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jstyle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _cellstyle.getObject());Debug.locals.put("jStyle", _jstyle);Debug.locals.put("jStyle", _jstyle);
 BA.debugLineNum = 306;BA.debugLine="For Each methods As List In Workbook.InternalAllS";
Debug.JustUpdateDeviceLine();
_methods = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
{
final RemoteObject group2 = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalallsimplemethods" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_methods = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), group2.runMethod(false,"Get",index2));Debug.locals.put("methods", _methods);
Debug.locals.put("methods", _methods);
 BA.debugLineNum = 307;BA.debugLine="For Each method As String In methods";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _methods;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("method", _method);
Debug.locals.put("method", _method);
 BA.debugLineNum = 308;BA.debugLine="props.Put(method, jStyle.RunMethod(\"g\" & method";
Debug.JustUpdateDeviceLine();
_props.runVoidMethod ("Put",(Object)((_method)),(Object)(_jstyle.runMethod(false,"RunMethod",(Object)(RemoteObject.concat(RemoteObject.createImmutable("g"),_method.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))))),(Object)((xlsheetwriter.__c.getField(false,"Null"))))));
 }
}Debug.locals.put("method", _method);
;
 }
}Debug.locals.put("methods", _methods);
;
 BA.debugLineNum = 311;BA.debugLine="props.Put(\"setFont\", jStyle.RunMethod(\"getFontInd";
Debug.JustUpdateDeviceLine();
_props.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("setFont"))),(Object)(_jstyle.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFontIndex")),(Object)((xlsheetwriter.__c.getField(false,"Null"))))));
 BA.debugLineNum = 312;BA.debugLine="For Each method As String In Workbook.InternalSty";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstylestrings" /*RemoteObject*/ );
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_method = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("method", _method);
Debug.locals.put("method", _method);
 BA.debugLineNum = 313;BA.debugLine="props.Put(method, jStyle.RunMethodJO(\"g\" & metho";
Debug.JustUpdateDeviceLine();
_props.runVoidMethod ("Put",(Object)((_method)),(Object)(_jstyle.runMethod(false,"RunMethodJO",(Object)(RemoteObject.concat(RemoteObject.createImmutable("g"),_method.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))))),(Object)((xlsheetwriter.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((xlsheetwriter.__c.getField(false,"Null"))))));
 }
}Debug.locals.put("method", _method);
;
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getactivecell(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getActiveCell (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("getactivecell")) { return __ref.runUserSub(false, "xlsheetwriter","getactivecell", __ref);}
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlutils._xladdress");
RemoteObject _celladdress = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 153;BA.debugLine="Public Sub getActiveCell As XLAddress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="Dim res As XLAddress";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("b4j.example.xlutils._xladdress");Debug.locals.put("res", _res);
 BA.debugLineNum = 155;BA.debugLine="Dim celladdress As JavaObject = jsheet.RunMethod(";
Debug.JustUpdateDeviceLine();
_celladdress = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_celladdress = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jsheet" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getActiveCell")),(Object)((xlsheetwriter.__c.getField(false,"Null")))));Debug.locals.put("celladdress", _celladdress);Debug.locals.put("celladdress", _celladdress);
 BA.debugLineNum = 156;BA.debugLine="If celladdress.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_celladdress.runMethod(true,"IsInitialized"),xlsheetwriter.__c.getField(true,"False"))) { 
if (true) return _res;};
 BA.debugLineNum = 157;BA.debugLine="Return xl.AddressZero(celladdress.RunMethod(\"getC";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _celladdress.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getColumn")),(Object)((xlsheetwriter.__c.getField(false,"Null")))))),(Object)(BA.numberCast(int.class, _celladdress.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRow")),(Object)((xlsheetwriter.__c.getField(false,"Null")))))));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcell(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("GetCell (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("getcell")) { return __ref.runUserSub(false, "xlsheetwriter","getcell", __ref, _address);}
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiRowWrapper");
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
Debug.locals.put("Address", _address);
 BA.debugLineNum = 108;BA.debugLine="Public Sub GetCell (Address As XLAddress) As PoiCe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Dim row As PoiRow = GetRow(Address)";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_row = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getrow" /*RemoteObject*/ ,(Object)(_address));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 110;BA.debugLine="Dim Cell As PoiCell = row.GetCell(Address.Col0Bas";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = _row.runMethod(false,"GetCell",(Object)(_address.getField(true,"Col0Based" /*RemoteObject*/ )));Debug.locals.put("Cell", _cell);Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 111;BA.debugLine="If Cell.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cell.runMethod(true,"IsInitialized"),xlsheetwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 112;BA.debugLine="Cell = row.CreateCellBlank(Address.Col0Based)";
Debug.JustUpdateDeviceLine();
_cell = _row.runMethod(false,"CreateCellBlank",(Object)(_address.getField(true,"Col0Based" /*RemoteObject*/ )));Debug.locals.put("Cell", _cell);
 };
 BA.debugLineNum = 114;BA.debugLine="LastAccessed = Address";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastaccessed" /*RemoteObject*/ ,_address);
 BA.debugLineNum = 115;BA.debugLine="Return Cell";
Debug.JustUpdateDeviceLine();
if (true) return _cell;
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprintarea(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPrintArea (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("getprintarea")) { return __ref.runUserSub(false, "xlsheetwriter","getprintarea", __ref);}
RemoteObject _ref = RemoteObject.declareNull("Object");
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlutils._xlrange");
 BA.debugLineNum = 392;BA.debugLine="Public Sub getPrintArea As XLRange";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 393;BA.debugLine="Dim ref As Object = Workbook.jWorkbook.RunMethod(";
Debug.JustUpdateDeviceLine();
_ref = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPrintArea")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_poisheet" /*RemoteObject*/ ).runMethod(true,"getIndex"))})));Debug.locals.put("ref", _ref);Debug.locals.put("ref", _ref);
 BA.debugLineNum = 394;BA.debugLine="If ref = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_ref)) { 
 BA.debugLineNum = 395;BA.debugLine="Dim res As XLRange";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("b4j.example.xlutils._xlrange");Debug.locals.put("res", _res);
 BA.debugLineNum = 396;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 };
 BA.debugLineNum = 398;BA.debugLine="Return xl.RangeStringOrNameToRange(Workbook.PoiWo";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_rangestringornametorange" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_poiworkbook" /*RemoteObject*/ )),(Object)(BA.ObjectToString(_ref)));
 BA.debugLineNum = 399;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprintsetup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPrintSetup (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("getprintsetup")) { return __ref.runUserSub(false, "xlsheetwriter","getprintsetup", __ref);}
 BA.debugLineNum = 413;BA.debugLine="Public Sub getPrintSetup As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 414;BA.debugLine="Return jsheet.RunMethod(\"getPrintSetup\", Null)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jsheet" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPrintSetup")),(Object)((xlsheetwriter.__c.getField(false,"Null")))));
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrow(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("GetRow (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("getrow")) { return __ref.runUserSub(false, "xlsheetwriter","getrow", __ref, _address);}
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiRowWrapper");
Debug.locals.put("Address", _address);
 BA.debugLineNum = 118;BA.debugLine="Public Sub GetRow (Address As XLAddress) As PoiRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Dim row As PoiRow = PoiSheet.GetRow(Address.Row0B";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_row = __ref.getField(false,"_poisheet" /*RemoteObject*/ ).runMethod(false,"GetRow",(Object)(_address.getField(true,"Row0Based" /*RemoteObject*/ )));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 120;BA.debugLine="If row.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_row.runMethod(true,"IsInitialized"),xlsheetwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 121;BA.debugLine="row = PoiSheet.CreateRow(Address.Row0Based)";
Debug.JustUpdateDeviceLine();
_row = __ref.getField(false,"_poisheet" /*RemoteObject*/ ).runMethod(false,"CreateRow",(Object)(_address.getField(true,"Row0Based" /*RemoteObject*/ )));Debug.locals.put("row", _row);
 };
 BA.debugLineNum = 123;BA.debugLine="Return row";
Debug.JustUpdateDeviceLine();
if (true) return _row;
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsheetconditionalformatting(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSheetConditionalFormatting (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("getsheetconditionalformatting")) { return __ref.runUserSub(false, "xlsheetwriter","getsheetconditionalformatting", __ref);}
 BA.debugLineNum = 225;BA.debugLine="Private Sub GetSheetConditionalFormatting As JavaO";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 226;BA.debugLine="Return jsheet.RunMethod(\"getSheetConditionalForma";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jsheet" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSheetConditionalFormatting")),(Object)((xlsheetwriter.__c.getField(false,"Null")))));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettables(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTables (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("gettables")) { return __ref.runUserSub(false, "xlsheetwriter","gettables", __ref);}
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _j = RemoteObject.declareNull("Object");
RemoteObject _table = RemoteObject.declareNull("b4j.example.xltable");
 BA.debugLineNum = 265;BA.debugLine="Public Sub GetTables As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 266;BA.debugLine="Dim t As List = jsheet.RunMethod(\"getTables\", Nul";
Debug.JustUpdateDeviceLine();
_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_t = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_jsheet" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTables")),(Object)((xlsheetwriter.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 267;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 268;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 269;BA.debugLine="For Each j As Object In t";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _t;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_j = group4.runMethod(false,"Get",index4);Debug.locals.put("j", _j);
Debug.locals.put("j", _j);
 BA.debugLineNum = 270;BA.debugLine="Dim table As XLTable";
Debug.JustUpdateDeviceLine();
_table = RemoteObject.createNew ("b4j.example.xltable");Debug.locals.put("table", _table);
 BA.debugLineNum = 271;BA.debugLine="table.Initialize(j, Me)";
Debug.JustUpdateDeviceLine();
_table.runClassMethod (b4j.example.xltable.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _j),(Object)((__ref)));
 BA.debugLineNum = 272;BA.debugLine="res.Add(table)";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((_table)));
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 274;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _groupcolumns(RemoteObject __ref,RemoteObject _fromcolumn0,RemoteObject _tocolumn0,RemoteObject _collapse) throws Exception{
try {
		Debug.PushSubsStack("GroupColumns (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("groupcolumns")) { return __ref.runUserSub(false, "xlsheetwriter","groupcolumns", __ref, _fromcolumn0, _tocolumn0, _collapse);}
Debug.locals.put("FromColumn0", _fromcolumn0);
Debug.locals.put("ToColumn0", _tocolumn0);
Debug.locals.put("Collapse", _collapse);
 BA.debugLineNum = 185;BA.debugLine="Public Sub GroupColumns (FromColumn0 As Int, ToCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 186;BA.debugLine="jsheet.RunMethod(\"groupColumn\", Array (FromColumn";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("groupColumn")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fromcolumn0),(_tocolumn0)})));
 BA.debugLineNum = 187;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setColumnGroup";
Debug.JustUpdateDeviceLine();
if (_collapse.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColumnGroupCollapsed")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fromcolumn0),(_collapse)})));};
 BA.debugLineNum = 188;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grouprows(RemoteObject __ref,RemoteObject _fromrow0,RemoteObject _torow0,RemoteObject _collapse) throws Exception{
try {
		Debug.PushSubsStack("GroupRows (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("grouprows")) { return __ref.runUserSub(false, "xlsheetwriter","grouprows", __ref, _fromrow0, _torow0, _collapse);}
Debug.locals.put("FromRow0", _fromrow0);
Debug.locals.put("ToRow0", _torow0);
Debug.locals.put("Collapse", _collapse);
 BA.debugLineNum = 191;BA.debugLine="Public Sub GroupRows (FromRow0 As Int, ToRow0 As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="jsheet.RunMethod(\"groupRow\", Array(FromRow0, ToRo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("groupRow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fromrow0),(_torow0)})));
 BA.debugLineNum = 193;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setRowGroupCol";
Debug.JustUpdateDeviceLine();
if (_collapse.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setRowGroupCollapsed")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fromrow0),(_collapse)})));};
 BA.debugLineNum = 194;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vxl,RemoteObject _vworkbookwriter,RemoteObject _vsheet) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xlsheetwriter","initialize", __ref, _ba, _vxl, _vworkbookwriter, _vsheet);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vxl", _vxl);
Debug.locals.put("vWorkbookWriter", _vworkbookwriter);
Debug.locals.put("vSheet", _vsheet);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (vxl As XLUtils, vWorkbookWr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="PoiSheet = vSheet";
Debug.JustUpdateDeviceLine();
__ref.setField ("_poisheet" /*RemoteObject*/ ,_vsheet);
 BA.debugLineNum = 13;BA.debugLine="xl = vxl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xl" /*RemoteObject*/ ,_vxl);
 BA.debugLineNum = 14;BA.debugLine="Workbook = vWorkbookWriter";
Debug.JustUpdateDeviceLine();
__ref.setField ("_workbook" /*RemoteObject*/ ,_vworkbookwriter);
 BA.debugLineNum = 15;BA.debugLine="jsheet = PoiSheet";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).setObject (__ref.getField(false,"_poisheet" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _internalsetstylestorange(RemoteObject __ref,RemoteObject _range,RemoteObject _styles,RemoteObject _add) throws Exception{
try {
		Debug.PushSubsStack("InternalSetStylesToRange (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("internalsetstylestorange")) { return __ref.runUserSub(false, "xlsheetwriter","internalsetstylestorange", __ref, _range, _styles, _add);}
RemoteObject _props = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _col = 0;
int _row = 0;
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
Debug.locals.put("Range", _range);
Debug.locals.put("Styles", _styles);
Debug.locals.put("Add", _add);
 BA.debugLineNum = 89;BA.debugLine="Private Sub InternalSetStylesToRange (Range As XLR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Dim props As Map = MergeStyles(Styles)";
Debug.JustUpdateDeviceLine();
_props = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_props = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_mergestyles" /*RemoteObject*/ ,(Object)(_styles));Debug.locals.put("props", _props);Debug.locals.put("props", _props);
 BA.debugLineNum = 91;BA.debugLine="For col = Range.FirstAddress.Col0Based To Range.S";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = _range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ).<Integer>get().intValue();
_col = _range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step2 > 0 && _col <= limit2) || (step2 < 0 && _col >= limit2) ;_col = ((int)(0 + _col + step2))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 92;BA.debugLine="For row = Range.FirstAddress.Row0Based To Range.";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = _range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ).<Integer>get().intValue();
_row = _range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step3 > 0 && _row <= limit3) || (step3 < 0 && _row >= limit3) ;_row = ((int)(0 + _row + step3))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 93;BA.debugLine="Dim cell As PoiCell = GetCell(xl.AddressZero(co";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _col)),(Object)(BA.numberCast(int.class, _row)))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 94;BA.debugLine="ApplyStyle(cell, Add, props)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_applystyle" /*RemoteObject*/ ,(Object)(_cell),(Object)(_add),(Object)(_props));
 }
}Debug.locals.put("row", _row);
;
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 97;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ismapthesameasprops(RemoteObject __ref,RemoteObject _m,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("IsMapTheSameAsProps (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("ismapthesameasprops")) { return __ref.runUserSub(false, "xlsheetwriter","ismapthesameasprops", __ref, _m, _props);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(false);
RemoteObject _s = RemoteObject.createImmutable((short)0);
RemoteObject _t = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 344;BA.debugLine="Private Sub IsMapTheSameAsProps (m As Map, Props A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 345;BA.debugLine="If m.Size = Props.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"getSize"),BA.numberCast(double.class, _props.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 346;BA.debugLine="For Each key As String In Props.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _props.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 347;BA.debugLine="If m.ContainsKey(key) = False Then Return False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"ContainsKey",(Object)((_key))),xlsheetwriter.__c.getField(true,"False"))) { 
if (true) return xlsheetwriter.__c.getField(true,"False");};
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 349;BA.debugLine="For Each key As String In Workbook.InternalStyle";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstyleints" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 350;BA.debugLine="If Props.ContainsKey(key) Then";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((_key))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 351;BA.debugLine="Dim i As Int = Props.Get(key)";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 352;BA.debugLine="If i <> m.Get(key) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, _m.runMethod(false,"Get",(Object)((_key)))))) { 
 BA.debugLineNum = 353;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"False");
 };
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 357;BA.debugLine="For Each key As String In Workbook.InternalStyle";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group13 = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstylebooleans" /*RemoteObject*/ );
final int groupLen13 = group13.runMethod(true,"getSize").<Integer>get()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_key = BA.ObjectToString(group13.runMethod(false,"Get",index13));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 358;BA.debugLine="If Props.ContainsKey(key) Then";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((_key))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 359;BA.debugLine="Dim b As Boolean = Props.Get(key)";
Debug.JustUpdateDeviceLine();
_b = BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 360;BA.debugLine="If b <> m.Get(key) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_b,BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((_key)))))) { 
 BA.debugLineNum = 361;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"False");
 };
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 365;BA.debugLine="For Each key As String In Workbook.InternalStyle";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group21 = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstyleshorts" /*RemoteObject*/ );
final int groupLen21 = group21.runMethod(true,"getSize").<Integer>get()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_key = BA.ObjectToString(group21.runMethod(false,"Get",index21));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 366;BA.debugLine="If Props.ContainsKey(key) Then";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((_key))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 367;BA.debugLine="Dim s As Short = Props.Get(key)";
Debug.JustUpdateDeviceLine();
_s = BA.numberCast(short.class, _props.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 368;BA.debugLine="If s <> m.Get(key) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_s,BA.numberCast(double.class, _m.runMethod(false,"Get",(Object)((_key)))))) { 
 BA.debugLineNum = 369;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"False");
 };
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 373;BA.debugLine="For Each key As String In Workbook.InternalStyle";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group29 = __ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_internalstylestrings" /*RemoteObject*/ );
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_key = BA.ObjectToString(group29.runMethod(false,"Get",index29));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 374;BA.debugLine="If Props.ContainsKey(key) Then";
Debug.JustUpdateDeviceLine();
if (_props.runMethod(true,"ContainsKey",(Object)((_key))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 375;BA.debugLine="Dim t As String = Props.Get(key)";
Debug.JustUpdateDeviceLine();
_t = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 376;BA.debugLine="If t <> m.Get(key) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_t,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((_key)))))) { 
 BA.debugLineNum = 377;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"False");
 };
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 381;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"True");
 };
 BA.debugLineNum = 383;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"False");
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mergestyles(RemoteObject __ref,RemoteObject _styles) throws Exception{
try {
		Debug.PushSubsStack("MergeStyles (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("mergestyles")) { return __ref.runUserSub(false, "xlsheetwriter","mergestyles", __ref, _styles);}
RemoteObject _newprops = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _style = RemoteObject.declareNull("b4j.example.xlstyle");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("Styles", _styles);
 BA.debugLineNum = 68;BA.debugLine="Private Sub MergeStyles (Styles As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Dim NewProps As Map";
Debug.JustUpdateDeviceLine();
_newprops = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("NewProps", _newprops);
 BA.debugLineNum = 70;BA.debugLine="NewProps.Initialize";
Debug.JustUpdateDeviceLine();
_newprops.runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="For Each style As XLStyle In Styles";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _styles;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_style = (group3.runMethod(false,"Get",index3));Debug.locals.put("style", _style);
Debug.locals.put("style", _style);
 BA.debugLineNum = 72;BA.debugLine="For Each key As String In style.StyleMap.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _style.getField(false,"_stylemap" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 73;BA.debugLine="NewProps.Put(key, style.StyleMap.Get(key))";
Debug.JustUpdateDeviceLine();
_newprops.runVoidMethod ("Put",(Object)((_key)),(Object)(_style.getField(false,"_stylemap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key)))));
 }
}Debug.locals.put("key", _key);
;
 }
}Debug.locals.put("style", _style);
;
 BA.debugLineNum = 76;BA.debugLine="Return NewProps";
Debug.JustUpdateDeviceLine();
if (true) return _newprops;
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putdate(RemoteObject __ref,RemoteObject _address,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutDate (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("putdate")) { return __ref.runUserSub(false, "xlsheetwriter","putdate", __ref, _address, _value);}
Debug.locals.put("Address", _address);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 29;BA.debugLine="Public Sub PutDate (Address As XLAddress, Value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="GetCell(Address).ValueDate = Value";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address)).runMethod(true,"setValueDate",_value);
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putformula(RemoteObject __ref,RemoteObject _address,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutFormula (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("putformula")) { return __ref.runUserSub(false, "xlsheetwriter","putformula", __ref, _address, _value);}
Debug.locals.put("Address", _address);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 34;BA.debugLine="Public Sub PutFormula (Address As XLAddress, Value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="If Value.StartsWith(\"=\") Then Value = Value.SubSt";
Debug.JustUpdateDeviceLine();
if (_value.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("="))).<Boolean>get().booleanValue()) { 
_value = _value.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Value", _value);};
 BA.debugLineNum = 36;BA.debugLine="GetCell(Address).ValueFormula = Value";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address)).runMethod(true,"setValueFormula",_value);
 BA.debugLineNum = 37;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putnumber(RemoteObject __ref,RemoteObject _address,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutNumber (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("putnumber")) { return __ref.runUserSub(false, "xlsheetwriter","putnumber", __ref, _address, _value);}
Debug.locals.put("Address", _address);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 19;BA.debugLine="Public Sub PutNumber (Address As XLAddress, Value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="GetCell(Address).ValueNumeric = Value";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address)).runMethod(true,"setValueNumeric",_value);
 BA.debugLineNum = 21;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putstring(RemoteObject __ref,RemoteObject _address,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutString (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("putstring")) { return __ref.runUserSub(false, "xlsheetwriter","putstring", __ref, _address, _value);}
Debug.locals.put("Address", _address);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 24;BA.debugLine="Public Sub PutString (Address As XLAddress, Value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="GetCell(Address).ValueString = Value";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address)).runMethod(true,"setValueString",_value);
 BA.debugLineNum = 26;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removetable(RemoteObject __ref,RemoteObject _table) throws Exception{
try {
		Debug.PushSubsStack("RemoveTable (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("removetable")) { return __ref.runUserSub(false, "xlsheetwriter","removetable", __ref, _table);}
Debug.locals.put("Table", _table);
 BA.debugLineNum = 278;BA.debugLine="Public Sub RemoveTable (Table As XLTable)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 279;BA.debugLine="jsheet.RunMethod(\"removeTable\", Array(Table))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("removeTable")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_table)})));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivecell(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("setActiveCell (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("setactivecell")) { return __ref.runUserSub(false, "xlsheetwriter","setactivecell", __ref, _address);}
RemoteObject _celladdress = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Address", _address);
 BA.debugLineNum = 160;BA.debugLine="Public Sub setActiveCell (Address As XLAddress)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="Dim celladdress As JavaObject";
Debug.JustUpdateDeviceLine();
_celladdress = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("celladdress", _celladdress);
 BA.debugLineNum = 162;BA.debugLine="celladdress.InitializeNewInstance(\"org.apache.poi";
Debug.JustUpdateDeviceLine();
_celladdress.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.util.CellAddress")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_address.getField(true,"Row0Based" /*RemoteObject*/ )),(_address.getField(true,"Col0Based" /*RemoteObject*/ ))})));
 BA.debugLineNum = 163;BA.debugLine="jsheet.RunMethod(\"setActiveCell\", Array(celladdre";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setActiveCell")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_celladdress.getObject())})));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautofilter(RemoteObject __ref,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("SetAutoFilter (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("setautofilter")) { return __ref.runUserSub(false, "xlsheetwriter","setautofilter", __ref, _range);}
RemoteObject _c = RemoteObject.declareNull("Object");
Debug.locals.put("Range", _range);
 BA.debugLineNum = 167;BA.debugLine="Public Sub SetAutoFilter (Range As XLRange) As XLS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="Dim c As Object = xl.XLRangeToCellRangeAddress(Ra";
Debug.JustUpdateDeviceLine();
_c = (__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_xlrangetocellrangeaddress" /*RemoteObject*/ ,(Object)(_range)).getObject());Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 169;BA.debugLine="jsheet.RunMethod(\"setAutoFilter\", Array(c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAutoFilter")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_c})));
 BA.debugLineNum = 170;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfittopage(RemoteObject __ref,RemoteObject _pageswide,RemoteObject _pagestall) throws Exception{
try {
		Debug.PushSubsStack("SetFitToPage (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,404);
if (RapidSub.canDelegate("setfittopage")) { return __ref.runUserSub(false, "xlsheetwriter","setfittopage", __ref, _pageswide, _pagestall);}
RemoteObject _ps = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("PagesWide", _pageswide);
Debug.locals.put("PagesTall", _pagestall);
 BA.debugLineNum = 404;BA.debugLine="Public Sub SetFitToPage (PagesWide As Short, Pages";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 405;BA.debugLine="jsheet.RunMethod(\"setFitToPage\", Array(True))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFitToPage")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(xlsheetwriter.__c.getField(true,"True"))})));
 BA.debugLineNum = 406;BA.debugLine="Dim ps As JavaObject = getPrintSetup";
Debug.JustUpdateDeviceLine();
_ps = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_ps = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getprintsetup" /*RemoteObject*/ );Debug.locals.put("ps", _ps);Debug.locals.put("ps", _ps);
 BA.debugLineNum = 407;BA.debugLine="ps.RunMethod(\"setFitWidth\", Array(PagesWide))";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFitWidth")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pageswide)})));
 BA.debugLineNum = 408;BA.debugLine="ps.RunMethod(\"setFitHeight\", Array(PagesTall))";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFitHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pagestall)})));
 BA.debugLineNum = 409;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprintarea(RemoteObject __ref,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("setPrintArea (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("setprintarea")) { return __ref.runUserSub(false, "xlsheetwriter","setprintarea", __ref, _range);}
Debug.locals.put("Range", _range);
 BA.debugLineNum = 387;BA.debugLine="Public Sub setPrintArea(Range As XLRange)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 388;BA.debugLine="Workbook.jWorkbook.RunMethod(\"setPrintArea\", Arra";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(false,"_jworkbook" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPrintArea")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(__ref.getField(false,"_poisheet" /*RemoteObject*/ ).runMethod(true,"getIndex")),(_range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ )),(_range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ )),(_range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ )),(_range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ))})));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _address,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "xlsheetwriter","setstyle", __ref, _address, _style);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
Debug.locals.put("Address", _address);
Debug.locals.put("Style", _style);
 BA.debugLineNum = 41;BA.debugLine="Public Sub SetStyle (Address As XLAddress, Style A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 43;BA.debugLine="ApplyStyle(cell, False, Style.StyleMap)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_applystyle" /*RemoteObject*/ ,(Object)(_cell),(Object)(xlsheetwriter.__c.getField(true,"False")),(Object)(_style.getField(false,"_stylemap" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyles(RemoteObject __ref,RemoteObject _address,RemoteObject _styles) throws Exception{
try {
		Debug.PushSubsStack("SetStyles (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setstyles")) { return __ref.runUserSub(false, "xlsheetwriter","setstyles", __ref, _address, _styles);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
Debug.locals.put("Address", _address);
Debug.locals.put("Styles", _styles);
 BA.debugLineNum = 55;BA.debugLine="Public Sub SetStyles (Address As XLAddress, Styles";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_getcell" /*RemoteObject*/ ,(Object)(_address));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 57;BA.debugLine="ApplyStyle(cell, False, MergeStyles(Styles))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_applystyle" /*RemoteObject*/ ,(Object)(_cell),(Object)(xlsheetwriter.__c.getField(true,"False")),(Object)(__ref.runClassMethod (b4j.example.xlsheetwriter.class, "_mergestyles" /*RemoteObject*/ ,(Object)(_styles))));
 BA.debugLineNum = 58;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylestorange(RemoteObject __ref,RemoteObject _range,RemoteObject _styles) throws Exception{
try {
		Debug.PushSubsStack("SetStylesToRange (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setstylestorange")) { return __ref.runUserSub(false, "xlsheetwriter","setstylestorange", __ref, _range, _styles);}
Debug.locals.put("Range", _range);
Debug.locals.put("Styles", _styles);
 BA.debugLineNum = 80;BA.debugLine="Public Sub SetStylesToRange (Range As XLRange, Sty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Fa";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlsheetwriter.class, "_internalsetstylestorange" /*RemoteObject*/ ,(Object)(_range),(Object)(_styles),(Object)(xlsheetwriter.__c.getField(true,"False")));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shiftcolumns(RemoteObject __ref,RemoteObject _startcolumn0based,RemoteObject _endcolumn0based,RemoteObject _shiftamount) throws Exception{
try {
		Debug.PushSubsStack("ShiftColumns (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("shiftcolumns")) { return __ref.runUserSub(false, "xlsheetwriter","shiftcolumns", __ref, _startcolumn0based, _endcolumn0based, _shiftamount);}
Debug.locals.put("StartColumn0Based", _startcolumn0based);
Debug.locals.put("EndColumn0Based", _endcolumn0based);
Debug.locals.put("ShiftAmount", _shiftamount);
 BA.debugLineNum = 133;BA.debugLine="Public Sub ShiftColumns (StartColumn0Based As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="jsheet.RunMethod(\"shiftColumns\", Array(StartColum";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("shiftColumns")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_startcolumn0based),(_endcolumn0based),(_shiftamount)})));
 BA.debugLineNum = 135;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shiftrows(RemoteObject __ref,RemoteObject _startrow0based,RemoteObject _endrow0based,RemoteObject _shiftamount) throws Exception{
try {
		Debug.PushSubsStack("ShiftRows (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("shiftrows")) { return __ref.runUserSub(false, "xlsheetwriter","shiftrows", __ref, _startrow0based, _endrow0based, _shiftamount);}
Debug.locals.put("StartRow0Based", _startrow0based);
Debug.locals.put("EndRow0Based", _endrow0based);
Debug.locals.put("ShiftAmount", _shiftamount);
 BA.debugLineNum = 127;BA.debugLine="Public Sub ShiftRows (StartRow0Based As Int, EndRo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="jsheet.RunMethod(\"shiftRows\", Array(StartRow0Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("shiftRows")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_startrow0based),(_endrow0based),(_shiftamount)})));
 BA.debugLineNum = 129;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ungroupcolumns(RemoteObject __ref,RemoteObject _fromcolumn0,RemoteObject _tocolumn0) throws Exception{
try {
		Debug.PushSubsStack("UngroupColumns (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("ungroupcolumns")) { return __ref.runUserSub(false, "xlsheetwriter","ungroupcolumns", __ref, _fromcolumn0, _tocolumn0);}
Debug.locals.put("FromColumn0", _fromcolumn0);
Debug.locals.put("ToColumn0", _tocolumn0);
 BA.debugLineNum = 198;BA.debugLine="Public Sub UngroupColumns (FromColumn0 As Int, ToC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="jsheet.RunMethod(\"ungroupColumn\", Array (FromColu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("ungroupColumn")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fromcolumn0),(_tocolumn0)})));
 BA.debugLineNum = 200;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ungrouprows(RemoteObject __ref,RemoteObject _fromrow0,RemoteObject _torow0) throws Exception{
try {
		Debug.PushSubsStack("UngroupRows (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("ungrouprows")) { return __ref.runUserSub(false, "xlsheetwriter","ungrouprows", __ref, _fromrow0, _torow0);}
Debug.locals.put("FromRow0", _fromrow0);
Debug.locals.put("ToRow0", _torow0);
 BA.debugLineNum = 203;BA.debugLine="Public Sub UngroupRows (FromRow0 As Int, ToRow0 As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 204;BA.debugLine="jsheet.RunMethod(\"ungroupRow\", Array(FromRow0, To";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jsheet" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("ungroupRow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fromrow0),(_torow0)})));
 BA.debugLineNum = 205;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validatetablename(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("ValidateTableName (xlsheetwriter) ","xlsheetwriter",15,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("validatetablename")) { return __ref.runUserSub(false, "xlsheetwriter","validatetablename", __ref, _name);}
Debug.locals.put("Name", _name);
 BA.debugLineNum = 282;BA.debugLine="Public Sub ValidateTableName (Name As String) As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 283;BA.debugLine="If Regex.IsMatch(Workbook.InternalNameRegex, Name";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",xlsheetwriter.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(__ref.getField(false,"_workbook" /*RemoteObject*/ ).getField(true,"_internalnameregex" /*RemoteObject*/ )),(Object)(_name)),xlsheetwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 284;BA.debugLine="LogError(\"Invalid name: \" & Name)";
Debug.JustUpdateDeviceLine();
xlsheetwriter.__c.runVoidMethod ("LogError",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid name: "),_name)));
 BA.debugLineNum = 285;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"False");
 };
 BA.debugLineNum = 287;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return xlsheetwriter.__c.getField(true,"True");
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}