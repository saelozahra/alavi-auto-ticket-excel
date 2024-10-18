package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
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
            frm.initWithStage(ba, stage, 720, 520);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.b4xtable _b4xtable1 = null;
public static b4j.example.xlutils _xl = null;
public static String _operationtype = "";
public static String _bcname = "";
public static String _uname = "";
public static String _gardesh = "";
public static String _mellicode = "";
public static String _mablaghril = "";
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _fileaddress = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _sheetcombo = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 26;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 27;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\") 'Load the";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
 //BA.debugLineNum = 28;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 30;BA.debugLine="SheetCombo.Items.AddAll(Array As Int(0, 1, 2, 3,";
_sheetcombo.getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (0),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10)}));
 //BA.debugLineNum = 32;BA.debugLine="If File.Exists(File.DirApp, \"excelurl\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excelurl")) { 
 //BA.debugLineNum = 33;BA.debugLine="fileaddress.Text = File.ReadString(File.DirApp,";
_fileaddress.setText(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excelurl"));
 };
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static void  _b4xtable1_cellclicked(String _columnid,long _rowid) throws Exception{
ResumableSub_B4XTable1_CellClicked rsub = new ResumableSub_B4XTable1_CellClicked(null,_columnid,_rowid);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XTable1_CellClicked extends BA.ResumableSub {
public ResumableSub_B4XTable1_CellClicked(b4j.example.main parent,String _columnid,long _rowid) {
this.parent = parent;
this._columnid = _columnid;
this._rowid = _rowid;
}
b4j.example.main parent;
String _columnid;
long _rowid;
Object _sf = null;
int _result = 0;
b4j.example.view_ui _vu = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 77;BA.debugLine="Log(\"Row: \"& B4XTable1.GetRow(RowId))";
anywheresoftware.b4a.keywords.Common.LogImpl("5262145","Row: "+BA.ObjectToString(parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid)),0);
 //BA.debugLineNum = 78;BA.debugLine="Log(\"Column: \"& B4XTable1.GetColumn(ColumnId))";
anywheresoftware.b4a.keywords.Common.LogImpl("5262146","Column: "+BA.ObjectToString(parent._b4xtable1._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (_columnid)),0);
 //BA.debugLineNum = 80;BA.debugLine="BCName = B4XTable1.GetRow(RowId).Get(\"بانک\")";
parent._bcname = BA.ObjectToString(parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid).Get((Object)("بانک")));
 //BA.debugLineNum = 81;BA.debugLine="UName = B4XTable1.GetRow(RowId).Get(\"نام خانوادگی";
parent._uname = BA.ObjectToString(parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid).Get((Object)("نام خانوادگی")));
 //BA.debugLineNum = 82;BA.debugLine="UName = UName.Replace(\" null\", \"\").Replace(\"آقا\",";
parent._uname = parent._uname.replace(" null","").replace("آقا","آقای");
 //BA.debugLineNum = 83;BA.debugLine="Gardesh = B4XTable1.GetRow(RowId).Get(\"گردش\")";
parent._gardesh = BA.ObjectToString(parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid).Get((Object)("گردش")));
 //BA.debugLineNum = 84;BA.debugLine="MelliCode = B4XTable1.GetRow(RowId).Get(\"کد ملی\")";
parent._mellicode = BA.ObjectToString(parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid).Get((Object)("کد ملی")));
 //BA.debugLineNum = 85;BA.debugLine="MablaghRil = B4XTable1.GetRow(RowId).Get(\"مبلغ\").";
parent._mablaghril = (BA.ObjectToString(parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid).Get((Object)("مبلغ")))).replace("E9","00,000,000").replace("E8","0,000,000");
 //BA.debugLineNum = 86;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 //BA.debugLineNum = 88;BA.debugLine="OperationType = \"moarefi\"";
parent._operationtype = "moarefi";
 //BA.debugLineNum = 89;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"میخوای نامه";
_sf = parent._xui.Msgbox2Async(ba,"میخوای نامه معرفی بزنی یا آزادسازی مرحله دوم؟","چه نامه‌ای میخوای؟","آزادسازی مرحله دوم","لغو","معرفی",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 90;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, this, _sf);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (int) result[0];
;
 //BA.debugLineNum = 91;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 92;BA.debugLine="Log(\"Deleted!!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5262160","Deleted!!!",0);
 //BA.debugLineNum = 93;BA.debugLine="OperationType = \"azad\"";
parent._operationtype = "azad";
 if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 96;BA.debugLine="Dim vu As view_ui";
_vu = new b4j.example.view_ui();
 //BA.debugLineNum = 97;BA.debugLine="vu.Initialize(MainForm)";
_vu._initialize /*String*/ (ba,parent._mainform);
 //BA.debugLineNum = 98;BA.debugLine="vu.Show";
_vu._show /*String*/ ();
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 //BA.debugLineNum = 102;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5262170",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _fileaddress_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Private Sub fileaddress_TextChanged (Old As String";
 //BA.debugLineNum = 60;BA.debugLine="Try";
try { //BA.debugLineNum = 61;BA.debugLine="File.WriteString(File.DirApp, \"excelurl\", New)";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excelurl",_new);
 //BA.debugLineNum = 63;BA.debugLine="If Not(File.Exists(\"\", New)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists("",_new))) { 
 //BA.debugLineNum = 64;BA.debugLine="fileaddress.Text = \"\"";
_fileaddress.setText("");
 };
 //BA.debugLineNum = 67;BA.debugLine="If New.Length>10 Then";
if (_new.length()>10) { 
 //BA.debugLineNum = 68;BA.debugLine="File.Copy(\"\", New, File.DirApp, \"excel.xlsx\")";
anywheresoftware.b4a.keywords.Common.File.Copy("",_new,anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excel.xlsx");
 //BA.debugLineNum = 69;BA.debugLine="LoadSheet(0)";
_loadsheet((int) (0));
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 72;BA.debugLine="File.WriteString(File.DirApp, \"excelurl\", \"\")";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excelurl","");
 };
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _loadsheet(int _index) throws Exception{
b4j.example.xlreaderresult _result = null;
anywheresoftware.b4a.objects.collections.List _tabledata = null;
int _row1based = 0;
String _city = "";
String _namefamily = "";
String _father = "";
String _melli = "";
String _mablagh = "";
String _bank = "";
String _thisgardesh = "";
 //BA.debugLineNum = 114;BA.debugLine="Private Sub LoadSheet(Index As Int)";
 //BA.debugLineNum = 116;BA.debugLine="XL.Initialize";
_xl._initialize /*String*/ (ba);
 //BA.debugLineNum = 118;BA.debugLine="Dim result As XLReaderResult = XL.Reader.ReadShee";
_result = _xl._reader /*b4j.example.xlreader*/ ._readsheetbyindex /*b4j.example.xlreaderresult*/ (anywheresoftware.b4a.keywords.Common.File.getDirApp(),"excel.xlsx",_index);
 //BA.debugLineNum = 121;BA.debugLine="result.LogResult(True)";
_result._logresult /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 123;BA.debugLine="B4XTable1.HeaderFont=fx.LoadFont(File.DirAssets,";
_b4xtable1._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Ray-Black.ttf",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15))).getObject()));
 //BA.debugLineNum = 124;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"B1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (BA.ObjectToString(_result._get /*Object*/ (_xl._addressname /*b4j.example.xlutils._xladdress*/ ("B1"))),_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 125;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"C1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (BA.ObjectToString(_result._get /*Object*/ (_xl._addressname /*b4j.example.xlutils._xladdress*/ ("C1"))),_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 127;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"AN";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (BA.ObjectToString(_result._get /*Object*/ (_xl._addressname /*b4j.example.xlutils._xladdress*/ ("AN1"))),_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 128;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"E1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (BA.ObjectToString(_result._get /*Object*/ (_xl._addressname /*b4j.example.xlutils._xladdress*/ ("E1"))),_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 129;BA.debugLine="B4XTable1.AddColumn(\"مبلغ\", B4XTable1.COLUMN_TYPE";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ ("مبلغ",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 130;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"Z1";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (BA.ObjectToString(_result._get /*Object*/ (_xl._addressname /*b4j.example.xlutils._xladdress*/ ("Z1"))),_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 131;BA.debugLine="B4XTable1.AddColumn(result.Get(XL.AddressName(\"AO";
_b4xtable1._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (BA.ObjectToString(_result._get /*Object*/ (_xl._addressname /*b4j.example.xlutils._xladdress*/ ("AO1"))),_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 132;BA.debugLine="Dim TableData As List";
_tabledata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 133;BA.debugLine="TableData.Initialize";
_tabledata.Initialize();
 //BA.debugLineNum = 134;BA.debugLine="For Row1Based = 7 To result.BottomRight.Row0Based";
{
final int step14 = 1;
final int limit14 = (int) (_result._bottomright /*b4j.example.xlutils._xladdress*/ .Row0Based /*int*/ +1);
_row1based = (int) (7) ;
for (;_row1based <= limit14 ;_row1based = _row1based + step14 ) {
 //BA.debugLineNum = 135;BA.debugLine="Dim City As String = result.Get(XL.AddressOne(\"B";
_city = BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("B",_row1based)));
 //BA.debugLineNum = 136;BA.debugLine="Dim NameFamily As String = result.Get(XL.Address";
_namefamily = BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("D",_row1based)))+" "+BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("B",_row1based)))+" "+BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("C",_row1based)));
 //BA.debugLineNum = 137;BA.debugLine="Dim Father As String = result.Get(XL.AddressOne(";
_father = BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("AN",_row1based)));
 //BA.debugLineNum = 138;BA.debugLine="Dim Melli As String = result.Get(XL.AddressOne(\"";
_melli = BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("E",_row1based)));
 //BA.debugLineNum = 140;BA.debugLine="Melli = Melli.Replace(\".\", \"\").Replace(\"E9\", \"\")";
_melli = _melli.replace(".","").replace("E9","");
 //BA.debugLineNum = 141;BA.debugLine="Dim Mablagh As String = result.Get(XL.AddressOne";
_mablagh = BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("G",_row1based)));
 //BA.debugLineNum = 142;BA.debugLine="Dim Bank As String = result.Get(XL.AddressOne(\"Z";
_bank = BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("Z",_row1based)))+" شعبه "+BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("AA",_row1based)));
 //BA.debugLineNum = 143;BA.debugLine="Dim ThisGardesh As String = result.Get(XL.Addres";
_thisgardesh = BA.ObjectToString(_result._get /*Object*/ (_xl._addressone /*b4j.example.xlutils._xladdress*/ ("AO",_row1based)));
 //BA.debugLineNum = 144;BA.debugLine="TableData.Add(Array(City, NameFamily, Father, Me";
_tabledata.Add((Object)(new Object[]{(Object)(_city),(Object)(_namefamily),(Object)(_father),(Object)(_melli),(Object)(_mablagh),(Object)(_bank),(Object)(_thisgardesh)}));
 }
};
 //BA.debugLineNum = 146;BA.debugLine="B4XTable1.SetData(TableData)";
_b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_tabledata);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
main._process_globals();
xuiviewsutils._process_globals();
b4xcollections._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4j.example.b4xtable();
 //BA.debugLineNum = 11;BA.debugLine="Private XL As XLUtils";
_xl = new b4j.example.xlutils();
 //BA.debugLineNum = 13;BA.debugLine="Public OperationType As String";
_operationtype = "";
 //BA.debugLineNum = 14;BA.debugLine="Public BCName As String";
_bcname = "";
 //BA.debugLineNum = 15;BA.debugLine="Public UName As String";
_uname = "";
 //BA.debugLineNum = 16;BA.debugLine="Public Gardesh As String";
_gardesh = "";
 //BA.debugLineNum = 17;BA.debugLine="Public MelliCode As String";
_mellicode = "";
 //BA.debugLineNum = 18;BA.debugLine="Public MablaghRil As String";
_mablaghril = "";
 //BA.debugLineNum = 20;BA.debugLine="Private fileaddress As TextField";
_fileaddress = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private SheetCombo As ComboBox";
_sheetcombo = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _select_file_btn_click() throws Exception{
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _u = "";
String _name = "";
String _parent = "";
 //BA.debugLineNum = 40;BA.debugLine="Private Sub select_file_btn_Click";
 //BA.debugLineNum = 42;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 43;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="fc.SetExtensionFilter(\"یک فایل اکسل انتخاب کنید\",";
_fc.SetExtensionFilter("یک فایل اکسل انتخاب کنید",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.xls","*.xlsx","*.csv","*.xml"}));
 //BA.debugLineNum = 46;BA.debugLine="Dim u As String";
_u = "";
 //BA.debugLineNum = 47;BA.debugLine="u = fc.ShowOpen(MainForm)";
_u = _fc.ShowOpen(_mainform);
 //BA.debugLineNum = 49;BA.debugLine="Dim name As String";
_name = "";
 //BA.debugLineNum = 50;BA.debugLine="Dim parent As String";
_parent = "";
 //BA.debugLineNum = 51;BA.debugLine="parent = File.GetFileParent(u)";
_parent = anywheresoftware.b4a.keywords.Common.File.GetFileParent(_u);
 //BA.debugLineNum = 52;BA.debugLine="name = File.GetName(u)";
_name = anywheresoftware.b4a.keywords.Common.File.GetName(_u);
 //BA.debugLineNum = 54;BA.debugLine="Log(name)";
anywheresoftware.b4a.keywords.Common.LogImpl("5131086",_name,0);
 //BA.debugLineNum = 55;BA.debugLine="Log(parent)";
anywheresoftware.b4a.keywords.Common.LogImpl("5131087",_parent,0);
 //BA.debugLineNum = 56;BA.debugLine="fileaddress.Text = parent&\"\\\"&name";
_fileaddress.setText(_parent+"\\"+_name);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _sheetcombo_valuechanged(Object _value) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Private Sub SheetCombo_ValueChanged (Value As Obje";
 //BA.debugLineNum = 109;BA.debugLine="xui.MsgboxAsync(\"بارگزاری شیت \"&Value, Value)";
_xui.MsgboxAsync(ba,"بارگزاری شیت "+BA.ObjectToString(_value),BA.ObjectToString(_value));
 //BA.debugLineNum = 110;BA.debugLine="LoadSheet(Value)";
_loadsheet((int)(BA.ObjectToNumber(_value)));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
}
