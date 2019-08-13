package day08;

public class BolckTest {
	public static void main(String[] args) {
	Block b1=new Block();	
	Block b2=new Block();	
	Block b3=new Block();	
	Block b4=new Block();	
	}
}

class Block{
	int i;
	int j;
	static String name;
	static{
		name="~~";
//		System.out.println("static()");
		}
//	{System.out.println("{                     }");}
	//생성자보다 먼저 수행되는 초기화 블록이다. 그냥 이런것도 있다 정도 하고 넘어감
	//중복되는 코드들을 보통 여기에 모아놓고 쓴다고함.
	public Block() {
//		System.out.println("생성자");
	}
	public Block(int i) {
		this.i=i;
	}
	public void print() {
		System.out.printf("i=%s,j=%s,name=%s %n",i,j,name);
	}
	
}//초기화는 생성자,초기화블록,스태틱초기화블록이 있다.
//순서 스태틱초기화블록>초기화블록>생성자
//스태틱초기화는 한번만 호출되고 나머지는 만들때마다 호출
