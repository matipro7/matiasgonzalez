package actividad39;

import java.util.Scanner;

public class actividad39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner (System.in);
		
		
		String [] nom = new String [12];
		int [] eda = new int [12];
		
		for (int i =0; i< 11; i++)	 {
			
			System.out.println("jugador = "+ (i+1) );
			
			System.out.println("ingrese su nombre: ");
			nom[i] = dato.next();
			
			
			
			System.out.println("ingrese su edad: ");
			eda[i] = dato.nextInt();
			
			}

		 
		
		for (int k =0; k<=4; k++) {
		System.out.println("Nombre: " + nom[k]);
		System.out.println("edad: " + eda[k]);
		}
		
		
		
		
		
		
	}

}
