package co.edu.tdea24092024;

import java.util.Scanner;

public class PruebaString {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
        String VB = "abcdefghijklmnopqrstuvwxyz";
        String VE = "bcdefghijklmnopqrstuvwxyza";
        
        while (true) {
        	
            System.out.println("Menú:");
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 3) {
            	
            	System.out.println("Terminando progreso");
                break;
            }
            
            System.out.print("Ingrese el texto: ");
            String texto = sc.nextLine();
            String resultado = "";
            
            if (opcion == 1) {
            	
                for (int i = 0; i < texto.length(); i++) {
                    String c = texto.substring(i, i + 1);
                    int index = VB.indexOf(c);
                    
                    if (index != -1) {
                        resultado += VE.substring(index, index + 1);
                        
                    }else {
                        resultado += c; // Si el carácter no está en VB, se deja igual
                    }
                }
                
                System.out.println("Texto encriptado: " + resultado);
                
             }else if (opcion == 2) {
                
                for (int i = 0; i < texto.length(); i++) {
                    String c = texto.substring(i, i + 1);
                    int index = VE.indexOf(c);
                    
                    if (index != -1) {
                        resultado += VB.substring(index, index + 1);
                    } else {
                        resultado += c; // Si el carácter no está en VE, se deja igual
                    }
                }
                System.out.println("Texto desencriptado: " + resultado);
                
            } else {
                System.out.println("Opción no válida.");
            }
        }
	 }
}

	
