package actividad15;

import java.util.Scanner;

public class actividad15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		float costo;
		float descuento;
		
		System.out.println("Gasto Total: ");
		
		costo = scanner.nextFloat();
		descuento = (float) (costo * 0.10) ;
		float gastot = costo - descuento;
		
		
		if (costo > 15000 ) {
			
		System.out.println("El costo total de la compra es: "+ gastot );
		System.out.println("Se le ha descontado: "+ descuento);
		}
		
		else { 
			
			System.out.println("El costo total es: "+ costo);
		
		}
			
		
		
	
			
			
			
			
			
			
		}
	}


