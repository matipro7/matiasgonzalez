package actividad11;

import java.util.Scanner;

public class actividad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		int num;
		
		System.out.println("Ingresar un numero: ");
		num = scanner.nextInt();
		
		if (num == 0) {
			System.out.println("\tTu numero es 0");
		}
		else if ( num < 0) {
			System.out.println("\tTu numero es negativo");
		}
		else if (num> 0) {
			System.out.println("\tTu numero es positivo");
			
		}
		
	}

}
