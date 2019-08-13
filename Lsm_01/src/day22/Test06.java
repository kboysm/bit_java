package day22;
//프로퍼티지? 뭔지 모르겠는데 팔스 인트안해줘도 되는녀석 map할때 햇다고 함 map구석구석 찾아보기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("파일 복사 .txt ");
		
		String src="c://lib//sample.txt";
		FileReader fr =null;
		FileWriter fw =null;
		
		BufferedReader br =null;
		BufferedWriter bw =null;
		
		try {
			fr =new FileReader(src); //try ,catch문으로 안하면 에러발생
			fw = new FileWriter("c://lib//copy.txt");
			br = new BufferedReader(fr);
			bw= new BufferedWriter(fw);
			String read=null;
			while((read=br.readLine())!=null) {
				bw.write(read+"\r\n");//\r\n ->이녀석은 키보드의 enter와 같다 
			}
			bw.write("sample.txt 파일을 복사한 내용입니다.\r\n");//내가 추가적으로 라이트 작업을 추가함 
			bw.flush(); //버퍼를 쓰면 거의 무조건 플러쉬명령이 있어야한다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr !=null) {
				fr.close();
				fr=null;
				}
				if(fw !=null) {
				fw.close();
				fw=null;}
				if(br !=null) {
				br.close();
				br=null;}
				if(bw !=null) {
				bw.close();
				bw=null;}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
