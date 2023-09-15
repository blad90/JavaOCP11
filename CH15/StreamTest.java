import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Comparator;


public class StreamTest {
	public static void main(String[] args){
		
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		
		var list = List.of("a", "b", "c");
		Stream<String> fromList = list.stream();
		
		//System.out.println(fromList);
		
		//
		Predicate<Integer> p = n -> n < 100;
		UnaryOperator<Integer> u = n -> n + 2;
		
		Stream<Integer> oddNumberUnder100 = Stream.iterate(
			7, // initial value
			p, // predicate
			u // unaryOperator
			
		);
		
		//oddNumberUnder100.forEach(n -> System.out.print(n + " "));
		
		List<String> lista = new ArrayList<String>();
		lista.add("Buenos ");
		lista.add("juideros");
		lista.add("diadder");
		lista.add("y pico");
		
		Predicate<String> r = value -> lista.indexOf(value) % 2 == 0;
		Stream<String> s = lista.stream().filter(r);
		//s.forEach(z -> System.out.println(z));
		
		
		// min() and max()
		Stream<String> animals = Stream.of("Gorilla","Ape","Monkey", "Snake");
		Optional<String> min = animals.min((a,b) -> a.length() - b.length());
		
		//System.out.println(min);
		
		// reduce()
		
		// traditional approach
		var array = new String[] {"w","o","l","f"};
		var result = "";
		//for(var e: array) result += e;
		//System.out.println(result);
		
		// using streams
		Stream<String> st = Stream.of("w","o","l","f");
		String word = st.reduce("", (f,g) -> f + g);
		//System.out.println(word);
		
		//other scenarios
		BinaryOperator<Integer> op = (a,b) -> a * b;
		Stream<Integer> empty2 = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3,5,6);
		
		//empty2.reduce(op).ifPresent(System.out::println);
		//oneElement.reduce(op).ifPresent(System.out::println);
		//threeElements.reduce(op).ifPresent(System.out::println);
		
		//
		Stream<String> stream2 = Stream.of("w","o","l","f!");
		int length = stream2.reduce(0, (i, w) -> i + w.length(), (a,b) -> a + b);
		//System.out.println(length);
		
		// collect()
		Stream<String> xtream = Stream.of("w","o","l","f");
		
		StringBuilder word2 = xtream.collect(
			StringBuilder::new,
			StringBuilder::append,
			StringBuilder::append
		);
		//System.out.println(word2);
		
		Stream<String> ztream = Stream.of("w","o","l","f");
		TreeSet<String> set = ztream.collect(
			TreeSet::new,
			TreeSet::add,
			TreeSet::addAll
		);
		System.out.println(set);
		
		//alternative
		Stream<String> ytream = Stream.of("w","o","l","f");
		TreeSet<String> set2 = ytream.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);
		
		// filter
		Stream<String> anms = Stream.of("monkey","gorilla","bonobo");
		anms.filter(f -> f.startsWith("g")).forEach(System.out::println);
		
		// distinct
		Stream<String> h = Stream.of("duck","duck","snake","lion","snake","zebra");
		h.distinct().forEach(System.out::println);
		
		// limit and skip
		Stream<Integer> ls = Stream.iterate(1, n -> n + 1);
		ls.skip(5)
			.limit(2)
			.forEach(System.out::print);	
		
		System.out.println();
		// map
		Stream<String> sm = Stream.of("mo", "gorilla","horse");
		sm.map(String::length)
			.forEach(System.out::print);
			
		System.out.println();
		// flat-map	
		List<String> zero = List.of();
		var one = List.of("Monkey");
		var two = List.of("Jez Gorilla", "Baby Gorilla");
		Stream<List<String>> anms2 = Stream.of(zero, one, two);
		
		anms2.flatMap(m -> m.stream())
			.forEach(System.out::println);
			
		// sorted
		Stream<String> b = Stream.of("brown-","bear-");
		b.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
			
		// peek
		var str = Stream.of("black bear","brown bear","grizzly");
		long count = str.filter(ss -> ss.startsWith("b"))
			.peek(System.out::println).count();
		System.out.println(count);
	}
}