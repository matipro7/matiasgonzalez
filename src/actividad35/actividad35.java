package actividad35;

import java.util.Scanner;

public class actividad35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int cal;
		int suma = 0;
		float division;
		System.out.println("ingresa 5 notas");
		for (int i =1; i<=5; i++) {
			
			System.out.println("profesor ingrese la calificacion: ");
			cal = scanner.nextInt();
		
			suma = cal + suma;
			
			
	}
			division = suma / 5;
	
			System.out.println("promedio del alumno es = "+ division);
}
}