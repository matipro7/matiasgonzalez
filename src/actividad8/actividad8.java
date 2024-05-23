package actividad8;

import java.util.Scanner;

public class actividad8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		float num;
		double exponente = 2;
		
		
		
		System.out.println("ingrese un numero con dos decimales: ");
		num = scanner.nextFloat();
		
		double potencia= (int) Math.pow(num, exponente);
		
		System.out.println("El numero igresado al cuadrado es: " + potencia);
		
		double random = Math.random() *7;
		int numtotal =(int)((int) potencia + random);
		
		System.out.println("El numero final es: " + numtotal);
		
		double raiz = Math.sqrt(numtotal);
		
		System.out.println("y su raiz cuadrada es: "+ raiz);
		
		
		
		
		
	}

}
