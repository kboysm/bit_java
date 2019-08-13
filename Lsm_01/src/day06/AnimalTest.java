package day06;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lsm1 = new Animal();
		lsm1.setName("큰뿔소");
		lsm1.setAge(3);
		lsm1.setLive(true);
		Animal lsm2 = new Animal();
		lsm2.setName("큰뿔소");
		lsm2.setAge(3);
		Animal lsm3 = new Animal();
		lsm3.setName("뿔소");
		lsm3.setAge(4);
		lsm3.setLive(true);

		Animal lsm[] = { lsm1, lsm2, lsm3 };

		for (Animal aa : lsm) {
			System.out.println(aa.getName() + " " + aa.isLive());

		}

		for (int i = 0; i < lsm.length; i++) {
			if (lsm[i].getName().equals("큰뿔소")) {
				lsm[i].setName("펭퀸");
				System.out.printf("이름 : %3s , 생존 여부 : %3s",lsm[i].getName(),lsm[i].isLive());
				System.out.println();
			}
		}
	}
}
