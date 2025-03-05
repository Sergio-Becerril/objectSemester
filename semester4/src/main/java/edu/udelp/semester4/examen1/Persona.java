package edu.udelp.semester4.examen1;
import lombok.Data;

@Data
public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre =nombre;
		this.edad = edad;
	}
	
	public void mostrarDetalles() {
    	System.out.println(nombre);
    	System.out.println(edad);
    	
    }
}
