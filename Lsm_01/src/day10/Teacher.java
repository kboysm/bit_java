package day10;

public class Teacher extends Person {
private String subject;



public Teacher() {
	super();
}

public Teacher(String subject) {
	super();
	this.subject = subject;
}
public Teacher(String name,int age,String subject) {
	super(name,age);
	this.subject = subject;
}


public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}
public void print() {
	System.out.printf("이름 :%s , 나이:%d , 학번 : %s %n",super.getName(),super.getAge(),this.subject);
}
}
