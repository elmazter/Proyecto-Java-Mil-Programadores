package unidad2_tp2_clase5_6;

import java.util.Random;

import unidad2_tp1_2.Persona;

public class Alumno extends Persona {
	private int[] notas;
	
	public Alumno(String nombre, String apellido, int edad, int dni, String domicilio) {		
		super(nombre, apellido, edad, dni, domicilio);
	}
	
	public void generarNotas() {
		notas = new int[3];		
		Random r = new Random();		
		notas[0] = r.nextInt(11);
		notas[1] = r.nextInt(11);
		notas[2] = r.nextInt(11);
	}
	public void mostrarNotas() {
		System.out.println("*** Mostrar Notas del Alumno ***");
		System.out.println("Alumno : " + getNombre()+", "+getApellido());
		for (int i = 0; i < notas.length; i++) {
			switch (i) {
			case 0:{
				System.out.println("Matemáticas : " + notas[i]);
				break;
			}
			case 1 :{
				System.out.println("Lengua : " + notas[i]);
				break;
			}
			case 2 :{
				System.out.println("Historia : " + notas[i]);
				break;
			}
					

			
			}
			
		}
	}
	
	public void imprimir() {
		System.out.println("Imprimiendo datos de un Alumno");
	}

	
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Saludar desde Alumno");
	}
}
