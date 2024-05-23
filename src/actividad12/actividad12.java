package actividad12;

import java.util.Scanner;

public class actividad12 {

	public static void main(String[] args) {
		

		Scanner mati = new Scanner (System.in);
		
	int calificacion ;
	System.out.println("ingresa un numero: ");
	calificacion = mati.nextInt();
	
	if (calificacion>=1 && calificacion<=3 ) {
	
	System.out.println("a diciembre paaa");
		
		
	}
	
	else if (calificacion>3 && calificacion<6) {
		
	System.out.println("a piaaa");	
	
	}	
	
	
	else if (calificacion>=6 && calificacion<=7) {
		
		System.out.println("aprobado");	
		
	}	
		
	else if (calificacion>=8 && calificacion<=9) {
		
		System.out.println("alta nota");
		
	}	
	
	
	else if (calificacion == 10) {  
		
		System.out.println("excelente makina");
	
	}
	
	else {
		System.out.println("valor incorrecto");
		
	}	

}
}