package modulo1_tp1;



public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Identificadores validos
		//tipo_de_dato identificador;
		
		byte cantidad =100;
		short valores;
		int edad;
		int cuit; 
		//cuit = 27856999427;
		
		// cast 
		cantidad = 50;
		valores = 130;
		
		cantidad = (byte)valores;
		if(cantidad>=0) {
			System.out.println("Conversion Exitosa");
		}else {
			System.out.println("Conversion No Exitosa - Numero fuera de Rango");
		}
		System.out.println(cantidad);
		
		long valorLargo;
		valorLargo = 27452525252512L;
		
		//numeros decimales
		double peso = 80.78;
		float distancia = 1860.78F;
		distancia = (float)peso + 50; //downcasting
		
		//Identificadores invalidos
		
		//invalidos
		// int &edad;   //por q comienza con un caracter no permitido
	}

}
