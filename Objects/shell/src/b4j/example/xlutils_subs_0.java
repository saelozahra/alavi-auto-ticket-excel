package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xlutils_subs_0 {


public static RemoteObject  _addressname(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("AddressName (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("addressname")) { return __ref.runUserSub(false, "xlutils","addressname", __ref, _address);}
RemoteObject _xa = RemoteObject.declareNull("b4j.example.xlutils._xladdress");
int _i = 0;
RemoteObject _cp = RemoteObject.createImmutable(0);
Debug.locals.put("Address", _address);
 BA.debugLineNum = 81;BA.debugLine="Public Sub AddressName (Address As String) As XLAd";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Dim xa As XLAddress";
Debug.JustUpdateDeviceLine();
_xa = RemoteObject.createNew ("b4j.example.xlutils._xladdress");Debug.locals.put("xa", _xa);
 BA.debugLineNum = 83;BA.debugLine="xa.Initialize";
Debug.JustUpdateDeviceLine();
_xa.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="Address = Address.ToUpperCase";
Debug.JustUpdateDeviceLine();
_address = _address.runMethod(true,"toUpperCase");Debug.locals.put("Address", _address);
 BA.debugLineNum = 85;BA.debugLine="For i = 0 To Address.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_address.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Dim cp As Int = Asc(Address.CharAt(i))";
Debug.JustUpdateDeviceLine();
_cp = xlutils.__c.runMethod(true,"Asc",(Object)(_address.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("cp", _cp);Debug.locals.put("cp", _cp);
 BA.debugLineNum = 87;BA.debugLine="If cp >= 0x41 And cp <=	0x5A Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_cp,BA.numberCast(double.class, ((int)0x41))) && RemoteObject.solveBoolean("k",_cp,BA.numberCast(double.class, ((int)0x5a)))) { 
 BA.debugLineNum = 88;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
Debug.JustUpdateDeviceLine();
_xa.setField ("Col0Based" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_xa.getField(true,"Col0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(26),(RemoteObject.solve(new RemoteObject[] {_cp,RemoteObject.createImmutable(((int)0x40))}, "-",1, 1))}, "*+",1, 1));
 }else 
{ BA.debugLineNum = 89;BA.debugLine="Else If cp >= 0x30 And cp <= 0x39 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_cp,BA.numberCast(double.class, ((int)0x30))) && RemoteObject.solveBoolean("k",_cp,BA.numberCast(double.class, ((int)0x39)))) { 
 BA.debugLineNum = 90;BA.debugLine="xa.Row0Based = xa.Row0Based * 10 + cp - 0x30";
Debug.JustUpdateDeviceLine();
_xa.setField ("Row0Based" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_xa.getField(true,"Row0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(10),_cp,RemoteObject.createImmutable(((int)0x30))}, "*+-",2, 1));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 93;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
Debug.JustUpdateDeviceLine();
_xa.setField ("Col0Based" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_xa.getField(true,"Col0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 94;BA.debugLine="xa.Row0Based = xa.Row0Based - 1";
Debug.JustUpdateDeviceLine();
_xa.setField ("Row0Based" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_xa.getField(true,"Row0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 95;BA.debugLine="Return xa";
Debug.JustUpdateDeviceLine();
if (true) return _xa;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addressone(RemoteObject __ref,RemoteObject _columnname,RemoteObject _row1based) throws Exception{
try {
		Debug.PushSubsStack("AddressOne (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("addressone")) { return __ref.runUserSub(false, "xlutils","addressone", __ref, _columnname, _row1based);}
RemoteObject _xa = RemoteObject.declareNull("b4j.example.xlutils._xladdress");
RemoteObject _b = null;
int _i = 0;
RemoteObject _cp = RemoteObject.createImmutable(0);
Debug.locals.put("ColumnName", _columnname);
Debug.locals.put("Row1Based", _row1based);
 BA.debugLineNum = 101;BA.debugLine="Public Sub AddressOne(ColumnName As String, Row1Ba";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="Dim xa As XLAddress";
Debug.JustUpdateDeviceLine();
_xa = RemoteObject.createNew ("b4j.example.xlutils._xladdress");Debug.locals.put("xa", _xa);
 BA.debugLineNum = 103;BA.debugLine="xa.Initialize";
Debug.JustUpdateDeviceLine();
_xa.runVoidMethod ("Initialize");
 BA.debugLineNum = 104;BA.debugLine="Dim b() As Byte = ColumnName.GetBytes(\"ASCII\")";
Debug.JustUpdateDeviceLine();
_b = _columnname.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("ASCII")));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 105;BA.debugLine="For i = 0 To b.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_b.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 106;BA.debugLine="Dim cp As Int = b(i)";
Debug.JustUpdateDeviceLine();
_cp = BA.numberCast(int.class, _b.getArrayElement(true,BA.numberCast(int.class, _i)));Debug.locals.put("cp", _cp);Debug.locals.put("cp", _cp);
 BA.debugLineNum = 107;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
Debug.JustUpdateDeviceLine();
_xa.setField ("Col0Based" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_xa.getField(true,"Col0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(26),(RemoteObject.solve(new RemoteObject[] {_cp,RemoteObject.createImmutable(((int)0x40))}, "-",1, 1))}, "*+",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 109;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
Debug.JustUpdateDeviceLine();
_xa.setField ("Col0Based" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_xa.getField(true,"Col0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 110;BA.debugLine="xa.Row0Based = Row1Based - 1";
Debug.JustUpdateDeviceLine();
_xa.setField ("Row0Based" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_row1based,RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 111;BA.debugLine="Return xa";
Debug.JustUpdateDeviceLine();
if (true) return _xa;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addressonetostring(RemoteObject __ref,RemoteObject _columnname,RemoteObject _row1based) throws Exception{
try {
		Debug.PushSubsStack("AddressOneToString (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("addressonetostring")) { return __ref.runUserSub(false, "xlutils","addressonetostring", __ref, _columnname, _row1based);}
Debug.locals.put("ColumnName", _columnname);
Debug.locals.put("Row1Based", _row1based);
 BA.debugLineNum = 115;BA.debugLine="Public Sub AddressOneToString(ColumnName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Return AddressToString(AddressOne(ColumnName, Row";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlutils.class, "_addresstostring" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(_columnname),(Object)(_row1based))));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addresstostring(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("AddressToString (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("addresstostring")) { return __ref.runUserSub(false, "xlutils","addresstostring", __ref, _address);}
Debug.locals.put("Address", _address);
 BA.debugLineNum = 120;BA.debugLine="Public Sub AddressToString (Address As XLAddress)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="Return AddressToStringAbs(Address, False, False)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlutils.class, "_addresstostringabs" /*RemoteObject*/ ,(Object)(_address),(Object)(xlutils.__c.getField(true,"False")),(Object)(xlutils.__c.getField(true,"False")));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addresstostringabs(RemoteObject __ref,RemoteObject _address,RemoteObject _absolutecolumn,RemoteObject _absoluterow) throws Exception{
try {
		Debug.PushSubsStack("AddressToStringAbs (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("addresstostringabs")) { return __ref.runUserSub(false, "xlutils","addresstostringabs", __ref, _address, _absolutecolumn, _absoluterow);}
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _cmod = RemoteObject.createImmutable(0);
Debug.locals.put("Address", _address);
Debug.locals.put("AbsoluteColumn", _absolutecolumn);
Debug.locals.put("AbsoluteRow", _absoluterow);
 BA.debugLineNum = 125;BA.debugLine="Public Sub AddressToStringAbs(Address As XLAddress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="Dim c As Int = Address.Col0Based + 1";
Debug.JustUpdateDeviceLine();
_c = RemoteObject.solve(new RemoteObject[] {_address.getField(true,"Col0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 127;BA.debugLine="If Address.Col0Based < 0 Or Address.Row0Based < 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_address.getField(true,"Col0Based" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("<",_address.getField(true,"Row0Based" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("N/A");};
 BA.debugLineNum = 128;BA.debugLine="Dim col As String";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 129;BA.debugLine="Do While c > 0";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",_c,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 130;BA.debugLine="Dim cmod As Int = c Mod 26";
Debug.JustUpdateDeviceLine();
_cmod = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(26)}, "%",0, 1);Debug.locals.put("cmod", _cmod);Debug.locals.put("cmod", _cmod);
 BA.debugLineNum = 131;BA.debugLine="If cmod = 0 Then cmod = 26";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cmod,BA.numberCast(double.class, 0))) { 
_cmod = BA.numberCast(int.class, 26);Debug.locals.put("cmod", _cmod);};
 BA.debugLineNum = 132;BA.debugLine="col = Chr(0x40 + cmod) & col";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.concat(xlutils.__c.runMethod(true,"Chr",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(((int)0x40)),_cmod}, "+",1, 1))),_col);Debug.locals.put("col", _col);
 BA.debugLineNum = 133;BA.debugLine="c = Floor((c - 1) / 26)";
Debug.JustUpdateDeviceLine();
_c = BA.numberCast(int.class, xlutils.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(26)}, "/",0, 0))));Debug.locals.put("c", _c);
 }
;
 BA.debugLineNum = 135;BA.debugLine="If AbsoluteColumn Then col = \"$\" & col";
Debug.JustUpdateDeviceLine();
if (_absolutecolumn.<Boolean>get().booleanValue()) { 
_col = RemoteObject.concat(RemoteObject.createImmutable("$"),_col);Debug.locals.put("col", _col);};
 BA.debugLineNum = 136;BA.debugLine="If AbsoluteRow Then col = col & \"$\"";
Debug.JustUpdateDeviceLine();
if (_absoluterow.<Boolean>get().booleanValue()) { 
_col = RemoteObject.concat(_col,RemoteObject.createImmutable("$"));Debug.locals.put("col", _col);};
 BA.debugLineNum = 137;BA.debugLine="col = col & (Address.Row0Based + 1)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.concat(_col,(RemoteObject.solve(new RemoteObject[] {_address.getField(true,"Row0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("col", _col);
 BA.debugLineNum = 138;BA.debugLine="Return col";
Debug.JustUpdateDeviceLine();
if (true) return _col;
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addresszero(RemoteObject __ref,RemoteObject _col0based,RemoteObject _row0based) throws Exception{
try {
		Debug.PushSubsStack("AddressZero (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("addresszero")) { return __ref.runUserSub(false, "xlutils","addresszero", __ref, _col0based, _row0based);}
RemoteObject _xa = RemoteObject.declareNull("b4j.example.xlutils._xladdress");
Debug.locals.put("Col0Based", _col0based);
Debug.locals.put("Row0Based", _row0based);
 BA.debugLineNum = 65;BA.debugLine="Public Sub AddressZero (Col0Based As Int, Row0Base";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Dim xa As XLAddress";
Debug.JustUpdateDeviceLine();
_xa = RemoteObject.createNew ("b4j.example.xlutils._xladdress");Debug.locals.put("xa", _xa);
 BA.debugLineNum = 67;BA.debugLine="xa.Initialize";
Debug.JustUpdateDeviceLine();
_xa.runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="xa.Col0Based = Col0Based";
Debug.JustUpdateDeviceLine();
_xa.setField ("Col0Based" /*RemoteObject*/ ,_col0based);
 BA.debugLineNum = 69;BA.debugLine="xa.Row0Based = Row0Based";
Debug.JustUpdateDeviceLine();
_xa.setField ("Row0Based" /*RemoteObject*/ ,_row0based);
 BA.debugLineNum = 70;BA.debugLine="Return xa";
Debug.JustUpdateDeviceLine();
if (true) return _xa;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addresszerotostring(RemoteObject __ref,RemoteObject _col0based,RemoteObject _row0based) throws Exception{
try {
		Debug.PushSubsStack("AddressZeroToString (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("addresszerotostring")) { return __ref.runUserSub(false, "xlutils","addresszerotostring", __ref, _col0based, _row0based);}
Debug.locals.put("Col0Based", _col0based);
Debug.locals.put("Row0Based", _row0based);
 BA.debugLineNum = 74;BA.debugLine="Public Sub AddressZeroToString(Col0Based As Int, R";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="Return AddressToString(AddressZero(Col0Based, Row";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlutils.class, "_addresstostring" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(_col0based),(Object)(_row0based))));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _areareferencetoxlrange(RemoteObject __ref,RemoteObject _poiworkbook,RemoteObject _areareference) throws Exception{
try {
		Debug.PushSubsStack("AreaReferenceToXLRange (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("areareferencetoxlrange")) { return __ref.runUserSub(false, "xlutils","areareferencetoxlrange", __ref, _poiworkbook, _areareference);}
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlutils._xlrange");
RemoteObject _firstcell = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _lastcell = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("PoiWorkbook", _poiworkbook);
Debug.locals.put("AreaReference", _areareference);
 BA.debugLineNum = 186;BA.debugLine="Public Sub AreaReferenceToXLRange (PoiWorkbook As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="Dim res As XLRange";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("b4j.example.xlutils._xlrange");Debug.locals.put("res", _res);
 BA.debugLineNum = 188;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 189;BA.debugLine="Dim FirstCell = AreaReference.RunMethod(\"getFirst";
Debug.JustUpdateDeviceLine();
_firstcell = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_firstcell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _areareference.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFirstCell")),(Object)((xlutils.__c.getField(false,"Null")))));Debug.locals.put("FirstCell", _firstcell);Debug.locals.put("FirstCell", _firstcell);
_lastcell = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_lastcell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _areareference.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLastCell")),(Object)((xlutils.__c.getField(false,"Null")))));Debug.locals.put("LastCell", _lastcell);Debug.locals.put("LastCell", _lastcell);
 BA.debugLineNum = 190;BA.debugLine="res.FirstAddress = AddressZero(FirstCell.RunMetho";
Debug.JustUpdateDeviceLine();
_res.setField ("FirstAddress" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _firstcell.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCol")),(Object)((xlutils.__c.getField(false,"Null")))))),(Object)(BA.numberCast(int.class, _firstcell.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRow")),(Object)((xlutils.__c.getField(false,"Null"))))))));
 BA.debugLineNum = 191;BA.debugLine="res.SecondAddress = AddressZero(LastCell.RunMetho";
Debug.JustUpdateDeviceLine();
_res.setField ("SecondAddress" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _lastcell.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCol")),(Object)((xlutils.__c.getField(false,"Null")))))),(Object)(BA.numberCast(int.class, _lastcell.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRow")),(Object)((xlutils.__c.getField(false,"Null"))))))));
 BA.debugLineNum = 192;BA.debugLine="res.Sheet = PoiWorkbook.GetSheetByName(FirstCell.";
Debug.JustUpdateDeviceLine();
_res.setField ("Sheet" /*RemoteObject*/ ,_poiworkbook.runMethod(false,"GetSheetByName",(Object)(BA.ObjectToString(_firstcell.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSheetName")),(Object)((xlutils.__c.getField(false,"Null"))))))));
 BA.debugLineNum = 193;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Public Reader As XLReader";
xlutils._reader = RemoteObject.createNew ("b4j.example.xlreader");__ref.setField("_reader",xlutils._reader);
 //BA.debugLineNum = 3;BA.debugLine="Type XLAddress (Col0Based As Int, Row0Based As In";
;
 //BA.debugLineNum = 4;BA.debugLine="Type XLRange (Sheet As PoiSheet, FirstAddress As";
;
 //BA.debugLineNum = 5;BA.debugLine="Public CreateWriterPassword As String";
xlutils._createwriterpassword = RemoteObject.createImmutable("");__ref.setField("_createwriterpassword",xlutils._createwriterpassword);
 //BA.debugLineNum = 6;BA.debugLine="Public COLOR_BLACK = 8 As Short";
xlutils._color_black = BA.numberCast(short.class, 8);__ref.setField("_color_black",xlutils._color_black);
 //BA.debugLineNum = 7;BA.debugLine="Public COLOR_WHITE = 9 As Short";
xlutils._color_white = BA.numberCast(short.class, 9);__ref.setField("_color_white",xlutils._color_white);
 //BA.debugLineNum = 8;BA.debugLine="Public COLOR_RED = 10 As Short";
xlutils._color_red = BA.numberCast(short.class, 10);__ref.setField("_color_red",xlutils._color_red);
 //BA.debugLineNum = 9;BA.debugLine="Public COLOR_BRIGHT_GREEN = 11 As Short";
xlutils._color_bright_green = BA.numberCast(short.class, 11);__ref.setField("_color_bright_green",xlutils._color_bright_green);
 //BA.debugLineNum = 10;BA.debugLine="Public COLOR_BLUE = 12 As Short";
xlutils._color_blue = BA.numberCast(short.class, 12);__ref.setField("_color_blue",xlutils._color_blue);
 //BA.debugLineNum = 11;BA.debugLine="Public COLOR_YELLOW = 13 As Short";
xlutils._color_yellow = BA.numberCast(short.class, 13);__ref.setField("_color_yellow",xlutils._color_yellow);
 //BA.debugLineNum = 12;BA.debugLine="Public COLOR_PINK = 14 As Short";
xlutils._color_pink = BA.numberCast(short.class, 14);__ref.setField("_color_pink",xlutils._color_pink);
 //BA.debugLineNum = 13;BA.debugLine="Public COLOR_TURQUOISE = 15 As Short";
xlutils._color_turquoise = BA.numberCast(short.class, 15);__ref.setField("_color_turquoise",xlutils._color_turquoise);
 //BA.debugLineNum = 14;BA.debugLine="Public COLOR_DARK_RED = 16 As Short";
xlutils._color_dark_red = BA.numberCast(short.class, 16);__ref.setField("_color_dark_red",xlutils._color_dark_red);
 //BA.debugLineNum = 15;BA.debugLine="Public COLOR_GREEN = 17 As Short";
xlutils._color_green = BA.numberCast(short.class, 17);__ref.setField("_color_green",xlutils._color_green);
 //BA.debugLineNum = 16;BA.debugLine="Public COLOR_DARK_BLUE = 18 As Short";
xlutils._color_dark_blue = BA.numberCast(short.class, 18);__ref.setField("_color_dark_blue",xlutils._color_dark_blue);
 //BA.debugLineNum = 17;BA.debugLine="Public COLOR_DARK_YELLOW = 19 As Short";
xlutils._color_dark_yellow = BA.numberCast(short.class, 19);__ref.setField("_color_dark_yellow",xlutils._color_dark_yellow);
 //BA.debugLineNum = 18;BA.debugLine="Public COLOR_VIOLET = 20 As Short";
xlutils._color_violet = BA.numberCast(short.class, 20);__ref.setField("_color_violet",xlutils._color_violet);
 //BA.debugLineNum = 19;BA.debugLine="Public COLOR_TEAL = 21 As Short";
xlutils._color_teal = BA.numberCast(short.class, 21);__ref.setField("_color_teal",xlutils._color_teal);
 //BA.debugLineNum = 20;BA.debugLine="Public COLOR_GREY_25_PERCENT = 22 As Short";
xlutils._color_grey_25_percent = BA.numberCast(short.class, 22);__ref.setField("_color_grey_25_percent",xlutils._color_grey_25_percent);
 //BA.debugLineNum = 21;BA.debugLine="Public COLOR_GREY_50_PERCENT = 23 As Short";
xlutils._color_grey_50_percent = BA.numberCast(short.class, 23);__ref.setField("_color_grey_50_percent",xlutils._color_grey_50_percent);
 //BA.debugLineNum = 22;BA.debugLine="Public COLOR_CORNFLOWER_BLUE = 24 As Short";
xlutils._color_cornflower_blue = BA.numberCast(short.class, 24);__ref.setField("_color_cornflower_blue",xlutils._color_cornflower_blue);
 //BA.debugLineNum = 23;BA.debugLine="Public COLOR_MAROON = 25 As Short";
xlutils._color_maroon = BA.numberCast(short.class, 25);__ref.setField("_color_maroon",xlutils._color_maroon);
 //BA.debugLineNum = 24;BA.debugLine="Public COLOR_LEMON_CHIFFON = 26 As Short";
xlutils._color_lemon_chiffon = BA.numberCast(short.class, 26);__ref.setField("_color_lemon_chiffon",xlutils._color_lemon_chiffon);
 //BA.debugLineNum = 25;BA.debugLine="Public COLOR_LIGHT_TURQUOISE1 = 27 As Short";
xlutils._color_light_turquoise1 = BA.numberCast(short.class, 27);__ref.setField("_color_light_turquoise1",xlutils._color_light_turquoise1);
 //BA.debugLineNum = 26;BA.debugLine="Public COLOR_ORCHID = 28 As Short";
xlutils._color_orchid = BA.numberCast(short.class, 28);__ref.setField("_color_orchid",xlutils._color_orchid);
 //BA.debugLineNum = 27;BA.debugLine="Public COLOR_CORAL = 29 As Short";
xlutils._color_coral = BA.numberCast(short.class, 29);__ref.setField("_color_coral",xlutils._color_coral);
 //BA.debugLineNum = 28;BA.debugLine="Public COLOR_ROYAL_BLUE = 30 As Short";
xlutils._color_royal_blue = BA.numberCast(short.class, 30);__ref.setField("_color_royal_blue",xlutils._color_royal_blue);
 //BA.debugLineNum = 29;BA.debugLine="Public COLOR_LIGHT_CORNFLOWER_BLUE = 31 As Short";
xlutils._color_light_cornflower_blue = BA.numberCast(short.class, 31);__ref.setField("_color_light_cornflower_blue",xlutils._color_light_cornflower_blue);
 //BA.debugLineNum = 30;BA.debugLine="Public COLOR_SKY_BLUE = 40 As Short";
xlutils._color_sky_blue = BA.numberCast(short.class, 40);__ref.setField("_color_sky_blue",xlutils._color_sky_blue);
 //BA.debugLineNum = 31;BA.debugLine="Public COLOR_LIGHT_TURQUOISE = 41 As Short";
xlutils._color_light_turquoise = BA.numberCast(short.class, 41);__ref.setField("_color_light_turquoise",xlutils._color_light_turquoise);
 //BA.debugLineNum = 32;BA.debugLine="Public COLOR_LIGHT_GREEN = 42 As Short";
xlutils._color_light_green = BA.numberCast(short.class, 42);__ref.setField("_color_light_green",xlutils._color_light_green);
 //BA.debugLineNum = 33;BA.debugLine="Public COLOR_LIGHT_YELLOW = 43 As Short";
xlutils._color_light_yellow = BA.numberCast(short.class, 43);__ref.setField("_color_light_yellow",xlutils._color_light_yellow);
 //BA.debugLineNum = 34;BA.debugLine="Public COLOR_PALE_BLUE = 44 As Short";
xlutils._color_pale_blue = BA.numberCast(short.class, 44);__ref.setField("_color_pale_blue",xlutils._color_pale_blue);
 //BA.debugLineNum = 35;BA.debugLine="Public COLOR_ROSE = 45 As Short";
xlutils._color_rose = BA.numberCast(short.class, 45);__ref.setField("_color_rose",xlutils._color_rose);
 //BA.debugLineNum = 36;BA.debugLine="Public COLOR_LAVENDER = 46 As Short";
xlutils._color_lavender = BA.numberCast(short.class, 46);__ref.setField("_color_lavender",xlutils._color_lavender);
 //BA.debugLineNum = 37;BA.debugLine="Public COLOR_TAN = 47 As Short";
xlutils._color_tan = BA.numberCast(short.class, 47);__ref.setField("_color_tan",xlutils._color_tan);
 //BA.debugLineNum = 38;BA.debugLine="Public COLOR_LIGHT_BLUE = 48 As Short";
xlutils._color_light_blue = BA.numberCast(short.class, 48);__ref.setField("_color_light_blue",xlutils._color_light_blue);
 //BA.debugLineNum = 39;BA.debugLine="Public COLOR_AQUA = 49 As Short";
xlutils._color_aqua = BA.numberCast(short.class, 49);__ref.setField("_color_aqua",xlutils._color_aqua);
 //BA.debugLineNum = 40;BA.debugLine="Public COLOR_LIME = 50 As Short";
xlutils._color_lime = BA.numberCast(short.class, 50);__ref.setField("_color_lime",xlutils._color_lime);
 //BA.debugLineNum = 41;BA.debugLine="Public COLOR_GOLD = 51 As Short";
xlutils._color_gold = BA.numberCast(short.class, 51);__ref.setField("_color_gold",xlutils._color_gold);
 //BA.debugLineNum = 42;BA.debugLine="Public COLOR_LIGHT_ORANGE = 52 As Short";
xlutils._color_light_orange = BA.numberCast(short.class, 52);__ref.setField("_color_light_orange",xlutils._color_light_orange);
 //BA.debugLineNum = 43;BA.debugLine="Public COLOR_ORANGE = 53 As Short";
xlutils._color_orange = BA.numberCast(short.class, 53);__ref.setField("_color_orange",xlutils._color_orange);
 //BA.debugLineNum = 44;BA.debugLine="Public COLOR_BLUE_GREY = 54 As Short";
xlutils._color_blue_grey = BA.numberCast(short.class, 54);__ref.setField("_color_blue_grey",xlutils._color_blue_grey);
 //BA.debugLineNum = 45;BA.debugLine="Public COLOR_GREY_40_PERCENT = 55 As Short";
xlutils._color_grey_40_percent = BA.numberCast(short.class, 55);__ref.setField("_color_grey_40_percent",xlutils._color_grey_40_percent);
 //BA.debugLineNum = 46;BA.debugLine="Public COLOR_DARK_TEAL = 56 As Short";
xlutils._color_dark_teal = BA.numberCast(short.class, 56);__ref.setField("_color_dark_teal",xlutils._color_dark_teal);
 //BA.debugLineNum = 47;BA.debugLine="Public COLOR_SEA_GREEN = 57 As Short";
xlutils._color_sea_green = BA.numberCast(short.class, 57);__ref.setField("_color_sea_green",xlutils._color_sea_green);
 //BA.debugLineNum = 48;BA.debugLine="Public COLOR_DARK_GREEN = 58 As Short";
xlutils._color_dark_green = BA.numberCast(short.class, 58);__ref.setField("_color_dark_green",xlutils._color_dark_green);
 //BA.debugLineNum = 49;BA.debugLine="Public COLOR_OLIVE_GREEN = 59 As Short";
xlutils._color_olive_green = BA.numberCast(short.class, 59);__ref.setField("_color_olive_green",xlutils._color_olive_green);
 //BA.debugLineNum = 50;BA.debugLine="Public COLOR_BROWN = 60 As Short";
xlutils._color_brown = BA.numberCast(short.class, 60);__ref.setField("_color_brown",xlutils._color_brown);
 //BA.debugLineNum = 51;BA.debugLine="Public COLOR_PLUM = 61 As Short";
xlutils._color_plum = BA.numberCast(short.class, 61);__ref.setField("_color_plum",xlutils._color_plum);
 //BA.debugLineNum = 52;BA.debugLine="Public COLOR_INDIGO = 62 As Short";
xlutils._color_indigo = BA.numberCast(short.class, 62);__ref.setField("_color_indigo",xlutils._color_indigo);
 //BA.debugLineNum = 53;BA.debugLine="Public COLOR_GREY_80_PERCENT = 63 As Short";
xlutils._color_grey_80_percent = BA.numberCast(short.class, 63);__ref.setField("_color_grey_80_percent",xlutils._color_grey_80_percent);
 //BA.debugLineNum = 54;BA.debugLine="Public COLOR_AUTOMATIC = 64 As Short";
xlutils._color_automatic = BA.numberCast(short.class, 64);__ref.setField("_color_automatic",xlutils._color_automatic);
 //BA.debugLineNum = 55;BA.debugLine="Public BlankWorkbookIs2007 As Boolean = True";
xlutils._blankworkbookis2007 = xlutils.__c.getField(true,"True");__ref.setField("_blankworkbookis2007",xlutils._blankworkbookis2007);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createwriterblank(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateWriterBlank (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("createwriterblank")) { return __ref.runUserSub(false, "xlutils","createwriterblank", __ref);}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
RemoteObject _writer = RemoteObject.declareNull("b4j.example.xlworkbookwriter");
 BA.debugLineNum = 142;BA.debugLine="Public Sub CreateWriterBlank As XLWorkbookWriter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="Dim wb As PoiWorkbook";
Debug.JustUpdateDeviceLine();
_wb = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");Debug.locals.put("wb", _wb);
 BA.debugLineNum = 144;BA.debugLine="wb.InitializeNew(BlankWorkbookIs2007)";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("InitializeNew",(Object)(__ref.getField(true,"_blankworkbookis2007" /*RemoteObject*/ )));
 BA.debugLineNum = 145;BA.debugLine="Dim writer As XLWorkbookWriter";
Debug.JustUpdateDeviceLine();
_writer = RemoteObject.createNew ("b4j.example.xlworkbookwriter");Debug.locals.put("writer", _writer);
 BA.debugLineNum = 146;BA.debugLine="writer.Initialize(Me, wb, False)";
Debug.JustUpdateDeviceLine();
_writer.runClassMethod (b4j.example.xlworkbookwriter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_wb),(Object)(xlutils.__c.getField(true,"False")));
 BA.debugLineNum = 147;BA.debugLine="Return writer";
Debug.JustUpdateDeviceLine();
if (true) return _writer;
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createwriterfromtemplate(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CreateWriterFromTemplate (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("createwriterfromtemplate")) { return __ref.runUserSub(false, "xlutils","createwriterfromtemplate", __ref, _dir, _filename);}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
RemoteObject _writer = RemoteObject.declareNull("b4j.example.xlworkbookwriter");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 151;BA.debugLine="Public Sub CreateWriterFromTemplate (Dir As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Dim wb As PoiWorkbook";
Debug.JustUpdateDeviceLine();
_wb = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");Debug.locals.put("wb", _wb);
 BA.debugLineNum = 153;BA.debugLine="wb.InitializeExisting(Dir, FileName, CreateWriter";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("InitializeExisting",(Object)(_dir),(Object)(_filename),(Object)(__ref.getField(true,"_createwriterpassword" /*RemoteObject*/ )),(Object)(xlutils.__c.getField(true,"False")));
 BA.debugLineNum = 154;BA.debugLine="Dim writer As XLWorkbookWriter";
Debug.JustUpdateDeviceLine();
_writer = RemoteObject.createNew ("b4j.example.xlworkbookwriter");Debug.locals.put("writer", _writer);
 BA.debugLineNum = 155;BA.debugLine="writer.Initialize(Me, wb, True)";
Debug.JustUpdateDeviceLine();
_writer.runClassMethod (b4j.example.xlworkbookwriter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_wb),(Object)(xlutils.__c.getField(true,"True")));
 BA.debugLineNum = 156;BA.debugLine="Return writer";
Debug.JustUpdateDeviceLine();
if (true) return _writer;
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
public static RemoteObject  _createxlrange(RemoteObject __ref,RemoteObject _firstaddress,RemoteObject _secondaddress) throws Exception{
try {
		Debug.PushSubsStack("CreateXLRange (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("createxlrange")) { return __ref.runUserSub(false, "xlutils","createxlrange", __ref, _firstaddress, _secondaddress);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.xlutils._xlrange");
Debug.locals.put("FirstAddress", _firstaddress);
Debug.locals.put("SecondAddress", _secondaddress);
 BA.debugLineNum = 235;BA.debugLine="Public Sub CreateXLRange (FirstAddress As XLAddres";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 236;BA.debugLine="Dim t1 As XLRange";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.xlutils._xlrange");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 237;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 238;BA.debugLine="t1.FirstAddress = FirstAddress";
Debug.JustUpdateDeviceLine();
_t1.setField ("FirstAddress" /*RemoteObject*/ ,_firstaddress);
 BA.debugLineNum = 239;BA.debugLine="t1.SecondAddress = SecondAddress";
Debug.JustUpdateDeviceLine();
_t1.setField ("SecondAddress" /*RemoteObject*/ ,_secondaddress);
 BA.debugLineNum = 240;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createxlrangewithsheet(RemoteObject __ref,RemoteObject _firstaddress,RemoteObject _secondaddress,RemoteObject _poisheet) throws Exception{
try {
		Debug.PushSubsStack("CreateXLRangeWithSheet (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("createxlrangewithsheet")) { return __ref.runUserSub(false, "xlutils","createxlrangewithsheet", __ref, _firstaddress, _secondaddress, _poisheet);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.xlutils._xlrange");
Debug.locals.put("FirstAddress", _firstaddress);
Debug.locals.put("SecondAddress", _secondaddress);
Debug.locals.put("PoiSheet", _poisheet);
 BA.debugLineNum = 244;BA.debugLine="Public Sub CreateXLRangeWithSheet (FirstAddress As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="Dim t1 As XLRange";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.xlutils._xlrange");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 246;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 247;BA.debugLine="t1.FirstAddress = FirstAddress";
Debug.JustUpdateDeviceLine();
_t1.setField ("FirstAddress" /*RemoteObject*/ ,_firstaddress);
 BA.debugLineNum = 248;BA.debugLine="t1.SecondAddress = SecondAddress";
Debug.JustUpdateDeviceLine();
_t1.setField ("SecondAddress" /*RemoteObject*/ ,_secondaddress);
 BA.debugLineNum = 249;BA.debugLine="t1.Sheet = PoiSheet";
Debug.JustUpdateDeviceLine();
_t1.setField ("Sheet" /*RemoteObject*/ ,_poisheet);
 BA.debugLineNum = 250;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formulatorange(RemoteObject __ref,RemoteObject _poiworkbook,RemoteObject _formula,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("FormulaToRange (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("formulatorange")) { return __ref.runUserSub(false, "xlutils","formulatorange", __ref, _poiworkbook, _formula, _name);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _areareference = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlutils._xlrange");
Debug.locals.put("PoiWorkbook", _poiworkbook);
Debug.locals.put("Formula", _formula);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 177;BA.debugLine="Private Sub FormulaToRange (PoiWorkbook As PoiWork";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _poiworkbook.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 179;BA.debugLine="Dim AreaReference As JavaObject";
Debug.JustUpdateDeviceLine();
_areareference = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("AreaReference", _areareference);
 BA.debugLineNum = 180;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
Debug.JustUpdateDeviceLine();
_areareference.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.util.AreaReference")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_formula),_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSpreadsheetVersion")),(Object)((xlutils.__c.getField(false,"Null"))))})));
 BA.debugLineNum = 181;BA.debugLine="Dim res As XLRange = AreaReferenceToXLRange(PoiWo";
Debug.JustUpdateDeviceLine();
_res = __ref.runClassMethod (b4j.example.xlutils.class, "_areareferencetoxlrange" /*RemoteObject*/ ,(Object)(_poiworkbook),(Object)(_areareference));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 182;BA.debugLine="res.Name = Name";
Debug.JustUpdateDeviceLine();
_res.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 183;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getworkbookrangenames(RemoteObject __ref,RemoteObject _poiworkbook) throws Exception{
try {
		Debug.PushSubsStack("GetWorkbookRangeNames (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("getworkbookrangenames")) { return __ref.runUserSub(false, "xlutils","getworkbookrangenames", __ref, _poiworkbook);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _names = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _name = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _formula = RemoteObject.createImmutable("");
RemoteObject _namename = RemoteObject.createImmutable("");
Debug.locals.put("PoiWorkbook", _poiworkbook);
 BA.debugLineNum = 160;BA.debugLine="Public Sub GetWorkbookRangeNames (PoiWorkbook As P";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 162;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 163;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _poiworkbook.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 164;BA.debugLine="Dim names As List = jo.RunMethod(\"getAllNames\", N";
Debug.JustUpdateDeviceLine();
_names = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_names = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllNames")),(Object)((xlutils.__c.getField(false,"Null")))));Debug.locals.put("names", _names);Debug.locals.put("names", _names);
 BA.debugLineNum = 165;BA.debugLine="For Each name As JavaObject In names";
Debug.JustUpdateDeviceLine();
_name = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
{
final RemoteObject group5 = _names;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group5.runMethod(false,"Get",index5));Debug.locals.put("name", _name);
Debug.locals.put("name", _name);
 BA.debugLineNum = 166;BA.debugLine="Dim Formula As String = name.RunMethod(\"getRefer";
Debug.JustUpdateDeviceLine();
_formula = BA.ObjectToString(_name.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRefersToFormula")),(Object)((xlutils.__c.getField(false,"Null")))));Debug.locals.put("Formula", _formula);Debug.locals.put("Formula", _formula);
 BA.debugLineNum = 167;BA.debugLine="Dim NameName As String = name.RunMethod(\"getName";
Debug.JustUpdateDeviceLine();
_namename = BA.ObjectToString(_name.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getNameName")),(Object)((xlutils.__c.getField(false,"Null")))));Debug.locals.put("NameName", _namename);Debug.locals.put("NameName", _namename);
 BA.debugLineNum = 168;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 169;BA.debugLine="res.Add(FormulaToRange(PoiWorkbook, Formula , N";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.xlutils.class, "_formulatorange" /*RemoteObject*/ ,(Object)(_poiworkbook),(Object)(_formula),(Object)(_namename)))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 171;BA.debugLine="Log($\"info: cannot get range of: ${NameName} -";
Debug.JustUpdateDeviceLine();
xlutils.__c.runVoidMethod ("LogImpl","915728651",(RemoteObject.concat(RemoteObject.createImmutable("info: cannot get range of: "),xlutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_namename))),RemoteObject.createImmutable(" - "),xlutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_formula))),RemoteObject.createImmutable(" "))),0);
 };
 }
}Debug.locals.put("name", _name);
;
 BA.debugLineNum = 174;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xlutils","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 58;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="Reader.Initialize (Me)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_reader" /*RemoteObject*/ ).runClassMethod (b4j.example.xlreader.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openexcel(RemoteObject __ref,RemoteObject _filepath) throws Exception{
try {
		Debug.PushSubsStack("OpenExcel (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("openexcel")) { return __ref.runUserSub(false, "xlutils","openexcel", __ref, _filepath);}
ResumableSub_OpenExcel rsub = new ResumableSub_OpenExcel(null,__ref,_filepath);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_OpenExcel extends BA.ResumableSub {
public ResumableSub_OpenExcel(b4j.example.xlutils parent,RemoteObject __ref,RemoteObject _filepath) {
this.parent = parent;
this.__ref = __ref;
this._filepath = _filepath;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.xlutils parent;
RemoteObject _filepath;
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("OpenExcel (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,256);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("FilePath", _filepath);
 BA.debugLineNum = 258;BA.debugLine="Dim shl As Shell";
Debug.JustUpdateDeviceLine();
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 259;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"cmd.exe\",";
Debug.JustUpdateDeviceLine();
_shl.runVoidMethod ("InitializeDoNotHandleQuotes",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("cmd.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable(("/c")),RemoteObject.createImmutable(("start")),((RemoteObject.createImmutable("\"\""))),((RemoteObject.concat(RemoteObject.createImmutable("\""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filepath))),RemoteObject.createImmutable("\""))))})))));
 BA.debugLineNum = 260;BA.debugLine="shl.Run(-1)";
Debug.JustUpdateDeviceLine();
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 261;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "xlutils", "openexcel"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 262;BA.debugLine="If ExitCode <> 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_exitcode,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 263;BA.debugLine="Log(StdOut)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","916318471",_stdout,0);
 BA.debugLineNum = 264;BA.debugLine="Log(StdErr)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","916318472",_stderr,0);
 BA.debugLineNum = 265;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 267;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _shl_processcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
}
public static RemoteObject  _powershellconverttopdf(RemoteObject __ref,RemoteObject _inputfile,RemoteObject _outputfile,RemoteObject _sheetindex,RemoteObject _openpdf) throws Exception{
try {
		Debug.PushSubsStack("PowerShellConvertToPdf (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("powershellconverttopdf")) { return __ref.runUserSub(false, "xlutils","powershellconverttopdf", __ref, _inputfile, _outputfile, _sheetindex, _openpdf);}
ResumableSub_PowerShellConvertToPdf rsub = new ResumableSub_PowerShellConvertToPdf(null,__ref,_inputfile,_outputfile,_sheetindex,_openpdf);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PowerShellConvertToPdf extends BA.ResumableSub {
public ResumableSub_PowerShellConvertToPdf(b4j.example.xlutils parent,RemoteObject __ref,RemoteObject _inputfile,RemoteObject _outputfile,RemoteObject _sheetindex,RemoteObject _openpdf) {
this.parent = parent;
this.__ref = __ref;
this._inputfile = _inputfile;
this._outputfile = _outputfile;
this._sheetindex = _sheetindex;
this._openpdf = _openpdf;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.xlutils parent;
RemoteObject _inputfile;
RemoteObject _outputfile;
RemoteObject _sheetindex;
RemoteObject _openpdf;
RemoteObject _objecttoconvert = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell.ShellSyncResult");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PowerShellConvertToPdf (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,273);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("InputFile", _inputfile);
Debug.locals.put("OutputFile", _outputfile);
Debug.locals.put("SheetIndex", _sheetindex);
Debug.locals.put("OpenPdf", _openpdf);
 BA.debugLineNum = 274;BA.debugLine="File.Delete(OutputFile, \"\")";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_outputfile),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 275;BA.debugLine="If File.Exists(OutputFile, \"\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_outputfile),(Object)(RemoteObject.createImmutable(""))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 276;BA.debugLine="Log(\"Cannot delete output file\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","916384003",RemoteObject.createImmutable("Cannot delete output file"),0);
 BA.debugLineNum = 277;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 279;BA.debugLine="Dim ObjectToConvert As String";
Debug.JustUpdateDeviceLine();
_objecttoconvert = RemoteObject.createImmutable("");Debug.locals.put("ObjectToConvert", _objecttoconvert);
 BA.debugLineNum = 280;BA.debugLine="If SheetIndex < 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("<",_sheetindex,BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 281;BA.debugLine="ObjectToConvert = \"$workbook\"";
Debug.JustUpdateDeviceLine();
_objecttoconvert = BA.ObjectToString("$workbook");Debug.locals.put("ObjectToConvert", _objecttoconvert);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 283;BA.debugLine="ObjectToConvert = $\"$workbook.Sheets[${SheetInde";
Debug.JustUpdateDeviceLine();
_objecttoconvert = (RemoteObject.concat(RemoteObject.createImmutable("$workbook.Sheets["),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {_sheetindex,RemoteObject.createImmutable(1)}, "+",1, 1)))),RemoteObject.createImmutable("]")));Debug.locals.put("ObjectToConvert", _objecttoconvert);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 285;BA.debugLine="Dim s As String = $\" 	& {$objExcel = New-Object -";
Debug.JustUpdateDeviceLine();
_s = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	& {$objExcel = New-Object -ComObject excel.application\n"),RemoteObject.createImmutable("$workbook = $objExcel.workbooks.open('"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_inputfile))),RemoteObject.createImmutable("', 3)\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttoconvert))),RemoteObject.createImmutable(".ExportAsFixedFormat($xlFixedFormat::xlTypePDF, '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_outputfile))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("$objExcel.Workbooks.close()\n"),RemoteObject.createImmutable("$objExcel.Quit()}")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 291;BA.debugLine="Wait For (PowerShellScript(s)) Complete (Result A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "xlutils", "powershellconverttopdf"), __ref.runClassMethod (b4j.example.xlutils.class, "_powershellscript" /*RemoteObject*/ ,(Object)(_s)));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 292;BA.debugLine="If Result.ExitCode <> 0 Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_result.getField(true,"ExitCode"),BA.numberCast(double.class, 0))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 293;BA.debugLine="If OpenPdf Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 20;
if (_openpdf.<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 294;BA.debugLine="Wait For (PowerShellScript($\"& {Invoke-Item '${O";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "xlutils", "powershellconverttopdf"), __ref.runClassMethod (b4j.example.xlutils.class, "_powershellscript" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("& {Invoke-Item '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_outputfile))),RemoteObject.createImmutable("'}"))))));
this.state = 22;
return;
case 22:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 295;BA.debugLine="Return Result.ExitCode = 0";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_result.getField(true,"ExitCode"),BA.numberCast(double.class, 0)))));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 297;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _powershellscript(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("PowerShellScript (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,300);
if (RapidSub.canDelegate("powershellscript")) { return __ref.runUserSub(false, "xlutils","powershellscript", __ref, _s);}
ResumableSub_PowerShellScript rsub = new ResumableSub_PowerShellScript(null,__ref,_s);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PowerShellScript extends BA.ResumableSub {
public ResumableSub_PowerShellScript(b4j.example.xlutils parent,RemoteObject __ref,RemoteObject _s) {
this.parent = parent;
this.__ref = __ref;
this._s = _s;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.xlutils parent;
RemoteObject _s;
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell.ShellSyncResult");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PowerShellScript (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,300);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("s", _s);
 BA.debugLineNum = 301;BA.debugLine="s = s.Replace(CRLF, \";\").Replace(\"\"\"\", \"'\")";
Debug.JustUpdateDeviceLine();
_s = _s.runMethod(true,"replace",(Object)(parent.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable(";"))).runMethod(true,"replace",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable("'")));Debug.locals.put("s", _s);
 BA.debugLineNum = 302;BA.debugLine="Dim shl As Shell";
Debug.JustUpdateDeviceLine();
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 303;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"powershel";
Debug.JustUpdateDeviceLine();
_shl.runVoidMethod ("InitializeDoNotHandleQuotes",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("powershell.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("-Command")),(_s)})))));
 BA.debugLineNum = 304;BA.debugLine="shl.Run(-1)";
Debug.JustUpdateDeviceLine();
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 305;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "xlutils", "powershellscript"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 306;BA.debugLine="Dim res As ShellSyncResult";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell.ShellSyncResult");Debug.locals.put("res", _res);
 BA.debugLineNum = 307;BA.debugLine="res.ExitCode = ExitCode";
Debug.JustUpdateDeviceLine();
_res.setField ("ExitCode",_exitcode);
 BA.debugLineNum = 308;BA.debugLine="res.StdErr = StdErr";
Debug.JustUpdateDeviceLine();
_res.setField ("StdErr",_stderr);
 BA.debugLineNum = 309;BA.debugLine="res.StdOut = StdOut";
Debug.JustUpdateDeviceLine();
_res.setField ("StdOut",_stdout);
 BA.debugLineNum = 310;BA.debugLine="res.Success = Success";
Debug.JustUpdateDeviceLine();
_res.setField ("Success",_success);
 BA.debugLineNum = 311;BA.debugLine="If StdErr <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_stderr,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 312;BA.debugLine="Log(StdErr)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","916449548",_stderr,0);
 BA.debugLineNum = 313;BA.debugLine="If ExitCode = 0 Then res.ExitCode = 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_res.setField ("ExitCode",BA.numberCast(int.class, 1));
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 315;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _rangestringornametorange(RemoteObject __ref,RemoteObject _poiworkbook,RemoteObject _rangeorname) throws Exception{
try {
		Debug.PushSubsStack("RangeStringOrNameToRange (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("rangestringornametorange")) { return __ref.runUserSub(false, "xlutils","rangestringornametorange", __ref, _poiworkbook, _rangeorname);}
RemoteObject _referstoformula = RemoteObject.createImmutable("");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _name = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("PoiWorkbook", _poiworkbook);
Debug.locals.put("RangeOrName", _rangeorname);
 BA.debugLineNum = 197;BA.debugLine="Public Sub RangeStringOrNameToRange (PoiWorkbook A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="Dim RefersToFormula As String";
Debug.JustUpdateDeviceLine();
_referstoformula = RemoteObject.createImmutable("");Debug.locals.put("RefersToFormula", _referstoformula);
 BA.debugLineNum = 199;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _poiworkbook.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 200;BA.debugLine="Dim name As JavaObject = jo.RunMethod(\"getName\",";
Debug.JustUpdateDeviceLine();
_name = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_name = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getName")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rangeorname)}))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 201;BA.debugLine="If name.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_name.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 202;BA.debugLine="RefersToFormula  = name.RunMethod(\"getRefersToFo";
Debug.JustUpdateDeviceLine();
_referstoformula = BA.ObjectToString(_name.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRefersToFormula")),(Object)((xlutils.__c.getField(false,"Null")))));Debug.locals.put("RefersToFormula", _referstoformula);
 }else {
 BA.debugLineNum = 204;BA.debugLine="RefersToFormula = RangeOrName";
Debug.JustUpdateDeviceLine();
_referstoformula = _rangeorname;Debug.locals.put("RefersToFormula", _referstoformula);
 };
 BA.debugLineNum = 206;BA.debugLine="Return FormulaToRange(PoiWorkbook, RefersToFormul";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlutils.class, "_formulatorange" /*RemoteObject*/ ,(Object)(_poiworkbook),(Object)(_referstoformula),(Object)(_rangeorname));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xladdresstocellreference(RemoteObject __ref,RemoteObject _sheetname,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("XLAddressToCellReference (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("xladdresstocellreference")) { return __ref.runUserSub(false, "xlutils","xladdresstocellreference", __ref, _sheetname, _address);}
RemoteObject _cellreference1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("SheetName", _sheetname);
Debug.locals.put("Address", _address);
 BA.debugLineNum = 226;BA.debugLine="Public Sub XLAddressToCellReference (SheetName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="Dim CellReference1 As JavaObject";
Debug.JustUpdateDeviceLine();
_cellreference1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CellReference1", _cellreference1);
 BA.debugLineNum = 228;BA.debugLine="CellReference1.InitializeNewInstance(\"org.apache.";
Debug.JustUpdateDeviceLine();
_cellreference1.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.util.CellReference")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_sheetname),(_address.getField(true,"Row0Based" /*RemoteObject*/ )),(_address.getField(true,"Col0Based" /*RemoteObject*/ )),(xlutils.__c.getField(true,"True")),(xlutils.__c.getField(true,"True"))})));
 BA.debugLineNum = 229;BA.debugLine="Return CellReference1";
Debug.JustUpdateDeviceLine();
if (true) return _cellreference1;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlrangetoareareference(RemoteObject __ref,RemoteObject _workbook,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("XLRangeToAreaReference (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("xlrangetoareareference")) { return __ref.runUserSub(false, "xlutils","xlrangetoareareference", __ref, _workbook, _range);}
RemoteObject _cellreference1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cellreference2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _areareference = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Workbook", _workbook);
Debug.locals.put("Range", _range);
 BA.debugLineNum = 217;BA.debugLine="Public Sub XLRangeToAreaReference (Workbook As XLW";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="Dim CellReference1 = XLAddressToCellReference(Ran";
Debug.JustUpdateDeviceLine();
_cellreference1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_cellreference1 = __ref.runClassMethod (b4j.example.xlutils.class, "_xladdresstocellreference" /*RemoteObject*/ ,(Object)(_range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(true,"getName")),(Object)(_range.getField(false,"FirstAddress" /*RemoteObject*/ )));Debug.locals.put("CellReference1", _cellreference1);Debug.locals.put("CellReference1", _cellreference1);
 BA.debugLineNum = 219;BA.debugLine="Dim CellReference2 = XLAddressToCellReference(Ran";
Debug.JustUpdateDeviceLine();
_cellreference2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_cellreference2 = __ref.runClassMethod (b4j.example.xlutils.class, "_xladdresstocellreference" /*RemoteObject*/ ,(Object)(_range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(true,"getName")),(Object)(_range.getField(false,"SecondAddress" /*RemoteObject*/ )));Debug.locals.put("CellReference2", _cellreference2);Debug.locals.put("CellReference2", _cellreference2);
 BA.debugLineNum = 220;BA.debugLine="Dim AreaReference As JavaObject";
Debug.JustUpdateDeviceLine();
_areareference = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("AreaReference", _areareference);
 BA.debugLineNum = 221;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
Debug.JustUpdateDeviceLine();
_areareference.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.util.AreaReference")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_cellreference1.getObject()),(_cellreference2.getObject()),(_workbook.runClassMethod (b4j.example.xlworkbookwriter.class, "_getversionname" /*RemoteObject*/ ))})));
 BA.debugLineNum = 222;BA.debugLine="Return AreaReference";
Debug.JustUpdateDeviceLine();
if (true) return _areareference;
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlrangetocellrangeaddress(RemoteObject __ref,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("XLRangeToCellRangeAddress (xlutils) ","xlutils",18,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("xlrangetocellrangeaddress")) { return __ref.runUserSub(false, "xlutils","xlrangetocellrangeaddress", __ref, _range);}
RemoteObject _cellrange = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Range", _range);
 BA.debugLineNum = 210;BA.debugLine="Public Sub XLRangeToCellRangeAddress (Range As XLR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="Dim CellRange As JavaObject";
Debug.JustUpdateDeviceLine();
_cellrange = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CellRange", _cellrange);
 BA.debugLineNum = 212;BA.debugLine="CellRange.InitializeNewInstance(\"org.apache.poi.s";
Debug.JustUpdateDeviceLine();
_cellrange.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.util.CellRangeAddress")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ )),(_range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ )),(_range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ )),(_range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ))})));
 BA.debugLineNum = 213;BA.debugLine="Return CellRange";
Debug.JustUpdateDeviceLine();
if (true) return _cellrange;
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}