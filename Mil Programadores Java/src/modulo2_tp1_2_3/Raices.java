package modulo2_tp1_2_3;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	
	public Raices(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante(){
		double discriminante = 0;
		discriminante = Math.pow(this.b, 2)- 4*(this.a*this.c);
		
		return discriminante;
	}
	
	public void imprimirRaices(){
		double raiz1, raiz2;
		raiz1 = (-this.b + Math.sqrt( getDiscriminante() ))/(2*this.a);
		raiz2 = (-this.b - Math.sqrt( getDiscriminante() ))/(2*this.a);
		System.out.println("La raiz 1 = "+raiz1);
		System.out.println("La raiz 2 = "+raiz2);
	}
	
	public void imprimirRaiz(){
		double raiz;
		raiz = (-this.b )/(2*this.a);
		
		System.out.println("La raiz única es = "+raiz);
		
	}
	public boolean tieneRaices(){
		boolean valor = false;
		if(getDiscriminante()>0){
			valor = true;
		}
		
		return valor;
	}
	public boolean tieneRaiz(){
		boolean valor = false;
		if(getDiscriminante()==0){
			valor = true;
		}
		
		return valor;
	}
	
	public void calcular(){
		if(tieneRaices()){
			imprimirRaices();
		}else{
			if(tieneRaiz()){
				imprimirRaiz();
			}else{
				System.out.println("La ecuación no tiene raices Reales");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raices r = new Raices(1, -4, 4);
		r.calcular();

	}

}
