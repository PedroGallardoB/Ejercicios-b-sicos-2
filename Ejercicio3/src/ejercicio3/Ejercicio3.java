package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

public static void main(String[] args) {
		
		System.out.print("Introduzca su año de nacimiento");
		System.out.println();
		Scanner nac = new Scanner(System.in);
		
		int nac1 = nac.nextInt();
		
		System.out.print("Introduzca año actual");
		System.out.println();
		Scanner act = new Scanner(System.in);
			
		int act1 = act.nextInt();
		
		int edad = act1-nac1;
				
	System.out.print( "Su edad es de " + edad + " años");

	}

}