package miercoles20_04;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a = new Alumno("Juan", "Saravia",124578);
		a.imprimirDatos();
		System.out.println("Su LU es: "+a.getLibretaUniversitaria());
	}

}
