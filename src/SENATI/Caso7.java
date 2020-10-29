package SENATI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = scn.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = 0.03f * sueldo;
		
		else if (sueldo > 1500 && sueldo <= 3000)
			impuesto = 0.08f * sueldo;
		
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		System.out.println("===============");
		System.out.println("  RESULTADOS");
		System.out.println("===============");
		System.out.println("Impuesto calculado..: " + df.format(impuesto));

	}

}
