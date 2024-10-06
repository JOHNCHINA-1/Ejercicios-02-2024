package co.edu.tdea14082024;

import java.util.Scanner;

public class DiasDeLaSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nroDia = 0 ;
		String diaSemana = "", mes = "";
		
		System.out.println("ingrese el dia de la semana: ");
		nroDia = sc.nextInt();
		
		switch (nroDia) {
		case 7:
			nroDia = 7;
		    diaSemana = "Domingo";
			break;
		case 1:
			nroDia = 1;
			diaSemana = "Lunes";
			break;
		case 2:
			nroDia = 2;
			diaSemana = "Martes";
			break;
		case 3:
			nroDia = 3;
			diaSemana = "Miercoles";
			break;
		case 4:
			nroDia = 4;
			diaSemana = "Jueves";
			break;
		case 5:
			nroDia = 5;
			diaSemana = "Viernes";
			break;
		case 6:
			nroDia = 6;
			diaSemana = "Sabado";
			break;
	
		}
		
		if (nroDia > 7) {
			System.out.println("La semana solo tiene siete d�as");			
		}else if(nroDia < 1) {
			System.out.println("Ingrese un numero valido para saber que dia de la semana es (1-7)");
		}else {
			System.out.println("El dia de la semana es: " + diaSemana  );
		}
		
				
	}
	
	}
