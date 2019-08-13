package day05;
//배열 카피 예제 꼭 이해해야 함
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {77,99,100,85,91};
		int[] sc = new int[score.length*2];
		//length + ab같은 개념도 가능하다.
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(sc));
		
		System.arraycopy(score, 0, sc, 0, score.length);
		//모든 object는 주소를 의미한다.(첫번째 파라미터),(소스의어느위치부터 카피할래?),목적지(두번째),(목적지에 어디로 넣을까?),(몇개넣을까?)
		
		String[] names = {"홍길동","박길동","고길동","최길동"};
		String[] na= new String[names.length*2];
		
		System.arraycopy(names, 0, na, na.length-names.length, names.length);
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(na));
		
		
	}

}
