interface Apple {}
interface Orange {}
class Gala implements Apple {}
class Tangerine implements Orange {}
final class Citrus extends Tangerine {}
public class FruitStand {
	public static void main(String... farm) {
		Gala g = new Gala();
		Tangerine t = new Tangerine();
		Citrus c = new Citrus();
		System.out.println(t instanceof Gala);
		System.out.println(c instanceof Tangerine);
		System.out.println(g instanceof Apple);
		System.out.println(t instanceof Apple);
		System.out.println(c instanceof Apple);
	}
}
