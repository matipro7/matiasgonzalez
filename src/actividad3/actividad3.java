package actividad3;

import java.util.Scanner;

public class actividad3 {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		float num1, num2;

		System.out.println("ingresar un numero");
		num1 = dato.nextFloat();

		System.out.println("ingrese otro numero");
		num2 = dato.nextFloat();

		float sum = num1 + num2;
		int sument = (int) sum;
		float rest = num1 - num2;
		int restent = (int) rest;
		float mult = num1 * num2;
		int multent = (int) mult;
		float div = num1 / num2;
		int divent = (int) div;

		System.out.println("La suma de los numeros en N enteros es: " + sument);
		System.out.println("La suma de los numeros con decimales es: " + sum);
		System.out.println("La resta de los numeros en N enteros es: " + restent);
		System.out.println("La resta de los numeros con decimales es: " + rest);
		System.out.println("La multiplicacion de los numeros en N enteros es: " + multent);
		System.out.println("La multiplicacion de los numeros con decimales es  " + mult);
		System.out.println("La division de los numeros en N enteros es: " + divent);
		System.out.println("La division de los numeros con decimales es: " + div);
		

	}

}
