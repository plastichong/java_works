package loopExample;

public class While1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		/*while(i <= 10) {
			System.out.println(i);
			i++;
		}*/
		
		while(true) {
			System.out.println(i);
			i++;
			if(i > 10) {
				break;
			}
		}
	}

}
