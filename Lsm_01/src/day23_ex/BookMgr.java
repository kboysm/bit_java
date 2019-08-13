package day23_ex;

import java.io.FileNotFoundException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;

public class BookMgr {
	//Book[] 관리 
	List<Book> list = null;
	String fileName;
	T1 autosave;
	BookMgr(){
		this("book.dat");
	}
	BookMgr(String fileName){
		autosave=new T1();
		autosave.start();
		this.fileName = fileName;
		list = (List<Book>) MyFile.load(fileName);
		if(list == null) {
			list = new ArrayList<Book>();
		}
	}
	
	//CURD
	
	public void add(Book data) {
		list.add(data);
	}
	
	public List<Book> getBookList() {
		return list;
	}
	
	
	public void save() {
		MyFile.save(fileName, list);
	}
	class T1 extends Thread{//홀수 합 계산
		@Override
		public void run() {
			while(true){
				save();
			try {
				Thread.sleep(1000*60*30);//1초*60=>1분*30=>30분
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
		}}
	}
}














