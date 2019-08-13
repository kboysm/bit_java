package day04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lsm = new Scanner(System.in);
		String a = lsm.nextLine();
		for(int i=0 ; i<a.length();i++) {
			System.out.println("문자입력");
		char aa = a.charAt(0);
		int b = (aa>='A'&& aa<='Z') ? (aa+32) : (aa>='a'&& aa<='z') ? (aa-32) : aa;
		System.out.println(aa+"--->"+(char)b);
	}}

}//과제 : 소문자는 대문자 대문자는 소문자로 
