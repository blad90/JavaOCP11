import java.util.function.BiFunction;

public class BiFunctionTest {
	static public void main(String... args){
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		String s1 = b1.apply("One","Two");
		String s2 = b1.apply("Three","Four");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}