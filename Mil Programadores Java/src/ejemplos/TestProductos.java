package ejemplos;

public class TestProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1;
		double valor2;
		double resultado;  valor1=15;   valor2=20.999999999955;
		resultado = (valor1 * valor2);   //  * producto es una funcion 
		System.out.println("Resultado: "+resultado);
		System.out.println("Valor Real: "+valor1 * valor2);
		int dato = (int)valor2;
		System.out.println("Convertido :" + dato);
		
		byte edad = 40;
		int conversion = edad; //upcasting
		edad = (byte) conversion;  //downcasting
		System.out.println("DownCasting :" + edad);
	}

}
