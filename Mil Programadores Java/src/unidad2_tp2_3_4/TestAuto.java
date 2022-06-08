package unidad2_tp2_3_4;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a = new Auto();
		a.setMarca("Peugeot");
		a.setModelo("208");
		a.setColor("Rojo");
		a.setCantRuedas(5);
		
		System.out.println("********");
		System.out.println("Marca del Auto es: " + a.getMarca());
		a.imprimir();
		
		Auto auto2 = new Auto("Gas");
		
		Auto auto3 =  new Auto("Ford", "Fiesta", "Nafta");
		System.out.println("*** IMPRESION ***");
		auto3.imprimir();
				
	}

}
