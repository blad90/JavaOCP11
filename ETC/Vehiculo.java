public class Vehiculo {
	public Vehiculo(int speed){
		System.out.println("Acelerando a " + speed);
	}
	public static void main(String[] args) {
		System.out.println(new BMW());
	}
}

class BMW extends Vehiculo {
	String nombre;
	public BMW() {
		super(9);
		nombre = "Vehiculo BMW";
	}

	@Override
	public String toString(){
		return "Una instancia de " + nombre;
	}
}
