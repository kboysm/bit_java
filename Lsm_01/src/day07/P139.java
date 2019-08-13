package day07;

public class P139 {

		public static int increase(int n) {
			++n;
			return n;
		}
		public static void main(String[] args) {
			int var1 =100;
			System.out.println(var1);
			int var2=P139.increase(var1);//메모리에 안떠있어서 호출이 불가능 . increase를 static메서드로 바꿔주면 사용 가능
			
			System.out.println(var1+" "+var2);
		}

}
