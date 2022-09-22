package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args) {
		
		System.out.print("Introduzca su edad");
		System.out.println();
		Scanner num = new Scanner(System.in);
			
		int leo = num.nextInt();
		int edad = leo + 1;
	System.out.print( "Su edad el próximo año será " + edad + " años");
	num.close();

	}

}