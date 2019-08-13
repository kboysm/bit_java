package Java_Essen_4;

import java.util.Scanner;


public class Java_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("인원수 : ");
		Scanner lsm = new Scanner(System.in);
		int aa = lsm.nextInt();
		Phone1 [] lsmb = new Phone1[aa];
		for(int i=0 ; i<lsmb.length;i++) {
			System.out.println("이름과 전화번호");
			String a1 = lsm.next();
			String a2 = lsm.next();
			Phone1 lsm1 = new Phone1(a1,a2);
			lsmb[i]=lsm1;
		}
		System.out.println("저장 완료");
		
		while(true) {
			System.out.println("검색할 이름");
			String a1 = lsm.next();
			if(a1.equals("exit")) 
				{System.out.println("종료합니다.");
				return;}
			for(int i=0 ; i<lsmb.length;i++) {
				if(a1.equals(lsmb[i].getName())) {
					System.out.println(lsmb[i].getName()+"의 번호는 "+lsmb[i].getTel()+" 입니다.");
				}
			}
		}
	}

}
class Phone1{
	String name;
	String tel;
	
	public Phone1() {
		super();
	}
	
	public Phone1(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}