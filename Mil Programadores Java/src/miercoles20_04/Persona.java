package miercoles20_04;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	
	public Persona(){ //constructor 1
		
	}
	
	public Persona(int dni) {
		
		this.dni = dni;
	}

	public Persona(String nombre, String apellido) { //constructor 2
		
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(String nombre, int dni) { //constructor 3
		
		this.nombre = nombre;
		this.dni = dni;
	}

	public void imprimirDatos(){
		System.out.println("****Datos de una persona*****");
		System.out.println("Nombre: "+ getNombre()); //this.nombre
		System.out.println("Apellido: "+ getApellido());
		System.out.println("Su edad es: "+getEdad());
		System.out.println("Su dni es: "+getDni());
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
	
	// set    get   
	
	
	
	
}
