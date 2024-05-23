package actividad26;

import java.util.Scanner;

public class actividad26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		int contrasena = 2007;
		int numero;
		int intento = 3;
		
		do {
		
		System.out.println("Tiene: "+ intento+ "intentos");
		
		intento --;
		
		System.out.println("Ingrese su contraseña: ");
		numero = scanner.nextInt();
		
		}
		while (intento>0 && numero != contrasena) ;
			
			if(numero == contrasena) {
				
				System.out.println("Ingresando...");
				
			}
				else if (intento == 0) {
					System.out.println("Usuario bloqueado");
				}
			
				
					
			
			
		
				
				
				
			
			
			
			}

			
			
		
		
		
		

	}


