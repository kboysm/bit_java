package day20;
//xml문서에서 키값벨류값이 한쌍을 이루는 것이 엔트리
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
//file을 기반으로 properties 사용하기
public class Test03 {
	public static void main(String[] args)  {
		Properties p =new Properties(); 
		try {
			p.load(new FileInputStream("c:\\lib\\dbinfo.txt")); //반드시 트라이 캐치로 아래 2개의 오류를 잡아야 사용가능 
			//프로퍼티에 파일을 등록하면 우리는 getproperty로 그것을 꺼내서 확인 후 사용한다 
			//반드시 구분자(키값과 벨류값)가 존재해야 한다 이 예제에서는 =이 구분자로 쓰임 지가 알아서 정하는 듯 
			//파일 io작업은 경로를 절대경로로 잡는것이 좋다 우리는 이 예제에서 상대경로를 썻다
			//c드라이브에 lib는 우리가 절대경로로 쓸 파일로 그곳에 복붙하고 경로를 변경
			//드라이브 이름부터 시작하는 것이 절대경로 없으면 상대경로이다 
			String url = p.getProperty("url");
			String driver = p.getProperty("driver");
			System.out.println(url +"     "+ driver);
			p.setProperty("jdkver","1.8");
			p.setProperty("oraclever","11g");
			p.setProperty("tomcatver","9");
			
			//xml로 저장
			p.storeToXML(new FileOutputStream("data.xml"), "DB info");
			//특정 파일로 저장할 때는 아웃스트림 메서드 불러올때는 인풋스트림메서드를 사용한다. 
		} catch (FileNotFoundException e) { //파일 네임이 잘못됐을때
			// TODO Auto-generated catch block
			System.out.println("dbinfo.txt 파일을 준비해 주세요..");
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}
}
