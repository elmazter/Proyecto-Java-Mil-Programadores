package arrays;

import java.util.Scanner;

public class ArrayTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[3];
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		numeros[0] = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		numeros[1] = teclado.nextInt();
		System.out.println("Ingrese el tercer numero");
		numeros[2] = teclado.nextInt();
		
		mostrarArray(numeros);
		int mayor = devolverMayor(numeros);
		System.out.println("Fin del Programa");
		System.out.println("Mayor es : " + mayor);
		
		
		
	}

	private static int devolverMayor(int[] numeros) {
		// TODO Auto-generated method stub
			int mayor=0;
			int a = numeros[0];
			int b = numeros[1];
			int c = numeros[2];
			if(a > b){
				if(a > c){
					System.out.println("El mayor es A" + a);
					mayor = a;
				} else{
					if(b > c){
						System.out.println("El mayor es B "+b);
						mayor =b;
					}else{
						System.out.println("El mayor es C "+c);
						mayor = c;
					}
				}
				
			}
			
			
			
		return mayor;
	}

	private static void mostrarArray(int[] numeros) {
		// TODO Auto-generated method stub
		//mostrar por pantalla
				for (int i=0; i< numeros.length ; i++) {
					System.out.println("Valor : " + numeros[i]);
				}
				System.out.println("Fin del metodo");
	}

}
