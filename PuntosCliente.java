package co.edu.tdea22082024;

import java.util.Scanner;

public class PuntosCliente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int puntos = 0;
		int competenciaNatacion = 0;
		int competenciaCiclismo = 0;
		
		System.out.println("Ingrese el numero de veces que ha participado en competencias de natacion (0 para ninguna): ");
		competenciaNatacion = sc.nextInt();
		
		System.out.println("Ingrese el numero de veces que ha participado en competencias de ciclismo(0 para ninguna): ");
		competenciaCiclismo = sc.nextInt();
		
		System.out.println("Ingrese el numero puntos que tiene: ");
		puntos = sc.nextInt();
		
		if (puntos >= 1000 && competenciaNatacion > 0 && competenciaCiclismo > 0) {
			System.out.println("Usted es un cliente de rango diamante");			
		}else if(puntos >= 1000 && competenciaNatacion > 0 && competenciaCiclismo < 1) {
			System.out.println("Usted es un cliente de rango Oro");
		}else if(puntos >= 1000 && competenciaNatacion < 1 && competenciaCiclismo > 0) {
			System.out.println("Usted es un cliente de rango Oro");	
		}else if(puntos >= 1000 && competenciaNatacion > 0 && competenciaCiclismo < 1) {
			System.out.println("Usted es un cliente de rango Oro");
		}else if(puntos >= 1000 && competenciaNatacion < 1 && competenciaCiclismo < 1) {
			System.out.println("Usted es un cliente de rango Plata");
		}else if(puntos < 1000 && competenciaNatacion > 0 && competenciaCiclismo > 0) {
			System.out.println("Usted es un cliente de rango Plata");
		}else if(puntos < 1000 && competenciaNatacion > 0 && competenciaCiclismo < 1) {
			System.out.println("Usted es un cliente de rango Bronce");
		}else if(puntos < 1000 && competenciaNatacion < 1 && competenciaCiclismo > 0) {
			System.out.println("Usted es un cliente de rango Bronce");
		}else {
			System.out.println("Usted es un cliente de rango platino");
		}

}
}
