package day14.tv;
//로 커플링 예제 
public class TVtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		play(new STV());
		
		play(new LTV());
		
		play(new ITV());
	}
	public static void play(TV tv) {
		tv.powerOn();
		tv.powerOff();
	}
}
