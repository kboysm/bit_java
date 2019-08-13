package day11;
import day10.Person;
import day10.Employee;
import day10.Student;
import day10.Teacher;
public class Prob10 {
	public static void main(String []args) {
		Person[]s= {new Student("홍길동",20,2019001),
				new Teacher("이순신",30,"자바"),
				new Employee("유관순",40,"교무과")
				
		};
		for( Person data : s) {
			data.print();
		}
		
	}
}
