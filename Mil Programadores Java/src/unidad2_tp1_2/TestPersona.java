package unidad2_tp1_2;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();  
		p.setNombre("Juan Pablo");	
		p.setDni(123456);
		p.setApellido("Rios");
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Apellido: "+p.getApellido());
		System.out.println("Dni: "+p.getDni());
		
		Persona copia = new Persona(p);
		System.out.println("Nombre Copia: "+copia.getNombre());
		
		Persona aux = p; //no es copia, 
		
		
	}

}
