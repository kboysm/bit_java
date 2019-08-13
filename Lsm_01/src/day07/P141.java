package day07;

import java.util.Arrays;

public class P141 {
	public void increase(int[] n) {
		for(int i=0 ; i<n.length;i++) {
			n[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P141 p =new P141();
		int[] data = {10,100,1000};
		System.out.println(Arrays.toString(data));
		
		p.increase(data);//static이없을때는 객체를 생성해서 이렇게 있을때는 클래스명.메서드로 호출
		System.out.println(Arrays.toString(data));
	}

}
