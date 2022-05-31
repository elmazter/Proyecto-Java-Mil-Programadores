package unidad1_tp_5_6;

import java.util.Random;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definimos la matriz
		int m = 2; //filas
		int n=6; //columnas
		
		int[][] matriz = new int[m][n]; // m filas, n columnas
		//cargar valores a la matriz
		Random r = new Random(); 
		int max = 10;
		int min = 1;
		int numeroAleatorio; 		
		
		
		//recorremos la matriz y insertamos los numeros generados
		for (int i = 0; i < m; i++) {//i indice filas
			for (int j = 0; j < n; j++) { // j indice columnas
				numeroAleatorio = r.nextInt(max - min) + min;
				matriz[i][j] = numeroAleatorio;
			}
			
		}//fin de ciclo
		
		//mostrar la matriz
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int valorCelda = matriz[i][j];
				System.out.print(valorCelda + "  ");
			}
			System.out.println("");
			
		}
		
	}

}
