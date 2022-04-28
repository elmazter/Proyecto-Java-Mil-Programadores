package miercoles27_04;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacto> listaContactos;
	private int n;
	
	public Agenda(int tamLista){
		this.n = tamLista;
		this.listaContactos = new ArrayList<Contacto>();
	}
	
	
	
	public int getTamLista(){
		return this.listaContactos.size();
	}
	
	public boolean agregarContacto(Contacto c){
		boolean sePudoHacer = false;
		if(getTamLista() < n){
			this.listaContactos.add(c);
			sePudoHacer=true;
		}
		
		return sePudoHacer;
	}
}
