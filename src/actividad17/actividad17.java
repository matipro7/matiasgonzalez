package actividad17;

import java.util.Scanner;

public class actividad17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3;
		float nummay, nummed, nummen;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("ingrese un numero: ");
		n1 = scanner.nextInt();
		
		System.out.println("ingrese otro numero: ");
		n2 = scanner.nextInt();
		
		System.out.println("ingrese otro numero: ");
		n3 = scanner.nextInt();
	
		if (n1> n2 && n2> n3) {
			System.out.println("El mayor es: "+n1);
			System.out.println("El intermedio es: "+n2);
			System.out.println("El menor es: "+n3);
		}
		else if (n2>n1 && n1>n3) {
			System.out.println("El numero mayor es: "+ n2);
			System.out.println("El numero intermedio es: "+ n1);
			System.out.println("El numero menor: "+ 3);
		}
		else if (n3>n1 && n1> n2) {
			System.out.println("El numero mayor es: "+ n3);
			System.out.println("El numero intermedio es: "+ n1);
			System.out.println("El numero menor es: "+ n2);
			
		}
		}
}