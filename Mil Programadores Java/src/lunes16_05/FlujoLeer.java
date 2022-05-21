package lunes16_05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlujoLeer {
	
	public void leerTeclado1(){
		//Leer un caracter como bytes
		int dato=0;
		
		InputStreamReader teclado = new InputStreamReader(System.in);
		try {
			dato = teclado.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Valor Ingresado: "+dato);
		System.out.println("Char : "+(char)dato);
		
	}
	public void leerTeclado2(){
		//Leer varios caracteres como caracter
		//usamos un Buffer
		int dato=0;
		String frase = null;
		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(teclado);
		try {
			frase = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Valor Ingresado: "+frase);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlujoLeer f = new FlujoLeer();
		f.leerTeclado2();
	}

}
