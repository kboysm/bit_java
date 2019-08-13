package GJ;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Ggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.html"));
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
