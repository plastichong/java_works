package loopExample;
import java.util.*;
public class KeyRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요? (y/n) ");
			String key = sc.nextLine();
			if(key.equals("y") || key.equals("Y")) {
				System.out.println("계속 반복");
			}else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복 중단");
				break;
			}else {
				System.out.println("지원하지 않는 키입니다.");
			}
		}
		System.out.println("프로그램 종료");
	sc.close();
	}
}
