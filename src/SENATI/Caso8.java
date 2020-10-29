package SENATI;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingresa nota: ");
		int nota = scn.nextInt();
		
		String mensaje = "";
		
		if (nota <= 7)
			mensaje = "Sin palabras";
		else if (nota >= 8 && nota <= 10)
			mensaje = "Malo";
		else if (nota >= 11 && nota <= 14)
			mensaje = "Regular";
		else if (nota >= 15 && nota <= 17)
			mensaje = "Notable";
		else if (nota >= 18 && nota <= 20)
			mensaje = "Excelente";
		
		System.out.print("Estado obtenido: " + mensaje);

	}

}
