package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xtable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xtable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xtable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xtablecolumn{
public boolean IsInitialized;
public String Title;
public String Id;
public int ColumnType;
public boolean Sortable;
public boolean Searchable;
public b4j.example.b4xformatter Formatter;
public String SQLID;
public int Width;
public int ComputedWidth;
public anywheresoftware.b4a.objects.collections.List CellsLayouts;
public anywheresoftware.b4a.objects.B4XViewWrapper Panel;
public int LabelIndex;
public boolean DisableAutoResizeLayout;
public String InternalSortMode;
public void Initialize() {
IsInitialized = true;
Title = "";
Id = "";
ColumnType = 0;
Sortable = false;
Searchable = false;
Formatter = new b4j.example.b4xformatter();
SQLID = "";
Width = 0;
ComputedWidth = 0;
CellsLayouts = new anywheresoftware.b4a.objects.collections.List();
Panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
LabelIndex = 0;
DisableAutoResizeLayout = false;
InternalSortMode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public int _column_type_text = 0;
public int _column_type_numbers = 0;
public int _column_type_date = 0;
public int _column_type_void = 0;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.List _visiblecolumns = null;
public int _mfirstrowindex = 0;
public int _mlastrowindex = 0;
public b4j.example.b4xformatter _defaultformatter = null;
public b4j.example.b4xformatter _defaultdataformatter = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlheader = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnltitles = null;
public b4j.example.customlistview _clvdata = null;
public int _rowheight = 0;
public int _headersheight = 0;
public boolean _allowsmallrowheightmodifications = false;
public int _mrowsperpage = 0;
public boolean _layoutloaded = false;
public int _minimumwidth = 0;
public int _sqlindex = 0;
public int _evenrowcolor = 0;
public int _oddrowcolor = 0;
public int _headertextcolor = 0;
public int _textcolor = 0;
public int _highlighttextcolor = 0;
public int _headercolor = 0;
public int _gridcolor = 0;
public boolean _highlightsearchresults = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _headerfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _labelsfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfirst = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnumber = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnext = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbllast = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfromto = null;
public int _countall = 0;
public int _mcurrentpage = 0;
public int _mcurrentcount = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsort = null;
public b4j.example.b4xfloattextfield _searchfield = null;
public String _filtertext = "";
public int _sleepbeforesearch = 0;
public int _searchindex = 0;
public int _arrowsenabledcolor = 0;
public int _arrowsdisabledcolor = 0;
public anywheresoftware.b4a.objects.collections.List _visiblerowids = null;
public int _selectioncolor = 0;
public String _sqltablename = "";
public String _stringmoreavailable = "";
public String _stringnomatches = "";
public String _stringoutof = "";
public String _stringto = "";
public int _maximumrowsperpage = 0;
public boolean _prefixsearch = false;
public b4j.example.b4jtextflow _textflow = null;
public String _textpanetag = "";
public int _lastbaseheight = 0;
public int _numberoffrozencolumns = 0;
public long _lastcellclickevent = 0L;
public boolean _searchvisible = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.collections.Map  _getrow(b4j.example.b4xtable __ref,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getrow", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getrow", new Object[] {_rowid}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub GetRow(RowId As Long) As Map";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT * F";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("SELECT * FROM data WHERE rowid = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_rowid)}));
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="If rs.NextRow Then";
if (_rs.NextRow()) { 
RDebugUtils.currentLine=20381701;
 //BA.debugLineNum = 20381701;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="Select c.ColumnType";
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,__ref._column_type_text /*int*/ ,__ref._column_type_numbers /*int*/ ,__ref._column_type_date /*int*/ )) {
case 0: {
RDebugUtils.currentLine=20381704;
 //BA.debugLineNum = 20381704;BA.debugLine="m.Put(c.Id, rs.GetString(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetString(_c.SQLID /*String*/ )));
 break; }
case 1: {
RDebugUtils.currentLine=20381706;
 //BA.debugLineNum = 20381706;BA.debugLine="m.Put(c.Id, rs.GetDouble(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetDouble(_c.SQLID /*String*/ )));
 break; }
case 2: {
RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="m.Put(c.Id, rs.GetLong(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetLong(_c.SQLID /*String*/ )));
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=20381712;
 //BA.debugLineNum = 20381712;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=20381713;
 //BA.debugLineNum = 20381713;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=20381714;
 //BA.debugLineNum = 20381714;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xtable._b4xtablecolumn  _addcolumn(b4j.example.b4xtable __ref,String _title,int _columntype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "addcolumn", true))
	 {return ((b4j.example.b4xtable._b4xtablecolumn) Debug.delegate(ba, "addcolumn", new Object[] {_title,_columntype}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _header = null;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub AddColumn (Title As String, ColumnType";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim c As B4XTableColumn";
_c = new b4j.example.b4xtable._b4xtablecolumn();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="c.Initialize";
_c.Initialize();
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="c.Title = Title";
_c.Title /*String*/  = _title;
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="c.ColumnType = ColumnType";
_c.ColumnType /*int*/  = _columntype;
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="c.Sortable = ColumnType <> COLUMN_TYPE_VOID";
_c.Sortable /*boolean*/  = _columntype!=__ref._column_type_void /*int*/ ;
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="c.Searchable = ColumnType = COLUMN_TYPE_TEXT";
_c.Searchable /*boolean*/  = _columntype==__ref._column_type_text /*int*/ ;
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="c.CellsLayouts.Initialize";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="c.Formatter = DefaultDataFormatter";
_c.Formatter /*b4j.example.b4xformatter*/  = __ref._defaultdataformatter /*b4j.example.b4xformatter*/ ;
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="c.Panel = xui.CreatePanel(\"ColumnPanel\")";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"ColumnPanel");
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="c.Panel.Tag = c";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_c));
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="c.Id = Title";
_c.Id /*String*/  = _title;
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="Columns.Add(c)";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="VisibleColumns.Add(c)";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=19529742;
 //BA.debugLineNum = 19529742;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="Dim header As B4XView = GetLabelFromColumn(c, 0)";
_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_header = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,(int) (0));
RDebugUtils.currentLine=19529744;
 //BA.debugLineNum = 19529744;BA.debugLine="SetTextOrCSBuilderToLabel (header, Title)";
__ref._settextorcsbuildertolabel /*String*/ (null,_header,(Object)(_title));
RDebugUtils.currentLine=19529745;
 //BA.debugLineNum = 19529745;BA.debugLine="If LayoutLoaded Then";
if (__ref._layoutloaded /*boolean*/ ) { 
RDebugUtils.currentLine=19529746;
 //BA.debugLineNum = 19529746;BA.debugLine="AddColumnToCLV(c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
RDebugUtils.currentLine=19529748;
 //BA.debugLineNum = 19529748;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=19529749;
 //BA.debugLineNum = 19529749;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setdata(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setdata", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "setdata", new Object[] {_data}));}
ResumableSub_SetData rsub = new ResumableSub_SetData(this,__ref,_data);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetData extends BA.ResumableSub {
public ResumableSub_SetData(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.collections.List _data) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
anywheresoftware.b4a.objects.collections.List _data;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4j.example.b4xtable._b4xtablecolumn _column = null;
Object _lrow = null;
Object[] _row = null;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group7;
int index7;
int groupLen7;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="sql1.InitializeSQLite(\"\", \":memory:\", True)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite("",":memory:",parent.__c.True);
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="CreateTable";
__ref._createtable /*String*/ (null);
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="sb.Append(\"INSERT INTO data VALUES (\")";
_sb.Append("INSERT INTO data VALUES (");
RDebugUtils.currentLine=19726347;
 //BA.debugLineNum = 19726347;BA.debugLine="For Each Column As B4XTableColumn In Columns";
if (true) break;

case 7:
//for
this.state = 16;
group7 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 16;
if (index7 < groupLen7) {
this.state = 9;
_column = (b4j.example.b4xtable._b4xtablecolumn)(group7.Get(index7));}
if (true) break;

case 36:
//C
this.state = 35;
index7++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=19726348;
 //BA.debugLineNum = 19726348;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (true) break;

case 10:
//if
this.state = 15;
if (_column.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 36;
if (true) break;;
if (true) break;

case 15:
//C
this.state = 36;
;
RDebugUtils.currentLine=19726349;
 //BA.debugLineNum = 19726349;BA.debugLine="sb.Append(\"?,\")";
_sb.Append("?,");
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=19726351;
 //BA.debugLineNum = 19726351;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=19726352;
 //BA.debugLineNum = 19726352;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=19726353;
 //BA.debugLineNum = 19726353;BA.debugLine="If Data.Size > 0 Then";
if (true) break;

case 17:
//if
this.state = 34;
if (_data.getSize()>0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=19726354;
 //BA.debugLineNum = 19726354;BA.debugLine="If Data.Get(0) Is List Then";
if (true) break;

case 20:
//if
this.state = 33;
if (_data.Get((int) (0)) instanceof java.util.List) { 
this.state = 22;
}else {
this.state = 28;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=19726355;
 //BA.debugLineNum = 19726355;BA.debugLine="For Each lrow As Object In Data";
if (true) break;

case 23:
//for
this.state = 26;
group15 = _data;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if (index15 < groupLen15) {
this.state = 25;
_lrow = group15.Get(index15);}
if (true) break;

case 38:
//C
this.state = 37;
index15++;
if (true) break;

case 25:
//C
this.state = 38;
RDebugUtils.currentLine=19726356;
 //BA.debugLineNum = 19726356;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, lrow)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_lrow)));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 33;
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=19726359;
 //BA.debugLineNum = 19726359;BA.debugLine="For Each row() As Object In Data";
if (true) break;

case 29:
//for
this.state = 32;
group19 = _data;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 32;
if (index19 < groupLen19) {
this.state = 31;
_row = (Object[])(group19.Get(index19));}
if (true) break;

case 40:
//C
this.state = 39;
index19++;
if (true) break;

case 31:
//C
this.state = 40;
RDebugUtils.currentLine=19726360;
 //BA.debugLineNum = 19726360;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, row)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(_row));
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=19726365;
 //BA.debugLineNum = 19726365;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
_senderfilter = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL1");
RDebugUtils.currentLine=19726367;
 //BA.debugLineNum = 19726367;BA.debugLine="Wait For (SenderFilter) SQL1_NonQueryComplete (Su";
parent.__c.WaitFor("sql1_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "setdata"), _senderfilter);
this.state = 41;
return;
case 41:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=19726369;
 //BA.debugLineNum = 19726369;BA.debugLine="CountAll = Data.Size";
__ref._countall /*int*/  = _data.getSize();
RDebugUtils.currentLine=19726370;
 //BA.debugLineNum = 19726370;BA.debugLine="RefreshNow";
__ref._refreshnow /*String*/ (null);
RDebugUtils.currentLine=19726371;
 //BA.debugLineNum = 19726371;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=19726372;
 //BA.debugLineNum = 19726372;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _createcolumnlayouts(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createcolumnlayouts", true))
	 {return ((String) Debug.delegate(ba, "createcolumnlayouts", new Object[] {_c,_size}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _clr = 0;
int _tclr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Private Sub CreateColumnLayouts (c As B4XTableColu";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="For i = c.CellsLayouts.Size To Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_size-1);
_i = _c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize() ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Dim p As B4XView = CreateCellViews";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createcellviews /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="Dim lbl As B4XView = p.GetView(c.LabelIndex)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="c.CellsLayouts.Add(p)";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="Dim clr, tclr As Int";
_clr = 0;
_tclr = 0;
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="clr = HeaderColor";
_clr = __ref._headercolor /*int*/ ;
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="tclr = HeaderTextColor";
_tclr = __ref._headertextcolor /*int*/ ;
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="fnt = HeaderFont";
_fnt = __ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 }else {
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="fnt = LabelsFont";
_fnt = __ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=19660813;
 //BA.debugLineNum = 19660813;BA.debugLine="tclr = TextColor";
_tclr = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="If i Mod 2 = 1 Then";
if (_i%2==1) { 
RDebugUtils.currentLine=19660815;
 //BA.debugLineNum = 19660815;BA.debugLine="clr = EvenRowColor";
_clr = __ref._evenrowcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=19660817;
 //BA.debugLineNum = 19660817;BA.debugLine="clr = OddRowColor";
_clr = __ref._oddrowcolor /*int*/ ;
 };
 };
RDebugUtils.currentLine=19660820;
 //BA.debugLineNum = 19660820;BA.debugLine="lbl.Font = fnt";
_lbl.setFont(_fnt);
RDebugUtils.currentLine=19660821;
 //BA.debugLineNum = 19660821;BA.debugLine="p.SetColorAndBorder(clr, 1dip, GridColor, 0)";
_p.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._gridcolor /*int*/ ,0);
RDebugUtils.currentLine=19660822;
 //BA.debugLineNum = 19660822;BA.debugLine="lbl.TextColor = tclr";
_lbl.setTextColor(_tclr);
RDebugUtils.currentLine=19660823;
 //BA.debugLineNum = 19660823;BA.debugLine="lbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_lbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=19660824;
 //BA.debugLineNum = 19660824;BA.debugLine="p.Tag = i";
_p.setTag((Object)(_i));
RDebugUtils.currentLine=19660825;
 //BA.debugLineNum = 19660825;BA.debugLine="c.Panel.AddView(p, 0, 0, 0, 0)";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_p.getObject()),0,0,0,0);
 }
};
RDebugUtils.currentLine=19660827;
 //BA.debugLineNum = 19660827;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabelfromcolumn(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getlabelfromcolumn", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabelfromcolumn", new Object[] {_c,_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Private Sub GetLabelFromColumn (c As B4XTableColum";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Return p.GetView(c.LabelIndex)";
if (true) return _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="End Sub";
return null;
}
public String  _settextorcsbuildertolabel(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "settextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub SetTextOrCSBuilderToLabel(xlbl As B4XV";
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToString(_text));
RDebugUtils.currentLine=20119564;
 //BA.debugLineNum = 20119564;BA.debugLine="End Sub";
return "";
}
public String  _addcolumntoclv(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "addcolumntoclv", true))
	 {return ((String) Debug.delegate(ba, "addcolumntoclv", new Object[] {_c}));}
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub AddColumnToCLV (c As B4XTableColumn)";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="clvData.Add(c.Panel, c)";
__ref._clvdata /*b4j.example.customlistview*/ ._add(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.example.b4xtable __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Refresh2 (False, False)";
__ref._refresh2 /*String*/ (null,__c.False,__c.False);
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="End Sub";
return "";
}
public String  _refresh2(b4j.example.b4xtable __ref,boolean _refreshdata,boolean _dontsleep) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refresh2", true))
	 {return ((String) Debug.delegate(ba, "refresh2", new Object[] {_refreshdata,_dontsleep}));}
int _prevrowsperpage = 0;
int _totalheight = 0;
int _columnindex = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
boolean _isfrozen = false;
int _freezedwidth = 0;
int _i = 0;
float _offset = 0f;
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub Refresh2 (RefreshData As Boolean, Dont";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="If LayoutLoaded = False Or VisibleColumns.Size =";
if (__ref._layoutloaded /*boolean*/ ==__c.False || __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Dim PrevRowsPerPage As Int = mRowsPerPage";
_prevrowsperpage = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="If xui.IsB4A And LastBaseHeight <> mBase.Height T";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._lastbaseheight /*int*/ !=__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="clvData.AsView.Height = clvData.AsView.Height -";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().setHeight(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight()-(__ref._lastbaseheight /*int*/ -__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="clvData.Base_Resize(clvData.AsView.Width, clvDat";
__ref._clvdata /*b4j.example.customlistview*/ ._base_resize(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=18350088;
 //BA.debugLineNum = 18350088;BA.debugLine="Dim TotalHeight As Int = clvData.AsView.Height -";
_totalheight = (int) (__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight()-__ref._headersheight /*int*/ );
RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=18350090;
 //BA.debugLineNum = 18350090;BA.debugLine="TotalHeight = TotalHeight - 20";
_totalheight = (int) (_totalheight-20);
 };
RDebugUtils.currentLine=18350092;
 //BA.debugLineNum = 18350092;BA.debugLine="If AllowSmallRowHeightModifications Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ) { 
RDebugUtils.currentLine=18350093;
 //BA.debugLineNum = 18350093;BA.debugLine="mRowsPerPage = Max(0, Round(TotalHeight/ RowHeig";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Round(_totalheight/(double)__ref._rowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=18350095;
 //BA.debugLineNum = 18350095;BA.debugLine="mRowsPerPage = Max(0, Floor(TotalHeight / RowHei";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Floor(_totalheight/(double)__ref._rowheight /*int*/ )));
 };
RDebugUtils.currentLine=18350097;
 //BA.debugLineNum = 18350097;BA.debugLine="If MaximumRowsPerPage > 0 Then";
if (__ref._maximumrowsperpage /*int*/ >0) { 
RDebugUtils.currentLine=18350098;
 //BA.debugLineNum = 18350098;BA.debugLine="mRowsPerPage = Min(MaximumRowsPerPage, mRowsPerP";
__ref._mrowsperpage /*int*/  = (int) (__c.Min(__ref._maximumrowsperpage /*int*/ ,__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=18350099;
 //BA.debugLineNum = 18350099;BA.debugLine="TotalHeight = Min(TotalHeight, MaximumRowsPerPag";
_totalheight = (int) (__c.Min(_totalheight,__ref._maximumrowsperpage /*int*/ *__ref._rowheight /*int*/ ));
 };
RDebugUtils.currentLine=18350101;
 //BA.debugLineNum = 18350101;BA.debugLine="If PrevRowsPerPage <> mRowsPerPage Then RefreshDa";
if (_prevrowsperpage!=__ref._mrowsperpage /*int*/ ) { 
_refreshdata = __c.True;};
RDebugUtils.currentLine=18350102;
 //BA.debugLineNum = 18350102;BA.debugLine="CalculateWidths";
__ref._calculatewidths /*String*/ (null);
RDebugUtils.currentLine=18350103;
 //BA.debugLineNum = 18350103;BA.debugLine="Dim ColumnIndex As Int";
_columnindex = 0;
RDebugUtils.currentLine=18350105;
 //BA.debugLineNum = 18350105;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group24 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group24.Get(index24));
RDebugUtils.currentLine=18350106;
 //BA.debugLineNum = 18350106;BA.debugLine="Dim IsFrozen As Boolean = ColumnIndex < NumberOf";
_isfrozen = _columnindex<__ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=18350107;
 //BA.debugLineNum = 18350107;BA.debugLine="If c.Panel.Parent.IsInitialized Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=18350108;
 //BA.debugLineNum = 18350108;BA.debugLine="CheckAndRemoveColumnThatWasAddedToIncorrectPare";
__ref._checkandremovecolumnthatwasaddedtoincorrectparent /*String*/ (null,_c,_isfrozen);
 };
RDebugUtils.currentLine=18350110;
 //BA.debugLineNum = 18350110;BA.debugLine="If c.Panel.Parent.IsInitialized = False Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()==__c.False) { 
RDebugUtils.currentLine=18350111;
 //BA.debugLineNum = 18350111;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=18350112;
 //BA.debugLineNum = 18350112;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=18350113;
 //BA.debugLineNum = 18350113;BA.debugLine="mBase.AddView(c.Panel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
 }else {
RDebugUtils.currentLine=18350115;
 //BA.debugLineNum = 18350115;BA.debugLine="AddColumnToCLV (c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
 };
RDebugUtils.currentLine=18350119;
 //BA.debugLineNum = 18350119;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=18350120;
 //BA.debugLineNum = 18350120;BA.debugLine="ResizeColumnImpl(c, TotalHeight)";
__ref._resizecolumnimpl /*String*/ (null,_c,_totalheight);
RDebugUtils.currentLine=18350121;
 //BA.debugLineNum = 18350121;BA.debugLine="ColumnIndex = ColumnIndex + 1";
_columnindex = (int) (_columnindex+1);
 }
};
RDebugUtils.currentLine=18350123;
 //BA.debugLineNum = 18350123;BA.debugLine="If RefreshData Then UpdateData (DontSleep)";
if (_refreshdata) { 
__ref._updatedata /*String*/ (null,_dontsleep);};
RDebugUtils.currentLine=18350124;
 //BA.debugLineNum = 18350124;BA.debugLine="Dim FreezedWidth As Int";
_freezedwidth = 0;
RDebugUtils.currentLine=18350125;
 //BA.debugLineNum = 18350125;BA.debugLine="For i = 0 To NumberOfFrozenColumns - 1";
{
final int step43 = 1;
final int limit43 = (int) (__ref._numberoffrozencolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=18350126;
 //BA.debugLineNum = 18350126;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4j.example.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=18350128;
 //BA.debugLineNum = 18350128;BA.debugLine="Dim offset As Float = 1";
_offset = (float) (1);
RDebugUtils.currentLine=18350132;
 //BA.debugLineNum = 18350132;BA.debugLine="c.Panel.SetLayoutAnimated(0, offset + FreezedWid";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_offset+_freezedwidth,__ref._clvdata /*b4j.example.customlistview*/ ._asview().getTop()+_offset,_c.ComputedWidth /*int*/ ,__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=18350134;
 //BA.debugLineNum = 18350134;BA.debugLine="FreezedWidth = FreezedWidth + c.ComputedWidth";
_freezedwidth = (int) (_freezedwidth+_c.ComputedWidth /*int*/ );
 }
};
RDebugUtils.currentLine=18350136;
 //BA.debugLineNum = 18350136;BA.debugLine="clvData.AsView.Left = FreezedWidth";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().setLeft(_freezedwidth);
RDebugUtils.currentLine=18350137;
 //BA.debugLineNum = 18350137;BA.debugLine="If Round(clvData.AsView.Width) <> Round(mBase.Wid";
if (__c.Round(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getWidth())!=__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth)) { 
RDebugUtils.currentLine=18350138;
 //BA.debugLineNum = 18350138;BA.debugLine="clvData.AsView.Width = mBase.Width - FreezedWidt";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().setWidth(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth);
RDebugUtils.currentLine=18350139;
 //BA.debugLineNum = 18350139;BA.debugLine="If xui.IsB4A Then clvData.Base_Resize(clvData.As";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._clvdata /*b4j.example.customlistview*/ ._base_resize(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight());};
 };
RDebugUtils.currentLine=18350141;
 //BA.debugLineNum = 18350141;BA.debugLine="ResizeAndReorderCLVItems";
__ref._resizeandreorderclvitems /*String*/ (null);
RDebugUtils.currentLine=18350142;
 //BA.debugLineNum = 18350142;BA.debugLine="UpdateSearchFieldVisibility";
__ref._updatesearchfieldvisibility /*void*/ (null);
RDebugUtils.currentLine=18350143;
 //BA.debugLineNum = 18350143;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=18350144;
 //BA.debugLineNum = 18350144;BA.debugLine="End Sub";
return "";
}
public String  _buildlayoutscache(b4j.example.b4xtable __ref,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "buildlayoutscache", true))
	 {return ((String) Debug.delegate(ba, "buildlayoutscache", new Object[] {_size}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub BuildLayoutsCache (Size As Int)";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="CreateColumnLayouts(c, Size + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (_size+1));
 }
};
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="End Sub";
return "";
}
public Object[]  _buildquery(b4j.example.b4xtable __ref,boolean _withpagelimit) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "buildquery", true))
	 {return ((Object[]) Debug.delegate(ba, "buildquery", new Object[] {_withpagelimit}));}
String _sortcolumn = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _totalcount = 0;
int _limit = 0;
anywheresoftware.b4a.objects.collections.List _aargs = null;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub BuildQuery (WithPageLimit As Boolean) A";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim SortColumn As String";
_sortcolumn = "";
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="sb.Append(\"SELECT rowid\")";
_sb.Append("SELECT rowid");
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="If c.ColumnType = COLUMN_TYPE_VOID Then Continue";
if (_c.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="sb.Append(\",\").Append(c.SQLID)";
_sb.Append(",").Append(_c.SQLID /*String*/ );
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="If c.InternalSortMode <> \"\" Then";
if ((_c.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="SortColumn = \" ORDER BY \" & c.SQLID & \" \" & c.I";
_sortcolumn = " ORDER BY "+_c.SQLID /*String*/ +" "+_c.InternalSortMode /*String*/ ;
 };
 }
};
RDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="sb.Append(\" FROM \").Append(SQLTableName).Append(\"";
_sb.Append(" FROM ").Append(__ref._sqltablename /*String*/ ).Append(" ");
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="Dim TotalCount As Int";
_totalcount = 0;
RDebugUtils.currentLine=18808848;
 //BA.debugLineNum = 18808848;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="TotalCount = CountAll";
_totalcount = __ref._countall /*int*/ ;
 }else {
RDebugUtils.currentLine=18808851;
 //BA.debugLineNum = 18808851;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group19 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group19.Get(index19));
RDebugUtils.currentLine=18808852;
 //BA.debugLineNum = 18808852;BA.debugLine="If c.Searchable Then";
if (_c.Searchable /*boolean*/ ) { 
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="If args.Size = 0 Then";
if (_args.getSize()==0) { 
RDebugUtils.currentLine=18808854;
 //BA.debugLineNum = 18808854;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
 }else {
RDebugUtils.currentLine=18808856;
 //BA.debugLineNum = 18808856;BA.debugLine="sb.Append(\" OR \")";
_sb.Append(" OR ");
 };
RDebugUtils.currentLine=18808858;
 //BA.debugLineNum = 18808858;BA.debugLine="sb.Append(c.SQLID).Append(\" LIKE ? \")";
_sb.Append(_c.SQLID /*String*/ ).Append(" LIKE ? ");
RDebugUtils.currentLine=18808859;
 //BA.debugLineNum = 18808859;BA.debugLine="If PrefixSearch Then";
if (__ref._prefixsearch /*boolean*/ ) { 
RDebugUtils.currentLine=18808860;
 //BA.debugLineNum = 18808860;BA.debugLine="args.Add(FilterText & \"%\")";
_args.Add((Object)(__ref._filtertext /*String*/ +"%"));
 }else {
RDebugUtils.currentLine=18808862;
 //BA.debugLineNum = 18808862;BA.debugLine="args.Add(\"%\" & FilterText & \"%\")";
_args.Add((Object)("%"+__ref._filtertext /*String*/ +"%"));
 };
 };
 }
};
RDebugUtils.currentLine=18808866;
 //BA.debugLineNum = 18808866;BA.debugLine="TotalCount = -1";
_totalcount = (int) (-1);
 };
RDebugUtils.currentLine=18808868;
 //BA.debugLineNum = 18808868;BA.debugLine="If SortColumn <> \"\" Then sb.Append(SortColumn)";
if ((_sortcolumn).equals("") == false) { 
_sb.Append(_sortcolumn);};
RDebugUtils.currentLine=18808869;
 //BA.debugLineNum = 18808869;BA.debugLine="If WithPageLimit Then";
if (_withpagelimit) { 
RDebugUtils.currentLine=18808870;
 //BA.debugLineNum = 18808870;BA.debugLine="Dim limit As Int = mRowsPerPage";
_limit = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=18808871;
 //BA.debugLineNum = 18808871;BA.debugLine="If TotalCount < 0 Then limit = limit + 1";
if (_totalcount<0) { 
_limit = (int) (_limit+1);};
RDebugUtils.currentLine=18808872;
 //BA.debugLineNum = 18808872;BA.debugLine="sb.Append($\" LIMIT ${mFirstRowIndex}, ${limit}\"$";
_sb.Append((" LIMIT "+__c.SmartStringFormatter("",(Object)(__ref._mfirstrowindex /*int*/ ))+", "+__c.SmartStringFormatter("",(Object)(_limit))+""));
 };
RDebugUtils.currentLine=18808880;
 //BA.debugLineNum = 18808880;BA.debugLine="Dim aargs As List = args";
_aargs = new anywheresoftware.b4a.objects.collections.List();
_aargs = _args;
RDebugUtils.currentLine=18808882;
 //BA.debugLineNum = 18808882;BA.debugLine="Return Array(sb.ToString, aargs, TotalCount)";
if (true) return new Object[]{(Object)(_sb.ToString()),(Object)(_aargs.getObject()),(Object)(_totalcount)};
RDebugUtils.currentLine=18808883;
 //BA.debugLineNum = 18808883;BA.debugLine="End Sub";
return null;
}
public String  _calculatewidths(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "calculatewidths", true))
	 {return ((String) Debug.delegate(ba, "calculatewidths", null));}
int _wildcardcount = 0;
int _totalexplicitwidth = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
int _wildcardwidth = 0;
int _width = 0;
int _remainder = 0;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Private Sub CalculateWidths";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Dim wildcardcount As Int";
_wildcardcount = 0;
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="Dim TotalExplicitWidth As Int";
_totalexplicitwidth = 0;
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group3.Get(index3));
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="If c.Width = 0 Then wildcardcount = wildcardcoun";
if (_c.Width /*int*/ ==0) { 
_wildcardcount = (int) (_wildcardcount+1);}
else {
_c.ComputedWidth /*int*/  = _c.Width /*int*/ ;};
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="TotalExplicitWidth = TotalExplicitWidth + c.Widt";
_totalexplicitwidth = (int) (_totalexplicitwidth+_c.Width /*int*/ );
 }
};
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="If wildcardcount = 0 Then Return";
if (_wildcardcount==0) { 
if (true) return "";};
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="Dim WildcardWidth As Int = Max(wildcardcount * Mi";
_wildcardwidth = (int) (__c.Max(_wildcardcount*__ref._minimumwidth /*int*/ ,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))-_totalexplicitwidth));
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="Dim Width As Int = WildcardWidth / wildcardcount";
_width = (int) (_wildcardwidth/(double)_wildcardcount);
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="Dim Remainder As Int = WildcardWidth Mod wildcard";
_remainder = (int) (_wildcardwidth%_wildcardcount);
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group11.Get(index11));
RDebugUtils.currentLine=19398668;
 //BA.debugLineNum = 19398668;BA.debugLine="If c.Width = 0 Then";
if (_c.Width /*int*/ ==0) { 
RDebugUtils.currentLine=19398669;
 //BA.debugLineNum = 19398669;BA.debugLine="c.ComputedWidth = Width";
_c.ComputedWidth /*int*/  = _width;
RDebugUtils.currentLine=19398670;
 //BA.debugLineNum = 19398670;BA.debugLine="If Remainder > 0 Then";
if (_remainder>0) { 
RDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="Remainder = Remainder - 1";
_remainder = (int) (_remainder-1);
RDebugUtils.currentLine=19398672;
 //BA.debugLineNum = 19398672;BA.debugLine="c.ComputedWidth = c.ComputedWidth + 1";
_c.ComputedWidth /*int*/  = (int) (_c.ComputedWidth /*int*/ +1);
 };
 };
 }
};
RDebugUtils.currentLine=19398676;
 //BA.debugLineNum = 19398676;BA.debugLine="End Sub";
return "";
}
public String  _cell_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cell_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "cell_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub Cell_MouseClicked (EventData As MouseE";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="CellClicked(Sender, EventData.SecondaryButtonPres";
__ref._cellclicked /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),_eventdata.getSecondaryButtonPressed());
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="End Sub";
return "";
}
public void  _cellclicked(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cellclicked", true))
	 {Debug.delegate(ba, "cellclicked", new Object[] {_pnl,_longclicked}); return;}
ResumableSub_CellClicked rsub = new ResumableSub_CellClicked(this,__ref,_pnl,_longclicked);
rsub.resume(ba, null);
}
public static class ResumableSub_CellClicked extends BA.ResumableSub {
public ResumableSub_CellClicked(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) {
this.parent = parent;
this.__ref = __ref;
this._pnl = _pnl;
this._longclicked = _longclicked;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl;
boolean _longclicked;
b4j.example.b4xtable._b4xtablecolumn _column = null;
int _row = 0;
String _e = "";
long _rowid = 0L;
int _clr = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="If DateTime.Now < LastCellClickEvent + 20 Then Re";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.DateTime.getNow()<__ref._lastcellclickevent /*long*/ +20) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="LastCellClickEvent = DateTime.Now";
__ref._lastcellclickevent /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Dim column As B4XTableColumn = pnl.Parent.Tag";
_column = (b4j.example.b4xtable._b4xtablecolumn)(_pnl.getParent().getTag());
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="Dim Row As Int = pnl.Tag - 1";
_row = (int) ((double)(BA.ObjectToNumber(_pnl.getTag()))-1);
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="Dim e As String";
_e = "";
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="If Row = -1 Then";
if (true) break;

case 7:
//if
this.state = 61;
if (_row==-1) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=20185107;
 //BA.debugLineNum = 20185107;BA.debugLine="Else If VisibleRowIds.Size > 0 Then";
if (__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 20;
}}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="If LongClicked Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_longclicked) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=20185096;
 //BA.debugLineNum = 20185096;BA.debugLine="e = \"_headerlongclicked\"";
_e = "_headerlongclicked";
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=20185098;
 //BA.debugLineNum = 20185098;BA.debugLine="e = \"_headerclicked\"";
_e = "_headerclicked";
RDebugUtils.currentLine=20185099;
 //BA.debugLineNum = 20185099;BA.debugLine="HeaderClicked(column)";
__ref._headerclicked /*String*/ (null,_column);
 if (true) break;
;
RDebugUtils.currentLine=20185101;
 //BA.debugLineNum = 20185101;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 1) T";

case 15:
//if
this.state = 18;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (1))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=20185105;
 //BA.debugLineNum = 20185105;BA.debugLine="CallSub2(mCallBack, mEventName & e, column.Id)";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(Object)(_column.Id /*String*/ ));
 if (true) break;

case 18:
//C
this.state = 61;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=20185108;
 //BA.debugLineNum = 20185108;BA.debugLine="Dim RowId As Long = VisibleRowIds.Get(Row)";
_rowid = BA.ObjectToLongNumber(__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=20185109;
 //BA.debugLineNum = 20185109;BA.debugLine="If RowId > 0 Then";
if (true) break;

case 21:
//if
this.state = 60;
if (_rowid>0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=20185110;
 //BA.debugLineNum = 20185110;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=20185111;
 //BA.debugLineNum = 20185111;BA.debugLine="If Row Mod 2 = 0 Then clr = EvenRowColor Else c";
if (true) break;

case 24:
//if
this.state = 31;
if (_row%2==0) { 
this.state = 26;
;}
else {
this.state = 28;
;}if (true) break;

case 26:
//C
this.state = 31;
_clr = __ref._evenrowcolor /*int*/ ;
if (true) break;

case 28:
//C
this.state = 31;
_clr = __ref._oddrowcolor /*int*/ ;
if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=20185113;
 //BA.debugLineNum = 20185113;BA.debugLine="If LongClicked Then";
if (true) break;

case 32:
//if
this.state = 43;
if (_longclicked) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 43;
RDebugUtils.currentLine=20185114;
 //BA.debugLineNum = 20185114;BA.debugLine="e = \"_CellLongClicked\"";
_e = "_CellLongClicked";
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=20185116;
 //BA.debugLineNum = 20185116;BA.debugLine="e = \"_cellclicked\"";
_e = "_cellclicked";
RDebugUtils.currentLine=20185117;
 //BA.debugLineNum = 20185117;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnimat";
if (true) break;

case 37:
//if
this.state = 42;
if (__ref._selectioncolor /*int*/ !=0) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_pnl.SetColorAnimated((int) (50),_clr,__ref._selectioncolor /*int*/ );
if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
RDebugUtils.currentLine=20185120;
 //BA.debugLineNum = 20185120;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 2)";

case 43:
//if
this.state = 46;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (2))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=20185124;
 //BA.debugLineNum = 20185124;BA.debugLine="CallSub3(mCallBack, mEventName & e, column.Id,";
parent.__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(Object)(_column.Id /*String*/ ),__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
 if (true) break;
;
RDebugUtils.currentLine=20185126;
 //BA.debugLineNum = 20185126;BA.debugLine="If LongClicked = False Then";

case 46:
//if
this.state = 59;
if (_longclicked==parent.__c.False) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=20185127;
 //BA.debugLineNum = 20185127;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "cellclicked"),(int) (200));
this.state = 62;
return;
case 62:
//C
this.state = 49;
;
RDebugUtils.currentLine=20185128;
 //BA.debugLineNum = 20185128;BA.debugLine="If pnl.IsInitialized Then";
if (true) break;

case 49:
//if
this.state = 58;
if (_pnl.IsInitialized()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=20185129;
 //BA.debugLineNum = 20185129;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnima";
if (true) break;

case 52:
//if
this.state = 57;
if (__ref._selectioncolor /*int*/ !=0) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_pnl.SetColorAnimated((int) (200),__ref._selectioncolor /*int*/ ,_clr);
if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = -1;
;
RDebugUtils.currentLine=20185134;
 //BA.debugLineNum = 20185134;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _headerclicked(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "headerclicked", true))
	 {return ((String) Debug.delegate(ba, "headerclicked", new Object[] {_col}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub HeaderClicked (col As B4XTableColumn)";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="If col.Sortable Then";
if (_col.Sortable /*boolean*/ ) { 
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group2.Get(index2));
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="If c = col Then";
if ((_c).equals(_col)) { 
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="If c.InternalSortMode = \"ASC\" Then c.InternalS";
if ((_c.InternalSortMode /*String*/ ).equals("ASC")) { 
_c.InternalSortMode /*String*/  = "DESC";}
else {
_c.InternalSortMode /*String*/  = "ASC";};
 }else {
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="c.InternalSortMode = \"\"";
_c.InternalSortMode /*String*/  = "";
 };
 }
};
RDebugUtils.currentLine=20250633;
 //BA.debugLineNum = 20250633;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=20250634;
 //BA.debugLineNum = 20250634;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=20250635;
 //BA.debugLineNum = 20250635;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=20250637;
 //BA.debugLineNum = 20250637;BA.debugLine="End Sub";
return "";
}
public String  _checkandremovecolumnthatwasaddedtoincorrectparent(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,boolean _isfrozen) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", true))
	 {return ((String) Debug.delegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", new Object[] {_c,_isfrozen}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Private Sub CheckAndRemoveColumnThatWasAddedToInco";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="If (c.Panel.Parent = mBase) <> IsFrozen Then";
if (((_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ))!=_isfrozen) { 
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
 }else {
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
 };
RDebugUtils.currentLine=18546696;
 //BA.debugLineNum = 18546696;BA.debugLine="End Sub";
return "";
}
public String  _removecolumnfromclv(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "removecolumnfromclv", true))
	 {return ((String) Debug.delegate(ba, "removecolumnfromclv", new Object[] {_c}));}
int _i = 0;
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub RemoveColumnFromCLV (c As B4XTableColu";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="For i = 0 To clvData.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._clvdata /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="If clvData.GetValue(i) = c Then";
if ((__ref._clvdata /*b4j.example.customlistview*/ ._getvalue(_i)).equals((Object)(_c))) { 
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="clvData.RemoveAt(i)";
__ref._clvdata /*b4j.example.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=18612231;
 //BA.debugLineNum = 18612231;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="Public sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="Type B4XTableColumn (Title As String, Id As Strin";
;
RDebugUtils.currentLine=17825802;
 //BA.debugLineNum = 17825802;BA.debugLine="Public COLUMN_TYPE_TEXT = 1, COLUMN_TYPE_NUMBERS";
_column_type_text = (int) (1);
_column_type_numbers = (int) (2);
_column_type_date = (int) (3);
_column_type_void = (int) (4);
RDebugUtils.currentLine=17825803;
 //BA.debugLineNum = 17825803;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17825804;
 //BA.debugLineNum = 17825804;BA.debugLine="Public VisibleColumns As List";
_visiblecolumns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17825805;
 //BA.debugLineNum = 17825805;BA.debugLine="Private mFirstRowIndex, mLastRowIndex As Int";
_mfirstrowindex = 0;
_mlastrowindex = 0;
RDebugUtils.currentLine=17825806;
 //BA.debugLineNum = 17825806;BA.debugLine="Public DefaultFormatter, DefaultDataFormatter As";
_defaultformatter = new b4j.example.b4xformatter();
_defaultdataformatter = new b4j.example.b4xformatter();
RDebugUtils.currentLine=17825807;
 //BA.debugLineNum = 17825807;BA.debugLine="Public pnlHeader As B4XView";
_pnlheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825808;
 //BA.debugLineNum = 17825808;BA.debugLine="Public pnlTitles As B4XView";
_pnltitles = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825809;
 //BA.debugLineNum = 17825809;BA.debugLine="Public clvData As CustomListView";
_clvdata = new b4j.example.customlistview();
RDebugUtils.currentLine=17825810;
 //BA.debugLineNum = 17825810;BA.debugLine="Public RowHeight, HeadersHeight As Int";
_rowheight = 0;
_headersheight = 0;
RDebugUtils.currentLine=17825811;
 //BA.debugLineNum = 17825811;BA.debugLine="Public AllowSmallRowHeightModifications As Boolea";
_allowsmallrowheightmodifications = __c.True;
RDebugUtils.currentLine=17825812;
 //BA.debugLineNum = 17825812;BA.debugLine="Private mRowsPerPage As Int = 0";
_mrowsperpage = (int) (0);
RDebugUtils.currentLine=17825813;
 //BA.debugLineNum = 17825813;BA.debugLine="Private LayoutLoaded As Boolean";
_layoutloaded = false;
RDebugUtils.currentLine=17825814;
 //BA.debugLineNum = 17825814;BA.debugLine="Public MinimumWidth As Int";
_minimumwidth = 0;
RDebugUtils.currentLine=17825815;
 //BA.debugLineNum = 17825815;BA.debugLine="Private SQLIndex As Int";
_sqlindex = 0;
RDebugUtils.currentLine=17825816;
 //BA.debugLineNum = 17825816;BA.debugLine="Public EvenRowColor, OddRowColor, HeaderTextColor";
_evenrowcolor = 0;
_oddrowcolor = 0;
_headertextcolor = 0;
_textcolor = 0;
_highlighttextcolor = 0;
_headercolor = 0;
_gridcolor = 0;
RDebugUtils.currentLine=17825817;
 //BA.debugLineNum = 17825817;BA.debugLine="Public HighlightSearchResults As Boolean = True";
_highlightsearchresults = __c.True;
RDebugUtils.currentLine=17825818;
 //BA.debugLineNum = 17825818;BA.debugLine="Public HeaderFont, LabelsFont As B4XFont";
_headerfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_labelsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=17825819;
 //BA.debugLineNum = 17825819;BA.debugLine="Public lblFirst As B4XView";
_lblfirst = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825820;
 //BA.debugLineNum = 17825820;BA.debugLine="Public lblBack As B4XView";
_lblback = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825821;
 //BA.debugLineNum = 17825821;BA.debugLine="Public lblNumber As B4XView";
_lblnumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825822;
 //BA.debugLineNum = 17825822;BA.debugLine="Public lblNext As B4XView";
_lblnext = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825823;
 //BA.debugLineNum = 17825823;BA.debugLine="Public lblLast As B4XView";
_lbllast = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825824;
 //BA.debugLineNum = 17825824;BA.debugLine="Public lblFromTo As B4XView";
_lblfromto = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825825;
 //BA.debugLineNum = 17825825;BA.debugLine="Private CountAll As Int";
_countall = 0;
RDebugUtils.currentLine=17825826;
 //BA.debugLineNum = 17825826;BA.debugLine="Private mCurrentPage As Int";
_mcurrentpage = 0;
RDebugUtils.currentLine=17825827;
 //BA.debugLineNum = 17825827;BA.debugLine="Public mCurrentCount As Int";
_mcurrentcount = 0;
RDebugUtils.currentLine=17825828;
 //BA.debugLineNum = 17825828;BA.debugLine="Public lblSort As B4XView";
_lblsort = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17825829;
 //BA.debugLineNum = 17825829;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=17825830;
 //BA.debugLineNum = 17825830;BA.debugLine="Private FilterText As String";
_filtertext = "";
RDebugUtils.currentLine=17825831;
 //BA.debugLineNum = 17825831;BA.debugLine="Public SleepBeforeSearch As Int = 300";
_sleepbeforesearch = (int) (300);
RDebugUtils.currentLine=17825832;
 //BA.debugLineNum = 17825832;BA.debugLine="Private SearchIndex As Int";
_searchindex = 0;
RDebugUtils.currentLine=17825833;
 //BA.debugLineNum = 17825833;BA.debugLine="Public ArrowsEnabledColor, ArrowsDisabledColor As";
_arrowsenabledcolor = 0;
_arrowsdisabledcolor = 0;
RDebugUtils.currentLine=17825834;
 //BA.debugLineNum = 17825834;BA.debugLine="Public VisibleRowIds As List";
_visiblerowids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17825835;
 //BA.debugLineNum = 17825835;BA.debugLine="Public SelectionColor As Int";
_selectioncolor = 0;
RDebugUtils.currentLine=17825836;
 //BA.debugLineNum = 17825836;BA.debugLine="Private SQLTableName As String = \"data\"";
_sqltablename = "data";
RDebugUtils.currentLine=17825837;
 //BA.debugLineNum = 17825837;BA.debugLine="Public StringMoreAvailable As String = \"(more ava";
_stringmoreavailable = "(more available)";
RDebugUtils.currentLine=17825838;
 //BA.debugLineNum = 17825838;BA.debugLine="Public StringNoMatches As String = \"No matches\"";
_stringnomatches = "No matches";
RDebugUtils.currentLine=17825839;
 //BA.debugLineNum = 17825839;BA.debugLine="Public StringOutOf As String = \"out of\"";
_stringoutof = "out of";
RDebugUtils.currentLine=17825840;
 //BA.debugLineNum = 17825840;BA.debugLine="Public StringTo As String = \"to\"";
_stringto = "to";
RDebugUtils.currentLine=17825841;
 //BA.debugLineNum = 17825841;BA.debugLine="Public MaximumRowsPerPage As Int";
_maximumrowsperpage = 0;
RDebugUtils.currentLine=17825842;
 //BA.debugLineNum = 17825842;BA.debugLine="Public PrefixSearch As Boolean";
_prefixsearch = false;
RDebugUtils.currentLine=17825844;
 //BA.debugLineNum = 17825844;BA.debugLine="Private TextFlow As B4JTextFlow";
_textflow = new b4j.example.b4jtextflow();
RDebugUtils.currentLine=17825845;
 //BA.debugLineNum = 17825845;BA.debugLine="Private const TextPaneTag As String = \"TextFlow\"";
_textpanetag = "TextFlow";
RDebugUtils.currentLine=17825847;
 //BA.debugLineNum = 17825847;BA.debugLine="Private LastBaseHeight As Int";
_lastbaseheight = 0;
RDebugUtils.currentLine=17825848;
 //BA.debugLineNum = 17825848;BA.debugLine="Public NumberOfFrozenColumns As Int";
_numberoffrozencolumns = 0;
RDebugUtils.currentLine=17825849;
 //BA.debugLineNum = 17825849;BA.debugLine="Private LastCellClickEvent As Long";
_lastcellclickevent = 0L;
RDebugUtils.currentLine=17825853;
 //BA.debugLineNum = 17825853;BA.debugLine="Public SearchVisible As Boolean";
_searchvisible = false;
RDebugUtils.currentLine=17825855;
 //BA.debugLineNum = 17825855;BA.debugLine="End Sub";
return "";
}
public void  _clear(b4j.example.b4xtable __ref) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "clear", true))
	 {Debug.delegate(ba, "clear", null); return;}
ResumableSub_Clear rsub = new ResumableSub_Clear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Clear extends BA.ResumableSub {
public ResumableSub_Clear(b4j.example.b4xtable parent,b4j.example.b4xtable __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
anywheresoftware.b4j.objects.SQL _oldsql = null;
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim OldSQL As SQL = sql1";
_oldsql = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ ;
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Dim sql1 As SQL";
parent._sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="For Each c As B4XTableColumn In Columns";
if (true) break;

case 1:
//for
this.state = 8;
group4 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 21;
if (true) break;

case 21:
//C
this.state = 8;
if (index4 < groupLen4) {
this.state = 3;
_c = (b4j.example.b4xtable._b4xtablecolumn)(group4.Get(index4));}
if (true) break;

case 22:
//C
this.state = 21;
index4++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="If c.Panel.IsInitialized And c.Panel.Parent.IsIn";
if (true) break;

case 4:
//if
this.state = 7;
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && _c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=18087945;
 //BA.debugLineNum = 18087945;BA.debugLine="VisibleColumns.Clear";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=18087946;
 //BA.debugLineNum = 18087946;BA.debugLine="Columns.Clear";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="If clvData.IsInitialized Then";
if (true) break;

case 9:
//if
this.state = 12;
if (__ref._clvdata /*b4j.example.customlistview*/ .IsInitialized()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18087949;
 //BA.debugLineNum = 18087949;BA.debugLine="clvData.Clear";
__ref._clvdata /*b4j.example.customlistview*/ ._clear();
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=18087951;
 //BA.debugLineNum = 18087951;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=18087952;
 //BA.debugLineNum = 18087952;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=18087953;
 //BA.debugLineNum = 18087953;BA.debugLine="If OldSQL.IsInitialized Then";
if (true) break;

case 13:
//if
this.state = 20;
if (_oldsql.IsInitialized()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=18087954;
 //BA.debugLineNum = 18087954;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "clear"),(int) (1000));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=18087955;
 //BA.debugLineNum = 18087955;BA.debugLine="If OldSQL.IsInitialized Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_oldsql.IsInitialized()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=18087956;
 //BA.debugLineNum = 18087956;BA.debugLine="Log(\"closing old db.\")";
parent.__c.LogImpl("918087956","closing old db.",0);
RDebugUtils.currentLine=18087957;
 //BA.debugLineNum = 18087957;BA.debugLine="OldSQL.Close";
_oldsql.Close();
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=18087960;
 //BA.debugLineNum = 18087960;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _clearnavigationstate(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "clearnavigationstate", true))
	 {return ((String) Debug.delegate(ba, "clearnavigationstate", null));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub ClearNavigationState";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="If lblNext.IsInitialized = False Then Return";
if (__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="SetPageLabelState(lblNext, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="SetPageLabelState(lblBack, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="SetPageLabelState(lblFirst, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="lblFromTo.Text = \"\"";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="lblNumber.Text = \"\"";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="End Sub";
return "";
}
public String  _cleardataview(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cleardataview", true))
	 {return ((String) Debug.delegate(ba, "cleardataview", null));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub ClearDataView";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="End Sub";
return "";
}
public String  _updatedata(b4j.example.b4xtable __ref,boolean _dontsleep) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatedata", true))
	 {return ((String) Debug.delegate(ba, "updatedata", new Object[] {_dontsleep}));}
Object[] _o = null;
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub UpdateData (DontSleep As Boolean)";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="If sql1.IsInitialized = False Then Return";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Dim o() As Object = BuildQuery(True)";
_o = __ref._buildquery /*Object[]*/ (null,__c.True);
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="ImplUpdateDataFromQuery (o(0), o(1), o(2), DontSl";
__ref._implupdatedatafromquery /*void*/ (null,BA.ObjectToString(_o[(int) (0)]),_o[(int) (1)],(int)(BA.ObjectToNumber(_o[(int) (2)])),_dontsleep);
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="End Sub";
return "";
}
public String  _setpagelabelstate(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setpagelabelstate", true))
	 {return ((String) Debug.delegate(ba, "setpagelabelstate", new Object[] {_lbl,_enabled}));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Private Sub SetPageLabelState (lbl As B4XView, ena";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="If lbl.Tag = enabled Then Return";
if ((_lbl.getTag()).equals((Object)(_enabled))) { 
if (true) return "";};
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="lbl.Tag = enabled";
_lbl.setTag((Object)(_enabled));
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="If enabled Then";
if (_enabled) { 
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="lbl.TextColor = ArrowsEnabledColor";
_lbl.setTextColor(__ref._arrowsenabledcolor /*int*/ );
 }else {
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="lbl.TextColor = ArrowsDisabledColor";
_lbl.setTextColor(__ref._arrowsdisabledcolor /*int*/ );
 };
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="End Sub";
return "";
}
public String  _columntosqltype(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "columntosqltype", true))
	 {return ((String) Debug.delegate(ba, "columntosqltype", new Object[] {_c}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub ColumnToSQLType (c As B4XTableColumn)";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="If c.ColumnType = COLUMN_TYPE_TEXT Then Return \"T";
if (_c.ColumnType /*int*/ ==__ref._column_type_text /*int*/ ) { 
if (true) return "TEXT";}
else {
if (true) return "INTEGER";};
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createcellviews(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createcellviews", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createcellviews", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub CreateCellViews As B4XView";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"cell\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"cell");
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="SetMouseTransparent(lbl)";
__ref._setmousetransparent /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="p.AddView(xlbl, 0, 0, 0, 0)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,0,0);
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="End Sub";
return null;
}
public String  _setmousetransparent(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setmousetransparent", true))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_lbl}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub SetMouseTransparent (lbl As B4XView) '";
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Dim jo = lbl As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="End Sub";
return "";
}
public String  _createdataview(b4j.example.b4xtable __ref,String _whereclause) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createdataview", true))
	 {return ((String) Debug.delegate(ba, "createdataview", new Object[] {_whereclause}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub CreateDataView (WhereClause As String)";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="sql1.ExecNonQuery(\"DROP VIEW IF EXISTS TempView\")";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DROP VIEW IF EXISTS TempView");
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="sql1.ExecNonQuery(\"CREATE VIEW TempView AS SELECT";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("CREATE VIEW TempView AS SELECT *, rowid FROM data WHERE "+_whereclause);
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM TempView")));
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="SQLTableName = \"TempView\"";
__ref._sqltablename /*String*/  = "TempView";
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="End Sub";
return "";
}
public String  _createtable(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((String) Debug.delegate(ba, "createtable", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
b4j.example.b4xtable._b4xtablecolumn _column = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub CreateTable";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="sb.Append(\"CREATE TABLE data (\")";
_sb.Append("CREATE TABLE data (");
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="For Each Column As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_column = (b4j.example.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (_column.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Column.SQLID = \"c\" & i";
_column.SQLID /*String*/  = "c"+BA.NumberToString(_i);
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="sb.Append(Column.SQLID & \" \" & ColumnToSQLType(C";
_sb.Append(_column.SQLID /*String*/ +" "+__ref._columntosqltype /*String*/ (null,_column)+",");
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=19791883;
 //BA.debugLineNum = 19791883;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="sql1.ExecNonQuery(sb.ToString)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=19791886;
 //BA.debugLineNum = 19791886;BA.debugLine="End Sub";
return "";
}
public void  _designercreateview(b4j.example.b4xtable __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,__ref,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
Object _base;
anywheresoftware.b4j.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent);
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="LayoutLoaded = False";
__ref._layoutloaded /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="EvenRowColor = xui.PaintOrColorToColor(Props.Get(";
__ref._evenrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("EvenRowColor")));
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="OddRowColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._oddrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OddRowColor")));
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="HeaderTextColor = xui.PaintOrColorToColor(Props.G";
__ref._headertextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderTextColor")));
RDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="TextColor = xui.PaintOrColorToColor(Props.Get(\"Te";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="HeaderColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="GridColor = xui.PaintOrColorToColor(Props.Get(\"Gr";
__ref._gridcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("GridColor")));
RDebugUtils.currentLine=17956875;
 //BA.debugLineNum = 17956875;BA.debugLine="SelectionColor = xui.PaintOrColorToColor(Props.Ge";
__ref._selectioncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectionColor")));
RDebugUtils.currentLine=17956876;
 //BA.debugLineNum = 17956876;BA.debugLine="HighlightTextColor = xui.PaintOrColorToColor(Prop";
__ref._highlighttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("HighlightTextColor"),(Object)(((int)0xffff0000))));
RDebugUtils.currentLine=17956877;
 //BA.debugLineNum = 17956877;BA.debugLine="SearchVisible = Props.GetDefault(\"SearchVisible\",";
__ref._searchvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SearchVisible"),(Object)(parent.__c.True)));
RDebugUtils.currentLine=17956878;
 //BA.debugLineNum = 17956878;BA.debugLine="If Bit.And(SelectionColor, 0xff000000) = 0 Then S";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Bit.And(__ref._selectioncolor /*int*/ ,((int)0xff000000))==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._selectioncolor /*int*/  = (int) (0);
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=17956879;
 //BA.debugLineNum = 17956879;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "designercreateview"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=17956880;
 //BA.debugLineNum = 17956880;BA.debugLine="mBase.LoadLayout(\"B4XTable\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XTable",ba);
RDebugUtils.currentLine=17956881;
 //BA.debugLineNum = 17956881;BA.debugLine="SearchField.mBase.Visible = False";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=17956882;
 //BA.debugLineNum = 17956882;BA.debugLine="SearchField.LargeLabelTextSize = 14";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._largelabeltextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=17956883;
 //BA.debugLineNum = 17956883;BA.debugLine="SearchField.SmallLabelTextSize = 8";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._smalllabeltextsize /*float*/  = (float) (8);
RDebugUtils.currentLine=17956884;
 //BA.debugLineNum = 17956884;BA.debugLine="SearchField.Update";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=17956892;
 //BA.debugLineNum = 17956892;BA.debugLine="SetMouseTransparent(lblSort)";
__ref._setmousetransparent /*String*/ (null,__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=17956893;
 //BA.debugLineNum = 17956893;BA.debugLine="clvData.AsView.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().SetColorAndBorder((int) (0),0,(int) (0),0);
RDebugUtils.currentLine=17956894;
 //BA.debugLineNum = 17956894;BA.debugLine="clvData.sv.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4j.example.customlistview*/ ._sv.SetColorAndBorder((int) (0),0,(int) (0),0);
RDebugUtils.currentLine=17956895;
 //BA.debugLineNum = 17956895;BA.debugLine="lblNumber.TextColor = ArrowsEnabledColor";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._arrowsenabledcolor /*int*/ );
RDebugUtils.currentLine=17956896;
 //BA.debugLineNum = 17956896;BA.debugLine="LayoutLoaded = True";
__ref._layoutloaded /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=17956897;
 //BA.debugLineNum = 17956897;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=17956898;
 //BA.debugLineNum = 17956898;BA.debugLine="Refresh2 (True, False)";
__ref._refresh2 /*String*/ (null,parent.__c.True,parent.__c.False);
RDebugUtils.currentLine=17956899;
 //BA.debugLineNum = 17956899;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.example.b4xtable._b4xtablecolumn  _getcolumn(b4j.example.b4xtable __ref,String _columnid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getcolumn", true))
	 {return ((b4j.example.b4xtable._b4xtablecolumn) Debug.delegate(ba, "getcolumn", new Object[] {_columnid}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Public Sub GetColumn (ColumnId As String) As B4XTa";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="If c.Id = ColumnId Then Return c";
if ((_c.Id /*String*/ ).equals(_columnid)) { 
if (true) return _c;};
 }
};
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentpage(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getcurrentpage", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentpage", null));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub getCurrentPage As Int";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Return mCurrentPage";
if (true) return __ref._mcurrentpage /*int*/ ;
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="End Sub";
return 0;
}
public int  _getfirstrowindex(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getfirstrowindex", true))
	 {return ((Integer) Debug.delegate(ba, "getfirstrowindex", null));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub getFirstRowIndex As Int";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Return mFirstRowIndex";
if (true) return __ref._mfirstrowindex /*int*/ ;
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="End Sub";
return 0;
}
public int  _getrowsperpage(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getrowsperpage", true))
	 {return ((Integer) Debug.delegate(ba, "getrowsperpage", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub getRowsPerPage As Int";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Return mRowsPerPage";
if (true) return __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="End Sub";
return 0;
}
public int  _getsize(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Return CountAll";
if (true) return __ref._countall /*int*/ ;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="End Sub";
return 0;
}
public String  _updatesorticon(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesorticon", true))
	 {return ((String) Debug.delegate(ba, "updatesorticon", null));}
b4j.example.b4xtable._b4xtablecolumn _col = null;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub UpdateSortIcon";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="For Each col As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = (b4j.example.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="If col.InternalSortMode <> \"\" Then";
if ((_col.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="If lblSort.Parent <> col.Panel Then";
if ((__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false) { 
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="lblSort.RemoveViewFromParent";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="col.Panel.AddView(lblSort, 0, 0, lblSort.Width";
_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),0);
 };
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="lblSort.Top = 0";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(0);
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="lblSort.Height = HeadersHeight";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._headersheight /*int*/ );
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="lblSort.Left = col.Panel.Width - lblSort.Width";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="lblSort.Visible = True";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="If col.InternalSortMode = \"ASC\" Then lblSort.Te";
if ((_col.InternalSortMode /*String*/ ).equals("ASC")) { 
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xf0de))));}
else {
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xf0dd))));};
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=20316175;
 //BA.debugLineNum = 20316175;BA.debugLine="lblSort.Visible = False";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=20316176;
 //BA.debugLineNum = 20316176;BA.debugLine="End Sub";
return "";
}
public void  _implupdatedatafromquery(b4j.example.b4xtable __ref,String _query,Object _args,int _totalcount,boolean _dontsleep) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "implupdatedatafromquery", true))
	 {Debug.delegate(ba, "implupdatedatafromquery", new Object[] {_query,_args,_totalcount,_dontsleep}); return;}
ResumableSub_ImplUpdateDataFromQuery rsub = new ResumableSub_ImplUpdateDataFromQuery(this,__ref,_query,_args,_totalcount,_dontsleep);
rsub.resume(ba, null);
}
public static class ResumableSub_ImplUpdateDataFromQuery extends BA.ResumableSub {
public ResumableSub_ImplUpdateDataFromQuery(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,String _query,Object _args,int _totalcount,boolean _dontsleep) {
this.parent = parent;
this.__ref = __ref;
this._query = _query;
this._args = _args;
this._totalcount = _totalcount;
this._dontsleep = _dontsleep;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
String _query;
Object _args;
int _totalcount;
boolean _dontsleep;
int _myindex = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
boolean _success = false;
int _rownumber = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _aretheremoreresults = false;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;
int step32;
int limit32;
anywheresoftware.b4a.BA.IterableList group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="If mRowsPerPage = 0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._mrowsperpage /*int*/ ==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="Dim MyIndex As Int = SQLIndex";
_myindex = __ref._sqlindex /*int*/ ;
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="If DontSleep = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_dontsleep==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="Sleep(40)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "implupdatedatafromquery"),(int) (40));
this.state = 65;
return;
case 65:
//C
this.state = 10;
;
 if (true) break;
;
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="If MyIndex <> SQLIndex Then";

case 10:
//if
this.state = 13;
if (_myindex!=__ref._sqlindex /*int*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=19070987;
 //BA.debugLineNum = 19070987;BA.debugLine="VisibleRowIds.Clear";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=19070989;
 //BA.debugLineNum = 19070989;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(Query, Args";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(_query,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_args)));
RDebugUtils.currentLine=19070990;
 //BA.debugLineNum = 19070990;BA.debugLine="Dim success As Boolean = True";
_success = parent.__c.True;
RDebugUtils.currentLine=19070994;
 //BA.debugLineNum = 19070994;BA.debugLine="If success Then";
if (true) break;

case 14:
//if
this.state = 61;
if (_success) { 
this.state = 16;
}else {
this.state = 60;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=19070995;
 //BA.debugLineNum = 19070995;BA.debugLine="Dim RowNumber As Int = 1";
_rownumber = (int) (1);
RDebugUtils.currentLine=19070996;
 //BA.debugLineNum = 19070996;BA.debugLine="Do While RowNumber <= mRowsPerPage And rs.NextRo";
if (true) break;

case 17:
//do while
this.state = 32;
while (_rownumber<=__ref._mrowsperpage /*int*/  && _rs.NextRow()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=19070997;
 //BA.debugLineNum = 19070997;BA.debugLine="VisibleRowIds.Add(rs.GetLong(\"rowid\"))";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetLong("rowid")));
RDebugUtils.currentLine=19070998;
 //BA.debugLineNum = 19070998;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 20:
//for
this.state = 31;
group17 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 66;
if (true) break;

case 66:
//C
this.state = 31;
if (index17 < groupLen17) {
this.state = 22;
_c = (b4j.example.b4xtable._b4xtablecolumn)(group17.Get(index17));}
if (true) break;

case 67:
//C
this.state = 66;
index17++;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=19070999;
 //BA.debugLineNum = 19070999;BA.debugLine="Dim lbl As B4XView = GetLabelFromColumn(c, Row";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_rownumber);
RDebugUtils.currentLine=19071000;
 //BA.debugLineNum = 19071000;BA.debugLine="Select c.ColumnType";
if (true) break;

case 23:
//select
this.state = 30;
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,__ref._column_type_text /*int*/ ,__ref._column_type_numbers /*int*/ ,__ref._column_type_date /*int*/ )) {
case 0: {
this.state = 25;
if (true) break;
}
case 1: {
this.state = 27;
if (true) break;
}
case 2: {
this.state = 29;
if (true) break;
}
}
if (true) break;

case 25:
//C
this.state = 30;
RDebugUtils.currentLine=19071002;
 //BA.debugLineNum = 19071002;BA.debugLine="SetTextToCell(rs.GetString(c.SQLID), lbl, c.";
__ref._settexttocell /*String*/ (null,_rs.GetString(_c.SQLID /*String*/ ),_lbl,_c.Searchable /*boolean*/ );
 if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=19071004;
 //BA.debugLineNum = 19071004;BA.debugLine="c.Formatter.FormatLabel(rs.GetDouble(c.SQLID";
_c.Formatter /*b4j.example.b4xformatter*/ ._formatlabel /*String*/ (null,_rs.GetDouble(_c.SQLID /*String*/ ),_lbl);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=19071006;
 //BA.debugLineNum = 19071006;BA.debugLine="lbl.Text = DateTime.Date(rs.GetLong(c.SQLID)";
_lbl.setText(parent.__c.DateTime.Date(_rs.GetLong(_c.SQLID /*String*/ )));
 if (true) break;

case 30:
//C
this.state = 67;
;
 if (true) break;
if (true) break;

case 31:
//C
this.state = 17;
;
RDebugUtils.currentLine=19071009;
 //BA.debugLineNum = 19071009;BA.debugLine="RowNumber = RowNumber + 1";
_rownumber = (int) (_rownumber+1);
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=19071011;
 //BA.debugLineNum = 19071011;BA.debugLine="Dim AreThereMoreResults As Boolean = RowNumber =";
_aretheremoreresults = _rownumber==__ref._mrowsperpage /*int*/ +1 && _rs.NextRow();
RDebugUtils.currentLine=19071012;
 //BA.debugLineNum = 19071012;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=19071013;
 //BA.debugLineNum = 19071013;BA.debugLine="For i = RowNumber To mRowsPerPage";
if (true) break;

case 33:
//for
this.state = 40;
step32 = 1;
limit32 = __ref._mrowsperpage /*int*/ ;
_i = _rownumber ;
this.state = 68;
if (true) break;

case 68:
//C
this.state = 40;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 35;
if (true) break;

case 69:
//C
this.state = 68;
_i = ((int)(0 + _i + step32)) ;
if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=19071014;
 //BA.debugLineNum = 19071014;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 36:
//for
this.state = 39;
group33 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
index33 = 0;
groupLen33 = group33.getSize();
this.state = 70;
if (true) break;

case 70:
//C
this.state = 39;
if (index33 < groupLen33) {
this.state = 38;
_c = (b4j.example.b4xtable._b4xtablecolumn)(group33.Get(index33));}
if (true) break;

case 71:
//C
this.state = 70;
index33++;
if (true) break;

case 38:
//C
this.state = 71;
RDebugUtils.currentLine=19071016;
 //BA.debugLineNum = 19071016;BA.debugLine="SetTextToCell(\"\", GetLabelFromColumn(c, i), c.";
__ref._settexttocell /*String*/ (null,"",__ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_i),_c.Searchable /*boolean*/ );
 if (true) break;
if (true) break;

case 39:
//C
this.state = 69;
;
RDebugUtils.currentLine=19071021;
 //BA.debugLineNum = 19071021;BA.debugLine="VisibleRowIds.Add(0)";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=19071023;
 //BA.debugLineNum = 19071023;BA.debugLine="mLastRowIndex = mFirstRowIndex - 2 + RowNumber";
__ref._mlastrowindex /*int*/  = (int) (__ref._mfirstrowindex /*int*/ -2+_rownumber);
RDebugUtils.currentLine=19071024;
 //BA.debugLineNum = 19071024;BA.debugLine="SetPageLabelState(lblLast, TotalCount >= 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_totalcount>=0);
RDebugUtils.currentLine=19071025;
 //BA.debugLineNum = 19071025;BA.debugLine="If TotalCount >= 0 Then";
if (true) break;

case 41:
//if
this.state = 58;
if (_totalcount>=0) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 58;
RDebugUtils.currentLine=19071026;
 //BA.debugLineNum = 19071026;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(mF";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringoutof /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,_totalcount)))+""));
RDebugUtils.currentLine=19071027;
 //BA.debugLineNum = 19071027;BA.debugLine="SetPageLabelState(lblNext, mLastRowIndex < Tota";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mlastrowindex /*int*/ <_totalcount-1);
RDebugUtils.currentLine=19071028;
 //BA.debugLineNum = 19071028;BA.debugLine="SetPageLabelState(lblLast, lblNext.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=19071030;
 //BA.debugLineNum = 19071030;BA.debugLine="If mLastRowIndex = -1 Then";
if (true) break;

case 46:
//if
this.state = 57;
if (__ref._mlastrowindex /*int*/ ==-1) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 57;
RDebugUtils.currentLine=19071031;
 //BA.debugLineNum = 19071031;BA.debugLine="lblFromTo.Text = StringNoMatches";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._stringnomatches /*String*/ );
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=19071033;
 //BA.debugLineNum = 19071033;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+""));
RDebugUtils.currentLine=19071034;
 //BA.debugLineNum = 19071034;BA.debugLine="If AreThereMoreResults Then lblFromTo.Text = l";
if (true) break;

case 51:
//if
this.state = 56;
if (_aretheremoreresults) { 
this.state = 53;
;}if (true) break;

case 53:
//C
this.state = 56;
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()+" "+__ref._stringmoreavailable /*String*/ );
if (true) break;

case 56:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = 58;
;
RDebugUtils.currentLine=19071036;
 //BA.debugLineNum = 19071036;BA.debugLine="SetPageLabelState(lblNext, AreThereMoreResults)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_aretheremoreresults);
RDebugUtils.currentLine=19071037;
 //BA.debugLineNum = 19071037;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,parent.__c.False);
 if (true) break;

case 58:
//C
this.state = 61;
;
RDebugUtils.currentLine=19071039;
 //BA.debugLineNum = 19071039;BA.debugLine="SetPageLabelState(lblBack, mFirstRowIndex > 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mfirstrowindex /*int*/ >0);
RDebugUtils.currentLine=19071040;
 //BA.debugLineNum = 19071040;BA.debugLine="SetPageLabelState(lblFirst, lblBack.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
RDebugUtils.currentLine=19071041;
 //BA.debugLineNum = 19071041;BA.debugLine="mCurrentPage = Ceil(mFirstRowIndex / mRowsPerPag";
__ref._mcurrentpage /*int*/  = (int) (parent.__c.Ceil(__ref._mfirstrowindex /*int*/ /(double)__ref._mrowsperpage /*int*/ )+1);
RDebugUtils.currentLine=19071042;
 //BA.debugLineNum = 19071042;BA.debugLine="lblNumber.Text = NumberFormat(mCurrentPage, 0, 0";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.NumberFormat(__ref._mcurrentpage /*int*/ ,(int) (0),(int) (0)));
RDebugUtils.currentLine=19071043;
 //BA.debugLineNum = 19071043;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=19071044;
 //BA.debugLineNum = 19071044;BA.debugLine="mCurrentCount = TotalCount";
__ref._mcurrentcount /*int*/  = _totalcount;
 if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=19071046;
 //BA.debugLineNum = 19071046;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("919071046",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
;
RDebugUtils.currentLine=19071048;
 //BA.debugLineNum = 19071048;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DataUp";

case 61:
//if
this.state = 64;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated",(int) (0))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=19071049;
 //BA.debugLineNum = 19071049;BA.debugLine="CallSub(mCallBack, mEventName & \"_DataUpdated\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated");
 if (true) break;

case 64:
//C
this.state = -1;
;
RDebugUtils.currentLine=19071051;
 //BA.debugLineNum = 19071051;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _settexttocell(b4j.example.b4xtable __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _searchable) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "settexttocell", true))
	 {return ((String) Debug.delegate(ba, "settexttocell", new Object[] {_text,_lbl,_searchable}));}
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
int _x = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _textpane = null;
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub SetTextToCell (Text As String, lbl As";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="If Searchable = False Or HighlightSearchResults =";
if (_searchable==__c.False || __ref._highlightsearchresults /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="lbl.Text = Text";
_lbl.setText(_text);
 }else {
RDebugUtils.currentLine=19136517;
 //BA.debugLineNum = 19136517;BA.debugLine="Dim parent As B4XView = lbl.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _lbl.getParent();
RDebugUtils.currentLine=19136518;
 //BA.debugLineNum = 19136518;BA.debugLine="If parent.GetView(parent.NumberOfViews - 1).Tag";
if ((_parent.GetView((int) (_parent.getNumberOfViews()-1)).getTag()).equals((Object)(__ref._textpanetag /*String*/ ))) { 
RDebugUtils.currentLine=19136519;
 //BA.debugLineNum = 19136519;BA.debugLine="parent.GetView(parent.NumberOfViews - 1).Remove";
_parent.GetView((int) (_parent.getNumberOfViews()-1)).RemoveViewFromParent();
 };
RDebugUtils.currentLine=19136522;
 //BA.debugLineNum = 19136522;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=19136523;
 //BA.debugLineNum = 19136523;BA.debugLine="lbl.Text = Text";
_lbl.setText(_text);
 }else {
RDebugUtils.currentLine=19136525;
 //BA.debugLineNum = 19136525;BA.debugLine="Dim x As Int = Text.ToLowerCase.IndexOf(FilterT";
_x = _text.toLowerCase().indexOf(__ref._filtertext /*String*/ );
RDebugUtils.currentLine=19136526;
 //BA.debugLineNum = 19136526;BA.debugLine="If x = -1 Or (PrefixSearch And x > 0) Then";
if (_x==-1 || (__ref._prefixsearch /*boolean*/  && _x>0)) { 
RDebugUtils.currentLine=19136527;
 //BA.debugLineNum = 19136527;BA.debugLine="lbl.Text = Text";
_lbl.setText(_text);
RDebugUtils.currentLine=19136528;
 //BA.debugLineNum = 19136528;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=19136543;
 //BA.debugLineNum = 19136543;BA.debugLine="TextFlow.Reset";
__ref._textflow /*b4j.example.b4jtextflow*/ ._reset /*b4j.example.b4jtextflow*/ (null);
RDebugUtils.currentLine=19136544;
 //BA.debugLineNum = 19136544;BA.debugLine="If x > 0 Then";
if (_x>0) { 
RDebugUtils.currentLine=19136545;
 //BA.debugLineNum = 19136545;BA.debugLine="TextFlow.Append(Text.SubString2(0, x)).SetColo";
__ref._textflow /*b4j.example.b4jtextflow*/ ._append /*b4j.example.b4jtextflow*/ (null,_text.substring((int) (0),_x))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._textcolor /*int*/ )._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject())));
 };
RDebugUtils.currentLine=19136547;
 //BA.debugLineNum = 19136547;BA.debugLine="TextFlow.Append(Text.SubString2(x, x + FilterTe";
__ref._textflow /*b4j.example.b4jtextflow*/ ._append /*b4j.example.b4jtextflow*/ (null,_text.substring(_x,(int) (_x+__ref._filtertext /*String*/ .length())))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._highlighttextcolor /*int*/ )._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject())));
RDebugUtils.currentLine=19136548;
 //BA.debugLineNum = 19136548;BA.debugLine="If x + FilterText.Length < Text.Length Then";
if (_x+__ref._filtertext /*String*/ .length()<_text.length()) { 
RDebugUtils.currentLine=19136549;
 //BA.debugLineNum = 19136549;BA.debugLine="TextFlow.Append(Text.SubString(x + FilterText.";
__ref._textflow /*b4j.example.b4jtextflow*/ ._append /*b4j.example.b4jtextflow*/ (null,_text.substring((int) (_x+__ref._filtertext /*String*/ .length())))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._textcolor /*int*/ )._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject())));
 };
RDebugUtils.currentLine=19136551;
 //BA.debugLineNum = 19136551;BA.debugLine="Dim TextPane As B4XView = TextFlow.CreateTextFl";
_textpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textpane = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._textflow /*b4j.example.b4jtextflow*/ ._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()));
RDebugUtils.currentLine=19136552;
 //BA.debugLineNum = 19136552;BA.debugLine="TextPane.Tag = TextPaneTag";
_textpane.setTag((Object)(__ref._textpanetag /*String*/ ));
RDebugUtils.currentLine=19136553;
 //BA.debugLineNum = 19136553;BA.debugLine="lbl.Text = \"\"";
_lbl.setText("");
RDebugUtils.currentLine=19136554;
 //BA.debugLineNum = 19136554;BA.debugLine="parent.AddView(TextPane, 0, parent.Height / 2 -";
_parent.AddView((javafx.scene.Node)(_textpane.getObject()),0,_parent.getHeight()/(double)2-12,_parent.getWidth(),_parent.getHeight()/(double)2);
 };
 };
RDebugUtils.currentLine=19136558;
 //BA.debugLineNum = 19136558;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xtable __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Columns.Initialize";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="DefaultFormatter.Initialize";
__ref._defaultformatter /*b4j.example.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="DefaultDataFormatter.Initialize";
__ref._defaultdataformatter /*b4j.example.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="VisibleColumns.Initialize";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="HeaderFont = xui.CreateDefaultBoldFont(15)";
__ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (15));
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="LabelsFont = xui.CreateDefaultFont(15)";
__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15));
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="ArrowsDisabledColor = 0xFFBBBBBB";
__ref._arrowsdisabledcolor /*int*/  = ((int)0xffbbbbbb);
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="ArrowsEnabledColor = xui.Color_Black";
__ref._arrowsenabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="VisibleRowIds.Initialize";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="MinimumWidth = 140dip";
__ref._minimumwidth /*int*/  = __c.DipToCurrent((int) (140));
RDebugUtils.currentLine=17891341;
 //BA.debugLineNum = 17891341;BA.debugLine="RowHeight = 40dip";
__ref._rowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="HeadersHeight = 40dip";
__ref._headersheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=17891344;
 //BA.debugLineNum = 17891344;BA.debugLine="TextFlow.Initialize";
__ref._textflow /*b4j.example.b4jtextflow*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17891348;
 //BA.debugLineNum = 17891348;BA.debugLine="End Sub";
return "";
}
public String  _lblback_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblback_click", true))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Private Sub lblBack_Click";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="If lblBack.Tag = False Then Return";
if ((__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="setFirstRowIndex (mFirstRowIndex - mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ -__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="End Sub";
return "";
}
public String  _setfirstrowindex(b4j.example.b4xtable __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setfirstrowindex", true))
	 {return ((String) Debug.delegate(ba, "setfirstrowindex", new Object[] {_row}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub setFirstRowIndex (row As Int)";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="row = Max(0, Min(CountAll - 1, row))";
_row = (int) (__c.Max(0,__c.Min(__ref._countall /*int*/ -1,_row)));
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="mFirstRowIndex = row";
__ref._mfirstrowindex /*int*/  = _row;
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="End Sub";
return "";
}
public String  _lblback_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblback_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblback_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Private Sub lblBack_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="lblBack_Click";
__ref._lblback_click /*String*/ (null);
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return "";
}
public String  _lblfirst_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblfirst_click", true))
	 {return ((String) Debug.delegate(ba, "lblfirst_click", null));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Private Sub lblFirst_Click";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="If lblFirst.Tag = False Then Return";
if ((__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="setFirstRowIndex (0)";
__ref._setfirstrowindex /*String*/ (null,(int) (0));
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="End Sub";
return "";
}
public String  _lblfirst_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblfirst_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblfirst_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Private Sub lblFirst_MouseClicked (EventData As Mo";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="lblFirst_Click";
__ref._lblfirst_click /*String*/ (null);
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="End Sub";
return "";
}
public String  _lbllast_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbllast_click", true))
	 {return ((String) Debug.delegate(ba, "lbllast_click", null));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Private Sub lblLast_Click";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="If lblLast.Tag = False Then Return";
if ((__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="setFirstRowIndex (Floor(mCurrentCount /  mRowsPer";
__ref._setfirstrowindex /*String*/ (null,(int) (__c.Floor(__ref._mcurrentcount /*int*/ /(double)__ref._mrowsperpage /*int*/ )*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="End Sub";
return "";
}
public String  _lbllast_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbllast_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbllast_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Private Sub lblLast_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="lblLast_Click";
__ref._lbllast_click /*String*/ (null);
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="End Sub";
return "";
}
public String  _lblnext_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblnext_click", true))
	 {return ((String) Debug.delegate(ba, "lblnext_click", null));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Private Sub lblNext_Click";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="If lblNext.Tag = False Then Return";
if ((__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="setFirstRowIndex (mFirstRowIndex + mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ +__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="End Sub";
return "";
}
public String  _lblnext_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblnext_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblnext_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Private Sub lblNext_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="lblNext_Click";
__ref._lblnext_click /*String*/ (null);
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Refresh2(True, False)";
__ref._refresh2 /*String*/ (null,__c.True,__c.False);
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return "";
}
public String  _resizecolumnimpl(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,int _totalheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "resizecolumnimpl", true))
	 {return ((String) Debug.delegate(ba, "resizecolumnimpl", new Object[] {_c,_totalheight}));}
float _height = 0f;
int _topint = 0;
int _heightint = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub ResizeColumnImpl (c As B4XTableColumn,";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="Dim Height As Float = TotalHeight / mRowsPerPage";
_height = (float) (_totalheight/(double)__ref._mrowsperpage /*int*/ );
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="If AllowSmallRowHeightModifications = False Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ==__c.False) { 
_height = (float) (__ref._rowheight /*int*/ );};
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="Dim TopInt, HeightInt As Int";
_topint = 0;
_heightint = 0;
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="For i = 0 To c.CellsLayouts.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="If i < mRowsPerPage + 1 Then";
if (_i<__ref._mrowsperpage /*int*/ +1) { 
RDebugUtils.currentLine=18677769;
 //BA.debugLineNum = 18677769;BA.debugLine="Dim HeightInt As Int = Round(Height * i + Heade";
_heightint = (int) (__c.Round(_height*_i+__ref._headersheight /*int*/ -_topint));
RDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="If i = 0 Then HeightInt = HeadersHeight";
if (_i==0) { 
_heightint = __ref._headersheight /*int*/ ;};
RDebugUtils.currentLine=18677771;
 //BA.debugLineNum = 18677771;BA.debugLine="p.SetLayoutAnimated(0, 0, TopInt, c.ComputedWid";
_p.SetLayoutAnimated((int) (0),0,_topint,_c.ComputedWidth /*int*/ ,_heightint);
RDebugUtils.currentLine=18677772;
 //BA.debugLineNum = 18677772;BA.debugLine="p.Visible = True";
_p.setVisible(__c.True);
RDebugUtils.currentLine=18677773;
 //BA.debugLineNum = 18677773;BA.debugLine="If c.DisableAutoResizeLayout = False Then";
if (_c.DisableAutoResizeLayout /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=18677774;
 //BA.debugLineNum = 18677774;BA.debugLine="Dim lbl As B4XView = p.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView((int) (0));
RDebugUtils.currentLine=18677775;
 //BA.debugLineNum = 18677775;BA.debugLine="lbl.SetLayoutAnimated(0, 0, 0, p.Width, p.Heig";
_lbl.SetLayoutAnimated((int) (0),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=18677777;
 //BA.debugLineNum = 18677777;BA.debugLine="If c.Searchable And p.NumberOfViews > 1 And p.";
if (_c.Searchable /*boolean*/  && _p.getNumberOfViews()>1 && (_p.GetView((int) (1)).getTag()).equals((Object)(__ref._textpanetag /*String*/ ))) { 
RDebugUtils.currentLine=18677778;
 //BA.debugLineNum = 18677778;BA.debugLine="p.GetView(1).Width = p.Width";
_p.GetView((int) (1)).setWidth(_p.getWidth());
 };
 };
RDebugUtils.currentLine=18677782;
 //BA.debugLineNum = 18677782;BA.debugLine="TopInt = TopInt + HeightInt";
_topint = (int) (_topint+_heightint);
 }else {
RDebugUtils.currentLine=18677784;
 //BA.debugLineNum = 18677784;BA.debugLine="p.Visible = False";
_p.setVisible(__c.False);
 };
 }
};
RDebugUtils.currentLine=18677787;
 //BA.debugLineNum = 18677787;BA.debugLine="End Sub";
return "";
}
public String  _resizeandreorderclvitems(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "resizeandreorderclvitems", true))
	 {return ((String) Debug.delegate(ba, "resizeandreorderclvitems", null));}
int _i = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
int _clvindex = 0;
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Private Sub ResizeAndReorderCLVItems";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Dim i As Int = NumberOfFrozenColumns";
_i = __ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="Do While i < VisibleColumns.Size";
while (_i<__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) {
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4j.example.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="Dim CLVIndex As Int = i - NumberOfFrozenColumns";
_clvindex = (int) (_i-__ref._numberoffrozencolumns /*int*/ );
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="If c <> clvData.GetValue(CLVIndex) Then";
if ((_c).equals((b4j.example.b4xtable._b4xtablecolumn)(__ref._clvdata /*b4j.example.customlistview*/ ._getvalue(_clvindex))) == false) { 
RDebugUtils.currentLine=18415622;
 //BA.debugLineNum = 18415622;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
RDebugUtils.currentLine=18415623;
 //BA.debugLineNum = 18415623;BA.debugLine="clvData.InsertAt(CLVIndex, c.Panel, c)";
__ref._clvdata /*b4j.example.customlistview*/ ._insertat(_clvindex,_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
 }else {
RDebugUtils.currentLine=18415625;
 //BA.debugLineNum = 18415625;BA.debugLine="clvData.ResizeItem(CLVIndex, c.ComputedWidth)";
__ref._clvdata /*b4j.example.customlistview*/ ._resizeitem(_clvindex,_c.ComputedWidth /*int*/ );
 };
RDebugUtils.currentLine=18415627;
 //BA.debugLineNum = 18415627;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=18415629;
 //BA.debugLineNum = 18415629;BA.debugLine="End Sub";
return "";
}
public void  _updatesearchfieldvisibility(b4j.example.b4xtable __ref) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesearchfieldvisibility", true))
	 {Debug.delegate(ba, "updatesearchfieldvisibility", null); return;}
ResumableSub_UpdateSearchFieldVisibility rsub = new ResumableSub_UpdateSearchFieldVisibility(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateSearchFieldVisibility extends BA.ResumableSub {
public ResumableSub_UpdateSearchFieldVisibility(b4j.example.b4xtable parent,b4j.example.b4xtable __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Sleep(100) 'workaround for a JavaFX drawing bug";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "updatesearchfieldvisibility"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="SearchField.mBase.Visible = SearchVisible And Cou";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._searchvisible /*boolean*/  && __ref._countall /*int*/ >0);
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refreshnow(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refreshnow", true))
	 {return ((String) Debug.delegate(ba, "refreshnow", null));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub RefreshNow";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Refresh2(True, True)";
__ref._refresh2 /*String*/ (null,__c.True,__c.True);
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return "";
}
public void  _searchfield_textchanged(b4j.example.b4xtable __ref,String _old,String _new) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}); return;}
ResumableSub_SearchField_TextChanged rsub = new ResumableSub_SearchField_TextChanged(this,__ref,_old,_new);
rsub.resume(ba, null);
}
public static class ResumableSub_SearchField_TextChanged extends BA.ResumableSub {
public ResumableSub_SearchField_TextChanged(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,String _old,String _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
String _old;
String _new;
int _myindex = 0;
String _term = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="SearchIndex = SearchIndex + 1";
__ref._searchindex /*int*/  = (int) (__ref._searchindex /*int*/ +1);
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Dim MyIndex As Int = SearchIndex";
_myindex = __ref._searchindex /*int*/ ;
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Sleep(SleepBeforeSearch)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "searchfield_textchanged"),__ref._sleepbeforesearch /*int*/ );
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="If MyIndex <> SearchIndex Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_myindex!=__ref._searchindex /*int*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="Dim term As String = New.ToLowerCase";
_term = _new.toLowerCase();
RDebugUtils.currentLine=21299208;
 //BA.debugLineNum = 21299208;BA.debugLine="If term = FilterText Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if ((_term).equals(__ref._filtertext /*String*/ )) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="FilterText = term";
__ref._filtertext /*String*/  = _term;
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setcurrentpage(b4j.example.b4xtable __ref,int _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setcurrentpage", true))
	 {return ((String) Debug.delegate(ba, "setcurrentpage", new Object[] {_p}));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub setCurrentPage(p As Int)";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="setFirstRowIndex((p - 1) * mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) ((_p-1)*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="End Sub";
return "";
}
public String  _updatetablecounters(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatetablecounters", true))
	 {return ((String) Debug.delegate(ba, "updatetablecounters", null));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub UpdateTableCounters";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="End Sub";
return "";
}
}