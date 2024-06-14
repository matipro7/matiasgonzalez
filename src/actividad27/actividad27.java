package actividad27;

import java.util.Scanner;

public class actividad27 {

	public static void main(String[] args) {

		
		

		Scanner scanner = new Scanner (System.in);
		
		int contrasena = 2007;
		int numero;
		int intento = 3;
		boolean condicion = true;

	
		while (condicion) {
			
			System.out.println("Tiene: "+ intento+ "intentos");
			
			intento --;
			
			System.out.println("Ingrese su contraseña: ");
			numero = scanner.nextInt();
			
			if(numero == contrasena) {
				
				System.out.println("Ingresando...");
				condicion = false;
			}
				else if (intento == 0) {
					System.out.println("Usuario bloqueado");
					condicion = false;
				}

		}
		}
}
