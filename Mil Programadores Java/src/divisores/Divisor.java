package divisores;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 59; 
		int sumaPar=0;  boolean esPrimo=true;
		for (int k = 2; k < n; k++) {
			int resto = n % k; // si el resto es 0 es divisible
			if(resto == 0){
				esPrimo=false;
				System.out.println("Divisor: " + k);
				// pregunto si K es par
				if(k % 2 ==0){
					System.out.println("K: "+k + " es PAR");
					sumaPar = sumaPar + k;
				}
			}
			
		}
		if(esPrimo){
			System.out.println("El numero: "+n + " es PRIMO");
		}else{
			System.out.println("El numero: "+n + " es NO ES PRIMO");
		}
		System.out.println("Suma de los divisores PAR : "+ sumaPar);
	}

}
