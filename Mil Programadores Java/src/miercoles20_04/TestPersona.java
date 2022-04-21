package miercoles20_04;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pedro = new Persona("Pedro","Rios");
		/*pedro.setNombre("Pedro");
		pedro.setApellido("Rios");
		pedro.setEdad(40);
		pedro.setDni(30785412);*/
		//pedro.setNombre("Pedro");
		//String nombre = pedro.getNombre();
		//System.out.println("El nombre es: "+nombre);
		//mostrar los datos del objeto
		pedro.imprimirDatos();
		Persona j = new Persona();
		j.setNombre("Juan");
		
		Persona carlos = new Persona(45782);
		carlos.setNombre("Carlos");
		carlos.imprimirDatos();
		
		
		
	}

}
