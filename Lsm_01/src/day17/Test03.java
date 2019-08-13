package day17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		
		List list =new ArrayList(); //데이터타입이 관계없이 다 드간다. , 어레이리스트랑 벡터랑 바꿔 넣어도 결과는 같게 나온다. 이코드는 
		list.add("용성"); // 기본타입이 오브젝트타입이므로 리스트의 자원을 변경하기 위해서는 다운캐스팅과 인스티드오브를 해야한다.
		list.add(1);
		list.add('a');
		list.add(new Date());
		System.out.println(list);
		System.out.println(list.get(1));//오브젝트 타입임으로 모든 타입이 다드간다. 도트기반으로 메서드를 보면 오브젝트메서드가 나온다.
		
		for(int i=0 ;i<list.size() ;i++) {//배열은 length지만 리스트는 size이다.
			System.out.println(list.get(i));
		}
			
	}
}
