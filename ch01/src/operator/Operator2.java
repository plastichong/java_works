package operator;

public class Operator2 {

	public static void main(String[] args) {

		int num = 10;
		int val = 0;
		
//		num++;
		val = ++num;
		
		System.out.println(val);
		System.out.println(num);
		
		System.out.println("============");
		
		val = num--;
		System.out.println(val);
		System.out.println(num);
		
		//산술 연산자 -총점과 평균
		
		int mathScore = 90;
		int engScore = 75;
		int total = mathScore+engScore;
		double avg = total/2.0;

		System.out.println("============================");
		System.out.println("총점 : "+total);
		
		System.out.println("평균 : "+avg);
		System.out.println();
		
		
		
	}

}
