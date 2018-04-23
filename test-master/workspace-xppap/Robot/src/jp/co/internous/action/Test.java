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
	Robot aibo = new Robot();
	aibo.name="アイボ";
	aibo.talk();
	aibo.walk();
	aibo.run();
	
	Robot asimo =new Robot();
	asimo.name="ASIMO";
	asimo.talk();
	asimo.walk();
	asimo.run();
	
	Robot pepper =new Robot();
	pepper.name="ペッパー";
	pepper.talk();
	pepper.walk();
	pepper.run();
	
	Robot doraemon =new Robot();
	doraemon.name="ドラえもん";
	doraemon.talk();
	doraemon.walk();
	doraemon.run();

	}
	
}