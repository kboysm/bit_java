package day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
//		String [] name1 = new String[100];
		String []name1 = {"길용성","길룡성","귈용성","기르용성"};
		System.out.println(Arrays.toString(name1));
		Arrays.sort(name1); // sort 메서드
		System.out.println(Arrays.toString(name1));
		//이녀석은 주소값을 찍는데 리스트는 리스트가 나옴 즉 투 스트링 메서드가 오버라이딩이 돼 있음
		
//		names1[100] ="~~~"; 100번째는 리사이징을 해줘야함 그러나 리스트는 자동으로 해줌 더 편함 사이즈 걱정 ㄴㄴ임
		//위에는 인덱스에 신경을 많이 써야한다. 
		List<String> list = new ArrayList<String>();
		list.add("길용성1");
		list.add("길용성2");
		list.add("길용성3");
		list.add("길용성4");
		list.add("길용성5");
		list.add("길용성6");
		list.add("길용성7");
		list.add("길용성8");
		list.add("길용성9");
		list.add("길용성0");
		
		System.out.println(list); // 리스트 구조에서는 중복된 데이터가 드가도 된다
		Collections.sort(list); // 소트명령 //콜렉션 클레스의 소트 메서드 
		System.out.println(list); // 리스트 구조에서는 중복된 데이터가 드가도 된다
		
		List<String> list2 = new ArrayList<String>(list.subList(1, 4)); //4-1이니까 3개 출력
		System.out.println(list2);
		
		Object [] a1= list.toArray();
		System.out.println(Arrays.toString(a1));//list.toArray()의 리턴타입이 오브젝트라 오브젝트 배열에 넣어서 뽑았음
		
		String [] a2 = new String[list.size()];
		list.toArray(a2); //a2라는 배열은 내가 원하는 타입의 배열로 만듬
		System.out.println("a2 =>" + Arrays.toString(a2));
		
		String[] sss = {"111","222","333","444"};
		//이녀석으로 어레이 리스트를 가고 싶다! 라면!
		List<String> sslist = new ArrayList<String>(Arrays.asList(sss));//Arrays.asList(배열)넣으면 배열을 리스트로 만듬
		
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i).charAt(0)+"**");
		}
		//아래 포문은 셋 구조에 대한 인헨즈드 포 루프 
		for(String data : list) {
			System.out.print(data+ "  ");
			
		}
		System.out.println();
		Iterator<String> it = list.iterator(); //이거 많이 씀 알아야 함 순회하려면 포루프를 써야하는데 앞으로는 이터레이트로 할 예정
		//몇개가 있는지 몰라서 while 루프를 씀  , hasnext , next ,remove
		while(it.hasNext()) {
			String data = it.next();
			if(data.equals("길용성9")) {//동일 데이터가 2개라면 2개다 삭제 된다.
				it.remove();
				System.out.println("길용성9 삭제 완");
			}
		}
		System.out.println(list);
	}
}
