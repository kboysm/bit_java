package day23;
//p736에 있는 내용으로 스캐너에 System.in이 아닌 str이라는 스트링 변수를 넣어주었다.
//스캐너안에 정규표현식을 넣어 자를수 있다.
import java.util.*;

public class P_736 {
	public static void main(String[] args) {
		String str ="1 and 2 and animal and lion and tiger";
		Scanner lsm= new Scanner(str);
		lsm=lsm.useDelimiter("\\s*and\\s*"); //\\s* abr \\s*는 abr로 끈어라, \\s*공백이 몇개든 상관없어 제거하고 쪼개라는 의미 
		int firseToken =lsm.nextInt();
		int SecondToken=lsm.nextInt();
		String thirdToken =lsm.next();
		String fourthToken =lsm.next();
		String fifthToken = lsm.next();
		
		System.out.printf("%d,%d,%s,%s,%s",firseToken,SecondToken,thirdToken,fourthToken,fifthToken);
		lsm.close();
	}
}
