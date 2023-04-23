package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,23);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 23;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(16777216);
main._mainform = _form1;
 BA.debugLineNum = 26;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\") 'Load the";
Debug.ShouldStop(33554432);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Layout1")));
 BA.debugLineNum = 27;BA.debugLine="MainForm.Show";
Debug.ShouldStop(67108864);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 29;BA.debugLine="SheetCombo.Items.AddAll(Array As Int(0, 1, 2, 3,";
Debug.ShouldStop(268435456);
main._sheetcombo.runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("int",new int[] {11},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10)})))));
 BA.debugLineNum = 31;BA.debugLine="If File.Exists(File.DirApp, \"excelurl\") Then";
Debug.ShouldStop(1073741824);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("excelurl"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 32;BA.debugLine="fileaddress.Text = File.ReadString(File.DirApp,";
Debug.ShouldStop(-2147483648);
main._fileaddress.runMethod(true,"setText",main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("excelurl"))));
 };
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xtable1_cellclicked(RemoteObject _columnid,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("B4XTable1_CellClicked (main) ","main",0,main.ba,main.mostCurrent,68);
if (RapidSub.canDelegate("b4xtable1_cellclicked")) { return b4j.example.main.remoteMe.runUserSub(false, "main","b4xtable1_cellclicked", _columnid, _rowid);}
RemoteObject _vu = RemoteObject.declareNull("b4j.example.view_ui");
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 68;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Log(B4XTable1.GetRow(RowId))";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("LogImpl","6262145",BA.ObjectToString(main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid))),0);
 BA.debugLineNum = 70;BA.debugLine="BCName = B4XTable1.GetRow(RowId).Get(\"بانک عامل\")";
Debug.ShouldStop(32);
main._bcname = BA.ObjectToString(main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid)).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("بانک عامل")))));
 BA.debugLineNum = 71;BA.debugLine="UName = B4XTable1.GetRow(RowId).Get(\"نام\")&\" \"&B4";
Debug.ShouldStop(64);
main._uname = RemoteObject.concat(main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid)).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("نام")))),RemoteObject.createImmutable(" "),main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid)).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("نام خانوادگی")))));
 BA.debugLineNum = 72;BA.debugLine="UName = UName.Replace(\" null\", \"\")";
Debug.ShouldStop(128);
main._uname = main._uname.runMethod(true,"replace",(Object)(BA.ObjectToString(" null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 73;BA.debugLine="FatherName = B4XTable1.GetRow(RowId).Get(\"نام پدر";
Debug.ShouldStop(256);
main._fathername = BA.ObjectToString(main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid)).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("نام پدر")))));
 BA.debugLineNum = 74;BA.debugLine="MelliCode = B4XTable1.GetRow(RowId).Get(\"کد ملی\")";
Debug.ShouldStop(512);
main._mellicode = BA.ObjectToString(main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid)).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("کد ملی")))));
 BA.debugLineNum = 75;BA.debugLine="MablaghRil = B4XTable1.GetRow(RowId).Get(\"مبلغ تس";
Debug.ShouldStop(1024);
main._mablaghril = (BA.ObjectToString(main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid)).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("مبلغ تسهیلات(ریال)")))))).runMethod(true,"replace",(Object)(BA.ObjectToString("E9")),(Object)(RemoteObject.createImmutable("00,000,000"))).runMethod(true,"replace",(Object)(BA.ObjectToString("E8")),(Object)(RemoteObject.createImmutable("0,000,000")));
 BA.debugLineNum = 76;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 77;BA.debugLine="Dim vu As view_ui";
Debug.ShouldStop(4096);
_vu = RemoteObject.createNew ("b4j.example.view_ui");Debug.locals.put("vu", _vu);
 BA.debugLineNum = 78;BA.debugLine="vu.Initialize(MainForm)";
Debug.ShouldStop(8192);
_vu.runClassMethod (b4j.example.view_ui.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 79;BA.debugLine="vu.Show";
Debug.ShouldStop(16384);
_vu.runClassMethod (b4j.example.view_ui.class, "_show" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e13.toString()); BA.debugLineNum = 82;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
main.__c.runVoidMethod ("LogImpl","6262158",BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba)),0);
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fileaddress_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("fileaddress_TextChanged (main) ","main",0,main.ba,main.mostCurrent,57);
if (RapidSub.canDelegate("fileaddress_textchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","fileaddress_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 57;BA.debugLine="Private Sub fileaddress_TextChanged (Old As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="File.WriteString(File.DirApp, \"excelurl\", New)";
Debug.ShouldStop(33554432);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("excelurl")),(Object)(_new));
 BA.debugLineNum = 59;BA.debugLine="If New.Length>10 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 61;BA.debugLine="File.Copy(\"\", New, File.DirApp, \"excel.xlsx\")";
Debug.ShouldStop(268435456);
main.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(BA.ObjectToString("")),(Object)(_new),(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("excel.xlsx")));
 BA.debugLineNum = 63;BA.debugLine="LoadSheet(0)";
Debug.ShouldStop(1073741824);
_loadsheet(BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsheet(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("LoadSheet (main) ","main",0,main.ba,main.mostCurrent,94);
if (RapidSub.canDelegate("loadsheet")) { return b4j.example.main.remoteMe.runUserSub(false, "main","loadsheet", _index);}
RemoteObject _result = RemoteObject.declareNull("b4j.example.xlreaderresult");
RemoteObject _tabledata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _row1based = 0;
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _namefamily = RemoteObject.createImmutable("");
RemoteObject _father = RemoteObject.createImmutable("");
RemoteObject _melli = RemoteObject.createImmutable("");
RemoteObject _mablagh = RemoteObject.createImmutable("");
RemoteObject _bank = RemoteObject.createImmutable("");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 94;BA.debugLine="Private Sub LoadSheet(Index As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 96;BA.debugLine="XL.Initialize";
Debug.ShouldStop(-2147483648);
main._xl.runClassMethod (b4j.example.xlutils.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 98;BA.debugLine="Dim result As XLReaderResult = XL.Reader.ReadShee";
Debug.ShouldStop(2);
_result = main._xl.getField(false,"_reader" /*RemoteObject*/ ).runClassMethod (b4j.example.xlreader.class, "_readsheetbyindex" /*RemoteObject*/ ,(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("excel.xlsx")),(Object)(_index));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 101;BA.debugLine="result.LogResult(True)";
Debug.ShouldStop(16);
_result.runClassMethod (b4j.example.xlreaderresult.class, "_logresult" /*RemoteObject*/ ,(Object)(main.__c.getField(true,"True")));
 BA.debugLineNum = 103;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"A1";
Debug.ShouldStop(64);
main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("A1"))))))),(Object)(main._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 104;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"B1";
Debug.ShouldStop(128);
main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("B1"))))))),(Object)(main._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 106;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"D1";
Debug.ShouldStop(512);
main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("D1"))))))),(Object)(main._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"E1";
Debug.ShouldStop(1024);
main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("E1"))))))),(Object)(main._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"G1";
Debug.ShouldStop(2048);
main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("G1"))))))),(Object)(main._b4xtable1.getField(true,"_column_type_numbers" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"H1";
Debug.ShouldStop(4096);
main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("H1"))))))),(Object)(main._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 111;BA.debugLine="Dim TableData As List";
Debug.ShouldStop(16384);
_tabledata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("TableData", _tabledata);
 BA.debugLineNum = 112;BA.debugLine="TableData.Initialize";
Debug.ShouldStop(32768);
_tabledata.runVoidMethod ("Initialize");
 BA.debugLineNum = 113;BA.debugLine="For Row1Based = 6 To result.BottomRight.Row0Based";
Debug.ShouldStop(65536);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_result.getField(false,"_bottomright" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue();
_row1based = 6 ;
for (;(step12 > 0 && _row1based <= limit12) || (step12 < 0 && _row1based >= limit12) ;_row1based = ((int)(0 + _row1based + step12))  ) {
Debug.locals.put("Row1Based", _row1based);
 BA.debugLineNum = 114;BA.debugLine="Dim City As String = result.Get(XL.AddressOne(\"A";
Debug.ShouldStop(131072);
_city = BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("A")),(Object)(BA.numberCast(int.class, _row1based))))));Debug.locals.put("City", _city);Debug.locals.put("City", _city);
 BA.debugLineNum = 115;BA.debugLine="Dim NameFamily As String = result.Get(XL.Address";
Debug.ShouldStop(262144);
_namefamily = RemoteObject.concat(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("B")),(Object)(BA.numberCast(int.class, _row1based))))),RemoteObject.createImmutable(" "),_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("C")),(Object)(BA.numberCast(int.class, _row1based))))));Debug.locals.put("NameFamily", _namefamily);Debug.locals.put("NameFamily", _namefamily);
 BA.debugLineNum = 116;BA.debugLine="Dim Father As String = result.Get(XL.AddressOne(";
Debug.ShouldStop(524288);
_father = BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("D")),(Object)(BA.numberCast(int.class, _row1based))))));Debug.locals.put("Father", _father);Debug.locals.put("Father", _father);
 BA.debugLineNum = 117;BA.debugLine="Dim Melli As String = result.Get(XL.AddressOne(\"";
Debug.ShouldStop(1048576);
_melli = BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("E")),(Object)(BA.numberCast(int.class, _row1based))))));Debug.locals.put("Melli", _melli);Debug.locals.put("Melli", _melli);
 BA.debugLineNum = 119;BA.debugLine="Melli = Melli.Replace(\".\", \"\").Replace(\"E9\", \"\")";
Debug.ShouldStop(4194304);
_melli = _melli.runMethod(true,"replace",(Object)(BA.ObjectToString(".")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("E9")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Melli", _melli);
 BA.debugLineNum = 120;BA.debugLine="Dim Mablagh As String = result.Get(XL.AddressOne";
Debug.ShouldStop(8388608);
_mablagh = BA.ObjectToString(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("G")),(Object)(BA.numberCast(int.class, _row1based))))));Debug.locals.put("Mablagh", _mablagh);Debug.locals.put("Mablagh", _mablagh);
 BA.debugLineNum = 121;BA.debugLine="Dim Bank As String = result.Get(XL.AddressOne(\"H";
Debug.ShouldStop(16777216);
_bank = RemoteObject.concat(_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("H")),(Object)(BA.numberCast(int.class, _row1based))))),RemoteObject.createImmutable(" شعبه "),_result.runClassMethod (b4j.example.xlreaderresult.class, "_get" /*RemoteObject*/ ,(Object)(main._xl.runClassMethod (b4j.example.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("I")),(Object)(BA.numberCast(int.class, _row1based))))));Debug.locals.put("Bank", _bank);Debug.locals.put("Bank", _bank);
 BA.debugLineNum = 122;BA.debugLine="TableData.Add(Array(City, NameFamily, Father, Me";
Debug.ShouldStop(33554432);
_tabledata.runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_city),(_namefamily),(_father),(_melli),(_mablagh),(_bank)}))));
 }
}Debug.locals.put("Row1Based", _row1based);
;
 BA.debugLineNum = 124;BA.debugLine="B4XTable1.SetData(TableData)";
Debug.ShouldStop(134217728);
main._b4xtable1.runClassMethod (b4j.example.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(_tabledata));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
view_ui.myClass = BA.getDeviceClass ("b4j.example.view_ui");
b4xbitset.myClass = BA.getDeviceClass ("b4j.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.example.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4j.example.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4j.example.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4j.example.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.example.b4xset");
worddocument.myClass = BA.getDeviceClass ("b4j.example.worddocument");
wordparagraph.myClass = BA.getDeviceClass ("b4j.example.wordparagraph");
wordutils.myClass = BA.getDeviceClass ("b4j.example.wordutils");
xlconditionalformattingrule.myClass = BA.getDeviceClass ("b4j.example.xlconditionalformattingrule");
xlreader.myClass = BA.getDeviceClass ("b4j.example.xlreader");
xlreaderresult.myClass = BA.getDeviceClass ("b4j.example.xlreaderresult");
xlsheetwriter.myClass = BA.getDeviceClass ("b4j.example.xlsheetwriter");
xlstyle.myClass = BA.getDeviceClass ("b4j.example.xlstyle");
xltable.myClass = BA.getDeviceClass ("b4j.example.xltable");
xlutils.myClass = BA.getDeviceClass ("b4j.example.xlutils");
xlworkbookwriter.myClass = BA.getDeviceClass ("b4j.example.xlworkbookwriter");
b4xtable.myClass = BA.getDeviceClass ("b4j.example.b4xtable");
b4xformatter.myClass = BA.getDeviceClass ("b4j.example.b4xformatter");
animatedcounter.myClass = BA.getDeviceClass ("b4j.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4j.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4j.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4j.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4j.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4j.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4j.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4j.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4j.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4j.example.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4j.example.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4j.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4j.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4j.example.madewithlove");
roundslider.myClass = BA.getDeviceClass ("b4j.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4j.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4j.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4j.example.xuiviewsutils");
b4jtextflow.myClass = BA.getDeviceClass ("b4j.example.b4jtextflow");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private B4XTable1 As B4XTable";
main._b4xtable1 = RemoteObject.createNew ("b4j.example.b4xtable");
 //BA.debugLineNum = 11;BA.debugLine="Private XL As XLUtils";
main._xl = RemoteObject.createNew ("b4j.example.xlutils");
 //BA.debugLineNum = 13;BA.debugLine="Public BCName As String";
main._bcname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Public UName As String";
main._uname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Public FatherName As String";
main._fathername = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Public MelliCode As String";
main._mellicode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Public MablaghRil As String";
main._mablaghril = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Private fileaddress As TextField";
main._fileaddress = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private SheetCombo As ComboBox";
main._sheetcombo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _select_file_btn_click() throws Exception{
try {
		Debug.PushSubsStack("select_file_btn_Click (main) ","main",0,main.ba,main.mostCurrent,39);
if (RapidSub.canDelegate("select_file_btn_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","select_file_btn_click");}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _u = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _parent = RemoteObject.createImmutable("");
 BA.debugLineNum = 39;BA.debugLine="Private Sub select_file_btn_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim fc As FileChooser";
Debug.ShouldStop(128);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 41;BA.debugLine="fc.Initialize";
Debug.ShouldStop(256);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="fc.SetExtensionFilter(\"یک فایل اکسل انتخاب کنید\",";
Debug.ShouldStop(512);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("یک فایل اکسل انتخاب کنید")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("*.xls"),BA.ObjectToString("*.xlsx"),BA.ObjectToString("*.csv"),RemoteObject.createImmutable("*.xml")})))));
 BA.debugLineNum = 44;BA.debugLine="Dim u As String";
Debug.ShouldStop(2048);
_u = RemoteObject.createImmutable("");Debug.locals.put("u", _u);
 BA.debugLineNum = 45;BA.debugLine="u = fc.ShowOpen(MainForm)";
Debug.ShouldStop(4096);
_u = _fc.runMethodAndSync(true,"ShowOpen",(Object)(main._mainform));Debug.locals.put("u", _u);
 BA.debugLineNum = 47;BA.debugLine="Dim name As String";
Debug.ShouldStop(16384);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
 BA.debugLineNum = 48;BA.debugLine="Dim parent As String";
Debug.ShouldStop(32768);
_parent = RemoteObject.createImmutable("");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 49;BA.debugLine="parent = File.GetFileParent(u)";
Debug.ShouldStop(65536);
_parent = main.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_u));Debug.locals.put("parent", _parent);
 BA.debugLineNum = 50;BA.debugLine="name = File.GetName(u)";
Debug.ShouldStop(131072);
_name = main.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_u));Debug.locals.put("name", _name);
 BA.debugLineNum = 52;BA.debugLine="Log(name)";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("LogImpl","6131085",_name,0);
 BA.debugLineNum = 53;BA.debugLine="Log(parent)";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("LogImpl","6131086",_parent,0);
 BA.debugLineNum = 54;BA.debugLine="fileaddress.Text = parent&\"\\\"&name";
Debug.ShouldStop(2097152);
main._fileaddress.runMethod(true,"setText",RemoteObject.concat(_parent,RemoteObject.createImmutable("\\"),_name));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sheetcombo_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SheetCombo_ValueChanged (main) ","main",0,main.ba,main.mostCurrent,88);
if (RapidSub.canDelegate("sheetcombo_valuechanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","sheetcombo_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 88;BA.debugLine="Private Sub SheetCombo_ValueChanged (Value As Obje";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="xui.MsgboxAsync(\"بارگزاری شیت \"&Value, Value)";
Debug.ShouldStop(16777216);
main._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("بارگزاری شیت "),_value)),(Object)(BA.ObjectToString(_value)));
 BA.debugLineNum = 90;BA.debugLine="LoadSheet(Value)";
Debug.ShouldStop(33554432);
_loadsheet(BA.numberCast(int.class, _value));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}