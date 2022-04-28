package miercoles27_04;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta();
		c.setNombre("Juan");
		c.setApellido("Rios");
		c.setNumeroCuenta("4512-4578");
		c.setSaldo(500);
		c.imprimirDatos();
		double monto = 0;
		
		boolean sePudoHacer = c.ingreso(monto);
		if(sePudoHacer){
			System.out.println("Se pudo realizar el ingreso");
			System.out.println("Saldo : " +c.getSaldo());
		}else{
			System.out.println("Lo sentimos, No se pudo realizar el ingreso");
			System.out.println("Saldo : " +c.getSaldo());
		}
		
		Cuenta cuenta = new Cuenta("Daniel", "Perez", "122356-7845", 0.05, 250);
		System.out.println("Cuenta Original");
		cuenta.imprimirDatos();
		//cuenta.imprimirDatos();
		cuenta.setSaldo(2500);
		System.out.println("Saldo de Cuenta");
		cuenta.imprimirDatos();
		monto = 500;
		if(cuenta.reintegro(monto)){
			System.out.println("Se pudo realizar el Reintegro");
			System.out.println("Saldo : "+cuenta.getSaldo());
		}else{
			System.out.println("Saldo insuficiente para realizar el Reintegro");
		}
		
		
		Cuenta c2 = new Cuenta(cuenta); // contructor copia
		c2.imprimirDatos();
		
		

	}

}
