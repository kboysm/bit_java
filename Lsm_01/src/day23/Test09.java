package day23;

public class Test09 {
	public static void main(String[] args) {
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
		System.out.println("main start");
		
		System.out.println(Thread.currentThread());
		
		T1 t1 =new T1();//쓰레드이자 job을 수행
		T2 t2 = new T2();
		t1.start();
		
		t2.start();
		System.out.println(t1.sum+t2.sum);
		System.out.println("main end----------------------------------------------------");
	}
}
//Thread위에 얹어질 잡원 잡투->런어블객체 들을 만들었다.
class T1 extends Thread{//홀수 합 계산
	int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1 ; i<100;i+=2) {
			sum+=i;
			System.out.println(Thread.currentThread()+"  ");
			System.out.println("1~"+i+"까지 홀수 합 : "+sum);
			
		}
	}
}
class T2 extends Thread{//홀수 합 계산
	int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<100;i+=2) {
			sum+=i;
			System.out.println(Thread.currentThread()+"  ");
			System.out.println("0~"+i+"까지 짝수 합 : "+sum);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
