package jueves28_04;

public class Contacto {
	private String nombre;
	private String apellido;
	private String numero;
	
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Contacto(String nombre, String apellido, String numero) {		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}
	
	
	

}
