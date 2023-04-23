package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xlreaderresult_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Data As List";
xlreaderresult._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_data",xlreaderresult._data);
 //BA.debugLineNum = 3;BA.debugLine="Public TopLeft As XLAddress";
xlreaderresult._topleft = RemoteObject.createNew ("b4j.example.xlutils._xladdress");__ref.setField("_topleft",xlreaderresult._topleft);
 //BA.debugLineNum = 4;BA.debugLine="Public BottomRight As XLAddress";
xlreaderresult._bottomright = RemoteObject.createNew ("b4j.example.xlutils._xladdress");__ref.setField("_bottomright",xlreaderresult._bottomright);
 //BA.debugLineNum = 5;BA.debugLine="Public Name As String";
xlreaderresult._name = RemoteObject.createImmutable("");__ref.setField("_name",xlreaderresult._name);
 //BA.debugLineNum = 6;BA.debugLine="Private xl As XLUtils";
xlreaderresult._xl = RemoteObject.createNew ("b4j.example.xlutils");__ref.setField("_xl",xlreaderresult._xl);
 //BA.debugLineNum = 7;BA.debugLine="Public DefaultEmptyCellValue As Object = \"\"";
xlreaderresult._defaultemptycellvalue = RemoteObject.createImmutable((""));__ref.setField("_defaultemptycellvalue",xlreaderresult._defaultemptycellvalue);
 //BA.debugLineNum = 9;BA.debugLine="Type XLHyperlink (LinkType As String, Address As";
;
 //BA.debugLineNum = 10;BA.debugLine="Public Hyperlinks As Map";
xlreaderresult._hyperlinks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_hyperlinks",xlreaderresult._hyperlinks);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _get(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("Get (xlreaderresult) ","xlreaderresult",14,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("get")) { return __ref.runUserSub(false, "xlreaderresult","get", __ref, _address);}
Debug.locals.put("Address", _address);
 BA.debugLineNum = 62;BA.debugLine="Public Sub Get(Address As XLAddress) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Return GetDefault(Address, DefaultEmptyCellValue)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlreaderresult.class, "_getdefault" /*RemoteObject*/ ,(Object)(_address),(Object)(__ref.getField(false,"_defaultemptycellvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdefault(RemoteObject __ref,RemoteObject _address,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("GetDefault (xlreaderresult) ","xlreaderresult",14,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("getdefault")) { return __ref.runUserSub(false, "xlreaderresult","getdefault", __ref, _address, _defaultvalue);}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _rrow = null;
RemoteObject _res = RemoteObject.declareNull("Object");
Debug.locals.put("Address", _address);
Debug.locals.put("DefaultValue", _defaultvalue);
 BA.debugLineNum = 78;BA.debugLine="Public Sub GetDefault(Address As XLAddress, Defaul";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="Dim row As Int = Address.Row0Based - TopLeft.Row0";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.solve(new RemoteObject[] {_address.getField(true,"Row0Based" /*RemoteObject*/ ),__ref.getField(false,"_topleft" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 80;BA.debugLine="Dim col As Int = Address.Col0Based - TopLeft.Col0";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.solve(new RemoteObject[] {_address.getField(true,"Col0Based" /*RemoteObject*/ ),__ref.getField(false,"_topleft" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 81;BA.debugLine="If col < 0 Or row < 0 Or row >= Data.Size Then Re";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_col,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("g",_row,BA.numberCast(double.class, __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 82;BA.debugLine="Dim rrow() As Object = Data.Get(row)";
Debug.JustUpdateDeviceLine();
_rrow = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("rrow", _rrow);Debug.locals.put("rrow", _rrow);
 BA.debugLineNum = 83;BA.debugLine="If rrow.Length <= col Then Return DefaultValue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_rrow.getField(true,"length"),BA.numberCast(double.class, _col))) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 84;BA.debugLine="Dim res As Object = rrow(col)";
Debug.JustUpdateDeviceLine();
_res = _rrow.getArrayElement(false,_col);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 85;BA.debugLine="If res = \"\" Then Return DefaultValue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_res,RemoteObject.createImmutable(("")))) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 86;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
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
public static RemoteObject  _gethyperlink(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("GetHyperlink (xlreaderresult) ","xlreaderresult",14,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("gethyperlink")) { return __ref.runUserSub(false, "xlreaderresult","gethyperlink", __ref, _address);}
RemoteObject _a = RemoteObject.createImmutable("");
RemoteObject _empty = RemoteObject.declareNull("b4j.example.xlreaderresult._xlhyperlink");
Debug.locals.put("Address", _address);
 BA.debugLineNum = 67;BA.debugLine="Public Sub GetHyperlink(Address As XLAddress) As X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="Dim a As String = xl.AddressToString(Address)";
Debug.JustUpdateDeviceLine();
_a = __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresstostring" /*RemoteObject*/ ,(Object)(_address));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 69;BA.debugLine="If Hyperlinks.ContainsKey(a) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_hyperlinks" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_a))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 70;BA.debugLine="Return Hyperlinks.Get(a)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_hyperlinks" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_a))));
 };
 BA.debugLineNum = 72;BA.debugLine="Dim Empty As XLHyperlink";
Debug.JustUpdateDeviceLine();
_empty = RemoteObject.createNew ("b4j.example.xlreaderresult._xlhyperlink");Debug.locals.put("Empty", _empty);
 BA.debugLineNum = 73;BA.debugLine="Return Empty";
Debug.JustUpdateDeviceLine();
if (true) return _empty;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vxl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xlreaderresult) ","xlreaderresult",14,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xlreaderresult","initialize", __ref, _ba, _vxl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vXL", _vxl);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="xl = vXL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xl" /*RemoteObject*/ ,_vxl);
 BA.debugLineNum = 15;BA.debugLine="Hyperlinks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hyperlinks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _logresult(RemoteObject __ref,RemoteObject _withcontent) throws Exception{
try {
		Debug.PushSubsStack("LogResult (xlreaderresult) ","xlreaderresult",14,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("logresult")) { return __ref.runUserSub(false, "xlreaderresult","logresult", __ref, _withcontent);}
RemoteObject _isrectangle = RemoteObject.createImmutable(false);
RemoteObject _length = RemoteObject.createImmutable(0);
RemoteObject _first = null;
RemoteObject _row = null;
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _firstcell = RemoteObject.createImmutable(false);
RemoteObject _cell = RemoteObject.declareNull("Object");
Debug.locals.put("WithContent", _withcontent);
 BA.debugLineNum = 20;BA.debugLine="Public Sub LogResult (WithContent As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="Log($\"*** ${Name} ***\"$)";
Debug.JustUpdateDeviceLine();
xlreaderresult.__c.runVoidMethod ("LogImpl","98847361",(RemoteObject.concat(RemoteObject.createImmutable("*** "),xlreaderresult.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_name" /*RemoteObject*/ )))),RemoteObject.createImmutable(" ***"))),0);
 BA.debugLineNum = 22;BA.debugLine="Log($\"Number of rows: ${Data.Size}\"$)";
Debug.JustUpdateDeviceLine();
xlreaderresult.__c.runVoidMethod ("LogImpl","98847362",(RemoteObject.concat(RemoteObject.createImmutable("Number of rows: "),xlreaderresult.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 23;BA.debugLine="If Data.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 24;BA.debugLine="Dim IsRectangle As Boolean = True";
Debug.JustUpdateDeviceLine();
_isrectangle = xlreaderresult.__c.getField(true,"True");Debug.locals.put("IsRectangle", _isrectangle);Debug.locals.put("IsRectangle", _isrectangle);
 BA.debugLineNum = 25;BA.debugLine="Dim length As Int";
Debug.JustUpdateDeviceLine();
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 26;BA.debugLine="Dim first() As Object = Data.Get(0)";
Debug.JustUpdateDeviceLine();
_first = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 27;BA.debugLine="length = first.Length";
Debug.JustUpdateDeviceLine();
_length = _first.getField(true,"length");Debug.locals.put("length", _length);
 BA.debugLineNum = 28;BA.debugLine="For Each row() As Object In Data";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = __ref.getField(false,"_data" /*RemoteObject*/ );
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 29;BA.debugLine="If row.Length <> length Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_row.getField(true,"length"),BA.numberCast(double.class, _length))) { 
 BA.debugLineNum = 30;BA.debugLine="IsRectangle = False";
Debug.JustUpdateDeviceLine();
_isrectangle = xlreaderresult.__c.getField(true,"False");Debug.locals.put("IsRectangle", _isrectangle);
 BA.debugLineNum = 31;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 34;BA.debugLine="Log($\"Is rectangle region: ${IsRectangle}\"$)";
Debug.JustUpdateDeviceLine();
xlreaderresult.__c.runVoidMethod ("LogImpl","98847374",(RemoteObject.concat(RemoteObject.createImmutable("Is rectangle region: "),xlreaderresult.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_isrectangle))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 35;BA.debugLine="Log($\"${xl.AddressToString(TopLeft)} -> ${xl.Add";
Debug.JustUpdateDeviceLine();
xlreaderresult.__c.runVoidMethod ("LogImpl","98847375",(RemoteObject.concat(RemoteObject.createImmutable(""),xlreaderresult.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresstostring" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_topleft" /*RemoteObject*/ )))))),RemoteObject.createImmutable(" -> "),xlreaderresult.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresstostring" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bottomright" /*RemoteObject*/ )))))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 36;BA.debugLine="If WithContent Then";
Debug.JustUpdateDeviceLine();
if (_withcontent.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 37;BA.debugLine="Log(\"Content:\")";
Debug.JustUpdateDeviceLine();
xlreaderresult.__c.runVoidMethod ("LogImpl","98847377",RemoteObject.createImmutable("Content:"),0);
 BA.debugLineNum = 38;BA.debugLine="For Each row() As Object In Data";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group18 = __ref.getField(false,"_data" /*RemoteObject*/ );
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_row = (group18.runMethod(false,"Get",index18));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 39;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 40;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="Dim firstcell As Boolean = True";
Debug.JustUpdateDeviceLine();
_firstcell = xlreaderresult.__c.getField(true,"True");Debug.locals.put("firstcell", _firstcell);Debug.locals.put("firstcell", _firstcell);
 BA.debugLineNum = 42;BA.debugLine="If row.Length = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_row.getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 43;BA.debugLine="sb.Append(\"(empty row)\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(empty row)")));
 }else {
 BA.debugLineNum = 45;BA.debugLine="For Each cell As Object In row";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group25 = _row;
final int groupLen25 = group25.getField(true,"length").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_cell = group25.getArrayElement(false,RemoteObject.createImmutable(index25));Debug.locals.put("cell", _cell);
Debug.locals.put("cell", _cell);
 BA.debugLineNum = 46;BA.debugLine="If firstcell = False Then sb.Append(\", \") El";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_firstcell,xlreaderresult.__c.getField(true,"False"))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));}
else {
_firstcell = xlreaderresult.__c.getField(true,"False");Debug.locals.put("firstcell", _firstcell);};
 BA.debugLineNum = 47;BA.debugLine="If cell = \"\" Then cell = DefaultEmptyCellVal";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cell,RemoteObject.createImmutable(("")))) { 
_cell = __ref.getField(false,"_defaultemptycellvalue" /*RemoteObject*/ );Debug.locals.put("cell", _cell);};
 BA.debugLineNum = 48;BA.debugLine="If cell Is Long Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_cell, RemoteObject.createImmutable("Long"))) { 
 BA.debugLineNum = 49;BA.debugLine="sb.Append(DateTime.Date(cell))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(xlreaderresult.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _cell)))));
 }else {
 BA.debugLineNum = 51;BA.debugLine="sb.Append(cell)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_cell)));
 };
 }
}Debug.locals.put("cell", _cell);
;
 };
 BA.debugLineNum = 55;BA.debugLine="Log(sb.ToString)";
Debug.JustUpdateDeviceLine();
xlreaderresult.__c.runVoidMethod ("LogImpl","98847395",_sb.runMethod(true,"ToString"),0);
 }
}Debug.locals.put("row", _row);
;
 };
 };
 BA.debugLineNum = 59;BA.debugLine="End Sub";
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