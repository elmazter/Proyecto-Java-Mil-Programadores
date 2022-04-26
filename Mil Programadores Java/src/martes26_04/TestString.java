package martes26_04;

import java.util.ArrayList;

import jueves21_04.Persona;

public class TestString {
	
	public int busquedaSecuencial(String[] arreglo,String dato){
		 int posicion = -1;
		  for(int i = 0; i < arreglo.length; i++){//recorremos todo el array
		  	if(arreglo[i].equals(dato)){//comparamos el elemento en el arreglo con el buscado
			posicion = i;//Si es verdadero guardamos la posicion
			break;//Para el ciclo
		   }
		 }
		 return posicion;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre1 = "juan pablo'";
		String nombre2 = "Juan pablo";
		String aux1 = nombre1.toLowerCase();
		String aux2 = nombre2.toLowerCase();
		boolean iguales = aux1.equals(aux2);
		System.out.println("Valor : " + iguales);
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		int tamLista=0;
		Persona p = new Persona();
		p.setNombre("Juan");
		lista.add(p);
		lista.add(p);
		lista.add(p);
		lista.size(); //tam lista
		System.out.println("Tam lista "+ lista.size());
		lista.remove(1);
		System.out.println("Tam lista "+ lista.size());
		
		
	}

}
