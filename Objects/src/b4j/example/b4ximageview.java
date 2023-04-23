package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4ximageview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4ximageview.class).invoke(this, new Object[] {null});
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
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public int _mcornersradius = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4j.example.b4ximageview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
RDebugUtils.currentLine=31719429;
 //BA.debugLineNum = 31719429;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(__ref._mresizemode /*String*/ ,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
RDebugUtils.currentLine=31719431;
 //BA.debugLineNum = 31719431;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=31719432;
 //BA.debugLineNum = 31719432;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=31719434;
 //BA.debugLineNum = 31719434;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=31719435;
 //BA.debugLineNum = 31719435;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=31719436;
 //BA.debugLineNum = 31719436;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 2: {
RDebugUtils.currentLine=31719438;
 //BA.debugLineNum = 31719438;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=31719439;
 //BA.debugLineNum = 31719439;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
RDebugUtils.currentLine=31719441;
 //BA.debugLineNum = 31719441;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31719442;
 //BA.debugLineNum = 31719442;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
RDebugUtils.currentLine=31719444;
 //BA.debugLineNum = 31719444;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=31719445;
 //BA.debugLineNum = 31719445;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=31719446;
 //BA.debugLineNum = 31719446;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 5: {
RDebugUtils.currentLine=31719448;
 //BA.debugLineNum = 31719448;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth());
RDebugUtils.currentLine=31719449;
 //BA.debugLineNum = 31719449;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
 break; }
default: {
RDebugUtils.currentLine=31719451;
 //BA.debugLineNum = 31719451;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("931719451","Invalid resize mode: "+__ref._mresizemode /*String*/ ,0);
 break; }
}
;
RDebugUtils.currentLine=31719453;
 //BA.debugLineNum = 31719453;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_imageviewwidth/(double)2),__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_imageviewheight/(double)2),__c.Round(_imageviewwidth),__c.Round(_imageviewheight));
RDebugUtils.currentLine=31719454;
 //BA.debugLineNum = 31719454;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31064068;
 //BA.debugLineNum = 31064068;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=31064069;
 //BA.debugLineNum = 31064069;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=31064070;
 //BA.debugLineNum = 31064070;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31064071;
 //BA.debugLineNum = 31064071;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
RDebugUtils.currentLine=31064072;
 //BA.debugLineNum = 31064072;BA.debugLine="Private mRound As Boolean";
_mround = false;
RDebugUtils.currentLine=31064073;
 //BA.debugLineNum = 31064073;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=31064074;
 //BA.debugLineNum = 31064074;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
RDebugUtils.currentLine=31064075;
 //BA.debugLineNum = 31064075;BA.debugLine="Private mCornersRadius As Int";
_mcornersradius = 0;
RDebugUtils.currentLine=31064076;
 //BA.debugLineNum = 31064076;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="mBitmap = Null";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="iv.SetBitmap(Null)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.b4ximageview __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=31195140;
 //BA.debugLineNum = 31195140;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=31195141;
 //BA.debugLineNum = 31195141;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=31195142;
 //BA.debugLineNum = 31195142;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=31195143;
 //BA.debugLineNum = 31195143;BA.debugLine="mRound =Props.Get(\"Round\")";
__ref._mround /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Round")));
RDebugUtils.currentLine=31195144;
 //BA.debugLineNum = 31195144;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
__ref._mresizemode /*String*/  = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
RDebugUtils.currentLine=31195145;
 //BA.debugLineNum = 31195145;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
__ref._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=31195146;
 //BA.debugLineNum = 31195146;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
__ref._mcornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
RDebugUtils.currentLine=31195147;
 //BA.debugLineNum = 31195147;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31195148;
 //BA.debugLineNum = 31195148;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=31195149;
 //BA.debugLineNum = 31195149;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="Return mBitmap";
if (true) return __ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="End Sub";
return null;
}
public int  _getcornersradius(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getcornersradius", true))
	 {return ((Integer) Debug.delegate(ba, "getcornersradius", null));}
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Public Sub getCornersRadius As Int";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="Return mCornersRadius";
if (true) return __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="End Sub";
return 0;
}
public String  _getresizemode(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getresizemode", true))
	 {return ((String) Debug.delegate(ba, "getresizemode", null));}
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Public Sub getResizeMode As String";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Return mResizeMode";
if (true) return __ref._mresizemode /*String*/ ;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getroundedimage", true))
	 {return ((Boolean) Debug.delegate(ba, "getroundedimage", null));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Public Sub getRoundedImage As Boolean";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="Return mRound";
if (true) return __ref._mround /*boolean*/ ;
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.b4ximageview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="End Sub";
return "";
}
public String  _load(b4j.example.b4ximageview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "load", true))
	 {return ((String) Debug.delegate(ba, "load", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="setBitmap(xui.LoadBitmap(Dir, FileName))";
__ref._setbitmap /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename));
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4j.example.b4ximageview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="mBitmap = Bmp";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="End Sub";
return "";
}
public String  _setcornersradius(b4j.example.b4ximageview __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setcornersradius", true))
	 {return ((String) Debug.delegate(ba, "setcornersradius", new Object[] {_i}));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Public Sub setCornersRadius (i As Int)";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="mCornersRadius = i";
__ref._mcornersradius /*int*/  = _i;
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="End Sub";
return "";
}
public String  _updateclip(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "updateclip", true))
	 {return ((String) Debug.delegate(ba, "updateclip", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _shape = null;
double _radius = 0;
double _cx = 0;
double _cy = 0;
double _d = 0;
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Private Sub UpdateClip";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,0,(int) (0),__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
 }else {
RDebugUtils.currentLine=32047108;
 //BA.debugLineNum = 32047108;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,0,(int) (0),__ref._mcornersradius /*int*/ );
 };
RDebugUtils.currentLine=32047111;
 //BA.debugLineNum = 32047111;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=32047112;
 //BA.debugLineNum = 32047112;BA.debugLine="Dim shape As JavaObject";
_shape = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=32047113;
 //BA.debugLineNum = 32047113;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=32047114;
 //BA.debugLineNum = 32047114;BA.debugLine="Dim radius As Double = Min(mBase.Width / 2, mBas";
_radius = __c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=32047115;
 //BA.debugLineNum = 32047115;BA.debugLine="Dim cx As Double = mBase.Width / 2";
_cx = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2;
RDebugUtils.currentLine=32047116;
 //BA.debugLineNum = 32047116;BA.debugLine="Dim cy As Double = mBase.Height / 2";
_cy = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2;
RDebugUtils.currentLine=32047117;
 //BA.debugLineNum = 32047117;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_cx),(Object)(_cy),(Object)(_radius)});
 }else {
RDebugUtils.currentLine=32047119;
 //BA.debugLineNum = 32047119;BA.debugLine="Dim cx As Double = mBase.Width";
_cx = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=32047120;
 //BA.debugLineNum = 32047120;BA.debugLine="Dim cy As Double = mBase.Height";
_cy = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=32047121;
 //BA.debugLineNum = 32047121;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Rectangle",new Object[]{(Object)(_cx),(Object)(_cy)});
RDebugUtils.currentLine=32047122;
 //BA.debugLineNum = 32047122;BA.debugLine="If mCornersRadius > 0 Then";
if (__ref._mcornersradius /*int*/ >0) { 
RDebugUtils.currentLine=32047123;
 //BA.debugLineNum = 32047123;BA.debugLine="Dim d As Double = mCornersRadius";
_d = __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=32047124;
 //BA.debugLineNum = 32047124;BA.debugLine="shape.RunMethod(\"setArcHeight\", Array(d))";
_shape.RunMethod("setArcHeight",new Object[]{(Object)(_d)});
RDebugUtils.currentLine=32047125;
 //BA.debugLineNum = 32047125;BA.debugLine="shape.RunMethod(\"setArcWidth\", Array(d))";
_shape.RunMethod("setArcWidth",new Object[]{(Object)(_d)});
 };
 };
RDebugUtils.currentLine=32047128;
 //BA.debugLineNum = 32047128;BA.debugLine="jo.RunMethod(\"setClip\", Array(shape))";
_jo.RunMethod("setClip",new Object[]{(Object)(_shape.getObject())});
RDebugUtils.currentLine=32047133;
 //BA.debugLineNum = 32047133;BA.debugLine="End Sub";
return "";
}
public String  _setresizemode(b4j.example.b4ximageview __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setresizemode", true))
	 {return ((String) Debug.delegate(ba, "setresizemode", new Object[] {_s}));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub setResizeMode(s As String)";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(__ref._mresizemode /*String*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="mResizeMode = s";
__ref._mresizemode /*String*/  = _s;
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(b4j.example.b4ximageview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setroundedimage", true))
	 {return ((String) Debug.delegate(ba, "setroundedimage", new Object[] {_b}));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="If b = mRound Then Return";
if (_b==__ref._mround /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="mRound = b";
__ref._mround /*boolean*/  = _b;
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=31391748;
 //BA.debugLineNum = 31391748;BA.debugLine="End Sub";
return "";
}
}