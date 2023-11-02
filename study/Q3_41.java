package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Q3_41 {

	/** 乱数インスタンス */
	 private Random rnd = new Random();
	 /** 乱数リスト */
	 private List<Integer> list = new ArrayList<Integer>();
	 private List<Integer> list2 = new ArrayList<Integer>();
	 /**
	 * コンストラクタ
	 */
	 public Q3_41() {
	 generateRandomInt();
	 }
	 /**
	 * 0 から 99 の乱数を１０個生成し、リストに格納する
	 */
	 private void generateRandomInt() {
	 for (int i=0; i<100; i++) {
	 this.list.add(this.rnd.nextInt(100));
	 }
	 }
	 /**
	 * list を降順ソートして表示する
	 */
	 public void showListSortOrderDesc() {
	 Collections.sort(list,new Q3_40comparator() );
	 for (int i=0; i<10; i++) {
		 this.list2.add(list.get(i));
	 }
	 System.out.println(this.list.toString());
	 System.out.println(this.list2.toString());
	 }
}
