package day18;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {
		Student [] s = new Student[10];
		
		Vector<Student> list = new Vector<Student>(5,10/*처음에5개를 만들고 10개씩 증가할거야!*/); //내부에 스튜던트 객체를 만들어서 관리 
		//동기화문제를 생각하면 백터 그게 아니면 어레이리스트 백터는 동기화처리가 돼있음
		//여러명이 접근하면 백터 여러명이 접근하는것이 아니면 어레이리스트
		System.out.println("capacity : "+ list.capacity());
		System.out.println("size : " + list.size());
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("길용성",90,90));
		list.add(new Student("ddd",88,99));
		list.add(new Student("zdd",78,39));
		list.add(new Student("fdd",68,49));
		list.add(new Student("홍길동",90,90));
		System.out.println("---------------------------------------------");
		System.out.println("capacity : "+ list.capacity());
		System.out.println("size : " + list.size());
//		System.out.println(list);
		
		Iterator<Student> lsm = list.iterator();//리스트.이터레이터 , 이터레이터는 해즈넥스트 , 넥스트 ,리무브 밖에없다.
		while(lsm.hasNext()) {
			Student data = lsm.next();
			if(data.getName().equals("홍길동"))
			{data.setKo(100);
			data.setMath(100);
			data.setAvg();
			System.out.println(data + " 수정");
			}
			
			System.out.println(data);
		}
		
//		홍길동을 다시 바꿈
//		lsm = list.iterator();
//		while (lsm.hasNext()) {
//			Student data = lsm.next();
//			
//			data.name="홍길동";
//			data.ko=100;
//			data.math=100;
//		} 전 데이타가 홍길동 100 100으로 당연히 바뀐다 
//		
		lsm = list.iterator(); //다시 해주는 이유는 위쪽에서 next를 계속해주어 내부적으로 커서같은것이 다음을 가르킬 데이터가 없어서
		//재설정을 해준다는 의미이다.
		System.out.println("학생 목록");
		while(lsm.hasNext()) {
			Student data = lsm.next();
			System.out.println(data);
		}
		
		System.out.println(list.contains(new Student("ddd",88,99)));
		//내부적으로 이퀄즈 메소드가 없어서 비교를 못해서 false가 나온다. 스튜던트 클래스에서 이퀄즈 함수를 추가(오버라이딩)해주면 true가 나옴
		//CURD(등록,업데이트,서치,딜리트)작업 
		// 홍길동 90 90 등록
		Student s1 = new Student("lsm",9,9);
		boolean flag = list.add(s1);
		
		if(flag) System.out.println(s1 + "등록");
		else System.out.println(s1 + "노 등록");
		
		lsm = list.iterator();
		while(lsm.hasNext()) {
			Student data = lsm.next();
			
			if(data.equals(s1)) {
				lsm.remove();
				System.out.println(s1 + "삭제");
			}
			System.out.println(data);
		}
		Collections.sort(list);//내부적으로 컴페어투가 있어야 하나씩 비교하면서 솔트를 한다.  implements comparable이 필요하고
		//관련 메소드를 오버라이딩 한다.
		System.out.println(list);
	}
}

