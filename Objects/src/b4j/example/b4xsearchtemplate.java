package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xsearchtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xsearchtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xsearchtemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public b4j.example.b4xdialog _xdialog = null;
public b4j.example.b4xfloattextfield _searchfield = null;
public anywheresoftware.b4a.objects.collections.Map _prefixlist = null;
public anywheresoftware.b4a.objects.collections.Map _substringlist = null;
public int _texthighlightcolor = 0;
public int _itemhightlightcolor = 0;
public int _max_limit = 0;
public int _maxnumberofitemstoshow = 0;
public anywheresoftware.b4a.objects.collections.List _itemscache = null;
public anywheresoftware.b4a.objects.collections.List _allitems = null;
public String _selecteditem = "";
public String _lastterm = "";
public boolean _allowunlistedtext = false;
public boolean _prefixonly = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _additemstolist(anywheresoftware.b4a.objects.collections.List _li,String _full) throws Exception{
b4j.example.b4jtextflow _tf = null;
int _i = 0;
String _item = "";
int _x = 0;
int _pnlcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _textpane = null;
 //BA.debugLineNum = 128;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
 //BA.debugLineNum = 129;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 131;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new b4j.example.b4jtextflow();
 //BA.debugLineNum = 132;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (ba);
 //BA.debugLineNum = 134;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 135;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (_customlistview1._getsize()>=_maxnumberofitemstoshow) { 
if (true) return "";};
 //BA.debugLineNum = 136;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
 //BA.debugLineNum = 137;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
 //BA.debugLineNum = 138;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
 //BA.debugLineNum = 139;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 141;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
 //BA.debugLineNum = 142;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (_customlistview1._getsize()==0 && _full.length()>0 && _allowunlistedtext==__c.False) { 
 //BA.debugLineNum = 143;BA.debugLine="pnlColor = ItemHightlightColor";
_pnlcolor = _itemhightlightcolor;
 }else {
 //BA.debugLineNum = 145;BA.debugLine="pnlColor = CustomListView1.DefaultTextBackgroun";
_pnlcolor = _customlistview1._defaulttextbackgroundcolor;
 };
 //BA.debugLineNum = 166;BA.debugLine="tf.Reset";
_tf._reset /*b4j.example.b4jtextflow*/ ();
 //BA.debugLineNum = 167;BA.debugLine="If x > 0 Then";
if (_x>0) { 
 //BA.debugLineNum = 168;BA.debugLine="tf.Append(item.SubString2(0, x)).SetColor(Custo";
_tf._append /*b4j.example.b4jtextflow*/ (_item.substring((int) (0),_x))._setcolor /*b4j.example.b4jtextflow*/ (_customlistview1._defaulttextcolor);
 };
 //BA.debugLineNum = 170;BA.debugLine="If full.Length > 0 Then";
if (_full.length()>0) { 
 //BA.debugLineNum = 171;BA.debugLine="tf.Append(item.SubString2(x, x + full.Length)).";
_tf._append /*b4j.example.b4jtextflow*/ (_item.substring(_x,(int) (_x+_full.length())))._setcolor /*b4j.example.b4jtextflow*/ (_texthighlightcolor);
 };
 //BA.debugLineNum = 173;BA.debugLine="If x + full.Length < item.Length Then";
if (_x+_full.length()<_item.length()) { 
 //BA.debugLineNum = 174;BA.debugLine="tf.Append(item.SubString(x + full.Length)).SetC";
_tf._append /*b4j.example.b4jtextflow*/ (_item.substring((int) (_x+_full.length())))._setcolor /*b4j.example.b4jtextflow*/ (_customlistview1._defaulttextcolor);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 177;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,_customlistview1._asview().getWidth(),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 178;BA.debugLine="Dim TextPane As B4XView = tf.CreateTextFlow";
_textpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textpane = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ ().getObject()));
 //BA.debugLineNum = 179;BA.debugLine="p.AddView(TextPane, 0, p.Height / 2 - 12, p.Widt";
_p.AddView((javafx.scene.Node)(_textpane.getObject()),0,_p.getHeight()/(double)2-12,_p.getWidth(),_p.getHeight()/(double)2);
 //BA.debugLineNum = 180;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
 //BA.debugLineNum = 181;BA.debugLine="CustomListView1.Add(p, item)";
_customlistview1._add(_p,(Object)(_item));
 }
};
 //BA.debugLineNum = 184;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
 //BA.debugLineNum = 185;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
 //BA.debugLineNum = 186;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
 //BA.debugLineNum = 187;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
 //BA.debugLineNum = 188;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
 //BA.debugLineNum = 5;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4j.example.b4xdialog();
 //BA.debugLineNum = 6;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4j.example.b4xfloattextfield();
 //BA.debugLineNum = 7;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = ((int)0xfffd5c5c);
 //BA.debugLineNum = 10;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = ((int)0x7e008eff);
 //BA.debugLineNum = 11;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
 //BA.debugLineNum = 12;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
 //BA.debugLineNum = 13;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
 //BA.debugLineNum = 16;BA.debugLine="Private LastTerm As String";
_lastterm = "";
 //BA.debugLineNum = 20;BA.debugLine="Public AllowUnlistedText As Boolean";
_allowunlistedtext = false;
 //BA.debugLineNum = 21;BA.debugLine="Public PrefixOnly As Boolean";
_prefixonly = false;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
 //BA.debugLineNum = 123;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
 //BA.debugLineNum = 124;BA.debugLine="SelectedItem = Value";
_selecteditem = BA.ObjectToString(_value);
 //BA.debugLineNum = 125;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
_xdialog._close /*boolean*/ (_xui.DialogResponse_Positive);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 62;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
int _height = 0;
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 25;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
_mbase = _xui.CreatePanel(ba,"mBase");
 //BA.debugLineNum = 27;BA.debugLine="Dim height As Int";
_height = 0;
 //BA.debugLineNum = 28;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (_xui.getIsB4A() || _xui.getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
 //BA.debugLineNum = 29;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
_mbase.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),_height);
 //BA.debugLineNum = 30;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
_mbase.LoadLayout("SearchTemplate",ba);
 //BA.debugLineNum = 31;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_mbase.SetColorAndBorder(_xui.Color_Transparent,0,(int) (0),0);
 //BA.debugLineNum = 32;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
_customlistview1._sv.SetColorAndBorder(_xui.Color_Transparent,0,(int) (0),0);
 //BA.debugLineNum = 33;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
_customlistview1._defaulttextbackgroundcolor = ((int)0xff555555);
 //BA.debugLineNum = 34;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
_customlistview1._defaulttextcolor = _xui.Color_White;
 //BA.debugLineNum = 36;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(_customlistview1._sv.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
 //BA.debugLineNum = 38;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
 //BA.debugLineNum = 44;BA.debugLine="ItemsCache.Initialize";
_itemscache.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="prefixList.Initialize";
_prefixlist.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="substringList.Initialize";
_substringlist.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _resize(int _width,int _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
 //BA.debugLineNum = 54;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
 //BA.debugLineNum = 55;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
_mbase.SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 56;BA.debugLine="Dim c As B4XView = CustomListView1.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = _customlistview1._asview();
 //BA.debugLineNum = 57;BA.debugLine="c.SetLayoutAnimated(0, 0, c.Top, Width, Height -";
_c.SetLayoutAnimated((int) (0),0,_c.getTop(),_width,_height-_c.getTop());
 //BA.debugLineNum = 58;BA.debugLine="CustomListView1.Base_Resize(Width, c.Height)";
_customlistview1._base_resize(_width,_c.getHeight());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Private Sub SearchField_EnterPressed";
 //BA.debugLineNum = 113;BA.debugLine="If AllowUnlistedText Then";
if (_allowunlistedtext) { 
 //BA.debugLineNum = 114;BA.debugLine="SelectedItem = LastTerm";
_selecteditem = _lastterm;
 //BA.debugLineNum = 115;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
_xdialog._close /*boolean*/ (_xui.DialogResponse_Positive);
 }else if(_customlistview1._getsize()>0 && _lastterm.length()>0) { 
 //BA.debugLineNum = 117;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
_customlistview1_itemclick((int) (0),_customlistview1._getvalue((int) (0)));
 };
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
 //BA.debugLineNum = 82;BA.debugLine="Update(New, False)";
_update(_new,__c.False);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _setindex(Object _index) throws Exception{
Object[] _obj = null;
 //BA.debugLineNum = 233;BA.debugLine="Public Sub SetIndex(Index As Object)";
 //BA.debugLineNum = 234;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
 //BA.debugLineNum = 235;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
 //BA.debugLineNum = 236;BA.debugLine="prefixList = obj(0)";
_prefixlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (0)]));
 //BA.debugLineNum = 237;BA.debugLine="substringList = obj(1)";
_substringlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (1)]));
 //BA.debugLineNum = 238;BA.debugLine="Dim AllItems As List = obj(2)";
_allitems = new anywheresoftware.b4a.objects.collections.List();
_allitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_obj[(int) (2)]));
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public Object  _setitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
long _starttime = 0L;
anywheresoftware.b4a.objects.collections.Map _noduplicates = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
String _itemnotlower = "";
String _itemtolower = "";
int _start = 0;
int _count = 0;
String _str = "";
 //BA.debugLineNum = 196;BA.debugLine="Public Sub SetItems(Items As List) As Object";
 //BA.debugLineNum = 197;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
 //BA.debugLineNum = 198;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
 //BA.debugLineNum = 199;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 200;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
 //BA.debugLineNum = 201;BA.debugLine="prefixList.Clear";
_prefixlist.Clear();
 //BA.debugLineNum = 202;BA.debugLine="substringList.Clear";
_substringlist.Clear();
 //BA.debugLineNum = 203;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 204;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 205;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 206;BA.debugLine="Dim itemNotLower As String = Items.Get(i)";
_itemnotlower = BA.ObjectToString(_items.Get(_i));
 //BA.debugLineNum = 207;BA.debugLine="Dim itemToLower As String = itemNotLower.ToLower";
_itemtolower = _itemnotlower.toLowerCase();
 //BA.debugLineNum = 208;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
 //BA.debugLineNum = 209;BA.debugLine="For start = 0 To IIf(PrefixOnly, 0, itemToLower.";
{
final int step13 = 1;
final int limit13 = (int)(BA.ObjectToNumber(((_prefixonly) ? ((Object)(0)) : ((Object)(_itemtolower.length()-1)))));
_start = (int) (0) ;
for (;_start <= limit13 ;_start = _start + step13 ) {
 //BA.debugLineNum = 210;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
 //BA.debugLineNum = 211;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=_max_limit && _start+_count<=_itemtolower.length()) {
 //BA.debugLineNum = 212;BA.debugLine="Dim str As String = itemToLower.SubString2(sta";
_str = _itemtolower.substring(_start,(int) (_start+_count));
 //BA.debugLineNum = 213;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
 //BA.debugLineNum = 214;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
 //BA.debugLineNum = 215;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = _prefixlist;}
else {
_m = _substringlist;};
 //BA.debugLineNum = 216;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
 //BA.debugLineNum = 217;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 218;BA.debugLine="li.Initialize";
_li.Initialize();
 //BA.debugLineNum = 219;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
 //BA.debugLineNum = 221;BA.debugLine="li.Add(itemNotLower)";
_li.Add((Object)(_itemnotlower));
 };
 //BA.debugLineNum = 223;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
 //BA.debugLineNum = 227;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.LogImpl("920709407","Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)",0);
 //BA.debugLineNum = 228;BA.debugLine="AllItems = Items";
_allitems = _items;
 //BA.debugLineNum = 229;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(_prefixlist.getObject()),(Object)(_substringlist.getObject()),(Object)(_allitems.getObject())});
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public void  _show(b4j.example.b4xdialog _dialog) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xsearchtemplate parent,b4j.example.b4xdialog _dialog) {
this.parent = parent;
this._dialog = _dialog;
}
b4j.example.b4xsearchtemplate parent;
b4j.example.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 66;BA.debugLine="xDialog = Dialog";
parent._xdialog = _dialog;
 //BA.debugLineNum = 67;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
parent._xdialog._putattop /*boolean*/  = parent._xui.getIsB4A() || parent._xui.getIsB4i();
 //BA.debugLineNum = 68;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
parent._customlistview1._asview().setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 69;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
parent._customlistview1._sv.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 70;BA.debugLine="mBase.Color = xui.Color_Transparent";
parent._mbase.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 71;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 72;BA.debugLine="Update(\"\", True)";
parent._update("",parent.__c.True);
 //BA.debugLineNum = 73;BA.debugLine="CustomListView1.JumpToItem(0)";
parent._customlistview1._jumptoitem((int) (0));
 //BA.debugLineNum = 74;BA.debugLine="SearchField.Text = \"\"";
parent._searchfield._settext /*String*/ ("");
 //BA.debugLineNum = 75;BA.debugLine="SearchField.TextField.RequestFocus";
parent._searchfield._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().RequestFocus();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _update(String _term,boolean _force) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _str1 = "";
String _str2 = "";
 //BA.debugLineNum = 85;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
 //BA.debugLineNum = 86;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(_lastterm) && _force==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 87;BA.debugLine="LastTerm = Term";
_lastterm = _term;
 //BA.debugLineNum = 88;BA.debugLine="If xui.IsB4J = False Then";
if (_xui.getIsB4J()==__c.False) { 
 //BA.debugLineNum = 89;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_customlistview1._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 90;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _customlistview1._getpanel(_i);
 //BA.debugLineNum = 91;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
 //BA.debugLineNum = 92;BA.debugLine="ItemsCache.Add(p)";
_itemscache.Add((Object)(_p.getObject()));
 }
};
 };
 //BA.debugLineNum = 95;BA.debugLine="CustomListView1.Clear";
_customlistview1._clear();
 //BA.debugLineNum = 97;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
 //BA.debugLineNum = 98;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
 //BA.debugLineNum = 99;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
 //BA.debugLineNum = 100;BA.debugLine="AddItemsToList(AllItems, str1)";
_additemstolist(_allitems,_str1);
 }else {
 //BA.debugLineNum = 102;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>_max_limit) { 
 //BA.debugLineNum = 103;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),_max_limit);
 }else {
 //BA.debugLineNum = 105;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
 //BA.debugLineNum = 107;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
_additemstolist((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefixlist.Get((Object)(_str2)))),_str1);
 //BA.debugLineNum = 108;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
_additemstolist((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_substringlist.Get((Object)(_str2)))),_str1);
 };
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((b4j.example.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
