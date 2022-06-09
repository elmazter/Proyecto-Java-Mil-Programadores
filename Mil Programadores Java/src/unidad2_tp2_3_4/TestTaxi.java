package unidad2_tp2_3_4;

public class TestTaxi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi(2, 4000, 1);
		taxi.imprimirTaxi();
		
//		  taxi.cambiarTarifa(); 
//		  taxi.imprimirTaxi();
		int metrosRecorridos = 400;
		int totalAPagar =  taxi.calcularTotalAPagar(metrosRecorridos);
		System.out.println("Cantidad de Metros Recorridos : " + metrosRecorridos+"mts");
		System.out.println("El monto total a pagar es : $" + totalAPagar);
		 
	}

}
