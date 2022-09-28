package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		//Declaramos las variables
		
		int pr, seg, ter, med;
		double med2;
		
		Scanner sc = new Scanner(System.in); //Abrimos escáner
		
	//Pedimos las notas al usuario
		
	System.out.println("Por favor introduzca su nota del primer trimestre");
	
	pr = sc.nextInt();
	
	System.out.println("Por favor introduzca su nota del segundo trimestre");
	
	seg = sc.nextInt();
	
	
	System.out.println("Por favor introduzca su nota del tercer trimestre");
	
	ter = sc.nextInt();
	
	//Calculamos la media
	
	
	med = (pr+seg+ter)/3;
	med2 = ((double)(pr+seg+ter))/3;
	
	System.out.println("Nota media del curso " + med);
	System.out.println("Nota media expediente académico " + med2);
	
	sc.close(); //Cerramos escáner
	}

}
