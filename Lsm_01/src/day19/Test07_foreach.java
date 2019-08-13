package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class Test07_foreach {
	public static void main(String[] args) {
		List<Employee> lsm = new ArrayList<Employee>();
		lsm.add(new Employee(2017001,"길씨","비트캠프4"));
		lsm.add(new Employee(2017002,"용씨","비트캠프1"));
		lsm.add(new Employee(2017003,"성씨","비트캠프2"));
		lsm.add(new Employee(2017004,"바씨","비트캠프3"));
		lsm.add(new Employee(2017005,"보씨","비트캠프5"));
		
		System.out.println("=목록 출력=");
		Iterator<Employee> lsm1 =lsm.iterator();
		while(lsm1.hasNext()) {
			Employee data =lsm1.next();
			System.out.println(data);
		}
		System.out.println();
		//foreach
		System.out.println("**** foreach *****");
	
	lsm.forEach(new Consumer<Employee>(){//lsm.이 가지고 있는 녀석들을 하나씩꺼내서 accept가 옴기고 하나씩 t가 받는다.
		@Override// <>자리는 lsm이 관리하는 데이터 타입이 드간다.
		public void accept(Employee t) {
			// TODO Auto-generated method stub
			System.out.println(t);
		}
	});
	//람다로 표현
	System.out.println("**** foreach -> 람다 ****");
	lsm.forEach(
		(Employee t)-> {
			System.out.println(t);
		}
	);
	System.out.println("****** 람다 에서 더 간단한 람다로 ******");
	lsm.forEach( t-> System.out.println(t));
	System.out.println();
	System.out.println("****** 람다2 에서 더 간단한 람다로 ******");
	lsm.forEach( System.out::println);
	System.out.println();
	}
}
