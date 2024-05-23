package actividad18;

import java.util.Scanner;

public class actividad18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		char talle;
		
		System.out.println("Ingrese una talla: ");
		talle = scanner.next().charAt(0);
		
		switch (talle) {
		
		case 's' :	
		
		System.out.println("su talle es pequeño");
		
		break;
		
		case 'm':
			
		System.out.println("su talle es medio");
		
		break;
		
		case 'l': 
		System.out.println("su talle es grande");
		
		break;
		
		case 'S':	
			
			System.out.println("su talle es pequeño");
			
			break;
			
			case 'M':
				
			System.out.println("su talle es medio");
			
			break;
			
			case 'L': 
			System.out.println("su talle es grande");
			
			break;
		default:
		System.out.println("error");
		
		}
		
	}
}
