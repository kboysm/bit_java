package day01;

class Sample_02 {
 public static void main(String[] args) {
	 for (int c=0 ; c<=10;c++)
	 {
		 for(int d =1 ; d<=10 ;d++) 
		 {
			if(c>=d)
				System.out.print("★");
		 }
		 
		 System.out.println("  ");
		 for(int d=10; d>=0;d--)
		 {
			 if(d>=c)
				 System.out.print("★");
		 }
		 System.out.println("  ");
	 }
 }
}
