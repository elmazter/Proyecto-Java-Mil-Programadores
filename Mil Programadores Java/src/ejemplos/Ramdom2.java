package ejemplos;

import java.util.Random;

public class Ramdom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 50;
        int max = 100;
        int number;
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
        	number = random.nextInt(max - min) + min;
            System.out.print(number + " ");
		}
	}

}
