package operator;

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5; //00000101
		int num2 = 10;//00001010
		
		int result;
		
		result = num1 & num2;
		System.out.println(result);
		result = num1 | num2;
		System.out.println(result);
		
		int val =10;
		System.out.println(val << 1);
		System.out.println(val >> 1);
		
		
		
		int n = 10;
		int bnum = 0b1010; //0b ==2진수 표기
		int hnum = 0xAA; //0x == 16진수 표기
		
		System.out.println(n);
		System.out.println(bnum);
		System.out.println(hnum);
		
	}

}
