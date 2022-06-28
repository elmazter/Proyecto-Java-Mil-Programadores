package unidad3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TP3_Ejercicio7 {
	private File archivo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP3_Ejercicio7 ej7 = new TP3_Ejercicio7();
		ej7.leerArchivo();
		ej7.recorrerArchivo();
	}

	private void recorrerArchivo() {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br= new BufferedReader(fr);
			String linea = br.readLine();
			while (linea!=null) {
				calcularSuma(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void calcularSuma(String linea) {
		// TODO Auto-generated method stub
		String[] lista = linea.split(",");
		//System.out.println("Contenido de la lista");
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			String string = lista[i];
			int num = Integer.parseInt(string); //convierto un string a numero entero
			suma = suma + num;
			System.out.print(string +" - ");
			
		}
		System.out.println("");
		System.out.println("La suma es: "+ suma);
	}

	private void leerArchivo() {
		// TODO Auto-generated method stub
		archivo = new File("c:\\archivos\\Ejercicio7.txt");
		//System.out.println("Nombre : " + archivo.getName());
		//System.out.println("Ubicacion : " + archivo.getAbsolutePath());
	}

}
