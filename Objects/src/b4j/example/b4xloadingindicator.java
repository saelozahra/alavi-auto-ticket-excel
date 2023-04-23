package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xloadingindicator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xloadingindicator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xloadingindicator.class).invoke(this, new Object[] {null});
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
public int _clr = 0;
public int _index = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _duration = 0;
public String _drawingsubname = "";
public Object _tag = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4j.example.b4xloadingindicator __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="End Sub";
return "";
}
public void  _mainloop(b4j.example.b4xloadingindicator __ref) throws Exception{
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "mainloop", true))
	 {Debug.delegate(ba, "mainloop", null); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4j.example.b4xloadingindicator parent,b4j.example.b4xloadingindicator __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xloadingindicator __ref;
b4j.example.b4xloadingindicator parent;
int _myindex = 0;
long _n = 0L;
float _progress = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xloadingindicator";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="Dim MyIndex As Int = index";
_myindex = __ref._index /*int*/ ;
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="Do While MyIndex = index";
if (true) break;

case 1:
//do while
this.state = 4;
while (_myindex==__ref._index /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / dur";
_progress = (float) ((parent.__c.DateTime.getNow()-_n)/(double)__ref._duration /*int*/ );
RDebugUtils.currentLine=33751046;
 //BA.debugLineNum = 33751046;BA.debugLine="progress = progress - Floor(progress)";
_progress = (float) (_progress-parent.__c.Floor(_progress));
RDebugUtils.currentLine=33751047;
 //BA.debugLineNum = 33751047;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=33751048;
 //BA.debugLineNum = 33751048;BA.debugLine="CallSub2(Me, DrawingSubName, progress)";
parent.__c.CallSubDebug2(ba,parent,__ref._drawingsubname /*String*/ ,(Object)(_progress));
RDebugUtils.currentLine=33751049;
 //BA.debugLineNum = 33751049;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=33751050;
 //BA.debugLineNum = 33751050;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xloadingindicator", "mainloop"),(int) (10));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=33751052;
 //BA.debugLineNum = 33751052;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33488900;
 //BA.debugLineNum = 33488900;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=33488901;
 //BA.debugLineNum = 33488901;BA.debugLine="Private clr As Int";
_clr = 0;
RDebugUtils.currentLine=33488902;
 //BA.debugLineNum = 33488902;BA.debugLine="Private index As Int";
_index = 0;
RDebugUtils.currentLine=33488903;
 //BA.debugLineNum = 33488903;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=33488904;
 //BA.debugLineNum = 33488904;BA.debugLine="Private duration As Int";
_duration = 0;
RDebugUtils.currentLine=33488905;
 //BA.debugLineNum = 33488905;BA.debugLine="Private DrawingSubName As String";
_drawingsubname = "";
RDebugUtils.currentLine=33488906;
 //BA.debugLineNum = 33488906;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=33488907;
 //BA.debugLineNum = 33488907;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.b4xloadingindicator __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _style = "";
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="clr = xui.PaintOrColorToColor(Props.Get(\"Color\"";
__ref._clr /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color")));
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="Dim style As String= Props.Get(\"IndicatorStyle\")";
_style = BA.ObjectToString(_props.Get((Object)("IndicatorStyle")));
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="Dim duration As Int = Props.Get(\"Duration\")";
_duration = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=33619974;
 //BA.debugLineNum = 33619974;BA.debugLine="DrawingSubName = \"Draw_\" & style.Replace(\" \", \"\")";
__ref._drawingsubname /*String*/  = "Draw_"+_style.replace(" ","");
RDebugUtils.currentLine=33619975;
 //BA.debugLineNum = 33619975;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=33619976;
 //BA.debugLineNum = 33619976;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=33619977;
 //BA.debugLineNum = 33619977;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc1(b4j.example.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_arc1", true))
	 {return ((String) Debug.delegate(ba, "draw_arc1", new Object[] {_progress}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Private Sub Draw_Arc1 (Progress As Float)";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=34275331;
 //BA.debugLineNum = 34275331;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
RDebugUtils.currentLine=34275332;
 //BA.debugLineNum = 34275332;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
RDebugUtils.currentLine=34275334;
 //BA.debugLineNum = 34275334;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (-(1-_progress)*2*360));
 };
RDebugUtils.currentLine=34275336;
 //BA.debugLineNum = 34275336;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=34275337;
 //BA.debugLineNum = 34275337;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._clr /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=34275338;
 //BA.debugLineNum = 34275338;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=34275339;
 //BA.debugLineNum = 34275339;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc2(b4j.example.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_arc2", true))
	 {return ((String) Debug.delegate(ba, "draw_arc2", new Object[] {_progress}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Private Sub Draw_Arc2 (Progress As Float)";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=34340867;
 //BA.debugLineNum = 34340867;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
RDebugUtils.currentLine=34340868;
 //BA.debugLineNum = 34340868;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
RDebugUtils.currentLine=34340870;
 //BA.debugLineNum = 34340870;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (360-(_progress-0.5)*2*360));
 };
RDebugUtils.currentLine=34340872;
 //BA.debugLineNum = 34340872;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=34340873;
 //BA.debugLineNum = 34340873;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._clr /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=34340874;
 //BA.debugLineNum = 34340874;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=34340875;
 //BA.debugLineNum = 34340875;BA.debugLine="End Sub";
return "";
}
public String  _draw_fivelines1(b4j.example.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_fivelines1", true))
	 {return ((String) Debug.delegate(ba, "draw_fivelines1", new Object[] {_progress}));}
int _minr = 0;
int _maxr = 0;
int _dx = 0;
int _i = 0;
float _r = 0f;
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Private Sub Draw_FiveLines1(Progress As Float)";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="Dim MinR As Int = 10dip";
_minr = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Height / 2";
_maxr = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)2);
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
_dx = (int) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()-__c.DipToCurrent((int) (2)))/(double)5);
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="For i = 0 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=34209797;
 //BA.debugLineNum = 34209797;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-30*_i));
RDebugUtils.currentLine=34209798;
 //BA.debugLineNum = 34209798;BA.debugLine="cvs.DrawLine(2dip + i * dx, cvs.TargetRect.Cente";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r),(float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r),__ref._clr /*int*/ ,(float) (__c.DipToCurrent((int) (4))));
 }
};
RDebugUtils.currentLine=34209800;
 //BA.debugLineNum = 34209800;BA.debugLine="End Sub";
return "";
}
public String  _draw_pacman(b4j.example.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_pacman", true))
	 {return ((String) Debug.delegate(ba, "draw_pacman", new Object[] {_progress}));}
int _dotr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _cx = 0;
int _cy = 0;
int _r = 0;
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Private Sub Draw_PacMan(Progress As Float)";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Dim DotR As Int = 5dip";
_dotr = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.Width - DotR - Prog";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()-_dotr-_progress*(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (10)))),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_dotr),__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (255-200*_progress)),__c.True,(float) (0));
RDebugUtils.currentLine=34406403;
 //BA.debugLineNum = 34406403;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=34406404;
 //BA.debugLineNum = 34406404;BA.debugLine="Dim angle As Int = 70 * SinD(Progress * 180)";
_angle = (int) (70*__c.SinD(_progress*180));
RDebugUtils.currentLine=34406405;
 //BA.debugLineNum = 34406405;BA.debugLine="Dim cx As Int = cvs.TargetRect.CenterX - 5dip";
_cx = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=34406406;
 //BA.debugLineNum = 34406406;BA.debugLine="Dim cy As Int = cvs.TargetRect.CenterY";
_cy = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY());
RDebugUtils.currentLine=34406407;
 //BA.debugLineNum = 34406407;BA.debugLine="Dim r As Int = cvs.TargetRect.CenterY - 5dip";
_r = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=34406408;
 //BA.debugLineNum = 34406408;BA.debugLine="If angle = 0 Then";
if (_angle==0) { 
RDebugUtils.currentLine=34406409;
 //BA.debugLineNum = 34406409;BA.debugLine="cvs.DrawCircle(cx, cy, r, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_cx),(float) (_cy),(float) (_r),__ref._clr /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=34406411;
 //BA.debugLineNum = 34406411;BA.debugLine="p.InitializeArc(cx, cy , r, -angle / 2, -(360-an";
_p.InitializeArc((float) (_cx),(float) (_cy),(float) (_r),(float) (-_angle/(double)2),(float) (-(360-_angle)));
RDebugUtils.currentLine=34406412;
 //BA.debugLineNum = 34406412;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=34406413;
 //BA.debugLineNum = 34406413;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._clr /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=34406414;
 //BA.debugLineNum = 34406414;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
 };
RDebugUtils.currentLine=34406417;
 //BA.debugLineNum = 34406417;BA.debugLine="End Sub";
return "";
}
public int  _setalpha(b4j.example.b4xloadingindicator __ref,int _c,int _alpha) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "setalpha", true))
	 {return ((Integer) Debug.delegate(ba, "setalpha", new Object[] {_c,_alpha}));}
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
if (true) return (int) (__c.Bit.And(((int)0xffffff),_c)+__c.Bit.ShiftLeft(_alpha,(int) (24)));
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="End Sub";
return 0;
}
public String  _draw_singlecircle(b4j.example.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_singlecircle", true))
	 {return ((String) Debug.delegate(ba, "draw_singlecircle", new Object[] {_progress}));}
int _i = 0;
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Private Sub Draw_SingleCircle(Progress As Float)";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="For i = 0 To 2";
{
final int step1 = 1;
final int limit1 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Targe";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()*_progress),__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (255-255*_progress)),__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles1(b4j.example.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles1", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles1", new Object[] {_progress}));}
float _maxr = 0f;
float _r = 0f;
int _i = 0;
int _alpha = 0;
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Private Sub Draw_ThreeCircles1 (Progress As Float)";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
_maxr = (float) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2-__c.DipToCurrent((int) (20)))/(double)2);
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="Dim r As Float = 10dip + MaxR + MaxR * Sin(Progre";
_r = (float) (__c.DipToCurrent((int) (10))+_maxr+_maxr*__c.Sin(_progress*2*__c.cPI));
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
_alpha = (int) (_i*120+_progress*360);
RDebugUtils.currentLine=33947654;
 //BA.debugLineNum = 33947654;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=33947656;
 //BA.debugLineNum = 33947656;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles2(b4j.example.b4xloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles2", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles2", new Object[] {_progress}));}
int _minr = 0;
int _maxr = 0;
int _i = 0;
float _r = 0f;
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Private Sub Draw_ThreeCircles2 (Progress As Float)";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="Dim MinR As Int = 5dip";
_minr = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Width / 2 / 3 -";
_maxr = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2/(double)3-_minr-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=34013188;
 //BA.debugLineNum = 34013188;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-60*_i));
RDebugUtils.currentLine=34013189;
 //BA.debugLineNum = 34013189;BA.debugLine="cvs.DrawCircle(MaxR + MinR + (MinR + MaxR + 2dip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_maxr+_minr+(_minr+_maxr+__c.DipToCurrent((int) (2)))*2*_i),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,__ref._clr /*int*/ ,__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=34013191;
 //BA.debugLineNum = 34013191;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.b4xloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xloadingindicator __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.b4xloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xloadingindicator";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="mBase.Visible = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="End Sub";
return "";
}
}