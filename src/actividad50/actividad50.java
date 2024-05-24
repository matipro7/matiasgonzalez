package actividad50;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class actividad50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int plata[], cant, aux;
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("cuantos arrays queres: "));	
		
		plata = new int [cant];
		
		for (int i = 0; i<cant; i++) {
			
			System.out.println((i+1 ) + " ingresa la cantidad que quiere apostar: ");
			plata[i] = scanner.nextInt();
			
			
		}
		
		for (int i = 0; i<(cant-1);i++){
			for (int j = 0; j<(cant-1); j++) {
				if (plata[j] > plata[j+1]){
					aux = plata[j];
					plata[j] = plata[j+1]; 
					plata[j+1] = aux;
					
				}
				
				
				
			}
			
			
		}
		System.out.print("\ncreciente\n ");
		System.out.print("apuesta minima: ");
		for (int i = 0; i<cant;i++) {
			if (500>plata[i]) {
				
				continue;
			}	
			System.out.print(plata[i] + " - \n");
			
		}
		System.out.println("\nDecreciente");
		System.out.print("apuesta maxima: ");
		for (int i = (cant-1); i>=0;i--) {
			if (500>plata[i]) {
				
				continue;
			}
			System.out.println( plata[i] + " - ");
			
		}
		
		
		
		
		
	}

}
