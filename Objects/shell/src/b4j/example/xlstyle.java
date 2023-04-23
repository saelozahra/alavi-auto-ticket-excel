
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xlstyle {
    public static RemoteObject myClass;
	public xlstyle() {
	}
    public static PCBA staticBA = new PCBA(null, xlstyle.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _style_key_horizontal_alignment = RemoteObject.createImmutable("");
public static RemoteObject _style_key_border_bottom = RemoteObject.createImmutable("");
public static RemoteObject _style_key_border_left = RemoteObject.createImmutable("");
public static RemoteObject _style_key_border_right = RemoteObject.createImmutable("");
public static RemoteObject _style_key_border_top = RemoteObject.createImmutable("");
public static RemoteObject _style_key_bottom_border_color = RemoteObject.createImmutable("");
public static RemoteObject _style_key_left_border_color = RemoteObject.createImmutable("");
public static RemoteObject _style_key_right_border_color = RemoteObject.createImmutable("");
public static RemoteObject _style_key_top_border_color = RemoteObject.createImmutable("");
public static RemoteObject _style_key_data_format = RemoteObject.createImmutable("");
public static RemoteObject _style_key_fill_foreground_color = RemoteObject.createImmutable("");
public static RemoteObject _style_key_fill_pattern = RemoteObject.createImmutable("");
public static RemoteObject _style_key_font = RemoteObject.createImmutable("");
public static RemoteObject _style_key_hidden = RemoteObject.createImmutable("");
public static RemoteObject _style_key_indention = RemoteObject.createImmutable("");
public static RemoteObject _style_key_locked = RemoteObject.createImmutable("");
public static RemoteObject _style_key_rotation = RemoteObject.createImmutable("");
public static RemoteObject _style_key_vertical_alignment = RemoteObject.createImmutable("");
public static RemoteObject _style_key_wrap_text = RemoteObject.createImmutable("");
public static RemoteObject _bba = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _stylemap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _writer = RemoteObject.declareNull("b4j.example.xlworkbookwriter");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bba",_ref.getField(false, "_bba"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"STYLE_KEY_BORDER_BOTTOM",_ref.getField(false, "_style_key_border_bottom"),"STYLE_KEY_BORDER_LEFT",_ref.getField(false, "_style_key_border_left"),"STYLE_KEY_BORDER_RIGHT",_ref.getField(false, "_style_key_border_right"),"STYLE_KEY_BORDER_TOP",_ref.getField(false, "_style_key_border_top"),"STYLE_KEY_BOTTOM_BORDER_COLOR",_ref.getField(false, "_style_key_bottom_border_color"),"STYLE_KEY_DATA_FORMAT",_ref.getField(false, "_style_key_data_format"),"STYLE_KEY_FILL_FOREGROUND_COLOR",_ref.getField(false, "_style_key_fill_foreground_color"),"STYLE_KEY_FILL_PATTERN",_ref.getField(false, "_style_key_fill_pattern"),"STYLE_KEY_FONT",_ref.getField(false, "_style_key_font"),"STYLE_KEY_HIDDEN",_ref.getField(false, "_style_key_hidden"),"STYLE_KEY_HORIZONTAL_ALIGNMENT",_ref.getField(false, "_style_key_horizontal_alignment"),"STYLE_KEY_INDENTION",_ref.getField(false, "_style_key_indention"),"STYLE_KEY_LEFT_BORDER_COLOR",_ref.getField(false, "_style_key_left_border_color"),"STYLE_KEY_LOCKED",_ref.getField(false, "_style_key_locked"),"STYLE_KEY_RIGHT_BORDER_COLOR",_ref.getField(false, "_style_key_right_border_color"),"STYLE_KEY_ROTATION",_ref.getField(false, "_style_key_rotation"),"STYLE_KEY_TOP_BORDER_COLOR",_ref.getField(false, "_style_key_top_border_color"),"STYLE_KEY_VERTICAL_ALIGNMENT",_ref.getField(false, "_style_key_vertical_alignment"),"STYLE_KEY_WRAP_TEXT",_ref.getField(false, "_style_key_wrap_text"),"StyleMap",_ref.getField(false, "_stylemap"),"writer",_ref.getField(false, "_writer")};
}
}