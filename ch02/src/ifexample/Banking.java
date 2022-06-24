package ifexample;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String selectedNum ;
		boolean run =true;
		int balance = 0;
		int money;
		
		while(run) {
			
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.print("선택 > ");
			
			selectedNum = sc.next();
			switch(selectedNum) {
			
			case "1":
				while(true) {
				System.out.print("예금액 입력>");
				money = sc.nextInt();
				
					if(money < 0){
					System.out.println("음수를 입력할 수 없습니다.");
					}else{
					balance += money; 
					System.out.printf("%,d원 예금 정상 처리 되었습니다 \n",money);
					break;
					}
				}
					break;
				case "2":
				while(true) {
					
				System.out.print("출금액 입력>");
				money = sc.nextInt();
				if(balance < money) {
					System.out.println("잔액이 부족합니다");
					}else if(money < 0) {
					System.out.println("음수를 입력할 수 없습니다.");
					}else{
					balance -= money;
					System.out.printf("%,d원 출금 정상처리 되었습니다\n",money);
					break;
					}
				
				}
				break;
			case "3":
				System.out.printf("잔고 > %,d원\n",balance);
				break;
			case "4":
				System.out.println("종료합니다.");
				run=false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}
		sc.close();
	}

}
