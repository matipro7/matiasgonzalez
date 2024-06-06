package actividad51;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class actividad51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int matiyciro [] []; 
		
		int fila = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de filas que tiene tu array: ?"));
		int columnas = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de columnas que tiene tu array: ?"));
		
		
		matiyciro = new int [fila] [columnas];
		
		for (int i = 0; i<fila; i++) {
			for(int j = 0; j<columnas;j++) {
				System.out.println("matriz ["+i+"] ["+j+"]: ");
				matiyciro [i] [j] = scanner.nextInt();
			}
			
		}
		
		for (int i = 0; i<fila; i++) {
			for(int j = 0; j<columnas;j++) {
				
					
				System.out.print(matiyciro [i] [j]);
				
			
				
				}
			System.out.println("");
			}
			
			
		
		
		
	}

}
