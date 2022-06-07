package unidad2_tp1_2;

public class Contador {
	private int contador;

	public Contador(int contador) {		
		if(contador>=0) {
			this.contador = contador;
		}else {
			this.contador = 0;
		}
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void incrementar() {
		this.contador ++;
	}
	
	public void decrementar() {
		if(this.contador>0) {
			--this.contador;
		}
	}
	
}
