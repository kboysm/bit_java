package day07;

import util.MyUtil;
public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyUtil.add(33, 99));
		System.out.println(MyUtil.add(33.1, 99.2));
		System.out.println(MyUtil.add(33.1, 99.2,90));
		System.out.println(MyUtil.add(33.1, 99.2,90,55.9));
		System.out.println(MyUtil.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println(MyUtil.add(new double[] {1,2,3,4,5,6,7,8,9,10}));
		double[]d =new double[] {1,2,3,4,5,6,7,8,9,10}; //d의 배열을 이렇게 넣을 수 있다.
		
		int i = 100;
//		Integer ii = new Integer(100);
		Integer ii = i;
		i=ii;
		//래퍼?클래스와 기본형은 타입이 왔다리 갔다리 한다.알아서 값만 꺼내서 동작한다. 이것이 오토박싱 언박싱이다. p238의 5번문제
		System.out.println(i+ "   "+ii);
	}

}
