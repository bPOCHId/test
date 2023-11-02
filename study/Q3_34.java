package study;

public class Q3_34 {

	/**
	 * 文字列から数値へ変換する。
	 * @param str 変換対象文字列
	 * @return 変換した数値。
	 */
	 public int changeToNumber(String str) {
	 int ret = 0; 
	 try {
	 ret = Integer.parseInt(str);
	 } catch(NumberFormatException e) {
	 return 0;
	 } 
	 return ret;
	 }
}
