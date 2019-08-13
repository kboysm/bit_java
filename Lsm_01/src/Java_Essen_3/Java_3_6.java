package Java_Essen_3;

import java.util.Scanner;

public class Java_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eng[] = {"student","love","java","happy","future"};
		String kor[] = {"학생","사랑","자바","행복한","미래"};
		
		Scanner lsm = new Scanner(System.in);
		
		while(true) {
			System.out.println("영어단어를 입력하세요.");
			String aa =lsm.next();
			int lsm1 = 8;
			for(int i =0 ; i<eng.length ;i++) {
				if(aa.equals(eng[i])) {
					lsm1=i;
				}
			}
			System.out.println(kor[lsm1]);
		}
	}

}
