package edu.codigocode.vista;

import edu.codigocode.modelo.Auto;
import edu.codigocode.modelo.Persona;

public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ("Diana", "Rojas", 23);
		Persona p2 = new Persona ("Lorena", "Rojas", 18);
		Persona p3 = new Persona ("Miguel", "Quispe", 26);
		//Persona p4 = null; 
		Auto a1 = new Auto("AA", "BB", p1); 
		Auto a2 = new Auto("BB", "BB", p2);
		//Auto a3 = new Auto("CC", "BB", p4);

	    System.out.println("========Arrancar=======");
		if (a1.arrancar()) {
			System.out.println("Puede " + p1.getNombre() +" arrancar el Auto1, donde su velocidad Maxima es: "+a1.velocidadMaxima());
		} else {
			System.out.println("No puede " + p1.getNombre() + " arrancar el Auto1");
		}
	    
	    System.out.println("=========Disponibilidad=======");
	    System.out.println("La persona "+p3.getNombre()+" con el apellido "+p3.getApellido()+" con la edad "+p3.getEdad());
	    System.out.println("¿Puede entrar en el Auto2?");
	    if (a2.entrarEnAuto()) {
	    	System.out.println("Si puede entrar "+p3.getNombre() + " en el Auto2");
	    }else {
	    	System.out.println("No puede entrar "+p3.getNombre() + " en el Auto2, porque esta OCUPADO por la persona "+a2.getPersona());
	    	//if(a3.entrarEnAuto()) {
	    	//	System.out.println("Pero podria entrar en el Auto3, porque esta Disponible");
	    	//}
	    }
	    
	    

	}

}