package unidad2_tp1_2;

public class TestCopiaObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Pedro", "Quiroga", 45, 123456, "San Martin 805");
		//p.imprimir();
		Persona aux = new Persona();
		aux = p; // paso de parametro por referencia
		aux.imprimir();
		aux.setNombre("Mariano");
		aux.imprimir();
		p.imprimir();
		
		int a = 10;   int b;
		b = a; // paso de parametro por valor
		
		//usando contructor copia
		Persona copia = new Persona(p);
		System.out.println("*******************");
		p.imprimir();
		copia.imprimir();
		copia.setNombre("Juan Carlos");
		copia.imprimir();
		p.imprimir();
		
	}

}
