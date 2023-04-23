package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 888, 888);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.b4xtable _b4xtable1 = null;
public static b4j.example.xlutils _xl = null;
public static String _bcname = "";
public static String _uname = "";
public static String _fathername = "";
public static String _mellicode = "";
public static String _mablaghril = "";
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _fileaddress = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _sheetcombo = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\") 'Load the";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="SheetCombo.Items.AddAll(Array As Int(0, 1, 2, 3,";
_sheetcombo.getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (0),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10)}));
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="If File.Exists(File.DirApp, \"excelurl\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excelurl")) { 
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="fileaddress.Text = File.ReadString(File.DirApp,";
_fileaddress.setText(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excelurl"));
 };
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="End Sub";
return "";
}
public static String  _b4xtable1_cellclicked(String _columnid,long _rowid) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "b4xtable1_cellclicked", false))
	 {return ((String) Debug.delegate(ba, "b4xtable1_cellclicked", new Object[] {_columnid,_rowid}));}
b4j.example.view_ui _vu = null;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Log(B4XTable1.GetRow(RowId))";
anywheresoftware.b4a.keywords.Common.LogImpl("6262145",BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid)),0);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="BCName = B4XTable1.GetRow(RowId).Get(\"بانک عامل\")";
_bcname = BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid).Get((Object)("بانک عامل")));
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="UName = B4XTable1.GetRow(RowId).Get(\"نام\")&\" \"&B4";
_uname = BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid).Get((Object)("نام")))+" "+BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid).Get((Object)("نام خانوادگی")));
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="UName = UName.Replace(\" null\", \"\")";
_uname = _uname.replace(" null","");
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="FatherName = B4XTable1.GetRow(RowId).Get(\"نام پدر";
_fathername = BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid).Get((Object)("نام پدر")));
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="MelliCode = B4XTable1.GetRow(RowId).Get(\"کد ملی\")";
_mellicode = BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid).Get((Object)("کد ملی")));
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="MablaghRil = B4XTable1.GetRow(RowId).Get(\"مبلغ تس";
_mablaghril = (BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid).Get((Object)("مبلغ تسهیلات(ریال)")))).replace("E9","00,000,000").replace("E8","0,000,000");
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Try";
try {RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="Dim vu As view_ui";
_vu = new b4j.example.view_ui();
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="vu.Initialize(MainForm)";
_vu._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="vu.Show";
_vu._show /*String*/ (null);
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6262158",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="End Sub";
return "";
}
public static String  _fileaddress_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "fileaddress_textchanged", false))
	 {return ((String) Debug.delegate(ba, "fileaddress_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub fileaddress_TextChanged (Old As String";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="File.WriteString(File.DirApp, \"excelurl\", New)";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excelurl",_new);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="If New.Length>10 Then";
if (_new.length()>10) { 
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="File.Copy(\"\", New, File.DirApp, \"excel.xlsx\")";
anywheresoftware.b4a.keywords.Common.File.Copy("",_new,anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excel.xlsx");
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="LoadSheet(0)";
_loadsheet((int) (0));
 };
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="End Sub";
return "";
}
public static String  _loadsheet(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "loadsheet", false))
	 {return ((String) Debug.delegate(ba, "loadsheet", new Object[] {_index}));}
b4j.example.xlreaderresult _result = null;
anywheresoftware.b4a.objects.collections.List _tabledata = null;
int _row1based = 0;
String _city = "";
String _namefamily = "";
String _father = "";
String _melli = "";
String _mablagh = "";
String _bank = "";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub LoadSheet(Index As Int)";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="XL.Initialize";
_xl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim result As XLReaderResult = XL.Reader.ReadShee";
_result = _xl._reader /*b4j.example.xlreader*/ ._readsheetbyindex /*b4j.example.xlreaderresult*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excel.xlsx",_index);
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="result.LogResult(True)";
_result._logresult /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"A1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressname /*b4j.example.xlutils._xladdress*/ (null,"A1"))),_b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"B1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressname /*b4j.example.xlutils._xladdress*/ (null,"B1"))),_b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"D1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressname /*b4j.example.xlutils._xladdress*/ (null,"D1"))),_b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"E1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressname /*b4j.example.xlutils._xladdress*/ (null,"E1"))),_b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"G1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressname /*b4j.example.xlutils._xladdress*/ (null,"G1"))),_b4xtable1._column_type_numbers /*int*/ );
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"H1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressname /*b4j.example.xlutils._xladdress*/ (null,"H1"))),_b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="Dim TableData As List";
_tabledata = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="TableData.Initialize";
_tabledata.Initialize();
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="For Row1Based = 6 To result.BottomRight.Row0Based";
{
final int step12 = 1;
final int limit12 = (int) (_result._bottomright /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ +1);
_row1based = (int) (6) ;
for (;_row1based <= limit12 ;_row1based = _row1based + step12 ) {
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="Dim City As String = result.Get(XL.AddressOne(\"A";
_city = BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"A",_row1based)));
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="Dim NameFamily As String = result.Get(XL.Address";
_namefamily = BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"B",_row1based)))+" "+BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"C",_row1based)));
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="Dim Father As String = result.Get(XL.AddressOne(";
_father = BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"D",_row1based)));
RDebugUtils.currentLine=393239;
 //BA.debugLineNum = 393239;BA.debugLine="Dim Melli As String = result.Get(XL.AddressOne(\"";
_melli = BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"E",_row1based)));
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="Melli = Melli.Replace(\".\", \"\").Replace(\"E9\", \"\")";
_melli = _melli.replace(".","").replace("E9","");
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="Dim Mablagh As String = result.Get(XL.AddressOne";
_mablagh = BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"G",_row1based)));
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="Dim Bank As String = result.Get(XL.AddressOne(\"H";
_bank = BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"H",_row1based)))+" شعبه "+BA.ObjectToString(_result._get /*Object*/ (null,_xl._addressone /*b4j.example.xlutils._xladdress*/ (null,"I",_row1based)));
RDebugUtils.currentLine=393244;
 //BA.debugLineNum = 393244;BA.debugLine="TableData.Add(Array(City, NameFamily, Father, Me";
_tabledata.Add((Object)(new Object[]{(Object)(_city),(Object)(_namefamily),(Object)(_father),(Object)(_melli),(Object)(_mablagh),(Object)(_bank)}));
 }
};
RDebugUtils.currentLine=393246;
 //BA.debugLineNum = 393246;BA.debugLine="B4XTable1.SetData(TableData)";
_b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_tabledata);
RDebugUtils.currentLine=393248;
 //BA.debugLineNum = 393248;BA.debugLine="End Sub";
return "";
}
public static String  _select_file_btn_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "select_file_btn_click", false))
	 {return ((String) Debug.delegate(ba, "select_file_btn_click", null));}
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _u = "";
String _name = "";
String _parent = "";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub select_file_btn_Click";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="fc.SetExtensionFilter(\"یک فایل اکسل انتخاب کنید\",";
_fc.SetExtensionFilter("یک فایل اکسل انتخاب کنید",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.xls","*.xlsx","*.csv","*.xml"}));
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Dim u As String";
_u = "";
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="u = fc.ShowOpen(MainForm)";
_u = _fc.ShowOpen(_mainform);
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="Dim name As String";
_name = "";
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="Dim parent As String";
_parent = "";
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="parent = File.GetFileParent(u)";
_parent = anywheresoftware.b4a.keywords.Common.File.GetFileParent(_u);
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="name = File.GetName(u)";
_name = anywheresoftware.b4a.keywords.Common.File.GetName(_u);
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="Log(name)";
anywheresoftware.b4a.keywords.Common.LogImpl("6131085",_name,0);
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Log(parent)";
anywheresoftware.b4a.keywords.Common.LogImpl("6131086",_parent,0);
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="fileaddress.Text = parent&\"\\\"&name";
_fileaddress.setText(_parent+"\\"+_name);
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="End Sub";
return "";
}
public static String  _sheetcombo_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "sheetcombo_valuechanged", false))
	 {return ((String) Debug.delegate(ba, "sheetcombo_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub SheetCombo_ValueChanged (Value As Obje";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="xui.MsgboxAsync(\"بارگزاری شیت \"&Value, Value)";
_xui.MsgboxAsync(ba,"بارگزاری شیت "+BA.ObjectToString(_value),BA.ObjectToString(_value));
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="LoadSheet(Value)";
_loadsheet((int)(BA.ObjectToNumber(_value)));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="End Sub";
return "";
}
}