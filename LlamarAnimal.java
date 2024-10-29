package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarAnimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Animal animal = new Animal();
		
		System.out.println("Responda sin dejar espacios");
		
		System.out.println("Ingrese el nombre del animal: ");
		animal.setNombre(sc.next());
		
		System.out.println("Ingrese el tipo del animal: ");
		animal.setTipo(sc.next());
		
		System.out.println("Ingrese la edad del animal (años): ");
		animal.setEdad(sc.nextInt());
		
		System.out.println(animal);
		
	}

}
