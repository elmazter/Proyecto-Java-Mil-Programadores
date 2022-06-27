package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivosTexto {

	/**
	 * @param args
	 */
	private File f ; //atributo, es un File
	
	public void mostrarInformacion(){
		System.out.println("Path : "+f.getAbsolutePath());
		System.out.println("Nombre : " + f.getName());
		System.out.println("Tamaño en disco : "+(f.length()+24));		
		System.out.println("Es un directorio : "+f.isDirectory());
		System.out.println("Es un archivo : " + f.isFile());
	}
	
	public void escribirBytes(){
		//Voy a escribir un archivo solo con bytes
		String frase = "Probando escribir por con bytes desde un Metodo"+"\n";

		byte[] obj = frase.getBytes();
		try {
			FileOutputStream out = new FileOutputStream(f,true);
			out.write(obj);
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	public void escribirCaracteres1(){
		//System.out.println("Llamando a escritor");
		try {
			FileWriter out = new FileWriter(f,true);
			String frase = "Esta es una frase a escribir desde escribirCaracteres1";
			out.write(frase+"\n");
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void escribirCaracteres2(){
		//System.out.println("Llamando a escritor");
		try {
			FileWriter fw = new FileWriter(f,true);
			BufferedWriter out = new BufferedWriter(fw);
			out.write("Hola este es un archivo de texto desde escribirCaracteres2");
			out.newLine();
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void escribirCaracteres3(){
		try {
			FileWriter fw = new FileWriter(f,true);
			BufferedWriter br = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(br);
			out.println("Ahora con Print Writer desde escribirCaracteres3");
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void crearArchivo(String path){
		f = new File(path);
		try {
			if(f.createNewFile()){
				System.out.println("El archivo se creo satisfactoriamente");
			}else{
				System.out.println("El archivo ya existe");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void leerPorCaracter(){

		try {
			FileReader fr = new FileReader(f);
			 int caracter = fr.read();
			while (caracter!=-1){
				char c  = (char)caracter;

				System.out.println(c);
				caracter = fr.read();

			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
	public void leerLineaPorLinea(){
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String linea = br.readLine();
			while (linea!=null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArchivosTexto a = new ArchivosTexto();
		a.crearArchivo("Archivo Java.txt");
		a.mostrarInformacion();
		//a.escribirBytes();
		//a.escribirCaracteres1();
		//a.escribirCaracteres2();
		//a.escribirCaracteres3();
		
		//a.leerPorCaracter();
		System.out.println("*** Leyendo el archivo de Texto ****");
		a.leerLineaPorLinea();

	}

}
