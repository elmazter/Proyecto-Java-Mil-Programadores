package martes19_04;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Persona() {	
		
	}

	public Persona(String n, String a) {
		
		this.nombre = n;
		this.apellido = a;
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
	
	public void mostrarDatos(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido: "+this.apellido);
		System.out.println("Edad: "+this.edad);
	}
	
	

}
