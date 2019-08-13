package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06_Command_map {
	public static void main(String[] args) {
		//map 구조로
		Command delete =new DCommand();
		Command update =new UCommand();
		Command select =new SCommand();
		Command insert =new ICommand();
		//변수는 맵구조의 키값과 이름이 중복되면 안되는 점에서 비슷
//		String cmd="insert"; //delete update select insert 중 하나가 smd로 스캐너를 통해서 드간다
	
		Scanner lsm =new Scanner(System.in);
		System.out.println("delete update select insert 중 하나");
		String cmd = lsm.next();
	Map<String, Command> lsm1 =new HashMap<String, Command>();	
	lsm1.put("delete", delete);
	lsm1.put("insert", insert);
	lsm1.put("update", update);
	lsm1.put("select", select);
	lsm1.put("new", new Command() {//어노미너스 클래스 , 클래스 명과 implement가 생략되어 있음
	public void exec() {System.out.println("new~");};
	});
	if(lsm1.containsKey(cmd)) {
		lsm1.get(cmd).exec();
	}else
		System.out.println("그딴거 없음");
	
	
//		switch(cmd) {
//		case "insert":insert.exec();
//			break;
//		case "update":update.exec();
//		break;
//		case "select":select.exec();
//		break;
//		case "delete":delete.exec();
//		break;
//		default :
//			System.out.println("잘못 입력");
//			break;
//		}
	
	}
}
