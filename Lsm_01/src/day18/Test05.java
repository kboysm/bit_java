package day18;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1 =new Employee(20171811,"길씨","영업부");
		Employee a2 =new Employee(20171811,"길씨","영업부");
	
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		//해쉬코드가 같으면 같은놈 다르면 다른놈
	}

}
