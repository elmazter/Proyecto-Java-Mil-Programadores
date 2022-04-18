package metodos;

public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		int a = 50;
		int b =40;
		//resultado = a + b;
		resultado = suma(a,b);
		imprimir();
		System.out.println("El resultado es : " +resultado);
		
	}

	private static void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Hola desde el Metodo imprimir");
	}

	private static int suma(int a, int b) {
		// TODO Auto-generated method stub
		int aux;
		aux = a + b;
		return aux;
	}

	

}
