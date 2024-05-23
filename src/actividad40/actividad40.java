package actividad40;

import java.util.Scanner;

public class actividad40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		int []temp = new int [6];
		int suma = 0;
		for (int i =0; i<5; i++)	 {
			System.out.println((i+1));
			System.out.println("temperatura:  ");
			temp[i] = scanner.nextInt();
			
			suma = suma + temp[i];
			
			
		}
		
		
		
		for (int k =0; k<=4; k++)	 {
		
		System.out.println(temp[k]);
		
	}
		System.out.println((suma / 5));
}
}