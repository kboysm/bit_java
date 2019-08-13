package day06;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,4,6,8}; //배열의 생성과 초기화를 한번에 한것 /한번에 할때는 가능하다.
//		int[] num2;
//		num2 =new int[] {1,2,3,4,5,6,7};
		//위의 주석에서 new int[]가 빠지면 애러가 난다. 꼭 기억하자 8,9행으로 나눠서 쓸때는 new int[]를 꼭 써줘야한다.
		String[] arr = {"상민","짱짱","123"};
		for(int data : num) {
			System.out.print(data);
		}
		System.out.println();
		for(String a : arr) {
			System.out.print(a);
		}//새로나온 for루프 활용 예제이다.
	}
//배열은 여기까지 공부했다.
}
