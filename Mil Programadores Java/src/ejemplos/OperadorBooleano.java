package ejemplos;

public class OperadorBooleano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean verdadero;
		boolean falso;
		verdadero = true;
		falso = false;
		boolean resultado;
		
		// O logico  | 
		// Y logico &
		
		boolean dato =  45 > 80;
		boolean comparar = 70 > 90;
		
		resultado = (dato | comparar);
		System.out.println(resultado);
	}

}
