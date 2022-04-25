package lunes25_04;

public class Contador {
	private int cont;

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	
	
	//constructor
	public Contador() {		
		
	}
	public Contador(int cont) {	
		//controlar | chequear | validar
		if(cont>=0){
			this.cont = cont;
		}else{
			this.cont=0;
		}
		
	}
	public Contador(Contador c){
		this.cont = c.getCont();
	}
	
	
	

}
