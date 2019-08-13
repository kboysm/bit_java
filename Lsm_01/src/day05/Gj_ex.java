package day05; //45까지 중복 x한 수를 넣고 count를 최소화 하는 과제 풀이

//시험문제 주관식으로 나온다 !!

import java.util.Arrays;

public class Gj_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = null;
		num = new int[6];
		System.out.println(num.length);
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j])
					i--;
				break; // 내가 생각하지 못한 부분 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				// break이유: j==0이나1일때 같은것이 발생한다면 j는 2부터는 실행하지 말고 바로 빠져나가게 하기 위해서이다.
			}
			// System.out.println(Arrays.toString(num));
		}
		// Syso에서 위에 9번라인이 주석처리 되면 주소가 아닌 null이 들어가기 때문에 .연산자를 사용할 수 없다.
		System.out.println(Arrays.toString(num));
		System.out.println("==========================sort=========================");
		int count = 0;
		for (int i = 0; i < num.length - 1; i++) {
			int min = i; // 내가 놓친 부분 나는 0으로 초기화해서 했음.
			for (int j = (i + 1); j < num.length; j++) {
				if (num[min] > num[j]) {// min을 i에 넣었기 때문에 이렇게 해도 가능하다. 나는 삼항연산자를 두번썻다. 반성하자~
					min = j;// 제일 작은 값이 드간다.
				}
			}
			if (i != min) {// 나는 continue로 처리했는데 여기서는 같지 않다면으로 처리해서 같으면 아예 안되게 깔끔하게 처리했다. 반성하자.
				int temp = num[i];
				num[i] = num[min];
				num[min] = temp;
				count++;
			}
		} // int타입의 배열을 정렬할때는 이걸 쓰면 된다. 꼭 기억해야 한다.
		System.out.println(Arrays.toString(num) + " 카운트 수 :  " + count);
	}

}
