package cadenas;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saludar();
		int resultado = sumar(4,9); //llamndo al metodo
		System.out.println("Resultado : " + resultado);	
		double division = dividir(40,2); // dividendo, divisor
		System.out.println(division);
	}

	private static double dividir(double a, double b) {
		// TODO Auto-generated method stub
		double resu;
		resu = a / b;
		return resu;
	}

	private static int sumar(int a, int b) {
		
		// TODO Auto-generated method stub
		int resultado = a + b;
		
		return resultado;
	}

	private static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo!");
	}

}
