package co.edu.tdea09102024;

import java.util.Scanner;

public class LlamarPersona {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Hablar talk = new Hablar();
		
		Caminar walk = new Caminar();
		
		Persona person = new Persona();
		
		System.out.println("Responda las cosas sin aplicar espacios entre palabras");
		
		System.out.println("Ingrese el nombre: ");
		person.setNombre(sc.next());
		
		System.out.println("Ingrese su apellido: ");
		person.setApellido(sc.next());
		
		System.out.println("Ingrese su edad: ");
		person.setEdad(sc.nextInt());
		
		System.out.println("Ingrese su genero: ");
		person.setGenero(sc.next());
		
		System.out.println("Ingrese su direccion: ");
		person.setDireccion(sc.next());
		
		System.out.println("Ingrese la ciudad en la que reside: ");
		person.setCiudad(sc.next());
		
		System.out.println("Ingrese el pais en el que reside: ");
		person.setPais(sc.next());
		
		System.out.println("Ingrese su numero de telefono: ");
		person.setTelefono(sc.next());
		
		System.out.println("Ingrese su correo electronico: ");
		person.setEmail(sc.next());
		
		System.out.println("Ingrese cual es su ocupacion: ");
		person.setOcupacion(sc.next());
		
		System.out.println("Ingrese cual es su estado civil: ");
		person.setEstadoCivil(sc.next());
		
		System.out.println("Ingrese cuantos hijos tiene: ");
		person.setNumeroHijos(sc.nextInt());
		
		System.out.println("Ingrese cual es su nacionalidad: ");
		person.setNacionalidad(sc.next());
		
		System.out.println("Ingrese el idioma que hable: ");
		person.setIdioma(sc.next());
		
		System.out.println("Ingrese cuanto mide (Mts): ");
		person.setAltura(sc.nextDouble());
		
		System.out.println("Ingrese cuanto pesa (kg): ");
		person.setPeso(sc.nextInt());
		
		System.out.println("Ingrese cual es su color de ojos: ");
		person.setColorOjos(sc.next());
		
		System.out.println("Ingrese cual es su color de cabello: ");
		person.setColorCabello(sc.next());
		
		System.out.println("Ingrese cual es su tipo de sangre: ");
		person.setTipoSangre(sc.next());
		
		System.out.println("Ingrese el id: ");
		person.setNumeroIdentificacion(sc.next());
		
		System.out.println(person);	

		System.out.println("Ingrese cuanta distacia camina el sujeto (Mts): ");
		walk.setDistancia(sc.nextDouble());
		 
		System.out.println("Ingrese en cuanto tiempo completo el recorrido (Min): ");
		walk.setVelocidad(sc.nextDouble());
		
		System.out.println(walk);
		
		System.out.println("Ingrese cuanto duro conversacion con la persona de los datos (Min): ");
		talk.setDuracion(sc.nextInt());
		
		System.out.println(talk);

	}
}
