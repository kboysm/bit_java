package JaVa_Essen_2;

import java.util.Scanner;

public class Java_2_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("식을 입력하세요");
 Scanner lsm = new Scanner(System.in);
 double a1 = lsm.nextDouble();
 String a2 = lsm.next();
 double a3 = lsm.nextDouble();
 double result =0;
 
 switch (a2) {
case "+":
	result=a1+a3;
	break;
case "-":
	result=a1-a3;
	break;
case "*":
	result=a1*a3;
	break;
case "/":
	if(a3==0) {
		System.out.println("0으로 나눌수 없음");
		return;
	}
	result=a1/a3;
	break;
	default : System.out.println("기호의 오류");
}
 System.out.println(result);
	}

}
