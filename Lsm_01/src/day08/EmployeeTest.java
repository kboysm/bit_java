package day08;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("임상민","영업부",true);
		Employee emp2=new Employee("길동","홍보부",false);
		Employee emp3=new Employee("홍길동","인사부",false);
		Employee emp4=new Employee("강호동","영업부");
		emp1.print();
		emp2.print();
		emp3.print();
		emp4.print();
		
	}

}
