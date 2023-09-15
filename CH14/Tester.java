class Crate<T> {
	private T contents;
	
	public T emptyCrate(){
		return contents;
	}
	
	public void packCrate(T contents){
		this.contents = contents;
	}
}

public class Tester {
	public static void main(String[] args){
		Crate<Integer> c = new Crate<>();
		c.packCrate(Integer.valueOf(51));

		
		System.out.println(c.emptyCrate());
	}
}