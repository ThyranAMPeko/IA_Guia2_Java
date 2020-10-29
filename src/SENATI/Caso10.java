package SENATI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del empleado: ");
		String nom = scn.nextLine();
		
		System.out.print("Horas trabajadas: ");
		float horas_tra = scn.nextFloat();
		
		System.out.print("Tarifa por hora: ");
		float tarifa = scn.nextFloat();
		
		System.out.print("Minutos de tardanza: ");
		float minutos = scn.nextFloat();
		
		float importe = horas_tra * tarifa;
		
		float bono = 0;
		if (horas_tra > 60)
			bono = importe * 0.13f;
		else
			bono = importe * 0.04f;
		
		float dscto = 0;
		if (minutos > 15)
			dscto = importe * 0.03f;
		
		float porcentaje = horas_tra / 70 * 100;
		
		System.out.println("RESULTADOS");
		System.out.println("===============");
		System.out.println("Nombre del empleado.....: " + nom);
		System.out.println("Horas trabajadas........: " + horas_tra);
		System.out.println("Tarifa por hora.........: " + tarifa);
		System.out.println("Importe.................: " + importe);
		System.out.println("Bono....................: " + df.format(bono));
		System.out.println("Descuento...............: " + dscto);
		System.out.println("Meta alcanzada..........: " + df.format(porcentaje) + " %");
			
			

	}

}
