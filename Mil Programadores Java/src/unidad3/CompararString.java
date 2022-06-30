package unidad3;

public class CompararString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto1 = "Si el fichero contiene el siguiente texto";
		String texto2 = "El fichero contiene el siguiente texto";
		int comparacion = texto2.compareTo(texto1);
		System.out.println("Valor: "+comparacion);
		System.out.println("Comparar Equals : " + texto1.equals(texto2));
		
		
	}

}
