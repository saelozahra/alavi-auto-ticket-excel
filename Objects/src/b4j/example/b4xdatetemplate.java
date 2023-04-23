package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xdatetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xdatetemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xdatetemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _month = 0;
public int _year = 0;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _tempselectedday = 0;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanebg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanefg = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvsbackground = null;
public long _selecteddate = 0L;
public long _previousselecteddate = 0L;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public int _highlightedcolor = 0;
public int _selectedcolor = 0;
public int _daysinmonthcolor = 0;
public int _daysinweekcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvsdays = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _daystitlespane = null;
public int _firstday = 0;
public int _minyear = 0;
public int _maxyear = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblyear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnldialog = null;
public anywheresoftware.b4a.objects.collections.List _months = null;
public b4j.example.b4xdialog _mdialog = null;
public boolean _closeonselection = false;
public anywheresoftware.b4a.objects.collections.List _daysofweeknames = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _btnmonth_click(b4j.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnmonth_click", true))
	 {return ((String) Debug.delegate(ba, "btnmonth_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _m = 0;
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Private Sub btnMonth_Click";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+__ref._month /*int*/ -1+(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="month = (m Mod 12) + 1";
__ref._month /*int*/  = (int) ((_m%12)+1);
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=27328517;
 //BA.debugLineNum = 27328517;BA.debugLine="End Sub";
return "";
}
public String  _drawdays(b4j.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawdays", true))
	 {return ((String) Debug.delegate(ba, "drawdays", null));}
long _firstdayofmonth = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__ref._months /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.NumberToString(__ref._year /*int*/ ));
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=26738693;
 //BA.debugLineNum = 26738693;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=26738694;
 //BA.debugLineNum = 26738694;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=26738695;
 //BA.debugLineNum = 26738695;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref._dayofweekoffset /*int*/  = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-__ref._firstday /*int*/ )%7);
RDebugUtils.currentLine=26738696;
 //BA.debugLineNum = 26738696;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=26738697;
 //BA.debugLineNum = 26738697;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=26738699;
 //BA.debugLineNum = 26738699;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=26738702;
 //BA.debugLineNum = 26738702;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=26738703;
 //BA.debugLineNum = 26738703;BA.debugLine="For day = 1 To daysInMonth";
{
final int step13 = 1;
final int limit13 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit13 ;_day = _day + step13 ) {
RDebugUtils.currentLine=26738704;
 //BA.debugLineNum = 26738704;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=26738705;
 //BA.debugLineNum = 26738705;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(BA.NumberToString(_day),(((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ,(_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ,_daysfont,__ref._daysinmonthcolor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }
};
RDebugUtils.currentLine=26738708;
 //BA.debugLineNum = 26738708;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=26738709;
 //BA.debugLineNum = 26738709;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=26738710;
 //BA.debugLineNum = 26738710;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click(b4j.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnyear_click", true))
	 {return ((String) Debug.delegate(ba, "btnyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Private Sub btnYear_Click";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="year = year + btn.Tag";
__ref._year /*int*/  = (int) (__ref._year /*int*/ +(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=27262979;
 //BA.debugLineNum = 27262979;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=26607623;
 //BA.debugLineNum = 26607623;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=26607624;
 //BA.debugLineNum = 26607624;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607625;
 //BA.debugLineNum = 26607625;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607626;
 //BA.debugLineNum = 26607626;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=26607627;
 //BA.debugLineNum = 26607627;BA.debugLine="Private cvsBackground As B4XCanvas";
_cvsbackground = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=26607628;
 //BA.debugLineNum = 26607628;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=26607629;
 //BA.debugLineNum = 26607629;BA.debugLine="Private PreviousSelectedDate As Long";
_previousselecteddate = 0L;
RDebugUtils.currentLine=26607630;
 //BA.debugLineNum = 26607630;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=26607631;
 //BA.debugLineNum = 26607631;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_highlightedcolor = ((int)0xff001bbd);
RDebugUtils.currentLine=26607632;
 //BA.debugLineNum = 26607632;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_selectedcolor = ((int)0xff0ba29b);
RDebugUtils.currentLine=26607633;
 //BA.debugLineNum = 26607633;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_daysinmonthcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=26607634;
 //BA.debugLineNum = 26607634;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_daysinweekcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=26607635;
 //BA.debugLineNum = 26607635;BA.debugLine="Private cvsDays As B4XCanvas";
_cvsdays = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=26607636;
 //BA.debugLineNum = 26607636;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607637;
 //BA.debugLineNum = 26607637;BA.debugLine="Public FirstDay As Int = 0";
_firstday = (int) (0);
RDebugUtils.currentLine=26607638;
 //BA.debugLineNum = 26607638;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_minyear = (int) (1970);
_maxyear = (int) (2030);
RDebugUtils.currentLine=26607639;
 //BA.debugLineNum = 26607639;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607640;
 //BA.debugLineNum = 26607640;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607641;
 //BA.debugLineNum = 26607641;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607642;
 //BA.debugLineNum = 26607642;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607643;
 //BA.debugLineNum = 26607643;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607644;
 //BA.debugLineNum = 26607644;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607645;
 //BA.debugLineNum = 26607645;BA.debugLine="Private pnlDialog As B4XView";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607646;
 //BA.debugLineNum = 26607646;BA.debugLine="Private months As List";
_months = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26607647;
 //BA.debugLineNum = 26607647;BA.debugLine="Private mDialog As B4XDialog";
_mdialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=26607648;
 //BA.debugLineNum = 26607648;BA.debugLine="Public CloseOnSelection As Boolean = True";
_closeonselection = __c.True;
RDebugUtils.currentLine=26607649;
 //BA.debugLineNum = 26607649;BA.debugLine="Public DaysOfWeekNames As List";
_daysofweeknames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26607650;
 //BA.debugLineNum = 26607650;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(b4j.example.b4xdatetemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dayspanefg_touch", true))
	 {return ((String) Debug.delegate(ba, "dayspanefg_touch", new Object[] {_action,_x,_y}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
__ref._handlemouse /*String*/ (null,_x,_y,_action!=_p.TOUCH_ACTION_UP);
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="End Sub";
return "";
}
public String  _handlemouse(b4j.example.b4xdatetemplate __ref,double _x,double _y,boolean _move) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "handlemouse", true))
	 {return ((String) Debug.delegate(ba, "handlemouse", new Object[] {_x,_y,_move}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="If move Then";
if (_move) { 
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=27131910;
 //BA.debugLineNum = 27131910;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=27131911;
 //BA.debugLineNum = 27131911;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=27131912;
 //BA.debugLineNum = 27131912;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=27131913;
 //BA.debugLineNum = 27131913;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._highlightedcolor /*int*/ ,_boxx,_boxy);
 };
 }else {
RDebugUtils.currentLine=27131916;
 //BA.debugLineNum = 27131916;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=27131917;
 //BA.debugLineNum = 27131917;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=27131918;
 //BA.debugLineNum = 27131918;BA.debugLine="SelectDay(newSelectedDay)";
__ref._selectday /*String*/ (null,_newselectedday);
RDebugUtils.currentLine=27131919;
 //BA.debugLineNum = 27131919;BA.debugLine="If CloseOnSelection Then";
if (__ref._closeonselection /*boolean*/ ) { 
RDebugUtils.currentLine=27131920;
 //BA.debugLineNum = 27131920;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 }else {
RDebugUtils.currentLine=27131922;
 //BA.debugLineNum = 27131922;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
 };
 };
 };
RDebugUtils.currentLine=27131927;
 //BA.debugLineNum = 27131927;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=27131928;
 //BA.debugLineNum = 27131928;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.example.b4xdatetemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="setDate(PreviousSelectedDate)";
__ref._setdate /*String*/ (null,__ref._previousselecteddate /*long*/ );
 };
RDebugUtils.currentLine=27590660;
 //BA.debugLineNum = 27590660;BA.debugLine="End Sub";
return "";
}
public String  _setdate(b4j.example.b4xdatetemplate __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setdate", true))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date}));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Public Sub setDate(date As Long)";
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="If lblYear.IsInitialized = False Then";
if (__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="selectedDate = date";
__ref._selecteddate /*long*/  = _date;
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
RDebugUtils.currentLine=27000838;
 //BA.debugLineNum = 27000838;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=27000840;
 //BA.debugLineNum = 27000840;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date));
RDebugUtils.currentLine=27000841;
 //BA.debugLineNum = 27000841;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.NumberToString(__ref._year /*int*/ ));
RDebugUtils.currentLine=27000842;
 //BA.debugLineNum = 27000842;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__ref._months /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=27000843;
 //BA.debugLineNum = 27000843;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(b4j.example.b4xdatetemplate __ref,anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawbox", true))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ ),(float) (_x*__ref._boxw /*float*/ +__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ +__ref._boxh /*float*/ ));
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=26869764;
 //BA.debugLineNum = 26869764;BA.debugLine="End Sub";
return "";
}
public String  _setyearsbuttonstate(b4j.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setyearsbuttonstate", true))
	 {return ((String) Debug.delegate(ba, "setyearsbuttonstate", null));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Private Sub SetYearsButtonState";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
__ref._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ >__ref._minyear /*int*/ );
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
__ref._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ <__ref._maxyear /*int*/ );
RDebugUtils.currentLine=26804227;
 //BA.debugLineNum = 26804227;BA.debugLine="End Sub";
return "";
}
public long  _getdate(b4j.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getdate", true))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Public Sub getDate As Long";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xdatetemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Return pnlDialog";
if (true) return __ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="End Sub";
return null;
}
public String  _selectday(b4j.example.b4xdatetemplate __ref,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "selectday", true))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day}));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Private Sub SelectDay(day As Int)";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=27066373;
 //BA.debugLineNum = 27066373;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Private Sub Hide";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
__ref._mdialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xdatetemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4j.objects.JFX _fx = null;
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("DateTemplate",ba);
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="pnlDialog.Tag = Me";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=26673157;
 //BA.debugLineNum = 26673157;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=26673158;
 //BA.debugLineNum = 26673158;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=26673159;
 //BA.debugLineNum = 26673159;BA.debugLine="months = DateUtils.GetMonthsNames";
__ref._months /*anywheresoftware.b4a.objects.collections.List*/  = _dateutils._getmonthsnames();
RDebugUtils.currentLine=26673160;
 //BA.debugLineNum = 26673160;BA.debugLine="selectedDate = DateTime.Now";
__ref._selecteddate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=26673161;
 //BA.debugLineNum = 26673161;BA.debugLine="setDate(selectedDate)";
__ref._setdate /*String*/ (null,__ref._selecteddate /*long*/ );
RDebugUtils.currentLine=26673162;
 //BA.debugLineNum = 26673162;BA.debugLine="cvs.Initialize(DaysPaneFg)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=26673163;
 //BA.debugLineNum = 26673163;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._dayspanebg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=26673164;
 //BA.debugLineNum = 26673164;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)7);
RDebugUtils.currentLine=26673165;
 //BA.debugLineNum = 26673165;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)6);
RDebugUtils.currentLine=26673166;
 //BA.debugLineNum = 26673166;BA.debugLine="vCorrection = 5dip";
__ref._vcorrection /*float*/  = (float) (__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=26673167;
 //BA.debugLineNum = 26673167;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._daystitlespane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=26673169;
 //BA.debugLineNum = 26673169;BA.debugLine="Dim p As Pane = DaysPaneFg";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(__ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=26673170;
 //BA.debugLineNum = 26673170;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=26673171;
 //BA.debugLineNum = 26673171;BA.debugLine="p.MouseCursor = fx.Cursors.HAND";
_p.setMouseCursor(_fx.Cursors.HAND);
RDebugUtils.currentLine=26673173;
 //BA.debugLineNum = 26673173;BA.debugLine="DaysOfWeekNames.Initialize";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=26673174;
 //BA.debugLineNum = 26673174;BA.debugLine="DaysOfWeekNames.AddAll(DateUtils.GetDaysNames)";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_dateutils._getdaysnames());
RDebugUtils.currentLine=26673175;
 //BA.debugLineNum = 26673175;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.example.b4xdatetemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xdatetemplate parent,b4j.example.b4xdatetemplate __ref,b4j.example.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4j.example.b4xdatetemplate __ref;
b4j.example.b4xdatetemplate parent;
b4j.example.b4xdialog _dialog;
anywheresoftware.b4a.objects.collections.List _days = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _i = 0;
String _d = "";
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdatetemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Dim days As List = DaysOfWeekNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = __ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=27525124;
 //BA.debugLineNum = 27525124;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
if (true) break;

case 1:
//for
this.state = 10;
step4 = 1;
limit4 = (int) (__ref._firstday /*int*/ +7-1);
_i = __ref._firstday /*int*/  ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=27525125;
 //BA.debugLineNum = 27525125;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
RDebugUtils.currentLine=27525126;
 //BA.debugLineNum = 27525126;BA.debugLine="If d.Length > 2 Then d = d.SubString2(0, 2)";
if (true) break;

case 4:
//if
this.state = 9;
if (_d.length()>2) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_d = _d.substring((int) (0),(int) (2));
if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=27525127;
 //BA.debugLineNum = 27525127;BA.debugLine="cvsDays.DrawText(d, (i - FirstDay + 0.5) * boxW,";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(_d,(_i-__ref._firstday /*int*/ +0.5)*__ref._boxw /*float*/ ,parent.__c.DipToCurrent((int) (20)),_daysfont,__ref._daysinweekcolor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=27525129;
 //BA.debugLineNum = 27525129;BA.debugLine="cvsDays.Invalidate";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=27525130;
 //BA.debugLineNum = 27525130;BA.debugLine="mDialog = Dialog";
__ref._mdialog /*b4j.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=27525131;
 //BA.debugLineNum = 27525131;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=27525132;
 //BA.debugLineNum = 27525132;BA.debugLine="PreviousSelectedDate = selectedDate";
__ref._previousselecteddate /*long*/  = __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=27525133;
 //BA.debugLineNum = 27525133;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdatetemplate", "show"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=27525134;
 //BA.debugLineNum = 27525134;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=27525135;
 //BA.debugLineNum = 27525135;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}