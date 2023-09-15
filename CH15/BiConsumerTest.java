import java.util.function.BiConsumer;
import java.util.HashMap;

public class BiConsumerTest {
	public static void main(String...args){
		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println("Map 1: " + map);
		
		//
		var map2 = new HashMap<String, String>();
		BiConsumer<String, String> b3 = map2::put;
		BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);
		
		b3.accept("chicken", "Cluck");
		b3.accept("chick", "Tweep");
		
		System.out.println("Map 2: " + map2);
	}
}