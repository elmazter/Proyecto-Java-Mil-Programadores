package lunes25_04;

public class TestSumaSimple {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		int b;
		a = 10;
		b=50;
		TestSumaSimple obj = new TestSumaSimple();
		obj.sumar(a,b);
		
	}

	private void sumar(int a, int b) {
		// TODO Auto-generated method stub
		int resultado;
		resultado = a + b;
		System.out.println("Resultado : " +resultado);
	}

}
