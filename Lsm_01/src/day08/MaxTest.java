package day08;

import util.MyUtil;
import java.lang.*;
public class MaxTest {
 int c;
 static int count;
 public MaxTest() {
	 c++;
	 count++;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyUtil.max(1,2,3,4,5,6,7,8,9));
		System.out.println(MyUtil.min(1,2,3,4,5,6,7,8,9));
//		System.out.println(MyUtil.min(new int[] {1,2,3,4,5,6,7,8,10}));
//		String aa="qwer1";
//		String ab="  a aa aa b  ";
//		boolean ac=false;
//		aa=aa.concat(ab);
//		System.out.println(aa);
//		System.out.println(aa.endsWith("r"));
//		char[] chlsm= {'a','b','c','d'};
//		String ad=String.copyValueOf(chlsm);
//		System.out.println(ad);
//		System.out.println(aa.indexOf("1"));
//		System.out.println(aa.replace("qw", "wq"));
//		String aa1=aa.substring(1);
		String aa= "1.qwert2.asdfg3.zxcvb";
		String ab= "       2.asdfg3.zxcvb";
		System.out.println();
		MaxTest lsm = new MaxTest();
		MaxTest lsm1 = new MaxTest();
		MaxTest lsm2 = new MaxTest();
		MaxTest lsm3 = new MaxTest();
		System.out.println(lsm.c);
		System.out.println(count);
	}

}
