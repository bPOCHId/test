package study;

public class Q3_31 implements InterfaceQ3_31 {

	/** 最小値 */
	 private int min = 0;
	 /** 最大値 */
	 private int max = 0;
	 /**
	 * コンストラクタ
	 * @param int 最小値
	 * @param int 最大値
	 **/
	 Q3_31(int min ,int max) {
	 this.min = min;
	 this.max = max;
	 }
	 /**
	 * メンバー変数の最小値から最大値までの値を int 型配列に格納して返却する
	 * @return int[] 
	 **/
	 public int[] createIntArray() {
	 int[] intArray = new int[max-min+1];
	 int index = 0;
	 for(int i= min; i<= max;i++) {
	 intArray[index] = i;
	 index++;
	 }
	 return intArray;
	 }
}
