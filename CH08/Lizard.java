class Reptile {
	{ System.out.print("A"); }
	public Reptile(int hatch) {}
	void layEggs() {
		System.out.println("Reptile");
	}
}
public class Lizard extends Reptile {
	static { System.out.print("B");}
	public Lizard(int hatch) {}
	public final void layEggs() {
		System.out.print("Lizard");
	}

	public static void main(String[] args) {
		Reptile reptile = new Lizard(1);
		reptile.layEggs();
	}
}
