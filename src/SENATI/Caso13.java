package SENATI;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.String;

public class Caso13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese el 1er numero: ");
		float num1 = scn.nextFloat();
		System.out.print("Ingrese el 2do numero: ");
		float num2 = scn.nextFloat();
		
		System.out.print("Operacion [1-6]: ");
		int ope = scn.nextInt();
		
		String nom_ope = "";
		float oper = 0;
		
		switch (ope) {
		case 1:
			nom_ope = "Suma"; 
			oper = (num1 + num2); break;
		case 2:
			nom_ope = "Resta"; 
			oper = (num1 - num2); break;
		case 3:
			nom_ope = "Producto"; 
			oper = (num1 * num2); break;
		case 4:
			if (num2 != 0) {
				nom_ope = "Division"; 
				oper = (num1 / num2); }	
			else 
				nom_ope = "No se puede dividir";
			break;
		case 5:
			if (num2 != 0) {
				nom_ope = "Division"; 
				oper = (num1 % num2); }	
			else 
				nom_ope = "No se puede hallar el resto entero";
			break;
		case 6:
			nom_ope = "Promedio"; 
			oper = (num1 + num2) / 2; break;
		default:
			nom_ope = "No encontrado";  
			
		}
		
		System.out.println("RESULTADOS");
		System.out.println("===============");
		System.out.println("Numero 1.....: " + num1);
		System.out.println("Numero 2.....: " + num2);
		System.out.println("Operacion....: " + nom_ope);
		System.out.println("Resultado....: " + oper);
	}

}
