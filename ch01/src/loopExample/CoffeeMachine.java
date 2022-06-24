package loopExample;
import java.util.*;

public class CoffeeMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int coffeeStock = 5;
		int coffeePrice = 500;
		int money;
		int change;
		
		
		
		while(true) {
			System.out.print("돈을 넣어주세요: ");
			money = sc.nextInt();
			if(money == coffeePrice) {
				System.out.println("커피가 나옵니다.");
				coffeeStock --;
				System.out.println("남은 커피의 양은"+coffeeStock+"개 입니다.");
			}else if(money > coffeePrice) {
				change = money-coffeePrice;
				System.out.println("거스름돈"+change+"원을 돌려주고 커피가 나옵니다.");
				coffeeStock --;
				System.out.println("남은 커피의 양은"+coffeeStock+"개 입니다.");
			}else if(money < coffeePrice) {
				System.out.println("돈을 돌려주고 커피는 나오지 않습니다.");
				System.out.println("남은 커피의 양은"+coffeeStock+"개 입니다.");

			}if(coffeeStock <= 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
	}

}
