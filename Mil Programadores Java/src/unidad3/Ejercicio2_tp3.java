package unidad3;

import java.io.IOException;

public class Ejercicio2_tp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2_tp3 ej = new Ejercicio2_tp3();
		ej.leerDatosTeclado();
	}

	private void leerDatosTeclado() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Ingrese un valor numero para salir");
			int valor = System.in.read();
			while( (valor < 48) | (valor > 57)  ) {
				System.out.println("Valor ingresado : " + valor);
				System.out.println("Caracter ingresado : " + (char)valor);
				System.out.println("Ingrese un valor numero para salir");
				valor = System.in.read();
			}
			System.out.println("Ud ha ingreso un número");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
