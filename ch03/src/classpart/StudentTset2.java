package classpart;

public class StudentTset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student() - 생성자
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.studentId = 100;
		std1.studentName = "위수영";

		std2.studentId = 101;
		std2.studentName = "홍길동";
		
		std1.showInfo();
		std2.showInfo();
		
		System.out.println(std1);
		System.out.println(std2);
	}

}
