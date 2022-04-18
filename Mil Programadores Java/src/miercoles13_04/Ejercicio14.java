package miercoles13_04;

public class Ejercicio14 {
	
	private void metodoOrdenamientoSeleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
              menor = A[i];                       // de los elementos que quedan por ordenar                    
              pos = i;                            // y guardamos su posición
              for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                    if (A[j] < menor) {           // del array algún elemento
                        menor = A[j];             // menor que el actual
                        pos = j;
                    }
              }
              if (pos != i){                      // si hay alguno menor se intercambia                         
                  tmp = A[i];
                  A[i] = A[pos];
                  A[pos] = tmp;
              }
        }
}
	
	private void mostrarArray(int[] vector) {
		// TODO Auto-generated method stub
		//System.out.println("");
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i]+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tener un listado de edades
		int a =50;
		int[] edades = {19, 6, 20, 80, 18, 45};//
		int[] edadesMayores = {15,45,78,68,31, 26, 20, 30, 18, 45};
		int juan = edades[1];
		
		Ejercicio14 p = new Ejercicio14(); //constructor
		p.mostrarArray(edades);		
		
		/*edades[1] = 21;
		p.mostrarArray(edades);
		
		edades[2] = 50;
		p.mostrarArray(edades);*/
		
		double promedio;
		promedio = p.calcularPromedio(edadesMayores);
		System.out.println("El promedio es: "+promedio);
		
		//ordenar
		p.metodoOrdenamientoSeleccion(edades); //pasaje de parametros
		System.out.println("Array Ordenado");
		p.mostrarArray(edades);
		int primerValor = edades[0];
		System.out.println("Primer Valor: "+ primerValor);
		
		int b;  b =3;
		
		
		
		
	
		
		
		
	}

	private double calcularPromedio(int[] edades) {
		
		double suma =0;
		for (int i = 0; i < edades.length; i++) {
			suma = suma + edades[i];
		}
		double prom = suma / edades.length;
		
		return prom;
	}

	

}
