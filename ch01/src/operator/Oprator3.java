package operator;

public class Oprator3 {

	public static void main(String[] args) {
		
		System.out.println(7 < 4);
		
		System.out.println((7 > 4) || (7==4));
		
		int n = 10; 
		int i =2;
		boolean x = ((n=n+10) < 10) && ((i=i+2) < 10);
		System.out.println(x);
		System.out.println(n);
	}

}
