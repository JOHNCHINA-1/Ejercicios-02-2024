package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarDiagnostico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Diagnostico diagnosis = new Diagnostico();
		
		System.out.println("Responda sin dejar espacios entre palabras");
		
		System.out.println("Ingrese la descripcion del diagnosis: ");
		diagnosis.setDescripcion(sc.next());
		
		System.out.println("Ingrese la descripcion del diagnosis: ");
		diagnosis.setFecha(sc.next());
		
		System.out.println(diagnosis);
	
	}

}
