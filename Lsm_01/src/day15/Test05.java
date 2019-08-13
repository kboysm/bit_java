package day15;

import javax.swing.JOptionPane;
//안드로이드에서는 이런 식으로 코딩을 많이 한다. anonymous의 예제
//이너 클래스가 4개 존재  이름이 없는 익명클래스로 생성댄다
public class Test05 {
	public static void main(String[] args) {
		String msg =JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert 5.quit");
		Command list=new Command() {//new Command사이에 클래스의 선언부가 생략되어 있음.
			public void exec() {
				System.out.println(" ****list****");
			};//이런식의 코딩은 가독성이 높다 , 메모리가 쪼오금~ 절약된다.
		};
		list.exec();
		Command update = new Command() {//인어클래스 Test05안에
		@Override
			public void exec() {
				// TODO Auto-generated method stub
			System.out.println("Update 수행");
			}	
		};
		update.exec();
		Command delete = new Command() {//인어클래스 Test05안에
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
