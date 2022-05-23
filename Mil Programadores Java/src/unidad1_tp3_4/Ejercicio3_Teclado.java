package unidad1_tp3_4;

import java.util.Scanner;

public class Ejercicio3_Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;     
		//captuurar valores desde el teclado  Scanner
		Scanner teclado = new Scanner(System.in);
		System.out.println("***** Ingrese los numeros a comparar *******");
		System.out.println("Ingrese en valor a :");
		a = teclado.nextInt();
		System.out.println("Ingrese en valor b :");
		b = teclado.nextInt();
		System.out.println("Ingrese en valor c :");
		c = teclado.nextInt();
		System.out.println("La comparación es: ");
		
		if(a>b) { //a es mas grande que b
			if(a>c) {
				System.out.println("El mayor es a: "+a);
			}else {
				System.out.println("El mayor es c: "+c);
			}
			
		}else{ //a no es mayor que b   // a es menor que b
			if(b>c) {
				System.out.println("El mayor es b: "+b);
			}else {
				System.out.println("El mayor es c: "+c);
			}
		}
		//muestre el menor
		if(a<b) { //a es mas grande que b
			if(a<c) {
				System.out.println("El menor es a: "+a);
			}else {
				System.out.println("El menor es c: "+c);
			}
			
		}else{ //a no es mayor que b   // a es menor que b
			if(b<c) {
				System.out.println("El menor es b: "+b);
			}else {
				System.out.println("El menor es c: "+c);
			}
		}

	}

}
