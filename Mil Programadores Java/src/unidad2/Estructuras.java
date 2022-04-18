package unidad2;

public class Estructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// condiciones
		String frase = "Este es un pequeño programa en Java";		
		String buscada = "javax";
		String minuscula = frase.toLowerCase(); // paso a misnuscula
		//System.out.println(minuscula);
		
		int posicion;
		posicion = minuscula.indexOf(buscada); // buscar un contenido dentro de otro
		System.out.println(frase); //println funcion
		//System.out.println("Tamaño String :" + frase.length());
		System.out.println("Posicion: "+posicion);
		
		boolean exito;
		exito = (posicion >= 0); //
		
		if(exito){
			System.out.println("1: La frase fue Encontrada");
			System.out.println(":)");
		} else{
			System.out.println("2: No pudimos encontrar la frase");
			System.out.println(":(");
		}
			
	}

}
