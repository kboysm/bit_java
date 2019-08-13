package day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new TreeSet<Employee>(); //해쉬셋(소트노지원)트리셋(소트자동지원)
		boolean aaa=set.add(new Employee(2017001,"길씨","비트캠프0"));
		if(aaa) {
			System.out.println("등록 완료");
		}
		set.add(new Employee(2017002,"용씨","비트캠프1"));
		set.add(new Employee(2017003,"성씨","비트캠프2"));
		set.add(new Employee(2017004,"바씨","비트캠프3"));
		aaa=set.add(new Employee(2017001,"길씨","비트캠프0"));
		if(!aaa) {
			System.out.println("이미 존재하는 데이터");
		}
		System.out.println("사원목록");
		Iterator<Employee> lsm =set.iterator();
		while(lsm.hasNext()) {
			Employee data = lsm.next();
				System.out.println(data);
		}
		System.out.println("검색결과");
		lsm =set.iterator();
		while(lsm.hasNext()) {
			Employee data = lsm.next();
			if(data.getNumber()==2017003) {
				System.out.println(data);
			}
		}//드간 순서대로 안나온다 .중복 해결도 안댄다 
	}

}
