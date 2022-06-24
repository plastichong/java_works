package loopExample;

public class Sum1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		
		while(true) {
			sum += i;
			i++;
		if(i>10) {
				break;
			}
		}
		
		System.out.println(sum);
		
	}

}
