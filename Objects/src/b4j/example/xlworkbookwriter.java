package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlworkbookwriter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xlworkbookwriter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xlworkbookwriter.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook = null;
public b4j.example.xlutils _xl = null;
public boolean _fromtemplate = false;
public anywheresoftware.b4j.object.JavaObject _jworkbook = null;
public int _maxrows = 0;
public int _maxcolumns = 0;
public String _mversionname = "";
public boolean _isxlsx = false;
public String _defaultfontname = "";
public short _defaultfontsize = (short)0;
public String _defaultextension = "";
public anywheresoftware.b4a.objects.collections.Map _internalstylescache = null;
public anywheresoftware.b4a.objects.collections.List _internalstyleshorts = null;
public anywheresoftware.b4a.objects.collections.List _internalstylebooleans = null;
public anywheresoftware.b4a.objects.collections.List _internalstyleints = null;
public anywheresoftware.b4a.objects.collections.List _internalstylestrings = null;
public anywheresoftware.b4a.objects.collections.List _internalallsimplemethods = null;
public String _internalnameregex = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4j.objects.PoiFontWrapper  _getfont(b4j.example.xlworkbookwriter __ref,short _size,boolean _bold,String _name,boolean _italic,boolean _underline,int _indexedcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getfont", true))
	 {return ((anywheresoftware.b4j.objects.PoiFontWrapper) Debug.delegate(ba, "getfont", new Object[] {_size,_bold,_name,_italic,_underline,_indexedcolor}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub GetFont (Size As Short, Bold As Boolean";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="For Each f As PoiFont In PoiWorkbook.Fonts";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getFonts();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = (anywheresoftware.b4j.objects.PoiFontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiFontWrapper(), (org.apache.poi.ss.usermodel.Font)(group1.Get(index1)));
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="If f.Size = Size And f.Bold = Bold And f.Name =";
if (_f.getSize()==_size && _f.getBold()==_bold && (_f.getName()).equals(_name) && _f.getItalic()==_italic && _f.getUnderline()==_underline && _f.getIndexedColor()==_indexedcolor) { 
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Return f";
if (true) return _f;
 };
 }
};
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="Dim f As PoiFont";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
RDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="f.Initialize(PoiWorkbook)";
_f.Initialize(__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ );
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="f.Size = Size";
_f.setSize(_size);
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="f.Bold = Bold";
_f.setBold(_bold);
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="f.Name = Name";
_f.setName(_name);
RDebugUtils.currentLine=16973835;
 //BA.debugLineNum = 16973835;BA.debugLine="f.Italic = Italic";
_f.setItalic(_italic);
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="f.Underline = Underline";
_f.setUnderline(_underline);
RDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="f.IndexedColor = IndexedColor";
_f.setIndexedColor((short) (_indexedcolor));
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Return f";
if (true) return _f;
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.xlworkbookwriter __ref,anywheresoftware.b4a.BA _ba,b4j.example.xlutils _vxl,anywheresoftware.b4j.objects.PoiWorkbookWrapper _vworkbook,boolean _vfromtemplate) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl,_vworkbook,_vfromtemplate}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub Initialize (vXL As XLUtils, vWorkbook A";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="xl = vXL";
__ref._xl /*b4j.example.xlutils*/  = _vxl;
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="PoiWorkbook = vWorkbook";
__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/  = _vworkbook;
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="FromTemplate = vFromTemplate";
__ref._fromtemplate /*boolean*/  = _vfromtemplate;
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="jWorkbook = PoiWorkbook";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getObject()));
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="mVersionName = jWorkbook.RunMethodJO(\"getSpreadsh";
__ref._mversionname /*String*/  = BA.ObjectToString(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getSpreadsheetVersion",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="IsXLSX = mVersionName = \"EXCEL2007\"";
__ref._isxlsx /*boolean*/  = (__ref._mversionname /*String*/ ).equals("EXCEL2007");
RDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="If IsXLSX Then";
if (__ref._isxlsx /*boolean*/ ) { 
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="MaxRows = 0x100000";
__ref._maxrows /*int*/  = ((int)0x100000);
RDebugUtils.currentLine=16580617;
 //BA.debugLineNum = 16580617;BA.debugLine="MaxColumns = 0x4000";
__ref._maxcolumns /*int*/  = ((int)0x4000);
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="DefaultFontName = \"Calibri\"";
__ref._defaultfontname /*String*/  = "Calibri";
RDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="DefaultFontSize = 11";
__ref._defaultfontsize /*short*/  = (short) (11);
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="DefaultExtension = \".xlsx\"";
__ref._defaultextension /*String*/  = ".xlsx";
 }else {
RDebugUtils.currentLine=16580622;
 //BA.debugLineNum = 16580622;BA.debugLine="MaxRows = 0x10000";
__ref._maxrows /*int*/  = ((int)0x10000);
RDebugUtils.currentLine=16580623;
 //BA.debugLineNum = 16580623;BA.debugLine="MaxColumns = 0x0100";
__ref._maxcolumns /*int*/  = ((int)0x0100);
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="DefaultFontName = \"Arial\"";
__ref._defaultfontname /*String*/  = "Arial";
RDebugUtils.currentLine=16580625;
 //BA.debugLineNum = 16580625;BA.debugLine="DefaultFontSize = 10";
__ref._defaultfontsize /*short*/  = (short) (10);
RDebugUtils.currentLine=16580626;
 //BA.debugLineNum = 16580626;BA.debugLine="DefaultExtension = \".xls\"";
__ref._defaultextension /*String*/  = ".xls";
 };
RDebugUtils.currentLine=16580628;
 //BA.debugLineNum = 16580628;BA.debugLine="InternalStylesCache.Initialize";
__ref._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=16580629;
 //BA.debugLineNum = 16580629;BA.debugLine="End Sub";
return "";
}
public String  _getversionname(b4j.example.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getversionname", true))
	 {return ((String) Debug.delegate(ba, "getversionname", null));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub getVersionName As String";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Return mVersionName";
if (true) return __ref._mversionname /*String*/ ;
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _addnamedrange(b4j.example.xlworkbookwriter __ref,String _name,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "addnamedrange", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "addnamedrange", new Object[] {_name,_range}));}
anywheresoftware.b4j.object.JavaObject _cellrangeaddress = null;
anywheresoftware.b4j.object.JavaObject _jname = null;
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub AddNamedRange (Name As String, Range As";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="RemoveNamedRange(Name)";
__ref._removenamedrange /*String*/ (null,_name);
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="If Range.Sheet.IsInitialized = False Then";
if (_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="LogError(\"Range.Sheet must me set. Use xl.Create";
__c.LogError("Range.Sheet must me set. Use xl.CreateXLRangeWithSheet!");
 };
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="Dim CellRangeAddress As JavaObject = xl.XLRangeTo";
_cellrangeaddress = new anywheresoftware.b4j.object.JavaObject();
_cellrangeaddress = __ref._xl /*b4j.example.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range);
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="Dim jname As JavaObject = CreateName(Name, CellRa";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = __ref._createname /*anywheresoftware.b4j.object.JavaObject*/ (null,_name,BA.ObjectToString(_cellrangeaddress.RunMethod("formatAsString",new Object[]{(Object)(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName()),(Object)(__c.True)})));
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="Return jname";
if (true) return _jname;
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="End Sub";
return null;
}
public String  _removenamedrange(b4j.example.xlworkbookwriter __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "removenamedrange", true))
	 {return ((String) Debug.delegate(ba, "removenamedrange", new Object[] {_name}));}
anywheresoftware.b4a.objects.collections.List _names = null;
anywheresoftware.b4a.objects.collections.List _dontmodifylistwhileremoving = null;
Object _n = null;
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub RemoveNamedRange (Name As String)";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Dim Names As List = jWorkbook.RunMethod(\"getNames";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getNames",new Object[]{(Object)(_name)})));
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Dim DontModifyListWhileRemoving As List";
_dontmodifylistwhileremoving = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="DontModifyListWhileRemoving.Initialize";
_dontmodifylistwhileremoving.Initialize();
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="DontModifyListWhileRemoving.AddAll(Names)";
_dontmodifylistwhileremoving.AddAll(_names);
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="For Each n As Object In DontModifyListWhileRemovi";
{
final anywheresoftware.b4a.BA.IterableList group5 = _dontmodifylistwhileremoving;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_n = group5.Get(index5);
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="jWorkbook.RunMethod(\"removeName\", Array(n))";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("removeName",new Object[]{_n});
 }
};
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _createname(b4j.example.xlworkbookwriter __ref,String _name,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createname", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "createname", new Object[] {_name,_formula}));}
anywheresoftware.b4j.object.JavaObject _jname = null;
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Private Sub CreateName (Name As String, Formula As";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Dim jname As JavaObject = jWorkbook.RunMethod(\"cr";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createName",(Object[])(__c.Null))));
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="jname.RunMethod(\"setNameName\", Array(Name))";
_jname.RunMethod("setNameName",new Object[]{(Object)(_name)});
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="jname.RunMethod(\"setRefersToFormula\", Array(Formu";
_jname.RunMethod("setRefersToFormula",new Object[]{(Object)(_formula)});
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="Return jname";
if (true) return _jname;
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="End Sub";
return null;
}
public String  _addnamedrangeoffset(b4j.example.xlworkbookwriter __ref,String _name,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "addnamedrangeoffset", true))
	 {return ((String) Debug.delegate(ba, "addnamedrangeoffset", new Object[] {_name,_range}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub AddNamedRangeOffset (Name As String, Ra";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="RemoveNamedRange(Name)";
__ref._removenamedrange /*String*/ (null,_name);
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="sb.Append(\"OFFSET(\").Append(xl.XLAddressToCellRef";
_sb.Append("OFFSET(").Append(BA.ObjectToString(__ref._xl /*b4j.example.xlutils*/ ._xladdresstocellreference /*anywheresoftware.b4j.object.JavaObject*/ (null,_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.FirstAddress /*b4j.example.xlutils._xladdress*/ ).RunMethod("formatAsString",(Object[])(__c.Null))));
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="sb.Append(\", 0, 0, \").Append(Range.SecondAddress.";
_sb.Append(", 0, 0, ").Append(BA.NumberToString(_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ -_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ +1)).Append(", ");
RDebugUtils.currentLine=17498118;
 //BA.debugLineNum = 17498118;BA.debugLine="sb.Append(Range.SecondAddress.Col0Based - Range.F";
_sb.Append(BA.NumberToString(_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ -_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ +1)).Append(")");
RDebugUtils.currentLine=17498119;
 //BA.debugLineNum = 17498119;BA.debugLine="CreateName(Name, sb.ToString)";
__ref._createname /*anywheresoftware.b4j.object.JavaObject*/ (null,_name,_sb.ToString());
RDebugUtils.currentLine=17498120;
 //BA.debugLineNum = 17498120;BA.debugLine="End Sub";
return "";
}
public String  _addnamedrangescoped(b4j.example.xlworkbookwriter __ref,String _name,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "addnamedrangescoped", true))
	 {return ((String) Debug.delegate(ba, "addnamedrangescoped", new Object[] {_name,_range}));}
anywheresoftware.b4j.object.JavaObject _jname = null;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub AddNamedRangeScoped (Name As String, Ra";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Dim jName As JavaObject = AddNamedRange(Name, Ran";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = __ref._addnamedrange /*anywheresoftware.b4j.object.JavaObject*/ (null,_name,_range);
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="jName.RunMethod(\"setSheetIndex\", Array(Range.Shee";
_jname.RunMethod("setSheetIndex",new Object[]{(Object)(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())});
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Public PoiWorkbook As PoiWorkbook";
_poiworkbook = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Public xl As XLUtils";
_xl = new b4j.example.xlutils();
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Private FromTemplate As Boolean 'ignore";
_fromtemplate = false;
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="Public jWorkbook As JavaObject";
_jworkbook = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="Public MaxRows, MaxColumns As Int";
_maxrows = 0;
_maxcolumns = 0;
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Private mVersionName As String";
_mversionname = "";
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="Public IsXLSX As Boolean";
_isxlsx = false;
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="Public DefaultFontName As String";
_defaultfontname = "";
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="Public DefaultFontSize As Short";
_defaultfontsize = (short)0;
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="Public DefaultExtension As String";
_defaultextension = "";
RDebugUtils.currentLine=16515083;
 //BA.debugLineNum = 16515083;BA.debugLine="Public InternalStylesCache As Map";
_internalstylescache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16515084;
 //BA.debugLineNum = 16515084;BA.debugLine="Public InternalStyleShorts As List = Array(\"setBo";
_internalstyleshorts = new anywheresoftware.b4a.objects.collections.List();
_internalstyleshorts = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setBottomBorderColor"),(Object)("setLeftBorderColor"),(Object)("setRightBorderColor"),(Object)("setTopBorderColor"),(Object)("setFillForegroundColor"),(Object)("setFillBackgroundColor"),(Object)("setIndention"),(Object)("setDataFormat"),(Object)("setRotation")});
RDebugUtils.currentLine=16515085;
 //BA.debugLineNum = 16515085;BA.debugLine="Public InternalStyleBooleans As List = Array(\"set";
_internalstylebooleans = new anywheresoftware.b4a.objects.collections.List();
_internalstylebooleans = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setLocked"),(Object)("setHidden"),(Object)("setWrapText")});
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="Public InternalStyleInts As List = Array(\"setFont";
_internalstyleints = new anywheresoftware.b4a.objects.collections.List();
_internalstyleints = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setFont")});
RDebugUtils.currentLine=16515087;
 //BA.debugLineNum = 16515087;BA.debugLine="Public InternalStyleStrings As List = Array(\"setB";
_internalstylestrings = new anywheresoftware.b4a.objects.collections.List();
_internalstylestrings = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setBorderBottom"),(Object)("setBorderLeft"),(Object)("setBorderRight"),(Object)("setBorderTop"),(Object)("setAlignment"),(Object)("setVerticalAlignment"),(Object)("setFillPattern")});
RDebugUtils.currentLine=16515088;
 //BA.debugLineNum = 16515088;BA.debugLine="Public InternalAllSimpleMethods As List = Array(I";
_internalallsimplemethods = new anywheresoftware.b4a.objects.collections.List();
_internalallsimplemethods = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._internalstyleshorts /*anywheresoftware.b4a.objects.collections.List*/ .getObject()),(Object)(__ref._internalstylebooleans /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=16515089;
 //BA.debugLineNum = 16515089;BA.debugLine="Public InternalNameRegex As String = \"[_A-Za-z][_";
_internalnameregex = "[_A-Za-z][_\\.A-Za-z0-9]+";
RDebugUtils.currentLine=16515090;
 //BA.debugLineNum = 16515090;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlsheetwriter  _clonesheet(b4j.example.xlworkbookwriter __ref,b4j.example.xlsheetwriter _sheet,String _newsheetname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "clonesheet", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "clonesheet", new Object[] {_sheet,_newsheetname}));}
anywheresoftware.b4j.objects.PoiSheetWrapper _newpoisheet = null;
b4j.example.xlsheetwriter _writer = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub CloneSheet (Sheet As XLSheetWriter, New";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim NewPoiSheet As PoiSheet = jWorkbook.RunMethod";
_newpoisheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_newpoisheet = (anywheresoftware.b4j.objects.PoiSheetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiSheetWrapper(), (org.apache.poi.ss.usermodel.Sheet)(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("cloneSheet",new Object[]{(Object)(_sheet._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())})));
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="NewPoiSheet.Name = NewSheetName";
_newpoisheet.setName(_newsheetname);
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new b4j.example.xlsheetwriter();
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="writer.Initialize(xl, Me, NewPoiSheet)";
_writer._initialize /*String*/ (null,ba,__ref._xl /*b4j.example.xlutils*/ ,(b4j.example.xlworkbookwriter)(this),_newpoisheet);
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _createsheetwriterbyindex(b4j.example.xlworkbookwriter __ref,int _sheetindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createsheetwriterbyindex", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "createsheetwriterbyindex", new Object[] {_sheetindex}));}
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
b4j.example.xlsheetwriter _writer = null;
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub CreateSheetWriterByIndex (SheetIndex As";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim Sheet As PoiSheet = PoiWorkbook.GetSheet(Shee";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .GetSheet(_sheetindex);
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new b4j.example.xlsheetwriter();
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="writer.Initialize(xl, Me, Sheet)";
_writer._initialize /*String*/ (null,ba,__ref._xl /*b4j.example.xlutils*/ ,(b4j.example.xlworkbookwriter)(this),_sheet);
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlsheetwriter  _createsheetwriterbyname(b4j.example.xlworkbookwriter __ref,String _sheetname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createsheetwriterbyname", true))
	 {return ((b4j.example.xlsheetwriter) Debug.delegate(ba, "createsheetwriterbyname", new Object[] {_sheetname}));}
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
b4j.example.xlsheetwriter _writer = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub CreateSheetWriterByName (SheetName As S";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Dim sheet As PoiSheet = PoiWorkbook.GetSheetByNam";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .GetSheetByName(_sheetname);
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="If sheet.IsInitialized = False Then";
if (_sheet.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="sheet = PoiWorkbook.AddSheet(SheetName, PoiWorkb";
_sheet = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .AddSheet(_sheetname,__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getNumberOfSheets());
 };
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new b4j.example.xlsheetwriter();
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="writer.Initialize(xl, Me, sheet)";
_writer._initialize /*String*/ (null,ba,__ref._xl /*b4j.example.xlutils*/ ,(b4j.example.xlworkbookwriter)(this),_sheet);
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _createstyle(b4j.example.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "createstyle", null));}
b4j.example.xlstyle _style = null;
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Public Sub CreateStyle As XLStyle";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Dim style As XLStyle";
_style = new b4j.example.xlstyle();
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="style.Initialize (Me)";
_style._initialize /*b4j.example.xlstyle*/ (null,ba,(b4j.example.xlworkbookwriter)(this));
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Return style";
if (true) return _style;
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="End Sub";
return null;
}
public String  _evaluateformulas(b4j.example.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "evaluateformulas", true))
	 {return ((String) Debug.delegate(ba, "evaluateformulas", null));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub EvaluateFormulas";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="jWorkbook.RunMethodJO(\"getCreationHelper\", Null).";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethodJO("createFormulaEvaluator",(Object[])(__c.Null)).RunMethod("evaluateAll",(Object[])(__c.Null));
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="End Sub";
return "";
}
public int  _getactivesheetindex(b4j.example.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getactivesheetindex", true))
	 {return ((Integer) Debug.delegate(ba, "getactivesheetindex", null));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Public Sub getActiveSheetIndex As Int";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="Return jWorkbook.RunMethod(\"getActiveSheetIndex\",";
if (true) return (int)(BA.ObjectToNumber(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getActiveSheetIndex",(Object[])(__c.Null))));
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="End Sub";
return 0;
}
public boolean  _getforceformularecalculation(b4j.example.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getforceformularecalculation", true))
	 {return ((Boolean) Debug.delegate(ba, "getforceformularecalculation", null));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub getForceFormulaRecalculation As Boolean";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Return jWorkbook.RunMethod(\"getForceFormulaRecalc";
if (true) return BA.ObjectToBoolean(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getForceFormulaRecalculation",(Object[])(__c.Null)));
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="End Sub";
return false;
}
public String  _removesheetat(b4j.example.xlworkbookwriter __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "removesheetat", true))
	 {return ((String) Debug.delegate(ba, "removesheetat", new Object[] {_index}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub RemoveSheetAt (Index As Int)";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="jWorkbook.RunMethod(\"removeSheetAt\", Array(Index)";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("removeSheetAt",new Object[]{(Object)(_index)});
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="End Sub";
return "";
}
public String  _saveas(b4j.example.xlworkbookwriter __ref,String _dir,String _filename,boolean _renameifneeded) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "saveas", true))
	 {return ((String) Debug.delegate(ba, "saveas", new Object[] {_dir,_filename,_renameifneeded}));}
String _orig = "";
String _extension = "";
int _i = 0;
String _f = "";
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If RenameIfNeeded Then";
if (_renameifneeded) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
_orig = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="Dim extension As String";
_extension = "";
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
_i = _orig.lastIndexOf(".");
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="If i >-1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="extension = orig.SubString(i)";
_extension = _orig.substring(_i);
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="orig = orig.SubString2(0, i)";
_orig = _orig.substring((int) (0),_i);
 };
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="For i = 0 To 10";
{
final int step9 = 1;
final int limit9 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=16711690;
 //BA.debugLineNum = 16711690;BA.debugLine="Dim f As String";
_f = "";
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="Try";
try {RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
if (_i==0) { 
_f = _orig+_extension;}
else {
_f = _orig+" ("+BA.NumberToString(_i)+")"+_extension;};
RDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="PoiWorkbook.Save(f, \"\")";
__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .Save(_f,"");
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="Return f";
if (true) return _f;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=16711696;
 //BA.debugLineNum = 16711696;BA.debugLine="Log(\"Failed: \" & f)";
__c.LogImpl("916711696","Failed: "+_f,0);
 };
 }
};
 };
RDebugUtils.currentLine=16711700;
 //BA.debugLineNum = 16711700;BA.debugLine="PoiWorkbook.Save(Dir, FileName)";
__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .Save(_dir,_filename);
RDebugUtils.currentLine=16711701;
 //BA.debugLineNum = 16711701;BA.debugLine="Return File.Combine(Dir, FileName)";
if (true) return __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=16711702;
 //BA.debugLineNum = 16711702;BA.debugLine="End Sub";
return "";
}
public String  _setactivesheetindex(b4j.example.xlworkbookwriter __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "setactivesheetindex", true))
	 {return ((String) Debug.delegate(ba, "setactivesheetindex", new Object[] {_i}));}
int _ii = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub setActiveSheetIndex (i As Int)";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="For ii = 0 To PoiWorkbook.NumberOfSheets - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getNumberOfSheets()-1);
_ii = (int) (0) ;
for (;_ii <= limit1 ;_ii = _ii + step1 ) {
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="Dim jo As JavaObject = PoiWorkbook.GetSheet(ii)";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .GetSheet(_ii).getObject()));
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="jo.RunMethod(\"setSelected\", Array(False))";
_jo.RunMethod("setSelected",new Object[]{(Object)(__c.False)});
 }
};
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="jWorkbook.RunMethod(\"setActiveSheet\", Array(i))";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setActiveSheet",new Object[]{(Object)(_i)});
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="End Sub";
return "";
}
public String  _setforceformularecalculation(b4j.example.xlworkbookwriter __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "setforceformularecalculation", true))
	 {return ((String) Debug.delegate(ba, "setforceformularecalculation", new Object[] {_b}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub setForceFormulaRecalculation (b As Bool";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="jWorkbook.RunMethod(\"setForceFormulaRecalculation";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setForceFormulaRecalculation",new Object[]{(Object)(_b)});
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return "";
}
}