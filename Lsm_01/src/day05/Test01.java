package day05;
//배열은 메모리에 한번 앉으면 리사이징이 불가능하다는 단점이 있지만 아주 빠르다는 장점이 있다.
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 99;
		int num2 =num1;
		System.out.println("num1="+num1+" , num2="+num2);
		num1=77;
		System.out.println("num1="+num1+" , num2="+num2);
		//콜바이벨류  call by value
		int[] n1 = {11,22,33,44,55};
		int[] n2 = n1;
		
		int[] n3 =new int[n1.length];
		for(int i=0 ; i<n1.length;i++) {
			n3[i]=n1[i];
		} //원본유지를 위해서 n3에 일일이 복사-> 배열의 크기를 맞춰주고 ->2.데이터를 순서대로 집어 넣는다.
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		n1[2] = 0;
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		//콜바이 레퍼런스 call by reference
		
		//콜바이벨류 콜바이레퍼런스의 차이에 대한 조사. 
	}

}
