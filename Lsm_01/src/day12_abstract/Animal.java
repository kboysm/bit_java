package day12_abstract;

abstract public class Animal { //추상 클래스
	protected String kind="동물의 종류";

	public Animal() {//하는일이 없어도 기본생성자는 만드는게 좋다. 그래야 에러의 확률이 줄어든다.
		super();
	} 
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}


	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public abstract void breath(); // 추상 메소드 
	public void print() {
		System.out.println(kind);
	}
}
