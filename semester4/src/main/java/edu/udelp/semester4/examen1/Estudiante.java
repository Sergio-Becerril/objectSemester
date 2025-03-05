package edu.udelp.semester4.examen1;
import lombok.Data;

@Data
public class Estudiante extends Persona {

	private double promedio;
	
	public Estudiante(String nombre, int edad, double promedio) {
		super(nombre, edad);
		this.promedio=promedio;
	}

	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
    	System.out.println(promedio);
    	
    }
}
