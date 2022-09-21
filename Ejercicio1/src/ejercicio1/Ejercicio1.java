package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {
		
		System.out.print("Introduzca un número");
		System.out.println();
		Scanner num = new Scanner(System.in);
			
		int leo = num.nextInt();
		
	System.out.print( "Su número es " + leo);
	num.close();

	}

}
