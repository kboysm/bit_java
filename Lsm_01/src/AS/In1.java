package AS;

interface In1 {
 public int getA();
}

interface In2{
	public int getA();
}
interface In3 extends In1,In2{
	public int getData();
}
class IInt implements In3{
	int a=100;
	public int getA() {
		return a;
	}
	public int getData() {
		return 10+a;
	}
	
	public static void main(String[] args) {
		IInt it = new IInt();
		In1 it1 =it;
		In2 it2 = it;
		In3 it3 =it;
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
		System.out.println(it.toString());
		
		String res =null;
		if(it1 instanceof In2)
			res="맞다";
		else
			res="아니다";
		System.out.println("it1 instanceof In2 : "+res);
	}
}