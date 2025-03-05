package edu.udelp.semester4.examen1;
import lombok.Data;

@Data
public class Automovil extends Vehiculo {

	private int numeroPuertas;
	
	public Automovil(String marca, String modelo, int año, int numeroPuertas) {
		super(marca, modelo, año);
		this.numeroPuertas=numeroPuertas;
	}

	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
    	System.out.println(numeroPuertas);
    	
    }
}
