import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args){
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s -> s.length(); 
		
		System.out.println(f1.apply("Java 11"));
		System.out.println(f2.apply("OCP Java 11"));
	}
}