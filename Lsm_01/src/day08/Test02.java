package day08;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s= {
				new Student("길동",2019004,-99,95,89),
				new Student("일동",2019003,87,99,97),
				new Student("이동",2019002,90,94,94),
				new Student("삼동",2019001,87,99,86),
				new Student("사동",2019000,90,100,83)
		};
		
		for(Student a : s) {
			if(a.getGrade()=='A')
			a.print();
		}
	}

}
class Student{
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;
	
	public Student(String name,int number,int kor,int eng,int math) {
//		this.name=name;
//		this.number=number;
//		this.kor=kor;
//		this.eng=eng;
//		this.math=math;
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		
	}
	public Student(String data) {
		
	}
	
	public char getGrade() {
		this.setGradeProcess();
		return grade;
	}

	private void setGradeProcess() {//이 메소드는 내부에서만 사용하겠다.라는 의미로 private를 사용
		double avg=(kor+eng+math)/3.;
		this.grade = avg>=90 ? 'A':(avg>=80? 'b' : (avg>=70 ?'c' :(avg>=60 ? 'D':'F')));
	}

	private boolean check(int a) {
		boolean ch=true;
		if(!(a>=0&&a<=100)) {
			
			ch=false;
			System.out.println(a+"->0~100의 점수가 아닙니다.");
		}
		return ch;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		boolean aa=check(kor);
		if(aa==true)
		this.kor = kor;
		if(aa=false)
			return;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		boolean aa=check(eng);
		if(aa==true)
		this.eng = eng;
		if(aa=false)
			return;
		
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		boolean aa=check(math);
		if(aa==true)
		this.math = math;
		if(aa=false)
			return;
	}

	public void print() {
		System.out.printf("이름 :%s ,평균:%.2f,등급:%s %n ",name,(kor+eng+math)/3.,this.getGrade());
	}
}