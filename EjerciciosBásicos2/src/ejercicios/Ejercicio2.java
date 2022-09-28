package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
	int edad;
	boolean mayor;
	Scanner sc = new Scanner(System.in); //Abrimos escáner
	
	//Solicitamos al usuario que introduzca su edad
	
	System.out.println("Porfavor introduzca su edad");

	edad = sc.nextInt();
	
	//Comprobamos si el usuario es mayor de edad (+18)
	
	
	mayor = edad >= 18?true:false;
	
	//Imprimimos el resultado
	
	System.out.println(mayor);
	
	sc.close(); //Cerramos escáner
	
	}

}
