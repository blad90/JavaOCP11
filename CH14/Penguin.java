import java.util.function.*;

public class Penguin {
	public static Integer countBabies(Penguin... cuties){
		System.out.println("ETC");
		return cuties.length;
	}
	
	public static Penguin createPenguin(){
		return new Penguin();
	}
	
	
	// Testing
	public static void main(String[] args){
		Penguin p1 = createPenguin();
		Penguin p2 = createPenguin();
		Penguin p3 = createPenguin();
		Penguin p4 = createPenguin();
		
		Supplier<Integer> methodRef1 = Penguin::countBabies;
		Supplier<Integer> lambda1 = () -> Penguin.countBabies(p1,p2,p3,p4);
		
		Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
		Function<Penguin, Integer> lambda2 = (x) -> Penguin.countBabies(p1,p2,p3,p4);
	
		BiFunction<Penguin, Penguin, Integer> methodRef3 = Penguin::countBabies;
		BiFunction<Penguin, Penguin, Integer> lambda3 = (x,y) -> Penguin.countBabies(p1,p2,p3);
		
		System.out.println(methodRef1.get());
	}
}