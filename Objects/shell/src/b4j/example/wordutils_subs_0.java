package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wordutils_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public xl As XLUtils";
wordutils._xl = RemoteObject.createNew ("b4j.example.xlutils");__ref.setField("_xl",wordutils._xl);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createdocument(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateDocument (wordutils) ","wordutils",11,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("createdocument")) { return __ref.runUserSub(false, "wordutils","createdocument", __ref);}
RemoteObject _doc = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _wd = RemoteObject.declareNull("b4j.example.worddocument");
 BA.debugLineNum = 10;BA.debugLine="Public Sub CreateDocument As WordDocument";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="Dim doc As JavaObject";
Debug.JustUpdateDeviceLine();
_doc = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("doc", _doc);
 BA.debugLineNum = 12;BA.debugLine="doc.InitializeNewInstance(\"org.apache.poi.xwpf.us";
Debug.JustUpdateDeviceLine();
_doc.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.xwpf.usermodel.XWPFDocument")),(Object)((wordutils.__c.getField(false,"Null"))));
 BA.debugLineNum = 13;BA.debugLine="Dim wd As WordDocument";
Debug.JustUpdateDeviceLine();
_wd = RemoteObject.createNew ("b4j.example.worddocument");Debug.locals.put("wd", _wd);
 BA.debugLineNum = 14;BA.debugLine="wd.Initialize(Me, doc)";
Debug.JustUpdateDeviceLine();
_wd.runClassMethod (b4j.example.worddocument.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_doc));
 BA.debugLineNum = 15;BA.debugLine="Return wd";
Debug.JustUpdateDeviceLine();
if (true) return _wd;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (wordutils) ","wordutils",11,__ref.getField(false, "ba"),__ref,5);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "wordutils","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 6;BA.debugLine="xl.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openword(RemoteObject __ref,RemoteObject _filepath) throws Exception{
try {
		Debug.PushSubsStack("OpenWord (wordutils) ","wordutils",11,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("openword")) { return __ref.runUserSub(false, "wordutils","openword", __ref, _filepath);}
ResumableSub_OpenWord rsub = new ResumableSub_OpenWord(null,__ref,_filepath);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_OpenWord extends BA.ResumableSub {
public ResumableSub_OpenWord(b4j.example.wordutils parent,RemoteObject __ref,RemoteObject _filepath) {
this.parent = parent;
this.__ref = __ref;
this._filepath = _filepath;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.wordutils parent;
RemoteObject _filepath;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("OpenWord (wordutils) ","wordutils",11,__ref.getField(false, "ba"),__ref,21);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("FilePath", _filepath);
 BA.debugLineNum = 22;BA.debugLine="Wait For (xl.OpenExcel(FilePath)) Complete (Succe";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wordutils", "openword"), __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_openexcel" /*RemoteObject*/ ,(Object)(_filepath)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 23;BA.debugLine="Return Success";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _powershellconverttopdf(RemoteObject __ref,RemoteObject _inputfile,RemoteObject _outputfile,RemoteObject _openpdf) throws Exception{
try {
		Debug.PushSubsStack("PowerShellConvertToPdf (wordutils) ","wordutils",11,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("powershellconverttopdf")) { return __ref.runUserSub(false, "wordutils","powershellconverttopdf", __ref, _inputfile, _outputfile, _openpdf);}
ResumableSub_PowerShellConvertToPdf rsub = new ResumableSub_PowerShellConvertToPdf(null,__ref,_inputfile,_outputfile,_openpdf);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PowerShellConvertToPdf extends BA.ResumableSub {
public ResumableSub_PowerShellConvertToPdf(b4j.example.wordutils parent,RemoteObject __ref,RemoteObject _inputfile,RemoteObject _outputfile,RemoteObject _openpdf) {
this.parent = parent;
this.__ref = __ref;
this._inputfile = _inputfile;
this._outputfile = _outputfile;
this._openpdf = _openpdf;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.wordutils parent;
RemoteObject _inputfile;
RemoteObject _outputfile;
RemoteObject _openpdf;
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell.ShellSyncResult");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PowerShellConvertToPdf (wordutils) ","wordutils",11,__ref.getField(false, "ba"),__ref,28);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("InputFile", _inputfile);
Debug.locals.put("OutputFile", _outputfile);
Debug.locals.put("OpenPdf", _openpdf);
 BA.debugLineNum = 29;BA.debugLine="File.Delete(OutputFile, \"\")";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_outputfile),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="If File.Exists(OutputFile, \"\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_outputfile),(Object)(RemoteObject.createImmutable(""))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 31;BA.debugLine="Log(\"Cannot delete output file\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","97340035",RemoteObject.createImmutable("Cannot delete output file"),0);
 BA.debugLineNum = 32;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 35;BA.debugLine="Dim s As String = $\" 	& {$objWord = New-Object -C";
Debug.JustUpdateDeviceLine();
_s = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	& {$objWord = New-Object -ComObject word.application\n"),RemoteObject.createImmutable("$document  = $objWord.Documents.open('"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_inputfile))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("  $document.SaveAs([ref] '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_outputfile))),RemoteObject.createImmutable("', [ref] 17)\n"),RemoteObject.createImmutable("    $document.Close()\n"),RemoteObject.createImmutable("$objWord.Quit()}")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 41;BA.debugLine="Wait For (xl.PowerShellScript(s)) Complete (Resul";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wordutils", "powershellconverttopdf"), __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_powershellscript" /*RemoteObject*/ ,(Object)(_s)));
this.state = 15;
return;
case 15:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 42;BA.debugLine="If Result.ExitCode <> 0 Then Return False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_result.getField(true,"ExitCode"),BA.numberCast(double.class, 0))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 43;BA.debugLine="If OpenPdf Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 14;
if (_openpdf.<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 44;BA.debugLine="Wait For (xl.PowerShellScript($\"& {Invoke-Item '";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wordutils", "powershellconverttopdf"), __ref.getField(false,"_xl" /*RemoteObject*/ ).runClassMethod (b4j.example.xlutils.class, "_powershellscript" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("& {Invoke-Item '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_outputfile))),RemoteObject.createImmutable("'}"))))));
this.state = 16;
return;
case 16:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 45;BA.debugLine="Return Result.ExitCode = 0";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_result.getField(true,"ExitCode"),BA.numberCast(double.class, 0)))));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 47;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}