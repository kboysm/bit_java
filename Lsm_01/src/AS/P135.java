package AS;

import java.util.Arrays;

public class P135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println((int)Math.random()*10); //int로 캐스팅시 항상 0이나옴 소수점을 항상 잘리기
		// 때문에

		if (args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요..");
			System.out.println("실행 예) java day05.Test04 5");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		// 1~45의 수만 배열에 넣는 명령어. +1은 0부터 시작하기 때문에 (0~44)+1임
		System.out.println(Arrays.toString(num)); // sort정렬
		System.out.println("-----정렬-------");
		System.out.println(Arrays.toString(num));
		System.out.println("---------------------------------------");
		int count = 0;
		for (int i = num.length - 1; i > 0; i--) {
			int aa = 0;
			for (int j = 0; j < i; j++) {
				if (j == 0)
					aa = num[i] > num[j] ? i : j;
				if (j > 0)
					aa = num[aa] > num[j] ? aa : j;
			}

			if (aa == i)
				continue;
			int a = num[aa];
			num[aa] = num[i];
			num[i] = a;
			count++;
		}
		System.out.println(Arrays.toString(num) + " 정렬 후 ,count : " + count);
	}
}
