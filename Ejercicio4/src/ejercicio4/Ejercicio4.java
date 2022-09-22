package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		System.out.print("Introduzca las dos notas");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextInt();
		float n2 =sc.nextInt();
		float res = (n1+n2)/2;
		
		System.out.print("La media aritmética es " + res);
		
		}
}
