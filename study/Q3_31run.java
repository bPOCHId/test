package study;

public class Q3_31run {

	public static void main(String[] args) {
		InterfaceQ3_31 instance = new Q3_31(3,5);
		 int[] retIntArray = instance.createIntArray();
		 
		 // int 型配列の中身を表示
		 for(int i=0; i< retIntArray.length; i++) {
		 System.out.print(retIntArray[i]);
		 // 最終値以外は値のうしろにカンマをつける
		 if (i != retIntArray.length -1) {
		 System.out.print(",");
		 } 
		 }
	}
}
	
