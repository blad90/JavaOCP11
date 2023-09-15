import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String args[]){
		UnaryOperator<String> u1  = String::toUpperCase;
		UnaryOperator<String> u2  = s -> s.toUpperCase();
		UnaryOperator<Integer> u3 = n -> n * 4;

		System.out.println(u1.apply("bobby"));
		System.out.println(u2.apply("Ana"));
		System.out.println(u3.apply(3));
		
	}
}