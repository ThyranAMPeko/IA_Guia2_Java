package SENATI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Alumno: ");
		String nom = scn.nextLine();
		System.out.print("Ingrese carrera [DS/ RC/ DG]: ");
		String carrera = scn.nextLine();
		System.out.print("Ingrese turno: ");
		String turno = scn.nextLine();
		
		float monto = 0;
		String nom_carrera = "Desconocido";
		switch (carrera) {
			case "DS":
				monto = 1500;
				nom_carrera = "Desarrollo de Software"; break;
			case "RC":
				monto = 1400;
				nom_carrera = "Redes y conectividad"; break;
			case "DG":
				monto = 1300;
				nom_carrera = "Diseño grafico"; break;
		}
		
		float dscto = 0;
		String turn = "";
		switch (turno) {
			case "M":
				dscto = monto * 0.1f;
				turn = "Mañana"; break;
			case "T":					
				dscto = monto * 0.2f;
				turn = "Tarde"; break;
			case "N":
				dscto = monto * 0.15f;
				turn = "Noche"; break;			
		
		}
		
		float total = monto - dscto;
		float total_d = total / 3.33f;
				
		System.out.println("RESULTADOS");
		System.out.println("===============");
		System.out.println("Alumno..............: " + nom);
		System.out.println("Carrera.............: " + carrera);
		System.out.println("Monto...............: " + monto);
		System.out.println("Descuento...........: " + dscto);
		System.out.println("Total a pagar.......: " + total);
		System.out.println("Total a pagar en $..: " + df.format(total_d));
				
		
		}
	}


