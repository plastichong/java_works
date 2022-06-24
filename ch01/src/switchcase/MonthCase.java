package switchcase;
import java.util.*;
public class MonthCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요");
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7 : case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default :
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		System.out.println(month+"월은 "+day+"일까지 있습니다.");
	}

}
