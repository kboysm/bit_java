package JaVa_Essen_2;

import java.util.Scanner;

public class Java_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {50,100};
		int [] y = {50,100};
		
		System.out.println("좌표를 입력하세요");
		Scanner lsm = new Scanner(System.in);
		int a = lsm.nextInt();
		int b = lsm.nextInt();
		
		if(((50<=a)&&(a<=100))&&((50<=b)&&(b<=100))) {
			System.out.println("범위에 있습니다.");
		}
		else
			System.out.println("범위를 벗어납니다.");
	}

}
