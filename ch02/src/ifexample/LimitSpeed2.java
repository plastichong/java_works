package ifexample;

public class LimitSpeed2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제한속도 50km이상이면 "제한속도 위반 출력"
		int limitSpeed = 45;

		if(limitSpeed > 50) {
			System.out.println("제한속도 위반!! 과태료 10만원 부과 대상!!");

		}else {
			System.out.println("안전속도 준수 중!");
		}
		System.out.println("시속 "+limitSpeed+"km 입니다");

	}

}
