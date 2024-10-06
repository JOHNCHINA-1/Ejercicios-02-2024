package co.edu.tdea29082024;

public class SumaNros {

	public static void main(String[] args) {
		
		int sumaNros = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 7 == 0) {
				sumaNros = i += 1;
			}
		}
		
		System.out.println("la suma de los números del 1 al 100 que son multiplos de siete es: " + sumaNros);
	}

}
