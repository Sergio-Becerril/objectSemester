package edu.udelp.semester4.examenFinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula peli = new Pelicula();
		System.out.println("Peliculas disponibles: "+peli.peliculas);

		UsuarioEstandar usuario1 = BuilderE.create().nombre("Jorge").edad("21").genero("Terror").tipo("Estandar")
	            .peliculasVistas("Ninguna").build();
		
		UsuarioPremium usuario2 = BuilderP.create().nombre("Luis").edad("23").genero("Accion").tipo("Premium")
	            .peliculasVistas("Ninguna").build();
		
		System.out.println("\n"+usuario1);
		System.out.println(usuario1.verContenido());
		System.out.println("\n"+usuario2);
		System.out.println(usuario2.verContenido());
		
		
		
		
		
		usuario1.setPeliculasVistas("Star wars, Lord of the rings");
		usuario1.setPeliculasVistas("Interstellar, Iron man");
		System.out.println("\n"+usuario1);
		System.out.println("\n"+usuario2);
	}

}
