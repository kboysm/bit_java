package day10;

public class Dog extends Animal {
		private String name="강아지 이름";
		private String kind;
		public Dog() {
		//super();가 생략되어 있어서 Animal에 기본생성자가 없으면 오류 기본생성자가 조상클래스에 없다면 조상클래스의 다른 생성자를 불러야한다.
		super("강아지과");
		}
		public Dog(String kind, String name) {
			super("강아지과");
			this.kind = kind;
			this.name = name;
		
		}
		public Dog(String dog, String kind, String name) {
			super(dog);
			this.kind = kind;
			this.name = name;
		
		}
		public String getKind() {
			return kind;
		}
		public void setKind(String kind) {
			this.kind = kind;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSuperKind() {
			return super.kind;
		}
		
	public void dogPrint() {	
		System.out.printf("[%s:%s:%s] %n",super.kind,this.kind,this.name);
	}
	public void print() {
		super.print();
		System.out.println(" "+this.kind+" "+this.name);
	}
	
}
