package util;

public class MyUtil {
//		public static long add(int a, int b) {
//			return a+b;
//		}
//		public static double add(double a, double b) {
//			return a+b;
//		}
//		public static double add(double a, double b,double c) {
//			return a+b+c;
//		}
		//public을 빼면 MyMathTest에서는 사용불가 패키지가 다르기 때문에 
		//위의 내용은 메서드 오버로딩의 내용이다.
		public static double add(double ...nums) {//...은 더블형으로 데이터가 가변형으로 몇개 들어올지 모른다라는 뜻 내부적으로 배열처리가 됌
			double sum=0;
			for(double data : nums) {
				sum+=data;
			}
			return sum;
		}//이거 하나로 모든 더하기가 가능하므로 위의 메서드들은 주석처리를 해줬다.
		// **가변인자는 매게변수에서 반드시 마지막 위치에 와주어야 한다. 앞에 놔두었을땐 몇개가 올지 모르므로 무조건 뒤로 가야한다.(가변인자가)
//		public static double add(double[] a) {
//			double sum=0;
//		for(double data : nums) {
//			sum+=data;
//		}
//		return sum;
//		} 이 메서드가 오류가 나는 이유는 15행 인자가 곳 배열이기 때문에 구분할 수 없어서 오류가 나는것이다.
		// 아래것으로 메서드를 활용하면 배열을 매게변수로 받아야하기 때문에 위에것으로 쓰는것이 편하다
		//차이는 위에는 그냥 숫자를 넣으면 되고 아래는 배열을 넣어주어야 한다.
		public static String rightPad(String str, int size, char padChar) {
			 if(size<str.length())
				  	return str;
			 for(int i=0 ;i<(size-str.length()+i);i++){//나는 중간을 +i로 했지만 교수님은 count변수를 넣었다.
				  	str=str + padChar;
				  }
				  return str;
		}
		public static String leftPad(String str, int size, char padChar) {
			/* 여기에 프로그램을 완성하십시오. */
//			int qw=size-str.length();
//			
//			if(qw<=0)
//				return str;
//			
//			char[] aa = new char[qw];
//				for(int i=0 ; i<qw;i++) {
//					aa[i]=padChar;
//				}
	//
//			String q1=new String(aa);
//			
//			
//			return q1+str;
			
			//교수님의 풀이
			
			  if(size<str.length())
			  	return str;
			  //int count =size-str.length();
			  for(int i=0 ;i<(size-str.length()+i);i++){//나는 중간을 +i로 했지만 교수님은 count변수를 넣었다.
			  	str=padChar+str;
			  }
			  return str;
			 
		}
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
		public static double max(double ...nums) {
			double max=Double.MIN_VALUE;
			//보통 가장 작은 값을 초기값으로 설정한다.
			//max=Double.MIN_VALUE; 이렇게 해준다.
			for(int i=0 ; i<nums.length;i++) {
				if(nums[i]>max)
					max=nums[i];
			}
			
			return max;
		}
		public static double min(double ...nums) {
			double min=Double.MAX_VALUE;
			//보통 가장 작은 값을 초기값으로 설정한다.
			//max=Double.MIN_VALUE; 이렇게 해준다.
			for(int i=0 ; i<nums.length;i++) {
				if(nums[i]<min)
					min=nums[i];
			}
			
			return min;
		}
	}


