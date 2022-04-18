package estructuras;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Hola chicos, hoy es Martes";
		int tam = texto.length();
		System.out.println(tam);
		int posicion = texto.indexOf("Java");
		if(posicion>=0){
			System.out.println("Si esta la frase buscada");
			System.out.println(posicion);
		}else{
			System.out.println("No pudimos encontrar la frase");
		} // else if
	} //main

}// clase
