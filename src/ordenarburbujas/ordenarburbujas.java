package ordenarburbujas;

public class ordenarburbujas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		public class Burbuja {
		    public static void main (String[] args) {
		        int[] lista = {64, 34, 25, 12, 22, 11, 90};
		        ordenarBurbuja(lista);
		        System.out.println("Lista ordenada:");
		        for(int i=0; i<lista.length; i++) {
		            System.out.print(lista[i] + " ");
		        }
		    }

		    static void ordenarBurbuja(int[] arr) {
		        int n = arr.length;
		        for (int i = 0; i < n-1; i++)
		            for (int j = 0; j < n-i-1; j++)
		                if (arr[j] > arr[j+1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
		    }
		}
	}

}
