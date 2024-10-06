package co.edu.tdea19092024;

import java.util.Scanner;

public class NrosRealesVec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Ingrese un numero dentro de un rango de 1 a 100: ");
		double Nros = sc.nextInt();
		
		if(Nros < 1 || Nros > 100) {
			
			System.out.println("Has ingresado un numero invalido, por favor intentelo de nuevo");
			Nros = sc.nextInt();
		}else {
	
			int[] total = new int[(int) Nros];
			int[] NroImpar = new int[(int) Nros];
			int[] NroPar = new int[(int) Nros];
			int ContPar = 0;
			int ContImpar = 0;
			
//Se recorre un bucle desde 1 hasta el numeros introducido, y se va llenando el vector total y 
//Si algun numero es par se añade al vector de los pares e incrementa el contador de los pares, y si es impar viceversa
			
				for (int i = 1; i <= Nros; i++) {
					total[i - 1] = i;
						
				if(i % 2 == 0) {
						NroPar[ContPar ++] = i;
						
				}else {
					NroImpar[ContImpar ++] = i;
				}					
			}	
				double SumaPar = 0;
				double SumaImpar = 0;
				
			for(int i = 0; i < ContPar; i++) {
					SumaPar += NroPar[i];	
					
			}for (int i = 0; i < ContImpar; i++) {
                SumaImpar += NroImpar[i];
            }
			
			//El ? es un operador que tiene una funcion parecida a un condicional, si lo que va antes del ?
			//Se cumple, realiza la operacion o arroja el resultado que va después del ?, sino arroja el resultado despues de :
			
			double PromedioPar = ContPar > 0 ? SumaPar / ContPar: 0;
			double PromedioImpar = ContImpar > 0 ? SumaImpar / ContImpar : 0;
			
			System.out.println("Numero ingresado: " + Nros);
			System.out.println("Cantidad de numeros pares: " + ContPar);
			System.out.println("Cantidad de numeros impares: " + ContImpar);
			System.out.println("Promedio de los numeros pares: " + PromedioPar);
			System.out.println("Promedio de los numeros impares: " + PromedioImpar);
			
		}
	}	
}