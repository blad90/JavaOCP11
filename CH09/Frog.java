interface CanHop {}
public class Frog implements CanHop {
	public static void main(String[] args) {
		Object frog = new TurtleFrog();
		System.out.println(frog);
	}
}
class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}
