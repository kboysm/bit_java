package day05;
//혼자할때 if문에 args 0번째에 숫자 넣고 돌려보기
import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println((int)Math.random()*10); //int로 캐스팅시 항상 0이나옴 소수점을 항상 잘리기 때문에
		
		
		
		if(args.length==0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요..");
			System.out.println("실행 예) java day05.Test04 5");
			return;
		}
		
		int[] num =new int[Integer.parseInt(args[0])];
		for(int i=0 ; i<num.length;i++) {
			num[i] =(int)(Math.random()*45)+1;//1~45의 수만 배열에 넣는 명령어. +1은 0부터 시작하기 때문에 (0~44)+1임
		}
		System.out.println(Arrays.toString(num)); //sort정렬
		
		System.out.println("-----정렬-------");
		System.out.println(Arrays.toString(num));
		System.out.println("---------------------------------------");
		int count =0;
		for(int i = 0 ; i<num.length-1 ;i++) {
			for(int j=(i+1) ; j<(num.length); j++) {
				if(num[i]>num[j]) { 
					int a=num[i];
					num[i]=num[j];
					num[j]=a;
					count++;
				}
			}
			System.out.println(Arrays.toString(num));
		}
		System.out.print(count+" ");
	}//과제 -이 정렬의 문제점을 찾아 해결하기(스와핑 작업을 최소한으로 실행하기 4로)

}
