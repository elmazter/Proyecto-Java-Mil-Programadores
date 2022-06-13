package unidad2_tp2_clase5_6;

import unidad2_tp1_2.Persona;

public class TestAlumnoTP2_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno juan = new Alumno("Juan", "Aguirre", 26, 35789456, "Santiago del Estero 1800");
		juan.generarNotas();
		juan.mostrarNotas();
		juan.imprimir();
		
		//test alumno / profesor
		juan.saludar();
		Profesor p = new Profesor();
		p.saludar();
		
		
	}

}
