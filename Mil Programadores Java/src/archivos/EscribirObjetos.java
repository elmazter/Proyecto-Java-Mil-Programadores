package archivos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import jueves21_04.Persona;

public class EscribirObjetos {

	/**
	 * @param args
	 */
	File f;
	public void crearArchivo(String path) {
		// TODO Auto-generated method stub
		f = new File(path);
		try {
			if(f.createNewFile()){
				System.out.println("El Archivo se creo de manera correcta");
			}
			else{
				System.out.println("El Archivo no pudo ser creado");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void escribir(Persona p){
		try {
			//ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
			EscritorObjetos out = new EscritorObjetos(new FileOutputStream(f,true));
			out.writeObject(p);		
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void leerArchivo(){
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
			Object obj =in.readObject();
			while (obj!=null) {
				Persona per =(Persona) obj;
				per.mostrarDatos();
				obj = in.readObject();
			}
			in.close();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("Fin del Archivo");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
					}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EscribirObjetos o = new EscribirObjetos();
		o.crearArchivo("objetos.obj");
		Persona p = new Persona("Juan Pablo","Romero",25);
		o.escribir(p);
		o.leerArchivo();

	}



}
