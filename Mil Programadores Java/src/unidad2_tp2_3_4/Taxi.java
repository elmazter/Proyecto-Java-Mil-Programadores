package unidad2_tp2_3_4;

public class Taxi {
	private int id;
	private int numeroTaxi;
	private int tipoTarifa;
	private int precioBajadaBandera;
	
	//constructor
	public Taxi(int id, int numeroTaxi, int tipoTarifa) {		
		this.id = id;
		this.numeroTaxi = numeroTaxi;
		this.tipoTarifa = tipoTarifa;
		if(tipoTarifa==1) {
			this.precioBajadaBandera=58;
		}else {
			this.precioBajadaBandera=70;
		}
	}
	
	public void cambiarTarifa() {
				
		if(getTipoTarifa()==1) {
			setTipoTarifa(2);
			setPrecioBajadaBandera(70);
			System.out.println("Cambio de Tarifa Exitoso : 1 --> 2" );
		}else {
			setTipoTarifa(1);
			setPrecioBajadaBandera(58);
			System.out.println("Cambio de Tarifa Exitoso : 2 --> 1" );
		}
	}
	
	public void imprimirTaxi() {
		System.out.println("*** Datos del Taxi ****");
		System.out.println("Id: " + getId());
		System.out.println("Numero Taxi : " + getNumeroTaxi());
		System.out.println("Tipo de Tarifa : " + getTipoTarifa());
		System.out.println("Precio Bajada Bandera : " + getPrecioBajadaBandera());
		System.out.println(" ");
	}
	public int calcularTotalAPagar(int cantidadMetrosRecorridos) {
		int montoMetrosRecorridos = 0;
		int montoTotal = 0;
		if(getTipoTarifa()==1) {
			montoMetrosRecorridos = cantidadMetrosRecorridos*5;			
		}else {
			montoMetrosRecorridos = cantidadMetrosRecorridos*8;			
		}
		montoTotal = montoMetrosRecorridos + getPrecioBajadaBandera();
		return montoTotal;
	}
	
	//setters  y getters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroTaxi() {
		return numeroTaxi;
	}
	public void setNumeroTaxi(int numeroTaxi) {
		this.numeroTaxi = numeroTaxi;
	}
	public int getTipoTarifa() {
		return tipoTarifa;
	}
	public void setTipoTarifa(int tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	public int getPrecioBajadaBandera() {
		return precioBajadaBandera;
	}
	public void setPrecioBajadaBandera(int precioBajadaBandera) {
		this.precioBajadaBandera = precioBajadaBandera;
	}
	
	
	
}
