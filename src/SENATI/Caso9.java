package SENATI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre: ");
		String nombre = scn.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		int nota1 = scn.nextInt();
		
		System.out.print("Ingrese nota 2: ");
		int nota2 = scn.nextInt();
		
		System.out.print("Ingrese asistencias [1-12]: ");
		float asistencia = scn.nextFloat();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float por_asistencia = asistencia / 12;
		
		String estado = "Desaprobado";
		
		if (promedio >= 13 && por_asistencia >= 0.7)
			estado = "Aprobado";
		
		System.out.println("RESULTADOS");
		System.out.println("===============");
		System.out.println("Alumno.....: " + nombre);
		System.out.println("Promedio...: " + promedio);
		System.out.println("Asistencia.: " + por_asistencia * 100 + "%");
		System.out.println("Estado.....: " + estado);
		

	}

}
