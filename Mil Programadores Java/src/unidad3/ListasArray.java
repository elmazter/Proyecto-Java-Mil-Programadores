package unidad3;

import java.util.ArrayList;

import unidad2_tp1_2.Persona;

public class ListasArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array 
		ListasArray la = new ListasArray();		
		//la.trabajarArray();
		//la.trabajarArrayList();
		la.trabajarListaPersona();
	}

	private void trabajarListaPersona() {
		// TODO Auto-generated method stub
		ArrayList<Persona> lista = new ArrayList<Persona>();
		Persona k = new Persona(); 
		lista.add(k);
		lista.add(new Persona("Juan", "Dominguez"));
		Persona p = new Persona("Pedro", "Rodriguez", 30, 32894512, "San Martin 950");
		lista.add(p);
		
		lista.get(1).setEdad(45);
		System.out.println("Edad : " + lista.get(2).getEdad()  );
		System.out.println("Mayuscula : " + lista.get(2).getDomicilio().toUpperCase());
		Persona m = lista.get(0); //paso de parametro por referencia
		m.setNombre("Mario");
		m.setApellido("Juarez");
		//lista.set(0, m);
		
		//mostrarLista
		mostrarListaPersona(lista);
		
	}

	

	private void mostrarListaPersona(ArrayList<Persona> lista) {
		// TODO Auto-generated method stub
		System.out.println("Mostrando Lista");
		for (Persona persona : lista) {
			persona.imprimir();
		}
		System.out.println("");
	}

	private void trabajarArrayList() {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(5);
		lista.add(9);
		lista.add(7);
		lista.add(3);
		lista.add(50);
		
		System.out.println("Tamaño : " + lista.size());
		System.out.println("Elemento : " + lista.get(2));
		lista.set(2, 80);
		//mostrarArray
		mostrarArray(lista);
		
		
	}

	

	private void trabajarArray() {
		// TODO Auto-generated method stub
		int[] array = {1,5,9,7,3,50};
		System.out.println("Tamaño : " + array.length);
		System.out.println("Elemento : " + array[0]);
		array[2] = 80;
		//mostrarArray
		mostrarArray(array);
	}

	private void mostrarArray(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("Mostrando Array");
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.print(j + " , ");
			
		}
		System.out.println("");
	}
	private void mostrarArray(ArrayList<Integer> lista) {
		// TODO Auto-generated method stub
		System.out.println("Mostrando Lista");
		for (Integer integer : lista) {
			System.out.print(integer + " , ");
		}
		System.out.println("");
	}

}
