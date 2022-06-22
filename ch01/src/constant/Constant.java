package constant;
import java.util.*;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final 키워드 사용
		
		final int month = 12;
		final int MAX_NUM = 100;
		final int MIN_NUM = 1;
		
		
//		month = 6;
		System.out.println(month);
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//원의 넓이 계산
		//area = radius * radius  *PI
		System.out.println("=======================");
		
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		double area = 0.0;
		final double PI = 3.14;
		
		//연산
		
		area = radius * radius * PI;
		
		System.out.println("원의 넓이는 "+area+"입니다");
		
		
	}

}
