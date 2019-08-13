package JaVa_Essen_2;

import java.util.Scanner;

public class Java_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("돈의 액수를 입력하세요.");
		Scanner lsm = new Scanner(System.in);
		int a = lsm.nextInt();
		System.out.println("5만원권 "+a/50000+"장");
		a= a%50000;
		System.out.println("만원권 "+ a/10000+"장");
		a=a%10000;
		System.out.println("오천원권 "+ a/5000+"장");
		a=a%5000;
		System.out.println("천원권 "+ a/1000+"장");
		a=a%1000;
		System.out.println("오백원 "+ a/500+"개");
		a=a%500;
		System.out.println("백원 "+ a/100+"개");
		a=a%100;
		System.out.println("오십원 "+ a/50+"개");
		a=a%50;
		System.out.println("십원 "+ a/10+"개");
		a=a%10;
		System.out.println("일원 "+ a+"개");
	}

}
