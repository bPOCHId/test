package study;

public class Q3_32run {

	public static void main(String[] args) {
		InterfaceQ3_32 instance = new Q3_32(0,10);
		 int[] retIntArray = instance.createIntArray();
		 
		 // int 型配列の中身を表示
		 System.out.print("[");
		 for(int i=0; i< retIntArray.length; i++) {
		 System.out.print(retIntArray[i]);
		 // 最終値以外は値のうしろにカンマをつける
		 if (i != retIntArray.length -1) {
		 System.out.print(",");
		 } 
		 }
		 System.out.print("]");
		 instance.sum(retIntArray);
	}
}
	
