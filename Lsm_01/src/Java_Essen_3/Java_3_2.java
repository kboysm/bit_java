package Java_Essen_3;

import java.util.Scanner;

public class Java_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 10개를 입력하세요");
		Scanner lsm = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0 ;i<a.length;i++) {
			a[i]=lsm.nextInt();
		}
		for(int i=0 ; i<a.length;i++) {
			if(a[i]%3==0)
				System.out.printf(a[i]+" ");
		}
	}

}
