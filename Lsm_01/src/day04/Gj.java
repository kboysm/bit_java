package day04;

import java.util.Scanner;

public class Gj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자를 입력하세요");
		Scanner lsm = new Scanner(System.in);
		String a = lsm.nextLine();
		char b=' ';
		for(int i=0 ; i< a.length();i++) {
			if(a.charAt(i)>=65&&a.charAt(i)<97)
			{	b=(char)(a.charAt(i)+32);
				System.out.print(b);}
			else if(a.charAt(i)>=97&&a.charAt(i)<129) {
				b=(char)(a.charAt(i)-32);
				System.out.print(b);
			}
		}
		lsm.close();
		lsm=null;
			
	}

}
