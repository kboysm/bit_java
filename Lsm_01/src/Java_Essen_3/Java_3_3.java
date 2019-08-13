package Java_Essen_3;

import java.util.Scanner;

public class Java_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		System.out.println("정수를 입력하세요 >>");
		Scanner lsm = new Scanner(System.in);
		int a = lsm.nextInt();
		if(a%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		}catch (Exception e) {
			// TODO: handle exception
		System.out.println("수를 입력하지 않아 종료합니다");
		return;
		}
	}

}
