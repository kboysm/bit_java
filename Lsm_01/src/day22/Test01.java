package day22;

import java.io.File;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		File dir = new File("c:\\");
		String[] list = dir.list();
		
		File file = null;
		Date date =null;
		for(String data : list) {
			file = new File(dir,data);// dir은 c드라이브를 의미, 이녀석을 가지고 다시 파일객체를 만들어봄
			//dir의 안에있는 data라는녀석을 기반으로 파일을 만들겠다는 의미이다. 즉 파일의 경로를 의미하는것 같다.
			System.out.print(file.getName()+"\t");
			System.out.print(file.length()+"\t");
			date = new Date(file.lastModified());//마지막 수정시간 
			System.out.print(date+"\t");
			
			if(file.isDirectory()) System.out.println("<dir>");
			System.out.println();
		}
		
	}
}
 //인풋스트림 데이터 처리단위가 byte ->한글이 깨지는 문제가 생김 -> 데이터를 char단위로 처리해서 문제를 해결(rearder)//
// ex ) 파일 인풋스트림 : 바이트단위                    파일 리더 스트림 : 캐릭터형   다 똑같음
//파일인풋스트림 : 특정파일에서 읽어오겠다
//오브젝트인풋스트림 : 객체를 읽을때
//버퍼드인풋스트림 : 버퍼에서 읽겠다. IO에서 버퍼는 굉장히 중요 버퍼를 사용안하고 IO사용 불가 , 성능향상을 위해서 
//필터인풋스트림 : 데이터를 읽는데 있어서 필터를 하면서 읽겠다 데이터를 가공할 수 있음 
//데이터 인풋 스트림 : 기본적인 데이터 타입에 BYTE를 맞춰서 읽겠다 

 //아웃풋스트림 위에 리더가 있다면 아웃풋은 라이터가 있음 나머진 같음//
//위와 다 같고 인풋 아웃풋만 다름//

//2진 파일은 인풋아웃풋 텍스트는 리더라이터로 처리함//