package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

public static void main(String[] args) {
	
//Variables
	
int Iv = 21;
	
double sin;
	
double con;


//Lectura de datos

Scanner sc = new Scanner(System.in);

	System.out.print("Introduzca un precio: ");
	sin = sc.nextDouble();

//Mostramos resultado

	con = sin * Iv /100 + sin;

	// Mostramos el resultado por pantalla
	
	System.out.println("El precio con IVA es: " + con);


	}
}
