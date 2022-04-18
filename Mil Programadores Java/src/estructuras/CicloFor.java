package estructuras;

public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Hola chicos, hoy es Martes";
		int tam = texto.length();
		System.out.println(tam);
		for( int i=0; i<tam ; i++ ){
			char caracter = texto.charAt(i);
			//System.out.println(i+ " Salta");
			System.out.println(caracter);
		}
	}

}
