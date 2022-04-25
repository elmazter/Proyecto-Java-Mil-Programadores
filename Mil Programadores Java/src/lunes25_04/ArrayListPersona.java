package lunes25_04;

import java.util.ArrayList;

import miercoles20_04.Persona;

public class ArrayListPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> lista = new ArrayList<Persona>();
		System.out.println("Tam lista :" +lista.size());
		Persona p = new Persona();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p.setNombre("Juan");
		p.setApellido("Diaz");
		lista.add(p);
		lista.add(p1);
		lista.add(p2);
		lista.add(p);
		lista.add(p1);		
		System.out.println("Tam lista :" +lista.size());
		lista.remove(1);
		System.out.println("Tam lista :" +lista.size());
		
		
		
	}

}
