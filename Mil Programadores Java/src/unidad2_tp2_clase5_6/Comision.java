package unidad2_tp2_clase5_6;

import java.util.ArrayList;

public class Comision {
	private String nombreComision;
	private String horarios;
	private String dias;
	private ArrayList<Alumno> listaAlumnos;

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	public void agregarAlumno(Alumno alumno) {
		listaAlumnos.add(alumno);
	}
	public void quitarAlumno(int dni) {
		int posicion = buscarAlumno(dni);
		if(posicion>=0) {
			listaAlumnos.remove(posicion);
			Alumno a = listaAlumnos.get(posicion);
			System.out.println("Alumno removido con exito: " + a.getApellido());
		}
		System.out.println("No se encontro el Alumno");
		
	}

	private int buscarAlumno(int dni) {
		// TODO Auto-generated method stub
		int i=0, pos=-1;
		for (Alumno alumno : listaAlumnos) {
			
			if(alumno.getDni()==dni) {
				pos = i;
				System.out.println("Alumno encontrado");
			}
			i++;
		}
		return pos;
	}
	
	//método java de ordenación por selección
	public void ordenarListaAlumnos() { //ordeno por dni
	          int i, j, menor, pos;
	          Alumno tmp;
	          for (i = 0; i < listaAlumnos.size() - 1; i++) {      // tomamos como menor el primero
	                menor = listaAlumnos.get(i).getDni();                       // de los elementos que quedan por ordenar                    
	                pos = i;                            // y guardamos su posición
	                for (j = i + 1; j < listaAlumnos.size(); j++){ // buscamos en el resto
	                      if (listaAlumnos.get(j).getDni() < menor) {           // del array algún elemento
	                          menor = listaAlumnos.get(j).getDni();             // menor que el actual
	                          pos = j;
	                      }
	                }
	                if (pos != i){                      // si hay alguno menor se intercambia                         
	                    tmp = listaAlumnos.get(i);
	                    //A[i] = A[pos];
	                    listaAlumnos.add(i, tmp);
	                    listaAlumnos.add(pos, listaAlumnos.get(i));
	                    //A[pos] = tmp;
	                }
	          }
	}
	
	
}
