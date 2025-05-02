package edu.udelp.semester4.examen1;
import lombok.Data;

@Data
public class Motocicleta extends Vehiculo {

//Examen
//	private String tipo;
	
//	public Motocicleta(String marca, String modelo, int año, String tipo) {
//		super(marca, modelo, año);
//		this.tipo=tipo;
//	}

	@Override
	public void mostrarDetalles() {
		//super.mostrarDetalles();
    	//System.out.println(tipo);
		System.out.println("Automovil: "+this.getMarca()+"\n"+this.getAño()+"\n"+this.getModelo());
    }
}
