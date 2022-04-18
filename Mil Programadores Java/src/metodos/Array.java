package metodos;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lista de numeros
		int[] lista = new int[10];
		//lista = new int[10];
		lista[0]=30;
		lista[1]=20;
		lista[5]=60;
		
		//mostrar lista
		int suma = 0; int menor =200; int mayor=0;
		for (int i = 0; i < lista.length ; i++) {
			System.out.print( lista[i] +" , ");
			suma = suma + lista[i];
			if(mayor < lista[i]){
				mayor = lista[i];
			}
			if(menor > lista[i]){
				menor = lista[i];
			}
		}
		double promedio = suma/10;
		System.out.println("Promedio :" + promedio);
		System.out.println();
		//int suma = lista[1] + lista[5];
		//System.out.println(suma);
		
	}

}
