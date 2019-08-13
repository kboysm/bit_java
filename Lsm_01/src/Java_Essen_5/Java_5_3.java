package Java_Essen_5;

import java.util.Scanner;

public class Java_5_3 {
public static void main(String[] args) {
	Adder lsm = new Adder();
	Sub lsm1 = new Sub();
	
	lsm.run();
	lsm1.run();
}
}

abstract class Calcuator{
	protected int a,b;
	abstract protected int calc();
	protected void input() {
		Scanner lsm = new Scanner(System.in);
		System.out.print("정수 두개를 입력하세요.");
		a = lsm.nextInt();
		b=lsm.nextInt();
	}
	public void run() {
		input();
		int res =calc();
		System.out.println("계산된 값은 "+res);
	}
}

class Adder extends Calcuator{
	@Override
	protected int calc() {
		// TODO Auto-generated method stub
		return a+b;
	}
}
class Sub extends Calcuator {
	@Override
	protected int calc() {
		return a-b;
	}
}