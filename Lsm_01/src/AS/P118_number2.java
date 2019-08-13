package AS;

public class P118_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이건 질문하기
		String a = args[0];
//args는 연결을 해주는 통로 정도로 기억
		//if((Integer.parseInt(a)>=0) || ((Integer.parseInt(a)<9)
				System.out.println("args[0] = " + a);
				
			if((int)a.charAt(0)>=65&&(int)a.charAt(0)<97)
				System.out.println("대문자");
			else if((int)a.charAt(0)>=97&&(int)a.charAt(0)<123)
				System.out.println("소문자");
			else if((int)a.charAt(0)>=48&&(int)a.charAt(0)<57)
				System.out.println("숫자");

		




	}

}
