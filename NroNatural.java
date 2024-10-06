package co.edu.tdea29082024;

import java.util.Scanner;

public class NroNatural {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("(si el numero es multiplo de 5 finaliza el programa): ");
				
		do {
			
			System.out.println("Ingrese un numero natural:");
			num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("El numero no puede ser negativo");
				break;
			}
			
			 if (num % 2 != 0) {
				 System.out.println("El numero: " + num + " es impar");	 
		}else if (num % 9 == 0) {
			System.out.println("El numero:" + num + " es multiplo de 9");
		}else if (num % 2 == 0) {
			System.out.println("El numero: " + num + " es par");
		}
		
		 }while (num % 5 != 0);
		
		if (num % 5 == 0) {
			System.out.println("El numero: " + num + " es multiplo de 5");
		}
		System.out.println("Finaliza el programa");

	}

}
