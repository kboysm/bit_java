package day06;
//이런 클래스들을 모아놓은것이 라이브러리이다. ==(.jar  <--확장자) 웹에서는 .yar(에플리케이션 컴포넌트로 구분)
public class Employee {
	//데이터(변수)와 기능(메서드or함수) : 클래스의 구성
	//임플로이 클래스에서는 이름과 부서와 사원번호를 갖는다
	private String name;
	private String dept;
	private int age; 
	private boolean single;//boolean은 get,set이 아니다 값을 설정하지 않으면 디폴트 초기화로 false가 드간다.
	// public void setAge(int a){ 유효성 검증 후 age= a return;} ->나이를 받음
	// public int getAge(int a){권한 체크 후 return age;} -> 나이를 알려줌
	//이것이 바로 인캡슐레이션(캡슐화이다)
	//201901~이런식으로 번호가 부여된다고 가정한 예제이다.
	//맴버변수를 바꿀때도 리팩토링로 바꿔야 한다. 원래는 num 이었는데 age로 바꿈
	//클래스에는 퍼블릭이 걸려있어 패키지가 달라도 접근이 가능하다 하지만 클래스 내 변수는 퍼블릭이 걸려있지 않아 접근이 불가능하다.
	//참조하는 메인 클래스에서는 import가 걸려있을 것이다.
	//지금 여기선 디폴트 접근자가 기본으로 걸려있어서 다른 패키지의 클래스가 접근 금지 앞에 퍼블릭을 써주면 다른 패키지에서 접근이 가능하다.
	//같은패키지에 있다면 import가 사라진다 ->리팩토리기능을 사용했을때
	
	public void display() { //return a;가 아니라 그냥 return; 이게 void이다.
		System.out.printf("나이 :%10s,이름:%-10s,부서:%-10s 혼인 : %-10s %n",this.getAge(),this.getName(),this.dept,this.single);
		return;
	}
	//this. 키워드는 heap영역에서만 사용이 가능하다. 다른 영역에서 사용시 에러발생.
	//display() 메서드 내에 각 맴버변수는 this.이 생량돼 있다.
	//return타입 void와 다른것의 차이 알기
	//내가 뭔가를 기대하고 나한테 뭔가 떨어지는거 ex)출금
	//그냥 일만하고 끝나는거 void ex)입금
	
	//데이타와 기능이 있는데 데이터는 변수선언과 비슷 데이터타입을 기술하고 명령을 수행하는것이 기능(접근지정자,리턴타입,메서드네임,매게변수) 고려
	
	//우리는 앞으로 하는 모든 클래스는 캡슐화를 적용한다.
	//교수님의 최종목표는 우리가 다형성을 완벽히 이해하고 쓰는것
	
	public void setAge(int age) {//int age는 로컬변수 위의 클래스 아래변수들은 멤버변수
		if(!(age>0&&age<=100))
			{System.out.println("age(나이) 정보가 올바르지 않습니다.");
		return;} // 유효성 검사후 올바르지 않으면 return문으로 메서드를 종료시킨다.
		
		this.age=age; //this.을 안하면 로컬변수=로컬변수 이다.
		return; //리턴되는 값이 없고 설정만 하는 메서드이므로 void설정을 해준다.
	}
	
	public int getAge() {
		return age; //리턴되는 값이 int이므로 메서드를 int로 선언한다.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}
	
		
	}//set , get메서드는 무조건 만든다고 보아야 한다.
//소스에 제너레이터 겟터 셋터를 클릭 후 위에 옵션을 선택하면 자동으로 만들어준다.

