package day10;

public class Person {
private String name;
private int age;



public Person() {
	super();
}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void print() {
	
}//오버라이딩을 위해 형식적으로 만들어줌

}
