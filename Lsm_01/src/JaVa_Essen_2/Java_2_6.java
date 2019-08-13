package JaVa_Essen_2;

import java.util.Scanner;

public class Java_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~99사이의 수를 입력하세요>>");
		Scanner lsm= new Scanner(System.in);
		String aa = lsm.nextLine();
		int count=0;
		int []b= {3,6,9};
		int a = aa.length();
		
		switch (a) {
		case 1:
			for(int i=0 ; i<b.length;i++) {
			if(Integer.parseInt(aa)==b[i]) {
				count++;
			}
		}
			
			break;

		case 2:
			if(aa.contains("3")&&aa.contains("6")) {
				count=2;
			}
			else if(aa.contains("3")&&aa.contains("9")) {
				count=2;
			}
			else if(aa.contains("6")&&aa.contains("9")) {
				count=2;
			}
			else if((aa.charAt(0)==aa.charAt(1))&&aa.contains("3")) {
				count=2;
			}
			else if((aa.charAt(0)==aa.charAt(1))&&aa.contains("6")) {
				count=2;
			}
			else if((aa.charAt(0)==aa.charAt(1))&&aa.contains("9")) {
				count=2;
			}
			
			break;
		}
		if(count==0)
			System.out.println("박수없음");
		else if(count==1)
			System.out.println("박수짝");
		else if(count==2)
			System.out.println("박수짝짝");
	}

}
