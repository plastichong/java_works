package classpart;

public class StudentTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.studentId = 100;
		std1.studentName = "홍길동";
		
		std2.studentId = 200;
		std2.studentName = "위수영";
		
		System.out.println("학번 : "+std1.studentId);
		System.out.println("이름 : "+std1.studentName);

		System.out.println("학번 : "+std2.studentId);
		System.out.println("이름 : "+std2.studentName);
	
		
	}

}
