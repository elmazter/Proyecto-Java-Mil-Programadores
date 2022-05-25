package unidad1_tp3_4;

import java.util.Random;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;       //[edades entre]    15 - 50   35
		int max = 50;
		int min = 15;
		int[] lista = new int[n];
		
		
		//cargar valores a la lista
		Random r = new Random();
		int numeroAleatorio;
		for (int i = 0; i < n; i++) {
			numeroAleatorio = r.nextInt(max - min) + min;
			lista[i] = numeroAleatorio;
		}
		
		//calcular promedio
		double suma=0;
		for (int i = 0; i < lista.length; i++) {
			suma = suma + lista[i];
		}
		double promedio = suma / lista.length;
		System.out.println("Promedio : "+promedio);
		
		//obtener la maxima y la minima edad
		int maximaEdad = 0;
		int minimaEdad = 50;
		for (int i = 0; i < lista.length; i++) {
			//tomo la maxima edad
			if(lista[i] > maximaEdad) {
				maximaEdad = lista[i];
			}
			//tomo la minima edad
			if(lista[i] < minimaEdad) {
				minimaEdad = lista[i];
			}
		}
		System.out.println("La edad maxima es: "+maximaEdad);
		System.out.println("La edad minima es: "+minimaEdad);
		
		
		//mostrar el array
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]+ " - ");
		}
		
	}

}
