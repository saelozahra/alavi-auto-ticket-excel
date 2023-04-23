package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wordutils extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.wordutils", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wordutils.class).invoke(this, new Object[] {null});
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
public b4j.example.xlutils _xl = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4j.example.wordutils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wordutils";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Public xl As XLUtils";
_xl = new b4j.example.xlutils();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public b4j.example.worddocument  _createdocument(b4j.example.wordutils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wordutils";
if (Debug.shouldDelegate(ba, "createdocument", true))
	 {return ((b4j.example.worddocument) Debug.delegate(ba, "createdocument", null));}
anywheresoftware.b4j.object.JavaObject _doc = null;
b4j.example.worddocument _wd = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub CreateDocument As WordDocument";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim doc As JavaObject";
_doc = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="doc.InitializeNewInstance(\"org.apache.poi.xwpf.us";
_doc.InitializeNewInstance("org.apache.poi.xwpf.usermodel.XWPFDocument",(Object[])(__c.Null));
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim wd As WordDocument";
_wd = new b4j.example.worddocument();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="wd.Initialize(Me, doc)";
_wd._initialize /*String*/ (null,ba,(b4j.example.wordutils)(this),_doc);
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Return wd";
if (true) return _wd;
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.wordutils __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wordutils";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="xl.Initialize";
__ref._xl /*b4j.example.xlutils*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _openword(b4j.example.wordutils __ref,String _filepath) throws Exception{
RDebugUtils.currentModule="wordutils";
if (Debug.shouldDelegate(ba, "openword", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "openword", new Object[] {_filepath}));}
ResumableSub_OpenWord rsub = new ResumableSub_OpenWord(this,__ref,_filepath);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenWord extends BA.ResumableSub {
public ResumableSub_OpenWord(b4j.example.wordutils parent,b4j.example.wordutils __ref,String _filepath) {
this.parent = parent;
this.__ref = __ref;
this._filepath = _filepath;
this.__ref = parent;
}
b4j.example.wordutils __ref;
b4j.example.wordutils parent;
String _filepath;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="wordutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Wait For (xl.OpenExcel(FilePath)) Complete (Succe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "wordutils", "openword"), __ref._xl /*b4j.example.xlutils*/ ._openexcel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filepath));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellconverttopdf(b4j.example.wordutils __ref,String _inputfile,String _outputfile,boolean _openpdf) throws Exception{
RDebugUtils.currentModule="wordutils";
if (Debug.shouldDelegate(ba, "powershellconverttopdf", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "powershellconverttopdf", new Object[] {_inputfile,_outputfile,_openpdf}));}
ResumableSub_PowerShellConvertToPdf rsub = new ResumableSub_PowerShellConvertToPdf(this,__ref,_inputfile,_outputfile,_openpdf);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellConvertToPdf extends BA.ResumableSub {
public ResumableSub_PowerShellConvertToPdf(b4j.example.wordutils parent,b4j.example.wordutils __ref,String _inputfile,String _outputfile,boolean _openpdf) {
this.parent = parent;
this.__ref = __ref;
this._inputfile = _inputfile;
this._outputfile = _outputfile;
this._openpdf = _openpdf;
this.__ref = parent;
}
b4j.example.wordutils __ref;
b4j.example.wordutils parent;
String _inputfile;
String _outputfile;
boolean _openpdf;
String _s = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="wordutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="File.Delete(OutputFile, \"\")";
parent.__c.File.Delete(_outputfile,"");
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="If File.Exists(OutputFile, \"\") Then";
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
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Log(\"Cannot delete output file\")";
parent.__c.LogImpl("97340035","Cannot delete output file",0);
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Dim s As String = $\" 	& {$objWord = New-Object -C";
_s = ("\n"+"	& {$objWord = New-Object -ComObject word.application\n"+"$document  = $objWord.Documents.open('"+parent.__c.SmartStringFormatter("",(Object)(_inputfile))+"')\n"+"  $document.SaveAs([ref] '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"', [ref] 17)\n"+"    $document.Close()\n"+"$objWord.Quit()}");
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Wait For (xl.PowerShellScript(s)) Complete (Resul";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "wordutils", "powershellconverttopdf"), __ref._xl /*b4j.example.xlutils*/ ._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_s));
this.state = 15;
return;
case 15:
//C
this.state = 5;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[1];
;
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="If Result.ExitCode <> 0 Then Return False";
if (true) break;

case 5:
//if
this.state = 10;
if (_result.ExitCode!=0) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="If OpenPdf Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_openpdf) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="Wait For (xl.PowerShellScript($\"& {Invoke-Item '";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "wordutils", "powershellconverttopdf"), __ref._xl /*b4j.example.xlutils*/ ._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,("& {Invoke-Item '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"'}")));
this.state = 16;
return;
case 16:
//C
this.state = 14;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[1];
;
RDebugUtils.currentLine=7340049;
 //BA.debugLineNum = 7340049;BA.debugLine="Return Result.ExitCode = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result.ExitCode==0));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}