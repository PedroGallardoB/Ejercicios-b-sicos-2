package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println("Introduzca el radio");
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextFloat();
		double ar = Math.PI * rad  *rad;
		double pe = 2 * Math.PI * rad;
		System.out.println("El área del círculo es " + ar);
		System.out.println();
		System.out.println("El perímetro del círculo es " + pe);
		
	}
}