package unidad1_tp_5_6;

import java.util.Random;

public class MetodosFunciones {
	
	
	public void imprimirPorPantalla() { //metodo, se llama procedimiento
		// TODO Auto-generated method stub
		System.out.println("Hola, desde un metodo!");
		int a, b;
		a=10;  b=30;
		int suma = a +b;
		System.out.println("La suma es: "+suma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosFunciones c = new MetodosFunciones();
		c.imprimirPorPantalla(); 
		c.imprimirPorPantalla("Hola, paso por parametro"); 
		
		//crear una funcion
		int num = c.generarAleatorio(50,60);
		int numero2 = c.generarAleatorio();
		System.out.println("El numero aleatorio generado es: " + num);
		System.out.println("El numero aleatorio2 generado es: " + numero2);
		System.out.println("Fin del programa");
	}

	private int generarAleatorio(int min, int max) {
		// TODO Auto-generated method stub
		Random r = new Random(); 
		
		int numeroAleatorio;
		numeroAleatorio = r.nextInt(max - min) + min;
		
		return numeroAleatorio;
	}

	private void imprimirPorPantalla(String frase) {
		// TODO Auto-generated method stub
		System.out.println(frase);
	}

	public int generarAleatorio() {//metodo - funcion
		// TODO Auto-generated method stub
		
		Random r = new Random(); 
		int max = 10;
		int min = 1;
		int numeroAleatorio;
		numeroAleatorio = r.nextInt(max - min) + min;
		
		return numeroAleatorio;
	}

	

}
