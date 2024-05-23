package actividad9;

import java.util.Scanner;

public class actividad9 {
public static void main(String[] args) {
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
	
	
	
	
	
	
}

	
	
	
	
	
}
