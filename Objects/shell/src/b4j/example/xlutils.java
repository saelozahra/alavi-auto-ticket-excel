
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xlutils {
    public static RemoteObject myClass;
	public xlutils() {
	}
    public static PCBA staticBA = new PCBA(null, xlutils.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _reader = RemoteObject.declareNull("b4j.example.xlreader");
public static RemoteObject _createwriterpassword = RemoteObject.createImmutable("");
public static RemoteObject _color_black = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_white = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_red = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_bright_green = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_yellow = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_pink = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_turquoise = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_dark_red = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_green = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_dark_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_dark_yellow = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_violet = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_teal = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_grey_25_percent = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_grey_50_percent = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_cornflower_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_maroon = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_lemon_chiffon = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_light_turquoise1 = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_orchid = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_coral = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_royal_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_light_cornflower_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_sky_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_light_turquoise = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_light_green = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_light_yellow = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_pale_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_rose = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_lavender = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_tan = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_light_blue = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_aqua = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_lime = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_gold = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_light_orange = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_orange = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_blue_grey = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_grey_40_percent = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_dark_teal = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_sea_green = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_dark_green = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_olive_green = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_brown = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_plum = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_indigo = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_grey_80_percent = RemoteObject.createImmutable((short)0);
public static RemoteObject _color_automatic = RemoteObject.createImmutable((short)0);
public static RemoteObject _blankworkbookis2007 = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BlankWorkbookIs2007",_ref.getField(false, "_blankworkbookis2007"),"COLOR_AQUA",_ref.getField(false, "_color_aqua"),"COLOR_AUTOMATIC",_ref.getField(false, "_color_automatic"),"COLOR_BLACK",_ref.getField(false, "_color_black"),"COLOR_BLUE",_ref.getField(false, "_color_blue"),"COLOR_BLUE_GREY",_ref.getField(false, "_color_blue_grey"),"COLOR_BRIGHT_GREEN",_ref.getField(false, "_color_bright_green"),"COLOR_BROWN",_ref.getField(false, "_color_brown"),"COLOR_CORAL",_ref.getField(false, "_color_coral"),"COLOR_CORNFLOWER_BLUE",_ref.getField(false, "_color_cornflower_blue"),"COLOR_DARK_BLUE",_ref.getField(false, "_color_dark_blue"),"COLOR_DARK_GREEN",_ref.getField(false, "_color_dark_green"),"COLOR_DARK_RED",_ref.getField(false, "_color_dark_red"),"COLOR_DARK_TEAL",_ref.getField(false, "_color_dark_teal"),"COLOR_DARK_YELLOW",_ref.getField(false, "_color_dark_yellow"),"COLOR_GOLD",_ref.getField(false, "_color_gold"),"COLOR_GREEN",_ref.getField(false, "_color_green"),"COLOR_GREY_25_PERCENT",_ref.getField(false, "_color_grey_25_percent"),"COLOR_GREY_40_PERCENT",_ref.getField(false, "_color_grey_40_percent"),"COLOR_GREY_50_PERCENT",_ref.getField(false, "_color_grey_50_percent"),"COLOR_GREY_80_PERCENT",_ref.getField(false, "_color_grey_80_percent"),"COLOR_INDIGO",_ref.getField(false, "_color_indigo"),"COLOR_LAVENDER",_ref.getField(false, "_color_lavender"),"COLOR_LEMON_CHIFFON",_ref.getField(false, "_color_lemon_chiffon"),"COLOR_LIGHT_BLUE",_ref.getField(false, "_color_light_blue"),"COLOR_LIGHT_CORNFLOWER_BLUE",_ref.getField(false, "_color_light_cornflower_blue"),"COLOR_LIGHT_GREEN",_ref.getField(false, "_color_light_green"),"COLOR_LIGHT_ORANGE",_ref.getField(false, "_color_light_orange"),"COLOR_LIGHT_TURQUOISE",_ref.getField(false, "_color_light_turquoise"),"COLOR_LIGHT_TURQUOISE1",_ref.getField(false, "_color_light_turquoise1"),"COLOR_LIGHT_YELLOW",_ref.getField(false, "_color_light_yellow"),"COLOR_LIME",_ref.getField(false, "_color_lime"),"COLOR_MAROON",_ref.getField(false, "_color_maroon"),"COLOR_OLIVE_GREEN",_ref.getField(false, "_color_olive_green"),"COLOR_ORANGE",_ref.getField(false, "_color_orange"),"COLOR_ORCHID",_ref.getField(false, "_color_orchid"),"COLOR_PALE_BLUE",_ref.getField(false, "_color_pale_blue"),"COLOR_PINK",_ref.getField(false, "_color_pink"),"COLOR_PLUM",_ref.getField(false, "_color_plum"),"COLOR_RED",_ref.getField(false, "_color_red"),"COLOR_ROSE",_ref.getField(false, "_color_rose"),"COLOR_ROYAL_BLUE",_ref.getField(false, "_color_royal_blue"),"COLOR_SEA_GREEN",_ref.getField(false, "_color_sea_green"),"COLOR_SKY_BLUE",_ref.getField(false, "_color_sky_blue"),"COLOR_TAN",_ref.getField(false, "_color_tan"),"COLOR_TEAL",_ref.getField(false, "_color_teal"),"COLOR_TURQUOISE",_ref.getField(false, "_color_turquoise"),"COLOR_VIOLET",_ref.getField(false, "_color_violet"),"COLOR_WHITE",_ref.getField(false, "_color_white"),"COLOR_YELLOW",_ref.getField(false, "_color_yellow"),"CreateWriterPassword",_ref.getField(false, "_createwriterpassword"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Reader",_ref.getField(false, "_reader")};
}
}