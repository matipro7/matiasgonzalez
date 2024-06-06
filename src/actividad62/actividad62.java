package actividad62;

import java.util.Scanner;
import java.util.Arrays;

public class actividad62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		String [] appk = new String [5];
		
		for (int i = 0; i<5; i++) {
			System.out.println("tu apellido pe: ");
			appk [i] = scanner.next();
			
			
		}
		
		
		Arrays.sort(appk);
		
		
		for (String matigay : appk) {
	
		
		}
		System.out.println("este es el mas cercano a la A "+ appk [0]);
		System.out.println("este es el mas cercano a la Z "+ appk [appk.length-1]);
		// appk.length me da la cantidad de elementos del array (en este caso, 5). 
	}

}
