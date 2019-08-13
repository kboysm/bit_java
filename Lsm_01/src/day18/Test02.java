package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		Student [] s = new Student[10];
		
		List<Student> list = new ArrayList<Student>(); //내부에 스튜던트 객체를 만들어서 관리 
		list.add(new Student("ddd",88,99));
		list.add(new Student("zdd",78,39));
		list.add(new Student("fdd",68,49));
		list.add(new Student("홍길동",90,90));
		
//		System.out.println(list);
		
		Iterator<Student> lsm = list.iterator();//리스트.이터레이터 , 이터레이터는 해즈넥스트 , 넥스트 ,리무브 밖에없다.
		while(lsm.hasNext()) {
			Student data = lsm.next();
			if(data.getName().equals("홍길동"))
			{data.setKo(100);
			data.setMath(100);
			data.setAvg();
			System.out.println(data + " 수정");
			}
			
			System.out.println(data);
		}
		
//		홍길동을 다시 바꿈
//		lsm = list.iterator();
//		while (lsm.hasNext()) {
//			Student data = lsm.next();
//			
//			data.name="홍길동";
//			data.ko=100;
//			data.math=100;
//		} 전 데이타가 홍길동 100 100으로 당연히 바뀐다 
//		
		lsm = list.iterator(); //다시 해주는 이유는 위쪽에서 next를 계속해주어 내부적으로 커서같은것이 다음을 가르킬 데이터가 없어서
		//재설정을 해준다는 의미이다.
		System.out.println("학생 목록");
		while(lsm.hasNext()) {
			Student data = lsm.next();
			System.out.println(data);
		}
		
		System.out.println(list.contains(new Student("ddd",88,99)));
		//내부적으로 이퀄즈 메소드가 없어서 비교를 못해서 false가 나온다. 스튜던트 클래스에서 이퀄즈 함수를 추가(오버라이딩)해주면 true가 나옴
		//CURD(등록,업데이트,서치,딜리트)작업 
		// 홍길동 90 90 등록
		Student s1 = new Student("lsm",9,9);
		boolean flag = list.add(s1);
		
		if(flag) System.out.println(s1 + "등록");
		else System.out.println(s1 + "노 등록");
		
		lsm = list.iterator();
		while(lsm.hasNext()) {
			Student data = lsm.next();
			
			if(data.equals(s1)) {
				lsm.remove();
				System.out.println(s1 + "삭제");
			}
			System.out.println(data);
		}
		Collections.sort(list);//내부적으로 컴페어투가 있어야 하나씩 비교하면서 솔트를 한다.  implements comparable이 필요하고
		//관련 메소드를 오버라이딩 한다.
		System.out.println(list);
	}
}

class Student implements Comparable<Student>{//implements Comparable<Student> 가 없으면 sort능력이 없다 array.sort도 안댐
	//implements Comparable<Student>는 비교할때 꼭 필요한 녀석 
	String name;
	int ko;
	int math;
	double avg;

	public Student() {
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
		setAvg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (ko + math) / 2.;// 더블형이 붙어있어서 . 붙여줌
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
	}

	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
		//스트링끼리 비교해서 오름차순 내림차순 정렬을 해줌
		//0보다 크면 오름차순 0보다 작으면 내림차순 조건의 옵션이
	}
	
}