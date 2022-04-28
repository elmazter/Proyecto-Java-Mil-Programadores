package jueves28_04;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacto> listaContactos; 
	private int n;
	
	public int getTamLista(){
		return this.listaContactos.size();
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Agenda(int n) {		
		this.n = n;
		this.listaContactos = new ArrayList<Contacto>();
	}
	public Agenda() {		
		this.n = 10;
		this.listaContactos = new ArrayList<Contacto>();
	}
	
	public boolean existeContacto(Contacto c){
		boolean existe = false;
		
		
		for (Contacto cont : listaContactos) {
			if(cont.getNombre().equals(c.getNombre())){
				existe = true;
			}
		}
		
		
		return existe;
	}
	
	public boolean agregarContacto(Contacto c){
		boolean sePudoAgregar = false;
		if(!existeContacto(c)){//si no existe
			if(listaContactos.size()<this.n){
				this.listaContactos.add(c);
				sePudoAgregar = true;
			}
			
		}
		
		
		return sePudoAgregar;
		
	}
	
	
	

}
