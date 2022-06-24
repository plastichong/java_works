package method;

class Hello{
	public void sayHello() {
		System.out.println("hello");
	}
	public void sayHello(String name) {
		System.out.println("hello "+name);
	}
	
	
}

public class SayHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hi = new Hello();
		hi.sayHello();
		hi.sayHello("minsu");
	}
	
	
	
	
	
}
