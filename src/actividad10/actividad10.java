package actividad10;

import java.util.Scanner;

public class actividad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);

		String nombre;
		String apellido;
		System.out.println("Ingrese su nombre: ");
		nombre= scanner.next();
		
		System.out.println("Ingrese su apellido: ");
		apellido= scanner.next();
		
		
		double numrand = (Math.random() * 99);
		int numerorand = (int) numrand;
		
		System.out.println("nombre ="+ nombre);
		System.out.println("apellido =" + apellido);
		System.out.println("su numero es =" + numerorand);
		
		int numele;
		
		System.out.println("Ingresar un numero entre 0 y 99: ");
		numele = scanner.nextInt();
		
		if (numele == numerorand) {
			System.out.println("¡¡Ganasteee!!");
			}
		else {
			System.out.println("Perdiste wachin, tan tonto sos?? solo tenias que poner el numero que te di");
		}
		
		
		
		
		
	}

}
