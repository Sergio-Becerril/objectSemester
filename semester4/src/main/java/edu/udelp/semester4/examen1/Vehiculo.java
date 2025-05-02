package edu.udelp.semester4.examen1;

import lombok.Data;

@Data
public abstract class Vehiculo {
   
    private String marca;
    private String modelo;
    private int año;
   
//Examen   
//    public Vehiculo(String marca, String modelo, int año) {
//		super();
//		this.marca=marca;
//		this.modelo=modelo;
//		this.año=año;
//	}

    
	public abstract void mostrarDetalles(); 
    	//System.out.println(marca + modelo + año);    	
    


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}
	
	
    
}
