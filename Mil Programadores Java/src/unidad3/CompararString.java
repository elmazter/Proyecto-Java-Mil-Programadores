package unidad3;

public class CompararString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto1 = "Si el fichero contiene el siguiente texto Hola que haces, deberá mostrar";
		String texto2 = "Si el fichero contiene el siguiente texto “Hola que haces”, deberá mostrar";
		int comparacion = texto2.compareTo(texto1);
		System.out.println("Valor: "+comparacion);
		
		
	}

}
