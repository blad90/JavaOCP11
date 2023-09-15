import java.util.function.Predicate;

public class PredicateTestConv {
	public static void main(String...args){
		//Predicate<String> brownEggs = s -> s.contains("eggs") && s.contains("brown");
		//Predicate<String> otherEggs = s -> s.contains("eggs") && !s.contains("brown");
		
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());
		
		System.out.println(brownEggs.test("brown eggs"));
		System.out.println(otherEggs.test("eggsbrown"));
	}
}