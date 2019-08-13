package JaVa_Essen_2;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Java_2Ch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("가위 바위 보 게임입니다. 가위,바위, 보 중에서 입력하세요");
		System.out.print("철수 >>");
		Scanner lsm = new Scanner(System.in);
		String a =lsm.nextLine();
		System.out.print("영희 >>");
		Scanner lsm1 = new Scanner(System.in);
		String aa = lsm.nextLine();
		
		if(a.equals("가위")&&aa.equals("바위")||a.equals("바위")&&aa.equals("보")||a.equals("보")&&aa.equals("가위")) {
			System.out.println("영희 승");
		}
		if(a.equals("가위")&&aa.equals("보")||a.equals("바위")&&aa.equals("가위")||a.equals("보")&&aa.equals("바위")) {
			System.out.println("철수 승");
		}
		if(a.equals(aa)) {
			System.out.println("무승부");
		}
	}
}
