package unidad2_tp2_clase5_6;

public abstract class Figura {
	private double area;
	private double perimetro;
	
	public abstract void calcularPerimetro();
	public abstract void calcularArea();
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void imprimir() {
		System.out.println("Imprimiendo desde figura");
	}
	
}
