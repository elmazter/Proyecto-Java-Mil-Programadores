package unidad2;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hola mundo desde Java!";
		boolean bandera= true;
		int i = 0;
		int tamFrase = frase.length();
		System.out.println("Tam Frase "+tamFrase);
		while( i < tamFrase){
			//SIEMPRE CAMBIAR LA CONDICION
			char caracter = frase.charAt(i);
			System.out.println(caracter);
			i++; // i=i+1
		}
		System.out.println("Fin del Programa");
	}

}
