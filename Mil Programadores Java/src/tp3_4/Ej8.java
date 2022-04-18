package tp3_4;

import java.util.Scanner;

public class Ej8 {
	//Declaracion de variables
	int segundos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 min = 60sg
		Ej8 clase = new Ej8();
		clase.ingresarDatos();
		clase.mostrarMinutos();
	}

	private void mostrarMinutos() {
		// TODO Auto-generated method stub
		int sg=this.segundos; 		  
		double minutos = (1 * sg)/60.0;
		System.out.println("La cantidad de minutos es: "+minutos);
	}

	private void ingresarDatos() {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de segundos");
		int sg = teclado.nextInt();
		this.segundos = sg;
				
	}

}
