package Java_Essen_4;

public class Java_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone lsm1 = new Phone("백설공주","111-1111");
		Phone lsm2 = new Phone("태권브이","222-2222");
		System.out.println(lsm1.getName()+" "+lsm1.getTel());
		System.out.println(lsm2.getName()+" "+lsm2.getTel());
	}

}

class Phone{
	private String name,tel;

	public Phone() {
		super();
	}
	
	public Phone(String name, String tel) {
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
