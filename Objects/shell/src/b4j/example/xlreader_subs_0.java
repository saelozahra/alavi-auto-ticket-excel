package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xlreader_subs_0 {


public static RemoteObject  _celltoobject(RemoteObject __ref,RemoteObject _cell,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("CellToObject (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("celltoobject")) { return __ref.runUserSub(false, "xlreader","celltoobject", __ref, _cell, _result);}
RemoteObject _jcell = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _hyperlink = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _h = RemoteObject.declareNull("b4j.example.xlreaderresult._xlhyperlink");
RemoteObject _celladdress = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("cell", _cell);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 168;BA.debugLine="Private Sub CellToObject (cell As PoiCell, Result";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 169;BA.debugLine="If cell.IsInitialized = False Then Return Missing";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cell.runMethod(true,"IsInitialized"),xlreader.__c.getField(true,"False"))) { 
if (true) return __ref.getField(false,"_missingcellvalue" /*RemoteObject*/ );};
 BA.debugLineNum = 170;BA.debugLine="If FetchHyperlinks Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_fetchhyperlinks" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 171;BA.debugLine="Dim jcell As JavaObject = cell";
Debug.JustUpdateDeviceLine();
_jcell = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jcell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _cell.getObject());Debug.locals.put("jcell", _jcell);Debug.locals.put("jcell", _jcell);
 BA.debugLineNum = 172;BA.debugLine="Dim hyperlink As JavaObject = jcell.RunMethod(\"g";
Debug.JustUpdateDeviceLine();
_hyperlink = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_hyperlink = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jcell.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getHyperlink")),(Object)((xlreader.__c.getField(false,"Null")))));Debug.locals.put("hyperlink", _hyperlink);Debug.locals.put("hyperlink", _hyperlink);
 BA.debugLineNum = 173;BA.debugLine="If hyperlink.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_hyperlink.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 174;BA.debugLine="Dim h As XLHyperlink";
Debug.JustUpdateDeviceLine();
_h = RemoteObject.createNew ("b4j.example.xlreaderresult._xlhyperlink");Debug.locals.put("h", _h);
 BA.debugLineNum = 175;BA.debugLine="h.Initialize";
Debug.JustUpdateDeviceLine();
_h.runVoidMethod ("Initialize");
 BA.debugLineNum = 176;BA.debugLine="h.Address = ObjectToString(hyperlink.RunMethod(";
Debug.JustUpdateDeviceLine();
_h.setField ("Address" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.xlreader.class, "_objecttostring" /*RemoteObject*/ ,(Object)(_hyperlink.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAddress")),(Object)((xlreader.__c.getField(false,"Null")))))));
 BA.debugLineNum = 177;BA.debugLine="h.Label = ObjectToString(hyperlink.RunMethod(\"g";
Debug.JustUpdateDeviceLine();
_h.setField ("Label" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.xlreader.class, "_objecttostring" /*RemoteObject*/ ,(Object)(_hyperlink.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLabel")),(Object)((xlreader.__c.getField(false,"Null")))))));
 BA.debugLineNum = 178;BA.debugLine="h.LinkType = hyperlink.RunMethod(\"getType\", Nul";
Debug.JustUpdateDeviceLine();
_h.setField ("LinkType" /*RemoteObject*/ ,BA.ObjectToString(_hyperlink.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getType")),(Object)((xlreader.__c.getField(false,"Null"))))));
 BA.debugLineNum = 179;BA.debugLine="Dim CellAddress As JavaObject = jcell.RunMethod";
Debug.JustUpdateDeviceLine();
_celladdress = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_celladdress = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jcell.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAddress")),(Object)((xlreader.__c.getField(false,"Null")))));Debug.locals.put("CellAddress", _celladdress);Debug.locals.put("CellAddress", _celladdress);
 BA.debugLineNum = 180;BA.debugLine="Result.Hyperlinks.Put(CellAddress.RunMethod(\"fo";
Debug.JustUpdateDeviceLine();
_result.getField(false,"_hyperlinks" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_celladdress.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("formatAsString")),(Object)((xlreader.__c.getField(false,"Null"))))),(Object)((_h)));
 };
 };
 BA.debugLineNum = 183;BA.debugLine="If FetchFormulasInsteadOfCachedValues Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_fetchformulasinsteadofcachedvalues" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return _cell.runMethod(false,"getValue");}
else {
if (true) return _cell.runMethod(false,"getValueCached");};
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private EmptyRow() As Object";
xlreader._emptyrow = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_emptyrow",xlreader._emptyrow);
 //BA.debugLineNum = 3;BA.debugLine="Public Password As String";
xlreader._password = RemoteObject.createImmutable("");__ref.setField("_password",xlreader._password);
 //BA.debugLineNum = 4;BA.debugLine="Private xl As XLUtils 'ignore";
xlreader._xl = RemoteObject.createNew ("b4j.example.xlutils");__ref.setField("_xl",xlreader._xl);
 //BA.debugLineNum = 5;BA.debugLine="Private MissingCellValue As Object = \"\"";
xlreader._missingcellvalue = RemoteObject.createImmutable((""));__ref.setField("_missingcellvalue",xlreader._missingcellvalue);
 //BA.debugLineNum = 6;BA.debugLine="Public FetchFormulasInsteadOfCachedValues As Bool";
xlreader._fetchformulasinsteadofcachedvalues = RemoteObject.createImmutable(false);__ref.setField("_fetchformulasinsteadofcachedvalues",xlreader._fetchformulasinsteadofcachedvalues);
 //BA.debugLineNum = 7;BA.debugLine="Public FetchHyperlinks As Boolean";
xlreader._fetchhyperlinks = RemoteObject.createImmutable(false);__ref.setField("_fetchhyperlinks",xlreader._fetchhyperlinks);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _closewbaftersleep(RemoteObject __ref,RemoteObject _wb) throws Exception{
try {
		Debug.PushSubsStack("CloseWBAfterSleep (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("closewbaftersleep")) { __ref.runUserSub(false, "xlreader","closewbaftersleep", __ref, _wb); return;}
ResumableSub_CloseWBAfterSleep rsub = new ResumableSub_CloseWBAfterSleep(null,__ref,_wb);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CloseWBAfterSleep extends BA.ResumableSub {
public ResumableSub_CloseWBAfterSleep(b4j.example.xlreader parent,RemoteObject __ref,RemoteObject _wb) {
this.parent = parent;
this.__ref = __ref;
this._wb = _wb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.xlreader parent;
RemoteObject _wb;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CloseWBAfterSleep (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,33);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("wb", _wb);
 BA.debugLineNum = 34;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "xlreader", "closewbaftersleep"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 35;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 36;BA.debugLine="wb.Close";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 38;BA.debugLine="Log(LastException)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","97929861",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _createxlreaderresult(RemoteObject __ref,RemoteObject _data,RemoteObject _topleft,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("CreateXLReaderResult (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("createxlreaderresult")) { return __ref.runUserSub(false, "xlreader","createxlreaderresult", __ref, _data, _topleft, _name);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.xlreaderresult");
Debug.locals.put("Data", _data);
Debug.locals.put("TopLeft", _topleft);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 191;BA.debugLine="Private Sub CreateXLReaderResult (Data As List, To";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="Dim t1 As XLReaderResult";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.example.xlreaderresult");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 193;BA.debugLine="t1.Initialize(xl)";
Debug.JustUpdateDeviceLine();
_t1.runClassMethod (b4j.example.xlreaderresult.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ )));
 BA.debugLineNum = 194;BA.debugLine="t1.Data = Data";
Debug.JustUpdateDeviceLine();
_t1.setField ("_data" /*RemoteObject*/ ,_data);
 BA.debugLineNum = 195;BA.debugLine="t1.TopLeft = TopLeft";
Debug.JustUpdateDeviceLine();
_t1.setField ("_topleft" /*RemoteObject*/ ,_topleft);
 BA.debugLineNum = 196;BA.debugLine="t1.Name = Name";
Debug.JustUpdateDeviceLine();
_t1.setField ("_name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 197;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xlreader","initialize", __ref, _ba, _vxl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vXL", _vxl);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="xl = vXL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xl" /*RemoteObject*/ ,_vxl);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objecttostring(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("ObjectToString (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("objecttostring")) { return __ref.runUserSub(false, "xlreader","objecttostring", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 186;BA.debugLine="Private Sub ObjectToString(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="If o = Null Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_o)) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 188;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_o);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openworkbook(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("OpenWorkbook (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("openworkbook")) { return __ref.runUserSub(false, "xlreader","openworkbook", __ref, _dir, _filename);}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 21;BA.debugLine="Private Sub OpenWorkbook (Dir As String, FileName";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="If Dir = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dir,BA.ObjectToString(""))) { 
 BA.debugLineNum = 23;BA.debugLine="Dir = FileName";
Debug.JustUpdateDeviceLine();
_dir = _filename;Debug.locals.put("Dir", _dir);
 BA.debugLineNum = 24;BA.debugLine="FileName = \"\"";
Debug.JustUpdateDeviceLine();
_filename = BA.ObjectToString("");Debug.locals.put("FileName", _filename);
 };
 BA.debugLineNum = 26;BA.debugLine="Dim wb As PoiWorkbook";
Debug.JustUpdateDeviceLine();
_wb = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");Debug.locals.put("wb", _wb);
 BA.debugLineNum = 27;BA.debugLine="wb.InitializeExisting(Dir, FileName, Password, Tr";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("InitializeExisting",(Object)(_dir),(Object)(_filename),(Object)(__ref.getField(true,"_password" /*RemoteObject*/ )),(Object)(xlreader.__c.getField(true,"True")));
 BA.debugLineNum = 28;BA.debugLine="CloseWBAfterSleep(wb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.xlreader.class, "_closewbaftersleep" /*void*/ ,(Object)(_wb));
 BA.debugLineNum = 29;BA.debugLine="Return wb";
Debug.JustUpdateDeviceLine();
if (true) return _wb;
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rangetoresult(RemoteObject __ref,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("RangeToResult (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("rangetoresult")) { return __ref.runUserSub(false, "xlreader","rangetoresult", __ref, _range);}
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _right = RemoteObject.createImmutable(0);
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _bottom = RemoteObject.createImmutable(0);
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlreaderresult");
int _r = 0;
RemoteObject _row = null;
RemoteObject _prow = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiRowWrapper");
int _c = 0;
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
Debug.locals.put("range", _range);
 BA.debugLineNum = 88;BA.debugLine="Public Sub RangeToResult (range As XLRange) As XLR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="Dim left = Min(range.FirstAddress.Col0Based, rang";
Debug.JustUpdateDeviceLine();
_left = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ )))));Debug.locals.put("left", _left);Debug.locals.put("left", _left);
_right = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ )))));Debug.locals.put("right", _right);Debug.locals.put("right", _right);
_top = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ )))));Debug.locals.put("top", _top);Debug.locals.put("top", _top);
_bottom = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _range.getField(false,"FirstAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _range.getField(false,"SecondAddress" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ )))));Debug.locals.put("bottom", _bottom);Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 91;BA.debugLine="left = Max(0, left)";
Debug.JustUpdateDeviceLine();
_left = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _left))));Debug.locals.put("left", _left);
 BA.debugLineNum = 92;BA.debugLine="bottom = Max(0, Min(range.sheet.LastRowNumber, bo";
Debug.JustUpdateDeviceLine();
_bottom = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(xlreader.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(true,"getLastRowNumber"))),(Object)(BA.numberCast(double.class, _bottom))))));Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 93;BA.debugLine="right = Max(right, left)";
Debug.JustUpdateDeviceLine();
_right = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _right)),(Object)(BA.numberCast(double.class, _left))));Debug.locals.put("right", _right);
 BA.debugLineNum = 94;BA.debugLine="top = Max(0, Min(top, bottom))";
Debug.JustUpdateDeviceLine();
_top = BA.numberCast(int.class, xlreader.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(xlreader.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, _bottom))))));Debug.locals.put("top", _top);
 BA.debugLineNum = 95;BA.debugLine="Dim rows As List";
Debug.JustUpdateDeviceLine();
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 96;BA.debugLine="rows.Initialize";
Debug.JustUpdateDeviceLine();
_rows.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
Debug.JustUpdateDeviceLine();
_res = __ref.runClassMethod (b4j.example.xlreader.class, "_createxlreaderresult" /*RemoteObject*/ ,(Object)(_rows),(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(_left),(Object)(_top))),(Object)(_range.getField(true,"Name" /*RemoteObject*/ )));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 98;BA.debugLine="For r = top To bottom";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _bottom.<Integer>get().intValue();
_r = _top.<Integer>get().intValue() ;
for (;(step9 > 0 && _r <= limit9) || (step9 < 0 && _r >= limit9) ;_r = ((int)(0 + _r + step9))  ) {
Debug.locals.put("r", _r);
 BA.debugLineNum = 99;BA.debugLine="Dim row(right - left + 1) As Object";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNewArray ("Object", new int[] {RemoteObject.solve(new RemoteObject[] {_right,_left,RemoteObject.createImmutable(1)}, "-+",2, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("row", _row);
 BA.debugLineNum = 100;BA.debugLine="Dim prow As PoiRow = range.sheet.GetRow(r)";
Debug.JustUpdateDeviceLine();
_prow = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_prow = _range.getField(false,"Sheet" /*RemoteObject*/ ).runMethod(false,"GetRow",(Object)(BA.numberCast(int.class, _r)));Debug.locals.put("prow", _prow);Debug.locals.put("prow", _prow);
 BA.debugLineNum = 101;BA.debugLine="If prow.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prow.runMethod(true,"IsInitialized"),xlreader.__c.getField(true,"False"))) { 
 BA.debugLineNum = 102;BA.debugLine="For c = left To right";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = _right.<Integer>get().intValue();
_c = _left.<Integer>get().intValue() ;
for (;(step13 > 0 && _c <= limit13) || (step13 < 0 && _c >= limit13) ;_c = ((int)(0 + _c + step13))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 103;BA.debugLine="row(c - left) = MissingCellValue";
Debug.JustUpdateDeviceLine();
_row.setArrayElement (__ref.getField(false,"_missingcellvalue" /*RemoteObject*/ ),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_c),_left}, "-",1, 1));
 }
}Debug.locals.put("c", _c);
;
 }else {
 BA.debugLineNum = 106;BA.debugLine="For c = left To right";
Debug.JustUpdateDeviceLine();
{
final int step17 = 1;
final int limit17 = _right.<Integer>get().intValue();
_c = _left.<Integer>get().intValue() ;
for (;(step17 > 0 && _c <= limit17) || (step17 < 0 && _c >= limit17) ;_c = ((int)(0 + _c + step17))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 107;BA.debugLine="Dim cell As PoiCell = prow.GetCell(c)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_cell = _prow.runMethod(false,"GetCell",(Object)(BA.numberCast(int.class, _c)));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 108;BA.debugLine="row(c - left) = CellToObject(cell, res)";
Debug.JustUpdateDeviceLine();
_row.setArrayElement (__ref.runClassMethod (b4j.example.xlreader.class, "_celltoobject" /*RemoteObject*/ ,(Object)(_cell),(Object)(_res)),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_c),_left}, "-",1, 1));
 }
}Debug.locals.put("c", _c);
;
 };
 BA.debugLineNum = 111;BA.debugLine="rows.Add(row)";
Debug.JustUpdateDeviceLine();
_rows.runVoidMethod ("Add",(Object)((_row)));
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 113;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlreader.class, "_removeemptyrowsfromendandsetbottomright" /*RemoteObject*/ ,(Object)(_res));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readall(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ReadAll (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("readall")) { return __ref.runUserSub(false, "xlreader","readall", __ref, _dir, _filename);}
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 17;BA.debugLine="Public Sub ReadAll (Dir As String, FileName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="Return ReadWorkbook(OpenWorkbook(Dir, FileName))";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlreader.class, "_readworkbook" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.xlreader.class, "_openworkbook" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename))));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readrange(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("ReadRange (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("readrange")) { return __ref.runUserSub(false, "xlreader","readrange", __ref, _dir, _filename, _range);}
RemoteObject _om = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("Range", _range);
 BA.debugLineNum = 70;BA.debugLine="Public Sub ReadRange (Dir As String, FileName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="Dim om As List = ReadRanges(Dir, FileName, Array(";
Debug.JustUpdateDeviceLine();
_om = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_om = __ref.runClassMethod (b4j.example.xlreader.class, "_readranges" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename),(Object)(xlreader.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_range)})))));Debug.locals.put("om", _om);Debug.locals.put("om", _om);
 BA.debugLineNum = 72;BA.debugLine="Return om.Get(0)";
Debug.JustUpdateDeviceLine();
if (true) return (_om.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readranges(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _ranges) throws Exception{
try {
		Debug.PushSubsStack("ReadRanges (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("readranges")) { return __ref.runUserSub(false, "xlreader","readranges", __ref, _dir, _filename, _ranges);}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _range = RemoteObject.createImmutable("");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("Ranges", _ranges);
 BA.debugLineNum = 76;BA.debugLine="Public Sub ReadRanges(Dir As String, FileName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
Debug.JustUpdateDeviceLine();
_wb = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
_wb = __ref.runClassMethod (b4j.example.xlreader.class, "_openworkbook" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));Debug.locals.put("wb", _wb);Debug.locals.put("wb", _wb);
 BA.debugLineNum = 78;BA.debugLine="Dim result As List";
Debug.JustUpdateDeviceLine();
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 79;BA.debugLine="result.Initialize";
Debug.JustUpdateDeviceLine();
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 80;BA.debugLine="For Each Range As String In Ranges";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _ranges;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_range = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("Range", _range);
Debug.locals.put("Range", _range);
 BA.debugLineNum = 81;BA.debugLine="result.Add(RangeToResult(xl.RangeStringOrNameToR";
Debug.JustUpdateDeviceLine();
_result.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.xlreader.class, "_rangetoresult" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_rangestringornametorange" /*RemoteObject*/ ,(Object)(_wb),(Object)(_range)))))));
 }
}Debug.locals.put("Range", _range);
;
 BA.debugLineNum = 83;BA.debugLine="wb.Close";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("Close");
 BA.debugLineNum = 84;BA.debugLine="Return result";
Debug.JustUpdateDeviceLine();
if (true) return _result;
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
public static RemoteObject  _readsheetbyindex(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _sheetindex) throws Exception{
try {
		Debug.PushSubsStack("ReadSheetByIndex (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("readsheetbyindex")) { return __ref.runUserSub(false, "xlreader","readsheetbyindex", __ref, _dir, _filename, _sheetindex);}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlreaderresult");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("SheetIndex", _sheetindex);
 BA.debugLineNum = 54;BA.debugLine="Public Sub ReadSheetByIndex (Dir As String, FileNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
Debug.JustUpdateDeviceLine();
_wb = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
_wb = __ref.runClassMethod (b4j.example.xlreader.class, "_openworkbook" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));Debug.locals.put("wb", _wb);Debug.locals.put("wb", _wb);
 BA.debugLineNum = 56;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
Debug.JustUpdateDeviceLine();
_res = __ref.runClassMethod (b4j.example.xlreader.class, "_sheettoresult" /*RemoteObject*/ ,(Object)(_wb.runMethod(false,"GetSheet",(Object)(_sheetindex))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 57;BA.debugLine="wb.Close";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("Close");
 BA.debugLineNum = 58;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
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
public static RemoteObject  _readsheetbyname(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _sheetname) throws Exception{
try {
		Debug.PushSubsStack("ReadSheetByName (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("readsheetbyname")) { return __ref.runUserSub(false, "xlreader","readsheetbyname", __ref, _dir, _filename, _sheetname);}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlreaderresult");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("SheetName", _sheetname);
 BA.debugLineNum = 62;BA.debugLine="Public Sub ReadSheetByName (Dir As String, FileNam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
Debug.JustUpdateDeviceLine();
_wb = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
_wb = __ref.runClassMethod (b4j.example.xlreader.class, "_openworkbook" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));Debug.locals.put("wb", _wb);Debug.locals.put("wb", _wb);
 BA.debugLineNum = 64;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
Debug.JustUpdateDeviceLine();
_res = __ref.runClassMethod (b4j.example.xlreader.class, "_sheettoresult" /*RemoteObject*/ ,(Object)(_wb.runMethod(false,"GetSheetByName",(Object)(_sheetname))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 65;BA.debugLine="wb.Close";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("Close");
 BA.debugLineNum = 66;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readworkbook(RemoteObject __ref,RemoteObject _wb) throws Exception{
try {
		Debug.PushSubsStack("ReadWorkbook (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("readworkbook")) { return __ref.runUserSub(false, "xlreader","readworkbook", __ref, _wb);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _sheet = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiSheetWrapper");
Debug.locals.put("wb", _wb);
 BA.debugLineNum = 42;BA.debugLine="Private Sub ReadWorkbook (wb As PoiWorkbook) As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 44;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="For i = 0 To wb.NumberOfSheets - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_wb.runMethod(true,"getNumberOfSheets"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 46;BA.debugLine="Dim sheet As PoiSheet = wb.GetSheet(i)";
Debug.JustUpdateDeviceLine();
_sheet = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiSheetWrapper");
_sheet = _wb.runMethod(false,"GetSheet",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("sheet", _sheet);Debug.locals.put("sheet", _sheet);
 BA.debugLineNum = 47;BA.debugLine="res.add(SheetToResult(sheet))";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.xlreader.class, "_sheettoresult" /*RemoteObject*/ ,(Object)(_sheet)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 49;BA.debugLine="wb.Close";
Debug.JustUpdateDeviceLine();
_wb.runVoidMethod ("Close");
 BA.debugLineNum = 50;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeemptyrowsfromendandsetbottomright(RemoteObject __ref,RemoteObject _res) throws Exception{
try {
		Debug.PushSubsStack("RemoveEmptyRowsFromEndAndSetBottomRight (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("removeemptyrowsfromendandsetbottomright")) { return __ref.runUserSub(false, "xlreader","removeemptyrowsfromendandsetbottomright", __ref, _res);}
RemoteObject _lastrow = null;
Debug.locals.put("res", _res);
 BA.debugLineNum = 152;BA.debugLine="Private Sub RemoveEmptyRowsFromEndAndSetBottomRigh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="Do While res.Data.Size > 0";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 154;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
Debug.JustUpdateDeviceLine();
_lastrow = (_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("lastrow", _lastrow);Debug.locals.put("lastrow", _lastrow);
 BA.debugLineNum = 155;BA.debugLine="If lastrow.Length = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lastrow.getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 156;BA.debugLine="res.Data.RemoveAt(res.Data.Size - 1)";
Debug.JustUpdateDeviceLine();
_res.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 }else {
 BA.debugLineNum = 158;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
;
 BA.debugLineNum = 161;BA.debugLine="If res.Data.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 162;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
Debug.JustUpdateDeviceLine();
_lastrow = (_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("lastrow", _lastrow);Debug.locals.put("lastrow", _lastrow);
 BA.debugLineNum = 163;BA.debugLine="res.BottomRight = xl.AddressZero(res.TopLeft.Col";
Debug.JustUpdateDeviceLine();
_res.setField ("_bottomright" /*RemoteObject*/ ,__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_res.getField(false,"_topleft" /*RemoteObject*/ ).getField(true,"Col0Based" /*RemoteObject*/ ),_lastrow.getField(true,"length"),RemoteObject.createImmutable(1)}, "+-",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_res.getField(false,"_topleft" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ),_res.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "+-",2, 1))));
 };
 BA.debugLineNum = 165;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sheettoresult(RemoteObject __ref,RemoteObject _sheet) throws Exception{
try {
		Debug.PushSubsStack("SheetToResult (xlreader) ","xlreader",13,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("sheettoresult")) { return __ref.runUserSub(false, "xlreader","sheettoresult", __ref, _sheet);}
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.declareNull("b4j.example.xlreaderresult");
RemoteObject _lastrowindex = RemoteObject.createImmutable(0);
int _r = 0;
RemoteObject _prow = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiRowWrapper");
RemoteObject _cells = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lastcell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
RemoteObject _row = null;
RemoteObject _currentcellindex = RemoteObject.createImmutable(0);
RemoteObject _currentcell = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
int _c = 0;
Debug.locals.put("sheet", _sheet);
 BA.debugLineNum = 117;BA.debugLine="Public Sub SheetToResult (sheet As PoiSheet) As XL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="Dim rows As List";
Debug.JustUpdateDeviceLine();
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 119;BA.debugLine="rows.Initialize";
Debug.JustUpdateDeviceLine();
_rows.runVoidMethod ("Initialize");
 BA.debugLineNum = 120;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
Debug.JustUpdateDeviceLine();
_res = __ref.runClassMethod (b4j.example.xlreader.class, "_createxlreaderresult" /*RemoteObject*/ ,(Object)(_rows),(Object)(__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(_sheet.runMethod(true,"getName")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 121;BA.debugLine="Dim LastRowIndex As Int = sheet.LastRowNumber";
Debug.JustUpdateDeviceLine();
_lastrowindex = _sheet.runMethod(true,"getLastRowNumber");Debug.locals.put("LastRowIndex", _lastrowindex);Debug.locals.put("LastRowIndex", _lastrowindex);
 BA.debugLineNum = 122;BA.debugLine="For r = 0 To LastRowIndex";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = _lastrowindex.<Integer>get().intValue();
_r = 0 ;
for (;(step5 > 0 && _r <= limit5) || (step5 < 0 && _r >= limit5) ;_r = ((int)(0 + _r + step5))  ) {
Debug.locals.put("r", _r);
 BA.debugLineNum = 123;BA.debugLine="Dim prow As PoiRow = sheet.GetRow(r)";
Debug.JustUpdateDeviceLine();
_prow = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_prow = _sheet.runMethod(false,"GetRow",(Object)(BA.numberCast(int.class, _r)));Debug.locals.put("prow", _prow);Debug.locals.put("prow", _prow);
 BA.debugLineNum = 124;BA.debugLine="If prow.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prow.runMethod(true,"IsInitialized"),xlreader.__c.getField(true,"False"))) { 
 BA.debugLineNum = 125;BA.debugLine="rows.Add(EmptyRow)";
Debug.JustUpdateDeviceLine();
_rows.runVoidMethod ("Add",(Object)((__ref.getField(false,"_emptyrow" /*RemoteObject*/ ))));
 BA.debugLineNum = 126;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 128;BA.debugLine="Dim cells As List = prow.Cells";
Debug.JustUpdateDeviceLine();
_cells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_cells = _prow.runMethod(false,"getCells");Debug.locals.put("cells", _cells);Debug.locals.put("cells", _cells);
 BA.debugLineNum = 129;BA.debugLine="If cells.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cells.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 130;BA.debugLine="rows.Add(EmptyRow)";
Debug.JustUpdateDeviceLine();
_rows.runVoidMethod ("Add",(Object)((__ref.getField(false,"_emptyrow" /*RemoteObject*/ ))));
 BA.debugLineNum = 131;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 133;BA.debugLine="Dim LastCell As PoiCell = cells.Get(cells.Size -";
Debug.JustUpdateDeviceLine();
_lastcell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_lastcell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PoiCellWrapper"), _cells.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_cells.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("LastCell", _lastcell);Debug.locals.put("LastCell", _lastcell);
 BA.debugLineNum = 134;BA.debugLine="Dim row(LastCell.ColumnIndex + 1) As Object";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNewArray ("Object", new int[] {RemoteObject.solve(new RemoteObject[] {_lastcell.runMethod(true,"getColumnIndex"),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("row", _row);
 BA.debugLineNum = 135;BA.debugLine="Dim CurrentCellIndex As Int = 0";
Debug.JustUpdateDeviceLine();
_currentcellindex = BA.numberCast(int.class, 0);Debug.locals.put("CurrentCellIndex", _currentcellindex);Debug.locals.put("CurrentCellIndex", _currentcellindex);
 BA.debugLineNum = 136;BA.debugLine="Dim CurrentCell As PoiCell = cells.Get(CurrentCe";
Debug.JustUpdateDeviceLine();
_currentcell = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_currentcell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PoiCellWrapper"), _cells.runMethod(false,"Get",(Object)(_currentcellindex)));Debug.locals.put("CurrentCell", _currentcell);Debug.locals.put("CurrentCell", _currentcell);
 BA.debugLineNum = 137;BA.debugLine="For c = 0 To row.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step20 > 0 && _c <= limit20) || (step20 < 0 && _c >= limit20) ;_c = ((int)(0 + _c + step20))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 138;BA.debugLine="If c = CurrentCell.ColumnIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_c),BA.numberCast(double.class, _currentcell.runMethod(true,"getColumnIndex")))) { 
 BA.debugLineNum = 139;BA.debugLine="row(c) = CellToObject(CurrentCell, res)";
Debug.JustUpdateDeviceLine();
_row.setArrayElement (__ref.runClassMethod (b4j.example.xlreader.class, "_celltoobject" /*RemoteObject*/ ,(Object)(_currentcell),(Object)(_res)),BA.numberCast(int.class, _c));
 BA.debugLineNum = 140;BA.debugLine="CurrentCellIndex = CurrentCellIndex + 1";
Debug.JustUpdateDeviceLine();
_currentcellindex = RemoteObject.solve(new RemoteObject[] {_currentcellindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CurrentCellIndex", _currentcellindex);
 BA.debugLineNum = 141;BA.debugLine="If CurrentCellIndex = cells.Size Then Exit";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_currentcellindex,BA.numberCast(double.class, _cells.runMethod(true,"getSize")))) { 
if (true) break;};
 BA.debugLineNum = 142;BA.debugLine="CurrentCell = cells.Get(CurrentCellIndex)";
Debug.JustUpdateDeviceLine();
_currentcell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PoiCellWrapper"), _cells.runMethod(false,"Get",(Object)(_currentcellindex)));Debug.locals.put("CurrentCell", _currentcell);
 }else {
 BA.debugLineNum = 144;BA.debugLine="row(c) = MissingCellValue";
Debug.JustUpdateDeviceLine();
_row.setArrayElement (__ref.getField(false,"_missingcellvalue" /*RemoteObject*/ ),BA.numberCast(int.class, _c));
 };
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 147;BA.debugLine="rows.Add(row)";
Debug.JustUpdateDeviceLine();
_rows.runVoidMethod ("Add",(Object)((_row)));
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 149;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.xlreader.class, "_removeemptyrowsfromendandsetbottomright" /*RemoteObject*/ ,(Object)(_res));
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
}