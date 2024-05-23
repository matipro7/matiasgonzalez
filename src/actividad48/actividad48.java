package actividad48;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class actividad48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		
		String [] apellido = new String [4];
		
		for (int i = 0; i<4; i++) {
			
			System.out.println("apellido " + (i+1) + " : " );
			apellido[i] = scanner.next();
		}
		
		Arrays.sort(apellido);
		for (String seba : apellido ) {
			System.out.println(seba);
		}
		
		
		
		
		
	}

}
