package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		System.out.println("Introduzca el radio"); //Pedimos radio
		Scanner sc = new Scanner(System.in); //Escaneamos radio
		double rad = sc.nextFloat();
		double ar = Math.PI * rad  *rad; //Operamos área y perímetro
		double pe = 2 * Math.PI * rad;
		System.out.println("El área del círculo es " + ar); //Mostramos resultados
		System.out.println();
		System.out.println("El perímetro del círculo es " + pe);
		
	}
}