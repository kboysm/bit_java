package day25_backup;

import java.net.InetAddress;

public class Test01 {
	public static void main(String[] args) {
		InetAddress ip =null;
		try {
			ip = InetAddress.getLocalHost();
			ip = InetAddress.getByName("www.naver.com");//dns에 의해 컨버팅 후 ip주소를 얻어 접속
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("getHostName : "+ip.getHostName()); //dns
		System.out.println("getHostAddress : "+ip.getHostAddress());//ip address
		System.out.println("toString : "+ip.toString()); //dns /ip address를 toString
	}
}
