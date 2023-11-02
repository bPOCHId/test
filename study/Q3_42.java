package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Q3_42 {

	/** 乱数インスタンス */
	 private Random rnd = new Random();
	 /** 乱数リスト */
	 private List<Integer> list = new ArrayList<Integer>();
	 private List<Integer> list2 = new ArrayList<Integer>();
	 /**
	 * コンストラクタ
	 */
	 public Q3_42() {
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
	 Collections.sort(list,new Q3_42comparator() );
	 for (int i=0; i<10; i++) {
		 this.list2.add(list.get(i));
	 }
	 Integer listmax  = Collections.max(list);
	 Integer list2max  = Collections.max(list2);
	 Integer listmin  = Collections.min(list);
	 Integer list2min  = Collections.min(list2);
	 
	 if(listmax.compareTo(list2max)>0) {
		 System.out.print("最大値＝"+listmax);
	 }else if(listmax.compareTo(list2max)==0) {
		 System.out.print("最大値＝"+listmax);
	 }else {
		 System.out.print("最大値＝"+list2max);
	 }
	 
	 if(listmin.compareTo(list2min)<0) {
		 System.out.print("最小値＝"+listmin);
	 }else if(listmin.compareTo(list2min)==0) {
		 System.out.print("最小値＝"+listmin);
	 }else {
		 System.out.print("最小値＝"+list2min);
	 }	 }
}
