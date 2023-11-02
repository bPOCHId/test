package study;

public enum PersonAttribute {

	/** 名前 */
	 NAME("name"),
	 /** 年齢 */
	 AGE("age"),
	 /** 生年月日 */
	 BIRTH("birth"),
	 /** 住所 */
	 ADDRESS("address");
	 /** 人間の属性の名称 **/
	 String name;
	 /**
	 * コンストラクタ。
	 *
	 * @param name 人間の属性の名称
	 */
	 PersonAttribute(String name) {
	 this.name = name;
	 }
	 /**
	 * 人間の属性の名称を取得します。
	 *
	 * @return 人間の属性の名称
	 */
	 public String getName() {
	 return this.name;
	 }
}
