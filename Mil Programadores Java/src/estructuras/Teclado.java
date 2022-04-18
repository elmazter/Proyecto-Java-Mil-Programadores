package estructuras;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int valor = 0;
	
		while(valor !=5){
			System.out.println("Ingrese un numero // Presione 5 para salir");
			valor = teclado.nextInt();
			System.out.println("Ud ingreso : "+valor);
		}
		System.out.println("Fin del programa");
		
		
	}

}
