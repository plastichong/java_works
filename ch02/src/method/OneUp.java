package method;

public class OneUp {
	
	public static int oneUp(int x) {
		x += 1;
	return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		num = oneUp(num);
		System.out.println(num);
		num = oneUp(num);
		System.out.println(num);
		
	}

}
