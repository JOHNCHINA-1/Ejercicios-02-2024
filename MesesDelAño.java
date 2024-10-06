package co.edu.tdea13082024;

import java.util.Scanner;

public class clase13082024 {

	public static void main(String[] args) {
		
		int a = 1; 
		if(a == 0) {
			System.out.println("a es igual que 0");	
		}
		if (a > 0) {
			System.out.println("a es mayor que 0");
		}else if (a < 0) {
			System.out.println("a es menor que 0");
		}else {
			System.out.println("a no es mayor que 0");		
		}
	
		System.out.println("termina el proceso");
		
		//casos/switch
		
		int numeroMes = 12;
		String estacion = "", mes = "";
		
		switch (numeroMes) {
		case 12:
			mes = "Diciembre";
			estacion = "Invierno";
			break;
		case 1:
			mes = "Enero";
			estacion = "Invierno";
		case 2:
			mes = "Febrero";
			estacion = "Invierno";
			break;
		case 3:
			mes = "Marzo";
			estacion = "Primavera";
			break;
		case 4:
			mes = "Abril";
			estacion = "Primavera";
			break;
		case 5:
			mes = "Mayo";
			estacion = "Primavera";
			break;
		case 6:
			mes = "Junio";
			estacion = "Verano";
			break;
		case 7:
			mes = "Julio";
			estacion = "Verano";
			break;
		case 8:
			mes = "Agosto";
			estacion = "Verano";
			break;
		case 9:
			mes = "Septiembre";
			estacion = "Otoño";
			break;
		case 10:
			mes = "Octubre";
			estacion = "Otoño";
			break;
		case 11:
			mes = "Noviembre";
			estacion = "Otoño";
			break;
		}
		
		System.out.println("El mes de " + mes + "se encuentra en la estación " + estacion);
		
		//Programa de potencias
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		
		System.out.println("ingrese el valor del numero a potenciar: ");
		num1 = sc.nextDouble();
		System.out.println("ingrese el valor del exponente: ");
		num2 = sc.nextDouble();
		
		double potencia = Math.pow(num1, num2);
		
		if (num2 > 0){
			System.out.println("La potencia es positiva " + "Y su valor es: " + potencia);
		}else if (num2 == 0) {
			System.out.println("El resultado de la potencia es: " + potencia);
		}
		
		if (num2 < 0) {
				System.out.println("El resultado de la potencia es: " + potencia);
		}
		
		//Nros Romanos
		
		int nros = 0;
		String nroRomano = "";
		
		System.out.println("ingrese el número que desea convertir a romano: ");
		nros = sc.nextInt();
		
				
		switch(nros) {
		case 1:
			nroRomano = "I";
			break;		
		case 2:
			nroRomano = "II";
			break;		
		case 3:
			nroRomano = "III";
			break;		
		case 4:
			nroRomano = "IV";
			break;		
		case 5:
			nroRomano = "V";
			break;	
		case 6:
			nroRomano = "VI";
			break;		
		case 7:
			nroRomano = "VII";
			break;		
		case 8:
			nroRomano = "VIII";
			break;		
		case 9:
			nroRomano = "IX";
			break;		
		case 10:
			nroRomano = "X";
			break;		
		case 11:
			nroRomano = "XI";
			break;		
		case 12:
			nroRomano = "XII";
			break;
		case 13:
			nroRomano = "XIII";
			break;			
		case 14:
			nroRomano = "XIV";
			break;		
		case 15:
			nroRomano = "XV";
			break;		
		case 16:
			nroRomano = "XVI";
			break;		
	    case 17:
			nroRomano = "XVII";
			break;				
		case 18:
			nroRomano = "XVIII";
			break;	
		case 19:
			nroRomano = "XIX";
			break;		
		case 20:
			nroRomano = "XX";
			break;				
	}
		if (nros <= 0) {
			System.out.println("Perdón pero el número que ingrese no puede ser negativo o igual a cero");
		}else if(nros > 20){
			System.out.println("Perdón pero el número ingresado es mayor de lo esperado, por favor ingrese un número entre el 1 y 20");
		}else {
			System.out.println("El numero " + nros + " en romano es " + nroRomano);
		}
			
	}
	
}
