package edu.codigocode.modelo;

public class Auto {

	private String marca;
	private String modelo;
	private Persona persona;
	private boolean disponible = false;
	
	public Auto(String marca, String modelo,Persona persona){
		this.marca = marca;
		this.modelo = modelo;
		this.persona = persona;
	}

	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Persona getPersona(){
		return persona;
	}
	
	public boolean disponible() {
		return this.disponible; 
		
	}
	
	public boolean arrancar(){
		if (this.persona.getEdad() > 18) {
			return true;
		} else 
			return false;
	}
	
	public int velocidadMaxima() {
		if(this.persona.getEdad() <= 30) { 
			return 150;
		}else if(this.persona.getEdad() > 80) {  
			return 70; 
		}else { 
			return 0;    
		}
		
	}
	
	public boolean entrarEnAuto(){
		if (!disponible()) {
			return this.disponible = false; 
		} else {
			return disponible(); 
		}
	}
}
	