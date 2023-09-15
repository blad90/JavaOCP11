import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTestConv {
	public static void main(String...args){
		Consumer<String> c1 = x -> System.out.print("1: " + x);
		Consumer<String> c2 = x -> System.out.print(",2: " + x);
		
		Consumer<String> combined = c1.andThen(c2);
		combined.accept("Annie");
		
		System.out.println();
		// Example using Function interface
		Function<Integer, Integer> before = x -> x + 1;
		Function<Integer, Integer> after = x -> x * 2;
		
		Function<Integer, Integer> combined2 = after.compose(before);
		System.out.println(combined2.apply(3));
	}
}