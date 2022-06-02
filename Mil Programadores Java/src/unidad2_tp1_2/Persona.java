package unidad2_tp1_2;

public class Persona{
	// atributos
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private String domicilio;
	
	//metodos
	//set  get
	public Persona() {
		
	}
	public Persona(Persona p) {
		this.nombre = p.getNombre();
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
	
	
	
	
}
