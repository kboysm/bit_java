package Java_Essen_3;

import java.util.Arrays;
import java.util.Scanner;

public class Java_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 10개를 입력하세요.");
		int[] aa = new int[10];
		Scanner lsm = new Scanner(System.in);
		for(int i =0 ; i<aa.length;i++) {
			aa[i]=lsm.nextInt();
		}
		int b = aa.length-1;
		for(int i=0 ; i<aa.length-1;i++) {
			for(int j=i+1 ; j<aa.length;j++) {
					if(aa[i]>aa[j]) {
						int a =aa[i];
						aa[i]=aa[j];
						aa[j]=a;
				}
			}
		}
		System.out.println(Arrays.toString(aa));
		
	}

}
