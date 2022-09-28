package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaro las variables
		
		boolean llueve, tarea, biblioteca, salir, aux;
		
		Scanner sc = new Scanner(System.in); //Abrimos escáner
		
		//Preguntamos al usuario si llueve.
		
		System.out.println("Responder con true (verdadero) o false (falso)");
		System.out.println();
		
		System.out.println("¿Llueve?");
		
		llueve = sc.nextBoolean();
		
		//Preguntamos al usuario si a hecho la tarea.
		
		System.out.println("¿Has hecho la tarea?");
				
		tarea = sc.nextBoolean();
		
		//Preguntamos al usuario si tiene que ir a la biblioteca.
		
		System.out.println("¿Tienes que ir a la biblioteca?");
				
		biblioteca = sc.nextBoolean();
		
		aux = (llueve == false) && (tarea == true)?true:false;
		salir = (aux == true || biblioteca == true)?true:false;
		
		//Comprobamos si puede salir
		
		System.out.println("Puedes salir:"); 
		System.out.println(salir);
		
		sc.close(); //Cerramos escáner
		
	}

}
