package edu.codigocode.modelo;

public class Entrenador {
	private String nombreEntrenador; 
	private Categoria categoriaEntrenador1; 
	private Categoria categoriaEntrenador2; 
	private Boxeador[] boxeadores =  new Boxeador[5]; 
	
	public Entrenador (String nombreEntr, Categoria catEntr1, Categoria catEntr2) {
		this.nombreEntrenador = nombreEntr; 
		this.categoriaEntrenador1 = catEntr1; 
		this.categoriaEntrenador2 = catEntr2; 
	}
	
	public String getNombreEntrenador() {
		return this.nombreEntrenador; 
	}
	
	public Categoria getCategEntrenador1() {
		return this.categoriaEntrenador1;  
	}
	
	public Categoria getCategEntrenador2() {
		return this.categoriaEntrenador2;  
	}
		
	public void setNombreEntrenador(String nombreEntr) {
		this.nombreEntrenador = nombreEntr; 
	}
	
	public void setCategEntrenador1(Categoria catEntr1) {
		this.categoriaEntrenador1 = catEntr1; 
	}
	
	public void setCategEntrenador2(Categoria catEntr2) {
		this.categoriaEntrenador2 = catEntr2; 
	}
	
	public void asignarBoxeadores(Boxeador[] boxeadores) {
		int cantBoxPuedenEntrar = this.boxeadores.length;
		int boxQueQuierenEntrar = boxeadores.length; 
		if( boxQueQuierenEntrar == cantBoxPuedenEntrar)
		for (int i = 0; i<cantBoxPuedenEntrar; i++) {
			this.boxeadores[i] = boxeadores[i]; 
			System.out.println("Los boxeadores "+boxeadores[i].getNombre()+" se incluyeron");
		}else { if (boxQueQuierenEntrar < cantBoxPuedenEntrar) {
			System.out.println("Falta "+(cantBoxPuedenEntrar-boxQueQuierenEntrar)+" boxeador para incluirlos");	
			} else {
			System.out.println("Los boxeadores fueron rechazados - Superan el maximo establecido");	
			}			
		}
	}
	
	public Boxeador[] getBoxeadores() {
		return this.boxeadores; 
	}
	
	

}
