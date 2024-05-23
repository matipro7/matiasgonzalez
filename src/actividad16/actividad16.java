package actividad16;

import java.util.Scanner;

public class actividad16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int hora;
	int minuto;
	int seg;
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("ingrese que hora del dia es: ");
	hora = scanner.nextInt();
	
	System.out.println("ingrese que minuto del dia es: ");
	minuto = scanner.nextInt();
	
	System.out.println("ingrese que segundo del dia es: ");
	seg = scanner.nextInt();
	
	
	if (hora <= 23 || minuto <= 59 || seg <= 59 ) {
	
	System.out.println("valor valido");
	
	}
	
	else { 
		
		System.out.println("valor incorrecto");	
	}
	
	
	

}
}
