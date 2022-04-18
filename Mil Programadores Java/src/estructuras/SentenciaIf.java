package estructuras;

public class SentenciaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Bienvenidos a Java"; //comienza desde 0 
		int tam;
		tam = texto.length();
		System.out.println("Tamaño del texto : " + tam);
		// Si cantidad de caracteres es menor que 20 muestro un cartel
		boolean condicion;
		condicion = tam < 50;
		// preguntar si es menor que 50 y es mayor a 30
		boolean condicion2 = tam > 30;
		
		boolean condicFinal = condicion & condicion2;
		if(condicFinal){
			System.out.println("Cumple con las 2 condiciones");
		}
		
		System.out.println("Fin del programa");
		
	}

}
