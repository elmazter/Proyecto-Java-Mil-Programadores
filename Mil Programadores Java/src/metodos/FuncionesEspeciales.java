package metodos;

import java.util.ArrayList;

public class FuncionesEspeciales {

	public void ordenarArray(int[] data) {
		for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int aux = data[j];
                    data[j] = data[i];
                    data[i] = aux;
                }
            }
        
        	}
	}
	
	public void ordenarLista(ArrayList<String> lista) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lista.size(); i++) {
            for (int j = i; j < lista.size(); j++) {
            	int resu = lista.get(i).compareTo(lista.get(j));            	
            	
                if ( resu>0 ) {
                    String aux = lista.get(j);
                    lista.remove(j);
                    lista.add(j, lista.get(i));
                    //lista.get(j) = lista.get(i);
                    lista.remove(i);
                    lista.add(i, aux); 
                }
            }
        
        	}
	}
}
