package lunes16_05;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArchivosTexto {
	private File f;
	
	
	public void leerArchivo(String path) {
		// TODO Auto-generated method stub
		
			try {
				
				f = new File(path);
				if(!f.exists()){
				f.createNewFile();
				System.out.println("Archivo creado con exito");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	public void leerLinea(){
		try {
			FileInputStream fis = new FileInputStream(f);
			int a =fis.read();
			while(a!=-1 ){
				System.out.print((char)a);
				a =fis.read();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void leerLineaxLinea(){
		System.out.println("Leemso el archivo *******");
		try {
			FileReader isr = new FileReader(f);
			BufferedReader br = new BufferedReader(isr);
			String texto = br.readLine();
			while(texto !=null){
				System.out.println(texto);
				texto = br.readLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArchivosTexto a = new ArchivosTexto();
		a.leerArchivo("miArchivo.txt");
		a.mostrarDatosArchivo();
		a.leerLineaxLinea();
	}

	public void mostrarDatosArchivo() {
		// TODO Auto-generated method stub
		System.out.println("***** Datos del Archivo******");
		System.out.println("Nombre: "+f.getName());
		System.out.println("Path: "+f.getPath());
		System.out.println("Path Abs: "+f.getAbsolutePath());
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		System.out.println("Fecha de Modificacion:"+sdf.format(f.lastModified()));
		System.out.println("Tam: "+f.length());		
	}

	

}
