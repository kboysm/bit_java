package GJ;
//서버에서 자원반납 코드는 절대 넣으면 안됀다. 만약 문제가 생겼을 경우에만 자원반납을 한다. 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MS2_te {
	public static void main(String[] args) {
		ServerSocket socket = null;
		T2 lsm =null;
		Socket socket0=null;
		List<BufferedWriter> client = new ArrayList<BufferedWriter>();
		try {
			socket = new ServerSocket(/*포트번호*/7777);
			System.out.println("서버 준비 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		while(true) {
			try {
				System.out.println("Client 요청을 기다립니다. listen상태");
				socket0=socket.accept(); //이게 클라이언트 요청이 들어올때까지 기다리는 명령 
				lsm = new T2(socket0,client);
				lsm.start();
				//socket0.close();
				//나한테 요청한 클라이언트의 정보를 소켓에 담아둠
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		
	}
}
class T2 extends Thread{//홀수 합 계산
	Socket socket;
	BufferedReader br=null;
	BufferedWriter bw=null;
	List<BufferedWriter> client = null;
	String name=null;
	String aa=null;
	T2(Socket socket,List<BufferedWriter> client){
		this.socket=socket;
		this.client=client;
	}
	
	
	
	@Override
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			client.add(bw);
			name=br.readLine();//첫번째 리드
//			System.out.println("hello~~"+name+"님 \n");
//			bw.write(name+"님 hi여"+"\n");
//			bw.flush();
			broadcast(name+"님이 입장했습니다.");
			aa=null;
			while((aa =br.readLine())!=null) {
				if(aa.equals("q"))
				{	broadcast(name+"님 퇴장~");
				continue;
				}
				broadcast(aa);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(br!=null)br.close();
				if(bw!=null) {
					client.remove(bw);
					bw.close();
				}
				if(socket !=null)socket.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		// TODO Auto-generated method stub
			
		}
private synchronized void broadcast(String msg) {//모든 녀석들이 공유하므로 싱크로나이즈드 처리해줘서 동시접속=동기화문제를 방지한다.
	client.forEach(i->{
		try {
			i.write(name+" : "+msg+"\n");
			i.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	});	
	}
	}
