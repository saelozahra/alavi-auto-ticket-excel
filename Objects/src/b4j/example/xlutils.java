package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlutils extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xlutils", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xlutils.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xladdress{
public boolean IsInitialized;
public int Col0Based;
public int Row0Based;
public void Initialize() {
IsInitialized = true;
Col0Based = 0;
Row0Based = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _xlrange{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.PoiSheetWrapper Sheet;
public b4j.example.xlutils._xladdress FirstAddress;
public b4j.example.xlutils._xladdress SecondAddress;
public String Name;
public void Initialize() {
IsInitialized = true;
Sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
FirstAddress = new b4j.example.xlutils._xladdress();
SecondAddress = new b4j.example.xlutils._xladdress();
Name = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.xlreader _reader = null;
public String _createwriterpassword = "";
public short _color_black = (short)0;
public short _color_white = (short)0;
public short _color_red = (short)0;
public short _color_bright_green = (short)0;
public short _color_blue = (short)0;
public short _color_yellow = (short)0;
public short _color_pink = (short)0;
public short _color_turquoise = (short)0;
public short _color_dark_red = (short)0;
public short _color_green = (short)0;
public short _color_dark_blue = (short)0;
public short _color_dark_yellow = (short)0;
public short _color_violet = (short)0;
public short _color_teal = (short)0;
public short _color_grey_25_percent = (short)0;
public short _color_grey_50_percent = (short)0;
public short _color_cornflower_blue = (short)0;
public short _color_maroon = (short)0;
public short _color_lemon_chiffon = (short)0;
public short _color_light_turquoise1 = (short)0;
public short _color_orchid = (short)0;
public short _color_coral = (short)0;
public short _color_royal_blue = (short)0;
public short _color_light_cornflower_blue = (short)0;
public short _color_sky_blue = (short)0;
public short _color_light_turquoise = (short)0;
public short _color_light_green = (short)0;
public short _color_light_yellow = (short)0;
public short _color_pale_blue = (short)0;
public short _color_rose = (short)0;
public short _color_lavender = (short)0;
public short _color_tan = (short)0;
public short _color_light_blue = (short)0;
public short _color_aqua = (short)0;
public short _color_lime = (short)0;
public short _color_gold = (short)0;
public short _color_light_orange = (short)0;
public short _color_orange = (short)0;
public short _color_blue_grey = (short)0;
public short _color_grey_40_percent = (short)0;
public short _color_dark_teal = (short)0;
public short _color_sea_green = (short)0;
public short _color_dark_green = (short)0;
public short _color_olive_green = (short)0;
public short _color_brown = (short)0;
public short _color_plum = (short)0;
public short _color_indigo = (short)0;
public short _color_grey_80_percent = (short)0;
public short _color_automatic = (short)0;
public boolean _blankworkbookis2007 = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.xlutils __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Reader.Initialize (Me)";
__ref._reader /*b4j.example.xlreader*/ ._initialize /*String*/ (null,ba,(b4j.example.xlutils)(this));
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlutils._xladdress  _addressname(b4j.example.xlutils __ref,String _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addressname", true))
	 {return ((b4j.example.xlutils._xladdress) Debug.delegate(ba, "addressname", new Object[] {_address}));}
b4j.example.xlutils._xladdress _xa = null;
int _i = 0;
int _cp = 0;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub AddressName (Address As String) As XLAd";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim xa As XLAddress";
_xa = new b4j.example.xlutils._xladdress();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="xa.Initialize";
_xa.Initialize();
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Address = Address.ToUpperCase";
_address = _address.toUpperCase();
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="For i = 0 To Address.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_address.length()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="Dim cp As Int = Asc(Address.CharAt(i))";
_cp = __c.Asc(_address.charAt(_i));
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="If cp >= 0x41 And cp <=	0x5A Then";
if (_cp>=((int)0x41) && _cp<=((int)0x5a)) { 
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ *26+(_cp-((int)0x40)));
 }else 
{RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="Else If cp >= 0x30 And cp <= 0x39 Then";
if (_cp>=((int)0x30) && _cp<=((int)0x39)) { 
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="xa.Row0Based = xa.Row0Based * 10 + cp - 0x30";
_xa.Row0Based /*int*/  = (int) (_xa.Row0Based /*int*/ *10+_cp-((int)0x30));
 }}
;
 }
};
RDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ -1);
RDebugUtils.currentLine=15269901;
 //BA.debugLineNum = 15269901;BA.debugLine="xa.Row0Based = xa.Row0Based - 1";
_xa.Row0Based /*int*/  = (int) (_xa.Row0Based /*int*/ -1);
RDebugUtils.currentLine=15269902;
 //BA.debugLineNum = 15269902;BA.debugLine="Return xa";
if (true) return _xa;
RDebugUtils.currentLine=15269903;
 //BA.debugLineNum = 15269903;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlutils._xladdress  _addressone(b4j.example.xlutils __ref,String _columnname,int _row1based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addressone", true))
	 {return ((b4j.example.xlutils._xladdress) Debug.delegate(ba, "addressone", new Object[] {_columnname,_row1based}));}
b4j.example.xlutils._xladdress _xa = null;
byte[] _b = null;
int _i = 0;
int _cp = 0;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub AddressOne(ColumnName As String, Row1Ba";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim xa As XLAddress";
_xa = new b4j.example.xlutils._xladdress();
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="xa.Initialize";
_xa.Initialize();
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Dim b() As Byte = ColumnName.GetBytes(\"ASCII\")";
_b = _columnname.getBytes("ASCII");
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="For i = 0 To b.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_b.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="Dim cp As Int = b(i)";
_cp = (int) (_b[_i]);
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ *26+(_cp-((int)0x40)));
 }
};
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ -1);
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="xa.Row0Based = Row1Based - 1";
_xa.Row0Based /*int*/  = (int) (_row1based-1);
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="Return xa";
if (true) return _xa;
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _openexcel(b4j.example.xlutils __ref,String _filepath) throws Exception{
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "openexcel", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "openexcel", new Object[] {_filepath}));}
ResumableSub_OpenExcel rsub = new ResumableSub_OpenExcel(this,__ref,_filepath);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenExcel extends BA.ResumableSub {
public ResumableSub_OpenExcel(b4j.example.xlutils parent,b4j.example.xlutils __ref,String _filepath) {
this.parent = parent;
this.__ref = __ref;
this._filepath = _filepath;
this.__ref = parent;
}
b4j.example.xlutils __ref;
b4j.example.xlutils parent;
String _filepath;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"cmd.exe\",";
_shl.InitializeDoNotHandleQuotes("shl","cmd.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("/c"),(Object)("start"),(Object)(("\"\"")),(Object)(("\""+parent.__c.SmartStringFormatter("",(Object)(_filepath))+"\""))}));
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "openexcel"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="If ExitCode <> 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_exitcode!=0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("916318471",_stdout,0);
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="Log(StdErr)";
parent.__c.LogImpl("916318472",_stderr,0);
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=16318475;
 //BA.debugLineNum = 16318475;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=16318476;
 //BA.debugLineNum = 16318476;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellscript(b4j.example.xlutils __ref,String _s) throws Exception{
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "powershellscript", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "powershellscript", new Object[] {_s}));}
ResumableSub_PowerShellScript rsub = new ResumableSub_PowerShellScript(this,__ref,_s);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellScript extends BA.ResumableSub {
public ResumableSub_PowerShellScript(b4j.example.xlutils parent,b4j.example.xlutils __ref,String _s) {
this.parent = parent;
this.__ref = __ref;
this._s = _s;
this.__ref = parent;
}
b4j.example.xlutils __ref;
b4j.example.xlutils parent;
String _s;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="s = s.Replace(CRLF, \";\").Replace(\"\"\"\", \"'\")";
_s = _s.replace(parent.__c.CRLF,";").replace("\"","'");
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"powershel";
_shl.InitializeDoNotHandleQuotes("shl","powershell.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("-Command"),(Object)(_s)}));
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "powershellscript"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="Dim res As ShellSyncResult";
_res = new anywheresoftware.b4j.objects.Shell.ShellSyncResult();
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="res.ExitCode = ExitCode";
_res.ExitCode = _exitcode;
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="res.StdErr = StdErr";
_res.StdErr = _stderr;
RDebugUtils.currentLine=16449545;
 //BA.debugLineNum = 16449545;BA.debugLine="res.StdOut = StdOut";
_res.StdOut = _stdout;
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="res.Success = Success";
_res.Success = _success;
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="If StdErr <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((_stderr).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16449548;
 //BA.debugLineNum = 16449548;BA.debugLine="Log(StdErr)";
parent.__c.LogImpl("916449548",_stderr,0);
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="If ExitCode = 0 Then res.ExitCode = 1";
if (true) break;

case 4:
//if
this.state = 9;
if (_exitcode==0) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_res.ExitCode = (int) (1);
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.example.xlutils._xladdress  _addresszero(b4j.example.xlutils __ref,int _col0based,int _row0based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresszero", true))
	 {return ((b4j.example.xlutils._xladdress) Debug.delegate(ba, "addresszero", new Object[] {_col0based,_row0based}));}
b4j.example.xlutils._xladdress _xa = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub AddressZero (Col0Based As Int, Row0Base";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim xa As XLAddress";
_xa = new b4j.example.xlutils._xladdress();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="xa.Initialize";
_xa.Initialize();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="xa.Col0Based = Col0Based";
_xa.Col0Based /*int*/  = _col0based;
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="xa.Row0Based = Row0Based";
_xa.Row0Based /*int*/  = _row0based;
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Return xa";
if (true) return _xa;
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlutils._xlrange  _rangestringornametorange(b4j.example.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,String _rangeorname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "rangestringornametorange", true))
	 {return ((b4j.example.xlutils._xlrange) Debug.delegate(ba, "rangestringornametorange", new Object[] {_poiworkbook,_rangeorname}));}
String _referstoformula = "";
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _name = null;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub RangeStringOrNameToRange (PoiWorkbook A";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Dim RefersToFormula As String";
_referstoformula = "";
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Dim name As JavaObject = jo.RunMethod(\"getName\",";
_name = new anywheresoftware.b4j.object.JavaObject();
_name = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getName",new Object[]{(Object)(_rangeorname)})));
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="If name.IsInitialized Then";
if (_name.IsInitialized()) { 
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="RefersToFormula  = name.RunMethod(\"getRefersToFo";
_referstoformula = BA.ObjectToString(_name.RunMethod("getRefersToFormula",(Object[])(__c.Null)));
 }else {
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="RefersToFormula = RangeOrName";
_referstoformula = _rangeorname;
 };
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="Return FormulaToRange(PoiWorkbook, RefersToFormul";
if (true) return __ref._formulatorange /*b4j.example.xlutils._xlrange*/ (null,_poiworkbook,_referstoformula,_rangeorname);
RDebugUtils.currentLine=15925258;
 //BA.debugLineNum = 15925258;BA.debugLine="End Sub";
return null;
}
public String  _addresstostring(b4j.example.xlutils __ref,b4j.example.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresstostring", true))
	 {return ((String) Debug.delegate(ba, "addresstostring", new Object[] {_address}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub AddressToString (Address As XLAddress)";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Return AddressToStringAbs(Address, False, False)";
if (true) return __ref._addresstostringabs /*String*/ (null,_address,__c.False,__c.False);
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _xlrangetocellrangeaddress(b4j.example.xlutils __ref,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "xlrangetocellrangeaddress", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "xlrangetocellrangeaddress", new Object[] {_range}));}
anywheresoftware.b4j.object.JavaObject _cellrange = null;
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Public Sub XLRangeToCellRangeAddress (Range As XLR";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Dim CellRange As JavaObject";
_cellrange = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="CellRange.InitializeNewInstance(\"org.apache.poi.s";
_cellrange.InitializeNewInstance("org.apache.poi.ss.util.CellRangeAddress",new Object[]{(Object)(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.FirstAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.example.xlutils._xladdress*/ .Col0Based /*int*/ )});
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Return CellRange";
if (true) return _cellrange;
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _xlrangetoareareference(b4j.example.xlutils __ref,b4j.example.xlworkbookwriter _workbook,b4j.example.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "xlrangetoareareference", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "xlrangetoareareference", new Object[] {_workbook,_range}));}
anywheresoftware.b4j.object.JavaObject _cellreference1 = null;
anywheresoftware.b4j.object.JavaObject _cellreference2 = null;
anywheresoftware.b4j.object.JavaObject _areareference = null;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub XLRangeToAreaReference (Workbook As XLW";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Dim CellReference1 = XLAddressToCellReference(Ran";
_cellreference1 = new anywheresoftware.b4j.object.JavaObject();
_cellreference1 = __ref._xladdresstocellreference /*anywheresoftware.b4j.object.JavaObject*/ (null,_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.FirstAddress /*b4j.example.xlutils._xladdress*/ );
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="Dim CellReference2 = XLAddressToCellReference(Ran";
_cellreference2 = new anywheresoftware.b4j.object.JavaObject();
_cellreference2 = __ref._xladdresstocellreference /*anywheresoftware.b4j.object.JavaObject*/ (null,_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.SecondAddress /*b4j.example.xlutils._xladdress*/ );
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="Dim AreaReference As JavaObject";
_areareference = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
_areareference.InitializeNewInstance("org.apache.poi.ss.util.AreaReference",new Object[]{(Object)(_cellreference1.getObject()),(Object)(_cellreference2.getObject()),(Object)(_workbook._getversionname /*String*/ (null))});
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="Return AreaReference";
if (true) return _areareference;
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlutils._xlrange  _areareferencetoxlrange(b4j.example.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,anywheresoftware.b4j.object.JavaObject _areareference) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "areareferencetoxlrange", true))
	 {return ((b4j.example.xlutils._xlrange) Debug.delegate(ba, "areareferencetoxlrange", new Object[] {_poiworkbook,_areareference}));}
b4j.example.xlutils._xlrange _res = null;
anywheresoftware.b4j.object.JavaObject _firstcell = null;
anywheresoftware.b4j.object.JavaObject _lastcell = null;
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub AreaReferenceToXLRange (PoiWorkbook As";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Dim res As XLRange";
_res = new b4j.example.xlutils._xlrange();
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="Dim FirstCell = AreaReference.RunMethod(\"getFirst";
_firstcell = new anywheresoftware.b4j.object.JavaObject();
_firstcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_areareference.RunMethod("getFirstCell",(Object[])(__c.Null))));
_lastcell = new anywheresoftware.b4j.object.JavaObject();
_lastcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_areareference.RunMethod("getLastCell",(Object[])(__c.Null))));
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="res.FirstAddress = AddressZero(FirstCell.RunMetho";
_res.FirstAddress /*b4j.example.xlutils._xladdress*/  = __ref._addresszero /*b4j.example.xlutils._xladdress*/ (null,(int)(BA.ObjectToNumber(_firstcell.RunMethod("getCol",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_firstcell.RunMethod("getRow",(Object[])(__c.Null)))));
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="res.SecondAddress = AddressZero(LastCell.RunMetho";
_res.SecondAddress /*b4j.example.xlutils._xladdress*/  = __ref._addresszero /*b4j.example.xlutils._xladdress*/ (null,(int)(BA.ObjectToNumber(_lastcell.RunMethod("getCol",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_lastcell.RunMethod("getRow",(Object[])(__c.Null)))));
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="res.Sheet = PoiWorkbook.GetSheetByName(FirstCell.";
_res.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _poiworkbook.GetSheetByName(BA.ObjectToString(_firstcell.RunMethod("getSheetName",(Object[])(__c.Null))));
RDebugUtils.currentLine=15859719;
 //BA.debugLineNum = 15859719;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="End Sub";
return null;
}
public String  _addressonetostring(b4j.example.xlutils __ref,String _columnname,int _row1based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addressonetostring", true))
	 {return ((String) Debug.delegate(ba, "addressonetostring", new Object[] {_columnname,_row1based}));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub AddressOneToString(ColumnName As String";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Return AddressToString(AddressOne(ColumnName, Row";
if (true) return __ref._addresstostring /*String*/ (null,__ref._addressone /*b4j.example.xlutils._xladdress*/ (null,_columnname,_row1based));
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="End Sub";
return "";
}
public String  _addresstostringabs(b4j.example.xlutils __ref,b4j.example.xlutils._xladdress _address,boolean _absolutecolumn,boolean _absoluterow) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresstostringabs", true))
	 {return ((String) Debug.delegate(ba, "addresstostringabs", new Object[] {_address,_absolutecolumn,_absoluterow}));}
int _c = 0;
String _col = "";
int _cmod = 0;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub AddressToStringAbs(Address As XLAddress";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Dim c As Int = Address.Col0Based + 1";
_c = (int) (_address.Col0Based /*int*/ +1);
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="If Address.Col0Based < 0 Or Address.Row0Based < 0";
if (_address.Col0Based /*int*/ <0 || _address.Row0Based /*int*/ <0) { 
if (true) return "N/A";};
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Dim col As String";
_col = "";
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="Do While c > 0";
while (_c>0) {
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="Dim cmod As Int = c Mod 26";
_cmod = (int) (_c%26);
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="If cmod = 0 Then cmod = 26";
if (_cmod==0) { 
_cmod = (int) (26);};
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="col = Chr(0x40 + cmod) & col";
_col = BA.ObjectToString(__c.Chr((int) (((int)0x40)+_cmod)))+_col;
RDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="c = Floor((c - 1) / 26)";
_c = (int) (__c.Floor((_c-1)/(double)26));
 }
;
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="If AbsoluteColumn Then col = \"$\" & col";
if (_absolutecolumn) { 
_col = "$"+_col;};
RDebugUtils.currentLine=15532043;
 //BA.debugLineNum = 15532043;BA.debugLine="If AbsoluteRow Then col = col & \"$\"";
if (_absoluterow) { 
_col = _col+"$";};
RDebugUtils.currentLine=15532044;
 //BA.debugLineNum = 15532044;BA.debugLine="col = col & (Address.Row0Based + 1)";
_col = _col+BA.NumberToString((_address.Row0Based /*int*/ +1));
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="Return col";
if (true) return _col;
RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="End Sub";
return "";
}
public String  _addresszerotostring(b4j.example.xlutils __ref,int _col0based,int _row0based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresszerotostring", true))
	 {return ((String) Debug.delegate(ba, "addresszerotostring", new Object[] {_col0based,_row0based}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub AddressZeroToString(Col0Based As Int, R";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Return AddressToString(AddressZero(Col0Based, Row";
if (true) return __ref._addresstostring /*String*/ (null,__ref._addresszero /*b4j.example.xlutils._xladdress*/ (null,_col0based,_row0based));
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.xlutils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Public Reader As XLReader";
_reader = new b4j.example.xlreader();
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Type XLAddress (Col0Based As Int, Row0Based As In";
;
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Type XLRange (Sheet As PoiSheet, FirstAddress As";
;
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="Public CreateWriterPassword As String";
_createwriterpassword = "";
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="Public COLOR_BLACK = 8 As Short";
_color_black = (short) (8);
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Public COLOR_WHITE = 9 As Short";
_color_white = (short) (9);
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="Public COLOR_RED = 10 As Short";
_color_red = (short) (10);
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="Public COLOR_BRIGHT_GREEN = 11 As Short";
_color_bright_green = (short) (11);
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="Public COLOR_BLUE = 12 As Short";
_color_blue = (short) (12);
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="Public COLOR_YELLOW = 13 As Short";
_color_yellow = (short) (13);
RDebugUtils.currentLine=15007755;
 //BA.debugLineNum = 15007755;BA.debugLine="Public COLOR_PINK = 14 As Short";
_color_pink = (short) (14);
RDebugUtils.currentLine=15007756;
 //BA.debugLineNum = 15007756;BA.debugLine="Public COLOR_TURQUOISE = 15 As Short";
_color_turquoise = (short) (15);
RDebugUtils.currentLine=15007757;
 //BA.debugLineNum = 15007757;BA.debugLine="Public COLOR_DARK_RED = 16 As Short";
_color_dark_red = (short) (16);
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="Public COLOR_GREEN = 17 As Short";
_color_green = (short) (17);
RDebugUtils.currentLine=15007759;
 //BA.debugLineNum = 15007759;BA.debugLine="Public COLOR_DARK_BLUE = 18 As Short";
_color_dark_blue = (short) (18);
RDebugUtils.currentLine=15007760;
 //BA.debugLineNum = 15007760;BA.debugLine="Public COLOR_DARK_YELLOW = 19 As Short";
_color_dark_yellow = (short) (19);
RDebugUtils.currentLine=15007761;
 //BA.debugLineNum = 15007761;BA.debugLine="Public COLOR_VIOLET = 20 As Short";
_color_violet = (short) (20);
RDebugUtils.currentLine=15007762;
 //BA.debugLineNum = 15007762;BA.debugLine="Public COLOR_TEAL = 21 As Short";
_color_teal = (short) (21);
RDebugUtils.currentLine=15007763;
 //BA.debugLineNum = 15007763;BA.debugLine="Public COLOR_GREY_25_PERCENT = 22 As Short";
_color_grey_25_percent = (short) (22);
RDebugUtils.currentLine=15007764;
 //BA.debugLineNum = 15007764;BA.debugLine="Public COLOR_GREY_50_PERCENT = 23 As Short";
_color_grey_50_percent = (short) (23);
RDebugUtils.currentLine=15007765;
 //BA.debugLineNum = 15007765;BA.debugLine="Public COLOR_CORNFLOWER_BLUE = 24 As Short";
_color_cornflower_blue = (short) (24);
RDebugUtils.currentLine=15007766;
 //BA.debugLineNum = 15007766;BA.debugLine="Public COLOR_MAROON = 25 As Short";
_color_maroon = (short) (25);
RDebugUtils.currentLine=15007767;
 //BA.debugLineNum = 15007767;BA.debugLine="Public COLOR_LEMON_CHIFFON = 26 As Short";
_color_lemon_chiffon = (short) (26);
RDebugUtils.currentLine=15007768;
 //BA.debugLineNum = 15007768;BA.debugLine="Public COLOR_LIGHT_TURQUOISE1 = 27 As Short";
_color_light_turquoise1 = (short) (27);
RDebugUtils.currentLine=15007769;
 //BA.debugLineNum = 15007769;BA.debugLine="Public COLOR_ORCHID = 28 As Short";
_color_orchid = (short) (28);
RDebugUtils.currentLine=15007770;
 //BA.debugLineNum = 15007770;BA.debugLine="Public COLOR_CORAL = 29 As Short";
_color_coral = (short) (29);
RDebugUtils.currentLine=15007771;
 //BA.debugLineNum = 15007771;BA.debugLine="Public COLOR_ROYAL_BLUE = 30 As Short";
_color_royal_blue = (short) (30);
RDebugUtils.currentLine=15007772;
 //BA.debugLineNum = 15007772;BA.debugLine="Public COLOR_LIGHT_CORNFLOWER_BLUE = 31 As Short";
_color_light_cornflower_blue = (short) (31);
RDebugUtils.currentLine=15007773;
 //BA.debugLineNum = 15007773;BA.debugLine="Public COLOR_SKY_BLUE = 40 As Short";
_color_sky_blue = (short) (40);
RDebugUtils.currentLine=15007774;
 //BA.debugLineNum = 15007774;BA.debugLine="Public COLOR_LIGHT_TURQUOISE = 41 As Short";
_color_light_turquoise = (short) (41);
RDebugUtils.currentLine=15007775;
 //BA.debugLineNum = 15007775;BA.debugLine="Public COLOR_LIGHT_GREEN = 42 As Short";
_color_light_green = (short) (42);
RDebugUtils.currentLine=15007776;
 //BA.debugLineNum = 15007776;BA.debugLine="Public COLOR_LIGHT_YELLOW = 43 As Short";
_color_light_yellow = (short) (43);
RDebugUtils.currentLine=15007777;
 //BA.debugLineNum = 15007777;BA.debugLine="Public COLOR_PALE_BLUE = 44 As Short";
_color_pale_blue = (short) (44);
RDebugUtils.currentLine=15007778;
 //BA.debugLineNum = 15007778;BA.debugLine="Public COLOR_ROSE = 45 As Short";
_color_rose = (short) (45);
RDebugUtils.currentLine=15007779;
 //BA.debugLineNum = 15007779;BA.debugLine="Public COLOR_LAVENDER = 46 As Short";
_color_lavender = (short) (46);
RDebugUtils.currentLine=15007780;
 //BA.debugLineNum = 15007780;BA.debugLine="Public COLOR_TAN = 47 As Short";
_color_tan = (short) (47);
RDebugUtils.currentLine=15007781;
 //BA.debugLineNum = 15007781;BA.debugLine="Public COLOR_LIGHT_BLUE = 48 As Short";
_color_light_blue = (short) (48);
RDebugUtils.currentLine=15007782;
 //BA.debugLineNum = 15007782;BA.debugLine="Public COLOR_AQUA = 49 As Short";
_color_aqua = (short) (49);
RDebugUtils.currentLine=15007783;
 //BA.debugLineNum = 15007783;BA.debugLine="Public COLOR_LIME = 50 As Short";
_color_lime = (short) (50);
RDebugUtils.currentLine=15007784;
 //BA.debugLineNum = 15007784;BA.debugLine="Public COLOR_GOLD = 51 As Short";
_color_gold = (short) (51);
RDebugUtils.currentLine=15007785;
 //BA.debugLineNum = 15007785;BA.debugLine="Public COLOR_LIGHT_ORANGE = 52 As Short";
_color_light_orange = (short) (52);
RDebugUtils.currentLine=15007786;
 //BA.debugLineNum = 15007786;BA.debugLine="Public COLOR_ORANGE = 53 As Short";
_color_orange = (short) (53);
RDebugUtils.currentLine=15007787;
 //BA.debugLineNum = 15007787;BA.debugLine="Public COLOR_BLUE_GREY = 54 As Short";
_color_blue_grey = (short) (54);
RDebugUtils.currentLine=15007788;
 //BA.debugLineNum = 15007788;BA.debugLine="Public COLOR_GREY_40_PERCENT = 55 As Short";
_color_grey_40_percent = (short) (55);
RDebugUtils.currentLine=15007789;
 //BA.debugLineNum = 15007789;BA.debugLine="Public COLOR_DARK_TEAL = 56 As Short";
_color_dark_teal = (short) (56);
RDebugUtils.currentLine=15007790;
 //BA.debugLineNum = 15007790;BA.debugLine="Public COLOR_SEA_GREEN = 57 As Short";
_color_sea_green = (short) (57);
RDebugUtils.currentLine=15007791;
 //BA.debugLineNum = 15007791;BA.debugLine="Public COLOR_DARK_GREEN = 58 As Short";
_color_dark_green = (short) (58);
RDebugUtils.currentLine=15007792;
 //BA.debugLineNum = 15007792;BA.debugLine="Public COLOR_OLIVE_GREEN = 59 As Short";
_color_olive_green = (short) (59);
RDebugUtils.currentLine=15007793;
 //BA.debugLineNum = 15007793;BA.debugLine="Public COLOR_BROWN = 60 As Short";
_color_brown = (short) (60);
RDebugUtils.currentLine=15007794;
 //BA.debugLineNum = 15007794;BA.debugLine="Public COLOR_PLUM = 61 As Short";
_color_plum = (short) (61);
RDebugUtils.currentLine=15007795;
 //BA.debugLineNum = 15007795;BA.debugLine="Public COLOR_INDIGO = 62 As Short";
_color_indigo = (short) (62);
RDebugUtils.currentLine=15007796;
 //BA.debugLineNum = 15007796;BA.debugLine="Public COLOR_GREY_80_PERCENT = 63 As Short";
_color_grey_80_percent = (short) (63);
RDebugUtils.currentLine=15007797;
 //BA.debugLineNum = 15007797;BA.debugLine="Public COLOR_AUTOMATIC = 64 As Short";
_color_automatic = (short) (64);
RDebugUtils.currentLine=15007798;
 //BA.debugLineNum = 15007798;BA.debugLine="Public BlankWorkbookIs2007 As Boolean = True";
_blankworkbookis2007 = __c.True;
RDebugUtils.currentLine=15007799;
 //BA.debugLineNum = 15007799;BA.debugLine="End Sub";
return "";
}
public b4j.example.xlworkbookwriter  _createwriterblank(b4j.example.xlutils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createwriterblank", true))
	 {return ((b4j.example.xlworkbookwriter) Debug.delegate(ba, "createwriterblank", null));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.example.xlworkbookwriter _writer = null;
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub CreateWriterBlank As XLWorkbookWriter";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="wb.InitializeNew(BlankWorkbookIs2007)";
_wb.InitializeNew(__ref._blankworkbookis2007 /*boolean*/ );
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Dim writer As XLWorkbookWriter";
_writer = new b4j.example.xlworkbookwriter();
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="writer.Initialize(Me, wb, False)";
_writer._initialize /*String*/ (null,ba,(b4j.example.xlutils)(this),_wb,__c.False);
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlworkbookwriter  _createwriterfromtemplate(b4j.example.xlutils __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createwriterfromtemplate", true))
	 {return ((b4j.example.xlworkbookwriter) Debug.delegate(ba, "createwriterfromtemplate", new Object[] {_dir,_filename}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.example.xlworkbookwriter _writer = null;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub CreateWriterFromTemplate (Dir As String";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="wb.InitializeExisting(Dir, FileName, CreateWriter";
_wb.InitializeExisting(_dir,_filename,__ref._createwriterpassword /*String*/ ,__c.False);
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="Dim writer As XLWorkbookWriter";
_writer = new b4j.example.xlworkbookwriter();
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="writer.Initialize(Me, wb, True)";
_writer._initialize /*String*/ (null,ba,(b4j.example.xlutils)(this),_wb,__c.True);
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlutils._xlrange  _createxlrange(b4j.example.xlutils __ref,b4j.example.xlutils._xladdress _firstaddress,b4j.example.xlutils._xladdress _secondaddress) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createxlrange", true))
	 {return ((b4j.example.xlutils._xlrange) Debug.delegate(ba, "createxlrange", new Object[] {_firstaddress,_secondaddress}));}
b4j.example.xlutils._xlrange _t1 = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub CreateXLRange (FirstAddress As XLAddres";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim t1 As XLRange";
_t1 = new b4j.example.xlutils._xlrange();
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="t1.FirstAddress = FirstAddress";
_t1.FirstAddress /*b4j.example.xlutils._xladdress*/  = _firstaddress;
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="t1.SecondAddress = SecondAddress";
_t1.SecondAddress /*b4j.example.xlutils._xladdress*/  = _secondaddress;
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlutils._xlrange  _createxlrangewithsheet(b4j.example.xlutils __ref,b4j.example.xlutils._xladdress _firstaddress,b4j.example.xlutils._xladdress _secondaddress,anywheresoftware.b4j.objects.PoiSheetWrapper _poisheet) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createxlrangewithsheet", true))
	 {return ((b4j.example.xlutils._xlrange) Debug.delegate(ba, "createxlrangewithsheet", new Object[] {_firstaddress,_secondaddress,_poisheet}));}
b4j.example.xlutils._xlrange _t1 = null;
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub CreateXLRangeWithSheet (FirstAddress As";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Dim t1 As XLRange";
_t1 = new b4j.example.xlutils._xlrange();
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="t1.FirstAddress = FirstAddress";
_t1.FirstAddress /*b4j.example.xlutils._xladdress*/  = _firstaddress;
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="t1.SecondAddress = SecondAddress";
_t1.SecondAddress /*b4j.example.xlutils._xladdress*/  = _secondaddress;
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="t1.Sheet = PoiSheet";
_t1.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _poisheet;
RDebugUtils.currentLine=16252934;
 //BA.debugLineNum = 16252934;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=16252935;
 //BA.debugLineNum = 16252935;BA.debugLine="End Sub";
return null;
}
public b4j.example.xlutils._xlrange  _formulatorange(b4j.example.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,String _formula,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "formulatorange", true))
	 {return ((b4j.example.xlutils._xlrange) Debug.delegate(ba, "formulatorange", new Object[] {_poiworkbook,_formula,_name}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _areareference = null;
b4j.example.xlutils._xlrange _res = null;
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub FormulaToRange (PoiWorkbook As PoiWork";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="Dim AreaReference As JavaObject";
_areareference = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
_areareference.InitializeNewInstance("org.apache.poi.ss.util.AreaReference",new Object[]{(Object)(_formula),_jo.RunMethod("getSpreadsheetVersion",(Object[])(__c.Null))});
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="Dim res As XLRange = AreaReferenceToXLRange(PoiWo";
_res = __ref._areareferencetoxlrange /*b4j.example.xlutils._xlrange*/ (null,_poiworkbook,_areareference);
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="res.Name = Name";
_res.Name /*String*/  = _name;
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getworkbookrangenames(b4j.example.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "getworkbookrangenames", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getworkbookrangenames", new Object[] {_poiworkbook}));}
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.List _names = null;
anywheresoftware.b4j.object.JavaObject _name = null;
String _formula = "";
String _namename = "";
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Public Sub GetWorkbookRangeNames (PoiWorkbook As P";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="Dim names As List = jo.RunMethod(\"getAllNames\", N";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jo.RunMethod("getAllNames",(Object[])(__c.Null))));
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="For Each name As JavaObject In names";
_name = new anywheresoftware.b4j.object.JavaObject();
{
final anywheresoftware.b4a.BA.IterableList group5 = _names;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="Dim Formula As String = name.RunMethod(\"getRefer";
_formula = BA.ObjectToString(_name.RunMethod("getRefersToFormula",(Object[])(__c.Null)));
RDebugUtils.currentLine=15728647;
 //BA.debugLineNum = 15728647;BA.debugLine="Dim NameName As String = name.RunMethod(\"getName";
_namename = BA.ObjectToString(_name.RunMethod("getNameName",(Object[])(__c.Null)));
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="Try";
try {RDebugUtils.currentLine=15728649;
 //BA.debugLineNum = 15728649;BA.debugLine="res.Add(FormulaToRange(PoiWorkbook, Formula , N";
_res.Add((Object)(__ref._formulatorange /*b4j.example.xlutils._xlrange*/ (null,_poiworkbook,_formula,_namename)));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=15728651;
 //BA.debugLineNum = 15728651;BA.debugLine="Log($\"info: cannot get range of: ${NameName} -";
__c.LogImpl("915728651",("info: cannot get range of: "+__c.SmartStringFormatter("",(Object)(_namename))+" - "+__c.SmartStringFormatter("",(Object)(_formula))+" "),0);
 };
 }
};
RDebugUtils.currentLine=15728654;
 //BA.debugLineNum = 15728654;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=15728655;
 //BA.debugLineNum = 15728655;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellconverttopdf(b4j.example.xlutils __ref,String _inputfile,String _outputfile,int _sheetindex,boolean _openpdf) throws Exception{
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "powershellconverttopdf", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "powershellconverttopdf", new Object[] {_inputfile,_outputfile,_sheetindex,_openpdf}));}
ResumableSub_PowerShellConvertToPdf rsub = new ResumableSub_PowerShellConvertToPdf(this,__ref,_inputfile,_outputfile,_sheetindex,_openpdf);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellConvertToPdf extends BA.ResumableSub {
public ResumableSub_PowerShellConvertToPdf(b4j.example.xlutils parent,b4j.example.xlutils __ref,String _inputfile,String _outputfile,int _sheetindex,boolean _openpdf) {
this.parent = parent;
this.__ref = __ref;
this._inputfile = _inputfile;
this._outputfile = _outputfile;
this._sheetindex = _sheetindex;
this._openpdf = _openpdf;
this.__ref = parent;
}
b4j.example.xlutils __ref;
b4j.example.xlutils parent;
String _inputfile;
String _outputfile;
int _sheetindex;
boolean _openpdf;
String _objecttoconvert = "";
String _s = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="File.Delete(OutputFile, \"\")";
parent.__c.File.Delete(_outputfile,"");
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="If File.Exists(OutputFile, \"\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.File.Exists(_outputfile,"")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Log(\"Cannot delete output file\")";
parent.__c.LogImpl("916384003","Cannot delete output file",0);
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Dim ObjectToConvert As String";
_objecttoconvert = "";
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="If SheetIndex < 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_sheetindex<0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="ObjectToConvert = \"$workbook\"";
_objecttoconvert = "$workbook";
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="ObjectToConvert = $\"$workbook.Sheets[${SheetInde";
_objecttoconvert = ("$workbook.Sheets["+parent.__c.SmartStringFormatter("",(Object)(_sheetindex+1))+"]");
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="Dim s As String = $\" 	& {$objExcel = New-Object -";
_s = ("\n"+"	& {$objExcel = New-Object -ComObject excel.application\n"+"$workbook = $objExcel.workbooks.open('"+parent.__c.SmartStringFormatter("",(Object)(_inputfile))+"', 3)\n"+""+parent.__c.SmartStringFormatter("",(Object)(_objecttoconvert))+".ExportAsFixedFormat($xlFixedFormat::xlTypePDF, '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"')\n"+"$objExcel.Workbooks.close()\n"+"$objExcel.Quit()}");
RDebugUtils.currentLine=16384018;
 //BA.debugLineNum = 16384018;BA.debugLine="Wait For (PowerShellScript(s)) Complete (Result A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "powershellconverttopdf"), __ref._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_s));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[1];
;
RDebugUtils.currentLine=16384019;
 //BA.debugLineNum = 16384019;BA.debugLine="If Result.ExitCode <> 0 Then Return False";
if (true) break;

case 11:
//if
this.state = 16;
if (_result.ExitCode!=0) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=16384020;
 //BA.debugLineNum = 16384020;BA.debugLine="If OpenPdf Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_openpdf) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=16384021;
 //BA.debugLineNum = 16384021;BA.debugLine="Wait For (PowerShellScript($\"& {Invoke-Item '${O";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "powershellconverttopdf"), __ref._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,("& {Invoke-Item '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"'}")));
this.state = 22;
return;
case 22:
//C
this.state = 20;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[1];
;
RDebugUtils.currentLine=16384022;
 //BA.debugLineNum = 16384022;BA.debugLine="Return Result.ExitCode = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result.ExitCode==0));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=16384024;
 //BA.debugLineNum = 16384024;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=16384025;
 //BA.debugLineNum = 16384025;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4j.object.JavaObject  _xladdresstocellreference(b4j.example.xlutils __ref,String _sheetname,b4j.example.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "xladdresstocellreference", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "xladdresstocellreference", new Object[] {_sheetname,_address}));}
anywheresoftware.b4j.object.JavaObject _cellreference1 = null;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub XLAddressToCellReference (SheetName As";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim CellReference1 As JavaObject";
_cellreference1 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="CellReference1.InitializeNewInstance(\"org.apache.";
_cellreference1.InitializeNewInstance("org.apache.poi.ss.util.CellReference",new Object[]{(Object)(_sheetname),(Object)(_address.Row0Based /*int*/ ),(Object)(_address.Col0Based /*int*/ ),(Object)(__c.True),(Object)(__c.True)});
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Return CellReference1";
if (true) return _cellreference1;
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="End Sub";
return null;
}
}