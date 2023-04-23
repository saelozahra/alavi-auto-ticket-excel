package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xbreadcrumb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xbreadcrumb", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xbreadcrumb.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.collections.List _mitems = null;
public anywheresoftware.b4a.objects.collections.List _rightpositions = null;
public int _textcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public int _offset = 0;
public b4j.example.bitmapcreator _bc = null;
public int _crumbcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _presseditem = 0;
public Object _tag = null;
public boolean _mhaptic = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4j.example.b4xbreadcrumb __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4j.example.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
b4j.example.bitmapcreator._argbcolor _bcolor = null;
int _strokecolor = 0;
int[] _clrs = null;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4j.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*2));
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*2));
RDebugUtils.currentLine=23789574;
 //BA.debugLineNum = 23789574;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*2));
RDebugUtils.currentLine=23789575;
 //BA.debugLineNum = 23789575;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = __ref._bc /*b4j.example.bitmapcreator*/ ._argbtocolor(_bcolor);
RDebugUtils.currentLine=23789577;
 //BA.debugLineNum = 23789577;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4j.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=23789578;
 //BA.debugLineNum = 23789578;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor.r = (int) (_bcolor.r*0.8);
RDebugUtils.currentLine=23789579;
 //BA.debugLineNum = 23789579;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor.g = (int) (_bcolor.g*0.8);
RDebugUtils.currentLine=23789580;
 //BA.debugLineNum = 23789580;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor.b = (int) (_bcolor.b*0.8);
RDebugUtils.currentLine=23789581;
 //BA.debugLineNum = 23789581;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = new int[]{__ref._crumbcolor /*int*/ ,__ref._bc /*b4j.example.bitmapcreator*/ ._argbtocolor(_bcolor)};
RDebugUtils.currentLine=23789583;
 //BA.debugLineNum = 23789583;BA.debugLine="RightPositions.Clear";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=23789584;
 //BA.debugLineNum = 23789584;BA.debugLine="If mItems.Size = 0 Then Return";
if (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=23789585;
 //BA.debugLineNum = 23789585;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
RDebugUtils.currentLine=23789586;
 //BA.debugLineNum = 23789586;BA.debugLine="For i = 0 To mItems.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=23789587;
 //BA.debugLineNum = 23789587;BA.debugLine="Dim sc As Int";
_sc = 0;
RDebugUtils.currentLine=23789588;
 //BA.debugLineNum = 23789588;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (__ref._presseditem /*int*/ ==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
RDebugUtils.currentLine=23789589;
 //BA.debugLineNum = 23789589;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = __ref._drawitem /*int*/ (null,_left,BA.ObjectToString(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),_i==0,_i==__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,_clrs[(int) (_i%_clrs.length)],_sc);
RDebugUtils.currentLine=23789590;
 //BA.debugLineNum = 23789590;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+__ref._offset /*int*/ +__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=23789591;
 //BA.debugLineNum = 23789591;BA.debugLine="RightPositions.Add(Left)";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_left));
 }
};
RDebugUtils.currentLine=23789593;
 //BA.debugLineNum = 23789593;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=23789594;
 //BA.debugLineNum = 23789594;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="Private mItems As List";
_mitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23527431;
 //BA.debugLineNum = 23527431;BA.debugLine="Private RightPositions As List";
_rightpositions = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=23527433;
 //BA.debugLineNum = 23527433;BA.debugLine="Public fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=23527434;
 //BA.debugLineNum = 23527434;BA.debugLine="Private offset As Int = 10dip";
_offset = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=23527435;
 //BA.debugLineNum = 23527435;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=23527436;
 //BA.debugLineNum = 23527436;BA.debugLine="Public CrumbColor As Int";
_crumbcolor = 0;
RDebugUtils.currentLine=23527437;
 //BA.debugLineNum = 23527437;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23527438;
 //BA.debugLineNum = 23527438;BA.debugLine="Private PressedItem As Int = -1";
_presseditem = (int) (-1);
RDebugUtils.currentLine=23527439;
 //BA.debugLineNum = 23527439;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=23527440;
 //BA.debugLineNum = 23527440;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=23527441;
 //BA.debugLineNum = 23527441;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.b4xbreadcrumb __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _items = "";
String _s = "";
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="fnt = xlbl.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="TextColor = xlbl.TextColor";
__ref._textcolor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=23658503;
 //BA.debugLineNum = 23658503;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
__ref._crumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CrumbColor")));
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Touch");
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=23658507;
 //BA.debugLineNum = 23658507;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = BA.ObjectToString(_props.Get((Object)("Items")));
RDebugUtils.currentLine=23658508;
 //BA.debugLineNum = 23658508;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
final String[] group13 = __c.Regex.Split("\\|",_items);
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = group13[index13];
RDebugUtils.currentLine=23658509;
 //BA.debugLineNum = 23658509;BA.debugLine="mItems.Add(s)";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=23658511;
 //BA.debugLineNum = 23658511;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=23658512;
 //BA.debugLineNum = 23658512;BA.debugLine="End Sub";
return "";
}
public int  _drawitem(b4j.example.b4xbreadcrumb __ref,int _left,String _text,boolean _first,boolean _last,int _clr,int _strokecolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "drawitem", true))
	 {return ((Integer) Debug.delegate(ba, "drawitem", new Object[] {_left,_text,_first,_last,_clr,_strokecolor}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_text,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) (_r.getWidth()+__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight());
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=23855109;
 //BA.debugLineNum = 23855109;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=23855110;
 //BA.debugLineNum = 23855110;BA.debugLine="p.Initialize(Left, 0)";
_p.Initialize((float) (_left),(float) (0));
RDebugUtils.currentLine=23855111;
 //BA.debugLineNum = 23855111;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
_p.LineTo((float) (_left+_itemwidth),(float) (0));
RDebugUtils.currentLine=23855112;
 //BA.debugLineNum = 23855112;BA.debugLine="If Last = False Then";
if (_last==__c.False) { 
RDebugUtils.currentLine=23855113;
 //BA.debugLineNum = 23855113;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
_p.LineTo((float) (_left+_itemwidth+__ref._offset /*int*/ ),(float) (_itemheight/(double)2));
 };
RDebugUtils.currentLine=23855115;
 //BA.debugLineNum = 23855115;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
_p.LineTo((float) (_left+_itemwidth),(float) (_itemheight));
RDebugUtils.currentLine=23855116;
 //BA.debugLineNum = 23855116;BA.debugLine="If First = False Then";
if (_first==__c.False) { 
RDebugUtils.currentLine=23855117;
 //BA.debugLineNum = 23855117;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (_itemheight));
RDebugUtils.currentLine=23855118;
 //BA.debugLineNum = 23855118;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
_p.LineTo((float) (_left),(float) (_itemheight/(double)2));
RDebugUtils.currentLine=23855119;
 //BA.debugLineNum = 23855119;BA.debugLine="p.LineTo(Left - offset, 0)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (0));
 }else {
RDebugUtils.currentLine=23855121;
 //BA.debugLineNum = 23855121;BA.debugLine="p.LineTo(Left, ItemHeight)";
_p.LineTo((float) (_left),(float) (_itemheight));
 };
RDebugUtils.currentLine=23855123;
 //BA.debugLineNum = 23855123;BA.debugLine="p.LineTo(Left, 0)";
_p.LineTo((float) (_left),(float) (0));
RDebugUtils.currentLine=23855124;
 //BA.debugLineNum = 23855124;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_clr,__c.True,(float) (0));
RDebugUtils.currentLine=23855125;
 //BA.debugLineNum = 23855125;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
RDebugUtils.currentLine=23855126;
 //BA.debugLineNum = 23855126;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_strokecolor,__c.False,(float) (__c.DipToCurrent((int) (3))));
 };
RDebugUtils.currentLine=23855129;
 //BA.debugLineNum = 23855129;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(_text,_left+_itemwidth/(double)2,_baseline,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._textcolor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
RDebugUtils.currentLine=23855130;
 //BA.debugLineNum = 23855130;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
RDebugUtils.currentLine=23855131;
 //BA.debugLineNum = 23855131;BA.debugLine="End Sub";
return 0;
}
public int  _finditem(b4j.example.b4xbreadcrumb __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "finditem", true))
	 {return ((Integer) Debug.delegate(ba, "finditem", new Object[] {_x,_y}));}
int _r = 0;
int _i = 0;
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getitems(b4j.example.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "getitems", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getitems", null));}
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub getItems As List";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Return mItems";
if (true) return __ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.b4xbreadcrumb __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="mItems.Initialize";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="RightPositions.Initialize";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="bc.Initialize(1, 1)";
__ref._bc /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="End Sub";
return "";
}
public String  _setitems(b4j.example.b4xbreadcrumb __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_i}));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Public Sub setItems (i As List)";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="mItems = i";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/  = _i;
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="End Sub";
return "";
}
public String  _touch_touch(b4j.example.b4xbreadcrumb __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "touch_touch", true))
	 {return ((String) Debug.delegate(ba, "touch_touch", new Object[] {_action,_x,_y}));}
int _prev = 0;
int _index = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: 
case 1: {
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="Dim prev As Int = PressedItem";
_prev = __ref._presseditem /*int*/ ;
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="PressedItem = FindItem(X, Y)";
__ref._presseditem /*int*/  = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=23920645;
 //BA.debugLineNum = 23920645;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=__ref._presseditem /*int*/ ) { 
__ref._draw /*String*/ (null);};
 break; }
case 2: {
RDebugUtils.currentLine=23920647;
 //BA.debugLineNum = 23920647;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=23920648;
 //BA.debugLineNum = 23920648;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==__ref._presseditem /*int*/  && _index>-1) { 
RDebugUtils.currentLine=23920649;
 //BA.debugLineNum = 23920649;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23920650;
 //BA.debugLineNum = 23920650;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=23920651;
 //BA.debugLineNum = 23920651;BA.debugLine="For i = 0 To index";
{
final int step11 = 1;
final int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=23920652;
 //BA.debugLineNum = 23920652;BA.debugLine="Items.Add(mItems.Get(i))";
_items.Add(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=23920654;
 //BA.debugLineNum = 23920654;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=23920655;
 //BA.debugLineNum = 23920655;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CrumbClick",(Object)(_items));
 };
RDebugUtils.currentLine=23920657;
 //BA.debugLineNum = 23920657;BA.debugLine="PressedItem = -1";
__ref._presseditem /*int*/  = (int) (-1);
RDebugUtils.currentLine=23920658;
 //BA.debugLineNum = 23920658;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=23920660;
 //BA.debugLineNum = 23920660;BA.debugLine="End Sub";
return "";
}
}