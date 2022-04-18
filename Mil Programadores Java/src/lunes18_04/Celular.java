package lunes18_04;

public class Celular {
	//atributos
	private String marca;
	private String fechaLanzamiento;
	private String modelo;
	private double peso;
	private byte cantDiasBateria;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public String getModelo() {
		
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public byte getCantDiasBateria() {
		return cantDiasBateria;
	}
	public void setCantDiasBateria(byte cantDiasBateria) {
		this.cantDiasBateria = cantDiasBateria;
	}
	public void imprimirPantalla() {
		// TODO Auto-generated method stub
		System.out.println("**** Objeto Celular *****");
		System.out.println("Modelo: " + getModelo());
		System.out.println("Marca : "+this.marca);
		System.out.println("Fecha de Lanzamiento : "+getFechaLanzamiento());
		System.out.println("La bateria dura : "+getCantDiasBateria()+" dias");
	}
	
	
	
	
	
	//metodos
	
	
}
