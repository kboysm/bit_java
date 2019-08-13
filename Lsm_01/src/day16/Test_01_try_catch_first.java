package day16;
//언체크드 익셉션에 해당해서 오류가 발생하는것처럼 보이지 않지만 실행하면 비정상종료된다.
public class Test_01_try_catch_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" main start");
		int a=10,b=0;
		try {//예외처리란 트라이캐치로 감싸는것
			System.out.println(1);
		System.out.println(a/b); //throw new ArithmeticException() 이런객체가 던져저 버린것.
		System.out.println(2);}//a/b에서 예외가 발생하여 2를 프린트하지 않고 캐치문으로 이동한다.
		catch (ArithmeticException e) {
			System.out.println("0 못나눔"+e.getMessage());
			e.printStackTrace(); // 이런 에러가 생겼다고 알려주는것 실행창에 나오는 장소가 항상 같은위치는 아님
			System.out.println(3);
		}
		finally {System.out.println(" finally-항상수행");}
		//예외발생 시 그 문장까지 하고 캐치문으로 이동후 finally문 수행
		//예외가 발생하지 않으면 트라이문 파이널리문을 순서대로 수행
//		ArithmeticException ss;
//		NullPointerException nn;
//		IndexOutOfBoundsException zz;
		System.out.println("---------------------------");
if(b!=0)
	System.out.println(a/b);
//if문으로 해야함 . 위에건 설명해주려고 그냥 예를 든것 예외처리를 하지 않아도 컴파일을 통과하지만 프로그램이 죽고 그걸 해결하는걸 보여주려고 한것
//발생하지 않게 코딩하는게 제일 좋음
		System.out.println(" main end");}
		
	

}
