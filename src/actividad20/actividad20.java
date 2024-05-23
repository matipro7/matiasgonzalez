package actividad20;

public class actividad20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int contador = 1;

		while (contador <= 100) {

			Thread.sleep(1500);

			System.out.println("tenes estos seguidores: " + contador);

			contador++;

		}

	}

}
