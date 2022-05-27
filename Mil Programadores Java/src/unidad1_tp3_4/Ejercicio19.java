package unidad1_tp3_4;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero mayor que 10");
		int k = teclado.nextInt();
		System.out.println("Los numeros primos menores que "+k+" son:");
		for (int i = 1; i < k; i++) {
			//para saber si un numero es primo
			int n=i; 
			int contador=0; //contar los divisores
			for (int j = 1; j <= n; j++) {   // raiz cuadrada de n
				int resto = n%j;
				if(resto==0) {
					contador++;
				}
				
			}// fin del algoritmo para saber si un numero es primo
			if(contador==2) {
				System.out.print(n + " - ");
			}
			
		}
		//garbage collector
		
		
		

	}

}
