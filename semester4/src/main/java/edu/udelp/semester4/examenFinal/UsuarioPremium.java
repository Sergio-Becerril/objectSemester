package edu.udelp.semester4.examenFinal;

public class UsuarioPremium extends Usuario{

	
	public UsuarioPremium () {}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPeliculasVistas() {
		return peliculasVistas;
	}

	public void setPeliculasVistas(String peliculasVistas) {
		this.peliculasVistas = peliculasVistas;
	}
	
	
	@Override
	public String verContenido() {
        return "Peliculas= 200" ;
    }
	
}
