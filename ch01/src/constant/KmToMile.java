package constant;
import java.util.*;

public class KmToMile {

	public static void main(String[] args) {
		//KM to mile
		// mph == kph / RATE_KPH_MPH
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구속을 입력하세요(kph)");
		final double RATE_KPH_MPH = 1.609344;
		
		double kph = sc.nextDouble();
		double mph = 0.0;
		mph = kph/RATE_KPH_MPH;
		
		
		System.out.printf("공의 속도는 %.2f[MPH]입니다", mph);
		
		
	}

}
