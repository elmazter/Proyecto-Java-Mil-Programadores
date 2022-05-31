package unidad1_tp_5_6;

import java.util.Random;

public class TestAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numeros aleatorios para pesos de personas
		Random r = new Random(); 
		int max1 = 100;
		int min1 = 30;
		
		int max2 = 10;
		int min2 = 0;
		
		int numeroAleatorio; 
		
		// 25.56  = 25 + 0.56   // 95.32 = 95 + 0.32
		double peso=0;
		numeroAleatorio = r.nextInt(max1 - min1) + min1;
		peso = peso + numeroAleatorio;
		numeroAleatorio = r.nextInt(max2 - min2) + min2;
		peso = peso + (double)numeroAleatorio/10;
		System.out.println(peso);
	}

}
