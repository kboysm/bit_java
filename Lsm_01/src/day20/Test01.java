package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.removeIf(i->i%2==0); //괄호 안에 조건을 걸고 그 조건에 맞는 아이들은 삭제시키는 명령 
		list.forEach(i->System.out.println(i+ "   "));
		
		//자바에는 스트림이라는 api가 있다 이 녀석은 콜렉션에 접근하는 방식을 통일 시킨녀석이다.
		System.out.println("--------------------------------------------------");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(201700,"길용성0","비트캠프0"));
		emp.add(new Employee(201701,"길용성1","비트캠프1"));
		emp.add(new Employee(201702,"길용성2","비트캠프2"));
		emp.add(new Employee(201703,"길용성3","비트캠프3"));
		emp.add(new Employee(201704,"길용성4","비트캠프4"));
		emp.add(new Employee(201705,"길용성5","비트캠프5"));
		
		System.out.println(emp.stream().filter(i->i.getNumber() > 201700).count());
		emp.stream().filter(i->i.getNumber() > 201700).forEach(i->System.out.println(i));
		
		Employee[] e = {
				new Employee(201700,"길용성0","비트캠프0"),
				new Employee(201701,"길용성1","비트캠프1"),
				new Employee(201702,"길용성2","비트캠프2"),
				new Employee(201703,"길용성3","비트캠프3"),
				new Employee(201704,"길용성4","비트캠프4"),
				new Employee(201705,"길용성5","비트캠프5")};
		Stream.of(e).filter(i->i.getDept().equals("비트캠프0")).forEach(i->System.out.println(i));;
		//배열이 됬던 뭐가 됬던 콜렉션 즉 집합체를 관리하기 위해  아래 e배열은 위에 emp와 같아진다 
		//필터 안에서 비트캠프0만 추출하여 포이치를 통해 출력하는 명령이 38행이다
		//스트림화 시키고 필터링 후 다른작업 접목 가능 , 집합체들은 스트림화 후 작업을 시작하는 버릇 들이기 
		
//		Stream.of(e).sorted().forEach(i->System.out.println(i));//정렬 후 출력
		Stream.of(e).sorted(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			};
		});
		Stream.of(e).sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(i->System.out.println(i));
		
		
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
