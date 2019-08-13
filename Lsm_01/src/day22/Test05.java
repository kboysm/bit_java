package day22;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//버퍼드인풋스트림에 관한 예제 자동으로 버퍼를 만들어 작업함 ,자바에서 지원해주는 버퍼링기법을 사용하는 예제
//텍스트 파일은 리더로 나머지는 인풋아웃풋스트림으로 리더를 사용하면 한글깨짐이 해결이 된다.
public class Test05 { //파일 복사 예제
	public static void main(String[] args) {
		String src="c://lib//Ben.mp3"; //파일 원본의 경로
		
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		
		System.out.println(" 파일 복사 시작");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy3.mp3" ,false);//이름은 내맘이지만 확장자는 같아야함 
			
			bis = new BufferedInputStream(fis); //fis의 src를 읽어 버퍼를 담당
			bos = new BufferedOutputStream(fos);
			//내부적으로 버퍼가 만들어지는데 읽은 데이터가 버퍼에 들어가고 꽉차면 자동으로 하드디스크에 파일을 기록함
			//항상 버퍼는 꽉차면 비워지게 설계됨. 맨 마지막에는 버퍼가 꽉차지 않기 때문에 파일에 그만큼 기록이 안되있음.
			//즉 버퍼를 비워줘야함 
			
			int read=0;
			int count = 0; //파일을 복사한 횟수(바이트단위로)
			
			while((read=bis.read())!=-1) {//실질적으로는 한바이트씩 읽는데 내부적으로 모아서 관리 일정량이 모이면 하드에기록 하는 방식 
				bos.write(read);
			}
			bos.flush(); //버퍼에 남은 데이터를 비워주는 녀석 이녀석을 해줘야 원본파일과 동일한 사이즈를 가짐 
			//즉 버퍼에 가득차진 않지만 어느정도 차있는 내용을 어서 옮겨 ! 라는 의미이다.
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
