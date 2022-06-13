package unidad2_tp1_2;

public  class Persona{ // puede ser abstract
	// atributos
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private String domicilio;
	
	//metodos
	//set  get	
	 
	  
	 
	
	//creamos un constructor
	
	  public Persona(String nombre, String apellido) {
		  this.nombre = nombre;
		  this.apellido = apellido;
	  
	  }
	  public Persona() {
			  
	  }
	  
	  
	 
	
	public Persona(String nombre, String apellido, int edad, int dni, String domicilio) {		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	//constructor copia	
	public Persona(Persona objeto) { 
		this.nombre = objeto.getNombre();
		this.apellido = objeto.getApellido();
		this.edad = objeto.getEdad();
		this.dni = objeto.getDni();
		this.domicilio = objeto.getDomicilio();
		
		}
	
	//firma del metodo | signature
	public void imprimir() {
		System.out.println("**** Mostrando los Valores Cargados *****");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido : " + getApellido());
		System.out.println("Dni: "+getDni());
		System.out.println("Edad : " + getEdad());
		System.out.println("Domiclio : " + getDomicilio());
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
	
	//public abstract void saludar();
	
	
	
	
	
}
