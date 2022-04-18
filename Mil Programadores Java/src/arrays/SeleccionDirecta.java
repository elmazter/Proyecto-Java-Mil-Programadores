package arrays;

public class SeleccionDirecta {
	
	public  int busquedaSecuencial(int []arreglo,int dato){
		 int posicion = -1;
		  for(int i = 0; i < arreglo.length; i++){//recorremos todo el array
		  	if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
			posicion = i;//Si es verdadero guardamos la posicion
			break;//Para el ciclo
		   }
		 }
		 return posicion;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector={4, 15, 18, 6, 8};
		
		
		int i, j, k, p, auxiliar, limit = vector.length-1;
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
        
        for (int l = 0; l < vector.length; l++) { // muestro el vector
			System.out.print(vector[l] + " ");
		}
        System.out.println("");
       
//        SeleccionDirecta sd = new SeleccionDirecta();
//        int indice = sd.busquedaSecuencial(vector, 50);
//        if(indice!=-1){
//        	System.out.println("Posicion: "+indice);
//        	System.out.println(vector[indice]);
//        	
//        }

	}

}
