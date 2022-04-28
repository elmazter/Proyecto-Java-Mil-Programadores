package jueves28_04;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 15;
		int c = 20;
		String  variable= "Hola";
		int[] lista = new int[10];
		lista[0] =10;
		lista[2] = 5;
		
		switch(a){ // variable ordinal
		case 1:{
			System.out.println("Vale 1");
			break;
		}
		case 2:{
			System.out.println("Vale 2");
			break;
		}
		case 5:{
			System.out.println("Vale 5");			
			break;
		}
		default:{
			System.out.println("Vale otro valor");
		}
		
		}

		
	}

}
