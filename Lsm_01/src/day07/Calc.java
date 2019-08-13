package day07;

public class Calc {
	int data=0;
	//변수에 스태틱이 드가면 클래스변수가 된다. 클래스 네임으로 접근하면 클래스땡땡으로 부를수 있는거같음
	public static long add(int a , int b){//static메서드는 클래스메서드 라고도 부름
//		System.out.println(data); 만약 data가 스태틱이면 앞에 Calc.이 생략되어 있는 것이다.
		return a+b;	
	}//static메서드에서는 인스턴스 변수(멤버변수)를 사용할 수 없다. data변수를 사용하고 싶다면 data 변수 또한 static변수로 바꿔야 사용 가능하다.
	//인스턴스 메서드에서는 클래스변수(static변수)는 사용가능하다.
	public static long bdd(int a , int b){
		System.out.println(Math.random());
		return a-b;	
	}//Math.random()은 다른 클래스의 스태틱 메서드라서 사용가능
	public static long gdd(int a , int b){
		return a*b;	
	}
	public static long ndd(int a , int b){
		if(b==0)
			return 0;
		return a/b;	
	}
	
}
