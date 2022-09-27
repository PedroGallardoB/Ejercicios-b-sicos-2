package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {
		//Pedimos un número
		System.out.print("Introduzca un número");
		System.out.println();
		Scanner num = new Scanner(System.in);
		//Escaneamos el número
		int leo = num.nextInt();
		
		//Imprimimos el número
	System.out.print( "Su número es " + leo);
	num.close();

	}

}
