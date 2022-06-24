package seats;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(row+"개의 줄이 필요합니다");
		sc.close();
	}

}
