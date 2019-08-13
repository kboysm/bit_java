package day23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Test05 {
	public static void main(String[] args) {
		String filename ="account.obj";
		FileOutputStream fos =null;
		ObjectOutputStream oos=null;
	
	try {
		fos = new FileOutputStream(filename);//()에 안에서 저장하겠다. 경로를 설정하지 않아 이클립스의 경우 프로젝트위치 ,cmd는 빈폴더
		oos = new ObjectOutputStream(fos);
	
		Set<Account> set = new HashSet<Account>();
		
		Account a = new Account("2019-001","홍길동",100,"1234");
		Account b = new Account("2019-002","박길동",200,"1211");
		set.add(a);
		set.add(b);
		set.add(b); // set은 중복을 허용하지 않기 때문에 똑같은것을 넣어도 알아서 걸러준다.
		set.add(new Account("2018-004","길용성",1000,"1111"));
		
		oos.writeObject(set);
		oos.flush(); //여기서 버퍼링 작업이 있다는걸 눈치채야함
		System.out.println("파일에 저장 완료");		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}finally {
		try {
			if(oos != null) oos.close();
			if(fos != null) fos.close();
		} catch (Exception e2) {
			e2.getMessage();
		}
	}
		
	}
}
class Account implements Serializable{//String class는 기본적으로 되어있지만 우리가 만들때는 시리얼라이즈를 임플리멘츠 해주지 않으면
	//우리가 생성한 객체는  스트림을 통과하지 못한다.
	String number;//통장 계좌번호
	String name; //통장 이름
	int money;//돈
	transient String pw;//통장 비번 , transient 는 스트림을 통과하지 못하게 하는 예약어,read하면 null이 나옴
	public Account(String number, String name, int money, String pw) {
		super();
		this.number = number;
		this.name = name;
		this.money = money;
		this.pw = pw;
	}
	public Account() {
		super();
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + ", pw=" + pw + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}
	
	
}
