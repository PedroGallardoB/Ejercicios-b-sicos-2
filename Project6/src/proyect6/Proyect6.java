package proyect6;

import java.util.Scanner;

public class Proyect6 {

	public static void main(String[] args) {

		System.out.print("Introduzca los dos números"); //Pedimos los números
		System.out.println();
		Scanner sc = new Scanner(System.in); //Escaneamos los números
		
		float n1 = sc.nextInt();
		float n2 =sc.nextInt();
		float sum = n1+n2; //Operamos con los números
		float res = n1-n2;
		float div = n1/n2;
		float mul = n1*n2;
		
		
		System.out.println("La media suma es " + sum);//Mostramos resultados
		System.out.println();
		System.out.println("La media resta es " + res);
		System.out.println();
		System.out.println("La media multiplicación es " + mul);
		System.out.println();
		System.out.println("La media división es " + div);
	}

}
