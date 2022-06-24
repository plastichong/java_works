package switchcase;

public class Ranking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순위에 따른 매달 색상
		
		int rank = 2;
		String medalColor = "";
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println("매달 색상은"+medalColor+" 입니다.");
	}
}
