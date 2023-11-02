package study;

import java.util.Random;

public class Q3_46Util {

	/**
	 * 指定された範囲の乱数を生成します。
	 * @param min 範囲の最小値
	 * @param max 範囲の最大値
	 * @return int 指定された範囲の乱数
	 */
	 public static int generateRandomNumber(int min, int max) {
	 Random random = new Random();
	 // 0 から(最大値 - 最小値)の範囲の乱数を生成し、最小値を加えることで
	 // 最小値から最大値の範囲の乱数を生成する
	 int result = random.nextInt(max - min + 1) +min;
	 return result;
	 }
}
