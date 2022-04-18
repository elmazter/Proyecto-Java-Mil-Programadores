package lunes18_04;

import java.util.ArrayList;

import org.w3c.dom.ls.LSInput;



public class TestCelulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar un objeto de la clase Celular
		Celular celu = new Celular(); 
		celu.setMarca("Motorola");
		celu.setModelo("G5");
		byte valor = 2;
		celu.setCantDiasBateria(valor);
		celu.setFechaLanzamiento("Año 2016");
		
		Celular celular2 = new Celular(); 
		celular2.setMarca("Samsung");
		celular2.setModelo("A3");
		valor = 4;
		celular2.setCantDiasBateria(valor);
		celular2.setFechaLanzamiento("Año 2019");
		
		Celular celular3 = new Celular(); 
		celular3.setMarca("Huawei");
		celular3.setModelo("S1");
		valor = 2;
		celular3.setCantDiasBateria(valor);
		celular3.setFechaLanzamiento("Año 2022");
		
		//celu.imprimirPantalla();
		
		celu.setModelo("G7 Play");
		//celu.imprimirPantalla();
		
		ArrayList<Celular> listaCelulares = new ArrayList<Celular>();
		listaCelulares.add(celu);
		listaCelulares.add(celular2);
		listaCelulares.add(celular3);
		Celular aux;
		aux = listaCelulares.get(1); //pasaje de parametros por valor o referencia
		aux.setMarca("Marca 2");
		aux.imprimirPantalla();
		
		//recorrer el array y muestro los valores
		for (Celular c : listaCelulares) {
			c.imprimirPantalla();			
		}
		
		
	}

}
