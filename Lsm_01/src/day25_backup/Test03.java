package day25_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

//URL : 인터넷에서 접근 가능한 자원의 주소를  표현할 수 있는 형식
//www.naver.com/index.html ->url주소
//저장하는 파일의 확장자를 잘 고민해서 쓰기 
//tcp는 전화 udp는 메일 로 이해하기 많은양의 데이터를 주고받을때는 udp가 적합
//tcp 양쪽연결 서버와클라이언트 
public class Test03 {
	public static void main(String[] args) {
		URL url=null;
		String address ="https://www.naver.com/index.html";
		String lsm ="lsm.html";
		String line =null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		FileWriter fo=null;
		try {
			url=new URL(address);
			br=new BufferedReader(new InputStreamReader(url.openStream()));
			fo = new FileWriter(lsm);
			bw= new BufferedWriter(fo);
			
			while((line=br.readLine())!=null) {
			bw.write(line+"\n");	
				System.out.println(line);
			}
			bw.flush(); //이 예제에서는 플러쉬를 안해줘도 됨 
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(br !=null) br.close();
				if(bw !=null)bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
