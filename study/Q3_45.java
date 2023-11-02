package study;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Q3_45 {

	private static final Q3_45 instance = new Q3_45();
	public String time;

	public Q3_45() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

		Calendar cl = Calendar.getInstance();
		time = sdf.format(cl.getTime());

	}

	public static Q3_45 getInstance() {
		return Q3_45.instance;
	}

}
