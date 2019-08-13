package Java_Essen_4;

import java.util.Scanner;

class Player{
	private String name;
	Player(String name){
		this.name=name;
	}
	String getName() {
		return name;
	}
}

public class Java_4_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lsm = new Scanner(System.in);
		Player [] p = new Player[2];
		for(int i=0 ;i< p.length ;i++) {
			System.out.print("선수 이름 입력 >>");
			p[i]=new Player(lsm.next());
		}
		int n=0;
		while(true) {
			System.out.println(p[n].getName() + " 엔터를 제외한 아무키나 입력");
			lsm.next();
			int [] val = new int[3];
			for(int i=0 ; i<val.length ; i++) {
				val[i]=(int)(Math.random()*3);
				System.out.print(val[i]+ "\t");
			}
			System.out.println();
			
			if(val[0]==val[1]&&val[1]==val[2]) {
				System.out.println(p[n].getName() + "님의 승리");
				break;
			}
			n++;
			n=n%2;
		}
	}

}
