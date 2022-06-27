package classpart;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 48;
		int num2 = 28;
		
		Calculator c = new Calculator();
		int addResult = c.add(num1, num2);
		System.out.println(addResult);
		int subResult = c.sub(num1, num2);
		System.out.println(subResult);
		
		System.out.println(c.mul(num1, num2));
		System.out.println(c.div(num1, num2));
	}

}
