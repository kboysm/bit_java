package day14;

public interface Command {
	public void exec();
	default public void check() {
		System.out.println("Command check() 함수");
	}
	//인터페이스에 추상메소드가 아닌것을 추가할 때는 디폴트를 붙여준다
	//인터페이스 안에는 추상메소드 이외에 디폴트 메소드를 추가할 수 있다.
	//이 디폴트 메소드는 추상메소드가 아니다.인스턴스 메소드도 아니다 . 마치 static과 비슷하게 내부적으로 관리 된다
	//바디부가 있는 녀석은 반드시 디폴트를 해준다. interface안에서 그럼 상속받은 모든 클래스에서 오버라이딩할 필요없다
	//필요한 클래스만 오버라이딩해서 사용한다.
}

class DeleteCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("Delete(삭제) 수행");	
	}
	public void check() {
	System.out.println("Delete Command check() 함수");
	}
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("Insert(등록) 수행");	
	}
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("Update(수정) 수행");	
	}
}
class ListCommand implements Command{
	@Override
	public void exec() {
		// TODO Auto-generated method stub
	System.out.println("List(목록) 수행");	
	}
}