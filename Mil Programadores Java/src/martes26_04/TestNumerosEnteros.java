package martes26_04;

public class TestNumerosEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumeroEntero num2 = new NumeroEntero(50);
		NumeroEntero copia = new NumeroEntero(num2);
		NumeroEntero aux;
		aux = num2;
		aux.setNumero(80);
		System.out.println("N : " + num2.getNumero());
		num2.setNumero(150);
		System.out.println("Aux :" + aux.getNumero());
		copia.setNumero(200);
		System.out.println("copia : " + copia.getNumero());
		
		
		 

	}

}
