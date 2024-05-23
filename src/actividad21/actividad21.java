package actividad21;

public class actividad21 {

	public static void main(String[] args) throws InterruptedException {
		
		int temp = 35;
		
		
		while (temp<=100) {
			
			Thread.sleep(700);
			
			System.out.println("Temperatura="+ temp);
		temp+=2;
		
		switch(temp) {
		
		
			case 87: System.out.println("¡¡CUIDADO, TEMPERATURA ELEVADA!!");
			break;
			case 99: System.out.println("Apagando pc");
			break;
		
		}
		
		}
	}
}
