package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

//Declaramos las variables
		
		float manzanas;
		float peras;
		final float MAN = 2.35f;
		final float PER = 1.95f;
		float benper;
		float benman;
		
		Scanner sc = new Scanner(System.in); //Abrimos escáner
		
	//Pedimos las ventas en kg de manzanas
		
		System.out.println("Introduzca las ventas en kg. de manzanas");
		
		manzanas = sc.nextFloat();
				
		//Pedimos las ventas en kg de peras
				
		System.out.println("Introduzca las ventas en kg. de peras");
				
		peras = sc.nextFloat();
		
		//Operamos con los datos
		
		benman = MAN*manzanas;
		benper = PER*benman;
		
		//Mostramos los resultados
		
		System.out.printf("Se han conseguido %.2f euros de la venta de manzanas.",benman);
		System.out.println();
		System.out.printf("Se han conseguido %.2f euros de la venta de peras.",benper);
		
		sc.close(); //Cerramos escáner
		
	}

}
