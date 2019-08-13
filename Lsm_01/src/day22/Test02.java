package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//읽을때는 파일인풋스트림 ,저장할때는 파일아웃풋스트림
public class Test02 { //파일 복사 예제
	public static void main(String[] args) {
		String src="c://lib//Ben.mp3"; //파일 원본의 경로
		FileInputStream fis =null;
		FileOutputStream fos =null;
		System.out.println(" 파일 복사 시작");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy.mp3" ,true);//이름은 내맘이지만 확장자는 같아야함 
			//fos 괄호 뒤에 true를 추가 -> 원본이 유지가 된다는 의미 즉 원본에 추가를 한다는 의미 
			// 괄호 뒤에 false로 바꾸면 -> 원본을 밀어버리고 오버라이트 시킴 
			int read=0;
			int count = 0; //파일을 복사한 횟수(바이트단위로)
			
			while((read=fis.read()) != -1) //-1이 리턴되면 더 이상 읽을 값이 없다는 의미이므로 -1이 아니라면 즉 데이터가 있다면을 의미
			{//read는 그냥 자동으로 진행되게 설계되어 있다 나는 계속 초반만 반복되는걸 상상했는데 그렇게 안되게 내부적으로 설계가 돼 있다고 한다.
				fos.write(read);
				count++; //읽은 횟수를 의미하는 변수
			}
			System.out.println("I/O횟수 : "+count);
			System.out.println(" 파일 복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(src+"파일을 준비해 주셈");
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //자원 반납!
			try {
				if(fis != null)
				fis.close();
				if(fos != null)
				fos.close();
				fis=null;
				fos=null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
