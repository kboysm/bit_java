package util;

import java.util.Arrays;

public class Sort {
	public int[] sort(int[] nums) {
		int count = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			int aa = 0;
			for (int j = 0; j < i; j++) {
				if (j == 0)
					aa = nums[i] > nums[j] ? i : j;
				if (j > 0)
					aa = nums[aa] > nums[j] ? aa : j;
			}

			if (aa == i)
				continue;
			int a = nums[aa];
			nums[aa] = nums[i];
			nums[i] = a;
			count++;
		}
		return nums;
	}
	public static int[] copy(int[] ns){
		int copy[]= new int[ns.length];
		System.arraycopy(ns, 0, copy, 0,ns.length);
		return ns;
	}
	
}
//교수님 정렬 알고리즘

//for(int i=0 ; i<num.length-1;i++) {
//	int min=i;
//	for(int j=(i+1);j<num.length:j++) {
//		if(num[min]==num[j]) {
//			min=j;
//		}
//	}
//	if(i!=min) {
//		int temp=num[i];
//		int[i]=num[min];
//		num[min]=temp;
//		count++;
//	}
//}
