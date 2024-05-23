package actividad23;

import java.util.Scanner;

public class actividad23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String nombre;
		String apellido;
		System.out.println("Ingrese su nombre: ");
		nombre = scanner.next();

		System.out.println("Ingrese su apellido: ");
		apellido = scanner.next();
	
		double numrand = (Math.random() * 99);
		int numerorand = (int) numrand;
		System.out.println("nombre =" + nombre);
		System.out.println("apellido =" + apellido);
		System.out.println("su numero es =" + numerorand);
		int contador = 0;
	    boolean condicion = true;
	    int num;
	    
	    
	    while (condicion) {
	    System.out.println("intento: " + contador);
	    	
	    System.out.println("ingresar un numero: ");
	    num = scanner.nextInt();
	    
	    contador++;
	    
	    
	    if ( numerorand == num) {
   			System.out.println("¡¡Ganasteee el bingo viejo verdee JAJA!!");
   			condicion = false;
	            }
	    else if (contador == 5) {
	    	System.out.println("no ganaste el bingo");
	           condicion = false;
	          
	   	    }
		}
	   
	    
		
		

	}

}
