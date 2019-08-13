package day17;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book<String,Integer> b1 = new Book<String,Integer>("dddd",1);
		System.out.println(b1);
		
		Book b2 = new Book("aadd",2);
		System.out.println(b2);
//		if(b1.getTitle() instanceof String)
//		System.out.println(((String)(b1.getTitle())).charAt(0)); 이것도 교수님이 한거
		String aa = (String)b2.getTitle();
		System.out.println(aa.charAt(0));
		
		String a1 = b1.getTitle();
		System.out.println(a1.charAt(0));
//		System.out.println(b1.getTitle().charAt(0)); 교수님이 한거
		
		Book<String,Integer> b3 = new Book<String,Integer>("Spring",1);
		System.out.println(b3.getTitle());
		
		Book<String,? extends Number> b4 = new Book<String,Integer>("dddd",1);//extends Number는 Number의 자식
		//클래스로 뒤에 꺽쇠에 드간다는 말이다.(본인도 가능)
		System.out.println(b4.getPrice());
		
		Book<String , ? super Number> b5 = new Book<String,Number>("dddd",1);//super는 부모를
		//Number의 부모객체 즉 오브젝트 와 본인이 드갈 수 있다.
		/*배열은 연속적으로 메모리에 할당돼어 자료접근이 가장빠름
		 * 중간에 삽입삭제가 빈번하게 일어나는 경우 적합하지 않다. 
		 * 순차적으로 추가하는 경우 적합
		 * 
		 * 링크드 리스트는 메모리에 산재한 구조이기 때문에 그 구조를 다 찾아다녀야 함 , 중간삽입삭제하기 좋다 
		 * 백터ㅡ어레이리스트는 배열임
		 * 
		 * map -> key값 value값이 짝을 이뤄관리 
		 * 해쉬맵은 key값을 기준으로 데이터를 찾는 속도가 엄청 빠르다
		 * tree맵 키값을 기준으로 정렬이 되서 자원관리 
		 * */
	}

}
