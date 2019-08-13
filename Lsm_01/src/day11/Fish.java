package day11;

import day10.Animal;

public class Fish extends Animal {

	private String name;

	public Fish() {
		super("물고기");
	}

	public Fish(String name) {
		super();
		this.name = name;
	}

	public Fish(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fishprint() {
		System.out.printf("[%s : %s] %n", kind, name);
	}
	//아래 골벵이 오버라이드는 바로아래 메소드가 오버라이딩이 재대로 됐는지 확인해줌 바로아래 메소드가 재대로 안됐으면 빨간줄이 생김 : 이걸 에노테이션이라함
	@Override
	public void breath() {
		System.out.println(kind+" : 아가미로 숨쉬기 ~~~");
	}
	public void print() {
		super.print();
		System.out.println(" "+this.name);
	}
}