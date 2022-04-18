package miercoles13_04;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables var = new Variables();
		int[] lista = {1,4,9,6};
		var.ordenar(lista);
		var.mostrar(lista);
	}

	
	
	
	
	
	
	
	
	
	private void mostrar(int[] lista) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] +"  ");
		}
		System.out.println(" ");
	}

	private void ordenar(int[] vector) {
		// TODO Auto-generated method stub
		int i, k, p, auxiliar, limit = vector.length-1;
        for(k = 0; k <limit; k++){        	
            p = k;
            for(i = k+1; i <= limit; i++){            	
                if(vector[i] < vector[p]){ 
                	p = i;}
                                
            }
            if(p != k){            	
                auxiliar = vector[p];
                vector [p] = vector[k];
                vector[k] = auxiliar;
               
            }
        } //fin del algoritmo de ordenamiento
	}

}
