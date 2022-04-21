package jueves21_04;

public class Alumno extends Persona  {
	
	private String mail;
	private String comision;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public Alumno(String nombre, String apellido, String mail) {
		super(nombre, apellido);
		this.mail = mail;
	}
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		//super.mostrarDatos();
		System.out.println("**** Mostrando Datos de un Alumno ***");
		System.out.println("Nombre: "+super.getNombre());
		System.out.println("Apellido: " + super.getApellido());
		System.out.println("Domicilio: " +super.getDomicilio());
		System.out.println("Edad : "+super.getEdad());
		System.out.println("Email: " +getMail());
		
	}
	
	

}
