package lunes18_04;

import java.util.Scanner;

public class Ejercicio1TP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un array de 10 de números enteros, con valores solicitados por teclado. Mostrar por
		consola el índice y el valor de cada elemento. Realizar dos métodos, uno para el ingreso de
		datos y otro para la salida de datos.*/
	
		int[] listaNumeros = new int[10];
		
		Ejercicio1TP3 tp = new Ejercicio1TP3();//creo un objeto, el objeto se llama tp
		tp.cargarLista(listaNumeros);
		tp.mostrarLista(listaNumeros);
	
	
	
	}

	private void mostrarLista(int[] listaNumeros) {
		// TODO Auto-generated method stub
		System.out.println("Los valores del Vector son: ");
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Posicion : "+(i+1) + " --> "+listaNumeros[i]);
		}
	}

	private void cargarLista(int[] listaNumeros) {
		// TODO Auto-generated method stub
		//Ncesito datos del teclado
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Vamos a solicitarle 10 números");
		for(int i=0; i<listaNumeros.length; i++){
			
			System.out.println("Ingrese el valor Nº "+ (i+1));
			int valor = teclado.nextInt();//indicarle al teclado que ingrese un valor (capturar un dato)
			listaNumeros[i] = valor;
		}
	}

}
