package Java_Essen_4;

public class Java_4_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box a= new Box();
		Box b = new Box(20,3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}

}
class Box{
	private int w,h;
	private char fchar;
	public Box() {
		this(10,1);
	}
	public Box(int w ,int h) {
		this.w=w;
		this.h=h;
	}
	public void draw() {
		for(int i=0 ; i<h;i++) {
			for(int j=0 ; j<w;j++) {
				System.out.print(fchar);
			}
			System.out.println();
		}
	}
	public void fill(char c) {
		this.fchar=c;
	}
}