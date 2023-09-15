import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args){
		
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = s -> s.isEmpty();
	}
}