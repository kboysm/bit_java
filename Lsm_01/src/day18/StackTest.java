package day18;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack2 stack = new MyStack2(10);
		if(stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}
		for(int i=1 ; i<=10 ; i++) {
			stack.push(i);
		}
		if(stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}
		System.out.println("최상위 숫자 : "+stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : "+stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : "+stack.pop());
		System.out.println("");
		System.out.println("==스택 리스트==");
		for(int i=1 ; i<=10 ;i++) {
			int num = stack.pop();
			if(num!=-1)
				System.out.println(num);
		}
	}

}
class MyStack2{
	private int num[];
	private int count;
	
	
	
	public MyStack2() {
	this(10);
	count=0;
	}
	public int pop() {
		if(count==0)
			return -1;
		int a =num[count-1];
		num[count-1]=0;
		count--;
		return a; //44~46 의 문장을 return num[--count];로 끝내버림 대단
	}
	public int top() { //메뉴에 뭐가 있나 였보는 메소드 ->피크메소드라고 부름
		// TODO Auto-generated method stub
		if(count==0) // 나는 count==0이라고 했지만 교수님은 isEmpty()메소드를 조건으로 넣음
			return -1;
		return num[count-1];
	}
	public boolean isFull() {
		if(count==10) //count == num.length로 하는것이다. 
			return true;
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(count==0)
			return true;
		return false;
	}
	public MyStack2(int a) {
		// TODO Auto-generated constructor stub
		if(a<0)
			num=new int[10];
	this.num = new int[a];
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void push(int a) {
//		if(isFull()) {
//			System.out.println("스택이 다 찼습니다.");
//		return;
//		}
		num[count]=a;
		count++;
	}
	
	
}