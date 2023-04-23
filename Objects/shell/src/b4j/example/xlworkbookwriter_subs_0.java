package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xlworkbookwriter_subs_0 {


public static RemoteObject  _addnamedrange(RemoteObject __ref,RemoteObject _name,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("AddNamedRange (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("addnamedrange")) { return __ref.runUserSub(false, "xlworkbookwriter","addnamedrange", __ref, _name, _range);}
RemoteObject _cellrangeaddress = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jname = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Name", _name);
Debug.locals.put("Range", _range);
 BA.debugLineNum = 149;BA.debugLine="Public Sub AddNamedRange (Name As String, Range As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="RemoveNamedRange(Name)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlworkbookwriter.class, "_removenamedrange" /*RemoteObject*/ ,(Object)(_name));
 BA.debugLineNum = 151;BA.debugLine="If Range.Sheet.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),xlworkbookwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 152;BA.debugLine="LogError(\"Range.Sheet must me set. Use xl.Create";
Debug.JustUpdateDeviceLine();
xlworkbookwriter.__c.runVoidMethod ("LogError",(Object)(RemoteObject.createImmutable("Range.Sheet must me set. Use xl.CreateXLRangeWithSheet!")));
 };
 BA.debugLineNum = 154;BA.debugLine="Dim CellRangeAddress As JavaObject = xl.XLRangeTo";
Debug.JustUpdateDeviceLine();
_cellrangeaddress = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_cellrangeaddress = __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_xlrangetocellrangeaddress" /*RemoteObject*/ ,(Object)(_range));Debug.locals.put("CellRangeAddress", _cellrangeaddress);Debug.locals.put("CellRangeAddress", _cellrangeaddress);
 BA.debugLineNum = 155;BA.debugLine="Dim jname As JavaObject = CreateName(Name, CellRa";
Debug.JustUpdateDeviceLine();
_jname = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jname = __ref.runClassMethod (b4j.example.xlworkbookwriter.class, "_createname" /*RemoteObject*/ ,(Object)(_name),(Object)(BA.ObjectToString(_cellrangeaddress.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("formatAsString")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(true,"getName")),(xlworkbookwriter.__c.getField(true,"True"))}))))));Debug.locals.put("jname", _jname);Debug.locals.put("jname", _jname);
 BA.debugLineNum = 156;BA.debugLine="Return jname";
Debug.JustUpdateDeviceLine();
if (true) return _jname;
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addnamedrangeoffset(RemoteObject __ref,RemoteObject _name,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("AddNamedRangeOffset (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("addnamedrangeoffset")) { return __ref.runUserSub(false, "xlworkbookwriter","addnamedrangeoffset", __ref, _name, _range);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("Name", _name);
Debug.locals.put("Range", _range);
 BA.debugLineNum = 173;BA.debugLine="Public Sub AddNamedRangeOffset (Name As String, Ra";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 174;BA.debugLine="RemoveNamedRange(Name)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlworkbookwriter.class, "_removenamedrange" /*RemoteObject*/ ,(Object)(_name));
 BA.debugLineNum = 175;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 176;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 177;BA.debugLine="sb.Append(\"OFFSET(\").Append(xl.XLAddressToCellRef";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("OFFSET("))).runVoidMethod ("Append",(Object)(BA.ObjectToString(__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_xladdresstocellreference" /*RemoteObject*/ ,(Object)(_range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(true,"getName")),(Object)(_range.getField(false,"FirstAddress" /*RemoteObject*/ ))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("formatAsString")),(Object)((xlworkbookwriter.__c.getField(false,"Null")))))));
 BA.debugLineNum = 178;BA.debugLine="sb.Append(\", 0, 0, \").Append(Range.SecondAddress.";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(", 0, 0, "))).runMethod(false,"Append",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ),_range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-+",2, 1)))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 179;BA.debugLine="sb.Append(Range.SecondAddress.Col0Based - Range.F";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ),_range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-+",2, 1)))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 180;BA.debugLine="CreateName(Name, sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlworkbookwriter.class, "_createname" /*RemoteObject*/ ,(Object)(_name),(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addnamedrangescoped(RemoteObject __ref,RemoteObject _name,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("AddNamedRangeScoped (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("addnamedrangescoped")) { return __ref.runUserSub(false, "xlworkbookwriter","addnamedrangescoped", __ref, _name, _range);}
RemoteObject _jname = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Name", _name);
Debug.locals.put("Range", _range);
 BA.debugLineNum = 167;BA.debugLine="Public Sub AddNamedRangeScoped (Name As String, Ra";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="Dim jName As JavaObject = AddNamedRange(Name, Ran";
Debug.JustUpdateDeviceLine();
_jname = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jname = __ref.runClassMethod (b4j.example.xlworkbookwriter.class, "_addnamedrange" /*RemoteObject*/ ,(Object)(_name),(Object)(_range));Debug.locals.put("jName", _jname);Debug.locals.put("jName", _jname);
 BA.debugLineNum = 169;BA.debugLine="jName.RunMethod(\"setSheetIndex\", Array(Range.Shee";
Debug.JustUpdateDeviceLine();
_jname.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSheetIndex")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(true,"getIndex"))})));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Public PoiWorkbook As PoiWorkbook";
xlworkbookwriter._poiworkbook = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");__ref.setField("_poiworkbook",xlworkbookwriter._poiworkbook);
 //BA.debugLineNum = 3;BA.debugLine="Public xl As XLUtils";
xlworkbookwriter._xl = RemoteObject.createNew ("b4j.example.xlutils");__ref.setField("_xl",xlworkbookwriter._xl);
 //BA.debugLineNum = 4;BA.debugLine="Private FromTemplate As Boolean 'ignore";
xlworkbookwriter._fromtemplate = RemoteObject.createImmutable(false);__ref.setField("_fromtemplate",xlworkbookwriter._fromtemplate);
 //BA.debugLineNum = 5;BA.debugLine="Public jWorkbook As JavaObject";
xlworkbookwriter._jworkbook = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jworkbook",xlworkbookwriter._jworkbook);
 //BA.debugLineNum = 6;BA.debugLine="Public MaxRows, MaxColumns As Int";
xlworkbookwriter._maxrows = RemoteObject.createImmutable(0);__ref.setField("_maxrows",xlworkbookwriter._maxrows);
xlworkbookwriter._maxcolumns = RemoteObject.createImmutable(0);__ref.setField("_maxcolumns",xlworkbookwriter._maxcolumns);
 //BA.debugLineNum = 7;BA.debugLine="Private mVersionName As String";
xlworkbookwriter._mversionname = RemoteObject.createImmutable("");__ref.setField("_mversionname",xlworkbookwriter._mversionname);
 //BA.debugLineNum = 8;BA.debugLine="Public IsXLSX As Boolean";
xlworkbookwriter._isxlsx = RemoteObject.createImmutable(false);__ref.setField("_isxlsx",xlworkbookwriter._isxlsx);
 //BA.debugLineNum = 9;BA.debugLine="Public DefaultFontName As String";
xlworkbookwriter._defaultfontname = RemoteObject.createImmutable("");__ref.setField("_defaultfontname",xlworkbookwriter._defaultfontname);
 //BA.debugLineNum = 10;BA.debugLine="Public DefaultFontSize As Short";
xlworkbookwriter._defaultfontsize = RemoteObject.createImmutable((short)0);__ref.setField("_defaultfontsize",xlworkbookwriter._defaultfontsize);
 //BA.debugLineNum = 11;BA.debugLine="Public DefaultExtension As String";
xlworkbookwriter._defaultextension = RemoteObject.createImmutable("");__ref.setField("_defaultextension",xlworkbookwriter._defaultextension);
 //BA.debugLineNum = 12;BA.debugLine="Public InternalStylesCache As Map";
xlworkbookwriter._internalstylescache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_internalstylescache",xlworkbookwriter._internalstylescache);
 //BA.debugLineNum = 13;BA.debugLine="Public InternalStyleShorts As List = Array(\"setBo";
xlworkbookwriter._internalstyleshorts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
xlworkbookwriter._internalstyleshorts = xlworkbookwriter.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {9},new Object[] {RemoteObject.createImmutable(("setBottomBorderColor")),RemoteObject.createImmutable(("setLeftBorderColor")),RemoteObject.createImmutable(("setRightBorderColor")),RemoteObject.createImmutable(("setTopBorderColor")),RemoteObject.createImmutable(("setFillForegroundColor")),RemoteObject.createImmutable(("setFillBackgroundColor")),RemoteObject.createImmutable(("setIndention")),RemoteObject.createImmutable(("setDataFormat")),(RemoteObject.createImmutable("setRotation"))})));__ref.setField("_internalstyleshorts",xlworkbookwriter._internalstyleshorts);
 //BA.debugLineNum = 14;BA.debugLine="Public InternalStyleBooleans As List = Array(\"set";
xlworkbookwriter._internalstylebooleans = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
xlworkbookwriter._internalstylebooleans = xlworkbookwriter.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("setLocked")),RemoteObject.createImmutable(("setHidden")),(RemoteObject.createImmutable("setWrapText"))})));__ref.setField("_internalstylebooleans",xlworkbookwriter._internalstylebooleans);
 //BA.debugLineNum = 15;BA.debugLine="Public InternalStyleInts As List = Array(\"setFont";
xlworkbookwriter._internalstyleints = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
xlworkbookwriter._internalstyleints = xlworkbookwriter.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("setFont"))})));__ref.setField("_internalstyleints",xlworkbookwriter._internalstyleints);
 //BA.debugLineNum = 16;BA.debugLine="Public InternalStyleStrings As List = Array(\"setB";
xlworkbookwriter._internalstylestrings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
xlworkbookwriter._internalstylestrings = xlworkbookwriter.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {RemoteObject.createImmutable(("setBorderBottom")),RemoteObject.createImmutable(("setBorderLeft")),RemoteObject.createImmutable(("setBorderRight")),RemoteObject.createImmutable(("setBorderTop")),RemoteObject.createImmutable(("setAlignment")),RemoteObject.createImmutable(("setVerticalAlignment")),(RemoteObject.createImmutable("setFillPattern"))})));__ref.setField("_internalstylestrings",xlworkbookwriter._internalstylestrings);
 //BA.debugLineNum = 17;BA.debugLine="Public InternalAllSimpleMethods As List = Array(I";
xlworkbookwriter._internalallsimplemethods = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
xlworkbookwriter._internalallsimplemethods = xlworkbookwriter.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_internalstyleshorts" /*RemoteObject*/ ).getObject()),(__ref.getField(false,"_internalstylebooleans" /*RemoteObject*/ ).getObject())})));__ref.setField("_internalallsimplemethods",xlworkbookwriter._internalallsimplemethods);
 //BA.debugLineNum = 18;BA.debugLine="Public InternalNameRegex As String = \"[_A-Za-z][_";
xlworkbookwriter._internalnameregex = BA.ObjectToString("[_A-Za-z][_\\.A-Za-z0-9]+");__ref.setField("_internalnameregex",xlworkbookwriter._internalnameregex);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonesheet(RemoteObject __ref,RemoteObject _sheet,RemoteObject _newsheetname) throws Exception{
try {
		Debug.PushSubsStack("CloneSheet (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("clonesheet")) { return __ref.runUserSub(false, "xlworkbookwriter","clonesheet", __ref, _sheet, _newsheetname);}
RemoteObject _newpoisheet = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiSheetWrapper");
RemoteObject _writer = RemoteObject.declareNull("b4j.example.xlsheetwriter");
Debug.locals.put("Sheet", _sheet);
Debug.locals.put("NewSheetName", _newsheetname);
 BA.debugLineNum = 96;BA.debugLine="Public Sub CloneSheet (Sheet As XLSheetWriter, New";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Dim NewPoiSheet As PoiSheet = jWorkbook.RunMethod";
Debug.JustUpdateDeviceLine();
_newpoisheet = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiSheetWrapper");
_newpoisheet = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PoiSheetWrapper"), __ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("cloneSheet")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sheet.getField(false,"_poisheet" /*RemoteObject*/ ).runMethod(true,"getIndex"))}))));Debug.locals.put("NewPoiSheet", _newpoisheet);Debug.locals.put("NewPoiSheet", _newpoisheet);
 BA.debugLineNum = 98;BA.debugLine="NewPoiSheet.Name = NewSheetName";
Debug.JustUpdateDeviceLine();
_newpoisheet.runMethod(true,"setName",_newsheetname);
 BA.debugLineNum = 99;BA.debugLine="Dim writer As XLSheetWriter";
Debug.JustUpdateDeviceLine();
_writer = RemoteObject.createNew ("b4j.example.xlsheetwriter");Debug.locals.put("writer", _writer);
 BA.debugLineNum = 100;BA.debugLine="writer.Initialize(xl, Me, NewPoiSheet)";
Debug.JustUpdateDeviceLine();
_writer.runClassMethod (b4j.example.xlsheetwriter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ )),(Object)((__ref)),(Object)(_newpoisheet));
 BA.debugLineNum = 101;BA.debugLine="Return writer";
Debug.JustUpdateDeviceLine();
if (true) return _writer;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createname(RemoteObject __ref,RemoteObject _name,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("CreateName (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("createname")) { return __ref.runUserSub(false, "xlworkbookwriter","createname", __ref, _name, _formula);}
RemoteObject _jname = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Name", _name);
Debug.locals.put("Formula", _formula);
 BA.debugLineNum = 159;BA.debugLine="Private Sub CreateName (Name As String, Formula As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="Dim jname As JavaObject = jWorkbook.RunMethod(\"cr";
Debug.JustUpdateDeviceLine();
_jname = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createName")),(Object)((xlworkbookwriter.__c.getField(false,"Null")))));Debug.locals.put("jname", _jname);Debug.locals.put("jname", _jname);
 BA.debugLineNum = 161;BA.debugLine="jname.RunMethod(\"setNameName\", Array(Name))";
Debug.JustUpdateDeviceLine();
_jname.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setNameName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_name)})));
 BA.debugLineNum = 162;BA.debugLine="jname.RunMethod(\"setRefersToFormula\", Array(Formu";
Debug.JustUpdateDeviceLine();
_jname.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setRefersToFormula")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_formula)})));
 BA.debugLineNum = 163;BA.debugLine="Return jname";
Debug.JustUpdateDeviceLine();
if (true) return _jname;
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsheetwriterbyindex(RemoteObject __ref,RemoteObject _sheetindex) throws Exception{
try {
		Debug.PushSubsStack("CreateSheetWriterByIndex (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("createsheetwriterbyindex")) { return __ref.runUserSub(false, "xlworkbookwriter","createsheetwriterbyindex", __ref, _sheetindex);}
RemoteObject _sheet = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiSheetWrapper");
RemoteObject _writer = RemoteObject.declareNull("b4j.example.xlsheetwriter");
Debug.locals.put("SheetIndex", _sheetindex);
 BA.debugLineNum = 88;BA.debugLine="Public Sub CreateSheetWriterByIndex (SheetIndex As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="Dim Sheet As PoiSheet = PoiWorkbook.GetSheet(Shee";
Debug.JustUpdateDeviceLine();
_sheet = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiSheetWrapper");
_sheet = __ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runMethod(false,"GetSheet",(Object)(_sheetindex));Debug.locals.put("Sheet", _sheet);Debug.locals.put("Sheet", _sheet);
 BA.debugLineNum = 90;BA.debugLine="Dim writer As XLSheetWriter";
Debug.JustUpdateDeviceLine();
_writer = RemoteObject.createNew ("b4j.example.xlsheetwriter");Debug.locals.put("writer", _writer);
 BA.debugLineNum = 91;BA.debugLine="writer.Initialize(xl, Me, Sheet)";
Debug.JustUpdateDeviceLine();
_writer.runClassMethod (b4j.example.xlsheetwriter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ )),(Object)((__ref)),(Object)(_sheet));
 BA.debugLineNum = 92;BA.debugLine="Return writer";
Debug.JustUpdateDeviceLine();
if (true) return _writer;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsheetwriterbyname(RemoteObject __ref,RemoteObject _sheetname) throws Exception{
try {
		Debug.PushSubsStack("CreateSheetWriterByName (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("createsheetwriterbyname")) { return __ref.runUserSub(false, "xlworkbookwriter","createsheetwriterbyname", __ref, _sheetname);}
RemoteObject _sheet = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiSheetWrapper");
RemoteObject _writer = RemoteObject.declareNull("b4j.example.xlsheetwriter");
Debug.locals.put("SheetName", _sheetname);
 BA.debugLineNum = 77;BA.debugLine="Public Sub CreateSheetWriterByName (SheetName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="Dim sheet As PoiSheet = PoiWorkbook.GetSheetByNam";
Debug.JustUpdateDeviceLine();
_sheet = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiSheetWrapper");
_sheet = __ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runMethod(false,"GetSheetByName",(Object)(_sheetname));Debug.locals.put("sheet", _sheet);Debug.locals.put("sheet", _sheet);
 BA.debugLineNum = 79;BA.debugLine="If sheet.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sheet.runMethod(true,"IsInitialized"),xlworkbookwriter.__c.getField(true,"False"))) { 
 BA.debugLineNum = 80;BA.debugLine="sheet = PoiWorkbook.AddSheet(SheetName, PoiWorkb";
Debug.JustUpdateDeviceLine();
_sheet = __ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runMethod(false,"AddSheet",(Object)(_sheetname),(Object)(__ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runMethod(true,"getNumberOfSheets")));Debug.locals.put("sheet", _sheet);
 };
 BA.debugLineNum = 82;BA.debugLine="Dim writer As XLSheetWriter";
Debug.JustUpdateDeviceLine();
_writer = RemoteObject.createNew ("b4j.example.xlsheetwriter");Debug.locals.put("writer", _writer);
 BA.debugLineNum = 83;BA.debugLine="writer.Initialize(xl, Me, sheet)";
Debug.JustUpdateDeviceLine();
_writer.runClassMethod (b4j.example.xlsheetwriter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ )),(Object)((__ref)),(Object)(_sheet));
 BA.debugLineNum = 84;BA.debugLine="Return writer";
Debug.JustUpdateDeviceLine();
if (true) return _writer;
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateStyle (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("createstyle")) { return __ref.runUserSub(false, "xlworkbookwriter","createstyle", __ref);}
RemoteObject _style = RemoteObject.declareNull("b4j.example.xlstyle");
 BA.debugLineNum = 123;BA.debugLine="Public Sub CreateStyle As XLStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Dim style As XLStyle";
Debug.JustUpdateDeviceLine();
_style = RemoteObject.createNew ("b4j.example.xlstyle");Debug.locals.put("style", _style);
 BA.debugLineNum = 125;BA.debugLine="style.Initialize (Me)";
Debug.JustUpdateDeviceLine();
_style.runClassMethod (b4j.example.xlstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)));
 BA.debugLineNum = 126;BA.debugLine="Return style";
Debug.JustUpdateDeviceLine();
if (true) return _style;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _evaluateformulas(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EvaluateFormulas (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("evaluateformulas")) { return __ref.runUserSub(false, "xlworkbookwriter","evaluateformulas", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Public Sub EvaluateFormulas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="jWorkbook.RunMethodJO(\"getCreationHelper\", Null).";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getCreationHelper")),(Object)((xlworkbookwriter.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("createFormulaEvaluator")),(Object)((xlworkbookwriter.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("evaluateAll")),(Object)((xlworkbookwriter.__c.getField(false,"Null"))));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getactivesheetindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getActiveSheetIndex (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("getactivesheetindex")) { return __ref.runUserSub(false, "xlworkbookwriter","getactivesheetindex", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Public Sub getActiveSheetIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="Return jWorkbook.RunMethod(\"getActiveSheetIndex\",";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getActiveSheetIndex")),(Object)((xlworkbookwriter.__c.getField(false,"Null")))));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfont(RemoteObject __ref,RemoteObject _size,RemoteObject _bold,RemoteObject _name,RemoteObject _italic,RemoteObject _underline,RemoteObject _indexedcolor) throws Exception{
try {
		Debug.PushSubsStack("GetFont (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("getfont")) { return __ref.runUserSub(false, "xlworkbookwriter","getfont", __ref, _size, _bold, _name, _italic, _underline, _indexedcolor);}
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiFontWrapper");
Debug.locals.put("Size", _size);
Debug.locals.put("Bold", _bold);
Debug.locals.put("Name", _name);
Debug.locals.put("Italic", _italic);
Debug.locals.put("Underline", _underline);
Debug.locals.put("IndexedColor", _indexedcolor);
 BA.debugLineNum = 105;BA.debugLine="Public Sub GetFont (Size As Short, Bold As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="For Each f As PoiFont In PoiWorkbook.Fonts";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiFontWrapper");
{
final RemoteObject group1 = __ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runMethod(false,"getFonts");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PoiFontWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 107;BA.debugLine="If f.Size = Size And f.Bold = Bold And f.Name =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_f.runMethod(true,"getSize"),BA.numberCast(double.class, _size)) && RemoteObject.solveBoolean("=",_f.runMethod(true,"getBold"),_bold) && RemoteObject.solveBoolean("=",_f.runMethod(true,"getName"),_name) && RemoteObject.solveBoolean("=",_f.runMethod(true,"getItalic"),_italic) && RemoteObject.solveBoolean("=",_f.runMethod(true,"getUnderline"),_underline) && RemoteObject.solveBoolean("=",_f.runMethod(true,"getIndexedColor"),BA.numberCast(double.class, _indexedcolor))) { 
 BA.debugLineNum = 108;BA.debugLine="Return f";
Debug.JustUpdateDeviceLine();
if (true) return _f;
 };
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 111;BA.debugLine="Dim f As PoiFont";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiFontWrapper");Debug.locals.put("f", _f);
 BA.debugLineNum = 112;BA.debugLine="f.Initialize(PoiWorkbook)";
Debug.JustUpdateDeviceLine();
_f.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_poiworkbook" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="f.Size = Size";
Debug.JustUpdateDeviceLine();
_f.runMethod(true,"setSize",_size);
 BA.debugLineNum = 114;BA.debugLine="f.Bold = Bold";
Debug.JustUpdateDeviceLine();
_f.runMethod(true,"setBold",_bold);
 BA.debugLineNum = 115;BA.debugLine="f.Name = Name";
Debug.JustUpdateDeviceLine();
_f.runMethod(true,"setName",_name);
 BA.debugLineNum = 116;BA.debugLine="f.Italic = Italic";
Debug.JustUpdateDeviceLine();
_f.runMethod(true,"setItalic",_italic);
 BA.debugLineNum = 117;BA.debugLine="f.Underline = Underline";
Debug.JustUpdateDeviceLine();
_f.runMethod(true,"setUnderline",_underline);
 BA.debugLineNum = 118;BA.debugLine="f.IndexedColor = IndexedColor";
Debug.JustUpdateDeviceLine();
_f.runMethod(true,"setIndexedColor",BA.numberCast(short.class, _indexedcolor));
 BA.debugLineNum = 119;BA.debugLine="Return f";
Debug.JustUpdateDeviceLine();
if (true) return _f;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getforceformularecalculation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getForceFormulaRecalculation (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("getforceformularecalculation")) { return __ref.runUserSub(false, "xlworkbookwriter","getforceformularecalculation", __ref);}
 BA.debugLineNum = 199;BA.debugLine="Public Sub getForceFormulaRecalculation As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="Return jWorkbook.RunMethod(\"getForceFormulaRecalc";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getForceFormulaRecalculation")),(Object)((xlworkbookwriter.__c.getField(false,"Null")))));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getversionname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVersionName (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("getversionname")) { return __ref.runUserSub(false, "xlworkbookwriter","getversionname", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Public Sub getVersionName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="Return mVersionName";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mversionname" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vxl,RemoteObject _vworkbook,RemoteObject _vfromtemplate) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xlworkbookwriter","initialize", __ref, _ba, _vxl, _vworkbook, _vfromtemplate);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vXL", _vxl);
Debug.locals.put("vWorkbook", _vworkbook);
Debug.locals.put("vFromTemplate", _vfromtemplate);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (vXL As XLUtils, vWorkbook A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="xl = vXL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xl" /*RemoteObject*/ ,_vxl);
 BA.debugLineNum = 24;BA.debugLine="PoiWorkbook = vWorkbook";
Debug.JustUpdateDeviceLine();
__ref.setField ("_poiworkbook" /*RemoteObject*/ ,_vworkbook);
 BA.debugLineNum = 25;BA.debugLine="FromTemplate = vFromTemplate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fromtemplate" /*RemoteObject*/ ,_vfromtemplate);
 BA.debugLineNum = 26;BA.debugLine="jWorkbook = PoiWorkbook";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).setObject (__ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 27;BA.debugLine="mVersionName = jWorkbook.RunMethodJO(\"getSpreadsh";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mversionname" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSpreadsheetVersion")),(Object)((xlworkbookwriter.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((xlworkbookwriter.__c.getField(false,"Null"))))));
 BA.debugLineNum = 28;BA.debugLine="IsXLSX = mVersionName = \"EXCEL2007\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isxlsx" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_mversionname" /*RemoteObject*/ ),BA.ObjectToString("EXCEL2007"))));
 BA.debugLineNum = 29;BA.debugLine="If IsXLSX Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isxlsx" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 30;BA.debugLine="MaxRows = 0x100000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maxrows" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x100000)));
 BA.debugLineNum = 31;BA.debugLine="MaxColumns = 0x4000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maxcolumns" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x4000)));
 BA.debugLineNum = 32;BA.debugLine="DefaultFontName = \"Calibri\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultfontname" /*RemoteObject*/ ,BA.ObjectToString("Calibri"));
 BA.debugLineNum = 33;BA.debugLine="DefaultFontSize = 11";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultfontsize" /*RemoteObject*/ ,BA.numberCast(short.class, 11));
 BA.debugLineNum = 34;BA.debugLine="DefaultExtension = \".xlsx\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultextension" /*RemoteObject*/ ,BA.ObjectToString(".xlsx"));
 }else {
 BA.debugLineNum = 36;BA.debugLine="MaxRows = 0x10000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maxrows" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x10000)));
 BA.debugLineNum = 37;BA.debugLine="MaxColumns = 0x0100";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maxcolumns" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x0100)));
 BA.debugLineNum = 38;BA.debugLine="DefaultFontName = \"Arial\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultfontname" /*RemoteObject*/ ,BA.ObjectToString("Arial"));
 BA.debugLineNum = 39;BA.debugLine="DefaultFontSize = 10";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultfontsize" /*RemoteObject*/ ,BA.numberCast(short.class, 10));
 BA.debugLineNum = 40;BA.debugLine="DefaultExtension = \".xls\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultextension" /*RemoteObject*/ ,BA.ObjectToString(".xls"));
 };
 BA.debugLineNum = 42;BA.debugLine="InternalStylesCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_internalstylescache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removenamedrange(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("RemoveNamedRange (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("removenamedrange")) { return __ref.runUserSub(false, "xlworkbookwriter","removenamedrange", __ref, _name);}
RemoteObject _names = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dontmodifylistwhileremoving = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n = RemoteObject.declareNull("Object");
Debug.locals.put("Name", _name);
 BA.debugLineNum = 184;BA.debugLine="Public Sub RemoveNamedRange (Name As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="Dim Names As List = jWorkbook.RunMethod(\"getNames";
Debug.JustUpdateDeviceLine();
_names = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_names = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getNames")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_name)}))));Debug.locals.put("Names", _names);Debug.locals.put("Names", _names);
 BA.debugLineNum = 186;BA.debugLine="Dim DontModifyListWhileRemoving As List";
Debug.JustUpdateDeviceLine();
_dontmodifylistwhileremoving = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("DontModifyListWhileRemoving", _dontmodifylistwhileremoving);
 BA.debugLineNum = 187;BA.debugLine="DontModifyListWhileRemoving.Initialize";
Debug.JustUpdateDeviceLine();
_dontmodifylistwhileremoving.runVoidMethod ("Initialize");
 BA.debugLineNum = 188;BA.debugLine="DontModifyListWhileRemoving.AddAll(Names)";
Debug.JustUpdateDeviceLine();
_dontmodifylistwhileremoving.runVoidMethod ("AddAll",(Object)(_names));
 BA.debugLineNum = 189;BA.debugLine="For Each n As Object In DontModifyListWhileRemovi";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _dontmodifylistwhileremoving;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_n = group5.runMethod(false,"Get",index5);Debug.locals.put("n", _n);
Debug.locals.put("n", _n);
 BA.debugLineNum = 190;BA.debugLine="jWorkbook.RunMethod(\"removeName\", Array(n))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("removeName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_n})));
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removesheetat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveSheetAt (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("removesheetat")) { return __ref.runUserSub(false, "xlworkbookwriter","removesheetat", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 194;BA.debugLine="Public Sub RemoveSheetAt (Index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="jWorkbook.RunMethod(\"removeSheetAt\", Array(Index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("removeSheetAt")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_index)})));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SaveAs (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("saveas")) { return __ref.runUserSub(false, "xlworkbookwriter","saveas", __ref, _dir, _filename, _renameifneeded);}
RemoteObject _orig = RemoteObject.createImmutable("");
RemoteObject _extension = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable("");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("RenameIfNeeded", _renameifneeded);
 BA.debugLineNum = 52;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="If RenameIfNeeded Then";
Debug.JustUpdateDeviceLine();
if (_renameifneeded.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 54;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
Debug.JustUpdateDeviceLine();
_orig = xlworkbookwriter.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_filename));Debug.locals.put("orig", _orig);Debug.locals.put("orig", _orig);
 BA.debugLineNum = 55;BA.debugLine="Dim extension As String";
Debug.JustUpdateDeviceLine();
_extension = RemoteObject.createImmutable("");Debug.locals.put("extension", _extension);
 BA.debugLineNum = 56;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
Debug.JustUpdateDeviceLine();
_i = _orig.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="If i >-1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 58;BA.debugLine="extension = orig.SubString(i)";
Debug.JustUpdateDeviceLine();
_extension = _orig.runMethod(true,"substring",(Object)(_i));Debug.locals.put("extension", _extension);
 BA.debugLineNum = 59;BA.debugLine="orig = orig.SubString2(0, i)";
Debug.JustUpdateDeviceLine();
_orig = _orig.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i));Debug.locals.put("orig", _orig);
 };
 BA.debugLineNum = 61;BA.debugLine="For i = 0 To 10";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = 10;
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="Dim f As String";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createImmutable("");Debug.locals.put("f", _f);
 BA.debugLineNum = 63;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 64;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, 0))) { 
_f = RemoteObject.concat(_orig,_extension);Debug.locals.put("f", _f);}
else {
_f = RemoteObject.concat(_orig,RemoteObject.createImmutable(" ("),_i,RemoteObject.createImmutable(")"),_extension);Debug.locals.put("f", _f);};
 BA.debugLineNum = 65;BA.debugLine="PoiWorkbook.Save(f, \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runVoidMethod ("Save",(Object)(_f),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="Return f";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _f;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 68;BA.debugLine="Log(\"Failed: \" & f)";
Debug.JustUpdateDeviceLine();
xlworkbookwriter.__c.runVoidMethod ("LogImpl","916711696",RemoteObject.concat(RemoteObject.createImmutable("Failed: "),_f),0);
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 72;BA.debugLine="PoiWorkbook.Save(Dir, FileName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runVoidMethod ("Save",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 73;BA.debugLine="Return File.Combine(Dir, FileName)";
Debug.JustUpdateDeviceLine();
if (true) return xlworkbookwriter.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_filename));
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
public static RemoteObject  _setactivesheetindex(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setActiveSheetIndex (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setactivesheetindex")) { return __ref.runUserSub(false, "xlworkbookwriter","setactivesheetindex", __ref, _i);}
int _ii = 0;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="Public Sub setActiveSheetIndex (i As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="For ii = 0 To PoiWorkbook.NumberOfSheets - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runMethod(true,"getNumberOfSheets"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_ii = 0 ;
for (;(step1 > 0 && _ii <= limit1) || (step1 < 0 && _ii >= limit1) ;_ii = ((int)(0 + _ii + step1))  ) {
Debug.locals.put("ii", _ii);
 BA.debugLineNum = 141;BA.debugLine="Dim jo As JavaObject = PoiWorkbook.GetSheet(ii)";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_poiworkbook" /*RemoteObject*/ ).runMethod(false,"GetSheet",(Object)(BA.numberCast(int.class, _ii))).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 142;BA.debugLine="jo.RunMethod(\"setSelected\", Array(False))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSelected")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(xlworkbookwriter.__c.getField(true,"False"))})));
 }
}Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 144;BA.debugLine="jWorkbook.RunMethod(\"setActiveSheet\", Array(i))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setActiveSheet")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_i)})));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setforceformularecalculation(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setForceFormulaRecalculation (xlworkbookwriter) ","xlworkbookwriter",19,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("setforceformularecalculation")) { return __ref.runUserSub(false, "xlworkbookwriter","setforceformularecalculation", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 203;BA.debugLine="Public Sub setForceFormulaRecalculation (b As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 204;BA.debugLine="jWorkbook.RunMethod(\"setForceFormulaRecalculation";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jworkbook" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setForceFormulaRecalculation")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)})));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
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