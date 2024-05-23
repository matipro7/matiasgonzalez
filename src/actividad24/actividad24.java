package actividad24;

import java.util.Scanner;

public class actividad24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		int n1, n2, suma;
		 int salir;
		
		boolean o = true;
		
		while (o) {
		
		System.out.println("ingrese un numero: ");
		n1= scanner.nextInt();
		
		System.out.println("ingrese otro numero: ");
		n2 = scanner.nextInt();
		
		suma= n1 + n2;
		
		System.out.println("La suma de ambos numeros es: "+ suma);
		
		System.out.println("ingrese 0 para salir, sino cualquier otra cosa: ");
		salir = scanner.nextInt();
		
		if (salir== 0) {
		
			System.out.println("Ha salido del programa");
			o = false;
		}
		

	}

	}
}