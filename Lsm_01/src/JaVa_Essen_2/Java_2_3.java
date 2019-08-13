package JaVa_Essen_2;

import java.util.Scanner;

public class Java_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("논리 연산을 입력하세요>>");
		Scanner lsm = new Scanner(System.in);
		String a1 = lsm.nextLine();
		String a2 = lsm.nextLine();
		String a3= lsm.nextLine();
		int x1 = a1.length();
		int x2 = a3.length();
		int xy=a2.length();
		
		switch(xy){
			case 3 :
				if((x1==4&&x2==4))
				System.out.println("true");
				else
					System.out.println("false"); 
				break;
			case 2 :
				if(x1==5&&x2==5)
					System.out.println("false");
					else
					System.out.println("true"); 
				break;
		}
	}

}
