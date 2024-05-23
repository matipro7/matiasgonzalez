package actividad28;

public class actividad28 {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	
		int bateria = 100;
		
		while (bateria<=100 && bateria>0) {
			Thread.sleep(20);
			System.out.println("tenes: "+ bateria + "%");
			bateria--;
			
			if (bateria == 20) {
				Thread.sleep(1000);
			System.out.println("bateria baja");
				
			}
			
		}
		
		System.out.println("apagando...");
		
		
		
		
		
		
		
	}

}
