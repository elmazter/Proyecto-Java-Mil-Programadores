package modulo1_tp1;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a=24;
		b=15;
		//comparar el valor de a con b
		boolean igual;
		igual = (a==b);
		System.out.println("Las variables son: " +igual);
		if(a<=b) {
			System.out.println("Las variables son Iguales");
		}else {
			System.out.println("Las variables son distintas");
		}
		//si a es mas chico q 20 y a,b son distintos
		if( !(a<20) ) {
			System.out.println("Cumple la condicion");
		} 
		
		
	}

}
