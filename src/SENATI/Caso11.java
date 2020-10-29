package SENATI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese numero [1-7]: ");
		int dia = scn.nextInt();
		
		String n_dia = "";
		
		switch (dia) {
			case 1:
				n_dia = "Domingo";
				break;
			case 2:
				n_dia = "Lunes";
				break;
			case 3:
				n_dia = "Martes";
				break;
			case 4:
				n_dia = "Miercoles";
				break;
			case 5:
				n_dia = "Jueves";
				break;
			case 6:
				n_dia = "Viernes";
				break;
			case 7:
				n_dia = "Sabado";
				break;
			default:
				n_dia = "Dia desconocido";
				
		System.out.println("RESULTADOS");
		System.out.println("===============");
		System.out.println("Dia de la semana.....: " + n_dia);
				
		}
		

	}

}
