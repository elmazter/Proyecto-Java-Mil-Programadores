package lunes25_04;

public class TestNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumEnteros n = new NumEnteros();
		n.setNumero(10);
		NumEnteros m = new NumEnteros();
		m.setNumero(50);
		n.suma(m);
		System.out.println(n.getNumero());
		
		
	}

}
