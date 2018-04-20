/**
 *
 */
package jp.co.internous.action;

/**
 * @author testuser
 *
 */
public class Person {
public String name = null;
public int age = 0;
public String phoneNumber = null;
public String address = null;
public Person(){}
public Person(String name,int age){
	this.name="saburo";
	this.age=0;
}

public Person(int age){
this.name="名前なし";
this.age=25;
}
public Person(int age,String name){
	this.name="hanako";
	this.age=17;
}

}
