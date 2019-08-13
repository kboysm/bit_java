package day19;

import java.util.Scanner;

public class Test05_Command {
	public static void main(String[] args) {
		Command delete =new DCommand();
		Command update =new UCommand();
		Command select =new SCommand();
		Command insert =new ICommand();
		//변수는 맵구조의 키값과 이름이 중복되면 안되는 점에서 비슷
//		String cmd="insert"; //delete update select insert 중 하나가 smd로 스캐너를 통해서 드간다
	
		Scanner lsm =new Scanner(System.in);
		System.out.println("delete update select insert 중 하나");
		String cmd = lsm.next();
		
		switch(cmd) {
		case "insert":insert.exec();
			break;
		case "update":update.exec();
		break;
		case "select":select.exec();
		break;
		case "delete":delete.exec();
		break;
		default :
			System.out.println("잘못 입력");
			break;
		}
	
	}
}
