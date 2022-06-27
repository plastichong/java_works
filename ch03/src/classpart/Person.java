package classpart;

public class Person {

	private String name;
	private float height;
	private float weight;
	
	// 기본 생성자
	public Person() {}

	// 매개변수가 있는 생성자 생성자 오버로딩
	public Person(String n,float h, float w) {
		this.name = n;
		this.height = h;
		this.weight = w;

	}
	public Person(String n) {
		this.name = n;
	}
	
	
	
	public void showInfo() {
		System.out.println("이름 : "+name+", 키 : "+height+", 몸무게 : "+weight);
	}
	
}
