import java.util.*;

public class Estudiante extends Persona {
	private String matricula;
	private int cantidadAsignaturas;
	
	public Estudiante(String nombre, int edad, String matricula){
		super(nombre, edad);
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public int getAsignaturas(){
		return cantidadAsignaturas;
	}
	
	public void setAsignaturas(int asignaturas){
		this.cantidadAsignaturas = asignaturas;
	}
	
	public Byte imprimirNumero(byte n){
		return 2;
	}
	
	public Short imprimirNumero(short n){
		return 'J';
	}
	
	public Character imprimirNumero(char n){
		return (short) 99;
	}
	
	public Integer imprimirNumero(int n){
		return 1;
	}
	
	public Long imprimirNumero(long n){
		return 4L;
	}
	
	public Double imprimirNumero(double n){
		return 4.5;
	}
	
	@Override
	public String toString(){
		return "Estudiante: " + super.getNombre() + " " 
							  + super.getEdad() + " "
							  + this.getMatricula() + " "
							  + this.getAsignaturas();
	}
}