package jueves14_04;

import java.util.ArrayList;

public class TrabajosConArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<Integer>(); //objetos
		TrabajosConArray clase = new TrabajosConArray();
		
		lista.add(10);		
		lista.add(60);
		lista.add(70);
		lista.add(30);
		
		clase.mostrarArray(lista);
		lista.remove(1);
		clase.mostrarArray(lista);
		
		
		
	}

	private void mostrarArray(ArrayList<Integer> lista) {
		// TODO Auto-generated method stub
		System.out.println("------Metodo Mostrar Array-----");
		System.out.println("Tam: "+lista.size());
		
		/*for(int i=0; i<lista.size();i++){
			System.out.println(lista.get(i));  // lista[i]
		}*/
		//foreach
		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}

}
