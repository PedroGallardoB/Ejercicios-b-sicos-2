package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

 Scanner sc = new Scanner (System.in);
		 
		 //Pedimos los datos

		System.out.println("Introduzca su nombre");	
		String nombre = sc.nextLine();
	
		System.out.println("Introduzca su edad");
		String edad = sc.nextLine();
		
				
		//Mostramos los datos
				
				System.out.println("Hola " +  nombre + ", tienes " + edad + ", ¡qué mayor eres!");
			
	}

}
