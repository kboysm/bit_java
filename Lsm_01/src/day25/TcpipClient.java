package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpipClient {
	public static void main(String[] args) {//192.168.0.135 선생님 ip
		String serverIp="127.0.0.1";
				//"192.168.0.135";//나를 의미하는 아이피
		BufferedReader br=null;
		BufferedWriter bw=null;
		Socket socket=null;
		Scanner lsm = new Scanner(System.in);
		try {
			System.out.println(serverIp+"연결 시도");
			socket =new Socket(/*서버아이피,포트넘버*/serverIp,7777);
			//연결정보를 소켓에 담아둠 어떤 서버와 연결이되었는지
			System.out.println("서버와 연결이 되었습니다.");
			socket.getInputStream();
			bw= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw.write(lsm.nextLine()+"\n");//첫번째 라이트
			bw.flush();
			System.out.println(br.readLine());
			while(true) {
			System.out.println("메세지를 입력");
			String aa=lsm.nextLine();
			bw.write(aa+"\n");
			bw.flush();
			System.out.println(br.readLine());
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
