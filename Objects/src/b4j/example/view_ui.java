package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class view_ui extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.view_ui", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.view_ui.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtname = null;
public anywheresoftware.b4j.objects.CanvasWrapper _pocan = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.view_ui __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="view_ui";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.objects.JFX.FontWrapper _shabnam = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bnameimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _usernameimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _fathernameimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _melliimg = null;
anywheresoftware.b4j.objects.JFX.FontWrapper _shabnamriz = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _shnimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _mablaghrilimg = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize (Parent As Form)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="frm.Initialize(\"frm\", 551dip, 779dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (551)),__c.DipToCurrent((int) (779)));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="frm.Title = \"خروجی فرم\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("خروجی فرم");
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="frm.SetFormStyle(\"UNDECORATED\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UNDECORATED");
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="frm.RootPane.LoadLayout(\"view_ticket_layout\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"view_ticket_layout");
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="frm.RootPane.Style =  \"-fx-background-image: url(";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setStyle("-fx-background-image: url('"+__c.File.GetUri(__c.File.getDirAssets(),"theme.png")+"'); -fx-background-repeat: no-repeat; -fx-background-size: contain; -fx-background-position: center center;");
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Dim Shabnam As Font = fx.LoadFont(File.DirAssets,";
_shabnam = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_shabnam = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadFont(__c.File.getDirAssets(),"Shabnam.ttf",__c.DipToCurrent((int) (15)));
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Dim BNameImg As Image = WrapDrawnText(frm.RootPan";
_bnameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bnameimg = __ref._wrapdrawntext /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane(),_main._bcname /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (202)));
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="poCan.DrawImage(BNameImg, 98dip, 160dip, BNameImg";
__ref._pocan /*anywheresoftware.b4j.objects.CanvasWrapper*/ .DrawImage((javafx.scene.image.Image)(_bnameimg.getObject()),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (160)),_bnameimg.getWidth(),_bnameimg.getHeight());
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Dim UserNameImg As Image = WrapDrawnText(frm.Root";
_usernameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_usernameimg = __ref._wrapdrawntext /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane(),_main._uname /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (195)));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="poCan.DrawImage(UserNameImg, 184dip, 230dip, User";
__ref._pocan /*anywheresoftware.b4j.objects.CanvasWrapper*/ .DrawImage((javafx.scene.image.Image)(_usernameimg.getObject()),__c.DipToCurrent((int) (184)),__c.DipToCurrent((int) (230)),_usernameimg.getWidth(),_usernameimg.getHeight());
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="Dim FatherNameImg As Image = WrapDrawnText(frm.Ro";
_fathernameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_fathernameimg = __ref._wrapdrawntext /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane(),_main._fathername /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (145)));
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="poCan.DrawImage(FatherNameImg, 0dip, 228dip, Fath";
__ref._pocan /*anywheresoftware.b4j.objects.CanvasWrapper*/ .DrawImage((javafx.scene.image.Image)(_fathernameimg.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (228)),_fathernameimg.getWidth(),_fathernameimg.getHeight());
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="Dim MelliImg As Image = WrapDrawnText(frm.RootPan";
_melliimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_melliimg = __ref._wrapdrawntext /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane(),_main._mellicode /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (313)));
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="poCan.DrawImage(MelliImg, 38dip, 265dip, MelliImg";
__ref._pocan /*anywheresoftware.b4j.objects.CanvasWrapper*/ .DrawImage((javafx.scene.image.Image)(_melliimg.getObject()),__c.DipToCurrent((int) (38)),__c.DipToCurrent((int) (265)),_melliimg.getWidth(),_melliimg.getHeight());
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="Dim ShabnamRiz As Font = fx.LoadFont(File.DirAsse";
_shabnamriz = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_shabnamriz = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadFont(__c.File.getDirAssets(),"Shabnam.ttf",__c.DipToCurrent((int) (9)));
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="Dim SHNImg As Image = WrapDrawnText(frm.RootPane,";
_shnimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_shnimg = __ref._wrapdrawntext /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane(),"شماره نامه:ح/"+_main._mellicode /*String*/ .substring((int) (3)),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.Black)),_shabnamriz,"TOP_RIGHT",__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="poCan.DrawImage(SHNImg, 22dip, 54dip, SHNImg.Widt";
__ref._pocan /*anywheresoftware.b4j.objects.CanvasWrapper*/ .DrawImage((javafx.scene.image.Image)(_shnimg.getObject()),__c.DipToCurrent((int) (22)),__c.DipToCurrent((int) (54)),_shnimg.getWidth(),_shnimg.getHeight());
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="Dim MablaghRilImg As Image = WrapDrawnText(frm.Ro";
_mablaghrilimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_mablaghrilimg = __ref._wrapdrawntext /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane(),_main._mablaghril /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (140)));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="poCan.DrawImage(MablaghRilImg, 264dip, 370dip, Ma";
__ref._pocan /*anywheresoftware.b4j.objects.CanvasWrapper*/ .DrawImage((javafx.scene.image.Image)(_mablaghrilimg.getObject()),__c.DipToCurrent((int) (264)),__c.DipToCurrent((int) (370)),_mablaghrilimg.getWidth(),_mablaghrilimg.getHeight());
RDebugUtils.currentLine=524335;
 //BA.debugLineNum = 524335;BA.debugLine="fx.Clipboard.SetImage(frm.RootPane.Snapshot)";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Clipboard.SetImage((javafx.scene.image.Image)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().Snapshot().getObject()));
RDebugUtils.currentLine=524337;
 //BA.debugLineNum = 524337;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.view_ui __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="view_ui";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Show As String	'	Can be different types";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Return txtName.Text";
if (true) return __ref._txtname /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.view_ui __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="view_ui";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private txtName As TextField";
_txtname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Dim poCan As Canvas";
_pocan = new anywheresoftware.b4j.objects.CanvasWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _wrapdrawntext(b4j.example.view_ui __ref,anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _container,String _text,anywheresoftware.b4j.objects.JFX.PaintWrapper _textcolor,anywheresoftware.b4j.objects.JFX.FontWrapper _textfont,String _textalign,int _maxwidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="view_ui";
if (Debug.shouldDelegate(ba, "wrapdrawntext", false))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "wrapdrawntext", new Object[] {_container,_text,_textcolor,_textfont,_textalign,_maxwidth}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _poimg = null;
anywheresoftware.b4j.objects.LabelWrapper _polbl = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub WrapDrawnText(Container As AnchorPane,";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim poImg As Image";
_poimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim poLbl As Label";
_polbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="poLbl.Initialize(\"\")";
_polbl.Initialize(ba,"");
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="poLbl.WrapText = True";
_polbl.setWrapText(__c.True);
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="poLbl.Font = TextFont";
_polbl.setFont(_textfont);
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="poLbl.TextColor = TextColor";
_polbl.setTextColor((javafx.scene.paint.Paint)(_textcolor.getObject()));
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="poLbl.Alignment = TextAlign";
_polbl.setAlignment(_textalign);
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="poLbl.Text = Text";
_polbl.setText(_text);
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="poLbl.Style = \"-fx-background-color: rgba(0, 0, 0";
_polbl.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="Container.AddNode(poLbl, -MaxWidth, 0, MaxWidth,";
_container.AddNode((javafx.scene.Node)(_polbl.getObject()),-_maxwidth,0,_maxwidth,-1);
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="poImg = poLbl.Snapshot";
_poimg = _polbl.Snapshot();
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="poLbl.RemoveNodeFromParent";
_polbl.RemoveNodeFromParent();
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="Return poImg";
if (true) return _poimg;
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="End Sub";
return null;
}
public String  _pocan_mouseclicked(b4j.example.view_ui __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="view_ui";
if (Debug.shouldDelegate(ba, "pocan_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "pocan_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub poCan_MouseClicked (EventData As MouseE";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public String  _pocan_mousepressed(b4j.example.view_ui __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="view_ui";
if (Debug.shouldDelegate(ba, "pocan_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "pocan_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub poCan_MousePressed (EventData As MouseE";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
}