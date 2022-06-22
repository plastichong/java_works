package operator;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 1;
		int temp = 0;
		
		System.out.println("교환 전 : x = "+x+", y = "+y);
		
		System.out.println("=====================");
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("교환 후 : x = "+x+", y = "+y);
		
		
	}

}
