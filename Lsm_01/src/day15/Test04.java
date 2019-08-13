package day15;

public class Test04 {
	public static void main(String[] args) {
		Command cmd=new DeleteCommand();
		cmd.exec(); //Command 데이터 타입으로 cmd를 만들면 다형성이 오진다.
		cmd = new UpdateCommand();
		cmd.exec();//다형성 , cmd하나로 여러가지를 수행  //Command를 구현한 객체만 가능 
	}
}
