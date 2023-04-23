package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xfloattextfield", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xfloattextfield.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mtextfield = null;
public int _animationduration = 0;
public float _largelabeltextsize = 0f;
public float _smalllabeltextsize = 0f;
public boolean _largelabel = false;
public anywheresoftware.b4a.objects.B4XCanvas _measuringcanvas = null;
public int _hintcolor = 0;
public int _nonfocusedhintcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _hintimageview = null;
public String _hinttext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _hintfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largefocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largenotfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallnotfocused = null;
public boolean _focused = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblv = null;
public anywheresoftware.b4a.objects.collections.Map _mprops = null;
public Object _tag = null;
public String _keyboardtype = "";
public boolean _multiline = false;
public b4j.example.b4xfloattextfield _mnexttextfield = null;
public String _tooltip = "";
public int _hintlabellargeoffsetx = 0;
public int _hintlabelsmalloffsety = 0;
public int _hintlabelsmalloffsetx = 0;
public long _lastswitchtextfieldtime = 0L;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _update(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._largelabeltextsize /*float*/ );
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
__ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29818885;
 //BA.debugLineNum = 29818885;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._smalllabeltextsize /*float*/ );
RDebugUtils.currentLine=29818886;
 //BA.debugLineNum = 29818886;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=29818887;
 //BA.debugLineNum = 29818887;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
__ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29818888;
 //BA.debugLineNum = 29818888;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=29818889;
 //BA.debugLineNum = 29818889;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=29818890;
 //BA.debugLineNum = 29818890;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.example.b4xfloattextfield __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _firstdistance = 0;
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (__ref._multiline /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="If lblV.IsInitialized Then";
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29622277;
 //BA.debugLineNum = 29622277;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_width-__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance,0,__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_height);
RDebugUtils.currentLine=29622278;
 //BA.debugLineNum = 29622278;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__c.DipToCurrent((int) (2)));
 };
RDebugUtils.currentLine=29622280;
 //BA.debugLineNum = 29622280;BA.debugLine="If lblClear.IsInitialized Then";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29622281;
 //BA.debugLineNum = 29622281;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_width-__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance,0,__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_height);
 };
RDebugUtils.currentLine=29622283;
 //BA.debugLineNum = 29622283;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="End Sub";
return "";
}
public String  _updatelabel(b4j.example.b4xfloattextfield __ref,String _txt,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "updatelabel", true))
	 {return ((String) Debug.delegate(ba, "updatelabel", new Object[] {_txt,_force}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ };
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(__ref._focused /*boolean*/  && _txt.length()>0);};
 }
};
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
RDebugUtils.currentLine=29687814;
 //BA.debugLineNum = 29687814;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==__ref._largelabel /*boolean*/  && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=29687815;
 //BA.debugLineNum = 29687815;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=29687816;
 //BA.debugLineNum = 29687816;BA.debugLine="If Focused Then";
if (__ref._focused /*boolean*/ ) { 
RDebugUtils.currentLine=29687817;
 //BA.debugLineNum = 29687817;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = __ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 }else {
RDebugUtils.currentLine=29687819;
 //BA.debugLineNum = 29687819;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = __ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 };
RDebugUtils.currentLine=29687821;
 //BA.debugLineNum = 29687821;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=29687822;
 //BA.debugLineNum = 29687822;BA.debugLine="HintImageView.SetBitmap(b)";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_b.getObject()));
RDebugUtils.currentLine=29687823;
 //BA.debugLineNum = 29687823;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
RDebugUtils.currentLine=29687824;
 //BA.debugLineNum = 29687824;BA.debugLine="HintImageView.SetLayoutAnimated (AnimationDurati";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabellargeoffsetx /*int*/ ,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_b.getHeight()/(double)2,_b.getWidth(),_b.getHeight());
RDebugUtils.currentLine=29687825;
 //BA.debugLineNum = 29687825;BA.debugLine="LargeLabel = True";
__ref._largelabel /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=29687827;
 //BA.debugLineNum = 29687827;BA.debugLine="HintImageView.SetLayoutAnimated(AnimationDuratio";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabelsmalloffsetx /*int*/ ,__ref._hintlabelsmalloffsety /*int*/ ,_b.getWidth(),_b.getHeight());
RDebugUtils.currentLine=29687828;
 //BA.debugLineNum = 29687828;BA.debugLine="LargeLabel = False";
__ref._largelabel /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=29687830;
 //BA.debugLineNum = 29687830;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=29032453;
 //BA.debugLineNum = 29032453;BA.debugLine="Private mTextField As B4XView";
_mtextfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="Public AnimationDuration As Int = 200";
_animationduration = (int) (200);
RDebugUtils.currentLine=29032455;
 //BA.debugLineNum = 29032455;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_largelabeltextsize = (float) (18);
_smalllabeltextsize = (float) (14);
RDebugUtils.currentLine=29032456;
 //BA.debugLineNum = 29032456;BA.debugLine="Private LargeLabel As Boolean";
_largelabel = false;
RDebugUtils.currentLine=29032457;
 //BA.debugLineNum = 29032457;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_measuringcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=29032458;
 //BA.debugLineNum = 29032458;BA.debugLine="Public HintColor As Int";
_hintcolor = 0;
RDebugUtils.currentLine=29032459;
 //BA.debugLineNum = 29032459;BA.debugLine="Public NonFocusedHintColor As Int";
_nonfocusedhintcolor = 0;
RDebugUtils.currentLine=29032460;
 //BA.debugLineNum = 29032460;BA.debugLine="Private HintImageView As B4XView";
_hintimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29032461;
 //BA.debugLineNum = 29032461;BA.debugLine="Public HintText As String";
_hinttext = "";
RDebugUtils.currentLine=29032462;
 //BA.debugLineNum = 29032462;BA.debugLine="Public HintFont As B4XFont";
_hintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=29032463;
 //BA.debugLineNum = 29032463;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_largefocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_largenotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallnotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=29032464;
 //BA.debugLineNum = 29032464;BA.debugLine="Public Focused As Boolean";
_focused = false;
RDebugUtils.currentLine=29032465;
 //BA.debugLineNum = 29032465;BA.debugLine="Public lblClear As B4XView";
_lblclear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29032466;
 //BA.debugLineNum = 29032466;BA.debugLine="Public lblV As B4XView";
_lblv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29032467;
 //BA.debugLineNum = 29032467;BA.debugLine="Private mProps As Map";
_mprops = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29032468;
 //BA.debugLineNum = 29032468;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=29032469;
 //BA.debugLineNum = 29032469;BA.debugLine="Private KeyboardType As String 'ignore";
_keyboardtype = "";
RDebugUtils.currentLine=29032470;
 //BA.debugLineNum = 29032470;BA.debugLine="Private Multiline As Boolean";
_multiline = false;
RDebugUtils.currentLine=29032471;
 //BA.debugLineNum = 29032471;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_mnexttextfield = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=29032476;
 //BA.debugLineNum = 29032476;BA.debugLine="Private ToolTip As String";
_tooltip = "";
RDebugUtils.currentLine=29032478;
 //BA.debugLineNum = 29032478;BA.debugLine="Public HintLabelLargeOffsetX, HintLabelSmallOffse";
_hintlabellargeoffsetx = 0;
_hintlabelsmalloffsety = __c.DipToCurrent((int) (2));
_hintlabelsmalloffsetx = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=29032479;
 //BA.debugLineNum = 29032479;BA.debugLine="Private LastSwitchTextFieldTime As Long";
_lastswitchtextfieldtime = 0L;
RDebugUtils.currentLine=29032480;
 //BA.debugLineNum = 29032480;BA.debugLine="End Sub";
return "";
}
public String  _createacceptbutton(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createacceptbutton", true))
	 {return ((String) Debug.delegate(ba, "createacceptbutton", null));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Private Sub CreateAcceptButton";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe5ca))));
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="lblV.Tag = \"v\"";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("v"));
RDebugUtils.currentLine=29360132;
 //BA.debugLineNum = 29360132;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createbutton(b4j.example.b4xfloattextfield __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createbutton", new Object[] {_text}));}
anywheresoftware.b4j.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="x = lc";
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=29556741;
 //BA.debugLineNum = 29556741;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (20)));
RDebugUtils.currentLine=29556742;
 //BA.debugLineNum = 29556742;BA.debugLine="x.Text = Text";
_x.setText(_text);
RDebugUtils.currentLine=29556743;
 //BA.debugLineNum = 29556743;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=29556744;
 //BA.debugLineNum = 29556744;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
RDebugUtils.currentLine=29556745;
 //BA.debugLineNum = 29556745;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=29556746;
 //BA.debugLineNum = 29556746;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_x.getObject()),0,0,__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=29556747;
 //BA.debugLineNum = 29556747;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=29556748;
 //BA.debugLineNum = 29556748;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(b4j.example.b4xfloattextfield __ref,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_r,_color,_fnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),0,0,__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2))),__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=29884419;
 //BA.debugLineNum = 29884419;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=29884420;
 //BA.debugLineNum = 29884420;BA.debugLine="c.Initialize(p)";
_c.Initialize(ba,_p);
RDebugUtils.currentLine=29884421;
 //BA.debugLineNum = 29884421;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=29884422;
 //BA.debugLineNum = 29884422;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(__ref._hinttext /*String*/ ,_p.getWidth()/(double)2,_baseline,_fnt,_color,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
RDebugUtils.currentLine=29884423;
 //BA.debugLineNum = 29884423;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
RDebugUtils.currentLine=29884424;
 //BA.debugLineNum = 29884424;BA.debugLine="c.Release";
_c.Release();
RDebugUtils.currentLine=29884425;
 //BA.debugLineNum = 29884425;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=29884426;
 //BA.debugLineNum = 29884426;BA.debugLine="End Sub";
return null;
}
public String  _createclearbutton(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createclearbutton", true))
	 {return ((String) Debug.delegate(ba, "createclearbutton", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Private Sub CreateClearButton";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=29294595;
 //BA.debugLineNum = 29294595;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe14c))));
RDebugUtils.currentLine=29294596;
 //BA.debugLineNum = 29294596;BA.debugLine="lblClear.Tag = \"clear\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("clear"));
RDebugUtils.currentLine=29294598;
 //BA.debugLineNum = 29294598;BA.debugLine="End Sub";
return "";
}
public String  _createrevealbutton(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createrevealbutton", true))
	 {return ((String) Debug.delegate(ba, "createrevealbutton", null));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Private Sub CreateRevealButton";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextfield(b4j.example.b4xfloattextfield __ref,boolean _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextfield", new Object[] {_password}));}
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _ta = null;
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
RDebugUtils.currentLine=30474243;
 //BA.debugLineNum = 30474243;BA.debugLine="If Multiline = False Then";
if (__ref._multiline /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=30474244;
 //BA.debugLineNum = 30474244;BA.debugLine="Dim tf As TextField";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=30474245;
 //BA.debugLineNum = 30474245;BA.debugLine="If Password Then tf.InitializePassword(\"tf\") Els";
if (_password) { 
_tf.InitializePassword(ba,"tf");}
else {
_tf.Initialize(ba,"tf");};
RDebugUtils.currentLine=30474246;
 //BA.debugLineNum = 30474246;BA.debugLine="If ToolTip <> \"\" Then tf.TooltipText = ToolTip";
if ((__ref._tooltip /*String*/ ).equals("") == false) { 
_tf.setTooltipText(__ref._tooltip /*String*/ );};
RDebugUtils.currentLine=30474247;
 //BA.debugLineNum = 30474247;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
 }else {
RDebugUtils.currentLine=30474249;
 //BA.debugLineNum = 30474249;BA.debugLine="Dim ta As TextArea";
_ta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=30474250;
 //BA.debugLineNum = 30474250;BA.debugLine="ta.Initialize(\"tf\")";
_ta.Initialize(ba,"tf");
RDebugUtils.currentLine=30474251;
 //BA.debugLineNum = 30474251;BA.debugLine="ta.WrapText = True";
_ta.setWrapText(__c.True);
RDebugUtils.currentLine=30474252;
 //BA.debugLineNum = 30474252;BA.debugLine="If ToolTip <> \"\" Then ta.TooltipText = ToolTip";
if ((__ref._tooltip /*String*/ ).equals("") == false) { 
_ta.setTooltipText(__ref._tooltip /*String*/ );};
RDebugUtils.currentLine=30474253;
 //BA.debugLineNum = 30474253;BA.debugLine="Return ta";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ta.getObject()));
 };
RDebugUtils.currentLine=30474298;
 //BA.debugLineNum = 30474298;BA.debugLine="End Sub";
return null;
}
public String  _createtextfieldall(b4j.example.b4xfloattextfield __ref,boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfieldall", true))
	 {return ((String) Debug.delegate(ba, "createtextfieldall", new Object[] {_passwordmode,_font1,_textcolor}));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_passwordmode);
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="mTextField.Font = Font1";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_font1);
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="mTextField.TextColor = TextColor";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=29229060;
 //BA.debugLineNum = 29229060;BA.debugLine="setNextField(mNextTextField)";
__ref._setnextfield /*String*/ (null,__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ );
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=29229062;
 //BA.debugLineNum = 29229062;BA.debugLine="End Sub";
return "";
}
public String  _setnextfield(b4j.example.b4xfloattextfield __ref,b4j.example.b4xfloattextfield _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "setnextfield", true))
	 {return ((String) Debug.delegate(ba, "setnextfield", new Object[] {_field}));}
Object _o = null;
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=30277643;
 //BA.debugLineNum = 30277643;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
RDebugUtils.currentLine=30277644;
 //BA.debugLineNum = 30277644;BA.debugLine="mNextTextField = o";
__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/  = (b4j.example.b4xfloattextfield)(_o);
RDebugUtils.currentLine=30277645;
 //BA.debugLineNum = 30277645;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.b4xfloattextfield __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=29163524;
 //BA.debugLineNum = 29163524;BA.debugLine="mProps = Props";
__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/  = _props;
RDebugUtils.currentLine=29163525;
 //BA.debugLineNum = 29163525;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=29163526;
 //BA.debugLineNum = 29163526;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=29163527;
 //BA.debugLineNum = 29163527;BA.debugLine="iv.Initialize(\"HintImageView\")";
_iv.Initialize(ba,"HintImageView");
RDebugUtils.currentLine=29163528;
 //BA.debugLineNum = 29163528;BA.debugLine="HintImageView = iv";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=29163529;
 //BA.debugLineNum = 29163529;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
__ref._keyboardtype /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
RDebugUtils.currentLine=29163531;
 //BA.debugLineNum = 29163531;BA.debugLine="ToolTip = lbl.TooltipText";
__ref._tooltip /*String*/  = _lbl.getTooltipText();
RDebugUtils.currentLine=29163532;
 //BA.debugLineNum = 29163532;BA.debugLine="Dim jo As JavaObject = HintImageView";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=29163533;
 //BA.debugLineNum = 29163533;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=29163535;
 //BA.debugLineNum = 29163535;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
__ref._hintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HintColor")));
RDebugUtils.currentLine=29163536;
 //BA.debugLineNum = 29163536;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
__ref._nonfocusedhintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
RDebugUtils.currentLine=29163538;
 //BA.debugLineNum = 29163538;BA.debugLine="HintText = Props.Get(\"Hint\")";
__ref._hinttext /*String*/  = BA.ObjectToString(_props.Get((Object)("Hint")));
RDebugUtils.currentLine=29163539;
 //BA.debugLineNum = 29163539;BA.debugLine="HintFont = PassedLabel.Font";
__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _passedlabel.getFont();
RDebugUtils.currentLine=29163540;
 //BA.debugLineNum = 29163540;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
RDebugUtils.currentLine=29163541;
 //BA.debugLineNum = 29163541;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
__ref._multiline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
RDebugUtils.currentLine=29163542;
 //BA.debugLineNum = 29163542;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && __ref._multiline /*boolean*/ ) { 
RDebugUtils.currentLine=29163543;
 //BA.debugLineNum = 29163543;BA.debugLine="Multiline = False";
__ref._multiline /*boolean*/  = __c.False;
RDebugUtils.currentLine=29163544;
 //BA.debugLineNum = 29163544;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.LogImpl("929163544","Multiline not supported with password mode.",0);
 };
RDebugUtils.currentLine=29163546;
 //BA.debugLineNum = 29163546;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
__ref._createtextfieldall /*String*/ (null,_passwordmode,_passedlabel.getFont(),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor())));
RDebugUtils.currentLine=29163548;
 //BA.debugLineNum = 29163548;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=29163549;
 //BA.debugLineNum = 29163549;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=29163550;
 //BA.debugLineNum = 29163550;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=29163551;
 //BA.debugLineNum = 29163551;BA.debugLine="MeasuringCanvas.Initialize(p)";
__ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=29163552;
 //BA.debugLineNum = 29163552;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=29163553;
 //BA.debugLineNum = 29163553;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=29163554;
 //BA.debugLineNum = 29163554;BA.debugLine="CreateRevealButton";
__ref._createrevealbutton /*String*/ (null);
 }else {
RDebugUtils.currentLine=29163556;
 //BA.debugLineNum = 29163556;BA.debugLine="CreateClearButton";
__ref._createclearbutton /*String*/ (null);
 };
RDebugUtils.currentLine=29163558;
 //BA.debugLineNum = 29163558;BA.debugLine="CreateAcceptButton";
__ref._createacceptbutton /*String*/ (null);
RDebugUtils.currentLine=29163559;
 //BA.debugLineNum = 29163559;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=29163560;
 //BA.debugLineNum = 29163560;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xfloattextfield  _getnextfield(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "getnextfield", true))
	 {return ((b4j.example.b4xfloattextfield) Debug.delegate(ba, "getnextfield", null));}
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="Return mNextTextField";
if (true) return __ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ ;
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="End Sub";
return null;
}
public String  _gettext(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Return mTextField.Text";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _gettextfield(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "gettextfield", null));}
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Public Sub getTextField As B4XView";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Return mTextField";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "ime_handleaction", true))
	 {return ((Boolean) Debug.delegate(ba, "ime_handleaction", null));}
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Private Sub ime_HandleAction As Boolean";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=30343172;
 //BA.debugLineNum = 30343172;BA.debugLine="End Sub";
return false;
}
public String  _tf_enterpressed(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tf_enterpressed", null));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Private Sub tf_EnterPressed";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="tf_Action";
__ref._tf_action /*String*/ (null);
RDebugUtils.currentLine=30408710;
 //BA.debugLineNum = 30408710;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xfloattextfield __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="HintLabelLargeOffsetX = 6dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (6));
 }else {
RDebugUtils.currentLine=29097990;
 //BA.debugLineNum = 29097990;BA.debugLine="HintLabelLargeOffsetX = 12dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (12));
 };
RDebugUtils.currentLine=29097996;
 //BA.debugLineNum = 29097996;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=29097997;
 //BA.debugLineNum = 29097997;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=29097999;
 //BA.debugLineNum = 29097999;BA.debugLine="End Sub";
return "";
}
public String  _lc_click(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_click", true))
	 {return ((String) Debug.delegate(ba, "lc_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Private Sub lc_Click";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="setText(\"\")";
__ref._settext /*String*/ (null,"");
 break; }
case 1: {
RDebugUtils.currentLine=30670854;
 //BA.debugLineNum = 30670854;BA.debugLine="SwitchFromPasswordToRegular (True)";
__ref._switchfrompasswordtoregular /*String*/ (null,__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=30670856;
 //BA.debugLineNum = 30670856;BA.debugLine="SwitchFromPasswordToRegular(False)";
__ref._switchfrompasswordtoregular /*String*/ (null,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=30670858;
 //BA.debugLineNum = 30670858;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=30670859;
 //BA.debugLineNum = 30670859;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()==__c.False || (__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ ).equals((b4j.example.b4xfloattextfield)(this))) { 
RDebugUtils.currentLine=30670863;
 //BA.debugLineNum = 30670863;BA.debugLine="mTextField.Parent.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().RequestFocus();
 };
 break; }
}
;
RDebugUtils.currentLine=30670867;
 //BA.debugLineNum = 30670867;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4j.example.b4xfloattextfield __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_s}));}
String _old = "";
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Public Sub setText(s As String)";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="mTextField.Text = s";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_s);
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="End Sub";
return "";
}
public String  _switchfrompasswordtoregular(b4j.example.b4xfloattextfield __ref,boolean _toregular) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "switchfrompasswordtoregular", true))
	 {return ((String) Debug.delegate(ba, "switchfrompasswordtoregular", new Object[] {_toregular}));}
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _oldfield = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf = null;
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Private Sub SwitchFromPasswordToRegular (ToRegular";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="Dim text As String = mTextField.Text";
_text = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_font1 = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="Dim oldfield As B4XView = mTextField";
_oldfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
_oldfield = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=29491206;
 //BA.debugLineNum = 29491206;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
__ref._createtextfieldall /*String*/ (null,__c.Not(_toregular),_font1,_textcolor);
RDebugUtils.currentLine=29491207;
 //BA.debugLineNum = 29491207;BA.debugLine="mTextField.Text = text";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=29491208;
 //BA.debugLineNum = 29491208;BA.debugLine="If lblClear.IsInitialized Then";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29491209;
 //BA.debugLineNum = 29491209;BA.debugLine="If ToRegular = False Then";
if (_toregular==__c.False) { 
RDebugUtils.currentLine=29491210;
 //BA.debugLineNum = 29491210;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=29491211;
 //BA.debugLineNum = 29491211;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
 }else {
RDebugUtils.currentLine=29491213;
 //BA.debugLineNum = 29491213;BA.debugLine="lblClear.Tag = \"hide\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("hide"));
RDebugUtils.currentLine=29491214;
 //BA.debugLineNum = 29491214;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xe8f5))));
 };
RDebugUtils.currentLine=29491216;
 //BA.debugLineNum = 29491216;BA.debugLine="lblClear.BringToFront";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
 };
RDebugUtils.currentLine=29491218;
 //BA.debugLineNum = 29491218;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();};
RDebugUtils.currentLine=29491219;
 //BA.debugLineNum = 29491219;BA.debugLine="HintImageView.BringToFront";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=29491220;
 //BA.debugLineNum = 29491220;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=29491222;
 //BA.debugLineNum = 29491222;BA.debugLine="Dim tf As TextField = mTextField";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_tf = (anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper(), (javafx.scene.control.TextField)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=29491223;
 //BA.debugLineNum = 29491223;BA.debugLine="tf.SetSelection(mTextField.Text.Length, mTextFiel";
_tf.SetSelection(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length(),__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length());
RDebugUtils.currentLine=29491228;
 //BA.debugLineNum = 29491228;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now";
__ref._lastswitchtextfieldtime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=29491229;
 //BA.debugLineNum = 29491229;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=29491230;
 //BA.debugLineNum = 29491230;BA.debugLine="oldfield.RemoveViewFromParent";
_oldfield.RemoveViewFromParent();
RDebugUtils.currentLine=29491240;
 //BA.debugLineNum = 29491240;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Passwo";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(int) (1))) { 
RDebugUtils.currentLine=29491241;
 //BA.debugLineNum = 29491241;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Passwo";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(Object)(_toregular));
 };
RDebugUtils.currentLine=29491243;
 //BA.debugLineNum = 29491243;BA.debugLine="End Sub";
return "";
}
public String  _lc_mouseclicked(b4j.example.b4xfloattextfield __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lc_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Private Sub lc_MouseClicked(EventData As MouseEven";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="lc_Click";
__ref._lc_click /*String*/ (null);
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="End Sub";
return "";
}
public String  _lc_mousepressed(b4j.example.b4xfloattextfield __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_mousepressed", true))
	 {return ((String) Debug.delegate(ba, "lc_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Private Sub lc_MousePressed (EventData As MouseEve";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="End Sub";
return "";
}
public String  _lc_mousereleased(b4j.example.b4xfloattextfield __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_mousereleased", true))
	 {return ((String) Debug.delegate(ba, "lc_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Private Sub lc_MouseReleased(EventData As MouseEve";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="End Sub";
return "";
}
public String  _requestfocusandshowkeyboard(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "requestfocusandshowkeyboard", true))
	 {return ((String) Debug.delegate(ba, "requestfocusandshowkeyboard", null));}
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="End Sub";
return "";
}
public String  _tf_action(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_action", true))
	 {return ((String) Debug.delegate(ba, "tf_action", null));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Private Sub tf_Action";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ .IsInitialized /*boolean*/ () && (__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ ).equals((b4j.example.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="mNextTextField.TextField.RequestFocus";
__ref._mnexttextfield /*b4j.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
 };
RDebugUtils.currentLine=30081028;
 //BA.debugLineNum = 30081028;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed",(int) (0))) { 
RDebugUtils.currentLine=30081029;
 //BA.debugLineNum = 30081029;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed");
 };
RDebugUtils.currentLine=30081031;
 //BA.debugLineNum = 30081031;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_beginedit", true))
	 {return ((String) Debug.delegate(ba, "tf_beginedit", null));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Private Sub tf_BeginEdit";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="tf_FocusChanged(True)";
__ref._tf_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(b4j.example.b4xfloattextfield __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "tf_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Focused = HasFocus";
__ref._focused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=29753347;
 //BA.debugLineNum = 29753347;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_FocusC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
RDebugUtils.currentLine=29753348;
 //BA.debugLineNum = 29753348;BA.debugLine="If LastSwitchTextFieldTime + 100 < DateTime.Now";
if (__ref._lastswitchtextfieldtime /*long*/ +100<__c.DateTime.getNow()) { 
RDebugUtils.currentLine=29753349;
 //BA.debugLineNum = 29753349;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Focus";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__ref._focused /*boolean*/ ));
 };
 };
RDebugUtils.currentLine=29753352;
 //BA.debugLineNum = 29753352;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit(b4j.example.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_endedit", true))
	 {return ((String) Debug.delegate(ba, "tf_endedit", null));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Private Sub tf_EndEdit";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="tf_FocusChanged(False)";
__ref._tf_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(b4j.example.b4xfloattextfield __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_textchanged", true))
	 {return ((String) Debug.delegate(ba, "tf_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="UpdateLabel(New, False)";
__ref._updatelabel /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(int) (2)) && __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(Object)(_old),(Object)(_new));
 };
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}