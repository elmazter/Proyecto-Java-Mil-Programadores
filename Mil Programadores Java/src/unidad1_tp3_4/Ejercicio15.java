package unidad1_tp3_4;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4523  ;
		int contador=0;
		for (int i = 1; i <= 4563; i++) {   // raiz cuadrada de n
			int resto = n%i;
			if(resto==0) {
				contador++;
			}
			
		}
		System.out.println("Contador: " +contador);
		if(contador==2) {
			System.out.println("El Numero : "+ n +  " ES PRIMO");
		}else {
			System.out.println("NO ES PRIMO");
		}
		
	}

}
	
