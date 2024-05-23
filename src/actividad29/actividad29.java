package actividad29;

public class actividad29 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for (int bateria = 100; bateria>0; bateria-- ) {
			Thread.sleep(20);
			System.out.println("tenes: "+ bateria + "%");
			
			
			if (bateria == 20) {
				Thread.sleep(1000);
			System.out.println("bateria baja");
			
			
		}
		
			
		
		
		
	}
		System.out.println("apagando...");
}
}