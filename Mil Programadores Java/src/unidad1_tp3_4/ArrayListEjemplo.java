package unidad1_tp3_4;

import java.util.ArrayList;

public class ArrayListEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaNombres = new ArrayList<String>();
		int numeroElementos = listaNombres.size();
		System.out.println("Tamaño de la lista " + numeroElementos);
		
		String nombre = "Carlos";
		listaNombres.add(nombre);
		listaNombres.add("Benito");
		listaNombres.add(nombre);
		listaNombres.add("Benito");
		listaNombres.add(nombre);
		listaNombres.add("Benito");
		System.out.println("Tamaño de la lista " + listaNombres.size());
		//obtener un valor
		System.out.println("Obtener nombre "+ listaNombres.get(5));
		
		/*
		 * for (String string : listaNombres) { System.out.println(string); }
		 */
		System.out.println("Muestro datos del array");
		for (int i = 0; i < listaNombres.size() ; i++) {
			System.out.println(listaNombres.get(i));
		}
		
		
	}

}
