package SENATI;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese el sueldo: ");
		int sueldo = scn.nextInt();
		
		float impuesto = 0;
		
		if (sueldo > 2800)
			impuesto = sueldo * 0.05f;
		else 
			impuesto = sueldo * 0.02f;
		
		System.out.println("Impuesto calculado: " + impuesto);
		
	}

}
