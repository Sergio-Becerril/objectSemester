package edu.udelp.semester4.examen1;
import lombok.Data;

@Data
public class Profesor extends Persona {

	private double salario;
	
	public Profesor(String nombre, int edad, double salario) {
		super(nombre, edad);
		this.salario=salario;
	}

	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
    	System.out.println(salario);
    	
    }
}
