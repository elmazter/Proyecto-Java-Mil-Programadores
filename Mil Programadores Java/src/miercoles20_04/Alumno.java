package miercoles20_04;

public class Alumno extends Persona{
	private int libretaUniversitaria;
	
	public Alumno(String nombre, String apellido, int lu){
		super(nombre,apellido);
		this.libretaUniversitaria=lu;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}
	
	
}
