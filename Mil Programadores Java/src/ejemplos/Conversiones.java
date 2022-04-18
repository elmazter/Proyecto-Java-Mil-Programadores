package ejemplos;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int entero;
		byte edad;
		short corto;
		
		edad = 100; // error
		corto = 30000;
		
		entero = edad;
		
		System.out.println("Valor : "+entero);
		entero = corto; // upcasting   automatico
		System.out.println("Valor : "+entero);
		
		entero = 15;
		edad = (byte) entero; // downcasting 
		System.out.println("Muestro : "+ edad);
		
		String cadena; // Es una cadena de caracteres
		cadena = "******** Hola chicos como estan? - Año 2022 *********";
		char caracter; // unico carcater
		caracter = 'a';
		System.out.println("Muestro un caracter:  "+ caracter );
		System.out.println(cadena);
		int variableCaracter;
		variableCaracter = caracter;   // int = char
		System.out.println(variableCaracter);
		caracter = '\u00ED'; // caracter del codigo UNICODE
		System.out.println(caracter);
		variableCaracter = caracter;
		System.out.println(variableCaracter);
		
		

	}

}
