package day22;
//Test02의 내용에 버퍼를 추가하여 작동시킨 예제 속도가 압도적으로 빠르다.
//단점으로는 읽어오는 파일이 너무 큰 파일이면 app가 죽어버린다.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//읽을때는 파일인풋스트림 ,저장할때는 파일아웃풋스트림
public class Test04 { //파일 복사 예제
	public static void main(String[] args) {
		String src="c://lib//Ben.mp3"; //파일 원본의 경로
		FileInputStream fis =null;
		FileOutputStream fos =null;
		System.out.println(" 파일 복사 시작");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy3.mp3" ,false);
			
			int read=0;
			int count = 0; 
			
			byte[] buffer = new byte[1024*1024]; //버퍼를 만들어서 돌리면 I/o횟수가 굉장히 줄어들어서 속도가 엄청나게 향상 
			//파일 사이즈가 조금 늘어나는데 이유는 buffer의 단위별로만 read,write를 할 수 있기 때문에 엉뚱한 내용이 드간다.
			while((read=fis.read(buffer)) != -1) 
			{
				System.out.println("read : "+ read);//3번째까지는 버퍼의내용을 가득담아서 복사하지만 4번째가 모질람
				fos.write(buffer,0,read);//0,read를 입력 -> 0에서 읽은 만큼만 복사한다는 옵션
				count++; 
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
