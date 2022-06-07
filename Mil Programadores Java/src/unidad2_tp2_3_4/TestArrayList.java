package unidad2_tp2_3_4;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Texto");
		lista.add("Texto2");
		lista.add("Texto3");
		lista.add("Texto4");
		lista.remove(1);
		for (String string : lista) {
			System.out.println(string);
		}
		
		
	}

}
