package co.edu.tdea14082024;

import java.util.Scanner;

public class RaicesClaseMath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0, x = b * b - 4 * a * c;

		
		System.out.println("Ingrese el valor de a: ");
		a = sc.nextDouble();

		System.out.println("Ingrese el valor de b: ");
		b = sc.nextDouble();

		System.out.println("Ingrese el valor de c: ");
		c = sc.nextDouble();
				
		if (x == 0) {
			double x3 = -b / (2 * a);
			System.out.println("La raiz unica es: " + x3);
		}else if (x > 0) {
			double x1 = (-b + Math.sqrt(x)) / 2 * a;
			double x2 = (-b - Math.sqrt(x)) / 2 * a;
			System.out.println("El valor de la primera ra�z es: " + x1 + " Y el valor de la segunda ra�z es: " + x2);
		}else {
			System.out.println("No hay valores validos para hcaer la operacion");
		}if ( a == 0) {
			System.out.println("Perdon pero la division no puede ser por cero, por ende a no puede ser cero");
		}
			
	}
 
}
