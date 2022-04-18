package ejemplos;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  +  -    *   /  %
		
		// 150 dividido 7    21 cociente y resto 3  
		
		int a = 146;
		int b = 2;
		int cociente;
		int resto;
		cociente = a / b; // uso el operador /
		resto = a % b;
		System.out.println("Cociente "+cociente);
		System.out.println("Resto " + resto);
		//
		int dividendo;
		dividendo = b*cociente + resto;
		System.out.println("Valor: "+dividendo);
		
		boolean valor;
		valor = resto == 0;
		if(valor){
			System.out.println("Numero es PAR");
		}else{
			System.out.println("El numero no es par, es IMPAR");
		}
		
		
		
		
		
		
	}

}
