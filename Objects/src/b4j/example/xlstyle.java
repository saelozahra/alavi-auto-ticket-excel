package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlstyle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xlstyle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xlstyle.class).invoke(this, new Object[] {null});
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
public String _style_key_horizontal_alignment = "";
public String _style_key_border_bottom = "";
public String _style_key_border_left = "";
public String _style_key_border_right = "";
public String _style_key_border_top = "";
public String _style_key_bottom_border_color = "";
public String _style_key_left_border_color = "";
public String _style_key_right_border_color = "";
public String _style_key_top_border_color = "";
public String _style_key_data_format = "";
public String _style_key_fill_foreground_color = "";
public String _style_key_fill_pattern = "";
public String _style_key_font = "";
public String _style_key_hidden = "";
public String _style_key_indention = "";
public String _style_key_locked = "";
public String _style_key_rotation = "";
public String _style_key_vertical_alignment = "";
public String _style_key_wrap_text = "";
public anywheresoftware.b4j.object.JavaObject _bba = null;
public anywheresoftware.b4a.objects.collections.Map _stylemap = null;
public b4j.example.xlworkbookwriter _writer = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.xlstyle  _borderbottom(b4j.example.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderbottom", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "borderbottom", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub BorderBottom (BorderStyle As String) As";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_BOTTOM, BorderS";
if (true) return __ref._setborder /*b4j.example.xlstyle*/ (null,__ref._style_key_border_bottom /*String*/ ,_borderstyle);
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _setborder(b4j.example.xlstyle __ref,String _property,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "setborder", new Object[] {_property,_style}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub SetBorder (Property As String, Style A";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="StyleMap.Put(Property, Style)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_property),(Object)(_style));
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _borderbottomcolor(b4j.example.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderbottomcolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "borderbottomcolor", new Object[] {_color}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub BorderBottomColor (Color As Short) As X";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Return SetBorderColor(STYLE_KEY_BOTTOM_BORDER_COL";
if (true) return __ref._setbordercolor /*b4j.example.xlstyle*/ (null,__ref._style_key_bottom_border_color /*String*/ ,_color);
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _setbordercolor(b4j.example.xlstyle __ref,String _property,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "setbordercolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "setbordercolor", new Object[] {_property,_color}));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub SetBorderColor (Property As String, Co";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="StyleMap.Put(Property, Color)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_property),(Object)(_color));
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _borderleft(b4j.example.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderleft", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "borderleft", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub BorderLeft (BorderStyle As String) As X";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_LEFT, BorderSty";
if (true) return __ref._setborder /*b4j.example.xlstyle*/ (null,__ref._style_key_border_left /*String*/ ,_borderstyle);
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _borderleftcolor(b4j.example.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderleftcolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "borderleftcolor", new Object[] {_color}));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub BorderLeftColor (Color As Short) As XLS";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Return SetBorderColor(STYLE_KEY_LEFT_BORDER_COLOR";
if (true) return __ref._setbordercolor /*b4j.example.xlstyle*/ (null,__ref._style_key_left_border_color /*String*/ ,_color);
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _borderright(b4j.example.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderright", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "borderright", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub BorderRight (BorderStyle As String) As";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_RIGHT, BorderSt";
if (true) return __ref._setborder /*b4j.example.xlstyle*/ (null,__ref._style_key_border_right /*String*/ ,_borderstyle);
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _borderrightcolor(b4j.example.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderrightcolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "borderrightcolor", new Object[] {_color}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub BorderRightColor (Color As Short) As XL";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Return SetBorderColor(STYLE_KEY_RIGHT_BORDER_COLO";
if (true) return __ref._setbordercolor /*b4j.example.xlstyle*/ (null,__ref._style_key_right_border_color /*String*/ ,_color);
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _bordertop(b4j.example.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "bordertop", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "bordertop", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub BorderTop (BorderStyle As String) As XL";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_TOP, BorderStyl";
if (true) return __ref._setborder /*b4j.example.xlstyle*/ (null,__ref._style_key_border_top /*String*/ ,_borderstyle);
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _bordertopcolor(b4j.example.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "bordertopcolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "bordertopcolor", new Object[] {_color}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub BorderTopColor (Color As Short) As XLSt";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Return SetBorderColor(STYLE_KEY_TOP_BORDER_COLOR,";
if (true) return __ref._setbordercolor /*b4j.example.xlstyle*/ (null,__ref._style_key_top_border_color /*String*/ ,_color);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.xlstyle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Private STYLE_KEY_HORIZONTAL_ALIGNMENT = \"setAlig";
_style_key_horizontal_alignment = "setAlignment";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Private STYLE_KEY_BORDER_BOTTOM = \"setBorderBotto";
_style_key_border_bottom = "setBorderBottom";
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Private STYLE_KEY_BORDER_LEFT = \"setBorderLeft\" A";
_style_key_border_left = "setBorderLeft";
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="Private STYLE_KEY_BORDER_RIGHT = \"setBorderRight\"";
_style_key_border_right = "setBorderRight";
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="Private STYLE_KEY_BORDER_TOP = \"setBorderTop\" As";
_style_key_border_top = "setBorderTop";
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Private STYLE_KEY_BOTTOM_BORDER_COLOR = \"setBotto";
_style_key_bottom_border_color = "setBottomBorderColor";
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Private STYLE_KEY_LEFT_BORDER_COLOR = \"setLeftBor";
_style_key_left_border_color = "setLeftBorderColor";
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="Private STYLE_KEY_RIGHT_BORDER_COLOR = \"setRightB";
_style_key_right_border_color = "setRightBorderColor";
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="Private STYLE_KEY_TOP_BORDER_COLOR = \"setTopBorde";
_style_key_top_border_color = "setTopBorderColor";
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="Private STYLE_KEY_DATA_FORMAT = \"setDataFormat\" A";
_style_key_data_format = "setDataFormat";
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="Private STYLE_KEY_FILL_FOREGROUND_COLOR = \"setFil";
_style_key_fill_foreground_color = "setFillForegroundColor";
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="Private STYLE_KEY_FILL_PATTERN = \"setFillPattern\"";
_style_key_fill_pattern = "setFillPattern";
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="Private STYLE_KEY_FONT = \"setFont\" As String";
_style_key_font = "setFont";
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="Private STYLE_KEY_HIDDEN = \"setHidden\" As String";
_style_key_hidden = "setHidden";
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="Private STYLE_KEY_INDENTION = \"setIndention\" As S";
_style_key_indention = "setIndention";
RDebugUtils.currentLine=12058641;
 //BA.debugLineNum = 12058641;BA.debugLine="Private STYLE_KEY_LOCKED = \"setLocked\" As String";
_style_key_locked = "setLocked";
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="Private STYLE_KEY_ROTATION = \"setRotation\" As Str";
_style_key_rotation = "setRotation";
RDebugUtils.currentLine=12058643;
 //BA.debugLineNum = 12058643;BA.debugLine="Private STYLE_KEY_VERTICAL_ALIGNMENT = \"setVertic";
_style_key_vertical_alignment = "setVerticalAlignment";
RDebugUtils.currentLine=12058644;
 //BA.debugLineNum = 12058644;BA.debugLine="Private STYLE_KEY_WRAP_TEXT = \"setWrapText\" As St";
_style_key_wrap_text = "setWrapText";
RDebugUtils.currentLine=12058645;
 //BA.debugLineNum = 12058645;BA.debugLine="Private bba As JavaObject";
_bba = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12058646;
 //BA.debugLineNum = 12058646;BA.debugLine="Public StyleMap As Map";
_stylemap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12058647;
 //BA.debugLineNum = 12058647;BA.debugLine="Private writer As XLWorkbookWriter";
_writer = new b4j.example.xlworkbookwriter();
RDebugUtils.currentLine=12058648;
 //BA.debugLineNum = 12058648;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlstyle  _clone(b4j.example.xlstyle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "clone", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "clone", null));}
b4j.example.xlstyle _newstyle = null;
String _k = "";
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub Clone As XLStyle";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim NewStyle As XLStyle";
_newstyle = new b4j.example.xlstyle();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="NewStyle.Initialize (writer)";
_newstyle._initialize /*b4j.example.xlstyle*/ (null,ba,__ref._writer /*b4j.example.xlworkbookwriter*/ );
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="For Each k As String In StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="NewStyle.StyleMap.Put(k, StyleMap.Get(k))";
_newstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="Return NewStyle";
if (true) return _newstyle;
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _initialize(b4j.example.xlstyle __ref,anywheresoftware.b4a.BA _ba,b4j.example.xlworkbookwriter _vwriter) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "initialize", new Object[] {_ba,_vwriter}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub Initialize (vwriter As XLWorkbookWriter";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="bba.InitializeStatic(\"anywheresoftware.b4a.BA\")";
__ref._bba /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("anywheresoftware.b4a.BA");
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="StyleMap.Initialize";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="writer = vwriter";
__ref._writer /*b4j.example.xlworkbookwriter*/  = _vwriter;
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _dataformat(b4j.example.xlstyle __ref,String _format) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "dataformat", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "dataformat", new Object[] {_format}));}
short _ix = (short)0;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub DataFormat (Format As String) As XLStyl";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim ix As Short = writer.jWorkbook.RunMethodJO(\"c";
_ix = (short)(BA.ObjectToNumber(__ref._writer /*b4j.example.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("createDataFormat",(Object[])(__c.Null)).RunMethod("getFormat",new Object[]{(Object)(_format)})));
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="StyleMap.Put(STYLE_KEY_DATA_FORMAT, ix)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_data_format /*String*/ ),(Object)(_ix));
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _font(b4j.example.xlstyle __ref,short _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "font", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "font", new Object[] {_size}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub Font (Size As Short) As XLStyle";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Return FontColor(Size, writer.xl.COLOR_BLACK)";
if (true) return __ref._fontcolor /*b4j.example.xlstyle*/ (null,_size,(int) (__ref._writer /*b4j.example.xlworkbookwriter*/ ._xl /*b4j.example.xlutils*/ ._color_black /*short*/ ));
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _fontcolor(b4j.example.xlstyle __ref,short _size,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontcolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "fontcolor", new Object[] {_size,_color}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub FontColor (Size As Short, Color As Int)";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, False, wr";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = __ref._writer /*b4j.example.xlworkbookwriter*/ ._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (null,_size,__c.False,__ref._writer /*b4j.example.xlworkbookwriter*/ ._defaultfontname /*String*/ ,__c.False,__c.False,_color);
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_f.getIndex()));
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _fontbold(b4j.example.xlstyle __ref,short _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontbold", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "fontbold", new Object[] {_size}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub FontBold (Size As Short) As XLStyle";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Return FontBoldColor(Size, writer.xl.COLOR_BLACK)";
if (true) return __ref._fontboldcolor /*b4j.example.xlstyle*/ (null,_size,(int) (__ref._writer /*b4j.example.xlworkbookwriter*/ ._xl /*b4j.example.xlutils*/ ._color_black /*short*/ ));
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _fontboldcolor(b4j.example.xlstyle __ref,short _size,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontboldcolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "fontboldcolor", new Object[] {_size,_color}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub FontBoldColor (Size As Short, Color As";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, True, wri";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = __ref._writer /*b4j.example.xlworkbookwriter*/ ._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (null,_size,__c.True,__ref._writer /*b4j.example.xlworkbookwriter*/ ._defaultfontname /*String*/ ,__c.False,__c.False,_color);
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_f.getIndex()));
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _fontlink(b4j.example.xlstyle __ref,short _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontlink", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "fontlink", new Object[] {_size}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub FontLink (Size As Short) As XLStyle";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, False, wr";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = __ref._writer /*b4j.example.xlworkbookwriter*/ ._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (null,_size,__c.False,__ref._writer /*b4j.example.xlworkbookwriter*/ ._defaultfontname /*String*/ ,__c.False,__c.True,(int) (__ref._writer /*b4j.example.xlworkbookwriter*/ ._xl /*b4j.example.xlutils*/ ._color_blue /*short*/ ));
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_f.getIndex()));
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _fontother(b4j.example.xlstyle __ref,anywheresoftware.b4j.objects.PoiFontWrapper _pfont) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontother", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "fontother", new Object[] {_pfont}));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub FontOther (PFont As PoiFont) As XLStyle";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, PFont.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_pfont.getIndex()));
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _foregroundcolor(b4j.example.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "foregroundcolor", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "foregroundcolor", new Object[] {_color}));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub ForegroundColor (Color As Short) As XLS";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="StyleMap.Put(STYLE_KEY_FILL_FOREGROUND_COLOR, Col";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_fill_foreground_color /*String*/ ),(Object)(_color));
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="StyleMap.Put(STYLE_KEY_FILL_PATTERN, \"SOLID_FOREG";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_fill_pattern /*String*/ ),(Object)("SOLID_FOREGROUND"));
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _hidden(b4j.example.xlstyle __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "hidden", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "hidden", new Object[] {_value}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub Hidden (Value As Boolean) As XLStyle";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="StyleMap.Put(STYLE_KEY_HIDDEN, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_hidden /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _horizontalalignment(b4j.example.xlstyle __ref,String _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "horizontalalignment", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "horizontalalignment", new Object[] {_alignment}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub HorizontalAlignment (Alignment As Strin";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="StyleMap.Put(STYLE_KEY_HORIZONTAL_ALIGNMENT, Alig";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_horizontal_alignment /*String*/ ),(Object)(_alignment));
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _importstyle(b4j.example.xlstyle __ref,b4j.example.xlstyle _otherstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "importstyle", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "importstyle", new Object[] {_otherstyle}));}
String _k = "";
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub ImportStyle (OtherStyle As XLStyle) As";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="For Each k As String In OtherStyle.StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _otherstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="StyleMap.Put(k, OtherStyle.StyleMap.Get(k))";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_otherstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _indention(b4j.example.xlstyle __ref,short _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "indention", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "indention", new Object[] {_value}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub Indention (Value As Short) As XLStyle";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="StyleMap.Put(STYLE_KEY_INDENTION, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_indention /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _locked(b4j.example.xlstyle __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "locked", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "locked", new Object[] {_value}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub Locked (Value As Boolean) As XLStyle";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="StyleMap.Put(STYLE_KEY_LOCKED, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_locked /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _rotation(b4j.example.xlstyle __ref,short _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "rotation", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "rotation", new Object[] {_value}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub Rotation (Value As Short) As XLStyle";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="StyleMap.Put(STYLE_KEY_ROTATION, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_rotation /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _verticalalignment(b4j.example.xlstyle __ref,String _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "verticalalignment", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "verticalalignment", new Object[] {_alignment}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub VerticalAlignment (Alignment As String)";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="StyleMap.Put(STYLE_KEY_VERTICAL_ALIGNMENT, Alignm";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_vertical_alignment /*String*/ ),(Object)(_alignment));
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlstyle  _wraptext(b4j.example.xlstyle __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "wraptext", true))
	 {return ((b4j.example.xlstyle) Debug.delegate(ba, "wraptext", new Object[] {_value}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub WrapText (Value As Boolean) As XLStyle";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="StyleMap.Put(STYLE_KEY_WRAP_TEXT, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_wrap_text /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Return Me";
if (true) return (b4j.example.xlstyle)(this);
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="End Sub";
return null;
}
}