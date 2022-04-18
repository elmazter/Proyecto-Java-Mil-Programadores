package ejemplos;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista = new int[10];
		for (int i = 0; i < lista.length; i++) {
			lista[i]= (int) (Math.random()*50)+10;
		}
		
		for (int valor : lista) {
			System.out.print(valor + " ");
		}
		
	}

}
