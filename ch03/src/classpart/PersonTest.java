package classpart;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person("위수영");
		Person p3 = new Person("임준영",174.5f,110.5f);
		
		//멤버변수는 직접 접근x get,set 메소드로 간접접근 
		
//		p1.name = "홍길동";
//		p1.height = 158.8f;
//		p1.weight = 55.5f;
	
		

//		p2.height = 160.0f;
//		p2.weight = 99.0f;

		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}

}
