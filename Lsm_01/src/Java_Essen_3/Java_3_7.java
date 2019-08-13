package Java_Essen_3;

public class Java_3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0 ; i<10 ;i++) {
		for(int j=0 ; j<10 ; j++ ) {
			if(i==0&&j!=0&&j%3==0) {
				System.out.println(j+" 박수 한번");}
			else if(i%3!=0&&j!=0&&j%3==0) {
				System.out.println(i+""+j+"박수 한번");
			}
			else if(i!=0&&i%3==0&&j==0) {
				System.out.println(i+""+j+"박수 한번");
			}
			else if(i!=0&&j!=0&&i%3==0&&j%3!=0) {
				System.out.println(i+""+j+"박수 한번");
			}
			else if(i%3==0&&j%3==0&&j!=0) {
				System.out.println(i+""+j+"박수 두번");
			}
		}
				
		}
	}

}
