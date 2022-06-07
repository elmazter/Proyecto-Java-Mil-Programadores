package unidad1_tp_5_6;

import java.util.Random;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2; //filas
		int n=2; //columnas
		int[][] matrizA = new int[m][n]; // m filas, n columnas
		int[][] matrizB = new int[m][n]; // m filas, n columnas
		int[][] matrizC = new int[m][n]; // m filas, n columnas
		int numeroAleatorio;
		int max = 10;
		int min = 1;
		Random r = new Random(); 
		//recorremos la matriz y insertamos los numeros generados
				for (int i = 0; i < m; i++) {//i indice filas
					for (int j = 0; j < n; j++) { // j indice columnas
						numeroAleatorio = r.nextInt(max - min) + min;
						matrizA[i][j] = numeroAleatorio;
						numeroAleatorio = r.nextInt(max - min) + min;
						matrizB[i][j] = numeroAleatorio;
					}
					
				}//fin de ciclo
				
				//sumar las matrices
				for (int i = 0; i < m; i++) {//i indice filas
					for (int j = 0; j < n; j++) { // j indice columnas
						matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
					}
					
				}//fin de ciclo
				
				//mostrar la matriz A
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						int valorCelda = matrizA[i][j];
						System.out.print(valorCelda + "  ");
					}
					System.out.println("");
					
					
				}
				System.out.println("----------");
				
				//mostrar la matriz b
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						int valorCelda = matrizB[i][j];
						System.out.print(valorCelda + "  ");
					}
					System.out.println("");
					
					
				}
				System.out.println("----------");
				
				//mostrar la matriz C
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						int valorCelda = matrizC[i][j];
						System.out.print(valorCelda + "  ");
					}
					System.out.println("");
					
					
				}
				

	}

}
