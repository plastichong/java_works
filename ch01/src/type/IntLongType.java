package type;

public class IntLongType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 1234567890;	//int : -21억 ~ 21억 (43억 2의 32제곱)
//		int iNum2 = 12345678900;	에러!
		System.out.println(iNum);
		
		
		long lNum = 9223372036854775807L; //long : (2의 64제곱)
		System.out.println(lNum);
		
	}

}
