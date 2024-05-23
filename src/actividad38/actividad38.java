package actividad38;

import java.util.Scanner;

public class actividad38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);	
		
		int min = 10000;
		int max = 0;
		int clien;
		
		for (int i=9; i<=19; i+=2) {
		
		System.out.println("Ingrese la cantidad de clientes a las: ("+i+" horas)");
		clien= scanner.nextInt();
		
		
		if ( clien > max ) {
			
			max = clien;
		}
			else if (clien<min) {
				min = clien;
				
		}
		 
		
		
		}
	
		System.out.println("La mayor cantidad de clientes: "+ max +" clientes" );
		System.out.println("El menor cantidad de clientes: "+ min +" clientes");
		
		
		
		
		
		
		
		
	}

}
