package unidad3;

import java.util.Stack;

public class Pilas {
	 private Stack<Integer> pila;
	 private int tamPila;
	 
	 
	public Pilas(int tamPila) {		
		this.tamPila = tamPila;		
	}	
	public Stack<Integer> getPila() {
		return pila;
	}
	public void setPila(Stack<Integer> pila) {
		this.pila = pila;
	}
	public int getTamPila() {
		return tamPila;
	}
	public void setTamPila(int tamPila) {
		this.tamPila = tamPila;
	}
	
	public void crearPila() {
		this.pila  = new Stack<>();
	}
	
	public void agregarElemento(int e) {
		if(pila.size() < tamPila) {
			pila.push(e);
		}else {
			System.out.println("La pila esta llena");
		}
		
	}
	
	public void quitarElemento() {
		if(!pila.isEmpty()) {
			int valor = pila.pop();
			System.out.println("Elemento eliminado : " +valor);
		}
		
	}
	
	public void pilaVacia() {
		if(pila.isEmpty()) {
			System.out.println("La pila esta vacía");
		}else {
			System.out.println("La pila contiene elementos, no esta vacía.");
		}
	}
	
	public void limpiarPila() {
		//pila.clear();
		pila.removeAllElements();
	}
	
	public int cimaPila() {
		
		return pila.peek();
	}
	
	public void imprimirPila() {
		System.out.println("Imprimiendo la Pila");
		for (Integer integer : pila) {
			System.out.print(integer + " - ");
		}
	}
	
}
