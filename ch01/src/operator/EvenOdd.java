package operator;
import java.util. *;

public class EvenOdd {

		String isEven() {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int in = sc.nextInt();
			String result = (in%2 == 0)? "짝수":"홀수";

			return result;
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd ev = new EvenOdd();
		System.out.println(ev.isEven());
//		ev.isEven();
	}

}