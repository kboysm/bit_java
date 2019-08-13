package Java_Essen_5;

public class Java_5_2 {
public static void main(String[] args) {

	MyAdder lsm = new MyAdder();
	System.out.println(lsm.add(5,10));
	System.out.println(lsm.add(10));

}
}
interface AdderInterface{
	int add(int x , int y);
	int add(int n);
}

class MyAdder implements AdderInterface{
	@Override
	public int add(int n) {
		int sum=0;
		
		for(int i=0 ; i<=n;i++)
			sum+=i;
		return sum;
	}@Override
	public int add(int x, int y) {
		return x+y;
	}
}