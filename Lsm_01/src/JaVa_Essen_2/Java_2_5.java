package JaVa_Essen_2;

import java.util.Scanner;

public class Java_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학점을 입력하세요");
		Scanner lsm =new Scanner(System.in);
		String aa=lsm.nextLine();
		
		switch(aa) {
		case "a":
		case "A":
		case "b":
		case "B":
			System.out.println("Excellent");
			break;
		case "c":
		case "C":
		case "d":
		case "D":
			System.out.println("GooD");
			break;
		case "F":
		case "f":
			System.out.println("Bye");
		}
	}

}
