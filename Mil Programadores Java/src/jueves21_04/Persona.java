package jueves21_04;

public class Persona {
//atributos
	private String nombre;
	private String apellido;
	private String domicilio;
	private int edad;
	//metodos
	public String getNombre() {
		String valor;
		if(this.nombre==null){
			valor="No cargado";
		}else{
			valor = this.nombre;
		}
		return valor;
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
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarDatos(){
		System.out.println("**** Mostrar Datos de Persona *****");
		System.out.println("Nombre: "+ getNombre() );
		System.out.println("Apellido: " + getApellido());
		System.out.println("Domicilio: " +getDomicilio());
		System.out.println("Edad : "+getEdad());
	}
	
	//constructores
	//nombre y apellido
	public Persona(){ //default
		
	}
	public Persona(String nombre, String apellido){ //firma del metodo o contsructor
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(String nombre, String apellido, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
	
	
}
