package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xinputtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xinputtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xinputtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public String _text = "";
public b4j.example.b4xdialog _xdialog = null;
public String _regexpattern = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _textfield1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
public boolean _mallowdecimals = false;
public int _bordercolor = 0;
public int _bordercolorinvalid = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xinputtemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="End Sub";
return null;
}
public void  _show(b4j.example.b4xinputtemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xinputtemplate parent,b4j.example.b4xinputtemplate __ref,b4j.example.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4j.example.b4xinputtemplate __ref;
b4j.example.b4xinputtemplate parent;
b4j.example.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4j.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xinputtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="TextField1.Text = Text";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._text /*String*/ );
RDebugUtils.currentLine=32833541;
 //BA.debugLineNum = 32833541;BA.debugLine="Validate(Text)";
__ref._validate /*String*/ (null,__ref._text /*String*/ );
RDebugUtils.currentLine=32833542;
 //BA.debugLineNum = 32833542;BA.debugLine="TextField1.RequestFocus";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=32833551;
 //BA.debugLineNum = 32833551;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4j.example.b4xinputtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="Text = TextField1.Text";
__ref._text /*String*/  = __ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
 };
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="Public Text As String";
_text = "";
RDebugUtils.currentLine=32112644;
 //BA.debugLineNum = 32112644;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=32112645;
 //BA.debugLineNum = 32112645;BA.debugLine="Public RegexPattern As String";
_regexpattern = "";
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="Public TextField1 As B4XView";
_textfield1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32112647;
 //BA.debugLineNum = 32112647;BA.debugLine="Public lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32112651;
 //BA.debugLineNum = 32112651;BA.debugLine="Private mAllowDecimals As Boolean";
_mallowdecimals = false;
RDebugUtils.currentLine=32112652;
 //BA.debugLineNum = 32112652;BA.debugLine="Private BorderColor = xui.Color_White, BorderColo";
_bordercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
_bordercolorinvalid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red;
RDebugUtils.currentLine=32112653;
 //BA.debugLineNum = 32112653;BA.debugLine="End Sub";
return "";
}
public String  _configurefornumbers(b4j.example.b4xinputtemplate __ref,boolean _allowdecimals,boolean _allownegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "configurefornumbers", true))
	 {return ((String) Debug.delegate(ba, "configurefornumbers", new Object[] {_allowdecimals,_allownegative}));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
RDebugUtils.currentLine=32309267;
 //BA.debugLineNum = 32309267;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
RDebugUtils.currentLine=32309268;
 //BA.debugLineNum = 32309268;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=32309269;
 //BA.debugLineNum = 32309269;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
if (_allowdecimals && _allownegative==__c.False) { 
RDebugUtils.currentLine=32309270;
 //BA.debugLineNum = 32309270;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=32309271;
 //BA.debugLineNum = 32309271;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.True) { 
RDebugUtils.currentLine=32309272;
 //BA.debugLineNum = 32309272;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)$";
 }else 
{RDebugUtils.currentLine=32309273;
 //BA.debugLineNum = 32309273;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.False) { 
RDebugUtils.currentLine=32309274;
 //BA.debugLineNum = 32309274;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)$";
 }}}}
;
RDebugUtils.currentLine=32309276;
 //BA.debugLineNum = 32309276;BA.debugLine="mAllowDecimals = AllowDecimals";
__ref._mallowdecimals /*boolean*/  = _allowdecimals;
RDebugUtils.currentLine=32309277;
 //BA.debugLineNum = 32309277;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xinputtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XInputTemplate",ba);
RDebugUtils.currentLine=32178180;
 //BA.debugLineNum = 32178180;BA.debugLine="TextField1.TextColor = xui.Color_White";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=32178190;
 //BA.debugLineNum = 32178190;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=32178191;
 //BA.debugLineNum = 32178191;BA.debugLine="End Sub";
return "";
}
public String  _setborder(b4j.example.b4xinputtemplate __ref,int _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_bc}));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Private Sub SetBorder(bc As Int)";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_bc,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalid(b4j.example.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "isvalid", true))
	 {return ((Boolean) Debug.delegate(ba, "isvalid", new Object[] {_new}));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
if (true) return (__ref._regexpattern /*String*/ ).equals("") || __c.Regex.IsMatch(__ref._regexpattern /*String*/ ,_new);
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="End Sub";
return false;
}
public String  _setbordercolor(b4j.example.b4xinputtemplate __ref,int _valid,int _invalid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setbordercolor", true))
	 {return ((String) Debug.delegate(ba, "setbordercolor", new Object[] {_valid,_invalid}));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Public Sub SetBorderColor(Valid As Int, Invalid As";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="BorderColor = Valid";
__ref._bordercolor /*int*/  = _valid;
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="BorderColorInvalid = Invalid";
__ref._bordercolorinvalid /*int*/  = _invalid;
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=32243716;
 //BA.debugLineNum = 32243716;BA.debugLine="End Sub";
return "";
}
public String  _validate(b4j.example.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "validate", true))
	 {return ((String) Debug.delegate(ba, "validate", new Object[] {_new}));}
int _bc = 0;
boolean _enabled = false;
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Private Sub Validate (New As String)";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="Dim bc As Int = BorderColor";
_bc = __ref._bordercolor /*int*/ ;
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="Dim enabled As Boolean = True";
_enabled = __c.True;
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="If IsValid(New) = False Then";
if (__ref._isvalid /*boolean*/ (null,_new)==__c.False) { 
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
RDebugUtils.currentLine=32440325;
 //BA.debugLineNum = 32440325;BA.debugLine="bc = BorderColorInvalid";
_bc = __ref._bordercolorinvalid /*int*/ ;
 };
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="enabled = False";
_enabled = __c.False;
 };
RDebugUtils.currentLine=32440329;
 //BA.debugLineNum = 32440329;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*b4j.example.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,_enabled);
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="SetBorder(bc)";
__ref._setborder /*String*/ (null,_bc);
RDebugUtils.currentLine=32440331;
 //BA.debugLineNum = 32440331;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_action(b4j.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_action", true))
	 {return ((String) Debug.delegate(ba, "textfield1_action", null));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Private Sub TextField1_Action";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="TextField1_EnterPressed";
__ref._textfield1_enterpressed /*String*/ (null);
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_enterpressed(b4j.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "textfield1_enterpressed", null));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Private Sub TextField1_EnterPressed";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
if (__ref._isvalid /*boolean*/ (null,__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText())) { 
__ref._xdialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);};
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_textchanged(b4j.example.b4xinputtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_textchanged", true))
	 {return ((String) Debug.delegate(ba, "textfield1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
RDebugUtils.currentLine=32374796;
 //BA.debugLineNum = 32374796;BA.debugLine="Validate (New)";
__ref._validate /*String*/ (null,_new);
RDebugUtils.currentLine=32374797;
 //BA.debugLineNum = 32374797;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("textfield1_textchanged");
}
}