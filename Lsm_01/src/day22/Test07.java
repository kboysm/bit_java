package day22;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// dbinfo.txt로 부터 user pw 정보 추출하기 
//프로퍼티지의 특징 : map의 객체에서 키값 오브젝트 벨류 값 오브젝트였는데 프로퍼티지는 스트링 스트링이다.
public class Test07 {
	public static void main(String[] args) {
		
		String src="c://lib//dbinfo.txt";
		FileReader fr =null;
		BufferedReader br =null;

		String id=null;
		String pw=null;
		
		try {
			fr =new FileReader(src); 
			br = new BufferedReader(fr);
			String read=null;
			
			while((read=br.readLine())!=null) {
				String []data = read.split("=");
				if(data[0].equals("user"))
					id=data[1];
				if(data[0].equals("pw"))
					pw=data[1];
					
			}
			System.out.println("로그인 시도 "+id+" / "+pw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr !=null) {
				fr.close();
				fr=null;
				}
				if(br !=null) {
				br.close();
				br=null;}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
