import java.util.*;

public class Persona {
	private String nombre;
	private int edad;
	
	//public Persona(){
	//	this.nombre = "Juan Perez";
	//	this.edad = 25;
	//}
	
	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	public Persona(String nombre, int edad) {
		this(nombre);
		this.edad = edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String n){
		nombre = n;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	@Override
	public String toString(){
		return nombre + " " + edad;
	}
}