package day24;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main start");
		Account account = new Account("2019001","길용성",99000);
		Job1 j1 = new Job1(account);
		Job1 j2 = new Job1(account);
		Thread t1 = new Thread(j1,"통장");
		Thread t2 = new Thread(j2,"카드");
		t1.start();
		t2.start();
		System.out.println("main end");
		//이대로 하면 동기화문제가 발생 
		
	}
}
class Job1 implements Runnable{
	Account ac;
	
	public Job1() {
		super();
	}

	public Job1(Account ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<5;i++) {	
		int money =(int)(Math.random()*7+1)*1000; //천원에서 칠천원
		ac.withDraw(money);
	}
	}
	
}

class Account{
	String name,number;
	int  money;
	
	public synchronized void  withDraw(int money) {//파일이나 데이타베이타 메서드는 거의 대부분 싱크로나이즈를 걸어줌 (공유자원)
		System.out.println("**** 출금 "+money+"****");
		System.out.println(Thread.currentThread());
		if(this.money>=money) {
			this.money-=money;
		System.out.println(money+"원 출금 완료 / 통장 잔고 : "+this.money);
		}else
			System.out.println("잔액 부족");
		System.out.println("**********************");
	}

	public Account() {
		super();
	}

	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}
	
}