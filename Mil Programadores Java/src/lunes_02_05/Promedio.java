package lunes_02_05;

public class Promedio {
	public void cargarNumeros(int[] lista){
		
	}
public double calcularPromedio(int[] lista){
		double promedio=0;
		double suma=0;
		for (int i = 0; i < lista.length; i++) {
			suma = suma + lista[i];
		}
		promedio =  suma/lista.length;
		
	return promedio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		//cargarNumeros(numeros);
		Promedio p = new Promedio();
		p.cargarNumeros(numeros);
		double prom = p.calcularPromedio(numeros);

	}

}
