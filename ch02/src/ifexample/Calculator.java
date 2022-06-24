package ifexample;

import java.util.Scanner;

public class Calculator {
	void calc(int num, String operator,int num2) {
		
	num = 10;
	num2 = 2;
	operator = "";
	int result = 0;
	
	switch(operator) {
	case "+": 
		result = num+num2;
		break;
	
	case "-":
		result = num-num2;
		break;
	case "/":
		result = num/num2;
		break;
	case "*":
		result = num*num2;
		break;
		
	default:
		System.out.println("연산자 오류입니다");
		break;
	}
	System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1입력");
		int num = sc.nextInt();
		System.out.println("연산자 입력");
		String op = sc.nextLine();
		System.out.println("숫자 2 입력");
		int num2 = sc.nextInt();
		cal.calc(num, op, num2);
	}

}
