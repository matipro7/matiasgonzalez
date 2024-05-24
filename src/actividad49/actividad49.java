package actividad49;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class actividad49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int dni[], cant, aux;
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("cuantos arrays queres: "));	
		
		dni = new int [cant];
		
		for (int i = 0; i<cant; i++) {
			
			System.out.println((i+1 ) + " ingresa el dni: ");
			dni[i] = scanner.nextInt();
			
			
		}
		
		for (int i = 0; i<(cant-1);i++){
			for (int j = 0; j<(cant-1); j++) {
				if (dni[j] > dni[j+1]){
					aux = dni[j];
					dni[j] = dni[j+1]; 
					dni[j+1] = aux;
					
				}
				
				
			}
			
			
		}
		System.out.print("\ncreciente\n ");
		for (int i = 0; i<cant;i++) {
			
			System.out.print(dni[i] + " - \n");
			
		}
		System.out.println("\nDecreciente");
		
		for (int i = (cant-1); i>=0;i--) {
			System.out.println(dni[i] + " - ");
			
		}
	}

}
