package Java_Essen_3;

import java.util.Arrays;

public class Java_3_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[][] = new int[3][4];
		int sum=0;
		
		for(int i =0; i<3;i++) {
			for(int j=0;j<4;j++) {
				aa[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0 ; i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				System.out.print(aa[i][j]+" ");
				sum+=aa[i][j];
			}
			System.out.println();
		}
		
	System.out.println("합은 "+sum);
	}

}
