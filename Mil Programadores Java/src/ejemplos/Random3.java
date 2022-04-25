package ejemplos;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int a = r.nextInt(100)+200;
			System.out.println(a);
		}
	}

}
