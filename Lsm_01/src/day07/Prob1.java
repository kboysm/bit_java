package day07;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prob1 prob1 = new Prob1();

		System.out.println(prob1.leftPad("bit", 6, '#'));
		System.out.println(prob1.leftPad("a", 5, '$'));
		System.out.println(prob1.leftPad("bit66", 4, '&'));
		System.out.println(prob1.rightPad("bit", 6, '#'));
		System.out.println(prob1.rightPad("a", 5, '$'));
		System.out.println(prob1.rightPad("bit66", 4, '&'));
	}
	public String rightPad(String str, int size, char padChar) {
		 if(size<str.length())
			  	return str;
		 for(int i=0 ;i<(size-str.length()+i);i++){//나는 중간을 +i로 했지만 교수님은 count변수를 넣었다.
			  	str=str + padChar;
			  }
			  return str;
	}
	public String leftPad(String str, int size, char padChar) {
		/* 여기에 프로그램을 완성하십시오. */
//		int qw=size-str.length();
//		
//		if(qw<=0)
//			return str;
//		
//		char[] aa = new char[qw];
//			for(int i=0 ; i<qw;i++) {
//				aa[i]=padChar;
//			}
//
//		String q1=new String(aa);
//		
//		
//		return q1+str;
		
		//교수님의 풀이
		
		  if(size<str.length())
		  	return str;
		  //int count =size-str.length();
		  for(int i=0 ;i<(size-str.length()+i);i++){//나는 중간을 +i로 했지만 교수님은 count변수를 넣었다.
		  	str=padChar+str;
		  }
		  return str;
		 
	}
}
