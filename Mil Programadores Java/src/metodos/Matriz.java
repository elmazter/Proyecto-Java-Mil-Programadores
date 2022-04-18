package metodos;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[4][6];
		matriz[0][1] = 50;
		matriz[2][3] = 40;
		matriz[3][2] = 30;
		//mostrar por filas
		for (int i = 0; i < 4; i++) { //filas
			//recorrer las columnas
			for (int j = 0; j < 6; j++) { //columnas
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}

}
