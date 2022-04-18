package ejemplos;

public class Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cadenas de caracteres 
		String frase;
		int valor;
		frase = "Hola chicos como estan. ";
		System.out.println(frase);
		int tam = frase.length();
		char caracter = frase.charAt(3);
		System.out.println("Cant de caracteres : "+ tam);
		System.out.println("Valor: "+caracter);
		String variable =   frase.toUpperCase();
		System.out.println(variable);
		
		
		
		
	}

}
