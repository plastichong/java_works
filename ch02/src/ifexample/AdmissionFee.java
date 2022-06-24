package ifexample;
import java.util.*;
public class AdmissionFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요");
		int age = sc.nextInt();
		int fee;
		
		if(age < 8) {
			fee = 1000;
			System.out.println("취학 전 아동");
		}else if(age < 14) {
			fee = 2000;
			System.out.println("초등학생");
		}else if(age < 20) {
			fee = 2500;
			System.out.println("중.고등학생");
		}else {
			fee = 3000;
			System.out.println("성인입니다");
		}
		System.out.printf("입장료는 %d원 입니다",fee);
	}

}
