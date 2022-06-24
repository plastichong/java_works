package loopExample;

public class For1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i = 0; i <= 10; i++ ) {
			System.out.println(i);
			
		}*/
		int i;
		int sum ;
		
		for(i = 1, sum = 0; i <= 10; i++ ) {
			sum += i;
					System.out.println("sum : "+sum+", i : "+i);
		}
		
		
		
		
	}

}
