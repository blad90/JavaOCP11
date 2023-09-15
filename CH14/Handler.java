import java.util.*;
public class Handler {
	public static <T> void prepare(T t){
		System.out.println("Preparing " + t);
	}
	public static <T> Crate<T> ship(T t){
		System.out.println("Shipping " + t);
		
		List<? super String> nums = new ArrayList<CharSequence>();
		nums.add("56");
		
		return new Crate<T>();
	}
}

class More {
	public static <T> void sink(T t){}
	public static <T> T identity(T t) { return t; }
	//public static T noGood(T t) { return t;} // DO NOT COMPILES
}