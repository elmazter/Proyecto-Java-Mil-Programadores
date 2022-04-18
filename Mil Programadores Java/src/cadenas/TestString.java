package cadenas;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Java";
		String buscar = "Java";
		
		boolean valor = cadena.equals("Java");
		System.out.println(valor);
		String[] lista ={"Frase 1","Frase 2","Frase 3" };
		boolean bandera = false;
		int posicion = -1; //Si vale -1 no lo encontre al elemento
		
		for (int i=0; i < lista.length; i++) {
			if(lista[i].equals(buscar)){
				System.out.println("Se enconrtro la frase bsucada");
				bandera = true;
				posicion = i;
			}
		}
		if(!bandera){
			System.out.println("Lo sentimos, no pudimos encontrar la palabra buscada");
		}
		if(posicion >= 0){
			System.out.println("La posiscion es: "+posicion);
		}
		
	}

}
