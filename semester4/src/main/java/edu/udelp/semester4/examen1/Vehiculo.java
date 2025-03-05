package edu.udelp.semester4.examen1;

import lombok.Data;

@Data
public class Vehiculo {
   
    private String marca;
    private String modelo;
    private int año;
   
    
    public Vehiculo(String marca, String modelo, int año) {
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.año=año;
	}


	public void mostrarDetalles() {
    	System.out.println(marca);
    	System.out.println(modelo);
    	System.out.println(año);
    	
    }
    
}
