package day23;
//스트림은 FiFo이다 P683인가 685읽기
//데이타인풋스트림은 기본형으로 데이터를 핸들링함
import java.io.RandomAccessFile;

public class Test07 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("rand.dat", "rw");//rw는 리드와라이트가 다 되는 raf를 생성
		//상속구조를 보니 얼추 바이트 단위로 처리 
		String msg = "hello, RandomAccessFile...";
		String result =null;
		
		raf.writeBytes(msg);
		raf.seek(0);//기록하면서 커서가 기록 작업을 하는곳에 머무르는데 그녀석을 앞으로 땡겨오겠다.
		
		while(true){
			result=raf.readLine();
			if(result==null)break;
			System.out.println(result);
		}
		System.out.println("--------------------------------------------------");
		raf.seek(raf.length());//제일 뒤로
		msg="\n hi ... java test ...io test........";
	
		raf.writeBytes(msg);
		raf.seek(6);
		while(true){
			result=raf.readLine();
			if(result==null)break;
			System.out.println(result);
		}
	}
}
