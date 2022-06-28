package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TP3_Ejercicio3 {
	private double precio;
	

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP3_Ejercicio3 ej3 = new TP3_Ejercicio3();
		ej3.ingresarPrecio();
		//ej3.ingresarPrecioScanner();
		ej3.calcularIva();
		//System.out.println("Valor ingresado : "+ ej3.getPrecio());
	}


	private void ingresarPrecioScanner() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para el precio ej: 10,50");
		double precio = sc.nextDouble();
		setPrecio(precio);
	}


	private void calcularIva() {
		// TODO Auto-generated method stub
		double iva = getPrecio()*0.105;
		double precioTotal = getPrecio() + iva;
		System.out.println("Precio IVA : " + iva);
		System.out.println("Precio Total : " + precioTotal);
	}


	private void ingresarPrecio() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero double ej: 10.5");
		InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada); 
        String texto="";
		try {
			texto = teclado.readLine();
			
			double valor = Double.parseDouble(texto); //convertir un texto a double
			setPrecio(valor);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Ocurrio un error");
		} catch (NumberFormatException e1) {
			System.err.println("Formato de numero no válido");
			System.out.println("*** Por favor ingrese un numero válido ***");
			ingresarPrecio();
		}
		
		
	}

}
