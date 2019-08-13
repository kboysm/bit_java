package day04;

public class AM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double n[] = {1.1 ,2.2 ,3.3 ,3.5 ,3.1};
String nn[]= {"길동","둘리","또치","비둘기","도레미"};
double sum=0;

for(int j=0 ; j <n.length ;j++) {
	sum+=n[j];
}
double avg=sum/n.length;
for(int i =0 ; i<nn.length ; i++) {
	System.out.println(nn[i].charAt(0)+"**"+"점수 : "+n[i]+" "+( n[i]>=avg?"평균이상" :"평균이하"));
}

	}

}
