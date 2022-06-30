package arrays;

public class Ordena {
	public static void main(String[] args) {
		int[] data={1, 60, 80, 16, 4, 7, 1, 35};
		
	        for (int i = 0; i < data.length; i++) {
	            for (int j = i; j < data.length; j++) {
	                if (data[i] > data[j]) {
	                    int aux = data[j];
	                    data[j] = data[i];
	                    data[i] = aux;
	                }
	            }
	        
	        	}
	        //mostramos
	        for (int integer : data) {
				System.out.print(integer + " " );
			}
}
}
