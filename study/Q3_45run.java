package study;

public class Q3_45run {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Q3_45 instance1 = Q3_45.getInstance();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		Q3_45 instance2 = Q3_45.getInstance();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		Q3_45 instance3 = Q3_45.getInstance();
		
		System.out.println(instance1.time);
		System.out.println(instance2.time);
		System.out.println(instance3.time);

		
		
	}

}
