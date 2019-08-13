package day17;

public class DiceGame  {
	Dice a1;
	Dice a2;
	public DiceGame() {
	
		a1= new Dice(8);
		a2= new Dice(8);// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiceGame game = new DiceGame();
		int result2=0;
		int result1=0;
		try {
		result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 :" +result1);
		result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 :"+result2);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
	
	
	}

	int countSameEye(int n) throws Exception {
		if(n<0) 
		{throw new Exception("0보다 작음");
		}
		int count=0;
		for(int i=0 ; i<=n;i++) {
		int b1= a1.play();
		int b2= a2.play();
		if(b1==b2)
			count++;
		}
		return count;
	}
}
class  Dice{
	int size;
	Dice(int size){
		this.size = size;
	}
	int play() {
		int number = (int)(Math.random()*size)+1;
		return number;
	}
}
