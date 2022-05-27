package unidad1_tp3_4;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=149  ;
		int contador=0; //contar los divisores
		for (int i = 1; i <= n; i++) {   // raiz cuadrada de n
			int resto = n%i;
			if(resto==0) {
				contador++;//encontre un divisor, incremento el contador de divisores
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
	
