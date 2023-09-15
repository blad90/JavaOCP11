import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args){
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (st, prefix) -> st.startsWith(prefix);

		System.out.println(b1.test("juan","ju"));
		System.out.println(b1.test("jeff","ro"));
	}
}