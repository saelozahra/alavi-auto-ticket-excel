package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xradiobutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xradiobutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xradiobutton.class).invoke(this, new Object[] {null});
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
public int _oncolor = 0;
public int _offcolor = 0;
public b4j.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public boolean _mvalue = false;
public b4j.example.bcpath._bcbrush _transparent = null;
public int _loopindex = 0;
public Object _tag = null;
public b4j.example.bcpath._bcbrush _onbrush = null;
public b4j.example.bcpath._bcbrush _offbrush = null;
public boolean _menabled = false;
public boolean _mhaptic = false;
public int _size = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlabel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public float _scale = 0f;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4j.example.b4xradiobutton __ref,double _width1,double _height1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width1,_height1}));}
int _newsize = 0;
int _gap = 0;
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="Dim NewSize As Int = Max(5dip, Height1)";
_newsize = (int) (__c.Max(__c.DipToCurrent((int) (5)),_height1));
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="If NewSize = Size Then Return";
if (_newsize==__ref._size /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="Size = NewSize";
__ref._size /*int*/  = _newsize;
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="Dim gap As Int = 3dip";
_gap = __c.DipToCurrent((int) (3));
RDebugUtils.currentLine=36372486;
 //BA.debugLineNum = 36372486;BA.debugLine="bc.Initialize(NewSize - 2 * gap, NewSize - 2 * ga";
__ref._bc /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (_newsize-2*_gap),(int) (_newsize-2*_gap));
RDebugUtils.currentLine=36372487;
 //BA.debugLineNum = 36372487;BA.debugLine="Scale = xui.Scale";
__ref._scale /*float*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=36372492;
 //BA.debugLineNum = 36372492;BA.debugLine="iv.SetLayoutAnimated(0, gap, gap, Size - 2 * gap,";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_gap,_gap,__ref._size /*int*/ -2*_gap,__ref._size /*int*/ -2*_gap);
RDebugUtils.currentLine=36372493;
 //BA.debugLineNum = 36372493;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width1, Height1)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width1,_height1);
RDebugUtils.currentLine=36372494;
 //BA.debugLineNum = 36372494;BA.debugLine="mLabel.SetLayoutAnimated(0, Size + gap, 0, Width1";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._size /*int*/ +_gap,0,_width1-__ref._size /*int*/ -_gap,_height1);
RDebugUtils.currentLine=36372495;
 //BA.debugLineNum = 36372495;BA.debugLine="OnBrush = bc.CreateBrushFromColor(OnColor)";
__ref._onbrush /*b4j.example.bcpath._bcbrush*/  = __ref._bc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._oncolor /*int*/ );
RDebugUtils.currentLine=36372496;
 //BA.debugLineNum = 36372496;BA.debugLine="OffBrush = bc.CreateBrushFromColor(OffColor)";
__ref._offbrush /*b4j.example.bcpath._bcbrush*/  = __ref._bc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._offcolor /*int*/ );
RDebugUtils.currentLine=36372497;
 //BA.debugLineNum = 36372497;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
__ref._transparent /*b4j.example.bcpath._bcbrush*/  = __ref._bc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=36372498;
 //BA.debugLineNum = 36372498;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=36372499;
 //BA.debugLineNum = 36372499;BA.debugLine="End Sub";
return "";
}
public void  _setvalueimpl(b4j.example.b4xradiobutton __ref,boolean _b,boolean _immediate) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setvalueimpl", true))
	 {Debug.delegate(ba, "setvalueimpl", new Object[] {_b,_immediate}); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,__ref,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4j.example.b4xradiobutton parent,b4j.example.b4xradiobutton __ref,boolean _b,boolean _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
this.__ref = parent;
}
b4j.example.b4xradiobutton __ref;
b4j.example.b4xradiobutton parent;
boolean _b;
boolean _immediate;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4j.example.b4xradiobutton _rb = null;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="mValue = b";
__ref._mvalue /*boolean*/  = _b;
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="If b = True Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_b==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=36503555;
 //BA.debugLineNum = 36503555;BA.debugLine="For i = 0 To mBase.Parent.NumberOfViews - 1";
if (true) break;

case 4:
//for
this.state = 11;
step3 = 1;
limit3 = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getNumberOfViews()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 6;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="Dim v As B4XView = mBase.Parent.GetView(i)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetView(_i);
RDebugUtils.currentLine=36503557;
 //BA.debugLineNum = 36503557;BA.debugLine="If v <> mBase And v.Tag Is B4XRadioButton Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_v).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false && _v.getTag() instanceof b4j.example.b4xradiobutton) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="Dim rb As B4XRadioButton = v.Tag";
_rb = (b4j.example.b4xradiobutton)(_v.getTag());
RDebugUtils.currentLine=36503559;
 //BA.debugLineNum = 36503559;BA.debugLine="rb.Checked = False";
_rb._setchecked /*boolean*/ (null,parent.__c.False);
 if (true) break;

case 10:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=36503563;
 //BA.debugLineNum = 36503563;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=36503564;
 //BA.debugLineNum = 36503564;BA.debugLine="If Immediate Then";
if (true) break;

case 13:
//if
this.state = 53;
if (_immediate) { 
this.state = 15;
}else {
this.state = 25;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=36503565;
 //BA.debugLineNum = 36503565;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 16:
//if
this.state = 23;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 18;
;}
else {
this.state = 20;
;}if (true) break;

case 18:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 20:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 23:
//C
this.state = 53;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=36503567;
 //BA.debugLineNum = 36503567;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=36503568;
 //BA.debugLineNum = 36503568;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=36503569;
 //BA.debugLineNum = 36503569;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
RDebugUtils.currentLine=36503570;
 //BA.debugLineNum = 36503570;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 26:
//do while
this.state = 41;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=36503571;
 //BA.debugLineNum = 36503571;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
RDebugUtils.currentLine=36503572;
 //BA.debugLineNum = 36503572;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 29:
//if
this.state = 34;
if (__ref._mvalue /*boolean*/ ==parent.__c.False) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_state1 = (float) (1-_state1);
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=36503573;
 //BA.debugLineNum = 36503573;BA.debugLine="Draw(state1)";
__ref._draw /*String*/ (null,_state1);
RDebugUtils.currentLine=36503574;
 //BA.debugLineNum = 36503574;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xradiobutton", "setvalueimpl"),(int) (16));
this.state = 61;
return;
case 61:
//C
this.state = 35;
;
RDebugUtils.currentLine=36503575;
 //BA.debugLineNum = 36503575;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 35:
//if
this.state = 40;
if (_myindex!=__ref._loopindex /*int*/ ) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
this.state = 41;
if (true) break;
if (true) break;

case 40:
//C
this.state = 26;
;
 if (true) break;
;
RDebugUtils.currentLine=36503577;
 //BA.debugLineNum = 36503577;BA.debugLine="If MyIndex = LoopIndex Then";

case 41:
//if
this.state = 52;
if (_myindex==__ref._loopindex /*int*/ ) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=36503578;
 //BA.debugLineNum = 36503578;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 44:
//if
this.state = 51;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 46;
;}
else {
this.state = 48;
;}if (true) break;

case 46:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 48:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
RDebugUtils.currentLine=36503581;
 //BA.debugLineNum = 36503581;BA.debugLine="If mEnabled Then";

case 53:
//if
this.state = 58;
if (__ref._menabled /*boolean*/ ) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
RDebugUtils.currentLine=36503582;
 //BA.debugLineNum = 36503582;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
parent._xuiviewsutils._setalpha /*String*/ (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (1));
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=36503584;
 //BA.debugLineNum = 36503584;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.4)";
parent._xuiviewsutils._setalpha /*String*/ (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (0.4));
 if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=36503587;
 //BA.debugLineNum = 36503587;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="Public OnColor, OffColor As Int";
_oncolor = 0;
_offcolor = 0;
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="Private mValue As Boolean";
_mvalue = false;
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="Private transparent As BCBrush";
_transparent = new b4j.example.bcpath._bcbrush();
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=36175883;
 //BA.debugLineNum = 36175883;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=36175884;
 //BA.debugLineNum = 36175884;BA.debugLine="Private OnBrush, OffBrush As BCBrush";
_onbrush = new b4j.example.bcpath._bcbrush();
_offbrush = new b4j.example.bcpath._bcbrush();
RDebugUtils.currentLine=36175885;
 //BA.debugLineNum = 36175885;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=36175886;
 //BA.debugLineNum = 36175886;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=36175887;
 //BA.debugLineNum = 36175887;BA.debugLine="Private Size As Int";
_size = 0;
RDebugUtils.currentLine=36175888;
 //BA.debugLineNum = 36175888;BA.debugLine="Public mLabel As B4XView";
_mlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36175889;
 //BA.debugLineNum = 36175889;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36175890;
 //BA.debugLineNum = 36175890;BA.debugLine="Private Scale As Float 'ignore";
_scale = 0f;
RDebugUtils.currentLine=36175891;
 //BA.debugLineNum = 36175891;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.b4xradiobutton __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=36306948;
 //BA.debugLineNum = 36306948;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=36306949;
 //BA.debugLineNum = 36306949;BA.debugLine="pnl.Color = xui.Color_Transparent";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=36306950;
 //BA.debugLineNum = 36306950;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=36306951;
 //BA.debugLineNum = 36306951;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=36306952;
 //BA.debugLineNum = 36306952;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=36306953;
 //BA.debugLineNum = 36306953;BA.debugLine="mBase.AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=36306954;
 //BA.debugLineNum = 36306954;BA.debugLine="mLabel = Lbl";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=36306955;
 //BA.debugLineNum = 36306955;BA.debugLine="mLabel.SetTextAlignment(\"CENTER\", \"LEFT\")";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=36306956;
 //BA.debugLineNum = 36306956;BA.debugLine="mBase.AddView(mLabel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=36306957;
 //BA.debugLineNum = 36306957;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=36306959;
 //BA.debugLineNum = 36306959;BA.debugLine="OnColor = xui.PaintOrColorToColor(Props.Get(\"OnCo";
__ref._oncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OnColor")));
RDebugUtils.currentLine=36306960;
 //BA.debugLineNum = 36306960;BA.debugLine="OffColor = xui.PaintOrColorToColor(Props.Get(\"Off";
__ref._offcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OffColor")));
RDebugUtils.currentLine=36306961;
 //BA.debugLineNum = 36306961;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=36306963;
 //BA.debugLineNum = 36306963;BA.debugLine="mEnabled = mBase.Enabled";
__ref._menabled /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=36306964;
 //BA.debugLineNum = 36306964;BA.debugLine="mBase.Enabled = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=36306965;
 //BA.debugLineNum = 36306965;BA.debugLine="mValue = Props.Get(\"Value\")";
__ref._mvalue /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Value")));
RDebugUtils.currentLine=36306966;
 //BA.debugLineNum = 36306966;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=36306967;
 //BA.debugLineNum = 36306967;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4j.example.b4xradiobutton __ref,float _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_state}));}
float _r = 0f;
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Private Sub Draw (State As Float)";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
__ref._bc /*b4j.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4j.example.bitmapcreator*/ ._targetrect,__ref._transparent /*b4j.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="Dim r As Float = Floor(bc.mHeight / 2)";
_r = (float) (__c.Floor(__ref._bc /*b4j.example.bitmapcreator*/ ._mheight/(double)2));
RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="If State < 1 Then bc.DrawCircle2(r, r, r, OffBrus";
if (_state<1) { 
__ref._bc /*b4j.example.bitmapcreator*/ ._drawcircle2(_r,_r,_r,__ref._offbrush /*b4j.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="If State > 0 Then bc.DrawCircle2(r, r, r * State,";
if (_state>0) { 
__ref._bc /*b4j.example.bitmapcreator*/ ._drawcircle2(_r,_r,(float) (_r*_state),__ref._onbrush /*b4j.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4j.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4j.example.bitmapcreator*/ ._getbitmap(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=36831238;
 //BA.debugLineNum = 36831238;BA.debugLine="End Sub";
return "";
}
public boolean  _getchecked(b4j.example.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getchecked", true))
	 {return ((Boolean) Debug.delegate(ba, "getchecked", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Public Sub getChecked As Boolean";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*boolean*/ ;
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="End Sub";
return false;
}
public boolean  _getenabled(b4j.example.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="End Sub";
return false;
}
public Object  _gettext(b4j.example.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((Object) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Public Sub getText As Object";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="Return mLabel.Text";
if (true) return (Object)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.b4xradiobutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mouseclicked(b4j.example.b4xradiobutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "pnl_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "pnl_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Private Sub Pnl_MouseClicked (EventData As MouseEv";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="If mValue Then Return";
if (__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="SetValueImpl(Not(mValue), False)";
__ref._setvalueimpl /*void*/ (null,__c.Not(__ref._mvalue /*boolean*/ ),__c.False);
RDebugUtils.currentLine=36438025;
 //BA.debugLineNum = 36438025;BA.debugLine="If mValue And xui.SubExists(mCallBack, mEventNam";
if (__ref._mvalue /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked",(int) (0))) { 
RDebugUtils.currentLine=36438026;
 //BA.debugLineNum = 36438026;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked");
 };
 };
RDebugUtils.currentLine=36438029;
 //BA.debugLineNum = 36438029;BA.debugLine="End Sub";
return "";
}
public String  _setchecked(b4j.example.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setchecked", true))
	 {return ((String) Debug.delegate(ba, "setchecked", new Object[] {_b}));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub setChecked(b As Boolean)";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="If b = mValue Then Return";
if (_b==__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="SetValueImpl(b, False)";
__ref._setvalueimpl /*void*/ (null,_b,__c.False);
RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4j.example.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Public Sub setEnabled (b As Boolean)";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=36700163;
 //BA.debugLineNum = 36700163;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4j.example.b4xradiobutton __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Public Sub setText (t As Object)";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(mLabel, t";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="End Sub";
return "";
}
}