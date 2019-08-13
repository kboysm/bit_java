package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Scanner lsm = null;
		try {
			lsm = new Scanner(new File("c://lib//sample.txt"));
			while(lsm.hasNextLine()) {
			String[] data =lsm.nextLine().split("/");
			System.out.println(Arrays.toString(data));
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾겠어.. 경로를 잘 입력해봐");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}finally {
			if(lsm!=null) {
			lsm.close();
			lsm=null;
			System.out.println("자원반납");
			}
		}
		
		
		System.out.println("main end");
	}

}
