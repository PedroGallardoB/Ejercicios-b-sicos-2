package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args) {
		//Pedimos la edad
	
		System.out.print("Introduzca su edad");
		System.out.println();
		
		//Escaneamos la edad
		
		Scanner num = new Scanner(System.in);
			
		int leo = num.nextInt();
		
		//Calculamos la edad el próximo año
		
		int edad = leo + 1;
		
		//Imprimimos el resultado
		
	System.out.print( "Su edad el próximo año será " + edad + " años");
	num.close();

	}

}