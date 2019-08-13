package day17;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //스트링형으로 제약하면 스트링만 드갈 수 이씀!!
		list.add("a");
		list.add("b");
		
		for(String data :list) {
			System.out.println(data.toUpperCase());
			//프레임웍은 나는 나의 환경을 가지고 있어 라는 의미, 나는 내가 관리하는 영역이 있어 내가 여길 잘 관리해 줄게,
			//어레이리스트는 배열의 크기를 자동으로 관리,
		}
	}
}
