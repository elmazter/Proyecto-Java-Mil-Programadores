package martes26_04;

public class NumeroEntero {
	private int n;

	public int getNumero() {
		return n;
	}

	public void setNumero(int n) {
		this.n = n;
	}

	
	
	//constructor
	public NumeroEntero(int n) {		
		this.n = n;
	}
	
	public NumeroEntero(NumeroEntero num2) {
		// TODO Auto-generated constructor stub
		this.n = num2.getNumero();	
		
	}

	public static void main(String[] args) {
		NumeroEntero numero = new NumeroEntero(10);
		System.out.println("Valor : " + numero.getNumero());
		numero.setNumero(30);
		System.out.println("Valor : " + numero.getNumero());
		
		NumeroEntero num2 = new NumeroEntero(50);
		int s = numero.getNumero() + num2.getNumero();
		System.out.println("Suma : " + s);
		num2.suma(numero);
		System.out.println("Resultado suma : " + num2.getNumero());
		
		int a = 10;
		int b = a;
		b= 50;
		
	}
	
	

	public void suma(NumeroEntero numero) {
		// TODO Auto-generated method stub
		this.n = this.n + numero.getNumero();
	}
	public void resta(NumeroEntero numero) {
		// TODO Auto-generated method stub
		this.n = this.n - numero.getNumero();
	}
	public void producto(NumeroEntero numero) {
		// TODO Auto-generated method stub
		this.n = this.n * numero.getNumero();
	}
	public void division(NumeroEntero numero) {
		// TODO Auto-generated method stub
		this.n = this.n / numero.getNumero();
	}
	
	
	
	
	
}
