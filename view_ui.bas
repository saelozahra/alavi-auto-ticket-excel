B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private xui As XUI
	Private txtName As TextField
	Dim poCan As Canvas
	Dim now_date As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize (Parent As Form)
	frm.Initialize("frm", 551dip, 779dip)
	frm.Title = "خروجی فرم"
'	frm.SetFormStyle("UTILITY")
	frm.SetFormStyle("UNDECORATED")
	frm.RootPane.LoadLayout("view_ticket_layout")
	frm.SetOwner(Parent)
		
	frm.RootPane.Style =  "-fx-background-image: url('" & File.GetUri(File.DirAssets, "theme.png") & "'); -fx-background-repeat: no-repeat; -fx-background-size: contain; -fx-background-position: center center;"
	Dim Shabnam As Font = fx.LoadFont(File.DirAssets, "Ray-Black.ttf", 15dip)
	
	
	Dim ticket_subject, ticket_text2 As String
	
	If Main.OperationType == "azad" Then
		ticket_subject = "آزادســـــــــــــازی تسهیــــــــــــــــــــالت اشتغال‌زایی"
		ticket_text2 = " با توجه به بازدید صورت‌گرفته مورد تائید بوده و اقدامات لازم جهت آزادسازی باقیمانده مبلغ وام اشتغال‌زایی  "&Main.Gardesh&" بانک "&Main.BCName&CRLF&"  به مبلغ  "& Main.MablaghRil.Replace(".", "،")&" ریال، را مبذول فرمائید "
	Else
		ticket_subject = "معرفی "&Main.UName&" جهت اخذ تسهیلات"
		ticket_text2 = " جهت استفاده از تسهیلات اشتغال‌زایی از محل "&Main.Gardesh&" بانک "&Main.BCName&CRLF&"  به مبلغ  "& Main.MablaghRil.Replace(".", "،")&" ریال، خدمتتان معرفی میگردد "
	End If
	
	Dim BNameImg As Image = WrapDrawnText(frm.RootPane, "محضر مدیریت محترم بانک "&Main.BCName&CRLF&"موضوع: "&ticket_subject, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 355dip, "20px")
	poCan.DrawImage(BNameImg, 30dip, 150dip, BNameImg.Width, BNameImg.Height)
	
	Dim ShabnamAdi As Font = fx.LoadFont(File.DirAssets, "Ray-ExtraBold.ttf", 15dip)
	
	Dim ticket_text As String = "احتراما   "&Main.UName&"  با شناسه ملی: "&Main.MelliCode & ticket_text2 & CRLF & "پیشاپیش از مساعدت جناب عالی متشکریم"
	Dim UserNameImg As Image = WrapDrawnText(frm.RootPane, ticket_text, fx.Colors.DarkGray, ShabnamAdi, "TOP_RIGHT", 355dip, "30px")
	poCan.DrawImage(UserNameImg, 30dip, 280dip, UserNameImg.Width, UserNameImg.Height)
	
'	Dim FatherNameImg As Image = WrapDrawnText(frm.RootPane, Main.FatherName, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 145dip)
'	poCan.DrawImage(FatherNameImg, 0dip, 228dip, FatherNameImg.Width, FatherNameImg.Height)
'	
'	Dim MelliImg As Image = WrapDrawnText(frm.RootPane, Main.MelliCode, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 313dip)
'	poCan.DrawImage(MelliImg, 38dip, 265dip, MelliImg.Width, MelliImg.Height)
	
	
	Dim jo As JavaObject
	jo.InitializeNewInstance("b4j.example.view_ui.Roozh", Null)
	jo.RunMethod("GregorianToPersian",  Array(DateTime.GetYear(DateTime.Now), DateTime.GetMonth(DateTime.Now), DateTime.GetDayOfMonth(DateTime.Now)))
	now_date = jo.RunMethod("getYear", Null)&"/"&jo.RunMethod("getMonth", Null)&"/"&jo.RunMethod("getDay", Null)
	
	
	Dim ShabnamRiz As Font = fx.LoadFont(File.DirAssets, "Ray-ExtraBold.ttf", 10dip)
	Dim SHNImg As Image = WrapDrawnText(frm.RootPane, "شماره نامه: "& Main.MelliCode.SubString(4)&"/م"&CRLF&"تاریخ: "&now_date, fx.Colors.DarkGray, ShabnamRiz, "TOP_RIGHT", 110dip , "10px")
	poCan.DrawImage(SHNImg, 22dip, 54dip, SHNImg.Width, SHNImg.Height)
	
	
	
	
	
	
'	Dim MablaghRilImg As Image = WrapDrawnText(frm.RootPane, Main.MablaghRil, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 140dip)
'	poCan.DrawImage(MablaghRilImg, 264dip, 370dip, MablaghRilImg.Width, MablaghRilImg.Height)
	
'	Dim fc As FileChooser
'	fc.Initialize
'	fc.SetExtensionFilter("نامه را ذخیره کنید",Array As String("*.jpg","*.jpeg","*.png"))
'	fc.InitialFileName=Main.UName
'	Dim u As String
'	u = fc.ShowSave(frm)
''	If File.GetFileParent(u) == False Then
''	
''	Else
'		File.WriteString(File.DirTemp, "save_dir", File.GetFileParent(u))
''	End If
'	Dim out As OutputStream = File.OpenOutput(File.GetFileParent(u), File.GetName(u), False)
'	frm.RootPane.SetSize(551,779)
'	frm.RootPane.Snapshot.WriteToStream(out)
	
'	xui.MsgboxAsync("تصویر ذخیره شد", "نتیجه")
	
	fx.Clipboard.SetImage(frm.RootPane.Snapshot)
	
End Sub

Public Sub Show As String	'	Can be different types.
	frm.ShowAndWait
	Return txtName.Text
End Sub



Public Sub WrapDrawnText(Container As AnchorPane, Text As String, TextColor As Paint, TextFont As Font, TextAlign As String, MaxWidth As Int, LineSpace As String) As Image
	Dim poImg As Image
	Dim poLbl As Label
   
	'Create a label
	poLbl.Initialize("")
	poLbl.WrapText = True
	poLbl.Font = TextFont
	poLbl.TextColor = TextColor
	poLbl.Alignment = TextAlign
	poLbl.Text = Text
	poLbl.Style = "-fx-background-color: rgba(0, 0, 0, 0); -fx-text-alignment: right; -fx-line-spacing: "&LineSpace&";"
	Container.AddNode(poLbl, -MaxWidth, 0, MaxWidth, -1)
	poImg = poLbl.Snapshot
	poLbl.RemoveNodeFromParent

	Return poImg
End Sub

Public Sub poCan_MouseClicked (EventData As MouseEvent)
	frm.Close
End Sub
Public Sub poCan_MousePressed (EventData As MouseEvent)
	frm.Close
End Sub



























#if java
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
#end if

