package unidad2;

import java.util.Scanner;

public class IngresoDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INGRESAR DATOS DESDE TECLADO
		Scanner teclado = new Scanner(System.in);
		//sumar 2 numeros
		/*int a , b;
		System.out.println("Ingrese el primer numero");		
		a = teclado.nextInt();
		System.out.println("Ingresar el segundo Numero");
		b = teclado.nextInt();
		
		int suma = a * b;
		System.out.println("Resultado de Producto : "+suma);*/
		System.out.println("Ingrese una frase de despedida");
		String cadena = teclado.nextLine();
		System.out.println(cadena);
	}

}
