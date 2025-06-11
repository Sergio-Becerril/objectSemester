package edu.udelp.semester4.examenFinal;


public class BuilderE extends UsuarioEstandar {
	
	public static BuilderE create(){
        return new BuilderE();
    }

    public UsuarioEstandar build(){
        return (UsuarioEstandar) this;
    }

    public BuilderE edad(String edad) {
        this.edad = edad;
        return this;
    }
    
    public BuilderE tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public BuilderE genero(String marca) {
        this.genero = marca;
        return this;
    }

    public BuilderE nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public BuilderE peliculasVistas(String peliculasVistas) {
    	this.peliculasVistas = peliculasVistas;
    	return this;
    }
}
