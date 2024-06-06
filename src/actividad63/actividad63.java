package actividad63;

import java.util.Scanner;

public class actividad63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);

		String correo;
		int contrasena, posicionArroba, posicionpunto;
		do {
		System.out.println("ingrese su correo electronico: ");
		correo = scanner.next();
		
		posicionArroba = correo.indexOf('@');
		posicionpunto = correo.indexOf('.');
		
		if (posicionArroba<0 && posicionpunto <0 ) {
		System.out.println("no tiene los digitos requeridos");
			
		}
		 }while (posicionArroba<0 && posicionpunto<0);
	
		System.out.println("ingrese su contraseña: ");
		contrasena = scanner.nextInt();
		
		
		
	}

	
	
}

