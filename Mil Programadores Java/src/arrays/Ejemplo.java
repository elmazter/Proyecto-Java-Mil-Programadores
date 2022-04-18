package arrays;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vectores
		int[] lista;   int tamArray = 10;
		lista = new int[tamArray]; // inicializar o  crear
		// agregar valores
		lista[0]=45;
		lista[1] = 90;
		lista[6] = 23;
		lista[8] = 30;
		lista[9] = 78;
		System.out.println("Nuestro Array es");
		
		//ciclos
		for(int i = 0; i<tamArray ; i++){
			System.out.println("Indice: "+ i +" - Valor:" + lista[i]);
		}
		
		System.out.println("Otro For");
		for (int i : lista) {
			System.out.println("i: "+i);
		}
		
		
		
	}

}
