package study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Q3_39 {

	/** 出力する日付の書式 */
	private DateFormat df;
	/** 当日日付 */
	private Calendar today = Calendar.getInstance();

	/*
	* コンストラクタ
	* @param String 日付の書式
	*/
	public Q3_39(String format) {
		this.df = new SimpleDateFormat(format);
	}

	/*
	* 当日を出力
	*/
	public void printToday() {
		calendarPrintln(this.today);
		weekafterPrintln(this.today);
		weekafterPrintall(this.today);
	}

	/*
	* カレンダー日付をコンストラクタで指定した書式にあわせて標準出力する
	* @param Calendar 出力対象カレンダーオブジェクト
	*/
	private void calendarPrintln(Calendar cal) {
		System.out.println(df.format(cal.getTime()));
	}

	private void weekafterPrintln(Calendar cal) {

		cal.add(Calendar.DATE, 7);
		System.out.println(df.format(cal.getTime()));
	}

	public void weekafterPrintall(Calendar cal) {


		cal = Calendar.getInstance();
		
		for (int i = 0; i < 8; i++) {
			int week = cal.get(Calendar.DAY_OF_WEEK);

			String weekString = "";
			switch(week) {
			case Calendar.MONDAY:
				weekString = "月曜日";
				break;
			case Calendar.TUESDAY:
				weekString = "火曜日";
				break;
			case Calendar.WEDNESDAY:
				weekString = "水曜日";
				break;
			case Calendar.THURSDAY:
				weekString = "木曜日";
				break;
			case Calendar.FRIDAY:
				weekString = "金曜日";
				break;
			case Calendar.SATURDAY:
				weekString = "土曜日";
				break;
			case Calendar.SUNDAY:
				weekString = "日曜日";
				break;
			}
			if (i == 0) {
				System.out.println(df.format(cal.getTime()) + "(" + weekString + ")");
				cal.add(Calendar.DATE, 1);
			} else {
				
				System.out.println(df.format(cal.getTime()) + "(" + weekString + ")");
				cal.add(Calendar.DATE, 1);
			}
			
		}
	}

}
