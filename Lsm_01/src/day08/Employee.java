package day08;
/**
 * 
 * @author lsm
 *@since 2019 07 16
 *@version 1.0
 */

public class Employee {
	static String cName="BIT";
	private String name;
	private String dept;
	private boolean single;
	
	public Employee(String name , String dept ,boolean single) {
		
		System.out.println("Employee() call");
		this.name=name;
		this.dept=dept;
		this.single=single;
	}
	public Employee(String name , String dept) {
		
//		System.out.println("Employee() call");
//		this.name=name;
//		this.dept=dept;
//		this.single=true;
		this(name,dept,false);
		//위에 디스함수는 false를 그냥 넘겨 버려서 다른 함수를 호출한 것이다.
		//this()는 첫문장만 쓸 수 있는데 super도 마찬가지다 . 그래서 this가 있다면 super가 없는 문장이다.
	}
	
	public Employee() {
//		name="사원이름";
//		dept="xx부서";
//		single=true;
		//기본생성자 , 따로 만들지 않아도 자바에서 자동으로 만들어주지만 내가 어떠한 생성자를 생성할 시 자바에서 기본생성자를 자동으로 만들지 않음
		//위의 3개 변수는 3개의 변수를 받는 생성자와 하는일이 같으므로 다른 함수를 호출하여 코드중복을 회피한다.
		this("사월이름","xx부서",true);//코드중복을 회피하기 위해서 다른 생성자 함수를 호출함
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
		
		System.out.println("회사명:"+cName);
	}
}
