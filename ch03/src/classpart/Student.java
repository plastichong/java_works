package classpart;

public class Student {
	//필드 (맴버변수)
	
	// 기본(default) 생성자 - 만들지 않으면 자동으로 추가됨(생략 가능)
	// 클래스이름과 동일하게 생성
	Student(){ 
		
	}
	int studentId;
	String studentName;
	
	void showInfo() {
		System.out.println("학번 : "+studentId+", 이름 : "+studentName);
	}
	
}
