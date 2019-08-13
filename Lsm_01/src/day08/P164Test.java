package day08;
//하나의 파일에 2개의 클래스를 만들었는데.
//퍼블릭한 클래스는 1개여야하구 보통은 파일네임을 갖는 클래스에 퍼블릭이 붙으며 메인메서드가 있다.
public class P164Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		System.out.println(Count.count);
		System.out.println(c1.c);
		System.out.println(c2.c);
		System.out.println(c3.c);
		System.out.println(c4.c);
		System.out.println(c1.count);
		System.out.println(c2.count);
		System.out.println(c3.count);
		System.out.println(Count.count);
	}

}

class Count {
	int c;
	static int count;
	public Count() {
		c++;
		count++;
	}
}