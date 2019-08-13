package AS;

import java.util.Scanner;

public class P118_number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나이를 입력하세요");
		Scanner lsm = new Scanner(System.in);
		String input=lsm.nextLine();
		
		if(input.charAt(0)=='2')
			System.out.println("20대");
		else if(input.charAt(0)=='3')
			System.out.println("30대");
			
	}
}
