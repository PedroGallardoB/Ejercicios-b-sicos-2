package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

 Scanner sc = new Scanner (System.in);
		 
		 //Pedimos los datos

		System.out.println("Conversor a pesetas, introduzca cantidad de euros.");	
		double n1 = sc.nextDouble();
		
		//Operamos convirtiendo a pesetas
		
		double n2 = n1*166.386 ;
	
		//Mostramos los datos
		
		System.out.println("Son " + n2 +" pesetas");
		String edad = sc.nextLine();
		
				
			
	}
}
