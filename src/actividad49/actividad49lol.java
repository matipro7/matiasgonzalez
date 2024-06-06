package actividad49;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class actividad49lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		int dni[];
		
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantos DNI´S vas a ingresar: ?"));
		
		dni= new int [cant];
		
		for ( int i=0; i<=cant; i++) {
			System.out.println("ingrese el"+ (i+1)+"DNI");
			dni [i]= scanner.nextInt();

		}
		for (int j= 0; j<=(cant -1); j++ ) {
			
			for(int k=0; k<= (cant - j - 1); k++) {
			
				if (dni[k] > dni[k +1]) {
					
					int temporal = dni[k+1];
					
					dni [k+1]= dni [k];
					dni [k] = temporal;
					
					
				
					
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
