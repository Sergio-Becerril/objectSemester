package edu.udelp.semester4.examen1;

public class VehiculoFactory {
	
	public static Vehiculo create(TipoVehiculo tipo) {
		
		switch (tipo) {
		case AUTOMOVIL:
			return new Automovil();
		
		case MOTOCICLETA:
			return new Motocicleta();
			
		}
		
		return null;
	}
	
}
