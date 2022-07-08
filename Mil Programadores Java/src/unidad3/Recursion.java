package unidad3;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		int valor = r.calcularFactorial(5);
		System.out.println("Factorial : " + valor);
	}

	private int calcularFactorial(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
			else return n*calcularFactorial(n-1); 		
	}

	

}
