package day04;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] score=new int[5];
String[] names=new String[5];
int[]n=	{1,2,3,4,5};
String[] nn = {"aa","bb","cc","dd","ee"};
int sum = 0;
for(int j=0 ; j<score.length ;j++) {
	System.out.print(score[j]);
}
for(int k :n) {
	System.out.print(k+" ");
	sum+=k;
	
}System.out.print(sum);
for(String q : nn) {
	System.out.print(" "+q+" ");
}
System.out.println(Arrays.toString(score));
System.out.println(Arrays.toString(names));
// Arrays.toString(배열이름)은 배열 안의 내용을 꺼내서 정리해서 보여줌

for(String data : nn) {
	System.out.printf("**"+data.charAt(data.length()-1)+"  ");
}
double sum1 =0;
for(int data : n) {
	sum+=data;
}
System.out.printf("",sum1/n.length);
	}

}
