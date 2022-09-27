package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner (System.in);
		 
		 //Pedimos los datos y los escaneamos

		System.out.println("Introduzca su nombre");	
		String nombre = sc.nextLine();
	
		System.out.println("Introduzca su dirección");
		String dirección = sc.nextLine();
		
		System.out.println("Introduzca su teléfono");
		String teléfono = sc.nextLine(); 
		
				
		//Mostramos los datos
				
				System.out.println("Nombre:  " + nombre);
				System.out.println("Dirección: " + dirección);
				System.out.println("Teléfono: "  + teléfono);
				
				
	}

}
