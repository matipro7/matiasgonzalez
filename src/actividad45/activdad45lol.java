package actividad45;

import java.util.Scanner;

public class activdad45lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
				
		
		int [] num = {1011,2367, 8748, 9121, 817, 6423};
		String [] nom = {"enrique", "liliana", "lucas", "juan", "fiorela", "ariel", "daiana"};
		int ingreso;
		
		System.out.println("Para encontrar a un individuo, ingresar número de socio:");
		ingreso = scanner.nextInt();
		
		
		for (int i =0;i<=6; i++) {
		
			
		
		if(ingreso == num [i] ) {
			
			System.out.println("El socio se llama: "+ nom [i]);
		}
		
		}
		
	}

}
