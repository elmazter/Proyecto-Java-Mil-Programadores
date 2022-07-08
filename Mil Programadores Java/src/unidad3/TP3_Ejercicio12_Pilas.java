package unidad3;

public class TP3_Ejercicio12_Pilas {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Pilas p = new Pilas(10);
		p.crearPila();
		p.agregarElemento(40);
		p.agregarElemento(23);
		p.agregarElemento(56);
		p.agregarElemento(40);
		p.agregarElemento(23);
		p.agregarElemento(56);
		p.agregarElemento(40);
		p.agregarElemento(23);
		p.agregarElemento(56);
		p.agregarElemento(40);
		p.agregarElemento(23);
		p.agregarElemento(56);
		p.imprimirPila();
		System.out.println("Top Pila : " + p.cimaPila());
		p.quitarElemento();
		p.imprimirPila();
		System.out.println("Top Pila : " + p.cimaPila());
		p.pilaVacia();
		p.limpiarPila();
		p.imprimirPila();
		
	}

}
