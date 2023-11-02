package study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Q3_37 {

	/** 出力する日付の書式 */
	 private DateFormat df;
	 /** 当日日付 */
	 private Calendar today = Calendar.getInstance();
	 /*
	 * コンストラクタ
	 * @param String 日付の書式
	 */
	 public Q3_37(String format) {
	 this.df = new SimpleDateFormat(format);
	 }
	 
	 /*
	 * 当日を出力
	 */
	 public void printToday() {
	 calendarPrintln(this.today);
	 }
	 /*
	 * カレンダー日付をコンストラクタで指定した書式にあわせて標準出力する
	 * @param Calendar 出力対象カレンダーオブジェクト
	 */
	 private void calendarPrintln(Calendar cal) {
	 System.out.println(df.format(cal.getTime()));
	 }
}
