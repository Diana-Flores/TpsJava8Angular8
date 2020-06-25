package edu.codigocode.modelo;

public class Boxeador {
	private String nombre;
	private String apellido; 
	private int edad;
	private double altura; 
	private double peso; 
	private Entrenador entrenador; 
	private Categoria categoria; 
	
	public Boxeador (String nom, String ap, int edad, double al, double peso) {
		this.nombre = nom; 
		this.apellido = ap; 
		this.edad = edad; 
		this.altura = al; 
		this.peso = peso; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}

	public String getApellido() {
		return this.apellido; 
	}
	
	public int getEdad() {
		return this.edad; 
	}
	
	public double getAltura() {
		return this.altura; 
	}
	
	public double getPeso() {
		return this.peso; 
	}
	
	public Entrenador getEntrenador() {
		return this.entrenador; 
	}
	
	public Categoria getCategoria() {
		return this.categoria; 
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;  
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;  
	}
	
	public void setEdad(int edad) {
		this.edad = edad; 
	}
	
	public void setAltura(double altura) {
		this.altura = altura;  
	}
	
	public void setPeso(double peso) {
		this.peso = peso; 
	}
	
	public void asignarCategoria(Categoria categoria) {
		int sinLimite = 100000;
		if(this.peso >= categoria.getPesoMinimo() && categoria.getPesoMaximo() <= this.peso) {
			this.categoria = categoria; 
		}else { 
			if (this.peso == sinLimite ) {
				this.categoria = new Categoria ("MedioPesado", 76205, 79378);	
				pierdaPeso(); 
				} else {
					this.categoria = new Categoria ("Mosca", 48988, 50802);
					dietaEngorde(); 
			}
		}
	}
	
	public void pierdaPeso() {
		this.peso = getPeso() - 50;  
		
	}
	
	public void dietaEngorde() {
		this.peso = getPeso() + 50; 
	}
}
