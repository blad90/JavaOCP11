interface Planet {}
interface Moon {}
class Mars implements Planet {}
class Titan implements Moon {}
final class Unknown extends Titan {}
public class SolarSystem {
     public static void main(String... farm) {
        var m1 = new Mars();
        Titan t1 = new Titan();
		Unknown u1 = new Unknown();
		System.out.print(t1 instanceof Planet);
    }
}