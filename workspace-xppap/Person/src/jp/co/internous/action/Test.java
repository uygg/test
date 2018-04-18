/**
 * 
 */
package jp.co.internous.action;

/**
 * @author testuser
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Person taro = new Person();
	Person ziro = new Person();
	Person hana= new Person();
	taro.name="山田太郎";
	taro.age=20;
	ziro.name="木村次郎";
	ziro.age=18;
	hana.name="鈴木花子";
	hana.age=16;
	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(ziro.name);
	System.out.println(ziro.age);
	System.out.println(hana.name);
	System.out.println(hana.age);
	taro.talk();taro.walk();taro.run();
	ziro.talk();ziro.walk();ziro.run();
	

	}

}
