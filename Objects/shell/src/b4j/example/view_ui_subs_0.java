package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class view_ui_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
view_ui._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",view_ui._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
view_ui._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",view_ui._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
view_ui._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",view_ui._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private txtName As TextField";
view_ui._txtname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtname",view_ui._txtname);
 //BA.debugLineNum = 7;BA.debugLine="Dim poCan As Canvas";
view_ui._pocan = RemoteObject.createNew ("anywheresoftware.b4j.objects.CanvasWrapper");__ref.setField("_pocan",view_ui._pocan);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (view_ui) ","view_ui",1,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "view_ui","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _shabnam = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
RemoteObject _bnameimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _usernameimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _fathernameimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _melliimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _shabnamriz = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
RemoteObject _shnimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _mablaghrilimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (Parent As Form)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="frm.Initialize(\"frm\", 551dip, 779dip)";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 551))))),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 779))))));
 BA.debugLineNum = 13;BA.debugLine="frm.Title = \"خروجی فرم\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("خروجی فرم"));
 BA.debugLineNum = 15;BA.debugLine="frm.SetFormStyle(\"UNDECORATED\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UNDECORATED")));
 BA.debugLineNum = 16;BA.debugLine="frm.RootPane.LoadLayout(\"view_ticket_layout\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("view_ticket_layout")));
 BA.debugLineNum = 17;BA.debugLine="frm.SetOwner(Parent)";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetOwner",(Object)(_parent));
 BA.debugLineNum = 19;BA.debugLine="frm.RootPane.Style =  \"-fx-background-image: url(";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"setStyle",RemoteObject.concat(RemoteObject.createImmutable("-fx-background-image: url('"),view_ui.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(view_ui.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("theme.png"))),RemoteObject.createImmutable("'); -fx-background-repeat: no-repeat; -fx-background-size: contain; -fx-background-position: center center;")));
 BA.debugLineNum = 20;BA.debugLine="Dim Shabnam As Font = fx.LoadFont(File.DirAssets,";
Debug.ShouldStop(524288);
_shabnam = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_shabnam = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadFont",(Object)(view_ui.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Shabnam.ttf")),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))))));Debug.locals.put("Shabnam", _shabnam);Debug.locals.put("Shabnam", _shabnam);
 BA.debugLineNum = 22;BA.debugLine="Dim BNameImg As Image = WrapDrawnText(frm.RootPan";
Debug.ShouldStop(2097152);
_bnameimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_bnameimg = __ref.runClassMethod (b4j.example.view_ui.class, "_wrapdrawntext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane")),(Object)(view_ui._main._bcname /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"DarkGray")),(Object)(_shabnam),(Object)(BA.ObjectToString("TOP_RIGHT")),(Object)(view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 202)))));Debug.locals.put("BNameImg", _bnameimg);Debug.locals.put("BNameImg", _bnameimg);
 BA.debugLineNum = 23;BA.debugLine="poCan.DrawImage(BNameImg, 98dip, 160dip, BNameImg";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pocan" /*RemoteObject*/ ).runVoidMethod ("DrawImage",(Object)((_bnameimg.getObject())),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 98))))),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160))))),(Object)(_bnameimg.runMethod(true,"getWidth")),(Object)(_bnameimg.runMethod(true,"getHeight")));
 BA.debugLineNum = 25;BA.debugLine="Dim UserNameImg As Image = WrapDrawnText(frm.Root";
Debug.ShouldStop(16777216);
_usernameimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_usernameimg = __ref.runClassMethod (b4j.example.view_ui.class, "_wrapdrawntext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane")),(Object)(view_ui._main._uname /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"DarkGray")),(Object)(_shabnam),(Object)(BA.ObjectToString("TOP_RIGHT")),(Object)(view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 195)))));Debug.locals.put("UserNameImg", _usernameimg);Debug.locals.put("UserNameImg", _usernameimg);
 BA.debugLineNum = 26;BA.debugLine="poCan.DrawImage(UserNameImg, 184dip, 230dip, User";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pocan" /*RemoteObject*/ ).runVoidMethod ("DrawImage",(Object)((_usernameimg.getObject())),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 184))))),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 230))))),(Object)(_usernameimg.runMethod(true,"getWidth")),(Object)(_usernameimg.runMethod(true,"getHeight")));
 BA.debugLineNum = 28;BA.debugLine="Dim FatherNameImg As Image = WrapDrawnText(frm.Ro";
Debug.ShouldStop(134217728);
_fathernameimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_fathernameimg = __ref.runClassMethod (b4j.example.view_ui.class, "_wrapdrawntext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane")),(Object)(view_ui._main._fathername /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"DarkGray")),(Object)(_shabnam),(Object)(BA.ObjectToString("TOP_RIGHT")),(Object)(view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 145)))));Debug.locals.put("FatherNameImg", _fathernameimg);Debug.locals.put("FatherNameImg", _fathernameimg);
 BA.debugLineNum = 29;BA.debugLine="poCan.DrawImage(FatherNameImg, 0dip, 228dip, Fath";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pocan" /*RemoteObject*/ ).runVoidMethod ("DrawImage",(Object)((_fathernameimg.getObject())),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 228))))),(Object)(_fathernameimg.runMethod(true,"getWidth")),(Object)(_fathernameimg.runMethod(true,"getHeight")));
 BA.debugLineNum = 31;BA.debugLine="Dim MelliImg As Image = WrapDrawnText(frm.RootPan";
Debug.ShouldStop(1073741824);
_melliimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_melliimg = __ref.runClassMethod (b4j.example.view_ui.class, "_wrapdrawntext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane")),(Object)(view_ui._main._mellicode /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"DarkGray")),(Object)(_shabnam),(Object)(BA.ObjectToString("TOP_RIGHT")),(Object)(view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));Debug.locals.put("MelliImg", _melliimg);Debug.locals.put("MelliImg", _melliimg);
 BA.debugLineNum = 32;BA.debugLine="poCan.DrawImage(MelliImg, 38dip, 265dip, MelliImg";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pocan" /*RemoteObject*/ ).runVoidMethod ("DrawImage",(Object)((_melliimg.getObject())),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 38))))),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 265))))),(Object)(_melliimg.runMethod(true,"getWidth")),(Object)(_melliimg.runMethod(true,"getHeight")));
 BA.debugLineNum = 34;BA.debugLine="Dim ShabnamRiz As Font = fx.LoadFont(File.DirAsse";
Debug.ShouldStop(2);
_shabnamriz = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_shabnamriz = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadFont",(Object)(view_ui.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Shabnam.ttf")),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 9))))));Debug.locals.put("ShabnamRiz", _shabnamriz);Debug.locals.put("ShabnamRiz", _shabnamriz);
 BA.debugLineNum = 35;BA.debugLine="Dim SHNImg As Image = WrapDrawnText(frm.RootPane,";
Debug.ShouldStop(4);
_shnimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_shnimg = __ref.runClassMethod (b4j.example.view_ui.class, "_wrapdrawntext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("شماره نامه:ح/"),view_ui._main._mellicode /*RemoteObject*/ .runMethod(true,"substring",(Object)(BA.numberCast(int.class, 3))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"Black")),(Object)(_shabnamriz),(Object)(BA.ObjectToString("TOP_RIGHT")),(Object)(view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));Debug.locals.put("SHNImg", _shnimg);Debug.locals.put("SHNImg", _shnimg);
 BA.debugLineNum = 36;BA.debugLine="poCan.DrawImage(SHNImg, 22dip, 54dip, SHNImg.Widt";
Debug.ShouldStop(8);
__ref.getField(false,"_pocan" /*RemoteObject*/ ).runVoidMethod ("DrawImage",(Object)((_shnimg.getObject())),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22))))),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 54))))),(Object)(_shnimg.runMethod(true,"getWidth")),(Object)(_shnimg.runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="Dim MablaghRilImg As Image = WrapDrawnText(frm.Ro";
Debug.ShouldStop(32);
_mablaghrilimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_mablaghrilimg = __ref.runClassMethod (b4j.example.view_ui.class, "_wrapdrawntext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane")),(Object)(view_ui._main._mablaghril /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"DarkGray")),(Object)(_shabnam),(Object)(BA.ObjectToString("TOP_RIGHT")),(Object)(view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))));Debug.locals.put("MablaghRilImg", _mablaghrilimg);Debug.locals.put("MablaghRilImg", _mablaghrilimg);
 BA.debugLineNum = 39;BA.debugLine="poCan.DrawImage(MablaghRilImg, 264dip, 370dip, Ma";
Debug.ShouldStop(64);
__ref.getField(false,"_pocan" /*RemoteObject*/ ).runVoidMethod ("DrawImage",(Object)((_mablaghrilimg.getObject())),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 264))))),(Object)(BA.numberCast(double.class, view_ui.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 370))))),(Object)(_mablaghrilimg.runMethod(true,"getWidth")),(Object)(_mablaghrilimg.runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="fx.Clipboard.SetImage(frm.RootPane.Snapshot)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Clipboard").runVoidMethod ("SetImage",(Object)((__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"Snapshot").getObject())));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pocan_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("poCan_MouseClicked (view_ui) ","view_ui",1,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("pocan_mouseclicked")) { return __ref.runUserSub(false, "view_ui","pocan_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 88;BA.debugLine="Public Sub poCan_MouseClicked (EventData As MouseE";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="frm.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pocan_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("poCan_MousePressed (view_ui) ","view_ui",1,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("pocan_mousepressed")) { return __ref.runUserSub(false, "view_ui","pocan_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 91;BA.debugLine="Public Sub poCan_MousePressed (EventData As MouseE";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="frm.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (view_ui) ","view_ui",1,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "view_ui","show", __ref);}
 BA.debugLineNum = 62;BA.debugLine="Public Sub Show As String	'	Can be different types";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 64;BA.debugLine="Return txtName.Text";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _wrapdrawntext(RemoteObject __ref,RemoteObject _container,RemoteObject _text,RemoteObject _textcolor,RemoteObject _textfont,RemoteObject _textalign,RemoteObject _maxwidth) throws Exception{
try {
		Debug.PushSubsStack("WrapDrawnText (view_ui) ","view_ui",1,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("wrapdrawntext")) { return __ref.runUserSub(false, "view_ui","wrapdrawntext", __ref, _container, _text, _textcolor, _textfont, _textalign, _maxwidth);}
RemoteObject _poimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _polbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("Container", _container);
Debug.locals.put("Text", _text);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("TextFont", _textfont);
Debug.locals.put("TextAlign", _textalign);
Debug.locals.put("MaxWidth", _maxwidth);
 BA.debugLineNum = 69;BA.debugLine="Public Sub WrapDrawnText(Container As AnchorPane,";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim poImg As Image";
Debug.ShouldStop(32);
_poimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("poImg", _poimg);
 BA.debugLineNum = 71;BA.debugLine="Dim poLbl As Label";
Debug.ShouldStop(64);
_polbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("poLbl", _polbl);
 BA.debugLineNum = 74;BA.debugLine="poLbl.Initialize(\"\")";
Debug.ShouldStop(512);
_polbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 75;BA.debugLine="poLbl.WrapText = True";
Debug.ShouldStop(1024);
_polbl.runMethod(true,"setWrapText",view_ui.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="poLbl.Font = TextFont";
Debug.ShouldStop(2048);
_polbl.runMethod(false,"setFont",_textfont);
 BA.debugLineNum = 77;BA.debugLine="poLbl.TextColor = TextColor";
Debug.ShouldStop(4096);
_polbl.runMethod(false,"setTextColor",(_textcolor.getObject()));
 BA.debugLineNum = 78;BA.debugLine="poLbl.Alignment = TextAlign";
Debug.ShouldStop(8192);
_polbl.runMethod(true,"setAlignment",_textalign);
 BA.debugLineNum = 79;BA.debugLine="poLbl.Text = Text";
Debug.ShouldStop(16384);
_polbl.runMethod(true,"setText",_text);
 BA.debugLineNum = 80;BA.debugLine="poLbl.Style = \"-fx-background-color: rgba(0, 0, 0";
Debug.ShouldStop(32768);
_polbl.runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color: rgba(0, 0, 0, 0);"));
 BA.debugLineNum = 81;BA.debugLine="Container.AddNode(poLbl, -MaxWidth, 0, MaxWidth,";
Debug.ShouldStop(65536);
_container.runVoidMethod ("AddNode",(Object)((_polbl.getObject())),(Object)(BA.numberCast(double.class, -(double) (0 + _maxwidth.<Integer>get().intValue()))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _maxwidth)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 82;BA.debugLine="poImg = poLbl.Snapshot";
Debug.ShouldStop(131072);
_poimg = _polbl.runMethod(false,"Snapshot");Debug.locals.put("poImg", _poimg);
 BA.debugLineNum = 83;BA.debugLine="poLbl.RemoveNodeFromParent";
Debug.ShouldStop(262144);
_polbl.runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 85;BA.debugLine="Return poImg";
Debug.ShouldStop(1048576);
if (true) return _poimg;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}