package actividad45;

import java.util.Scanner;

public class actividad45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
	int [] socios = {1001, 2367,8748,9121,817,6423,2034};
	String [] nombres = {"enrique","liliana","lucas","juan","fiorella","ariel","daiana"};
	int ingreso;
	
	System.out.println("ingresa algun numero de un socio: ");
	ingreso = scanner.nextInt();
	
	for (int i = 0; i<=6; i++) {
		
		
		
		if (ingreso == socios[i]) {
			System.out.println("este numero corresponde a : "+ nombres[i]);
			break;
		}
		
	}

		
		
		
		
		
		
		
		
		
		
	}

}
