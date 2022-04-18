package ejemploVectores;

public class Referencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		String frase = "Hola Java";
		cambiarFrase(frase);
		System.out.println(frase);
	}

	private static void cambiarFrase(String frase) {
		// TODO Auto-generated method stub
		frase = "Hola desde el Metodo";
	}

}
