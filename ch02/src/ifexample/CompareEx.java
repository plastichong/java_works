package ifexample;
import java.util.*;


public class CompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교
		int max;

		Scanner sc = new Scanner(System.in);

		System.out.println("첫째수 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("첫째수 입력 : ");
		int n2 = sc.nextInt();
		
		
//		max = (n1 > n2)? n1:n2;
		
//		System.out.println(max);
	
		if(n1>n2) {
			max = n1;
		}else {
			max = n2;
		}
		
		System.out.println(n1+" 과 "+n2+"중 더 큰 수는 "+max+"입니다");
	}

}
