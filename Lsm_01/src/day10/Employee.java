package day10;

public class Employee extends Person{
	private String dept;

	
	
	public Employee() {
		super();
	}

	public Employee(String dept) {
		super();
		this.dept = dept;
	}
	public Employee(String name,int age,String dept) {
		super(name,age);
		this.dept = dept;
	}


	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.printf("이름 :%s , 나이:%d , 학번 : %s %n",super.getName(),super.getAge(),this.dept);
	}
}
