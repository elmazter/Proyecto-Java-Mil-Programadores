package archivos;


import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import filtros.PuntoDoc;
import filtros.PuntoPdf;
import filtros.SoloTxt;
import filtros.TextoPdf;

public class Directorios {
	private File f;
	//Crear un directorio

	public void crearDirectorio(String path){
		 f = new File(path);
		 System.out.println("Ubicacion del directorio");
		System.out.println(f.getAbsolutePath());

		boolean pudeCrear = f.mkdir();
		if(pudeCrear){
				System.out.println("El directorio se creo ");
			}


	}
	public void setPath(String s){
		f=new File(s);
	}
	public void crearDirectorio(String path,String nombre){
		 f = new File(path,nombre);
	}
	public void borrarDirectorio(){
		
		if (f.delete())
		 System.out.println("El fichero   ha sido borrado correctamente");
		else
		 System.out.println("El fichero  no se ha podido borrar");

	}

	public void listarArchivos(){
		String[] lista =f.list();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);

		}
	}
	public void listarArchivos(FilenameFilter filtro){
		String[] lista =f.list(filtro);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);

		}
	}
	public void listarArchivos(FileFilter filtro){
		File[] lista =f.listFiles(filtro);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getName());

		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directorios dir = new Directorios();
		dir.crearDirectorio("C:\\Users\\El Mazter\\Downloads");
		dir.setPath("C:\\Users\\El Mazter\\Downloads");
		//dir.borrarDirectorio();
		//dir.listarArchivos();
		System.out.println("************************************************");
//		System.out.println("Solo doc");
//		dir.listarArchivos(new PuntoDoc());
//		System.out.println("************************************************");
//		System.out.println("Solo pdf");
//		dir.listarArchivos(new PuntoPdf());
		System.out.println("Listar Archivos de Texto y PDF");
		TextoPdf filtro = new TextoPdf();
		dir.listarArchivos(filtro);
	}

}
