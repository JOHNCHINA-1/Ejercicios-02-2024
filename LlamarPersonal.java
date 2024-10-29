package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarPersonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Personal employee = new Personal();
		
		System.out.println("Responda sin dejar espacios entre palabras");
		
		System.out.println("Ingrese el nombre del empleado: ");
		employee.setNombre(sc.next());
		
		System.out.println("Ingrese el apellido del empleado: ");
		employee.setApellido(sc.next());
		
		System.out.println("Ingrese la fecha de contratacion del personal ");
		employee.setFechaContratacion(sc.next());
		
		System.out.println("Ingrese la ocupacion del sujeto: ");
		employee.setOcupacion(sc.next());
		
		System.out.println(employee);

	}

}
