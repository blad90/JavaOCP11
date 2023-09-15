import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args){
		Optional<Double> opt = average(4, 6);
		System.out.println(opt.get());
		
		String value = null;
		Optional o = (value == null) ? Optional.empty() : Optional.of(value);
		
		Optional o2 = Optional.ofNullable(value);
		System.out.println(o2);
		
		Optional<Double> opt2 = average(90, 100);
		opt2.ifPresent(System.out::println);
		
		// Dealing with an Empty Optional
		Optional<Double> opt3 = average();
		System.out.println(opt3.orElse(Double.NaN));
		System.out.println(opt3.orElseGet(() -> Math.random()));
		//System.out.println(opt3.orElseThrow());
		System.out.println(opt3.orElseThrow(
						() -> new IllegalStateException()
						  ));
	}
	
	public static Optional<Double> average(int...scores){
		if(scores.length == 0) return Optional.empty();
		int sum = 0;
		for(int score: scores) sum += score;
		return Optional.of((double) sum / scores.length);
	}
}