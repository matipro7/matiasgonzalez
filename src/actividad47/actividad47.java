package actividad47;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class actividad47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner = new Scanner (System.in);
		
		int [] notas = new int [4];
		char apellido;
		
	
		for(int i = 0; i<Array.getLength(notas); i++) {
			
			System.out.println("nota"+(i+1)+ ":");
			notas [i] = scanner.nextInt();
			
		}
		for(int i = 0; i<Array.getLength(notas); i++) {
			
			System.out.println("desordenado: "+ notas[i]);
			
		}
		
		System.out.println("ingrese el apellido del alumno: ");
		apellido = scanner.next().charAt(0);
		
		Arrays.sort(notas);
		
		for (int num : notas) {
			System.out.println("ordenado de menor a mayor: "+ num);
			
		}
		
		
		
		
		
	}

}
