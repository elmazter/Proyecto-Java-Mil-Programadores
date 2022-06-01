package unidad1_tp_5_6;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio17 ej17 = new Ejercicio17();
		//ingresar un numero
		int numero = ej17.ingresarNumero();
		
		//verificar si es o no es primo
		boolean chequeoPrimo =ej17.esPrimo(numero);
		//mostrar resultado
		ej17.mostrarResultado(chequeoPrimo, numero);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	private void mostrarResultado(boolean chequeoPrimo, int numero) {
		// TODO Auto-generated method stub
		if(chequeoPrimo) {
			System.out.println("El numero "+numero +  " ES Primo " );
		}else {
			System.out.println("El numero "+numero +  " NO ES Primo ");
		}
	}

	private boolean esPrimo(int p) {
		// TODO Auto-generated method stub
		boolean primo;
		
		int contador=0; //contar los divisores
		for (int i = 1; i <= p; i++) {   // raiz cuadrada de n
			int resto = p%i;
			if(resto==0) {
				contador++;//encontre un divisor, incremento el contador de divisores
			}
			
		}
		//System.out.println("Contador: " +contador);
		if(contador==2) {
			primo = true;
		}else {
			primo = false;
		}
		
		return primo;
	}

	private int ingresarNumero() {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, ingrese un numero entero");
		num = teclado.nextInt();
		return num;
	}

}
