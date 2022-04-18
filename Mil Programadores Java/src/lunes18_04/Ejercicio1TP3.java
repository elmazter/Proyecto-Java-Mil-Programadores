package lunes18_04;

import java.util.Scanner;

public class Ejercicio1TP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un array de 10 de n�meros enteros, con valores solicitados por teclado. Mostrar por
		consola el �ndice y el valor de cada elemento. Realizar dos m�todos, uno para el ingreso de
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
		System.out.println("Vamos a solicitarle 10 n�meros");
		for(int i=0; i<listaNumeros.length; i++){
			
			System.out.println("Ingrese el valor N� "+ (i+1));
			int valor = teclado.nextInt();//indicarle al teclado que ingrese un valor (capturar un dato)
			listaNumeros[i] = valor;
		}
	}

}
