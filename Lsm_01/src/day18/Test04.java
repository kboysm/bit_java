package day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new HashSet<Employee>(); //해쉬셋(implement comparable을 해줘도 안댐 내부 코드적으로 안씀
		//tree셋은 내부적으로 코드를 사용하기 때문에 implement받으면 내부적코드가 comparable을 사용하기 때문에 자동정렬을 받음
		boolean aaa=set.add(new Employee(2017001,"길씨","비트캠프0"));
		if(aaa) {
			System.out.println("등록 완료");
		}
		set.add(new Employee(2017002,"용씨","비트캠프1"));
		set.add(new Employee(2017003,"성씨","비트캠프2"));
		set.add(new Employee(2017004,"바씨","비트캠프3"));
		aaa=set.add(new Employee(2017001,"길씨","비트캠프0"));
		if(!aaa) {
			System.out.println("이미 존재하는 데이터");
		}
		System.out.println("사원목록");
		Iterator<Employee> lsm =set.iterator();
		while(lsm.hasNext()) {
			Employee data = lsm.next();
				System.out.println(data);
		}
		System.out.println("검색결과");
		lsm =set.iterator();
		while(lsm.hasNext()) {
			Employee data = lsm.next();
			if(data.getNumber()==2017003) {
				System.out.println(data);
			}
		}//드간 순서대로 안나온다 .중복 해결도 안댄다 
	}

}
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