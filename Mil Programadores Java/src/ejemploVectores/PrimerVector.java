package ejemploVectores;

public class PrimerVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listaNumeros = new int[10];  // 0..9
		listaNumeros[0] = 45;
		listaNumeros[1] = 17;
		listaNumeros[7] = 50;
		listaNumeros[5] = 59;
		
		PrimerVector programa = new PrimerVector();
		//programa.mostrarVector(listaNumeros);
		//programa.ordenarVector(listaNumeros);
		
		for (int i = 0; i < listaNumeros.length; i++) {
			int n = listaNumeros[i];
			boolean verdadero = programa.esPrimo(n);
			if(verdadero){
				System.out.println("El numero "+ n+ " es PRIMO");
			}else{
				System.out.println(n + " No es PRIMO");
			}
		}
		
		
		
	}

	public boolean esPrimo(int n) {
		// TODO Auto-generated method stub
		boolean esPrimo=false;
		//System.out.println("Numero :" +n);
		int cantDivisores =0;
		if(n>0){
			for (int k = 2; k < n; k++) {
				int resto = n % k; // si el resto es 0 es divisible
				//System.out.println("Resto : "+resto);
				if(resto == 0){
					cantDivisores++;				
					// pregunto si K es par				
				}
				
			}// fin del ciclo
			if(cantDivisores==0){
				esPrimo=true;
			}
			
		}
		return esPrimo;
	}
	

	private void ordenarVector(int[] listaNumeros) {
		// TODO Auto-generated method stub
		
	}

	private void mostrarVector(int[] listaNumeros) {
		// TODO Auto-generated method stub
		for(int i =0; i<listaNumeros.length; i++){
			int valor = listaNumeros[i];
			System.out.println(valor);
		}
	}

}
