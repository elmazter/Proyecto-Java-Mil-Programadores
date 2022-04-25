package modulo2_tp1_2_3;

import java.util.Random;

public class Productos { //Ej4 - Tp2
	private String nombre;
	private double precio;
	private int vencimiento; // cant de dias que le quedan
	private boolean perecedero;
	
	
	
	public Productos(){
		
	}
	public Productos(String nombre, double precio, int vencimiento,
			boolean perecedero) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimiento;
		this.perecedero = perecedero;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getVencimiento() {
		return vencimiento;
	}



	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}



	public boolean getTipo() {
		return perecedero;
	}



	public void setTipo(boolean tipo) {
		this.perecedero = tipo;
	}	
	
	
	public double calcular(int cantidad){
		double total = 0;
		if(this.perecedero){
			
			switch(this.vencimiento){
			case 1:{total = (this.precio/4)*cantidad;}
			case 2:{total = (this.precio/3)*cantidad;}
			case 3:{total = (this.precio/2)*cantidad;}
			default:{
				total = (this.precio)*cantidad;
			}
			}
			
		}else{
			total = (this.precio)*cantidad;
		}
		
		return total;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos[] lista = new Productos[5];
		Productos p = new Productos();
		p.cargarLista(lista);
		for (int i = 0; i < lista.length; i++) {
			Random r = new Random();
			lista[i].calcular(r.nextInt(10));
		}

	}



	public void cargarLista(Productos[] lista) {
		// TODO Auto-generated method stub
		Productos p1 = new Productos("Arroz", 80.50, 5, false);
		Productos p2 = new Productos("Leche", 150, 5, true);
		Productos p3 = new Productos("Dulce de Leche", 250, 3, true);
		Productos p4 = new Productos("Aceite", 90, 6, false);
		Productos p5 = new Productos("Yogur", 190, 2, true);
		lista[0] = p1;
		lista[1] = p2;
		lista[2] = p3;
		lista[3] = p4;
		lista[4] = p5;
		
	}

}
