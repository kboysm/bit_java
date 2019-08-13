package day07;

import java.util.Arrays;

import util.Sort;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]n = {5,4,3,2,1};
			int[]h= new int[n.length];
			
//			for(int i=0 ; i<n.length;i++) {
//				h[i]=n[i];
			System.arraycopy(n, 0, h, 0, n.length);
			//}//System.Arraycopy로 하라고 하심. -> 값을 복사하는 함수
			
			Sort lsm = new Sort();
			lsm.sort(h);
			System.out.println(Arrays.toString(n));
			System.out.println(Arrays.toString(h));
	//여기까지는 내가 푼것  선생님이 이것도 맞다고 했음.
		
		
	}
}


