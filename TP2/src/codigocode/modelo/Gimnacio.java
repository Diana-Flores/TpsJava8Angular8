package edu.codigocode.modelo;

public class Gimnacio {
	private Entrenador entrenador;  
	
	public Gimnacio (Entrenador entrenador) {
		this.entrenador = entrenador; 
	
	}
	
	public Entrenador getEntrenador() {
		return this.entrenador; 
	}
	
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador; 
	}
}
