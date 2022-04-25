package lunes25_04;

public class NumEnteros {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int num) {
		this.numero = num;
	}
	
	public void suma(NumEnteros b){
		this.numero = this.numero + b.getNumero();
	}
	
	

}
