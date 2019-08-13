package day15;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a = new AAA() { //new AAA() 사이에 extends 생략되어 있는것 추상메서드를 바로 구현
			
			@Override
			void exec() {
				// TODO Auto-generated method stub
				
			}
		};
			
			III i= new III() {//new i()사이에 implement가 생략 
				//임플리멘트는 뉴키워드 작성해서 사용불가인데  변수 자체에 함수를 넣어서 사용한다는거 같음
				
				@Override
				public void exec() {
					// TODO Auto-generated method stub
					
				}
			};
	CCC c= new CCC() {//일반 클래스도 이렇게 사용가능 여기서 오버라이딩해서 사용
		void exec() {} //메모리구조 c에 생성된 CCC의 주소가 드가고 그 CCC아래에 어너미너스 클래스가 생기고 CCC의 메서드를 
		//오버라이딩해서 그 오버라이딩 된 녀석으로 어너미너스 메서드녀석을 수행
		//CCC() { ~~~} : ~~~녀석이 어너미너스로 클래스의 부분
	};
	}

}


abstract class AAA{
	abstract void exec(); 
}

interface III{
	void exec();
}
class CCC{
	void exec() {}
}