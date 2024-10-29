package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarElementoFactura {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ElementoFactura object = new ElementoFactura();
		
		System.out.println("Responda sin dejar espacios entre palabras");

		System.out.println("Ingrese el nombre del elemento: ");
		object.setElemento(sc.next());
		
		System.out.println("Ingrese el precio del objeto: ");
		object.setPrecio(sc.nextInt());
		
		System.out.println("Ingrese la cantidad de objetos : ");
		object.setCantidad(sc.nextInt());
		
		System.out.println(object);

	}

}
