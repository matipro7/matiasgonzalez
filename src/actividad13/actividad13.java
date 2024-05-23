package actividad13;

import java.util.Scanner;

public class actividad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		char talle;
		
		System.out.println("Ingrese una talla");
		talle = scanner.next().charAt(0);
		
		if(talle == 's' ||talle == 'S') {
			
			System.out.println("Quedan disponibles 5 remeras");
	
		}
		else if (talle == 'm' || talle == 'M') {
			
			System.out.println("Quedan disponibles 2 remeras");
		}
		else if (talle == 'L'|| talle== 'l') {
			
			System.out.println("No nos quedan talles disponibles :(");
		}
			else {
				System.out.println("No tenemos remeras de tu talle");
				
			}
		}
		
		
		
		
		
		
		
		
	}


