package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		FileInputStream fis = null;
		try {//파일의 경로를 지정해 주지 않으면 프로젝트 폴더를 뒤지고(이클립스) ,dos창은 bin폴더를 뒤짐
			//그래서 절대경로를 정해주는게 가장좋음 ex c://lib//sample.txt
			fis = new FileInputStream("c://lib//sample.txt");
			System.out.println("파일 준비 완료~~");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해 주세요");
		}finally {
			try {
				if(fis!=null)
				{
				fis.close();
				fis=null;
				}
				System.out.println("자원 반납");
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		System.out.println("main end");
	}

}
