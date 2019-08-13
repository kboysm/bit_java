package day17;
//콜렉션이 제너릭 기반으로 작동해서 제너릭을 무조건 알아야 한다.
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1 = new Book1("길용성",1); // 타입을 정의하지 않은 데이터타입을 넣을때는 가장 최상위 클래스인 오브젝트 타입의 변수로 받아 들여 받는다.
		System.out.println(b1);
		
		Book1<Double> b2 = new Book1<Double>("길용성 혀", 1.0); //<String>으로 하면 알수없는변수타입이 스트링형으로 바뀌어 받는다
		System.out.println(b2);
		
		Book1<Integer> b3 = new Book1<Integer>("길용성 콧구멍", 1);
		//오토박싱이 일어남.int 와 Integer 사이 자동으로 왔다리 갔다리 한다.  Integer는 객체
		System.out.println(b3);
	}

}
