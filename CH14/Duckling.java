public class Duckling {
	public static void makeSound(String sound){
		//LearnToSpeak learner = s -> System.out.println(s); // LAMBDA
		LearnToSpeak learner = System.out::println; // Method Reference
		DuckHelper.teacher(sound, learner);
	}
	
	public static void main(String[] args){
		makeSound("Roarrrr");
	}
}