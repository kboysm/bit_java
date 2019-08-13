package day25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//URL : 인터넷에서 접근 가능한 자원의 주소를  표현할 수 있는 형식
//www.naver.com/index.html ->url주소
public class Test02 {
	public static void main(String[] args) {
		URL url=null;
		String address ="https://www.naver.com/index.html";
		String line =null;
		
		BufferedReader br=null;
		try {
			url=new URL(address);
			br=new BufferedReader(new InputStreamReader(url.openStream(/*<1>*/))); //<1>을하게되면 인풋스트림이 만들어짐 == System.in과 같다 address사이트와 연결한다
			//관호안에 바이트 단위를 인풋스트림리더로 캐릭터형으로 바꾸고 그것을 버퍼드리더에 담아서 한줄씩 읽는다
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(br !=null) br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
