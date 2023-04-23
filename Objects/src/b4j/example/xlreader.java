package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlreader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xlreader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xlreader.class).invoke(this, new Object[] {null});
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
public Object[] _emptyrow = null;
public String _password = "";
public b4j.example.xlutils _xl = null;
public Object _missingcellvalue = null;
public boolean _fetchformulasinsteadofcachedvalues = false;
public boolean _fetchhyperlinks = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.xlreaderresult  _readsheetbyindex(b4j.example.xlreader __ref,String _dir,String _filename,int _sheetindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readsheetbyindex", true))
	 {return ((b4j.example.xlreaderresult) Debug.delegate(ba, "readsheetbyindex", new Object[] {_dir,_filename,_sheetindex}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.example.xlreaderresult _res = null;
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub ReadSheetByIndex (Dir As String, FileNa";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = __ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename);
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
_res = __ref._sheettoresult /*b4j.example.xlreaderresult*/ (null,_wb.GetSheet(_sheetindex));
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="End Sub";
return null;
}
public Object  _celltoobject(b4j.example.xlreader __ref,anywheresoftware.b4j.objects.PoiCellWrapper _cell,b4j.example.xlreaderresult _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "celltoobject", true))
	 {return ((Object) Debug.delegate(ba, "celltoobject", new Object[] {_cell,_result}));}
anywheresoftware.b4j.object.JavaObject _jcell = null;
anywheresoftware.b4j.object.JavaObject _hyperlink = null;
b4j.example.xlreaderresult._xlhyperlink _h = null;
anywheresoftware.b4j.object.JavaObject _celladdress = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub CellToObject (cell As PoiCell, Result";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="If cell.IsInitialized = False Then Return Missing";
if (_cell.IsInitialized()==__c.False) { 
if (true) return __ref._missingcellvalue /*Object*/ ;};
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="If FetchHyperlinks Then";
if (__ref._fetchhyperlinks /*boolean*/ ) { 
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Dim jcell As JavaObject = cell";
_jcell = new anywheresoftware.b4j.object.JavaObject();
_jcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cell.getObject()));
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Dim hyperlink As JavaObject = jcell.RunMethod(\"g";
_hyperlink = new anywheresoftware.b4j.object.JavaObject();
_hyperlink = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jcell.RunMethod("getHyperlink",(Object[])(__c.Null))));
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="If hyperlink.IsInitialized Then";
if (_hyperlink.IsInitialized()) { 
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Dim h As XLHyperlink";
_h = new b4j.example.xlreaderresult._xlhyperlink();
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="h.Initialize";
_h.Initialize();
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="h.Address = ObjectToString(hyperlink.RunMethod(";
_h.Address /*String*/  = __ref._objecttostring /*String*/ (null,_hyperlink.RunMethod("getAddress",(Object[])(__c.Null)));
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="h.Label = ObjectToString(hyperlink.RunMethod(\"g";
_h.Label /*String*/  = __ref._objecttostring /*String*/ (null,_hyperlink.RunMethod("getLabel",(Object[])(__c.Null)));
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="h.LinkType = hyperlink.RunMethod(\"getType\", Nul";
_h.LinkType /*String*/  = BA.ObjectToString(_hyperlink.RunMethod("getType",(Object[])(__c.Null)));
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="Dim CellAddress As JavaObject = jcell.RunMethod";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
_celladdress = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jcell.RunMethod("getAddress",(Object[])(__c.Null))));
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="Result.Hyperlinks.Put(CellAddress.RunMethod(\"fo";
_result._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_celladdress.RunMethod("formatAsString",(Object[])(__c.Null)),(Object)(_h));
 };
 };
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="If FetchFormulasInsteadOfCachedValues Then Return";
if (__ref._fetchformulasinsteadofcachedvalues /*boolean*/ ) { 
if (true) return _cell.getValue();}
else {
if (true) return _cell.getValueCached();};
RDebugUtils.currentLine=8519696;
 //BA.debugLineNum = 8519696;BA.debugLine="End Sub";
return null;
}
public String  _objecttostring(b4j.example.xlreader __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "objecttostring", true))
	 {return ((String) Debug.delegate(ba, "objecttostring", new Object[] {_o}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub ObjectToString(o As Object) As String";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="If o = Null Then Return \"\"";
if (_o== null) { 
if (true) return "";};
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Return o";
if (true) return BA.ObjectToString(_o);
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.xlreader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Private EmptyRow() As Object";
_emptyrow = new Object[(int) (0)];
{
int d0 = _emptyrow.length;
for (int i0 = 0;i0 < d0;i0++) {
_emptyrow[i0] = new Object();
}
}
;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Public Password As String";
_password = "";
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Private xl As XLUtils 'ignore";
_xl = new b4j.example.xlutils();
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="Private MissingCellValue As Object = \"\"";
_missingcellvalue = (Object)("");
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="Public FetchFormulasInsteadOfCachedValues As Bool";
_fetchformulasinsteadofcachedvalues = false;
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="Public FetchHyperlinks As Boolean";
_fetchhyperlinks = false;
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="End Sub";
return "";
}
public void  _closewbaftersleep(b4j.example.xlreader __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) throws Exception{
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "closewbaftersleep", true))
	 {Debug.delegate(ba, "closewbaftersleep", new Object[] {_wb}); return;}
ResumableSub_CloseWBAfterSleep rsub = new ResumableSub_CloseWBAfterSleep(this,__ref,_wb);
rsub.resume(ba, null);
}
public static class ResumableSub_CloseWBAfterSleep extends BA.ResumableSub {
public ResumableSub_CloseWBAfterSleep(b4j.example.xlreader parent,b4j.example.xlreader __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) {
this.parent = parent;
this.__ref = __ref;
this._wb = _wb;
this.__ref = parent;
}
b4j.example.xlreader __ref;
b4j.example.xlreader parent;
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlreader";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlreader", "closewbaftersleep"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Try";
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
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="wb.Close";
_wb.Close();
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("97929861",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public b4j.example.xlreaderresult  _createxlreaderresult(b4j.example.xlreader __ref,anywheresoftware.b4a.objects.collections.List _data,b4j.example.xlutils._xladdress _topleft,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "createxlreaderresult", true))
	 {return ((b4j.example.xlreaderresult) Debug.delegate(ba, "createxlreaderresult", new Object[] {_data,_topleft,_name}));}
b4j.example.xlreaderresult _t1 = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub CreateXLReaderResult (Data As List, To";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim t1 As XLReaderResult";
_t1 = new b4j.example.xlreaderresult();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="t1.Initialize(xl)";
_t1._initialize /*String*/ (null,ba,__ref._xl /*b4j.example.xlutils*/ );
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="t1.Data = Data";
_t1._data /*anywheresoftware.b4a.objects.collections.List*/  = _data;
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="t1.TopLeft = TopLeft";
_t1._topleft /*b4j.example.xlutils._xladdress*/  = _topleft;
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="t1.Name = Name";
_t1._name /*String*/  = _name;
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.xlreader __ref,anywheresoftware.b4a.BA _ba,b4j.example.xlutils _vxl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="xl = vXL";
__ref._xl /*b4j.example.xlutils*/  = _vxl;
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PoiWorkbookWrapper  _openworkbook(b4j.example.xlreader __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "openworkbook", true))
	 {return ((anywheresoftware.b4j.objects.PoiWorkbookWrapper) Debug.delegate(ba, "openworkbook", new Object[] {_dir,_filename}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub OpenWorkbook (Dir As String, FileName";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="If Dir = \"\" Then";
if ((_dir).equals("")) { 
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dir = FileName";
_dir = _filename;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="FileName = \"\"";
_filename = "";
 };
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="wb.InitializeExisting(Dir, FileName, Password, Tr";
_wb.InitializeExisting(_dir,_filename,__ref._password /*String*/ ,__c.True);
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="CloseWBAfterSleep(wb)";
__ref._closewbaftersleep /*void*/ (null,_wb);
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="Return wb";
if (true) return _wb;
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlreaderresult  _rangetoresult(b4j.example.xlreader __ref,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "rangetoresult", true))
	 {return ((b4j.example.xlreaderresult) Debug.delegate(ba, "rangetoresult", new Object[] {_range}));}
int _left = 0;
int _right = 0;
int _top = 0;
int _bottom = 0;
anywheresoftware.b4a.objects.collections.List _rows = null;
b4j.example.xlreaderresult _res = null;
int _r = 0;
Object[] _row = null;
anywheresoftware.b4j.objects.PoiRowWrapper _prow = null;
int _c = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub RangeToResult (range As XLRange) As XLR";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Dim left = Min(range.FirstAddress.Col0Based, rang";
_left = (int) (__c.Min(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ,_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ));
_right = (int) (__c.Max(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ,_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ));
_top = (int) (__c.Min(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ,_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ));
_bottom = (int) (__c.Max(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ,_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ));
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="left = Max(0, left)";
_left = (int) (__c.Max(0,_left));
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="bottom = Max(0, Min(range.sheet.LastRowNumber, bo";
_bottom = (int) (__c.Max(0,__c.Min(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getLastRowNumber(),_bottom)));
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="right = Max(right, left)";
_right = (int) (__c.Max(_right,_left));
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="top = Max(0, Min(top, bottom))";
_top = (int) (__c.Max(0,__c.Min(_top,_bottom)));
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="rows.Initialize";
_rows.Initialize();
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
_res = __ref._createxlreaderresult /*b4j.example.xlreaderresult*/ (null,_rows,__ref._xl /*b4j.example.xlutils*/ ._addresszero /*b4j.example.xlutils._xladdress*/ (null,_left,_top),_range.Name /*String*/ );
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="For r = top To bottom";
{
final int step9 = 1;
final int limit9 = _bottom;
_r = _top ;
for (;_r <= limit9 ;_r = _r + step9 ) {
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="Dim row(right - left + 1) As Object";
_row = new Object[(int) (_right-_left+1)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Dim prow As PoiRow = range.sheet.GetRow(r)";
_prow = new anywheresoftware.b4j.objects.PoiRowWrapper();
_prow = _range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .GetRow(_r);
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="If prow.IsInitialized = False Then";
if (_prow.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="For c = left To right";
{
final int step13 = 1;
final int limit13 = _right;
_c = _left ;
for (;_c <= limit13 ;_c = _c + step13 ) {
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="row(c - left) = MissingCellValue";
_row[(int) (_c-_left)] = __ref._missingcellvalue /*Object*/ ;
 }
};
 }else {
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="For c = left To right";
{
final int step17 = 1;
final int limit17 = _right;
_c = _left ;
for (;_c <= limit17 ;_c = _c + step17 ) {
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="Dim cell As PoiCell = prow.GetCell(c)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _prow.GetCell(_c);
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="row(c - left) = CellToObject(cell, res)";
_row[(int) (_c-_left)] = __ref._celltoobject /*Object*/ (null,_cell,_res);
 }
};
 };
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="rows.Add(row)";
_rows.Add((Object)(_row));
 }
};
RDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
if (true) return __ref._removeemptyrowsfromendandsetbottomright /*b4j.example.xlreaderresult*/ (null,_res);
RDebugUtils.currentLine=8323098;
 //BA.debugLineNum = 8323098;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlreaderresult  _removeemptyrowsfromendandsetbottomright(b4j.example.xlreader __ref,b4j.example.xlreaderresult _res) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "removeemptyrowsfromendandsetbottomright", true))
	 {return ((b4j.example.xlreaderresult) Debug.delegate(ba, "removeemptyrowsfromendandsetbottomright", new Object[] {_res}));}
Object[] _lastrow = null;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub RemoveEmptyRowsFromEndAndSetBottomRigh";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Do While res.Data.Size > 0";
while (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) {
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
_lastrow = (Object[])(_res._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="If lastrow.Length = 0 Then";
if (_lastrow.length==0) { 
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="res.Data.RemoveAt(res.Data.Size - 1)";
_res._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Exit";
if (true) break;
 };
 }
;
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="If res.Data.Size > 0 Then";
if (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
_lastrow = (Object[])(_res._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="res.BottomRight = xl.AddressZero(res.TopLeft.Col";
_res._bottomright /*b4j.example.xlutils._xladdress*/  = __ref._xl /*b4j.example.xlutils*/ ._addresszero /*b4j.example.xlutils._xladdress*/ (null,(int) (_res._topleft /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ +_lastrow.length-1),(int) (_res._topleft /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ +_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readall(b4j.example.xlreader __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readall", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readall", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub ReadAll (Dir As String, FileName As Str";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Return ReadWorkbook(OpenWorkbook(Dir, FileName))";
if (true) return __ref._readworkbook /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename));
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readworkbook(b4j.example.xlreader __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readworkbook", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readworkbook", new Object[] {_wb}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub ReadWorkbook (wb As PoiWorkbook) As Li";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="For i = 0 To wb.NumberOfSheets - 1";
{
final int step3 = 1;
final int limit3 = (int) (_wb.getNumberOfSheets()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="Dim sheet As PoiSheet = wb.GetSheet(i)";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = _wb.GetSheet(_i);
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="res.add(SheetToResult(sheet))";
_res.Add((Object)(__ref._sheettoresult /*b4j.example.xlreaderresult*/ (null,_sheet)));
 }
};
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlreaderresult  _readrange(b4j.example.xlreader __ref,String _dir,String _filename,String _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readrange", true))
	 {return ((b4j.example.xlreaderresult) Debug.delegate(ba, "readrange", new Object[] {_dir,_filename,_range}));}
anywheresoftware.b4a.objects.collections.List _om = null;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub ReadRange (Dir As String, FileName As S";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim om As List = ReadRanges(Dir, FileName, Array(";
_om = new anywheresoftware.b4a.objects.collections.List();
_om = __ref._readranges /*anywheresoftware.b4a.objects.collections.List*/ (null,_dir,_filename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_range)}));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Return om.Get(0)";
if (true) return (b4j.example.xlreaderresult)(_om.Get((int) (0)));
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readranges(b4j.example.xlreader __ref,String _dir,String _filename,anywheresoftware.b4a.objects.collections.List _ranges) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readranges", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readranges", new Object[] {_dir,_filename,_ranges}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
anywheresoftware.b4a.objects.collections.List _result = null;
String _range = "";
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub ReadRanges(Dir As String, FileName As S";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = __ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="For Each Range As String In Ranges";
{
final anywheresoftware.b4a.BA.IterableList group4 = _ranges;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_range = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="result.Add(RangeToResult(xl.RangeStringOrNameToR";
_result.Add((Object)(__ref._rangetoresult /*b4j.example.xlreaderresult*/ (null,__ref._xl /*b4j.example.xlutils*/ ._rangestringornametorange /*b4j.example.xlutils._xlrange*/ (null,_wb,_range))));
 }
};
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlreaderresult  _sheettoresult(b4j.example.xlreader __ref,anywheresoftware.b4j.objects.PoiSheetWrapper _sheet) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "sheettoresult", true))
	 {return ((b4j.example.xlreaderresult) Debug.delegate(ba, "sheettoresult", new Object[] {_sheet}));}
anywheresoftware.b4a.objects.collections.List _rows = null;
b4j.example.xlreaderresult _res = null;
int _lastrowindex = 0;
int _r = 0;
anywheresoftware.b4j.objects.PoiRowWrapper _prow = null;
anywheresoftware.b4a.objects.collections.List _cells = null;
anywheresoftware.b4j.objects.PoiCellWrapper _lastcell = null;
Object[] _row = null;
int _currentcellindex = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _currentcell = null;
int _c = 0;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub SheetToResult (sheet As PoiSheet) As XL";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="rows.Initialize";
_rows.Initialize();
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
_res = __ref._createxlreaderresult /*b4j.example.xlreaderresult*/ (null,_rows,__ref._xl /*b4j.example.xlutils*/ ._addresszero /*b4j.example.xlutils._xladdress*/ (null,(int) (0),(int) (0)),_sheet.getName());
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Dim LastRowIndex As Int = sheet.LastRowNumber";
_lastrowindex = _sheet.getLastRowNumber();
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="For r = 0 To LastRowIndex";
{
final int step5 = 1;
final int limit5 = _lastrowindex;
_r = (int) (0) ;
for (;_r <= limit5 ;_r = _r + step5 ) {
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="Dim prow As PoiRow = sheet.GetRow(r)";
_prow = new anywheresoftware.b4j.objects.PoiRowWrapper();
_prow = _sheet.GetRow(_r);
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="If prow.IsInitialized = False Then";
if (_prow.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="rows.Add(EmptyRow)";
_rows.Add((Object)(__ref._emptyrow /*Object[]*/ ));
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="Dim cells As List = prow.Cells";
_cells = new anywheresoftware.b4a.objects.collections.List();
_cells = _prow.getCells();
RDebugUtils.currentLine=8388620;
 //BA.debugLineNum = 8388620;BA.debugLine="If cells.Size = 0 Then";
if (_cells.getSize()==0) { 
RDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="rows.Add(EmptyRow)";
_rows.Add((Object)(__ref._emptyrow /*Object[]*/ ));
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=8388624;
 //BA.debugLineNum = 8388624;BA.debugLine="Dim LastCell As PoiCell = cells.Get(cells.Size -";
_lastcell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_lastcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get((int) (_cells.getSize()-1))));
RDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="Dim row(LastCell.ColumnIndex + 1) As Object";
_row = new Object[(int) (_lastcell.getColumnIndex()+1)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
RDebugUtils.currentLine=8388626;
 //BA.debugLineNum = 8388626;BA.debugLine="Dim CurrentCellIndex As Int = 0";
_currentcellindex = (int) (0);
RDebugUtils.currentLine=8388627;
 //BA.debugLineNum = 8388627;BA.debugLine="Dim CurrentCell As PoiCell = cells.Get(CurrentCe";
_currentcell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_currentcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get(_currentcellindex)));
RDebugUtils.currentLine=8388628;
 //BA.debugLineNum = 8388628;BA.debugLine="For c = 0 To row.Length - 1";
{
final int step20 = 1;
final int limit20 = (int) (_row.length-1);
_c = (int) (0) ;
for (;_c <= limit20 ;_c = _c + step20 ) {
RDebugUtils.currentLine=8388629;
 //BA.debugLineNum = 8388629;BA.debugLine="If c = CurrentCell.ColumnIndex Then";
if (_c==_currentcell.getColumnIndex()) { 
RDebugUtils.currentLine=8388630;
 //BA.debugLineNum = 8388630;BA.debugLine="row(c) = CellToObject(CurrentCell, res)";
_row[_c] = __ref._celltoobject /*Object*/ (null,_currentcell,_res);
RDebugUtils.currentLine=8388631;
 //BA.debugLineNum = 8388631;BA.debugLine="CurrentCellIndex = CurrentCellIndex + 1";
_currentcellindex = (int) (_currentcellindex+1);
RDebugUtils.currentLine=8388632;
 //BA.debugLineNum = 8388632;BA.debugLine="If CurrentCellIndex = cells.Size Then Exit";
if (_currentcellindex==_cells.getSize()) { 
if (true) break;};
RDebugUtils.currentLine=8388633;
 //BA.debugLineNum = 8388633;BA.debugLine="CurrentCell = cells.Get(CurrentCellIndex)";
_currentcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get(_currentcellindex)));
 }else {
RDebugUtils.currentLine=8388635;
 //BA.debugLineNum = 8388635;BA.debugLine="row(c) = MissingCellValue";
_row[_c] = __ref._missingcellvalue /*Object*/ ;
 };
 }
};
RDebugUtils.currentLine=8388638;
 //BA.debugLineNum = 8388638;BA.debugLine="rows.Add(row)";
_rows.Add((Object)(_row));
 }
};
RDebugUtils.currentLine=8388640;
 //BA.debugLineNum = 8388640;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
if (true) return __ref._removeemptyrowsfromendandsetbottomright /*b4j.example.xlreaderresult*/ (null,_res);
RDebugUtils.currentLine=8388641;
 //BA.debugLineNum = 8388641;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlreaderresult  _readsheetbyname(b4j.example.xlreader __ref,String _dir,String _filename,String _sheetname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readsheetbyname", true))
	 {return ((b4j.example.xlreaderresult) Debug.delegate(ba, "readsheetbyname", new Object[] {_dir,_filename,_sheetname}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.example.xlreaderresult _res = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub ReadSheetByName (Dir As String, FileNam";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = __ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
_res = __ref._sheettoresult /*b4j.example.xlreaderresult*/ (null,_wb.GetSheetByName(_sheetname));
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return null;
}
}