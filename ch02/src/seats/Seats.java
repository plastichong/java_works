package seats;
import java.util.*;
public class Seats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자리배치도 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입장객 수 입력 :");
		int num = sc.nextInt();
		
		System.out.println("좌석 열의 수 입력");
		int col = sc.nextInt();
		
		int row;
		if(num%col == 0) {
			row = num/col;
		}else {
			row = (num/col)+1;
		}
		
		for(int i=0;i<row;i++) {
			for(int j=1;j<=col; j++) {
				int seatNum = i*col+j;
				if(num < seatNum)
					break;
				System.out.print(seatNum+" ");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
