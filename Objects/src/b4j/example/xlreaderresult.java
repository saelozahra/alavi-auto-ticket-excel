package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlreaderresult extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xlreaderresult", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xlreaderresult.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xlhyperlink{
public boolean IsInitialized;
public String LinkType;
public String Address;
public String Label;
public void Initialize() {
IsInitialized = true;
LinkType = "";
Address = "";
Label = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public b4j.example.xlutils._xladdress _topleft = null;
public b4j.example.xlutils._xladdress _bottomright = null;
public String _name = "";
public b4j.example.xlutils _xl = null;
public Object _defaultemptycellvalue = null;
public anywheresoftware.b4a.objects.collections.Map _hyperlinks = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _logresult(b4j.example.xlreaderresult __ref,boolean _withcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "logresult", true))
	 {return ((String) Debug.delegate(ba, "logresult", new Object[] {_withcontent}));}
boolean _isrectangle = false;
int _length = 0;
Object[] _first = null;
Object[] _row = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _firstcell = false;
Object _cell = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub LogResult (WithContent As Boolean)";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Log($\"*** ${Name} ***\"$)";
__c.LogImpl("98847361",("*** "+__c.SmartStringFormatter("",(Object)(__ref._name /*String*/ ))+" ***"),0);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Log($\"Number of rows: ${Data.Size}\"$)";
__c.LogImpl("98847362",("Number of rows: "+__c.SmartStringFormatter("",(Object)(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()))+""),0);
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Dim IsRectangle As Boolean = True";
_isrectangle = __c.True;
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Dim first() As Object = Data.Get(0)";
_first = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="length = first.Length";
_length = _first.length;
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="For Each row() As Object In Data";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._data /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (Object[])(group8.Get(index8));
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="If row.Length <> length Then";
if (_row.length!=_length) { 
RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="IsRectangle = False";
_isrectangle = __c.False;
RDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="Log($\"Is rectangle region: ${IsRectangle}\"$)";
__c.LogImpl("98847374",("Is rectangle region: "+__c.SmartStringFormatter("",(Object)(_isrectangle))+""),0);
RDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="Log($\"${xl.AddressToString(TopLeft)} -> ${xl.Add";
__c.LogImpl("98847375",(""+__c.SmartStringFormatter("",(Object)(__ref._xl /*b4j.example.xlutils*/ ._addresstostring /*String*/ (null,__ref._topleft /*b4j.example.xlutils._xladdress*/ )))+" -> "+__c.SmartStringFormatter("",(Object)(__ref._xl /*b4j.example.xlutils*/ ._addresstostring /*String*/ (null,__ref._bottomright /*b4j.example.xlutils._xladdress*/ )))+""),0);
RDebugUtils.currentLine=8847376;
 //BA.debugLineNum = 8847376;BA.debugLine="If WithContent Then";
if (_withcontent) { 
RDebugUtils.currentLine=8847377;
 //BA.debugLineNum = 8847377;BA.debugLine="Log(\"Content:\")";
__c.LogImpl("98847377","Content:",0);
RDebugUtils.currentLine=8847378;
 //BA.debugLineNum = 8847378;BA.debugLine="For Each row() As Object In Data";
{
final anywheresoftware.b4a.BA.IterableList group18 = __ref._data /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_row = (Object[])(group18.Get(index18));
RDebugUtils.currentLine=8847379;
 //BA.debugLineNum = 8847379;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8847381;
 //BA.debugLineNum = 8847381;BA.debugLine="Dim firstcell As Boolean = True";
_firstcell = __c.True;
RDebugUtils.currentLine=8847382;
 //BA.debugLineNum = 8847382;BA.debugLine="If row.Length = 0 Then";
if (_row.length==0) { 
RDebugUtils.currentLine=8847383;
 //BA.debugLineNum = 8847383;BA.debugLine="sb.Append(\"(empty row)\")";
_sb.Append("(empty row)");
 }else {
RDebugUtils.currentLine=8847385;
 //BA.debugLineNum = 8847385;BA.debugLine="For Each cell As Object In row";
{
final Object[] group25 = _row;
final int groupLen25 = group25.length
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_cell = group25[index25];
RDebugUtils.currentLine=8847386;
 //BA.debugLineNum = 8847386;BA.debugLine="If firstcell = False Then sb.Append(\", \") El";
if (_firstcell==__c.False) { 
_sb.Append(", ");}
else {
_firstcell = __c.False;};
RDebugUtils.currentLine=8847387;
 //BA.debugLineNum = 8847387;BA.debugLine="If cell = \"\" Then cell = DefaultEmptyCellVal";
if ((_cell).equals((Object)(""))) { 
_cell = __ref._defaultemptycellvalue /*Object*/ ;};
RDebugUtils.currentLine=8847388;
 //BA.debugLineNum = 8847388;BA.debugLine="If cell Is Long Then";
if (_cell instanceof Long) { 
RDebugUtils.currentLine=8847389;
 //BA.debugLineNum = 8847389;BA.debugLine="sb.Append(DateTime.Date(cell))";
_sb.Append(__c.DateTime.Date(BA.ObjectToLongNumber(_cell)));
 }else {
RDebugUtils.currentLine=8847391;
 //BA.debugLineNum = 8847391;BA.debugLine="sb.Append(cell)";
_sb.Append(BA.ObjectToString(_cell));
 };
 }
};
 };
RDebugUtils.currentLine=8847395;
 //BA.debugLineNum = 8847395;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("98847395",_sb.ToString(),0);
 }
};
 };
 };
RDebugUtils.currentLine=8847399;
 //BA.debugLineNum = 8847399;BA.debugLine="End Sub";
return "";
}
public Object  _get(b4j.example.xlreaderresult __ref,b4j.example.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_address}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub Get(Address As XLAddress) As Object";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Return GetDefault(Address, DefaultEmptyCellValue)";
if (true) return __ref._getdefault /*Object*/ (null,_address,__ref._defaultemptycellvalue /*Object*/ );
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.xlreaderresult __ref,anywheresoftware.b4a.BA _ba,b4j.example.xlutils _vxl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="xl = vXL";
__ref._xl /*b4j.example.xlutils*/  = _vxl;
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Hyperlinks.Initialize";
__ref._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.xlreaderresult __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="Public TopLeft As XLAddress";
_topleft = new b4j.example.xlutils._xladdress();
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Public BottomRight As XLAddress";
_bottomright = new b4j.example.xlutils._xladdress();
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Public Name As String";
_name = "";
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="Private xl As XLUtils";
_xl = new b4j.example.xlutils();
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="Public DefaultEmptyCellValue As Object = \"\"";
_defaultemptycellvalue = (Object)("");
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="Type XLHyperlink (LinkType As String, Address As";
;
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="Public Hyperlinks As Map";
_hyperlinks = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="End Sub";
return "";
}
public Object  _getdefault(b4j.example.xlreaderresult __ref,b4j.example.xlutils._xladdress _address,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_address,_defaultvalue}));}
int _row = 0;
int _col = 0;
Object[] _rrow = null;
Object _res = null;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub GetDefault(Address As XLAddress, Defaul";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim row As Int = Address.Row0Based - TopLeft.Row0";
_row = (int) (_address.Row0Based /*int*/ -__ref._topleft /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ );
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim col As Int = Address.Col0Based - TopLeft.Col0";
_col = (int) (_address.Col0Based /*int*/ -__ref._topleft /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ );
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="If col < 0 Or row < 0 Or row >= Data.Size Then Re";
if (_col<0 || _row<0 || _row>=__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Dim rrow() As Object = Data.Get(row)";
_rrow = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="If rrow.Length <= col Then Return DefaultValue";
if (_rrow.length<=_col) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="Dim res As Object = rrow(col)";
_res = _rrow[_col];
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="If res = \"\" Then Return DefaultValue";
if ((_res).equals((Object)(""))) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlreaderresult._xlhyperlink  _gethyperlink(b4j.example.xlreaderresult __ref,b4j.example.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "gethyperlink", true))
	 {return ((b4j.example.xlreaderresult._xlhyperlink) Debug.delegate(ba, "gethyperlink", new Object[] {_address}));}
String _a = "";
b4j.example.xlreaderresult._xlhyperlink _empty = null;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub GetHyperlink(Address As XLAddress) As X";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim a As String = xl.AddressToString(Address)";
_a = __ref._xl /*b4j.example.xlutils*/ ._addresstostring /*String*/ (null,_address);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="If Hyperlinks.ContainsKey(a) Then";
if (__ref._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_a))) { 
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="Return Hyperlinks.Get(a)";
if (true) return (b4j.example.xlreaderresult._xlhyperlink)(__ref._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_a)));
 };
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Dim Empty As XLHyperlink";
_empty = new b4j.example.xlreaderresult._xlhyperlink();
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="Return Empty";
if (true) return _empty;
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="End Sub";
return null;
}
}