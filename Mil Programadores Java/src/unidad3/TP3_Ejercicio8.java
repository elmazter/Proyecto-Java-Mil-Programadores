package unidad3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;

public class TP3_Ejercicio8 {
	private File archivo;
	private ArrayList<String> lista;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP3_Ejercicio8 ej8 = new TP3_Ejercicio8();
		String path = "C:\\archivos\\archivo para ordenar.txt";
		ej8.asignarArchivo(path);
		ej8.leerArchivo();
		ej8.ordenarLista();
		ej8.muestrarLista();
		//ej8.mostrarLinea(0);
		//ej8.escribirArchivo();
	}

	private void mostrarLinea(int i) {
		// TODO Auto-generated method stub
		System.out.println("*****************************************");
		System.out.println("Mostrando linea : " + i);
		System.out.println(lista.get(i));
	}

	private void escribirArchivo() {
		// TODO Auto-generated method stub	
		String url = archivo.getAbsolutePath();
		Path path = archivo.toPath();		
		
		try {
		    Files.delete(path);		//eliminamos el archivo
		} catch (IOException x) {
		    // File permission problems are caught here.
		    System.err.println(x);
		}
		
		archivo = new File(url);
		try {
			FileWriter fw = new FileWriter(archivo,true);			
			BufferedWriter br = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(br);
			
			for (String string : lista) {
				out.println(string);
			}			
			out.close();
			br.close();
			fw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

	

	private void muestrarLista() {
		// TODO Auto-generated method stub
		System.out.println("*** Elementos de la Lista ***");
		for (String string : lista) {
			System.out.println(string);
		}
	}

	private void ordenarLista() {
		// TODO Auto-generated method stub
		for (int i = 0; i < lista.size(); i++) {
            for (int j = i; j < lista.size(); j++) {
            	int resu = lista.get(i).compareTo(lista.get(j));            	
            	
                if ( resu>0 ) {
                    String aux = lista.get(j);
                    //lista.remove(j);
                    lista.set(j, lista.get(i));
                    //lista.get(j) = lista.get(i);
                    //lista.remove(i);
                    lista.set(i, aux); 
                }
            }
        
        	}
	}

	private void leerArchivo() {
		// TODO Auto-generated method stub
		lista = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(archivo, StandardCharsets.UTF_8);			
			BufferedReader br= new BufferedReader(fr);
			String linea = br.readLine();
			while (linea!=null) {
				lista.add(linea);
				linea = br.readLine();
			}
			fr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void asignarArchivo(String path) {
		// TODO Auto-generated method stub
		archivo = new File(path);
		System.out.println("Nombre: "+archivo.getName());
		System.out.println("Ubicacion: " + archivo.getAbsolutePath());
		if(archivo.exists()) {
			System.out.println("El archivo existe");
		}else {
			System.err.println("El archivo no existe");
		}
		
	}

}
