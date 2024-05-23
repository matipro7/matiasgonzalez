package actividad34;

import java.util.Scanner;

public class actividad34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner scanner = new Scanner (System.in);
		long ingreso;
		
		
		for (int i =1; i<=12; i++) {
			
			System.out.println("mes = "+ i);
			
			System.out.println("ingrese su ingreso de este mes: ");
			ingreso = scanner.nextInt();
			
			if (ingreso<=100000) {
					
				System.out.println("el mes = "+ i +" hubo un ingreso menor a 100000");
			}
	}

}
}