package actividad42;

import java.util.Scanner;

public class actividad42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int [] numeroxd = new int [3];
		
		double numrand = (Math.random() * 49);
		int numerorand = (int) numrand;
	
		System.out.println("numero random es: "+ numerorand);
		
		for (int i = 0; i<=2; i++) {
			
			System.out.println("ingrese un numero: ");
			numeroxd[i] = scanner.nextInt();
			
			if (numeroxd[i] == numerorand) {
				System.out.println("ganaste wachin");
				break;
			}
			
			else {
				System.out.println("incorrecto");
			}
			
		

	}
		System.out.println("te quedaste sin intentos fracasadoooo"); 
}
}