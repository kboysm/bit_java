package day03;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lsm = new Scanner(System.in);
		int a = 0;
		String aa = null;
	 for (;;) {
			System.out.println("*********명령 선택**************");
			System.out.println("1. insert(등록)");
			System.out.println("2.delete(삭제)");
			System.out.println("3.목록 출력");
			System.out.println("4.quit(종료)");
			System.out.println("******************************");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("수행할 명령을 선택하세요.");

			a = lsm.nextInt();//이녀석이 스트링이라면 입력할때 공백을 제거하는 명령어는 lsm.nextLine().trim()
			lsm.nextLine();
			switch (a) {//또는 a.trim()으로 공백을 제거한다.
			case 1:
				System.out.println("등록 선택");
				break;
			case 2:
				System.out.println("삭제 선택");
				break;
			case 3:
				System.out.println("목록 출력 선택");
				break;
			case 4:
				System.out.println("정말 종료할래?");
				
				aa = lsm.nextLine();
				if(aa.equals("YSE")||aa.equals("yes"))
					{System.out.println("종료");
				lsm.close();
				lsm = null;
				
				return;}
				else if(aa.equals("No")||aa.equals("no"))
					System.out.println("종료 취소");
				
				 // System.exit(0) ->app종료 명령
			default:
				System.out.println("1~4중 하나를 선택하시오");
				break;
			}

		}
	}
}
