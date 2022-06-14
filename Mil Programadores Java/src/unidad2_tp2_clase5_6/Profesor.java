package unidad2_tp2_clase5_6;

import unidad2_tp1_2.Persona;

public class Profesor extends Persona {
	private Comision comision;
	
	public Profesor(Comision comision) {
		this.comision = comision;
	}
	public Profesor() {
		
	}
	
	
	public Comision getComision() {
		return comision;
	}
	public void setComision(Comision comision) {
		this.comision = comision;
	}
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Saludar desde Profesor");
	}

}
