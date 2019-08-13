package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("c://lib//sample.txt");) {
		System.out.println("file 처리~~~");
		}catch(Exception e){}
		finally {
			
		}
		
		System.out.println("----------------------------------------");
		try(Scanner lsm = new Scanner(new File("c://lib//sample.txt"));)
		{while(lsm.hasNextLine()) {
			String [] data =lsm.nextLine().replace('_', '/').split("/");
			System.out.println(Arrays.toString(data));
		}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
