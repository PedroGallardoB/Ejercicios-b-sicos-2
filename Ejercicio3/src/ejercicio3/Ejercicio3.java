package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

public static void main(String[] args) {
		
	//Pedimos el año de nacimiento
	
		System.out.print("Introduzca su año de nacimiento");
		System.out.println();
		
		//Lo escaneamos
		
		Scanner nac = new Scanner(System.in);
		
		int nac1 = nac.nextInt();
		
		//Pedimos el año actual
		
		System.out.print("Introduzca año actual");
		System.out.println();
		
		//La escaneamos
		
		Scanner act = new Scanner(System.in);
			
		int act1 = act.nextInt();
		
		//Calculamos la edad
		
		int edad = act1-nac1;
		
		//Mostramos el resultado
				
	System.out.print( "Su edad es de " + edad + " años");

	}

}