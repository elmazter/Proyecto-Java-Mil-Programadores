package unidad2_tp2_3_4;

public class Auto extends Vehiculo {
	private int cantPuertas;
	private String tipoCombustible;
	
	
	
	public Auto() {		
	}
	
	public Auto(String tipoCombustible) {		
		this.tipoCombustible = tipoCombustible;
	}
	
	public Auto(String marca, String modelo, String tipoCombustible) {
		super(marca, modelo);
		this.tipoCombustible = tipoCombustible;
	}
	
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public void imprimir() {
		System.out.println("*** Imprimiendo Datos de un Auto****");
	}
	
}
