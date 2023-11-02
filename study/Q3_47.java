package study;

import java.util.HashMap;
import java.util.Map;

public class Q3_47 {

public static void main(String[] args) {

	Map<String,String> hm = new HashMap<String,String>();
	hm.put("キー1", "AAA");
	hm.put("キー2","ABZ");
	hm.put("キー3","BBB");
	
		String max = Q3_47Util.max(hm);
		String min = Q3_47Util.min(hm);
		System.out.println("最大値："+max);
		System.out.println("最小値："+min);
	}
}
