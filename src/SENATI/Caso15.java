package SENATI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Cliente: ");
		String nom = scn.nextLine();
		System.out.print("Producto [TB/ LT/ MN/ IM]: ");
		String pro = scn.nextLine();
		System.out.print("Cantidad: ");
		int can = scn.nextInt();
		
		scn.nextLine();
		
		System.out.print("Forma de pago [C1/ C2]: ");
		String for_pa = scn.nextLine();
		
		float precio = 0;
		String nom_pro = "";
		switch (pro) {
			case "TB":
				precio = 350; 
				nom_pro = "Tablet"; break;
			case "LT":
				precio = 2300; 
				nom_pro = "Laptop"; break;
			case "MN":
				precio = 850; 
				nom_pro = "Monitor"; break;
			case "IM":
				precio = 680; 
				nom_pro = "Impresora"; break;
		}
		
		float importe = can * precio;
		float valor = 0;
		String nom_fo_pa = "Desconocido";
		
		switch (for_pa) {
			case "C1":
				valor = importe * 0.95f;
				nom_fo_pa = "Contado"; break;
			case "C2":
				valor = importe * 1.12f;
				nom_fo_pa = "Credito"; break;
		}
		
		
		System.out.println("RESULTADOS");
		System.out.println("===============");
		System.out.println("Cliente..........: " + nom);
		System.out.println("Producto.........: " + pro);
		System.out.println("Cantidad.........: " + can);
		System.out.println("Importe..........: " + importe);
		System.out.println("Forma de pago....: " + nom_fo_pa);
		
		if (for_pa.equals("C1")) {
			System.out.println("Descuento..: " + (importe - valor));
			System.out.println("Total a pagar...: " + (valor));
		}
			else if (for_pa.equals("C2")) {
			System.out.println("Incremento..: " + (importe + valor));
			System.out.println("Total a pagar...: " + (valor));
	}
			
	}

}
