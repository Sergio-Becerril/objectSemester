package edu.udelp.semester4.examenFinal;


public class BuilderP extends UsuarioPremium {
	
	public static BuilderP create(){
        return new BuilderP();
    }

    public UsuarioPremium build(){
        return (UsuarioPremium) this;
    }

    public BuilderP edad(String edad) {
        this.edad = edad;
        return this;
    }
    
    public BuilderP tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public BuilderP genero(String marca) {
        this.genero = marca;
        return this;
    }

    public BuilderP nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public BuilderP peliculasVistas(String peliculasVistas) {
    	this.peliculasVistas = peliculasVistas;
    	return this;
    }
}
