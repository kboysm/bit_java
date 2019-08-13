package GJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test02 {
	public static void main(String[] args) {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(ir);
		
		String read=null;
		try {
			while((read=br.readLine())!=null) {
				System.out.println("keyboard input data : "+read);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
