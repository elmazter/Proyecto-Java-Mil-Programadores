package unidad2_tp2_3_4;

public class Raices {
	private int a;
	private int b;
	private int c;
	
	
	//contructor
	public Raices(int a, int b, int c) {		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void calcular() {
		if(getDiscriminante()>=0) {
			//tiene solucion
			System.out.println("Tiene solucion");
			if(getDiscriminante()>0) {
				obtenerRaices();
			}else {// discriminante ==0
				System.out.println("Tiene raiz unica");
				obtenerRaiz();
			}
			
		}else
		{
			//no tiene solucion
			System.out.println("No tiene solucion");
		}
	}
	
	private int getDiscriminante() {
		int discriminante = 0;
		int potencia = (int) Math.pow(getB(), 2);
		discriminante = potencia  - 4*getA()*getC();
		return discriminante;
	}
	
	private void obtenerRaices() {
		double x1, x2;
		double numerador = -getB() + Math.sqrt(getDiscriminante());
		double denominador = 2*a;
		x1 =  numerador  / denominador;
		System.out.println("Raiz 1 : " + x1);
		numerador = -getB() - Math.sqrt(getDiscriminante());
		x2 = numerador / denominador;
		System.out.println("Raiz 2 : " + x2);
	}
	public void obtenerRaiz() {
		double numerador = -getB() ;
		double denominador = 2*a;
		double x =  numerador  / denominador;
		System.out.println("Raiz Unica : " + x);
	}
	
}
