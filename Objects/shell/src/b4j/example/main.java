
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _b4xtable1 = RemoteObject.declareNull("b4j.example.b4xtable");
public static RemoteObject _xl = RemoteObject.declareNull("b4j.example.xlutils");
public static RemoteObject _bcname = RemoteObject.createImmutable("");
public static RemoteObject _uname = RemoteObject.createImmutable("");
public static RemoteObject _fathername = RemoteObject.createImmutable("");
public static RemoteObject _mellicode = RemoteObject.createImmutable("");
public static RemoteObject _mablaghril = RemoteObject.createImmutable("");
public static RemoteObject _fileaddress = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _sheetcombo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.example.b4xcollections.class),"B4XTable1",main._b4xtable1,"BCName",main._bcname,"CSSUtils",main._cssutils,"DateUtils",main._dateutils,"FatherName",main._fathername,"fileaddress",main._fileaddress,"fx",main._fx,"MablaghRil",main._mablaghril,"MainForm",main._mainform,"MelliCode",main._mellicode,"SheetCombo",main._sheetcombo,"UName",main._uname,"XL",main._xl,"xui",main._xui,"XUIViewsUtils",Debug.moduleToString(b4j.example.xuiviewsutils.class)};
}
}