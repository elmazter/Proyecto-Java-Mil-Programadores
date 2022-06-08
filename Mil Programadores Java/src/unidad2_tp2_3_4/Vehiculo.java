package unidad2_tp2_3_4;

public class Vehiculo {
	//atributos
	private int cantRuedas;
	private String color;
	private String marca;
	private String modelo;
	
	
	public Vehiculo() {	
	}
	public Vehiculo(String marca) {		
		this.marca = marca;
	}
	public Vehiculo(String marca, String modelo) {		
		this.marca = marca;
		this.modelo = modelo;
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void estacionar() {
		System.out.println("Estacionar Vehiculo");
	}
	public void frenar() {
		System.out.println("Frenar Vehiculo");
	}
	
	public void imprimir() {
		System.out.println("**** Imprimiendo Datos de un Vehiculo ******");
		System.out.println("Marca : " + getMarca());
		System.out.println("Modelo : " + getModelo());
	}

}
