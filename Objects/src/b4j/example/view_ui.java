package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class view_ui extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.view_ui", this);
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private txtName As TextField";
_txtname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim poCan As Canvas";
_pocan = new anywheresoftware.b4j.objects.CanvasWrapper();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.objects.JFX.FontWrapper _shabnam = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bnameimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _usernameimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _fathernameimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _melliimg = null;
anywheresoftware.b4j.objects.JFX.FontWrapper _shabnamriz = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _shnimg = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _mablaghrilimg = null;
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (Parent As Form)";
 //BA.debugLineNum = 12;BA.debugLine="frm.Initialize(\"frm\", 551dip, 779dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (551)),__c.DipToCurrent((int) (779)));
 //BA.debugLineNum = 13;BA.debugLine="frm.Title = \"خروجی فرم\"";
_frm.setTitle("خروجی فرم");
 //BA.debugLineNum = 15;BA.debugLine="frm.SetFormStyle(\"UNDECORATED\")";
_frm.SetFormStyle("UNDECORATED");
 //BA.debugLineNum = 16;BA.debugLine="frm.RootPane.LoadLayout(\"view_ticket_layout\")";
_frm.getRootPane().LoadLayout(ba,"view_ticket_layout");
 //BA.debugLineNum = 17;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 19;BA.debugLine="frm.RootPane.Style =  \"-fx-background-image: url(";
_frm.getRootPane().setStyle("-fx-background-image: url('"+__c.File.GetUri(__c.File.getDirAssets(),"theme.png")+"'); -fx-background-repeat: no-repeat; -fx-background-size: contain; -fx-background-position: center center;");
 //BA.debugLineNum = 20;BA.debugLine="Dim Shabnam As Font = fx.LoadFont(File.DirAssets,";
_shabnam = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_shabnam = _fx.LoadFont(__c.File.getDirAssets(),"Shabnam.ttf",__c.DipToCurrent((int) (15)));
 //BA.debugLineNum = 22;BA.debugLine="Dim BNameImg As Image = WrapDrawnText(frm.RootPan";
_bnameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bnameimg = _wrapdrawntext(_frm.getRootPane(),_main._bcname /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (202)));
 //BA.debugLineNum = 23;BA.debugLine="poCan.DrawImage(BNameImg, 98dip, 160dip, BNameImg";
_pocan.DrawImage((javafx.scene.image.Image)(_bnameimg.getObject()),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (160)),_bnameimg.getWidth(),_bnameimg.getHeight());
 //BA.debugLineNum = 25;BA.debugLine="Dim UserNameImg As Image = WrapDrawnText(frm.Root";
_usernameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_usernameimg = _wrapdrawntext(_frm.getRootPane(),_main._uname /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (195)));
 //BA.debugLineNum = 26;BA.debugLine="poCan.DrawImage(UserNameImg, 184dip, 230dip, User";
_pocan.DrawImage((javafx.scene.image.Image)(_usernameimg.getObject()),__c.DipToCurrent((int) (184)),__c.DipToCurrent((int) (230)),_usernameimg.getWidth(),_usernameimg.getHeight());
 //BA.debugLineNum = 28;BA.debugLine="Dim FatherNameImg As Image = WrapDrawnText(frm.Ro";
_fathernameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_fathernameimg = _wrapdrawntext(_frm.getRootPane(),_main._fathername /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (145)));
 //BA.debugLineNum = 29;BA.debugLine="poCan.DrawImage(FatherNameImg, 0dip, 228dip, Fath";
_pocan.DrawImage((javafx.scene.image.Image)(_fathernameimg.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (228)),_fathernameimg.getWidth(),_fathernameimg.getHeight());
 //BA.debugLineNum = 31;BA.debugLine="Dim MelliImg As Image = WrapDrawnText(frm.RootPan";
_melliimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_melliimg = _wrapdrawntext(_frm.getRootPane(),_main._mellicode /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (313)));
 //BA.debugLineNum = 32;BA.debugLine="poCan.DrawImage(MelliImg, 38dip, 265dip, MelliImg";
_pocan.DrawImage((javafx.scene.image.Image)(_melliimg.getObject()),__c.DipToCurrent((int) (38)),__c.DipToCurrent((int) (265)),_melliimg.getWidth(),_melliimg.getHeight());
 //BA.debugLineNum = 34;BA.debugLine="Dim ShabnamRiz As Font = fx.LoadFont(File.DirAsse";
_shabnamriz = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_shabnamriz = _fx.LoadFont(__c.File.getDirAssets(),"Shabnam.ttf",__c.DipToCurrent((int) (9)));
 //BA.debugLineNum = 35;BA.debugLine="Dim SHNImg As Image = WrapDrawnText(frm.RootPane,";
_shnimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_shnimg = _wrapdrawntext(_frm.getRootPane(),"شماره نامه:ح/"+_main._mellicode /*String*/ .substring((int) (3)),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Black)),_shabnamriz,"TOP_RIGHT",__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 36;BA.debugLine="poCan.DrawImage(SHNImg, 22dip, 54dip, SHNImg.Widt";
_pocan.DrawImage((javafx.scene.image.Image)(_shnimg.getObject()),__c.DipToCurrent((int) (22)),__c.DipToCurrent((int) (54)),_shnimg.getWidth(),_shnimg.getHeight());
 //BA.debugLineNum = 38;BA.debugLine="Dim MablaghRilImg As Image = WrapDrawnText(frm.Ro";
_mablaghrilimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_mablaghrilimg = _wrapdrawntext(_frm.getRootPane(),_main._mablaghril /*String*/ ,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (140)));
 //BA.debugLineNum = 39;BA.debugLine="poCan.DrawImage(MablaghRilImg, 264dip, 370dip, Ma";
_pocan.DrawImage((javafx.scene.image.Image)(_mablaghrilimg.getObject()),__c.DipToCurrent((int) (264)),__c.DipToCurrent((int) (370)),_mablaghrilimg.getWidth(),_mablaghrilimg.getHeight());
 //BA.debugLineNum = 58;BA.debugLine="fx.Clipboard.SetImage(frm.RootPane.Snapshot)";
_fx.Clipboard.SetImage((javafx.scene.image.Image)(_frm.getRootPane().Snapshot().getObject()));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _pocan_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub poCan_MouseClicked (EventData As MouseE";
 //BA.debugLineNum = 89;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _pocan_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub poCan_MousePressed (EventData As MouseE";
 //BA.debugLineNum = 92;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub Show As String	'	Can be different types";
 //BA.debugLineNum = 63;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 64;BA.debugLine="Return txtName.Text";
if (true) return _txtname.getText();
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _wrapdrawntext(anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _container,String _text,anywheresoftware.b4j.objects.JFX.PaintWrapper _textcolor,anywheresoftware.b4j.objects.JFX.FontWrapper _textfont,String _textalign,int _maxwidth) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _poimg = null;
anywheresoftware.b4j.objects.LabelWrapper _polbl = null;
 //BA.debugLineNum = 69;BA.debugLine="Public Sub WrapDrawnText(Container As AnchorPane,";
 //BA.debugLineNum = 70;BA.debugLine="Dim poImg As Image";
_poimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 71;BA.debugLine="Dim poLbl As Label";
_polbl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 74;BA.debugLine="poLbl.Initialize(\"\")";
_polbl.Initialize(ba,"");
 //BA.debugLineNum = 75;BA.debugLine="poLbl.WrapText = True";
_polbl.setWrapText(__c.True);
 //BA.debugLineNum = 76;BA.debugLine="poLbl.Font = TextFont";
_polbl.setFont(_textfont);
 //BA.debugLineNum = 77;BA.debugLine="poLbl.TextColor = TextColor";
_polbl.setTextColor((javafx.scene.paint.Paint)(_textcolor.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="poLbl.Alignment = TextAlign";
_polbl.setAlignment(_textalign);
 //BA.debugLineNum = 79;BA.debugLine="poLbl.Text = Text";
_polbl.setText(_text);
 //BA.debugLineNum = 80;BA.debugLine="poLbl.Style = \"-fx-background-color: rgba(0, 0, 0";
_polbl.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
 //BA.debugLineNum = 81;BA.debugLine="Container.AddNode(poLbl, -MaxWidth, 0, MaxWidth,";
_container.AddNode((javafx.scene.Node)(_polbl.getObject()),-_maxwidth,0,_maxwidth,-1);
 //BA.debugLineNum = 82;BA.debugLine="poImg = poLbl.Snapshot";
_poimg = _polbl.Snapshot();
 //BA.debugLineNum = 83;BA.debugLine="poLbl.RemoveNodeFromParent";
_polbl.RemoveNodeFromParent();
 //BA.debugLineNum = 85;BA.debugLine="Return poImg";
if (true) return _poimg;
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show();
return BA.SubDelegator.SubNotFound;
}
}
