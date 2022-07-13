package miercoles20_04;

public class Alumno extends Persona{
	private int libretaUniversitaria;
	private int id;
	
	public Alumno(String nombre, String apellido, int lu){
		super(nombre,apellido);
		this.libretaUniversitaria=lu;
	}
	
	public Alumno(int id, String nombre, String apellido, int edad, String domicilio, int dni, int lu){
		super(nombre,apellido,edad,domicilio,dni);
		this.libretaUniversitaria=lu;
		this.id=id;
	}
	

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}
	
	public void imprimirAlumno() {
		System.out.println("**************");
		System.out.println("Nombre : " + getNombre());
		System.out.println("Apellido : " + getApellido());
		System.out.println("Edad: " +getEdad());
		System.out.println("Domicilio : "+ getDomicilio());
		System.out.println("dni: " + getDni());
		System.out.println("Libreta Universitaria : " + getLibretaUniversitaria());
	}
	
}
