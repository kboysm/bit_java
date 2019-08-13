package day19;

@FunctionalInterface //추상메서드가 하나 ->즉 람다표현이 가능
public interface Command {
	void exec();
	default void print() {
		System.out.println("~~~~~~~");
	}
}

class DCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("길용성 바보똥개멍청이해삼말미잘 딜리트");	
	}
}
class UCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("길용성 바보똥개멍청이해삼말미잘 업데이트");	
	}
}
class ICommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("길용성 바보똥개멍청이해삼말미잘 인서트");	
	}
}
class SCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("길용성 바보똥개멍청이해삼말미잘 셀렉트");	
	}
}