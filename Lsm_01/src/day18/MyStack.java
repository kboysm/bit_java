//package day18;
//
//
//
//public class MyStack{
//	E[] num;
//	int top=0;
//	
//	
//	
//	public MyStack() {
//	this(10);
//	top=0;
//	}
//	public int pop() {
//		if(top==0)
//			return -1;
//		int a =num[top-1];
//		num[top-1]=0;
//		top--;
//		return a; //44~46 의 문장을 return num[--count];로 끝내버림 대단
//	}
//	public int top() { //메뉴에 뭐가 있나 였보는 메소드 ->피크메소드라고 부름
//		// TODO Auto-generated method stub
//		if(top==0) // 나는 count==0이라고 했지만 교수님은 isEmpty()메소드를 조건으로 넣음
//			return -1;
//		return num[top-1];
//	}
//	public boolean isFull() {
//		if(top==10) //count == num.length로 하는것이다. 
//			return true;
//		// TODO Auto-generated method stub
//		return false;
//	}
//	public boolean isEmpty() {
//		// TODO Auto-generated method stub
//		if(top==0)
//			return true;
//		return false;
//	}
//	public MyStack(int a) {
//		// TODO Auto-generated constructor stub
//		if(a<0)
//			num=new int[10];
//	this.num = new int[a];
//	}
//	public int[] getNum() {
//		return num;
//	}
//	public void setNum(int[] num) {
//		this.num = num;
//	}
//	public int getCount() {
//		return top;
//	}
//	public void setCount(int count) {
//		this.top = count;
//	}
//	public void push(int a) {
////		if(isFull()) {
////			System.out.println("스택이 다 찼습니다.");
////		return;
////		}
//		num[count]=a;
//		count++;
//	}
//	public static void main(String[] args) {
//		
//	}
//	
//}