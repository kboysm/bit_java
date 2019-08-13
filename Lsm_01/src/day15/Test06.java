package day15;
//람다식으로 05를 바꾼것, 추상메소드가 1개일때 람다식으로 표현가능
import javax.swing.JOptionPane;
public class Test06 {
	public static void main(String[] args) {
		String msg =JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert 5.quit");
		Command list=()->
				System.out.println(" ****list****"); //이게 람다식,추상메소드가1개일때만가능함 뭔 수행하는지 알고 있어서 가능
		list.exec();//람다로 쓰면 코드량이 확 준다 추상메서드를 제외하고 나머지는 몇개가 있던 상관 x 추상메서드만 1개이면 됨
		Command update = ()->{
			System.out.println("Update 수행");
		}; //람다의 가장 큰 특징 : 변수에 함수를 바인딩
		update.exec();
		Command delete = new Command() {
			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("Delete 수행");
			}	
		};
		delete.exec();
		Command insert = new Command() {//인어클래스 Test05안에
			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("Insert 수행");
			}	
		};
		insert.exec();
		switch (msg) {
		case "1":list.exec();
			break;
		case "2":update.exec();
			break;
		case "3":delete.exec();
			break;
		case "4":insert.exec();
		break;
		case "5":
			return;

		default:
			break;}
	}
}
