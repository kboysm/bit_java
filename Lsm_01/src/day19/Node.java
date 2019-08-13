package day19;

public class Node<E> {
		E data;
		Node<E> next; //다음 데이터를 가르키는 녀석
		//만약 이전에 뭐가 있는지도 알려면 Node<E> aa 같은 변수 하나가 더 필요 위와 같은 기반의 클래스가 데크 구조이다 
		
		
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}


		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		

}
