package constant;
import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String name = sc.nextLine();
		System.out.println("hello! "+name);
	
		System.out.println("여친의 나이는 몇 살 입니까?");
		int age = sc.nextInt();
		System.out.println(name+"여친의 나이는 "+age+"살 입니다");
		sc.close();
		
		
	}

}
