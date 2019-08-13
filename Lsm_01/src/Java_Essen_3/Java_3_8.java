package Java_Essen_3;

import java.util.Scanner;

public class Java_3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터와 가위 바위 보 게임 시작!");
		Scanner lsm = new Scanner(System.in);
		String[] str = {"가위","바위","보"};
		
		while(true) {
			int n =(int)(Math.random()*3);
			System.out.printf("가위 바위 보!>>");
			String aa=lsm.nextLine();
			switch (aa) {
			
			case "가위":
				if(str[n].equals("바위")) {
					System.out.println("사용자 :"+aa+", 컴퓨터 : "+str[n]+" 컴퓨터 승");
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자 :"+aa+", 컴퓨터 : "+str[n]+" 사용자 승");
				}
				break;
				
			case "바위":
				if(str[n].equals("보")) {
					System.out.println("사용자 :"+aa+", 컴퓨터 : "+str[n]+" 컴퓨터 승");
				}
				else if(str[n].equals("가위")) {
					System.out.println("사용자 :"+aa+", 컴퓨터 : "+str[n]+" 사용자 승");
				}
				break;
				
			case "보":
				if(str[n].equals("가위")) {
					System.out.println("사용자 :"+aa+", 컴퓨터 : "+str[n]+" 컴퓨터 승");
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 :"+aa+", 컴퓨터 : "+str[n]+" 사용자 승");
				}
				break;
			case "그만":
				System.out.println("게임 종료");
				return;

			default:System.out.println("재 게임");
				break;
			}
		}
	
	}

}
