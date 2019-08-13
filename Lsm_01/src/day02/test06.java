package day02;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =100;
		
		System.out.println(++num);
		System.out.println(num);
		int x=100 , y=100;
		System.out.println(x!=y);
		
		int score = 99999;
		/*if(score>100 || score <0)
			System.out.println("오류");
		else
			System.out.println("점수 : "+score);*/
		
		boolean result = 0<=score & score <=100;
		System.out.println("score 검사 : "+result);
		
		System.out.println(4<<2);
	}

}
