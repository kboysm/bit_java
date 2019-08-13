package day23;

public class Test08 {
	public static void main(String[] args) {
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
		System.out.println("main start");
//		try {
//			Thread.sleep(5);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Thread.yield();//기다리는 녀석이 없기 때문에 무시
		System.out.println(Thread.currentThread());
		T1 job1 = new T1();
		Thread t1 =new Thread(job1,"job1");//쓰레드위에 잡1을 얹을게요! 라는 의미
		T2 job2 =new T2();
		Thread t2 = new Thread(job2,"job2");//생성자 안에 "job2"는 쓰레드의 이름을 job2로 바꾸겠다는 의미 
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("홀수합 + 짝수합 = "+(job1.sum+job2.sum)); //여기서 0이 찍힌다.왜냐면 run이 돌아가기 전에 syso가 먼저 찍힌다.
		System.out.println("main end");
	}
}
//Thread위에 얹어질 잡원 잡투->런어블객체 들을 만들었다.
class Job1 implements Runnable{//홀수 합 계산
	int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1 ; i<100;i+=2) {
			sum+=i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("1~"+i+"까지 홀수 합 : "+sum);
		}
	}
}
class Job2 implements Runnable{//홀수 합 계산
	int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<100;i+=2) {
			sum+=i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("0~"+i+"까지 짝수 합 : "+sum);
		}
	}
}
