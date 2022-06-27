package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClaseEjemplo {
	private int a;
	private int b;
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseEjemplo ej = new ClaseEjemplo();
		//ej.leerDatosTeclado();
		ej.tecladoScanner();
		ej.sumar();
	}

	private void tecladoScanner() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");		
		setA(sc.nextInt());
		System.out.println("Ingrese otro numero");		
		setB(sc.nextInt());
	}

	private void obtenerValoresPorTeclado() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Ingrese un valor");
			byte aux = (byte) System.in.read();
			// test error aritmetico
			//int x = 5/0;
			//error de array
			int[] listaTest = {1,5,3};
			listaTest[5] = 20;
			System.out.println("Valor ingresado : "+ aux);
			char c = (char)aux;
			System.out.println("Caracter : " + c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ArithmeticException e1) {
			System.out.println("Se produjo un error aritmetico");
		} catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Error por acceso a indice invalido");
		}
	}
	
	private void leerDatosTeclado() {
		InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);    
		try {
			System.out.println("Ingrese un valor");
			String texto = teclado.readLine();
			int aux = Integer.parseInt(texto);
			setA(aux);
			System.out.println("Ingrese otro valor");
			texto = teclado.readLine();
			aux = Integer.parseInt(texto);
			setB(aux);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		} catch (NumberFormatException e1) {
			System.out.println("Se produjo un error al convertir el numero. Por favor ingrese un valor valido");
			leerDatosTeclado();
		}
	}

	private void sumar() {
		// TODO Auto-generated method stub
		System.out.println("Resultado de la suma");
		System.out.println(getA() + getB());
	}

}
