package day15;
@FunctionalInterface //추상메서드가 1개만 있는녀석을 이렇게 부름<<<<< 이녀석들은 람다로 표현가능한 대상들
//펀셔널인터페이스를 띄워놓고 추상메서드를 추가하면 오류발생.
public interface Command {
void exec();//무조건 오버라이딩 해!
default public void check() { //그냥 일단 물려받고 필요하면 오버라이딩 해! 
	System.out.println("check!!!");
}
}
class DeleteCommand implements Command {
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Delete Command 수행");
	}
}

class UpdateCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("UpdateCommand 수행");	
	}
}