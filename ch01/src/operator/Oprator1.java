package operator;

public class Oprator1 {

	public static void main(String[] args) {
		//대입 연산자
		int x = 10;
		int y = 5;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);

		String season = "summer";
		System.out.println(season);
		
		String[] seasons = {"spring", "summer", "fall", "winter"};
		System.out.println(seasons[0]);
		System.out.println(seasons[3]);
		System.out.println(" ");
		System.out.println("===================");
		System.out.println(" ");
		for(int i = 0; i< seasons.length; i++ ) {
			System.out.println(seasons[i]);
		
		}
	}

}
