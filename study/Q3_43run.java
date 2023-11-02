package study;

public class Q3_43run {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		 //インスタンス A の生成
		Q3_43 instanceQuiz015A = new Q3_43();
		 
		 //変更できないクラスメンバー変数の呼び出し
		 System.out.println( Q3_43 .unChangedMemberStr);
		 //クラスメンバー変数の呼び出し
		 System.out.println( Q3_43 .changeMemberStr);
		 //インスタンス変数の呼び出し
		 System.out.println( instanceQuiz015A .memberStr);
		 //クラスメンバー変数値の書き換え
		 Q3_43.changeMemberStr= "YY";
		 //インスタンス変数値の書き換え
		 instanceQuiz015A.memberStr = "ZZ";
		 
		 //インスタンス B の生成
		 Q3_43 instanceQuiz015B = new Q3_43();
		 //インスタンス A のクラスメンバー変数値、インスタンス変数値を表示
		 System.out.println( instanceQuiz015A .changeMemberStr);
		 System.out.println( instanceQuiz015A.memberStr); 
		 //インスタンス B のクラスメンバー変数値、インスタンス変数値を表示
		 System.out.println( instanceQuiz015B .changeMemberStr);
		 System.out.println( instanceQuiz015B .memberStr);
	}
}
