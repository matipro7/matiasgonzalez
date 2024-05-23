package actividad19;

import java.util.Scanner;

public class actividad19 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		int num;
		
		System.out.println("• 1 es café cortado,\r\n"
				+ "• 2 es café Latte,\r\n"
				+ "• 3 es café solo,\r\n"
				+ "• 4 es café lágrima.\r\n"
				+ "• 5 salir del programa.");
		
		System.out.println("Que cafe quiere? ");
		num = scanner.nextInt();
		
		switch (num) {
		
		case 1: 
			System.out.println("Ha seleccionado la opcion de cafe cortado, disfrute su cafe :)");
			break;
		case 2: 
			System.out.println("Ha seleccionado la opcion de cafe Latte, disfrute su cafe :) ");
			break;
		case 3: 
			System.out.println("Ha seleccionado la opcion de cafe Solo, disfrute su cafe :)");
			break;
		case 4: 
			System.out.println("Ha seleccionado la opcion de cafe Lagrima, disfrute su cafe :)");
			break;
		case 5: 
			System.out.println("Ha seleccionado salir del programa");
			break;
			
			default: 
				System.out.println("El numero ingresado no es valido");
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
