package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarPersona2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Persona2 person = new Persona2();
		
		System.out.println("Responda sin dejar espacios entre palabras");
		
		System.out.println("Ingrese el nombre de la persona: ");
		person.setName(sc.next());
		
		System.out.println("Ingrese el documento de identidad de la persona: ");
		person.setDocument(sc.next());
		
		System.out.println("Ingrese el correo electronico de la persona: ");
		person.setEmail(sc.next());
		
		System.out.println("Ingrese el numero de telefono de la persona: ");
		person.setNumber(sc.next());
		
		System.out.println("Ingrese la direccion de la persona: ");
		person.setAdress(sc.next());
		
		System.out.println(person);
		

	}

}
