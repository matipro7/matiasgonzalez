package actividad36;

import java.util.Scanner;

public class actividad36 {

	public static void main(String[] args) {
	
		Scanner cloty = new Scanner (System.in);
		
		long ing;
		
		int mayor = 0;
		
		int suma= 0;
		
		int hora=8;
		
			for (int i =8; i<=17; i++) {
			
			System.out.println("profesor ingrese los ingresos de la hora:  "+ i);
			
			
				ing = cloty.nextInt();
			
				suma = (int)ing + suma;
			
			if ( ing > mayor ) {
				
				mayor = (int)ing;
			
				hora = i;
				
			}
			
			
			
			}
		
			System.out.println("El ingreso diario fue: "+ suma);
			System.out.println("El mayor ingreso del dia fueron: "+ mayor +" pesos, a las  " + hora + " horas");
		
		
	}
		

		
	}
	
	

