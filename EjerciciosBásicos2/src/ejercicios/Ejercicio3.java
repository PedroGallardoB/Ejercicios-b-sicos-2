package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
public static void main(String[] args) {
	
	//Declaramos las variables
	
	double num;
	boolean par;
	Scanner sc = new Scanner(System.in); //Abrimos escáner
	
	//Solicitamos introducir el número 
	
	System.out.println("Por favor introduzca el número que desee saber si es par.");
	
	num = sc.nextDouble();
	
	//Comprobamos si el número es par
	
	par = (num % 2) == 0?true:false;
	
	//Imprimimos el resultado
	
	System.out.println(par);
	
	sc.close(); //Cerramos escáner
}
}
