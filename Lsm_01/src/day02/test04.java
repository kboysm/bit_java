package day02;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("byte type max value =>"+Byte.MAX_VALUE);
		System.out.println("int type max value =>"+Integer.MAX_VALUE);
		System.out.println("long type max value =>"+Long.MAX_VALUE);
		System.out.println(Math.PI);
		
		char c= '6';
		System.out.println(c + "숫자니?"+Character.isDigit(c));
		String ss= "1"+"1";
		
		System.out.println(ss);
		
		Double s1 = Double.parseDouble("1.6")+Double.parseDouble("1.7") ;
		System.out.println(s1);
	}

}
