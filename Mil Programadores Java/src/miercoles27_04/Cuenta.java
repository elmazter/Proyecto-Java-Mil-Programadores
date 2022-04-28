package miercoles27_04;

public class Cuenta {
	private String nombre;
	private String apellido;
	private String numeroCuenta;
	private double interes;
	private double saldo;
	
	public Cuenta(){
		
	}
	
	
	
	public Cuenta(String nombre, String apellido, String numeroCuenta,
			double interes, double saldo) {		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCuenta = numeroCuenta;
		this.interes = interes;
		this.saldo = saldo;
	}


	public Cuenta(Cuenta c) {
		// TODO Auto-generated constructor stub
		this.nombre = c.getNombre();
		this.apellido = c.getApellido();
		this.numeroCuenta = c.getNumeroCuenta();
		this.interes = c.getInteres();
		this.saldo = c.getSaldo();
	}



	public void imprimirDatos(){
		System.out.println("**** Datos de la Cuenta *****");
		System.out.println("Apellido y Nombre : " + getApellido() + ", "+ getNombre());
		System.out.println("# de cuenta : " + getNumeroCuenta() );
		System.out.println("Interes : " + getInteres()+"%");
		System.out.println("Saldo : $" + getSaldo());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public boolean ingreso(double monto) {
		// TODO Auto-generated method stub
		boolean sePudoHacer = false;
		if(monto > 0){
			this.saldo = this.saldo + monto;
			sePudoHacer = true;
		}
		
		
		return sePudoHacer;
	}



	public boolean reintegro(double monto) {
		// TODO Auto-generated method stub
		boolean sePudoHacer = false;
		double saldoFinal = getSaldo() - monto;
		if(saldoFinal>=0){
			this.saldo = this.saldo - monto;
			sePudoHacer = true;
		}
		
		
		return sePudoHacer;
	}



	public boolean transferir(Cuenta c, double monto) {
		// TODO Auto-generated method stub
		boolean sePudoHacer = false;
		double saldoFinal = this.saldo - monto;
		if(saldoFinal>=0){
			//actualizo mi saldo
			this.saldo = this.saldo - monto;
			//actualizo el saldo en la cueat destino
			c.ingreso(monto);
			//actualizar mi variable
			sePudoHacer = true;
			
		}
		
		
		return sePudoHacer;
	}



	
	
	
	

}
