package study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q3_48Util {

	public static Calendar grego (String strcl) throws ParseException {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/m/d");
		Date datecl = sdf.parse(strcl);
		cl.setTime(datecl);
		return cl;
	}
}
