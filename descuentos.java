package co.edu.tdea14082024;

import java.util.Scanner;

public class descuentos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int edad = 0, valorCompra = 0 ;
		
		System.out.println("Ingrese el valor de su compra:");
		valorCompra = sc.nextInt();
		
		if (valorCompra >= 20000 && edad > 18){
			double descuento = (valorCompra * 0.2);
			double precioTotal = valorCompra - descuento;
			System.out.println("El valor del descuento es: " + descuento + " Y el valor total de la compra es: " + precioTotal);
		}else if (valorCompra >= 20000 && edad >= 30) {
			double descuento = valorCompra * 0.3;
			double valorTotal = valorCompra - descuento;
			System.out.println("El valor del descuento es: " + descuento + " Y el valor total de la compra es: " + valorTotal);
		}else {
			
		}
					
	
		}
		
		
	}
