package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Employee> lsm = new HashMap<Integer, Employee>();
		Employee[] lsm1 = {
				new Employee(201718,"임상민","영업부"),
				new Employee(201717,"임재범","홍보부"),
				new Employee(201716,"임현성","개발부"),
				new Employee(201715,"임주영","경영부"),		};
	for(int i=0 ; i<lsm1.length ;i++) {
		lsm.put(lsm1[i].getNumber(), lsm1[i]);
	}
	System.out.println("사번을 입력하세요.");
	System.out.println("조회하신 사원내역");
	System.out.println(lsm.get(201718));
System.out.println("---------------------------------------------");
Iterator<Integer> it=lsm.keySet().iterator();//?
while(it.hasNext()) {
	Integer num =it.next();
	Employee emp= lsm.get(num);
	if(emp.getDept().equals("영업부")) {
		System.out.println(emp);
	}
}

//삭제 사번기준 삭제 201718
System.out.println("201718 사번의 사원 삭제 (퇴사처리)");
System.out.println("삭제 정보 : "+lsm.remove(201718));
System.out.println(lsm.get(201718)); //null이 찍힘 즉 데이터가 지워짐 즉 ! 퇴사!
System.out.println("삭제 정보 : "+lsm.remove(201718)); //없으니까 삭제 못하고 널 
	}}
class Employee implements Comparable<Employee> {
	int number; //사원번호 즉 기본키
	String name;
	String dept;
	
	
	
	public Employee() {
	}
	public Employee(int number, String name, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.dept = dept;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (number != other.number)
			return false;
		return true;
	}//넘버가 기본키 이므로 넘버만 같지 않다면 다른사람이다. 즉 이퀄즈 메서드에서 사용되는 변수를 넘버를 제외하고 다 지우고 동작시킨다.
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return number-o.number;
	}
}
