package arrays;

public class Ordena {
	public static void main(String[] args) {
		int[] data={15, 60, 8, 16, 4, 27, 12, 35};
		
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
