package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xcombobox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xcombobox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _lastselectedindex = 0;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cmbbox = null;
public int _delaybeforechangeevent = 0;
public int _delayindex = 0;
public Object _tag = null;
public String _b4icancelbutton = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 56;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
_mbase.GetView((int) (0)).SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private LastSelectedIndex As Int";
_lastselectedindex = 0;
 //BA.debugLineNum = 9;BA.debugLine="Public cmbBox As ComboBox";
_cmbbox = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Public DelayBeforeChangeEvent As Int";
_delaybeforechangeevent = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private DelayIndex As Int";
_delayindex = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
_b4icancelbutton = "Cancel";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _cmbbox_selectedindexchanged(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Private Sub CmbBox_SelectedIndexChanged(Index As I";
 //BA.debugLineNum = 154;BA.debugLine="RaiseEvent";
_raiseevent();
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbox = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_tag = _mbase.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
_cmbbox.Initialize(ba,"cmbBox");
 //BA.debugLineNum = 38;BA.debugLine="Dim xbox As B4XView = cmbBox";
_xbox = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbox = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cmbbox.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="xbox.Font = xlbl.Font";
_xbox.setFont(_xlbl.getFont());
 //BA.debugLineNum = 40;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
_mbase.AddView((javafx.scene.Node)(_cmbbox.getObject()),0,0,_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _getitem(int _index) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub GetItem(Index As Int) As String";
 //BA.debugLineNum = 129;BA.debugLine="Return cmbBox.Items.Get(Index)";
if (true) return BA.ObjectToString(_cmbbox.getItems().Get(_index));
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public int  _getselectedindex() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub getSelectedIndex As Int";
 //BA.debugLineNum = 100;BA.debugLine="Return cmbBox.SelectedIndex";
if (true) return _cmbbox.getSelectedIndex();
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return 0;
}
public String  _getselecteditem() throws Exception{
int _i = 0;
 //BA.debugLineNum = 121;BA.debugLine="Public Sub getSelectedItem As String";
 //BA.debugLineNum = 122;BA.debugLine="Dim i As Int = getSelectedIndex";
_i = _getselectedindex();
 //BA.debugLineNum = 123;BA.debugLine="If i = -1 Then Return \"\"";
if (_i==-1) { 
if (true) return "";};
 //BA.debugLineNum = 124;BA.debugLine="Return GetItem(i)";
if (true) return _getitem(_i);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public int  _getsize() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 78;BA.debugLine="Return cmbBox.Items.Size";
if (true) return _cmbbox.getItems().getSize();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(String _item) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub IndexOf(Item As String) As Int";
 //BA.debugLineNum = 89;BA.debugLine="Return cmbBox.Items.IndexOf(Item)";
if (true) return _cmbbox.getItems().IndexOf((Object)(_item));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 27;BA.debugLine="LastSelectedIndex = -1";
_lastselectedindex = (int) (-1);
 //BA.debugLineNum = 28;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
if (_xui.getIsB4J()) { 
_delaybeforechangeevent = (int) (500);};
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public void  _raiseevent() throws Exception{
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(b4j.example.b4xcombobox parent) {
this.parent = parent;
}
b4j.example.b4xcombobox parent;
int _index = 0;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 138;BA.debugLine="Dim index As Int = getSelectedIndex";
_index = parent._getselectedindex();
 //BA.debugLineNum = 139;BA.debugLine="If LastSelectedIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._lastselectedindex==_index) { 
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
 //BA.debugLineNum = 140;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (parent._delaybeforechangeevent>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 141;BA.debugLine="DelayIndex = DelayIndex + 1";
parent._delayindex = (int) (parent._delayindex+1);
 //BA.debugLineNum = 142;BA.debugLine="Dim MyIndex As Int = DelayIndex";
_myindex = parent._delayindex;
 //BA.debugLineNum = 143;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
parent.__c.Sleep(ba,this,parent._delaybeforechangeevent);
this.state = 21;
return;
case 21:
//C
this.state = 10;
;
 //BA.debugLineNum = 144;BA.debugLine="If MyIndex <> DelayIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=parent._delayindex) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 146;BA.debugLine="LastSelectedIndex = index";
parent._lastselectedindex = _index;
 //BA.debugLineNum = 147;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (true) break;

case 17:
//if
this.state = 20;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_SelectedIndexChanged",(int) (1))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 148;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndex";
parent.__c.CallSubNew2(ba,parent._mcallback,parent._meventname+"_SelectedIndexChanged",(Object)(_index));
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SetItems(Items As List)";
 //BA.debugLineNum = 61;BA.debugLine="cmbBox.Items.Clear";
_cmbbox.getItems().Clear();
 //BA.debugLineNum = 62;BA.debugLine="cmbBox.Items.AddAll(Items)";
_cmbbox.getItems().AddAll(_items);
 //BA.debugLineNum = 72;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if (_items.getSize()>0) { 
_setselectedindex((int) (0));};
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setselectedindex(int _i) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
 //BA.debugLineNum = 107;BA.debugLine="LastSelectedIndex = i";
_lastselectedindex = _i;
 //BA.debugLineNum = 109;BA.debugLine="cmbBox.SelectedIndex = i";
_cmbbox.setSelectedIndex(_i);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
