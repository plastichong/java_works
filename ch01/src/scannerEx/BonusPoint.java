package scannerEx;
import java.util.*;

public class BonusPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//보너스 포인트 == 가격*적립율
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객의 이름을 입력하세요 : ");
		String name = sc.nextLine();
//		System.out.println("");
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		int bonusPoint = 0;
		double bonusRatio = 0.05;
		
		bonusPoint = (int)(price * bonusRatio);
//		System.out.println(name+"님의 bonusPoint 는 "+bonusPoint+"point 입니다");
		System.out.printf("%s님의 bonusPoint 는 %,dpoint 입니다",name,bonusPoint);
		
		sc.close();
	}

}
