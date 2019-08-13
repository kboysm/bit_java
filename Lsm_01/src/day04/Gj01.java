package day04;

public class Gj01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		/*
		 * 암호화할 문자열 : everyday we have is one more than we deserve 암호화된 문자열 : hyhubgdb
		 * zh kdyh lv rqh pruh wkdq zh ghvhuyh
		 */
		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		// 프로그램 구현부
		for (int i = 0; i < sourceString.length(); i++) {
			if (sourceString.charAt(i) >= 'a' && sourceString.charAt(i) < 'x')// a~w
				encodedString += (char) (sourceString.charAt(i) + 3);
			else if (sourceString.charAt(i) >= 'x')
				encodedString += (char) (sourceString.charAt(i) - 23);// xyz
			else
				encodedString += (char) sourceString.charAt(i);// 공백
		}

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		int sum=0;
		for(int i=1 ; i<11 ; i++) {
			for(int j=1 ; j<=i ;j++)
				sum+=j;
		}
		System.out.println(sum);
	}

}
