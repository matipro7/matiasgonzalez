package actividad61;

import java.util.Scanner;

public class actividad61 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);	
		
		String nombre;
		
		String apellido;
		
		System.out.println("Ingrese el nombre: ");
		nombre = scanner.next().toLowerCase();
		
		System.out.println("Ingrese el apellido: ");
		apellido = scanner.next().toUpperCase();
		
		
		
		
		
		System.out.println("El nombre es:"+ nombre +", y la cantidad de caracteres es de ="+ nombre.length() +" caracteres");
		System.out.println("El apellido es: "+ apellido +", y la cantidad de caracteres es de ="+apellido.length()+" caracteres");
		
		
	}

	
	}

	

	
