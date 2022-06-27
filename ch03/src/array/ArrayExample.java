package array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] korScore = new int[3];
//		korScore[0] = 70;
//		korScore[1] = 80;
//		korScore[2] = 90;
		
//		korScore = {70, 80, 90};
	
//		int[] korScore = new int[] {70,80,90};
		int korScore[] = {70,80,90};
		System.out.println(korScore.length+"개");
		
		System.out.println(korScore[1]);
		
		korScore[2] = 95;
		System.out.println(korScore);
		
		for(int i = 0;i<korScore.length;i++) {
			System.out.print(korScore[i]+" ");
		}
	}

}
