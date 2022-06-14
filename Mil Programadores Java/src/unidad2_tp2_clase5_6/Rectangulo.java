package unidad2_tp2_clase5_6;

public class Rectangulo extends Figura{
		private int base;
		private int altura;
		
		public Rectangulo(int base, int altura) {
			this.base = base;
			this.altura = altura;
		}
		
		
	public int getBase() {
			return base;
		}

		public void setBase(int base) {
			this.base = base;
		}

		public int getAltura() {
			return altura;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		double perimetro = 2*getBase() + 2*getAltura();
		super.setPerimetro(perimetro);
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		double area = getBase()*getAltura();
		super.setArea(area);
	}


	public void imprimirPerimetro() {
		// TODO Auto-generated method stub
		System.out.println("*** Imprimir datos de Perimetro del Rectángulo ***");
		System.out.println("Base : " + getBase());
		System.out.println("Altura: " + getAltura());
		System.out.println("Perimetro: " + getPerimetro());
		System.out.println("-----------------------");
	}


	public void imprimirArea() {
		// TODO Auto-generated method stub
		System.out.println("*** Imprimir datos de Área del Rectángulo ***");
		System.out.println("Base : " + getBase());
		System.out.println("Altura: " + getAltura());
		System.out.println("Area: " + getArea());
		System.out.println("------------------------------");
	}
	
	public void imprimir() {
		System.out.println("Imprimiendo desde Rectángulo");
	}

}
