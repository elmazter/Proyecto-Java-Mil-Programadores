package unidad1_tp3_4;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a= 4; b=7; c=10;
		if(a>b) { //a es mas grande que b
			if(a>c) {
				System.out.println("El mayor es a: "+a);
			}else {
				System.out.println("El mayor es c: "+c);
			}
			
		}else{ //a no es mayor que b   // a es menor que b
			if(b>c) {
				System.out.println("El mayor es b: "+b);
			}else {
				System.out.println("El mayor es c: "+c);
			}
		}
		//muestre el menor
		if(a<b) { //a es mas grande que b
			if(a<c) {
				System.out.println("El menor es a: "+a);
			}else {
				System.out.println("El menor es c: "+c);
			}
			
		}else{ //a no es mayor que b   // a es menor que b
			if(b<c) {
				System.out.println("El menor es b: "+b);
			}else {
				System.out.println("El menor es c: "+c);
			}
		}
		 
	}

}
