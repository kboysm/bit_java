package Java_Essen_3;

import java.util.Scanner;

public class Java_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		try {
		char[] day = {'일','월','화','수','목','금','토'};
		System.out.println("정수를 입력하세요 >>");
		Scanner lsm = new Scanner(System.in);
		int a = lsm.nextInt();
		int b =a%7;
		if(a<0) {
			System.out.println("종료");
			return;
		}
		System.out.println(day[b]);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("경고! 수를 입력하지 않았습니다. ");
			
		}
		}
		
	}

}
