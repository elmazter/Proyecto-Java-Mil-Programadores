package martes19_04;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dada un lista de numero naturales mostrar aquellos que tengan una cantidad par de
		digitos pares*/
		int[] array = new int[10];
		
		Ejercicio17 ej = new Ejercicio17(); //creado un objeto
		ej.cargarArray(array);
		ej.mostrarArray(array);
		//creae un metodo que nos diga la cantidad de digitos pares que tiene el numero
		//int numero = 756;
		//int cantPar = ej.devolverCantParDigitos(numero);
		//System.out.println("Numero: "+numero);
		//System.out.println("Cant digitos Pares : "+cantPar);
		ej.mostrarArrayCantidades(array);
		
	}

	private void mostrarArrayCantidades(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			int numero = array[i];
			int cantPar = devolverCantParDigitos(numero);
			if(cantPar%2==0){
				System.out.println("n: "+numero + "  - Cant Digitos Pares: "+cantPar);
			}
		}
	}

	private int devolverCantParDigitos(int n) {
		// TODO Auto-generated method stub
		int cant = 0;
		
		while(n > 0){
			int resto = n %10;//digito
			if(resto%2==0){//saber si es par
				cant = cant + 1;
			}
			int cociente = n/10;
			n = cociente;
		}
		
		return cant;
	}

	private void mostrarArray(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("****** Mostrando el Array ******");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private void cargarArray(int[] array) {
		// TODO Auto-generated method stub
		array[0] = 78945;
		array[1] = 189768;
		array[2] = 7586429;
		array[3] = 46;
		array[4] = 2345;
		array[5] = 9875642;
		array[6] = 145875;
		array[7] = 168;
		array[8] = 4864;
		array[9] = 95174862;
		
	}

}
