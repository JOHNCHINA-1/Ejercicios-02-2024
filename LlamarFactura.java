package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarFactura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Factura check = new Factura();
		
		System.out.println("Responda sin dejar espacios entre palabras");

		System.out.println("Ingrese la referencia de la factura: ");
		check.setRefFactura(sc.next());
		
		System.out.println(check);

	}

}
