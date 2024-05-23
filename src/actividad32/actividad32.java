package actividad32;

import java.util.Scanner;

public class actividad32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int num;
		
		System.out.println("ingrese un numero: ");
		num = scanner.nextInt();
		
		for (int i = 1; i<=20;i++ ) {
			
			System.out.println(num + " x " + i + "=" + (i * num));
			
		}
		
		
	}

}
