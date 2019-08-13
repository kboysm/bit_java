package day23;
//시스템쩜인은 인풋스트림이다 인풋스트림리더로 시스템인을 컴퍼팅해서 버퍼링작업 후 한줄씩 읽어주는 작업을 하는 예제 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
	public static void main(String[] args) {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		//생성자에 인풋스트림 타입이 들어가는데 System.in이 리턴타입이 인풋스트림이기 때문에 가능하다. 
		BufferedReader br =new BufferedReader(ir);
		
		String read=null;
		try {
		while((read =br.readLine())!=null) {
			System.out.println("keyboard input data => "+read);
		}
		}catch(Exception e) {
			
		}finally {
			try {
				if(br != null) br.close();
				if(ir != null) ir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
