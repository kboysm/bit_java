package day22;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
// 07을 프로퍼티지로 만든 클래스
//프로퍼티지의 특징 : map의 객체에서 키값 오브젝트 벨류 값 오브젝트였는데 프로퍼티지는 스트링 스트링이다. 키값 벨류값이 중복이 안되고 둘다 스트링일 경우
//보통 환경설정 파일에서 사용하는 경우가 매우 많다 . 
public class Test08 {
	public static void main(String[] args) {
		
		String src="c://lib//dbinfo.txt";
		Properties prop = new Properties();
		FileReader fr =null;
		
		
		try {
			fr =new FileReader(src); 
			prop.load(fr); //Properties에 파일리더에서 읽어들인 src를  로드시킨다.
			String id=prop.getProperty("user");//prop에 읽어들인 모든 정보가 있기 때문에 user
			String pw=prop.getProperty("pw");
			System.out.println("로그인 시도 "+ id + " / "+ pw);
			//프로펄티지를 쓰면 엄청 간단해 진다 . 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}
}
//내일은 인풋스트림리더->바이트로 온 아이가 캐릭터형으로 변함 
//아웃풋 스트림 라이터는 그반대 그런것들을 내일 본다고 함 