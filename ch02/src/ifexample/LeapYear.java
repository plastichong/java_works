package ifexample;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//윤년계산
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		System.out.println("년도를 입력하세요(종료 : 0)");
		
		int year = sc.nextInt();
			
		if(year!=0&&((year%4 == 0 && year%100 != 0) || year % 400 == 0)) {
			System.out.println("윤년입니다.");
		}else if(year != 0){
			System.out.println("윤년이 아닙니다");
		}if(year ==0) {
			System.out.println("종료");
			break;
		}
		
		}
		
	
	}

}
