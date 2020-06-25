package edu.codigocode.vista;

//import java.util.Scanner;
//import java.util.List;

import edu.codigocode.modelo.*; 
 

public class App {

	public static void main(String[] args) {
		
	int sinLimite = 100000;
	Categoria cat1 = new Categoria ("Mosca", 48988, 50802);
	Categoria cat2 = new Categoria ("Gallo", 52163, 53525); 
	Categoria cat3 = new Categoria ("Pluma", 55338, 57152);
	Categoria cat4 = new Categoria ("Ligero", 58967, 61237);
	Categoria cat5 = new Categoria ("Welter", 63503, 66678); 
	Categoria cat6 = new Categoria ("Mediano", 69853, 72562);
	Categoria cat7 = new Categoria ("MedioPesado", 76205, 79378);
	Categoria cat8 = new Categoria ("Pesado", 91 , sinLimite); 
	
	Entrenador entr1 = new Entrenador("Juan", cat1 , cat2);
	Entrenador entr2 = new Entrenador("Pedro", cat3 , cat4);
	Entrenador entr3 = new Entrenador("Alex", cat5 , cat6);
	Entrenador entr4 = new Entrenador("Osvaldo", cat7 , cat8); 	
	
	Gimnacio[] gim = new Gimnacio [4]; 
	gim[0] = new Gimnacio (entr1); 
	gim[1] = new Gimnacio (entr2);
	gim[2] = new Gimnacio (entr3);
	gim[3] = new Gimnacio (entr4);
	
	Boxeador box1 = new Boxeador ("Damian", "Rojas", 50, 1.80, 49000);
	Boxeador box2 = new Boxeador ("Azul", "Rodriguez", 25, 1.60, 52100);
	Boxeador box3 = new Boxeador ("Roman", "Benzon", 30, 1.50, sinLimite +1 );
	Boxeador box4 = new Boxeador ("Ezequiel", "Alanoca", 18, 1.65, 58);
	Boxeador box5 = new Boxeador ("Lara", "Milan", 27, 1.63, 67);
	
	Boxeador[] boxeadores = new Boxeador[5]; 
	boxeadores[0] = box1; 
	boxeadores[1] = box2;
	boxeadores[2] = box3;
	boxeadores[3] = box4;
	boxeadores[4] = box5;
	
	Boxeador[] boxeadores2 = new Boxeador[4]; 
	boxeadores2[0] = box1; 
	boxeadores2[1] = box2;
	boxeadores2[2] = box3;
	boxeadores2[3] = box4;
	
	Boxeador[] boxeadores3 = new Boxeador[9]; 
	
	//Entraron 5 Boxeadores
	int cantBoxeadores = boxeadores.length; 
	for(int i=0; i<cantBoxeadores; i++) {
		System.out.println("Asignar "+boxeadores[i].getNombre()+" al Entrenador "+entr1.getNombreEntrenador());
	} entr1.asignarBoxeadores(boxeadores);
	
	//No entraron, porque les faltaba boxeadores. 
	System.out.println("Asignar "+boxeadores2.length+" boxeadores al Entrenador "+entr2.getNombreEntrenador());
	entr1.asignarBoxeadores(boxeadores2);
	
	//No entraron porque superaban el maximo. 
	System.out.println("Asignar "+boxeadores3.length+" boxeadores al Entrenador "+entr3.getNombreEntrenador());
	entr1.asignarBoxeadores(boxeadores3);
	
	//Asigna la categoria 
	System.out.println("Asignar la Categoria "+cat1.getNombreCategoria()+" al Boxeador "+box1.getNombre());
	box1.asignarCategoria(cat1);
	box1.getCategoria(); 
	
	//No la asigna, por que es muy bajo el peso del box.
	System.out.println("Asignar la Categoria "+cat2.getNombreCategoria()+" al Boxeador "+box2.getNombre());
	box2.asignarCategoria(cat2);
	box2.getCategoria(); 
	
	//No la asigna, por que es mucho el peso drl box.
	System.out.println("Asignar la Categoria "+cat3.getNombreCategoria()+" al Boxeador "+box3.getNombre());
	box3.asignarCategoria(cat3);
	box3.getCategoria();
	
	//Al finalizar el día se debe imprimir la cantidad de Boxeadores Totales que ingresaron en el día
	//y un detalle de la cantidad por Entrenador
	int cantBoxeadoresEntraron = boxeadores.length + boxeadores2.length + boxeadores3.length ;
	System.out.println("La cantidad de Boxeadores ingresados en el dia son "+ cantBoxeadoresEntraron);
	System.out.println("La cantidad de Boxeadores por Entrenador que ingresaron son "+ cantBoxeadores);
	


		


	}
}
