public class Operators {
	
	public static void main(String[] args){
		Persona p1 = new Persona();
		p1.Persona("S");
	}
	
	static class Persona {
		public void var() {
			var var = "var";
		}
		
		public void Persona() {
			Persona var = new Persona();
		}
		
		public void Persona(String n) {
			Persona var = new Persona();
			System.out.println(n);
		}
	}
}