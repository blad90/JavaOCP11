import java.util.List;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;

public class ListMapCastTest {
    public static void main(String[] args) {
		List<String> list = List.of("coats");

		Set<String> set = new HashSet<>();
		set.add("coats");

		Map<String, Integer> counts = new HashMap<>();
		counts.put("coats", 2);
		counts.put("rain", 1);

		for (var x : counts.keySet()) {
		   String s = (String)x;
		   System.out.println(s);
		}
	}
}