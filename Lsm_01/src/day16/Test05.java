package day16;

public class Test05 {
//throws ~~Exception 옵션을 메인에 줄 수 있다. 메인에 줬을때는 메인을 호출하는 곳에서 트라이 캐치를 해줘야 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		
		for(int i=0;i<10;i++) {
			System.out.println("hello"+i);
			try {
			Thread.sleep(5000);
			}catch(InterruptedException e){
				
			}
		}
		//sleep메서드는 트라이캐치를 무조건 해줘야함 체크드인셉션
		
		
		System.out.println("main end");
	}

}
