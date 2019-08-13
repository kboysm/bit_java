package day14;
//메서드는 28번 한개인데 key의 값에 따라 전혀 다른 메서드들이 수행됨. ->다형성
import javax.swing.JOptionPane;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command cmd=new ListCommand();
		String Key = JOptionPane.showInputDialog("list/delete/insert/update 중 하나 입력");
		switch (Key) {
		case "list":
			cmd=new ListCommand();
			break;
		case "delete":
			cmd=new DeleteCommand();
			break;
		case "insert":
			cmd=new InsertCommand();
			break;
		case "update":
			cmd=new UpdateCommand();
			break;
		default:
			cmd=new ListCommand();
			break;
		}
		cmd.exec();
		cmd.check();
	}

}
