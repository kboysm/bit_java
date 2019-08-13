package Java_Essen_3;

import java.util.Scanner;

public class Java_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 한 문자를 입력하세요>>");
		Scanner lsm = new Scanner(System.in);
		String lsm1 = lsm.next();
		char[] aa= lsm1.toCharArray();
		char a = 'a';
		
		for(int i=97 ; i<=aa[0] ; i++) {
			for(int j=i; j<=aa[0];j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
