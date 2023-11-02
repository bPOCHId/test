package study;

import java.util.EnumMap;
import java.util.Map;

public class Q3_49 {

	public static void main(String[] args) {
		 Map<PersonAttribute, String> map = new EnumMap<PersonAttribute, String>(PersonAttribute.class);
		 map.put(PersonAttribute.NAME, "Ips Taro");
		 map.put(PersonAttribute.AGE, "29");
		 map.put(PersonAttribute.BIRTH, "1982/7/3");
		 map.put(PersonAttribute.ADDRESS, "岡山市北区北長瀬");
		 for (PersonAttribute attribute : PersonAttribute.values()) {
		 System.out.println(attribute.getName() + "=" + map.get(attribute));
		 }
		 }
}
