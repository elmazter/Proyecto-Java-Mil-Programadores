package unidad1_tp_5_6;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MENEM
		String palabra = "Neuquen";
		char c = palabra.charAt(0);
		String aux="";
		for (int i = 0; i < palabra.length(); i++) { //recorrer al revez
			int pos =  palabra.length() - i;  //5 - 4 - 3 - 2 - 1 - 0
			aux = aux + palabra.charAt(pos-1);
			//System.out.println(aux);
		}
		
		if(palabra.equals(aux) ) { //comparar objetos
			System.out.println("Es Palindromo");
		}else {
			System.out.println("No es Palindromo");
		}
		
		
		
	}

}
