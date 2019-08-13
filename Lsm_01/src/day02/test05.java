package day02;
import java.util.Scanner;
public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = input.nextLine();
		System.out.println("점수 : ");
		int score = input.nextInt();
		System.out.printf("이름 : %s , 점수 : %d",name,score);
		
		input.close();
		input=null;
	}

}
