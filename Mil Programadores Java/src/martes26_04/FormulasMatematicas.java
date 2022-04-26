package martes26_04;

import java.util.Random;

public class FormulasMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Matematicas
		int a=10; int b=2;
		double potencia = Math.pow(a, b); // a^b
		System.out.println("potencia :" + potencia);
		double raizCuadrada = Math.sqrt(49);
		System.out.println("Raiz cuadrada : " + raizCuadrada);
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int aleatorio = 25 + r.nextInt(11);
			System.out.println("Aleatrorio : " +aleatorio);
			
		}
	}

}
