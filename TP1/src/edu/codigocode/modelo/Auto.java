package edu.codigocode.modelo;

public class Auto {

	private String marca;
	private String modelo;
	private Persona persona;
	private int velocMax;
	
	public Auto(String marca, String modelo,int velocMax, Persona persona){
		this.marca = marca;
		this.modelo = modelo;
		this.persona = persona;
		this.velocMax = velocMax; 
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
	
	public boolean personasEntrenEnAutos (Persona[] p, Auto[] a) {
		int cantPersonas = p.length; 
		int cantAutos = a.length; 
		if (cantPersonas == cantAutos) {
			return true; 
		}else 
			return false; 	
	}
	
	public boolean disponible(Auto auto) {
		if(auto.persona == null ) {
			return true;  
		}else 
			return false; 
		
	}
	

}
	