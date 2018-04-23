/**
 * 
 */
package jp.co.internous.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author testuser
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("入力");
	String t= br.readLine();
	System.out.println(t);
	String s="123";
	int i=Integer.parseInt(s);

	}

}
