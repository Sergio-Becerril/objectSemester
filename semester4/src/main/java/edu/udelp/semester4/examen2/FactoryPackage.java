package edu.udelp.semester4.examen2;

public class FactoryPackage {

	public static Package createPackage(String tipo) {
		if (tipo == null) {
			throw new IllegalArgumentException("Tipo de paquete no puede ser nulo");
		}
		switch (tipo.toLowerCase()) {
		
			case "small":
				return new SmallPackage();
			case "medium":
				return new MediumPackage();
			case "large":
				return new LargePackage();
			default:
				throw new IllegalArgumentException(
						String.format("Tipo de paquete no soportado.", tipo));
			}
	}

}



