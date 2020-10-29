package SENATI;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;
		
		System.out.print("Ingrese numero 1: ");
		n1 = scn.nextInt();
		System.out.print("Ingrese numero 2: ");
		n2 = scn.nextInt();
		
		String estado = "";
		
		if(n1 == n2)
			estado = "Los 2 numeros son pares";
		else if (n1 < n2)
			estado = "El primer numero " + n1 + " es el menor";
		else if (n2 < n1)
			estado = "EL segundo numero " + n2 + " es el menor";
		
		System.out.println(estado);

	}

}
