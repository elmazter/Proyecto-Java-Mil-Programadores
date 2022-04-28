package miercoles27_04;

public class TestCuentaTransferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta();
		c.setNombre("Juan");
		c.setApellido("Rios");
		c.setNumeroCuenta("4512-4578");
		c.setSaldo(500);
		Cuenta d = new Cuenta("Daniel", "Perez", "122356-7845", 0.05, 2000);
		// dos parametros, el objeto destino + monto
		double monto = 1000;
		if( d.transferir(c, monto) ){
			System.out.println("Transferencia Exitosa");
			System.out.println("Saldo actual : " +d.getSaldo());
			System.out.println("Saldo en destino : "+ c.getSaldo());
		}else{
			System.out.println("No se pudo realizar la tranferencia");
			System.out.println("Saldo Insuficiente");
		}
		
	}

}
