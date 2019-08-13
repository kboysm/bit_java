package day07;
/**
 * 
 * @author lsm
 *@since 2019 07 16
 *@version 1.0
 */

public class Employee {
	private String name;
	private String dept;
	private boolean single;
	
	public Employee(String name , String dept ,boolean single) {
		
		System.out.println("Employee() call");
		this.name=name;
		this.dept=dept;
		this.single=single;
	}
	
	public Employee() {
		name="사원이름";
		dept="xx부서";
		single=true;
		//기본생성자 , 따로 만들지 않아도 자바에서 자동으로 만들어주지만 내가 어떠한 생성자를 생성할 시 자바에서 기본생성자를 자동으로 만들지 않음
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public boolean isSingle() {
		return single;
	}
	/**
	 * 
	 * @param single 미혼인지 아닌지
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 * Employee 객체 정보 출력
	 */
	public void print() {
		System.out.printf("이름 : %5s , 근무 부서 : %5s , single : %5s %n",name,dept,single);
	}
}
