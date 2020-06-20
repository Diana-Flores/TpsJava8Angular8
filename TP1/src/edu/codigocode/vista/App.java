package edu.codigocode.vista;

import edu.codigocode.modelo.Auto;
import edu.codigocode.modelo.Persona;

public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ("Diana", "Rojas", 23);
		Persona p2 = new Persona ("Lorena", "Rojas", 18);
		Persona p3 = new Persona ("Miguel", "Quispe", 26);
		
		Persona[] personas = new Persona [3]; 
		personas[0] = p1; 
		personas[1] = p2; 
		personas[2] = p3; 
		
		Auto a1 = new Auto("AA", "BB", 50, p1); 
		Auto a2 = new Auto("BB", "BB", 51, p2);
		Auto a3 = new Auto("CC", "BB", 51, p3);

		Auto[] autos = new Auto [2]; 
		autos[0] = a1; 
		autos[1] = a2;
		
		System.out.println("=========Personas que entren en los autos=======");				
	    if (a1.personasEntrenEnAutos(personas, autos)) {
	    	System.out.println("Pueden entrar en el auto");    	
	    }else {
	    	System.out.println("No pueden entrar en el auto");
	    }
	    
	    /*System.out.println("=========Disponibilidad=======");
	    if (a3.disponible()) {
	    	System.out.println("Puede entrar "p3.getNombre() + "en el auto");
	    }else {
	    	System.out.println("No puede entrar "p3.getNombre() + "en el auto");
	    }*/
	    
	    System.out.println("========Arrancar=======");
	    Persona p4 = new Persona("Alex", "Mirol", 12);
		Auto a4 = new Auto("DD", "BB", 350, p4);

		if (a4.arrancar()) {
			System.out.println("Puede " + p4.getNombre() +" arrancar el auto");
		} else {
			System.out.println("No puede " + p4.getNombre() + " arrancar el auto");
		}
	}

}