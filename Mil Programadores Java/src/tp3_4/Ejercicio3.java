package tp3_4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definimos las 3 variables
		Scanner teclado = new Scanner(System.in);
		int a , b , c;
		System.out.println("Ingrese el valor para A");
		a = teclado.nextInt();
		System.out.println("Ingrese el valor para B");
		b = teclado.nextInt();
		System.out.println("Ingrese el valor para C");
		c = teclado.nextInt();
		
		//calculamos el mayor
		int mayor, menor;
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

}
