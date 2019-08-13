package day09;

import java.util.Arrays;
import java.util.StringTokenizer;
public class Test02_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg ="uuuuuuuuuuu/23000";
//		System.out.println(msg.substring(msg.indexOf("/")+1));//이녀석은 원하는 위치를 뽑기위해 +1
//		String d1 = msg.substring(0,msg.indexOf("/"));//이녀석은 원하는위치를 뽑기위해 그냥
//		System.out.println(d1);
//		
//		String url="http://127.0.0.1:8080/web1/list.do";
//		//url.substring(url.indexOf('/'))
//		System.out.println(url.indexOf('/'));
//		System.out.println(url.lastIndexOf('/'));
//		System.out.println(url.substring(url.lastIndexOf('/')));
//		
//		System.out.println(url.contains("web1"));
//		//간혹 쪼개지지 않는 특수문자가 있는데 그럼 replace해서 바꿔서 쪼개야 한다.
//		String data ="2019001_홍길동/90_70/100";
//		System.out.println(data);
//		System.out.println(data.replace('_', '/'));
//		data=data.replace('_', '/');
//		System.out.println(data); //이거 주의해야함 / 23~25 라인 주의  data=data.replace를 해주지 않는 이상 안바뀜
//		String[] sdata=data.split("/"); // 포인트는 배열에 담은 거 
//		System.out.println(Arrays.toString(sdata));
		String aa= " 홍길동 / 이순신/김유신 /박철";
		aa=aa.replace(' ', '/');
		System.out.println(aa);
		StringTokenizer st= new StringTokenizer(aa.trim(),"/");//스트링토큰나이저는 ""안에 구분자를 몰아 넣으면 알아서 다 쪼개준다. 편하다!
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.print(st.nextToken()+" , ");
		}
		
	}

}
