package study;

import java.util.HashMap;
import java.util.Map;

public class Q3_47Util {
	
	Map<String,String> hm = new HashMap<String,String>();
	

	public static String max(Map<String,String> hm) {

		String maxval = null;
		for(String val: hm.values()) {
			if(maxval ==null || maxval.compareTo(val)==-1) {
				maxval =val;
			}
		}
		return maxval;
	}

	public static String min(Map<String,String> hm) {
		// TODO 自動生成されたメソッド・スタブ
		String minval = null;
		for(String val: hm.values()) {
			if(minval ==null || minval.compareTo(val)==1) {
				minval =val;
			}
		}
		return minval;
	}
}
