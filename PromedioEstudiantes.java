package co.edu.tdea29082024;

import java.util.Scanner;

public class PromedioEstudiantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Introduzca el numero de estudiantes: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Estudiante "+ i );
			
			double sumaNotas = 0;
			
			for (int j = 1; j <= 4; j ++) {
				
				System.out.println("Introduzca la nota " + j + " (sin numeros decimales): ");
				
				double nota = 0;
				
				nota = sc.nextDouble();
				
				sumaNotas += nota;
			}
			double promedio = sumaNotas / 4;
			
			System.out.println("El promedio del estudiante " + i + " es: " + promedio);
		}
	}

}
