package study;

public class Q3_36 {

	/**
	 * 文字列から数値へ変換する。
	 * @param str 変換対象文字列
	 * @return 変換した数値。
	 * @throws Exception 
	 */
	public int changeToNumber(String str) throws Exception {
		int ret = 0;
		try {
			ret = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new Exception(str + "は数字ではありません。", null);

		} finally {
			System.out.println(ret + 1) ;
		}
		return ret +1;
	}
}
