package day16;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		String msg =null;
		msg="xmlqwerty";
		try {
		System.out.println(msg.charAt(3));
		int num=Integer.parseInt(msg);
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("빈 주소"+e.getMessage());
		}
		catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("3번째 글자 없다~ 0 ,1 ,2 까지 있다~ "+e.getMessage());
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("에러에러에러에러에러~숫자로 입력하셈 ");
		}
		catch (Exception e) {//나머지 예외 생각지 못한 에러는 이녀석으로 처리
			//이 녀석은 상황상황 메시지 대응이 불가 , 우리는 이거 쓰지 않음 이녀석은 보통 마지막에 생각지 못한 녀석으로 처리
			// TODO: handle exception
			System.out.println("나머지 예외 처리");
		}finally {
			//보통 자원반납코드는 다 이쪽으로
			System.out.println("자원반납코드");
		}
		
		
		System.out.println("main end");
	}

}
