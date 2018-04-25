/**
 *
 */
package jp.co.internous.action;

/**
 * @author testuser
 *
 */
public class Person {
private String name=null;
private int age=0;
public Person(){}
public Person(String name,int age){
	this.name="山田太郎";
	this.age=20;
}
public String getName(){
return this.name;
}
public void setName(String name){
this.name = name;
}


}
