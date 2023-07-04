public class Person {

	private String name;
	private int count;
	
	{ System.out.println("I am a block initializer"); }
	
	public Person(){
		System.out.println("From Person Constructor");
		name = "N/A";
	}
	
	static void run(){
		System.out.println("From Person static run method");
	}

	public static void main(String[] args) {
		Person p = new Person();
		Person.run();
	}
	
}