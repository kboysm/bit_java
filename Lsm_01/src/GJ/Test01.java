package GJ;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		String str = "1 and 2 and animal and lion and tiger";
		Scanner lsm = new Scanner(str);
		lsm = lsm.useDelimiter("\\s*and\\s*");
		int a =lsm.nextInt();
		int b=lsm.nextInt();
		String c=lsm.next();
		String d =lsm.next();
		String e=lsm.next();
		
		System.out.printf("%d,%d,%s,%s,%s",a,b,c,d,e);
		lsm.close();
	}
}
