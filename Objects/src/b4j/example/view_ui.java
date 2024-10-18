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
public String _now_date = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.b4xcollections _b4xcollections = null;
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
 //BA.debugLineNum = 8;BA.debugLine="Dim now_date As String";
_now_date = "";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.objects.JFX.FontWrapper _shabnam = null;
String _ticket_subject = "";
String _ticket_text2 = "";
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bnameimg = null;
anywheresoftware.b4j.objects.JFX.FontWrapper _shabnamadi = null;
String _ticket_text = "";
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _usernameimg = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.objects.JFX.FontWrapper _shabnamriz = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _shnimg = null;
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize (Parent As Form)";
 //BA.debugLineNum = 13;BA.debugLine="frm.Initialize(\"frm\", 551dip, 779dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (551)),__c.DipToCurrent((int) (779)));
 //BA.debugLineNum = 14;BA.debugLine="frm.Title = \"خروجی فرم\"";
_frm.setTitle("خروجی فرم");
 //BA.debugLineNum = 16;BA.debugLine="frm.SetFormStyle(\"UNDECORATED\")";
_frm.SetFormStyle("UNDECORATED");
 //BA.debugLineNum = 17;BA.debugLine="frm.RootPane.LoadLayout(\"view_ticket_layout\")";
_frm.getRootPane().LoadLayout(ba,"view_ticket_layout");
 //BA.debugLineNum = 18;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 20;BA.debugLine="frm.RootPane.Style =  \"-fx-background-image: url(";
_frm.getRootPane().setStyle("-fx-background-image: url('"+__c.File.GetUri(__c.File.getDirAssets(),"theme.png")+"'); -fx-background-repeat: no-repeat; -fx-background-size: contain; -fx-background-position: center center;");
 //BA.debugLineNum = 21;BA.debugLine="Dim Shabnam As Font = fx.LoadFont(File.DirAssets,";
_shabnam = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_shabnam = _fx.LoadFont(__c.File.getDirAssets(),"Ray-Black.ttf",__c.DipToCurrent((int) (15)));
 //BA.debugLineNum = 24;BA.debugLine="Dim ticket_subject, ticket_text2 As String";
_ticket_subject = "";
_ticket_text2 = "";
 //BA.debugLineNum = 26;BA.debugLine="If Main.OperationType == \"azad\" Then";
if ((_main._operationtype /*String*/ ).equals("azad")) { 
 //BA.debugLineNum = 27;BA.debugLine="ticket_subject = \"آزادســـــــــــــازی تسهیــــ";
_ticket_subject = "آزادســـــــــــــازی تسهیــــــــــــــــــــالت اشتغال‌زایی";
 //BA.debugLineNum = 28;BA.debugLine="ticket_text2 = \" با توجه به بازدید صورت‌گرفته مو";
_ticket_text2 = " با توجه به بازدید صورت‌گرفته مورد تائید بوده و اقدامات لازم جهت آزادسازی باقیمانده مبلغ وام اشتغال‌زایی  "+_main._gardesh /*String*/ +" بانک "+_main._bcname /*String*/ +__c.CRLF+"  به مبلغ  "+_main._mablaghril /*String*/ .replace(".","،")+" ریال، را مبذول فرمائید ";
 }else {
 //BA.debugLineNum = 30;BA.debugLine="ticket_subject = \"معرفی \"&Main.UName&\" جهت اخذ ت";
_ticket_subject = "معرفی "+_main._uname /*String*/ +" جهت اخذ تسهیلات";
 //BA.debugLineNum = 31;BA.debugLine="ticket_text2 = \" جهت استفاده از تسهیلات اشتغال‌ز";
_ticket_text2 = " جهت استفاده از تسهیلات اشتغال‌زایی از محل "+_main._gardesh /*String*/ +" بانک "+_main._bcname /*String*/ +__c.CRLF+"  به مبلغ  "+_main._mablaghril /*String*/ .replace(".","،")+" ریال، خدمتتان معرفی میگردد ";
 };
 //BA.debugLineNum = 34;BA.debugLine="Dim BNameImg As Image = WrapDrawnText(frm.RootPan";
_bnameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bnameimg = _wrapdrawntext(_frm.getRootPane(),"محضر مدیریت محترم بانک "+_main._bcname /*String*/ +__c.CRLF+"موضوع: "+_ticket_subject,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnam,"TOP_RIGHT",__c.DipToCurrent((int) (355)),"20px");
 //BA.debugLineNum = 35;BA.debugLine="poCan.DrawImage(BNameImg, 30dip, 150dip, BNameImg";
_pocan.DrawImage((javafx.scene.image.Image)(_bnameimg.getObject()),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (150)),_bnameimg.getWidth(),_bnameimg.getHeight());
 //BA.debugLineNum = 37;BA.debugLine="Dim ShabnamAdi As Font = fx.LoadFont(File.DirAsse";
_shabnamadi = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_shabnamadi = _fx.LoadFont(__c.File.getDirAssets(),"Ray-ExtraBold.ttf",__c.DipToCurrent((int) (15)));
 //BA.debugLineNum = 39;BA.debugLine="Dim ticket_text As String = \"احتراما   \"&Main.UNa";
_ticket_text = "احتراما   "+_main._uname /*String*/ +"  با شناسه ملی: "+_main._mellicode /*String*/ +_ticket_text2+__c.CRLF+"پیشاپیش از مساعدت جناب عالی متشکریم";
 //BA.debugLineNum = 40;BA.debugLine="Dim UserNameImg As Image = WrapDrawnText(frm.Root";
_usernameimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_usernameimg = _wrapdrawntext(_frm.getRootPane(),_ticket_text,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnamadi,"TOP_RIGHT",__c.DipToCurrent((int) (355)),"30px");
 //BA.debugLineNum = 41;BA.debugLine="poCan.DrawImage(UserNameImg, 30dip, 280dip, UserN";
_pocan.DrawImage((javafx.scene.image.Image)(_usernameimg.getObject()),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (280)),_usernameimg.getWidth(),_usernameimg.getHeight());
 //BA.debugLineNum = 50;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 51;BA.debugLine="jo.InitializeNewInstance(\"b4j.example.view_ui.Roo";
_jo.InitializeNewInstance("b4j.example.view_ui.Roozh",(Object[])(__c.Null));
 //BA.debugLineNum = 52;BA.debugLine="jo.RunMethod(\"GregorianToPersian\",  Array(DateTim";
_jo.RunMethod("GregorianToPersian",new Object[]{(Object)(__c.DateTime.GetYear(__c.DateTime.getNow())),(Object)(__c.DateTime.GetMonth(__c.DateTime.getNow())),(Object)(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()))});
 //BA.debugLineNum = 53;BA.debugLine="now_date = jo.RunMethod(\"getYear\", Null)&\"/\"&jo.R";
_now_date = BA.ObjectToString(_jo.RunMethod("getYear",(Object[])(__c.Null)))+"/"+BA.ObjectToString(_jo.RunMethod("getMonth",(Object[])(__c.Null)))+"/"+BA.ObjectToString(_jo.RunMethod("getDay",(Object[])(__c.Null)));
 //BA.debugLineNum = 56;BA.debugLine="Dim ShabnamRiz As Font = fx.LoadFont(File.DirAsse";
_shabnamriz = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_shabnamriz = _fx.LoadFont(__c.File.getDirAssets(),"Ray-ExtraBold.ttf",__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 57;BA.debugLine="Dim SHNImg As Image = WrapDrawnText(frm.RootPane,";
_shnimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_shnimg = _wrapdrawntext(_frm.getRootPane(),"شماره نامه: "+_main._mellicode /*String*/ .substring((int) (4))+"/م"+__c.CRLF+"تاریخ: "+_now_date,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.DarkGray)),_shabnamriz,"TOP_RIGHT",__c.DipToCurrent((int) (110)),"10px");
 //BA.debugLineNum = 58;BA.debugLine="poCan.DrawImage(SHNImg, 22dip, 54dip, SHNImg.Widt";
_pocan.DrawImage((javafx.scene.image.Image)(_shnimg.getObject()),__c.DipToCurrent((int) (22)),__c.DipToCurrent((int) (54)),_shnimg.getWidth(),_shnimg.getHeight());
 //BA.debugLineNum = 85;BA.debugLine="fx.Clipboard.SetImage(frm.RootPane.Snapshot)";
_fx.Clipboard.SetImage((javafx.scene.image.Image)(_frm.getRootPane().Snapshot().getObject()));
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _pocan_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub poCan_MouseClicked (EventData As MouseE";
 //BA.debugLineNum = 116;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _pocan_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub poCan_MousePressed (EventData As MouseE";
 //BA.debugLineNum = 119;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub Show As String	'	Can be different types";
 //BA.debugLineNum = 90;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 91;BA.debugLine="Return txtName.Text";
if (true) return _txtname.getText();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _wrapdrawntext(anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _container,String _text,anywheresoftware.b4j.objects.JFX.PaintWrapper _textcolor,anywheresoftware.b4j.objects.JFX.FontWrapper _textfont,String _textalign,int _maxwidth,String _linespace) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _poimg = null;
anywheresoftware.b4j.objects.LabelWrapper _polbl = null;
 //BA.debugLineNum = 96;BA.debugLine="Public Sub WrapDrawnText(Container As AnchorPane,";
 //BA.debugLineNum = 97;BA.debugLine="Dim poImg As Image";
_poimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 98;BA.debugLine="Dim poLbl As Label";
_polbl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 101;BA.debugLine="poLbl.Initialize(\"\")";
_polbl.Initialize(ba,"");
 //BA.debugLineNum = 102;BA.debugLine="poLbl.WrapText = True";
_polbl.setWrapText(__c.True);
 //BA.debugLineNum = 103;BA.debugLine="poLbl.Font = TextFont";
_polbl.setFont(_textfont);
 //BA.debugLineNum = 104;BA.debugLine="poLbl.TextColor = TextColor";
_polbl.setTextColor((javafx.scene.paint.Paint)(_textcolor.getObject()));
 //BA.debugLineNum = 105;BA.debugLine="poLbl.Alignment = TextAlign";
_polbl.setAlignment(_textalign);
 //BA.debugLineNum = 106;BA.debugLine="poLbl.Text = Text";
_polbl.setText(_text);
 //BA.debugLineNum = 107;BA.debugLine="poLbl.Style = \"-fx-background-color: rgba(0, 0, 0";
_polbl.setStyle("-fx-background-color: rgba(0, 0, 0, 0); -fx-text-alignment: right; -fx-line-spacing: "+_linespace+";");
 //BA.debugLineNum = 108;BA.debugLine="Container.AddNode(poLbl, -MaxWidth, 0, MaxWidth,";
_container.AddNode((javafx.scene.Node)(_polbl.getObject()),-_maxwidth,0,_maxwidth,-1);
 //BA.debugLineNum = 109;BA.debugLine="poImg = poLbl.Snapshot";
_poimg = _polbl.Snapshot();
 //BA.debugLineNum = 110;BA.debugLine="poLbl.RemoveNodeFromParent";
_polbl.RemoveNodeFromParent();
 //BA.debugLineNum = 112;BA.debugLine="Return poImg";
if (true) return _poimg;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show();
return BA.SubDelegator.SubNotFound;
}
public static class Roozh {

private int day, month, year;

private int jY, jM, jD;private int gY, gM, gD;private int leap, march;

/*** Calculates the Julian Day number (JG2JD) from Gregorian or Julian* calendar dates. This integer number corresponds to the noon of the date* (i.e. 12 hours of Universal Time). The procedure was tested to be good* since 1 March, -100100 (of both the calendars) up to a few millions* (10**6) years into the future. The algorithm is based on D.A. Hatcher,* Q.Jl.R.Astron.Soc. 25(1984), 53-55 slightly modified by me (K.M.* Borkowski, Post.Astron. 25(1987), 275-279).* * @param year*  <code>int</code>* @param month*  <code>int</code>* @param day*  <code>int</code>* @param J1G0*  to be set to 1 for Julian and to 0 for Gregorian calendar* @return Julian Day number*/
private int JG2JD(int year, int month, int day, int J1G0) {
  int jd = (1461 * (year + 4800 + (month - 14) / 12)) / 4
  + (367 * (month - 2 - 12 * ((month - 14) / 12))) / 12
  - (3 * ((year + 4900 + (month - 14) / 12) / 100)) / 4 + day
  - 32075;

  if (J1G0 == 0)
  jd = jd - (year + 100100 + (month - 8) / 6) / 100 * 3 / 4 + 752;

  return jd;
}

/*** Calculates Gregorian and Julian calendar dates from the Julian Day number* (JD) for the period since JD=-34839655 (i.e. the year -100100 of both the* calendars) to some millions (10**6) years ahead of the present. The* algorithm is based on D.A. Hatcher, Q.Jl.R.Astron.Soc. 25(1984), 53-55* slightly modified by me (K.M. Borkowski, Post.Astron. 25(1987), 275-279).* * @param JD*  Julian day number as <code>int</code>* @param J1G0*  to be set to 1 for Julian and to 0 for Gregorian calendar*/private void JD2JG(int JD, int J1G0) {
  int i, j;

  j = 4 * JD + 139361631;

  if (J1G0 == 0) {
  j = j + (4 * JD + 183187720) / 146097 * 3 / 4 * 4 - 3908;
  }

  i = (j % 1461) / 4 * 5 + 308;
  gD = (i % 153) / 5 + 1;
  gM = ((i / 153) % 12) + 1;
  gY = j / 1461 - 100100 + (8 - gM) / 6;
}

/*** Converts the Julian Day number to a date in the Jalali calendar* * @param JDN*  the Julian Day number*/private void JD2Jal(int JDN) {
  JD2JG(JDN, 0);

  jY = gY - 621;
  JalCal(jY);

  int JDN1F = JG2JD(gY, 3, march, 0);
  int k = JDN - JDN1F;
  if (k >= 0) {
  if (k <= 185) {
  jM = 1 + k / 31;
  jD = (k % 31) + 1;
  return;
  } else {
  k = k - 186;
  }
  } else {
  jY = jY - 1;
  k = k + 179;
  if (leap == 1)
  k = k + 1;
  }

  jM = 7 + k / 30;
  jD = (k % 30) + 1;
}

/*** Converts a date of the Jalali calendar to the Julian Day Number* * @param Jy*  Jalali year as <code>int</code>* @param Jm*  Jalali month as <code>int</code>* @param Jd*  Jalali day as <code>int</code>* @return Julian day number*/private int Jal2JD(int jY, int jM, int jD) {
  JalCal(jY);
  int jd = JG2JD(gY, 3, march, 1) + (jM - 1) * 31 - jM / 7 * (jM - 7)
  + jD - 1;
  return jd;
 }

 /**
 * This procedure determines if the Jalali (Persian) year is leap (366-day
 * long) or is the common year (365 days), and finds the day in March
 * (Gregorian calendar) of the first day of the Jalali year (jY)
 *
 * @param jY
 *  Jalali calendar year (-61 to 3177)
 */
 private void JalCal(int jY) {
  march = 0;
  leap = 0;

  int[] breaks = { -61, 9, 38, 199, 426, 686, 756, 818, 1111, 1181, 1210,
  1635, 2060, 2097, 2192, 2262, 2324, 2394, 2456, 3178 };

  gY = jY + 621;
  int leapJ = -14;
  int jp = breaks[0];

  int jump = 0;
  for (int j = 1; j <= 19; j++) {
  int jm = breaks[j];
  jump = jm - jp;
  if (jY < jm) {
  int N = jY - jp;
  leapJ = leapJ + N / 33 * 8 + (N % 33 + 3) / 4;

  if ((jump % 33) == 4 && (jump - N) == 4)
  leapJ = leapJ + 1;

  int leapG = (gY / 4) - (gY / 100 + 1) * 3 / 4 - 150;

  march = 20 + leapJ - leapG;

  if ((jump - N) < 6)
  N = N - jump + (jump + 4) / 33 * 33;

  leap = ((((N + 1) % 33) - 1) % 4);

  if (leap == -1)
  leap = 4;
  break;
  }

  leapJ = leapJ + jump / 33 * 8 + (jump % 33) / 4;
  jp = jm;
  }
 }

 /**
 * Modified <code>toString()</code> method that represents date string
 *
 * @return Date as <code>String</code>
 */
 @Override
 public String toString() {
  return String.format("%04d-%02d-%02d", getYear(), getMonth(), getDay());
 }

 /**
 * Converts Gregorian date to Persian(Jalali) date
 *
 * @param year
 *  <code>int</code>
 * @param month
 *  <code>int</code>
 * @param day
 *  <code>int</code>
 */
 public void GregorianToPersian(int year, int month, int day) {
  int jd = JG2JD(year, month, day, 0);
  JD2Jal(jd);
  this.year = jY;
  this.month = jM;
  this.day = jD;
 }

 /**
 * Converts Persian(Jalali) date to Gregorian date
 *
 * @param year
 *  <code>int</code>
 * @param month
 *  <code>int</code>
 * @param day
 *  <code>int</code>
 */
 public void PersianToGregorian(int year, int month, int day) {
  int jd = Jal2JD(year, month, day);
  JD2JG(jd, 0);
  this.year = gY;
  this.month = gM;
  this.day = gD;
 }

 /**
 * Get manipulated day
 *
 * @return Day as <code>int</code>
 */
 public int getDay() {
  return day;
 }

 /**
 * Get manipulated month
 *
 * @return Month as <code>int</code>
 */
 public int getMonth() {
  return month;
 }

 /**
 * Get manipulated year
 *
 * @return Year as <code>int</code>
 */
 public int getYear() {
  return year;

 }
}
}
