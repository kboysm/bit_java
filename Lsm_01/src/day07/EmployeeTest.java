package day07;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee lsm0 =new Employee("고길동","영업부",true);
		Employee lsm1 =new Employee("김길동","영업부",false);
		Employee lsm2 =new Employee("김삼식","환경부",true);
		Employee lsm3 =new Employee("김소식","홍보부",false);
		Employee lsm4 =new Employee();
		//위의 함수호출 문장의 마지막 ()은 기본생성자를 의미한다.
		
		lsm0.print();
		lsm1.print();
		lsm2.print();
		lsm3.print();
		lsm4.print();
	}

}
