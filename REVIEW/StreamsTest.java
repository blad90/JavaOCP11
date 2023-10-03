import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamsTest{
	
	public static void main(String[] args){
		
		List<String> names = Arrays.asList(
			"Jeff",
			"Amanda",
			"Ronald",
			"Johnny",
			"Ana",
			"Bob",
			"Bernard",
			"Jadder"
		);
		
		List<String> fruits = Arrays.asList(
			"Apple",
			"Pineapple",
			"Strawberry",
			"Pear",
			"Grapes"
		);
		System.out.println("Original List: " + names);
		
		System.out.println();
		System.out.println("\nUsing filter (intermediate operation) and forEach (terminal operation):");
		names.stream()
			 .filter(s -> s.startsWith("J"))
			 .forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		System.out.println("\nUsing map (intermediate operation) and forEach (terminal operation):");
		names.stream()
			 .map(e -> e.toUpperCase())
			 .forEach(s -> System.out.print(s + " "));
			 
		System.out.println();
		System.out.println("\nUsing sorted (intermediate operation) and forEach (terminal operation):");
		names.stream()
			 .sorted()
			 .forEach(s -> System.out.print(s + " "));
			 
			 
		System.out.println();
		System.out.println("\nUsing flatMap, filter (intermediate operations) and forEach (terminal operation):");
		Stream<List<String>> stream1 = Stream.of(names, fruits);
		
		long total = stream1
			   .flatMap(m -> m.stream())
			   .filter(e -> e.contains("A"))
			   .count();
		System.out.println(total);
		
		System.out.println();
		System.out.println("\nUsing peek (intermediate operation) and forEach (terminal operation):");
		names.stream()
			 .peek(s -> System.out.println("PEEK: " + s ))
			 .map(m -> m.concat("*"))
			 .forEach(s -> System.out.println(s));
		
		System.out.println();
		System.out.println("\nUsing peek, flatMap, limit (intermediate operations):");
		List<Integer> x1 = Arrays.asList();
		List<Integer> x2 = Arrays.asList(1, 2, 3);
		List<Integer> x3 = Arrays.asList(4, 5, 6);

		Stream.of(x1, x2, x3)
			  .limit(2)
			  .peek(s -> System.out.println("PEEK 1: " + s)) // peek 1
			  .flatMap(x -> x.stream())
			  .peek(s -> System.out.println("PEEK 2: " + s)) // peek 2
			  .map(x -> x + 1)
			  .forEach(System.out::println);
	}
}