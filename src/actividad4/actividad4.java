package actividad4;

import java.util.Scanner;

public class actividad4 {

	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		
		int anos, mes, sem, dias;
		
		
		System.out.println("\tcalculadora de tiempo\n");
		
		System.out.println("ingrese anos: ");
		anos = dato.nextInt();
		System.out.println("ingrese meses: ");
		mes = dato.nextInt();
		System.out.println("ingrese semanas");
		sem = dato.nextInt();
		
		dias = anos*365 + mes*30 + sem*7;
		
		System.out.println("dias: " + dias);
		
		
		
		

	}

}
