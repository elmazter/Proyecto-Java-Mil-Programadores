package unidad1_tp_5_6;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hola Mundo!"; //hola mundo
		System.out.println(frase);
		String aux = frase.toLowerCase();
		System.out.println(aux);
		aux = frase.toUpperCase();
		System.out.println(aux);
		int tam = frase.length();
		char c = frase.charAt(4);
		System.out.println(c);
		int espacio = c;
		System.out.println(espacio);
	}

}
