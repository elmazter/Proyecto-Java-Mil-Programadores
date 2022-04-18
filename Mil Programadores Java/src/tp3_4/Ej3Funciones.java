package tp3_4;

import java.util.Scanner;

public class Ej3Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a , b , c;
		System.out.println("Ingrese el valor para A");
		a = teclado.nextInt();
		System.out.println("Ingrese el valor para B");
		b = teclado.nextInt();
		System.out.println("Ingrese el valor para C");
		c = teclado.nextInt();
		
		//calculamos el mayor		
		
		mostrarMayor(a,b,c);
		
		mostrarMenor(a,b,c);

	}

	private static void mostrarMenor(int a, int b, int c) {
		// TODO Auto-generated method stub
		int menor;
		if((a<b)&(a<c)){
			menor = a;
		}else{
			if(b<c){
				menor = b;
			}else{
				menor = c;
			}
		}
		System.out.println("Menor : "+ menor);
		
	}

	private static void mostrarMayor(int a, int b, int c) {
		// TODO Auto-generated method stub
		int mayor;
		if((a>b)&(a>c)){
			mayor = a;
		}else{
			if(b>c){
				mayor = b;
			}else{
				mayor = c;
			}
		}
		System.out.println("Mayor : "+ mayor);
	}

}
