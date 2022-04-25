package lunes25_04;

public class TestContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c = new Contador(80);
		System.out.println("El contador esta en: " + c.getCont());
		
		Contador d = new Contador(50);
		Contador b = new Contador(30);
		System.out.println("El contador esta en: " + b.getCont());
	}

}
