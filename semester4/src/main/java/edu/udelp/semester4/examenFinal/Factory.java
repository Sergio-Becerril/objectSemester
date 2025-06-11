package edu.udelp.semester4.examenFinal;



public class Factory {

	public static Usuario createUser(String tipo) {
		if (tipo == null) {
			throw new IllegalArgumentException("Mebresia");
		}
		switch (tipo.toLowerCase()) {
		
			case "Estandar":
			case "Premium":
			
			default:
				throw new IllegalArgumentException(
						String.format("Tipo de paquete no soportado.", tipo));
			}
	}
}
