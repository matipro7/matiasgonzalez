package actividad6;

import java.util.Scanner;

public class actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
	
		float num;
		
		
		System.out.println("Ingrese el valor de su calificacion (incluyendo decimales): ");
		num = scanner.nextFloat();
		
		int numredond = (int) Math.round(num);
		
		System.out.println("Su calificacion es de: "+ numredond + " puntos:)" );
		
		
		
		
		
		
		
		
	}

}
