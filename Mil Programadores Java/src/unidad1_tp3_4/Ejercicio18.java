package unidad1_tp3_4;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; //queremos saber si n es capicua
		
		x=789987;
		
		int n=x;   int aux = 0;
		while (n>0) { //4578 -  457  - 45 - 4 - 0
			int resto = n % 10; //8  - 7
			aux = aux*10 + resto; // 8  - 87 - 875 - 8754
			n = n / 10; // 457 -  45 - 4 - 0
			
		}
		System.out.println("El numero: " + x);
		if( x == aux) {
			System.out.println("ES CAPICUA");
		}else {
			System.out.println("NO ES CAPICUA");
		}
		

	}

}
