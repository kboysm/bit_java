package GJ;
//서버에서 자원반납 코드는 절대 넣으면 안됀다. 만약 문제가 생겼을 경우에만 자원반납을 한다. 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MS {
	public static void main(String[] args) {
		ServerSocket socket = null;
		T1 lsm =null;
		Socket socket0=null;
		Map cname = new HashMap<String, Socket>();
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
				lsm = new T1(socket0,cname);
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
class T1 extends Thread{//홀수 합 계산
	Socket socket;
	BufferedReader br=null;
	BufferedWriter bw=null;
	Map cname = new HashMap<String, Socket>();
	T1(Socket socket,Map cname){
		this.socket=socket;
		this.cname = cname;
	}
	@Override
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String name=br.readLine();//첫번째 리드
			cname.put(name, socket);
			System.out.println("hello~~"+name+"님 \n");
			bw.write(name+"님 hi여"+"\n");
			bw.flush();
			String aa=null;
			while((aa =br.readLine())!=null) {
				
				bw.write(name+" : "+aa+"\n");
				bw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(socket !=null)socket.close();
				if(br!=null)br.close();
				if(bw!=null)bw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		// TODO Auto-generated method stub
			
		}
	}
