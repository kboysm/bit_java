package GJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpipClient {
	public static void main(String[] args) {//192.168.0.135 선생님 ip
		String serverIp="192.168.0.135";
				//"192.168.0.135";//나를 의미하는 아이피
		BufferedReader br=null;
		BufferedWriter bw=null;
		Socket socket=null;
		String name=null;
		Scanner lsm = new Scanner(System.in);
		try {
			System.out.println(serverIp+"연결 시도");
			socket =new Socket(/*서버아이피,포트넘버*/serverIp,7777);
			//연결정보를 소켓에 담아둠 어떤 서버와 연결이되었는지
			System.out.println("서버와 연결이 되었습니다.");
			socket.getInputStream();
			bw= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			new ClientThread(br).start(); //아래만든 스레드 시작 읽기전용
			System.out.println("이름을 입력하세요");
			name =lsm.nextLine();
			bw.write(name+"\n");//첫번째 라이트 위의 스트링객체를 생성하지 않고 bb자리에 바로 lsm.nextLine()을 넣어주셨다.
			bw.flush();
//			System.out.println(br.readLine()); 스레드가 할일
			
			
			while(true) {
			System.out.println("메세지를 입력");
			String aa=lsm.nextLine();
			bw.write(aa+"\n");
			bw.flush();
//			System.out.println(br.readLine()); 스레드가 할일
			if(aa.equals("q")) break;}
//			bw= new BufferedWriter(new FileWriter(serverIp));
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(br!=null) br.close();
				if(bw!=null)bw.close();
				if(socket!=null)socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
class ClientThread extends Thread{
	BufferedReader br=null;
	
	public ClientThread(BufferedReader br) {
		super();
		this.br = br;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String msg =null;
		try {
			while((msg=br.readLine())!=null) {
					System.out.println(msg);
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
