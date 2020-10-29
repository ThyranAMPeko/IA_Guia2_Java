package SENATI;

import java.util.Scanner;

public class Caso3 {
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.print("Ingrese numero 1: ");
		n1 = scn.nextInt();
		System.out.print("Ingrese numero 2: ");
		n2 = scn.nextInt();
		System.out.print("Ingrese numero 3: ");
		n3 = scn.nextInt();
		
		String estado = "";
		
		if(n1 == n2 && n1 == n3)
			estado = "Los tres numeros son pares";
		else if (n1 > n2 && n1 > n3)
			estado = "El primer numero " + n1 + " es el mayor";
		else if (n2 > n1 && n2 > n3)
			estado = "EL segundo numero " + n2 + " es el mayor";
		else
			estado = "El tercer numero " + n3 + " es el mayor";
		
		System.out.println("Resultados: " + estado);
			
		
	}
}
