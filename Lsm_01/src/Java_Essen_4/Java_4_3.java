package Java_Essen_4;

import java.util.Scanner;

public class Java_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lsm = new Scanner(System.in);
		Rect lsmR [] = new Rect[4];
		for(int i=0 ; i<lsmR.length ;i++) {
		System.out.println("너비와 높이");
		int a1 = lsm.nextInt();
		int a2 = lsm.nextInt();
		lsmR[i]=new Rect(a1,a2);
		}
	int sum=0;
		for(Rect data : lsmR) {
			sum+=data.getArea();
		}
		System.out.println("합 :"+sum);
	}

}

class Rect{
	private int w,h;
	
	Rect(int w, int h){
		this.w=w;
		this.h=h;
	}
	int getArea() { return w*h;}
}