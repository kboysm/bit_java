package day10;

public class Animal {
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
	public void breath() {
		System.out.println(kind+" : 폐로 숨쉬기");
	}
	public void print() {
		System.out.println(kind);
	}
}
