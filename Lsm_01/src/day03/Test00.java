package day03;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수 입력");
		Scanner lsm = new Scanner(System.in);
		int a = Integer.parseInt(lsm.nextLine());
		lsm.close();
		lsm=null;// int로 선언된 a에 스트링 문자열로 입력받은놈을 숫자로 변형해서 출력
		//lsm.nextLine(); 입력받는 그릇은 1개인데 여러개의 입력을 받는경우 첫번째 인자를 제외한 다른 인자를 삭제 시키는 명령

		if (!(a >= 0 && a <= 100)) {
			System.out.println("유효하지 않은 점수");
			return;
		}
		String result = a >=80 ? "pass" : "no pass";
		System.out.println("점수 :" + a + " : "+ result);
		
		//과제 삼항 연산자로 처리
		char qwe = a>=90 ? 'A' : a>=80 ? 'B' : a>=70 ? 'C' : a>=60 ? 'D' : 'F';
		System.out.printf("본인의 등급은 %s입니다.",qwe);
		//등급처리를 스위치로
		/*System.out.println("********************등급 처리 ****************************");
		char qw=' ';
		switch(a) {
		case 10:
		case 9:
			qw='A';
			break;
		case 8:
			qw='B';break;
		case 7:
			qw='C';break;
		case 6:
			qw='D'; break;
		default :
			qw='F'; break;
		}*/
	}
}
/* 요약 : 입력받은변수명.close();는 자원을 반납한다.
 *		return 메인함수를 종료한다.
 * 		도스로 돌릴때 bin폴더로 드간다음 그 이상 드가지 않는다 . java 패키지명.파일명을 입력하면 작동된다.
 */