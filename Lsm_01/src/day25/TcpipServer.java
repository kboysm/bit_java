package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpipServer {
	public static void main(String[] args) {
		ServerSocket socket = null;
		BufferedReader br=null; //대신 printwriter를 더 많이 쓴다. 이걸 쓰면 println문에 \n을 안붙여도 된다. 
		BufferedWriter bw=null;
		String lsm ="lsm.txt";
		try {
			socket = new ServerSocket(/*포트번호*/7777);
			System.out.println("서버 준비 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		while(true) {
			try {
				System.out.println("Client 요청을 기다립니다. listen상태");
				Socket socket0=socket.accept(); //이게 클라이언트 요청이 들어올때까지 기다리는 명령 
				br=new BufferedReader(new InputStreamReader(socket0.getInputStream()));
				bw= new BufferedWriter(new OutputStreamWriter(socket0.getOutputStream()));
				String name=br.readLine();//첫번째 리드
				System.out.println("hello~~"+name+"님 \n");
				bw.write(name+"님 hi여"+"\n");
				bw.flush();
				String aa=null;
				while((aa =br.readLine())!=null) {
					bw.write(name+" : "+aa+"\n");
					bw.flush();
				}
				//나한테 요청한 클라이언트의 정보를 소켓에 담아둠
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(socket !=null) socket.close();
					if(br!=null)br.close();
					if(bw!=null)bw.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		
	}
}
