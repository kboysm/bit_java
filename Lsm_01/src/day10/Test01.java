package day10;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java ProgRamINg".equals("java ProgRamINg"));//이녀석은 완벽히 같아야 트루
		System.out.println("java ProgRamINg".equals("JAVA ProgRamINg"));// JAVA대문자라 펄스
		System.out.println("java ProgRamINg".equalsIgnoreCase("JAVA ProgRamINg"));
		System.out.println("java ProgRamINg".equalsIgnoreCase("JAVA "));
		System.out.println("java ProgRamINg".equalsIgnoreCase("java "));
		System.out.println("java ProgRamINg".contains("JAVA "));//대문자 자바가 아니라 펄스
		System.out.println("java ProgRamINg".toLowerCase().contains("JAVA "));//앞에만 투로아케이스라 팔스
		System.out.println("java ProgRamINg".toLowerCase().contains("JAVA".toLowerCase() ));//둘다 소문자로 바꿔서 트루
		
		String[] aa= new String[3];
		
		aa[0]="java hi";
		aa[1]="JAVA hi";
		aa[2]="JaVa Hi";
		
		for(int i=0 ; i<aa.length ;i++) {
			if(aa[i].toLowerCase().contains("java".toLowerCase()))
				System.out.printf(" %d 번째",i);
		}
		
	}

}
