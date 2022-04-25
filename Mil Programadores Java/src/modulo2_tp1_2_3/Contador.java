package modulo2_tp1_2_3;

public class Contador {
	private int cont;
	
	
	

	public Contador(int cont) {	
		if(cont<0){
			this.cont = 0;
		}else{
			this.cont = cont;
		}
		
	}
	public Contador(Contador c){ //constrauctor copia
		this.cont = c.cont;
	}


	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar(){
		this.cont = this.cont + 1;
	}
	public void decrementar(){
		int nuevoValor = this.cont - 1;
		if(nuevoValor<0){
			this.cont = 0;
		}else{
			this.cont = nuevoValor;
		}
	}


	public static void main(String[] args) { //vamos a probar la clase Contador
		// TODO Auto-generated method stub
		Contador cont =  new Contador(1);
		cont.decrementar();		
		System.out.println(cont.getCont());
		cont.incrementar();
		cont.incrementar();
		cont.incrementar();
		cont.incrementar();
		
		//creamos una copia de cont
		Contador nuevoContador = new Contador(cont);
		System.out.println(nuevoContador.getCont());
	}

}
