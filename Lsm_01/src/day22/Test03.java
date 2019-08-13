package day22;
//Test02의 내용에 버퍼를 추가하여 작동시킨 예제 ,속도가 압도적으로 빠르다.
//단점으로는 읽어오는 파일이 너무 큰 파일이면 app가 죽어버린다.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//읽을때는 파일인풋스트림 ,저장할때는 파일아웃풋스트림
public class Test03 { //파일 복사 예제
	public static void main(String[] args) {
		String src="c://lib//Ben.mp3"; //파일 원본의 경로
		FileInputStream fis =null;
		FileOutputStream fos =null;
		System.out.println(" 파일 복사 시작");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy3.mp3" ,false);//이름은 내맘이지만 확장자는 같아야함 
			//fos 괄호 뒤에 true를 추가 -> 원본이 유지가 된다는 의미 즉 원본에 추가를 한다는 의미 
			// 괄호 뒤에 false로 바꾸면 -> 원본을 밀어버리고 오버라이트 시킴 
			int read=0;
			int count = 0; //파일을 복사한 횟수(바이트단위로)
			
			byte[] buffer = new byte[fis.available()];//fis.av~는 파일인풋스트림의 싸이즈를 의미한다.
			
			while((read=fis.read(buffer)) != -1)
			{
				fos.write(buffer);
				count++;
			}
			System.out.println("I/O횟수 : "+count);
			System.out.println(" 파일 복사 완료");
		} catch (FileNotFoundException e) {
			
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
