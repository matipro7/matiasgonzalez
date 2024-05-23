package actividad5;

import java.util.Scanner;

public class actividad5 {

	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		
		float valor;
		float raizc;
		int raize;
		
		System.out.println("ingrese un valor: ");
		valor = dato.nextFloat();
		
		raizc = (float) Math.sqrt (valor); 
		raize= (int) raizc;
		
		System.out.println("El resultado de el numero ingresado elevado al cuadrado es: " + raize);
		System.out.println("El resultado incluyendo decimales es: " + raizc);
		
		
		
		

	}

}
