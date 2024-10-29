package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarElementoHistorico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ElementoHistorico hElement = new ElementoHistorico();
		
		System.out.println("Responda sin dejar espacios entre palabras");

		System.out.println("Ingrese la referencia del elemento historico: ");
		hElement.setRefHistorico(sc.next());
		
		System.out.println(hElement);

	}

}
