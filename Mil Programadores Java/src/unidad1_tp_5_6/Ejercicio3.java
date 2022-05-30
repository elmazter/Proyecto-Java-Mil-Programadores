package unidad1_tp_5_6;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//teber los 10 numeros cargados
		
		/*
		 * int[] listaEnteros = new int[10]; double[] listaReales = new double[10];
		 * char[] listaCaracteres = new char[10];
		 */
		
		//agregar un elemento a cada lista
		
		/*
		 * listaEnteros[2] = 56; listaReales[2] = 8.5612; listaCaracteres[2] = 24;
		 */
		
		//mostrar los valores cargados
		
		/*
		 * System.out.println(listaEnteros[2]); System.out.println(listaReales[2]);
		 * System.out.println(listaCaracteres[2]);
		 */
		
		//crear lista de 10 numeros
		int n = 10;
		double[] listaReales = {4 , 5 , 7.8 , 5.6 , 7.2 , 9.4 , 8 , 6 , 45 , 8.56 };
	
		System.out.println("Lista de Reales ");
		for (int i = 0; i < listaReales.length; i++) {
			System.out.print(listaReales[i] + " - ");
		}
		System.out.println("");
		System.out.println("Referencia : " + listaReales);
		
		int posicionAEliminar = 4;  //listaReales[posicionAEliminar - 1] 
		
		double[] listaAux = new double[n-1];
		int contAux=0;
		for (int i = 0; i < listaReales.length; i++) {
				if(i!=(posicionAEliminar-1)) {
					listaAux[contAux]=listaReales[i];	
					contAux++;					
				}
										
		}
		listaReales = listaAux; //asignacion por referencia   // con objetos
		
		System.out.println("Lista de Reales ");
		for (int i = 0; i < listaReales.length; i++) {
			System.out.print(listaReales[i] + " - ");
		}
		System.out.println("");
		System.out.println("Referencia : " + listaReales);
		System.out.println("Referencia Aux : " + listaAux);
		
		//test de valores
		listaAux[0] = 100;
		System.out.println("Lista Reales " + listaReales[0]);
		
		
		
		
	}

}
