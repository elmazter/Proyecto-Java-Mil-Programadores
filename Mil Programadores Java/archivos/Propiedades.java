package archivos;

import java.util.Properties;

public class Propiedades {
	Properties p ;
	public String listarPropiedades(){
		p = System.getProperties();	
		return p.toString();
	}
	public void mostrarLista(String s){
		System.out.println("La lista de propiedades del sistema es : ");
		System.out.println(s);
	}
	public void mostrarPropiedad(String s){
		String propiedad = p.getProperty(s);
		if(propiedad!=null){
			System.out.println("El valor es :" + propiedad);
		}else
		{System.out.println("La propiedad indicada no es valida");}

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Propiedades prop = new Propiedades();
		prop.mostrarLista(prop.listarPropiedades());
		prop.mostrarPropiedad("os.name");
		prop.mostrarPropiedad("os.version");
		prop.mostrarPropiedad("os.arch");
		//Mas propiedades ?
		// http://download.oracle.com/javase/1.4.2/docs/api/java/lang/System.html
	}

}
