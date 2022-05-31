package unidad1_tp_5_6;

import java.util.Random;

public class TestAleatorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); 
		int max = 10;
		int min = 1;
		double numeroAleatorio; 
		numeroAleatorio = r.nextDouble();
		System.out.println("valor: " + numeroAleatorio);
	}

}
