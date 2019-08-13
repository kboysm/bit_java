package day06;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp2.setAge(27);
		//emp2.age=201907;
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		
		Employee emp3 = new Employee();
		//emp3.age=201908;
		emp3.setAge(31);
		emp3.setName("임상민");
		emp3.setDept("영업부");
		
		Employee emp4 = new Employee();
		//emp3.age=201908;
		emp4.setAge(29);
		emp4.setName("김길동");
		emp4.setDept("영업부");
		emp4.setSingle(true);
		Employee emp[] = {emp2,emp3,emp4};
		//배열은 데이터핸들링을 모아서 할 수 있어서 편하다. 즉 관리가 편하다.
		
		for( Employee data :emp) {
			//영업부에 근무하는 사람만 출력
			//Syso(data.getDept());
			if((data.getDept()!= null)&&data.getDept().equals("인사부"))
			{data.display();}
		}
		
		//조건에 null을 추가해주어야 한다. 이유는 중간에 비어있는 클래스 인스턴스변수가 있다면 프로그램이 죽어버린다.
		System.out.println("single인 사원 목록");
		for(int i=0 ; i<emp.length;i++) {
			//System.out.println(emp[i].isSingle());
			if(emp[i].isSingle()) {
				emp[i].display();
			}
		}
	}

}
