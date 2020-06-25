package edu.codigocode.modelo;

public class Categoria {
	private String nombreCategoria; 
	private int pesoMim; 
	private int pesoMax; 
	
	public Categoria (String nomCat, int pMin, int pMax) {
		this.nombreCategoria = nomCat; 
		this.pesoMim = pMin; 
		this.pesoMax = pMax; 
	}
	
	public String getNombreCategoria() {
		return this.nombreCategoria; 
	}
	
	public int getPesoMinimo() {
		return this.pesoMim; 
	}
	
	public int getPesoMaximo() {
		return this.pesoMax; 
	}
	
	public void setNombreCategoria(String nomCat) {
		this.nombreCategoria = nomCat;  
	}
	
	public void setPesoMinimo(int pMin) {
		this.pesoMim = pMin;  
	}
	
	public void setPesoMaximo(int pMax) {
		this.pesoMax = pMax;  
	}

}
